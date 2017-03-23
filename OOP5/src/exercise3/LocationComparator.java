/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import java.util.Comparator;

/**
 *
 * @author sandr
 */
public class LocationComparator implements Comparator<Mountain> {

    @Override
    public int compare(Mountain b1, Mountain b2) {
        if(b1 == b2)
            return 0;
        
        if(Double.compare(b2.getLongtitude(), b1.getLongtitude()) != 0)
            return Double.compare(b2.getLongtitude(), b1.getLongtitude());
        
        return Double.compare(b2.getLatitude(), b1.getLatitude());
    }   
}
