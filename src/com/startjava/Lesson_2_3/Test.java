package com.startjava.lesson_2_3;
import java.util.Scanner; // ������ �������
 
class Test {
	public static void main(String args[]){
		System.out.print("������� ����� ������� �����: ");
		Scanner scan = new Scanner(System.in);
		double number = scan.nextDouble();
		System.out.println ("�� ����� ����� " + number);
	}
}