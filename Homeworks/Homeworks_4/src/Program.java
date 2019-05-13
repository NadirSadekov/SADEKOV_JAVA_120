import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        int userNaumber = scanner.nextInt();
        int numberOfDigit = 0;

        while (userNaumber != -1) {
            while (userNaumber != 0) {
                numberOfDigit = userNaumber % 10;
                for (int i = 1; i < 10; i++) {
                    if (numberOfDigit == i) {
                        array[i] = array[i] + 1;
                    }
                }
                userNaumber = userNaumber / 10;
            }
            userNaumber = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(i + " - " + array[i]);
            }
        }
    }
}