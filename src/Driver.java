public class Driver {

    public String name;
    public boolean isBooked; //TODO isBooked
    public int[] districtCoverage;

    public Driver(String name, int[] destinationCoverage){
        this.name = name;
        this.districtCoverage = destinationCoverage;
    }

    public String getName() {
        return name;
    }
}
