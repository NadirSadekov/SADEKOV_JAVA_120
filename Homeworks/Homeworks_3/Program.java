import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number0 = scanner.nextInt(); 
        
        int digitsSum = 0;

        while (number0 != 0) {
            digitsSum += number0 % 10;
            number0 /= 10;
        }
        System.out.println("Сумма чисел: " + digitsSum);

        int number1 = scanner.nextInt();
        int productOfNumbers = 1;

        if( digitsSum % 2 == 0 ){
            while (number1 % 2 != 0) {
                System.out.println("Please repeat");
                number1 = scanner.nextInt();
            } 
        }

        while(number1 != 0){
            productOfNumbers *= number1 % 10;
            number1 /= 10;
        }
        System.out.println("Произведение чисел: " + productOfNumbers);
    } 
}