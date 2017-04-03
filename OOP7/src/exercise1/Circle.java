/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Arrays;

/**
 *
 * @author sandr
 */
public class Circle implements Comparable<Shape>, Shape {

    private final int number;
    private final int d;

    public Circle(int no, int d) {
        this.number = no;
        this.d = d;
    }

    @Override
    public int compareTo(Shape o) {
        if (this == o) {
            return 0;
        }

        return Integer.compare(this.getVolume(), o.getVolume());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.getVolume();
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
        if (obj instanceof Shape) {
            return false;
        }

        return this.getVolume() == ((Shape) obj).getVolume();
    }

    @Override
    public int getVolume() {
        return (int) (4 / 3 * Math.PI * d / 2);
    }

    @Override
    public int getSurface() {
        return (int) (4 * Math.PI * Math.pow(d / 2, 2));
    }

    @Override
    public int getMaxDimension() {
        return d;
    }

    @Override
    public String toString() {
        String value = "CIRCLE " + String.valueOf(number) + "\n";
        value += "Durchmesser: " + d + "\n";
        value += "Volume: " + getVolume() + "\n";
        value += "Surface: " + getSurface() + "\n";
        
        return value;
    }
}
