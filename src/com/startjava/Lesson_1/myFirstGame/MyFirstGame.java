package com.startjava.lesson_1.myFirstGame;

public class MyFirstGame{

	public static void main(String[] args ){
		int comp=50;
		int guess=50;
		while(comp==guess){
		if(guess==comp){
			System.out.println("�� �������, ����� "+ guess);
		} else if(guess<comp){
			System.out.println("��������� ���� ����� ������ �����������");

		}else {
			System.out.println("��������� ���� ����� ������ �����������");
		}
	}

	}

}