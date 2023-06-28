import java.util.Scanner;

//To find the minimum and maximum numbers in an array. 
public class Min_Max_In_Array {

	public static void main(String[] args) {
		int a[] = new int[25];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert: ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements: ");
		for(int i=0;i<n;i++) {
			a[i] =  sc.nextInt();
		}
		System.out.print("The elements in an array: ");
		for(int j=0;j<n;j++) {
			System.out.print(a[j]+ " ");
		}
		System.out.println();
		int max,min;
		min = max = a[0];
		for(int k=0;k<n;k++) {
			if(a[k]>=max) {
				max = a[k];
			}
			else if(a[k]<=min) {
				min = a[k];
			}
		}
		System.out.println();
		System.out.println("The Minimum and Maximum numbers in the array: "+min+" and "+max);
	}

}
