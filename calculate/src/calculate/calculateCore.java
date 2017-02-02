package calculate;

import java.util.Scanner;

public class calculateCore {

	private static double numOne;
	private static double numTwo;
	private static int mode;
	
	private static Handerler handy=null;
	private static calculateCore instance = null;
	
	public calculateCore() {
		handy = new Handerler();
		
	}
	
	public static calculateCore getInstance() {
		   if(instance == null) {
		      instance = new calculateCore();
		   }
		   return instance;
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display show
		if(handy== null){
			handy = new Handerler();
			
		}
		Display display = new Display();
		display.show();
		
		String x="";
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("ENTER YOUR CHOICE: ");
			x = sc.next();
			
		}while( handy.checkMode(x) );
		
		//mode
		mode=Integer.parseInt(x);
		
		
		//num1
		String y="";
		do{
			System.out.println("ENTER Number 1: ");
			y = sc.next();
			
		}while( handy.checkDouble(y) );
		numOne = Double.parseDouble(y);
		
		
		//num2
		String z="";
		do{
			System.out.println("ENTER Number 2: ");
			z = sc.next();
			
		}while( handy.checkDouble(z) );
		numTwo = Double.parseDouble(z);
		
		
		double result = compute(numOne , numTwo,mode);
		
		
		System.out.println("RESULT = "+result);
		
	}

	private static double compute(double numOne, double numTwo, int mode) {
		Scanner scan =new  Scanner(System.in);
		double result = 0;
		switch(mode)
        {
            case 1:
            	SUM sum = new SUM();
            	result = sum.compute(numOne,numTwo);
               
                break;
            case 2:
                result = numOne-numTwo;
                break;
            case 3:
                result = numOne*numTwo;
                break;
            case 4:
                if(numTwo==0)//when denominator becomes zero
                {
                    System.out.println("DIVISION NOT POSSIBLE");
                    break;
                }
                else{
                    result=numOne/numTwo;
                    break;
                }
            case 5:
            	result = numOne+numTwo;
            	String anw = "";
            	int count = 2;
            	do{
            	System.out.println("YOU WILL BE ADD MORE NUMBER ?(PRESS Y/N)");
            	anw = scan.next();
            	
            	if(anw.equals("Y")){
            		String z="";
            		do{
            			System.out.println("ENTER Number : ");
            			z = scan.next();
            			
            		}while( handy.checkDouble(z) );
            		double num = Double.parseDouble(z);
            		count++;
            		result = result +num;
            		
            	}
            	else if(anw.equals("N")){
            		break;
            	}
            	else{
            		System.out.println("YOU HAVE ENTERED A WRONG ");
            		break;
            	}
            	
            	}while(anw.equals("Y"));
            	result= result/count;
            	
            	
            	
            case 6:
            	
            	result = Math.pow(numOne,numTwo);
            	break;
            default:
                System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
      
        }

        
		return result;
	}



}
