import java.util.Random;

public class Okul_puani {
    public static void main(String[] args) {

        Random rand = new Random();
        int puan = rand.nextInt(100);
        System.out.println(puan);

        if (puan<35) {
            System.out.println("FF");
        } else if (35<=puan && puan<55) {
            System.out.println("DC");
        } else if (50<=puan && puan<70) {
            System.out.println("BB");
        } else if (70<=puan && puan<100) {
            System.out.println("AA");
        }
    }
}
