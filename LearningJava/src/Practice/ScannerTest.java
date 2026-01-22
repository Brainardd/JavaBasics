package Practice; 
import java.util.Scanner;


public class ScannerTest {
	public static void main(String[] args) {
		
		// Setting: 

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.print("Enter your gpa: ");
		double gpa = scanner.nextDouble();
		
		System.out.print("Are you a student? (true/false) ");
		boolean ifStudent = scanner.nextBoolean();
		
		// Printing:
		
		System.out.println("\nHello there " + name + "!");
		System.out.println("You are " + age + " years old!");
		System.out.println("Your GPA is " + gpa + ".");
		
		if (ifStudent){
			System.out.println("You are enrolled!");
		}
		else {
			System.out.println("You are not enrolled!");
		}
		
		scanner.close();
	}
}
