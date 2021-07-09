import java.util.Scanner;
/*In the version 1 I didn't use much methods and put most of the code inside the main method. Later version of this will be more diverse method wise.
*/
public class Harfnotu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean valid = false;
            double vize = 0;
            double finalScore = 0;

            while (!valid) {                                        //0 ila 100 arasindaki bir sayi girilene kadar loop icinde input isteyecektir.
                System.out.println("Enter your vize Score: ");
                checkType(scanner);
                vize = scanner.nextDouble();
                if (0 <= vize && vize <= 100) {
                    System.out.println("Valid score\n");
                    valid = true;
                } else {
                    System.out.println("It should be between 0 and 100");
                    System.out.println("");
                }
            }
            valid = false;

            while (!valid) {
                System.out.println("Enter your final Score: ");
                checkType(scanner);
                finalScore = scanner.nextDouble();
                if (0 <= finalScore && finalScore <= 100) {
                    System.out.println("Valid score\n");
                    valid = true;
                } else {
                    System.out.println("It should be between 0 and 100");
                    System.out.println("");
                }
            }
            scanner.close();
            notGirisi(vize, finalScore);
        }
        private static void checkType(Scanner scanner) {
            while (!scanner.hasNextDouble()) {                   //Tam sayi girilene kadar tekrar tekrar sorucak.
                scanner.next();
                System.out.println("Only integers allowed. Please input and integer: ");
            }
        }
    public static void notGirisi(double vize, double finalScore){
        double toplam = (vize*0.40) + (finalScore*0.60);
        int[] scoreScala = {0, 20, 50, 70, 100};
        System.out.println("Your FINAL grade is "+ toplam + "\n");
        if (scoreScala[0]<toplam && toplam<scoreScala[1]) {
            System.out.println("Final score of less than 20 is FF\n");
        } else if (scoreScala[1]<toplam && toplam<scoreScala[2]) {
            System.out.println("Final score of less than 50 and higher than 20 is CB\n");
        } else if (scoreScala[2]<toplam && toplam<scoreScala[3]) {
            System.out.println("Final score of less than 70 and higher than 50 is BB\n");
        } else if (scoreScala[3]<toplam && toplam<scoreScala[4]) {
            System.out.println("Final score of less than 100 and higher than 70 is CB\n");
        }
    }
}
