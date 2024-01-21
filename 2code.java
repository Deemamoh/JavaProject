package finalfile;
import java.util.Scanner;

public class finalfile {
	
	static int fib(int n) {
    if (n<=1)
    	return n;
    return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		System.out.println("input size");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int  i;
		
		for (i=0;i<n;i++)
		{
			System.out.println(fib(i)+ " ");
        }
	}
}
