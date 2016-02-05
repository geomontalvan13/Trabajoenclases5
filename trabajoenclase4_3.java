	import java.util.Scanner;
public class trabajoenclase4_3
{


	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese letra: ");
		String letra= teclado.nextLine();

		if (letra.equals("s") || letra.equals("n")){
			System.out.print("letra:" +letra);
		}
			
		else{
			System.out.print("letra invalida");

		}
	}
}
