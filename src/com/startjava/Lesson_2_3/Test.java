package com.startjava.lesson_2_3;
import java.util.Scanner; // импорт сканера
 
class Test {
	public static void main(String args[]){
		System.out.print("Введите любое дробное число: ");
		Scanner scan = new Scanner(System.in);
		double number = scan.nextDouble();
		System.out.println ("Вы ввели число " + number);
	}
}