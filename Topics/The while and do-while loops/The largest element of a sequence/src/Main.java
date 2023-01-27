import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        while (scanner.hasNextInt()) {
            int elt = scanner.nextInt();
            if (elt > largest)
                largest = elt;
        }
        System.out.println(largest);
    }
}