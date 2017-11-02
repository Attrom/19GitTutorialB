import java.lang.Scanner;

public interface NumStore {
	
	//Uses a scanner to take in a number that the user enters into the console
	public void inputNum() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
	}
	
	//Returns the number that is stored
	public double getNum(){
		return num;
	}
	
	//Set method to change the number from a different method
	public void setNum(int newNum);
	
}
