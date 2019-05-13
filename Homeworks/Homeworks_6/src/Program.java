import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        System.out.print("Input array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int a[] = new int[arraySize];
        int max = a[0];
        int maxIndex = 0;
        int min = a[0];
        int minIndex = 0;
        int temp;

        for (int i=0; i < arraySize; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < arraySize; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        temp = a[maxIndex];
        a[maxIndex] = a[minIndex];
        a[minIndex] = temp;

        for (int i=0; i < arraySize; i++) {
            System.out.print(a[i] + " ");
        }
    }
}