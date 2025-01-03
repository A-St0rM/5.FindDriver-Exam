public class Main {
    public static void main(String[] args) {
        RickshawService r = new RickshawService();

        int[] districtCoverage = new int[]{1, 2};
        int[] districtCoverage2 = new int[]{2, 3};

        r.createDriver("Pete",districtCoverage);
        r.createDriver("David",districtCoverage2);

        r.bookDriver();
    }
}