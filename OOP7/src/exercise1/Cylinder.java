/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Objects;

/**
 *
 * @author sandr
 */
public class Cylinder implements Comparable<Cylinder>, Shape {

    private final int number;
    private final int d;
    private final int h;

    public Cylinder(int no, int d, int h) {
        this.number = no;
        this.d = d;
        this.h = h;
    }

    @Override
    public int compareTo(Cylinder o) {
        if (this == o) {
            return 0;
        }

        return Integer.compare(this.getVolume(), o.getVolume());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.getVolume();
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

        return Objects.equals(this.getVolume(), ((Cylinder) obj).getVolume());
    }

    @Override
    public int getVolume() {
        return (int) (Math.pow(d / 2, 2) * Math.PI * h);
    }

    @Override
    public int getSurface() {
        return (int) (2 * Math.PI * d / 2 * (d / 2 + h));
    }

    @Override
    public int getMaxDimension() {
        if (d > h) {
            return d;
        } else {
            return h;
        }
    }

    @Override
    public String toString() {
        String value = "CYLINDER " + String.valueOf(number) + "\n";
        value += "Durchmesser: " + d + "\n";
        value += "Height: " + h + "\n";
        value += "Volume: " + getVolume() + "\n";
        value += "Surface: " + getSurface() + "\n";

        return value;
    }
}
