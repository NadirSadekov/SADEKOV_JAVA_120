import java.util.Scanner;

class Program {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int userNumber = scanner.nextInt();
		int numberOfDigits = 0;

		int array[] = new int[10];

		    if (userNumber != -1) {
		    	while (userNumber > 0) {
		    		numberOfDigits = userNumber % 10;
		    		userNumber /= 10;
		    		for (int i = 1; i < 10; i++) {
		    			if (numberOfDigits == i) {
		    				array[i] = array[i] + 1;
		    		}
		    	}
		    	}
		    userNumber = scanner.nextInt();
		    }
		        for (int i = 1; i < 10; i++) {
		        	if (array[i] != 0) {
		        		System.out.println(i + " - " + array[i]);
		        }
		    }
	}
}