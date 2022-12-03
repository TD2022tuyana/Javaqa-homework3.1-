public class Main {
    public static void main(String[] args) {
        float ticketPrice = 40_000.66F;
        int milePrice = 20;
        int milesEarned = (int) ticketPrice / milePrice;
        System.out.println(milesEarned);
    }
}
