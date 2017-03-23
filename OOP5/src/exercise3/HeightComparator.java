package exercise3;

import java.util.Comparator;

/**
 * Compares to mountains according there heights.
 * @author CM
 */
public class HeightComparator implements Comparator<Mountain> {

    @Override
    public int compare(Mountain b1, Mountain b2) {
        // hier steht Ihre Implementation
        if(b1 == b2)
            return 0;
        
        if(Integer.compare(b1.getHeight(), b2.getHeight()) != 0)
            return Integer.compare(b1.getHeight(), b2.getHeight());
        
        if(Double.compare(b1.getLongtitude(), b2.getLongtitude()) != 0)
            return Double.compare(b1.getLongtitude(), b2.getLongtitude());
        
        return Double.compare(b1.getLatitude(), b2.getLatitude());
    }
}
