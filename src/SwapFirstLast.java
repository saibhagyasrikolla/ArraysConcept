import java.util.Scanner;

//To Swap First and Last digits of the User's given number 
public class SwapFirstLast {

	public static void main(String[] args) {
		int a[] = new int[20];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		n = sc.nextInt();
		System.out.println("Enter "+n+" elements in to an array:");
		for(int i =0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Before Swapping: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		int t = a[n-1];
		a[n-1] = a[0];
		a[0] = t;
		System.out.println("AfterSwapping: ");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
	}

}
