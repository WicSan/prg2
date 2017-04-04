/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Comparator;

/**
 *
 * @author sandr
 */
public class SurfaceComparator implements Comparator<Cube> {
    @Override
    public int compare(Cube o1, Cube o2) {
        return Integer.compare(o1.getSurface(), o2.getSurface());
    }
}
