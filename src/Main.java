public class Main {
    public static void main(String[] args) {
        RickshawService r = new RickshawService();

        int[] districts1 = new int[]{1, 2};
        int[] districts2 = new int[]{2, 3};

        r.createDriver("Pete",districts1);
        r.bookDriver();
    }
}