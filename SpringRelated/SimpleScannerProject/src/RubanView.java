import java.util.Scanner;

public class RubanView 
{
	public static void main(String[] args) {
		Scanner scs = new Scanner(System.in);
		System.out.println("Enter your name -->> ");
		String name = scs.next();
		System.out.println("Enter your age -->> ");
		String age = scs.next();
		System.out.println("Hi "+name+ " Your age is "+age);
	}
}
