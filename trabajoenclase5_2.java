import java.util.Scanner;

public class trabajoenclase5_2
{
		public static void main(String args[]){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese el valor");
			int valor = teclado.nextInt();
			if (valor<1){
				System.out.println("valor ingresado incorrecto");
				trabajoenclase5_2.main(null);
			}
			else{
				int i=1;
         while(i<=valor) {
                   System.out.println(i);
                   i++;
               }
         }
    }
}

