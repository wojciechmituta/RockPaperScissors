import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj zdanie");

        Scanner scanner = new Scanner(System.in);

        String result = scanner.nextLine();

        System.out.println(result);

        String[] result1 = result.split(" ");

      //  for (String element : result1) {
      //      System.out.println(element);
     //   }

        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }
    }
}