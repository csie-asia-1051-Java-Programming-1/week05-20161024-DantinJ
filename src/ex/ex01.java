package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021034 周宇晟
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int sum = 1;
		for (int b=a ; b>0 ; b--)
		{
			sum = b*sum;
		}
		System.out.print(sum);
	}

}
