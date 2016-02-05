public class sueldo
{
	public static void main(traing arg[]){
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese el nombre del alumno" );
		string nombre = teclado.nextline();
		System.out.print("ingrese nombre de cuenta: ");
		int cuneta = teclado.nextInt();
		System.out.print("nota 1" );
		double nota1 = teclado.nextDouble();
		System.out.print("nota 2" );
		double nota2 = teclado.nextDouble();
		System.out.print("nota 3" );
		double nota3 = teclado.nextDouble();
		System.out.print("nota 4" );
		double nota4 = teclado.nextDouble();
		System.out.print("nota 5" );
		double nota5 = teclado.nextDouble();


		double promedio = (nota1+nota2+nota3+nota4+nota5)/5;
		System.out.print("\n\n\n");
		System.out.prinln("nombre del alumno es:" + nombre);
		System.out.prinln("nota1" + nota1);
		System.out.prinln("nota2" + nota2);
		System.out.prinln("nota3" + nota3);
		System.out.prinln("nota4" + nota4);
		System.out.prinln("nota5" + nota5);
		System.out.println("promedio" + promedio);

	}

}