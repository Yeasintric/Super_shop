public class Shop{
    public static void main(String[] args) {

        System.out.println("--- Order Test ---");

        try {

            Order o1 = new Order("Gaming Mouse", 25.75, 3);
            Order o2 = new Order("Mechanical Keyboard", 120.0, 1);

            System.out.println(o1);
            System.out.println(o2);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Invalid Order Attempt ---");

        try {

            Order o3 = new Order("Monitor", -50, 0);

            System.out.println(o3);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
