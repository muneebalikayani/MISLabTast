import java.util.Scanner;

public class Devision {
	public int devision (){
			
			// TODO Auto-generated method stub
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter First argument value: ");
	
					int a = sc.nextInt();
					System.out.print("Enter Second argument value: ");
	
					int b = sc.nextInt();
					System.out.print("Multiplication is: ");
					int c=a/b;
					System.out.println(a+" / "+b+" = "+c);
	
	
					
					return c;
		}
	public static void main(String[] args) {
		Devision obj=new Devision();
		obj.devision();
	}

}
