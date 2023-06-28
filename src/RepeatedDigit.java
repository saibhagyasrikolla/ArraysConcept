import java.util.Scanner;

//To find the digit that repeated more number of times in the user’s given number.
public class RepeatedDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int digitCount[] = new int[10];
		while(n!=0) {
			int digit = n%10;
			digitCount[digit]++;
			n = n/10;
		}
		//int maxDigitCount = 0;
		int maxRepeateddigit = digitCount[0];
		for(int i=0;i<digitCount.length;i++) {
			if(digitCount[i]>maxRepeateddigit) {
				//maxDigitCount = digitCount[i];
				maxRepeateddigit = i;
			}
		}
		System.out.println("The digit that repeated most: "+maxRepeateddigit);
		//System.out.println("The no.of times the digit repeated: "+maxDigitCount);
	}
}
