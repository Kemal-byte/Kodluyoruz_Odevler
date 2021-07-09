import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cinema {
        public static int age;
        public static double ticketPrice = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        yasAraligi(scanner);
        moviePreference(scanner);
        saleTicket(scanner);

    }
    public static void yasAraligi(Scanner scanner) {
        boolean Valid = false;

        while (!Valid) {
            System.out.println("How old are you : ");
            checkAge(scanner);
            age = scanner.nextInt();
            if (age <= 150 && 0<=age) {
                Valid = true;
            } else {
                System.out.println("It should be a valid integer\n");
            }
        }
    }
    public static void moviePreference(Scanner scanner){

        String[] movieTypes = new String[]{"Comedy", "Action", "Horror", "Documentary"};
        List<String> nameList = new ArrayList<>(Arrays.asList(movieTypes));
        int a = movieTypes.length;
        String choosingMovie;
        System.out.println("Here are the several types of movie genres\n");
        for (int i = 0; i<a; i++){
            System.out.println(movieTypes[i]);
        }
        boolean valid = false;
        while (!valid) {
            System.out.println("What kind of movie you would like to watch? \n");
            choosingMovie = scanner.next();

            if (choosingMovie.equals("Horror")) {
                System.out.println("For our brave customers we give 10% off\n");
                ticketPrice = ticketPrice - (ticketPrice*0.1);
                valid = true;
            } else if (!nameList.contains(choosingMovie)){
                System.out.println("You should choose something from our menu\n");
                System.out.println("Your options are as follows\n");
                for (int i = 0; i<a; i++){
                    System.out.println(movieTypes[i]);
                }
            } else {
                valid = true;
            }
        }
    }
    public static void checkAge(Scanner scanner) {
        while (!scanner.hasNextInt()) {                   //Tam sayi girilene kadar tekrar tekrar sorucak.
            scanner.next();
            System.out.println("Only integers allowed. Please input and integer: ");
        }
    }
    public static void saleTicket(Scanner scanner) {
        double discount;
        if (age<18) {
            System.out.println("Since you are a young fella why not get 10% off \n");
            discount = 0.1;
            ticketPrice = ticketPrice - (ticketPrice*discount);;
            System.out.println("Your ticket price is : "+ticketPrice);
        } else if(18<= age && age<= 25) {
            System.out.println("Congrats you are getting 5% off the original price for being slightly young\n");
            discount = 0.05;
            ticketPrice = ticketPrice - (ticketPrice*discount);
            System.out.println("Your ticket price is : "+ticketPrice);
        }
    }
}

