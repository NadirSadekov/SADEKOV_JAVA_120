import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int iterations = 0;

        while (Number != -1) {
            int firstCheck = Number % 2;
            if ((iterations % 2) == 0) {
                int digitSum = 0;
                int currentDigit = 0;
                while (Number != 0) {
                    currentDigit = Number % 10;
                    digitSum = digitSum + currentDigit;
                    Number = Number / 10;
                }
                System.out.println("Сумма чисел: " + digitSum);
            } else {
                int currentDigit = 0;
                int productOfNumbers = 1;
                while (Number != 0) {
                    currentDigit = Number % 10;
                    productOfNumbers = productOfNumbers * currentDigit;
                    Number = Number / 10;
                }
                System.out.println("Произведение чисел: " + productOfNumbers);
            }
            iterations++;
            Number = scanner.nextInt();
            int lastCheck = Number % 2;
            while (firstCheck == lastCheck) {
                System.out.println("Please repeat");
                Number = scanner.nextInt();
                lastCheck = Number % 2;
            }
        }
    }
}