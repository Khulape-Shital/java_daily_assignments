import java.util.Scanner;
class Inputs{

	public static void main(String args[]){

		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter first num");
			int a = sc.nextInt();
		System.out.println("Enter Second num");

			int b = sc.nextInt();

		int sum = a+b;
	
		int sub = a-b;

		System.out.println("Sum : "+ sum);
		System.out.println("Sub : "+ sub);
	}
}