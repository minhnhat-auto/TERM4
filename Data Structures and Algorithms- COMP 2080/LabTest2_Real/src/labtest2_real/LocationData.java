package labtest2_real;

public class LocationData {

    private String name;
    private String del;
    private int latitude;
    private int longtitudde;
    private int temperature;

    public LocationData(String name, int latitude, int longtitudde, int temperature) {
        this.name = name;
        this.latitude = latitude;
        this.longtitudde = longtitudde;
        this.temperature = temperature;
    }
    
    public LocationData(String del){
        this.del = del;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongtitudde() {
        return longtitudde;
    }

    public void setLongtitudde(int longtitudde) {
        this.longtitudde = longtitudde;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    
}
