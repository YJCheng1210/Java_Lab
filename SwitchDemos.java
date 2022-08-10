import java.util.Scanner;

public class SwitchDemos {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int a = 50, b = 20;
		
		System.out.println("a = " + a + ", b = " + b + ", Input operator: ");
		char oper = scn.next().charAt(0);
		
		switch (oper) {
		case '+':
			System.out.println(a + " + " + b + " = " + (a+b));
			break;
		case '-':
			System.out.println(a + " - " + b + " = " + (a-b));
			break;
		case '*':
			System.out.println(a + " * " + b + " = " + (a*b));
			break;
		case '/':
			System.out.println(a + " / " + b + " = " + (a/b));
			break;
		default:
			System.out.println("Cannot recognize the operator!");
		}
	}
}
