package TransactionTargets;

import java.util.Arrays;
import java.util.Scanner;
public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int nod;
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter number of days shop was open: ");
			nod = sc.nextInt();

			int trans[] = new int[nod];
			for (int i = 0; i < trans.length; i++) {
				System.out.print("Please enter income of Day " + (i + 1) + " : ");
				trans[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(trans));

			System.out.println("Please enter number of targets: ");
			int targets = sc.nextInt();

			int sum;
			int flag;

			for (int j = 1; j <= targets; j++) {
				System.out.println("Please enter value for target: " + j);
				int singleTarget = sc.nextInt();
				flag = 0;
				sum = 0;

				for (int k = 0; k < trans.length; k++) {
					sum = sum + trans[k];
					if (sum >= singleTarget) {
						flag = 1;
						System.out.println("Target achieved on day " + (k + 1));
						break;
					}
				}
				if (flag == 0) {
					System.out.println("Target NOT achieved");
				}
			}
			sc.close();
		
	

	}
	

}
