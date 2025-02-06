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
		System.out.print("In: ");
		question1 = in.nextLine();
		System.out.println(question1);	
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		int int1;
		int int2;
		System.out.print("In: ");
		int1 = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int2 = in.nextInt();
		in.nextLine();
		System.out.println(int1/int2);
		System.out.println(int1%int2);
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		String question1;
		System.out.print("In: ");
		question1 = in.nextLine();
		System.out.println(question1 + " was the text you wrote");	
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		int int3;
		System.out.print("In: ");
		int3 = in.nextInt();
		in.nextLine();
		System.out.println(int3 * 5);
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		boolean boolean1;
		System.out.print("In: ");
		boolean1 = in.nextBoolean();
		in.nextLine();
		System.out.println(boolean1 + " is a boolean");
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		double double1;
		System.out.print("In: ");
		double1 = in.nextDouble();
		in.nextLine();
		System.out.println(double1 - 3.2);
	}

}
