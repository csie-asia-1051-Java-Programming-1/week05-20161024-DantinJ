package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021034 周宇晟
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int sum = 1;
		while (a>0)
		{
			sum = a*sum;
			a--;
		}
		System.out.print(sum);
	}

}
