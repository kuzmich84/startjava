package com.startjava.lesson_2_3;
public class Calculator{
 
  private String sign;
  private int a,b;
  private int result=0;
  private int stepen=1;
 
 public Calculator(String sign,int a, int b){
      this.sign=sign;
      this.a=a;
      this.b=b;
 
 switch (sign){
 	case "+":
 		result=a+b;
 		break;

 	case "-":
 		result=a-b;
 		break;
   
    case "*":
 		result=a*b;
 		break;
 	
 	case "^":
 		for(int i=0;i<b;i++){
					stepen=stepen*a;
			}
		result=stepen;	
 		break;

 	case "%":
 		result=a%b;
 		break;
 			
 	default: 
 		System.out.println("¬ведите правильный знак");
 		break;
}
}
public int getResult(){
	return result;
}
}