import java.util.Scanner;

public class RemoveDuplicatedNums {

	public static void main(String[] args) {
		int a[] = new int[50];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an Array:");
		n = sc.nextInt();
		System.out.println("Enter "+n+" elements into an array:");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		System.out.println("After Removing the duplicate numbers...");
		System.out.println("The new Array is:");
		for(int ar:a) {
			if(ar!=0) {
				System.out.print(ar+" ");
			}
		}
	}

}
