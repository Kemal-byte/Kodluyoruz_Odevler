import java.util.*;
import java.io.*;
import java.text.DecimalFormat;



public class sebzeler{
    public static void main(String []argh)
    {
        String[] sebzeler = {"Armut", "Elma", "Domates", "Muz", "Patlican"};
        double[] KGfiyatlari = {2.14, 3.67, 1.11, 0.95, 5.00};

        int size = sebzeler.length;

        double total = 0.0;
        
        for (int i =0; i<size; i++ ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(sebzeler[i]+" Kac Kilo ? :");
            int a = scanner.nextInt();
            total = total + a*KGfiyatlari[i];
        }
        // The code below is used to truncate the decimal places of total.
        String pattern = "#.##";
        DecimalFormat decimalFormat =  new DecimalFormat(pattern);
        String formattedDouble = decimalFormat.format(total);
        System.out.println("Toplam Tutar : "+formattedDouble+" TL");
        //scanner.close();
    }
}



