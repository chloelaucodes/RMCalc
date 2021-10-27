import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.print("\"(e)ncode\" or \"(n)umber\": ");
//        String str = scan.next();
        int x, y, y1, y2;
//        switch (str) {
//            case "e":
//                System.out.print("\"+\" or \"-\": ");
//                String dir = scan.next();
//
//                switch (dir) {
//                    case "+":
//                        System.out.print("R+");
//                        x = scan.nextInt();
//                        System.out.print("L");
//                        y = scan.nextInt();
//                        System.out.println("Number is: " + (int) Math.pow(2, (2 * x)) * (2 * y + 1));
//                        break;
//                    case "-":
//                        System.out.print("R-");
//                        x = scan.nextInt();
//                        System.out.print("L");
//                        y1 = scan.nextInt();
//                        System.out.print("L");
//                        y2 = scan.nextInt();
//                        System.out.println("Number is: " +
//                                (int) Math.pow(2, (2 * x) + 1) *
//                                        (2 * ((int) Math.pow(2, y1) * (2 * y2 + 1) - 1) + 1));
//                        break;
//                    default:
//                        break;
//                }
//                return;
//            case "n":
                System.out.print("number to be evaluated: ");
                int num = scan.nextInt();
                scan.close();
                System.out.println(numbers(num));
//        }

    }

    private static String numbers(Integer arg) {
        int[] arr = getNumOfTwoFactors(arg);
        int ctr = arr[0];
        int num = arr[1];

        if (ctr % 2 == 0) {
            return "= << " + ctr + " , " + num + " >>\n"
                    + "= << 2 x " + ctr / 2 + " , " + num + " >>";
        } else {
            int[] arrone = getNumOfTwoFactors(num + 1);
            int c = arrone[0];
            int n = arrone[1];

            return "= << " + ctr + " , " + num + " >>\n"
                    + "= << 2 x " + (ctr - 1) / 2 + " + 1 , 2 ^ " + c + " ( 2 x " + n + " + 1 ) -" +
                    " 1" +
                    " >>\n"
                    + "= << 2 x " + (ctr - 1) / 2 + " + 1 , < " + c + " , " + n + " > >>";
        }
    }

    private static int[] getNumOfTwoFactors(int num) {
        int[] arr = new int[2];
        int ctr = 0;

        while ((num / 2) * 2 == num) {
            ctr++;
            num /= 2;
        }

        arr[0] = ctr;
        arr[1] = (num - 1) / 2;
        return arr;
    }

}
