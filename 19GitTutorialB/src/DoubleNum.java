import java.util.Scanner;

public class DoubleNum implements NumStore {
	private double number;

	public void inputNum() {
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		numDouble(number);
	}

	public int numDouble(double num) {
		num = num * 2;
		return num;
	}
	public static void main(String[] args) {
		inputNum();
	}
}
