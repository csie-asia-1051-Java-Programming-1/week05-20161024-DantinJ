package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021034 周宇晟
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n= scn.nextInt();
		int a = n;
		int x = n;
		while (a>0)
		{
			while (x>0)
			{
				System.out.print("*");
				x--;
			}
			System.out.print("\n");
			a--;
			x=n;
		}
	}

}
