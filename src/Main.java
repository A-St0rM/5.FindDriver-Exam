public class Main {
    public static void main(String[] args) {
        RickshawService r = new RickshawService();

        int[] districtsCoverage = new int[]{1, 2};
        int[] districtsCoverage2 = new int[]{2, 3};

        r.createDriver("Pete",districtsCoverage);
        r.createDriver("David",districtsCoverage2);

        r.bookDriver();
    }
}