// ax + b = 0;
package hust.soict.dsai;

import java.util.Scanner;

public class LinearEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}
		else {
			double res = -b/a;
			System.out.printf("%.2f\n", res);
		}
	}
}
