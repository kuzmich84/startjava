public class Calculator{

	public static void main(String [] args){
	  	String sign="^";
	  	int a=12,b=0;
	  	
	  	int modul2;

	  	if (sign=="+"){
	  		int summa=a+b;
	  		System.out.println("Summa = " +summa);
			} else if(sign=="^"){
				int stepen=1;
				for(int i=0;i<b;i++){
					
					stepen=stepen*a;
					}
				System.out.println(stepen);
			}else if(sign=="%"){
						modul2=a%b;
						System.out.println(modul2);

				} 
	}
} /**/