	import java.util.Scanner;
public class trabajoenclases4_4
{


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese letra: ");
		String letra= teclado.nextLine();

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
			System.out.print("vocal");
		}
			
		else{
			System.out.print("no es vocal");

		}
	}
}