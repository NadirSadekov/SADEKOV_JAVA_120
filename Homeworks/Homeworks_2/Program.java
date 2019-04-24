import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);


		int sum = scanner.nextInt();
		int n5000 = 0;
		int n1000 = 0;
		int n500 = 0;
		int n100 = 0;
		int n50 = 0;
		int n10 = 0;
		int n5 = 0;
		int n2 = 0;
		int n1 = 0;

		while (sum >= 5000)
		 {
		  sum -= 5000;
          n5000 = n5000 + 1;
         };

        while (sum >= 1000)
         {
          sum -= 1000;
          n1000 = n1000 + 1;
         };
        while (sum >= 500)
         {
          sum -= 500;
          n500 = n500 + 1;
         };
        while (sum >= 100)
         {
          sum -= 100;
          n100 = n100 + 1;
         };
        while (sum >= 50)
         {
          sum -= 50;
          n50 = n50 + 1;
         };
        while (sum >= 10)
         {
          sum -= 10;
          n10 = n10 + 1;
         };
        while (sum >= 5)
         {
          sum -= 5;
          n5 = n5 + 1;
         };	
        while (sum >= 2)
         {
          sum -= 2;
          n2 = n2 + 1;	
         };	
        while (sum >= 1)
         {
          sum -= 1;
          n1 = n1 + 1;
         };

         System.out.println ("5000: " + n5000);
         System.out.println ("1000: " + n1000);
         System.out.println ("500: " + n500);
         System.out.println ("100: " + n100);
         System.out.println ("50: " + n50);
         System.out.println ("10: " + n10);
         System.out.println ("5: " + n5);
         System.out.println ("2: " + n2);
         System.out.println ("1: " + 1);
	}
}