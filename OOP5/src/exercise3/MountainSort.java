
package exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Check natural and special order of mountains.
 * @author CM
 */
public final class MountainSort {
    
    /**
     * Demo.
     * @param args  not used.
     */
    public static void main(String[] args) {
        final List<Mountain> mountains = new ArrayList<>();
        
        int i = Double.compare(46.101231, 46.97391);
        mountains.add(new Mountain("Weisshorn", 2653, 48, 10)); // Arosa
        mountains.add(new Mountain("Weisshorn", 4505, 46.101231, 7.716046)); // Wallis
        mountains.add(new Mountain("Pilatus", 2128, 46.97391, 8.241198));
        mountains.add(new Mountain("Rigi", 1797, 47.056663, 8.485313));
        mountains.add(new Mountain("Stanserhorn", 1898, 46.929786, 8.340275)); //1898
        mountains.add(new Mountain("Titlis", 3238, 46.772077, 8.437776));
        mountains.add(new Mountain("Bürgenstock", 1128, 47.000318, 8.398342));
        System.out.println("\nEingabereihenfolge: \n " + mountains);

        mountains.sort(null);
        System.out.println("\nAlfabetisch nach Namen\n " + mountains);

        mountains.sort(new HeightComparator());
        System.out.println("\nnach aufsteigender Höhe: \n " + mountains);
        
        mountains.sort(new LocationComparator());
        System.out.println("\nnach GPS-Koordinaten: \n " + mountains);
    }
}
