package com.startjava.lesson_2_3;
import java.util.Scanner;
public class CalculatorTest{
	public static void main(String[] args){
		
		String cont;

		do{
		Scanner scan=new Scanner(System.in);
		
		System.out.print("������� ����: ");
		String znak = scan.nextLine();
		System.out.print("������� ������ �����: ");
		int number1=scan.nextInt();
	
		System.out.print("������� ������ �����: ");
		int number2=scan.nextInt();

		Calculator k=new Calculator(znak,number1,number2);
		System.out.println("�����= "+k.getResult());
		scan.nextLine();
		do{
		System.out.print("������ ����������? [yes/no]: ");
		cont = scan.nextLine();
		if (cont.equals("no")){
			break;
		}
	} while(!cont.equals("yes"));

         
        	

		} while(cont.equals("yes"));

		

		
	
	}


}