public class SwithTest
{
	public static void main(string args[]){
		char varChar = 'N';

		switch(varChar){

			case 'N' : System.out.println("caracter valido");
			break;
			case 'n' : System.out.println("caracter valido");
			break;
			case 'S' : System.out.println("caracter valido");
			break;
			case 's' : System.out.println("caracter valido");
			break;
			default: System.out.println("caracter no valido");
			break;
		}
	}
