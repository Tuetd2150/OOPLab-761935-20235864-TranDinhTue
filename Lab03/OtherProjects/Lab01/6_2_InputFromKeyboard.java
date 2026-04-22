import java.util.Scanner;
public class 6_2_InputFromKeyboard {
	public static void main(String args[]) {
		Scanner keybroad = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keybroad.nextLine();
		System.out.println("How old are you?");
		int iAge = keybroad.nextInt();
		System.out.println("How tall are you (m)?");
		double dHeight = keybroad.nextDouble();
		System.out.println("Mrs/Mr. " + strName + ", " + iAge + " years old. " + "Your height is " + dHeight + ".");
	}
}