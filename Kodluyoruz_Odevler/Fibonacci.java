import java.util.Scanner;

public class During {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long should be the fibonacci series");
        int fibo = scanner.nextInt();
        scanner.nextLine();

        int initial = 0;
        int second = 1;
        int third;

        System.out.print(initial+" "+second);
        
        for (int i =2; i<fibo; ++i){
            third =initial+second;
            System.out.print(" "+third);
            initial = second;
            second = third;
        }
        scanner.close();
    }

}
