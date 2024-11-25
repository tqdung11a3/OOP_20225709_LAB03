package hust.soict.dsai;
import java.util.Scanner;

public class SecondDegreeEquation {
	public static void solve(double a, double b, double c) {
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh co vo so nghiem");
				}
				else {
					System.out.println("Phuong trinh vo nghiem");
				}
			}
			else {
				double res = -c/b;
				System.out.printf("Phuong trinh co nghiem la %.2f\n", res);
			}
		}
		else {
			double delta = b*b - 4*a*c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else if (delta == 0) {
				double res = -b/(2*a);
				System.out.printf("Phuong trinh co nghiem kep %.2f\n", res);
			}
			else {
				double res1 = (-b + Math.sqrt(delta)) / (2*a);
				double res2 = (-b - Math.sqrt(delta)) / (2*a);
				System.out.printf("Phuong trinh co 2 nghiem la %.2f va %.2f\n", res1, res2);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap cac he so cua phuong trinh");
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		solve(a, b, c);
	}
}
