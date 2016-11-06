package ex;

import java.util.Scanner;

/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021034 周宇晟
 */

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入共幾筆資料");
		int n =scn.nextInt();
		int[]data =new int [n];
		int max =0;
		int s= 0,k=0;
		for(int i =0;i<n;i++)
		{
			data[i]=scn.nextInt();
		}
		for(int a =0;a<n;a++)
		{
			for( int b =0;b<n;b++)
			{
				if(data[b]>max)
				{
					max=data[b];
					s=b;
				}
			}
		k=max;
		data[s]=-1;
		max=0;
		s=0;
		System.out.println(k);
		
		}
	}

}
