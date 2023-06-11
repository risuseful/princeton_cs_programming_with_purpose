public class RandomDouble {
    public static void main(String[] args) {

        // generate 5 random numbers
        double a = Math.random() * 100;
        double b = Math.random() * 100;
        double c = Math.random() * 100;
        double d = Math.random() * 100;
        double e = Math.random() * 100;

        // show generated numbers
        System.out.println("Numbers are: " + a + ", "
                + b + ", "
                + c + ", "
                + d + ", "
                + e + ", ");

        // compute and print average value
        double avg = (a + b + c + d + e) / 5.0;
        System.out.println("Average = " + avg);

        // show min and max
        double temp;
        temp = Math.min(a, b);
        temp = Math.min(c, temp);
        temp = Math.min(d, temp);
        temp = Math.min(e, temp);
        System.out.println("Minimum = " + temp);

        temp = Math.max(a, b);
        temp = Math.max(c, temp);
        temp = Math.max(d, temp);
        temp = Math.max(e, temp);
        System.out.println("Maximum = " + temp);


    }
}
