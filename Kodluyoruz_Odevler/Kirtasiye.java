package Kodluyoruz_Odevler.Kodluyoruz_Odevler;
// Import the HashMap class
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kirtasiye {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // Add keys and values (Country, City)
    List<String> Inventory = new ArrayList<>();
    List<Integer> Piece = new ArrayList<>();

    System.out.println("How many inventory do you wish to enter");
    int numberofInventory = scanner.nextInt();
    scanner.nextLine();
    int i =  0;
    
    while (i<numberofInventory) {
      
      System.out.println("What is the name of inventory?");
      Inventory.add(scanner.nextLine());                              //After nextline you program will wait for the input off the next line.

      System.out.println("How many of them are there?");
      Piece.add(scanner.nextInt());
      scanner.nextLine();                                             //This line is need it after every next... objects otherwise it will skip the next input.
      i++;

    }
    double sumOfInventory = 0;
    for (int j=0; j<Piece.size(); j++) {
      sumOfInventory += Piece.get(j);
    }
    
    System.out.println(Inventory);
    System.out.println(Piece);
    System.out.println("We have total of "+Inventory.size()+ " different inventory");
    System.out.println("Total number of each inventory is ="+sumOfInventory);
    scanner.close();
  }
}
