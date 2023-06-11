public class ThreeSort {
    public static void main(String[] args) {

        // take 3 numbers from users
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // show inserted values
        System.out.println("You've entered: " + a + ", " + b + ", " + c);

        // sort it
        int x1;
        int x3;
        int x2;
        int min;
        int max;
        int temp;
        x1 = Math.min(a, b);
        x1 = Math.min(c, x1);
        min = x1;
        System.out.println("Min = " + min);

        x3 = Math.max(a, b);
        x3 = Math.max(c, x3);
        max = x3;
        System.out.println("Max = " + max);

        x1 = Math.min(a, Math.max(b, c));
        x2 = Math.min(b, Math.max(a, c));
        x3 = Math.min(c, Math.max(a, b));
        temp = Math.max(x1, Math.max(x2, x3));
        System.out.println("Mid = " + temp);

        System.out.println("In ascending order: " + min + ", " + temp + ", " + max);


    }
}
