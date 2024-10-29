import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập 3 cạnh của tam giác:");

		try {
			System.out.print("Cạnh thứ nhất: ");
			double side1 = scanner.nextDouble();

			System.out.print("Cạnh thứ hai: ");
			double side2 = scanner.nextDouble();

			System.out.print("Cạnh thứ ba: ");
			double side3 = scanner.nextDouble();

			Triangle triangle = new Triangle(side1, side2, side3);
			System.out.println(triangle);

		} catch (IllegalTriangleException e) {
			System.out.println("Lỗi: " + e.getMessage());

		} catch (Exception e) {
			System.out.println("Lỗi nhập liệu: dữ liệu nhập vào không phải là số.");
		}
	}
}
