// a11x1 + a12x2 = b1
// a21x1 + a22x2 = b2
package hust.soict.dsai;

import java.util.Scanner;

public class LinearSystem {
	public static void solve (double a11, double a12, double b1, double a21, double a22, double b2) {
		double D = a11 * a22 - a21 * a12;
		double D1 = b1 * a22 - b2 * a12;
		double D2 = a11 * b2 - a21 * b1;
		
		if (D != 0) {
			double x = D1 / D;
			double y = D2 / D;
			System.out.printf("2 nghiem la %.2f va %.2f\n", x, y);
		}
		else {
			if (D1 == 0 && D2 == 0) {
				System.out.println("He phuong trinh co vo so nghiem");
			}
			else {
				System.out.println("He phuong trinh vo nghiem");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cac he so cua phuong trinh 1 la: ");
		double a11 = sc.nextDouble(), a12 = sc.nextDouble(), b1 = sc.nextDouble();
		System.out.println("Cac he so cua phuong trinh 2 la: ");
		double a21 = sc.nextDouble(), a22 = sc.nextDouble(), b2 = sc.nextDouble();
		solve(a11, a12, b1, a21, a22, b2);
	}
}
