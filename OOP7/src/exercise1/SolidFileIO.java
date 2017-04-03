package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Read solid data from file.
 */
public final class SolidFileIO {

    /**
     * Read solid data from file.
     *
     * @param fileName Filename.
     * @return Array of Cubes.
     */
    public static Shape[] readSolids(final String fileName) {
        LinkedList<Shape> list = new LinkedList<>();
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            // your turn!
            int number = 1;
            String line;  

            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("[: ]"); // Extract first letter
                switch (tokens[0]) { // is it a Cube? (or Sphere, Cylinder -> Aufgabe 5?)
                    case "C":
                        int s1 = Integer.parseInt(tokens[2]);
                        int s2 = Integer.parseInt(tokens[3]);
                        int s3 = Integer.parseInt(tokens[4]);
                        list.add(new Cube(number, s1, s2, s3));
                        break;
                    case "Y":
                        int d = Integer.parseInt(tokens[2]);
                        int h = Integer.parseInt(tokens[3]);
                        list.add(new Cylinder(number, d, h));
                        break;
                    case "S":
                        int d1 = Integer.parseInt(tokens[2]);
                        list.add(new Circle(number, d1));
                        break;
                    default:
                        break;
                }
                number++;
            }
        } catch (IOException ex) {
            Logger.getLogger(SolidFileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list.toArray(new Shape[0]);
    }

    /**
     * Privater Konstruktor.
     */
    private SolidFileIO() {
    }
}
