package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 1;
		int x = 0;
		while (sum<=10000)
		{
			sum = sum*n;
			x++;
		}
		System.out.println(sum);
		System.out.println(x);
	}

}
