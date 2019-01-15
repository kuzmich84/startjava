package com.startjava.lesson_1;
public class Cycle {
	public static void main(String [] args){
		int m=0;
		int k=6;
		int p=10;
		int sum=0;
		for(int i=0;i<=20;i++){
			System.out.println(m);
			m++;

		}
		while (k>=-6){
			System.out.println(k);
			k-=2;


		}
			do{
				
				
				if(p%2==0){
					sum=sum+p;

				}
		
				p++;

		}while(p<=20);
		

		
		System.out.println("Summa nechetnih chisel= "+sum);

	}


}