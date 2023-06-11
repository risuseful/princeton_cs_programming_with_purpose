public class GreatCircle {
    public static void main(String[] args) {

        // take 4 numbers from users; the two points
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double r = 6371; // mean radius of Earth (in km)

        // compute Haversine's distance
        double dist = Math.pow(Math.sin(Math.toRadians((x2 - x1) / 2)), 2);
        dist = dist + Math.cos(Math.toRadians(x1))
                * Math.cos(Math.toRadians(x2))
                * Math.pow(Math.sin(Math.toRadians((y2 - y1) / 2)), 2);
        dist = Math.sqrt(dist);
        dist = 2 * r * Math.asin(dist);

        // print distance
        System.out.println(dist + " kilometers");

    }
}
