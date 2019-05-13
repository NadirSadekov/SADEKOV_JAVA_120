import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int a[] = new int[arraySize];
        int localMax = 0;
        int localMin = 0;

        for (int i = 0; i < arraySize; i++)
            a[i] = scanner.nextInt();

        for (int i = 1; i < arraySize-1; i++)
            if (a[i-1] > a[i] && a[i]< a[i+1])
                localMin++;
            else if (a[i-1] < a[i] && a[i] > a[i+1])
                localMax++;
        System.out.println("LOCAL MAX COUNT = " + localMax);
        System.out.println("LOCAL MIN COUNT = " + localMin);
    }
}