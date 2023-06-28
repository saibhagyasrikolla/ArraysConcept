import java.util.Scanner;

//To find even, odd and prime numbers in an array
public class Even_Odd_Prime_In_Array {

	public static void main(String[] args) {
		int a[] = new int[25];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of elements to insert: ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("The elements in an Array: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.println("The even numbers in an array: ");
		for(int j=0;j<n;j++) {
			if(a[j]%2 == 0) {
				System.out.print(a[j]+" ");
			}
		}
		System.out.println();
		System.out.println("The odd numbers in an array: ");
		for(int j=0;j<n;j++) {
			if(a[j]%2 != 0) {
				System.out.print(a[j]+" ");
			}
		}
		System.out.println();
		System.out.println("The prime numbers in an array: ");
		for(int j=0;j<n;j++) {
			boolean isPrime = true;
			if(a[j]==0 || a[j]==1) {
				isPrime = false;
			}
			else {
				for(int k=2;k<a[j];k++) {
					if(a[j]%k == 0) {
						isPrime = false;
						break;
					}
				}
			}	
			if(isPrime) {
				System.out.print(a[j]+" ");
			}
		}
	}

}
