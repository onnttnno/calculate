package calculate;

/*
 * responsibility create Display and show all mode in system
 *
 */
public class Display {
	private static Display instance = null;


	protected Display() {
		   // Exists only to defeat instantiation.
		}



	public static void show(){
		System.out.println("Choose Mode");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION");
        System.out.println("5. MEAN");
				//๋Jirawat Phattarawasitpol @ 20:14 PM, 2 FEB 2017//
        System.out.println("6. POWER(First number is a base,Secound number is a power)");
				System.out.println("7. SQUAREROOT");
				//===============================================//
	}


	public static Display getInstance() {
		   if(instance == null) {
		      instance = new Display();
		   }
		   return instance;
		}

}
