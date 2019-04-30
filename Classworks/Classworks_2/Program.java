class Program {
	public static void main(String[] args) {

		int a[] = {-1, 5, -3, 20, 11, 0, 2, 6};
		int range = 8;

		for (int i = 0; i < range; i++) {
			int min = a[i];
			int minIndex = i;
			
			for (int j = i; j < range; j++) {
				if (a[j] < min) {
					min = a[j];
					minIndex = j;
				}
			}

			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;

			for (int k = 0; k < range; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
	}
}

