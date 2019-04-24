import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int current = scanner.nextInt(); 
        
        int digitsSum = 0;
        int productOfNumbers = 1;

    	while (current > 0) {
            digitsSum = digitsSum + current % 10;
            current = current / 10;
        }
         System.out.println("Сумма чисел: " + digitsSum);

         current = scanner.nextInt();

         while (current > 0) {
         		productOfNumbers = productOfNumbers * (current % 10);
                digitsSum = digitsSum + current % 10;
                current = current / 10;
        }
        System.out.println("Произведение чисел: " + productOfNumbers);
    } 
}