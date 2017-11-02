public class NumTest {

	public static void main(String[] args) {
		
		NumStore n = new GetNum();
		n.inputNum();
		
		System.out.println("You have added: " + n.getNum());
		
		n.setNum(14);
		System.out.println("I have passed: " + n.getNum());
		
	}
	
}