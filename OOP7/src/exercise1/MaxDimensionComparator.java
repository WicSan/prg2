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
public class MaxDimensionComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return Integer.compare(o1.getMaxDimension(), o2.getMaxDimension());
    }  
}
