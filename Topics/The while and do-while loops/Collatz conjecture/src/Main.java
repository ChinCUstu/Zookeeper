import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elem = scanner.nextInt();
        System.out.print(elem + " ");
        while (elem != 1) {
            if (elem % 2 == 0) {
                elem /= 2;
            } else {
                elem = (elem * 3) + 1;
            }
            System.out.print(elem + " ");
        }
    }
}