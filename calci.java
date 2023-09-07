package TechSaksham;
import java.util.*;
public class calci {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter operator:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		String op=sc.next();
		switch(op)
		{
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "%":
			System.out.println(a%b);
			break;
		case "0":
			System.exit(0);
			
		}
	}
	}



