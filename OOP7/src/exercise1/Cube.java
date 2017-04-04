package exercise1;

import java.util.Arrays;
import java.util.Objects;

/**
 * A simple Cube with three side lengths.
 */
public class Cube implements Comparable<Cube>, Shape {

    private final int number;
    private final int a, b, c;

    /**
     * Constructor for objects of class Cube.
     *
     * @param no Nummer.
     * @param a Seite a.
     * @param b Seite b.
     * @param c Seite c.
     */
    public Cube(final int no, final int a, final int b, final int c) {
        number = no;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // your turn!
    public int getVolume() {
        return a * b * c;
    }

    public int getSurface() {
        return 2 * ((a * b) + (a * c) + (b * c));
    }

    public int getMaxDimension() {
        if(a > b && a > c)
            return a;
        else if(b > c)
            return b;
        else
            return c;
    }

    @Override
    public String toString(){
        String value = "CUBE " + String.valueOf(number) + "\n";
        int[] ints = new int[]{a, b, c};
        
        Arrays.sort(ints);
        
        value += "Sides: ";
        for(int i : ints){
            value += i + " ";
        }
        value = value.trim() + "\n";
        
        value += "Volume: " + getVolume() + "\n";
        value += "Surface: " + getSurface() + "\n";
        
        return value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.getVolume();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        return Objects.equals(this.getVolume(), ((Cube)obj).getVolume());
    }

    @Override
    public int compareTo(Cube o) {
        if(this == o)
            return 0;
        
        return Integer.compare(this.getVolume(),o.getVolume());
    }
}
