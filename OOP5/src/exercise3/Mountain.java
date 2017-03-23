package exercise3;

import java.util.Objects;

/**
 * 
 * @author 
 */
public final class Mountain implements Comparable<Mountain> {

    private final String name;
    private final int height;
    private final double lon;
    private final double lat;

    public Mountain(String name, int height, double longtitude, double latitude) {
        this.name = name;
        this.height = height;   
        this.lon = longtitude;
        this.lat = latitude;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
    
    public double getLongtitude(){
        return lon;
    }
    
    public double getLatitude(){
        return lat;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }

    @Override
    public int compareTo(Mountain other) {
        // hier steht Ihre Implementation
        if(this == other || this.equals(other))
            return 0;
        
        int cname = this.getName().compareTo(other.name);
        
        if(cname != 0){
            return cname;
        }
        
        return Integer.compare(this.getHeight(), other.getHeight());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        
        if(obj == null)
            return false;
        
        if(!(obj instanceof Mountain))
            return false;
        
        return Objects.equals(((Mountain)obj).name, this.name) && Objects.equals(((Mountain)obj).height, this.height);
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.height;
        hash = (int) (17 * hash + ((this.lat == 0.0) ? 0 : Double.doubleToLongBits(this.lat)));
        hash = (int) (17 * hash + ((this.lon == 0.0) ? 0 : Double.doubleToLongBits(this.lon)));
        return hash;
    }
}
