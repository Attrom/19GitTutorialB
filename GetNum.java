import java.util.Scanner;

public class GetNum implements NumStore{
	private double number;

	public void inputNum(){
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
	}
	
	public double getNum(){
		return number;
	}
	
	public void setNum (int newNum){
		number=newNum;
	}
	
}
