import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		String question1;
		System.out.print("Input a word: ");
		question1 = in.nextLine();
		System.out.println(question1 + "\n");	
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		int int1;
		int int2;
		System.out.print("Input an integer: ");
		int1 = in.nextInt();
		in.nextLine();
		System.out.print("Input another integer: ");
		int2 = in.nextInt();
		in.nextLine();
		System.out.println("The quotient of your two numbers is: " + (int1/int2));
		System.out.println("The remainder of that quotient is: " + (int1%int2) + "\n");
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		String question1;
		System.out.print("Input a word: ");
		question1 = in.nextLine();
		System.out.println(question1 + " was the text you wrote" + "\n");	
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		int int3;
		System.out.print("Enter an integer: ");
		int3 = in.nextInt();
		in.nextLine();
		System.out.println("The integer you said, multiplied by 5, is: " + (int3 * 5) + "\n");
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		boolean boolean1;
		System.out.print("Enter a boolean: ");
		boolean1 = in.nextBoolean();
		in.nextLine();
		System.out.println(boolean1 + " is a boolean" + "\n");
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		double double1;
		System.out.print("Enter a double: ");
		double1 = in.nextDouble();
		in.nextLine();
		System.out.println("The double you said, subtracted by 3.2, is: " + (double1 - 3.2) + "\n");
	}

}
