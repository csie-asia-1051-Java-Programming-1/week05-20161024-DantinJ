package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =  new Scanner(System.in);
		int n = scn.nextInt();
		int k =1;
		int a,b;
		int data[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			a=i;b=0;
			for(int j=0;j<i+1;j++)
			{
				data[a][b]=k;
				a--;b++;
				k++;
			}
		}
		
        for(int i=0;i<n-1;i++)
        {
        	a=n-1;b=i+1;
        	for(int j=n-1;j>i;j--)
        	{
        		data[a][b]=k;
        		a--;b++;
				k++;
        	}
        }
        
        
        
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		System.out.print(data[i][j] + "\t");
        	}
        	System.out.println();
        	
        }
	}

}
