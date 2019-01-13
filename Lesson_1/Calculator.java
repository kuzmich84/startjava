public class Calculator{

	public static void main(String [] args){
	  	String sign="%";
	  	int a=12,b=3;
	  	int stepen=1;
	  	int modul2;

	  	if (sign=="+"){
	  		int summa=a+b;
	  		System.out.println("Summa = " +summa);
			}
			 else if(sign=="^"){
				for(int i=1;i<=b;i++){
					stepen=stepen*a;
					

				}
				System.out.println(stepen);
			}
				else if(sign=="%"){
						modul2=a%b;
						System.out.println(modul2);

				} 
	}
} /**/