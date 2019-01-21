package com.startjava.lesson_1.myFirstGame;

public class MyFirstGame{

	public static void main(String[] args ){
		int comp=50;
		int guess=50;
		while(comp==guess){
		if(guess==comp){
			System.out.println("Вы угадали, число "+ guess);
		} else if(guess<comp){
			System.out.println("Введенное вами число меньше загаданного");

		}else {
			System.out.println("Введенное вами число больше загаданного");
		}
	}

	}

}