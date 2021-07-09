import java.util.Scanner;
/*This is relatively better version because it has more methods but still can be improved.
*/
public class Harfnotu_V2 {
        public static double vize;
        public static double finalScore;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            vizeCheck(scanner);
            finalCheck(scanner);
            notGirisi(vize, finalScore);
        }
        private static void vizeCheck(Scanner scanner) {

            boolean isValid = false;
            while (!isValid) {
                System.out.println("Enter your vize Score: ");
                checkType(scanner);
                vize = scanner.nextDouble();
                if (vize <= 100 && 0<=vize) {
                    System.out.println("Valid score\n");
                    isValid = true;
                } else {
                    System.out.println("It should be between 0 and 100\n");
                }
            }
        }
        private static void finalCheck(Scanner scanner){

            boolean isValid1 = false;

            while (!isValid1) {
                System.out.println("Enter your Final Score: ");
                checkType(scanner);
                finalScore = scanner.nextDouble();
                if (finalScore <= 100 && 0<=finalScore) {
                    System.out.println("Valid score\n");
                    isValid1 = true;
                } else {
                    System.out.println("It should be between 0 and 100\n");
                }
            }
            scanner.close();
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
