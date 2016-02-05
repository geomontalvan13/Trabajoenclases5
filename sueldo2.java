import java.util.Scanner;

public class MiClease {

	public static void main(String[] args) {
		 import java.util.Scanner;
		System.out.print("Ingrese el nombre del empleado: ");
		String nombre= teclado.nextLine();
		System.out.print("Ingrese Codigo de Empleado:");
        short cod_citas= teclado.nextShort();
		System.out.print("Sexo 'F','M':")
		char sexo=teclaco.nextChart();
		System.out.print("Ingrese Horas Trabajadas:");
		int horas_trabajadas=teclado.nextInt();
		System.out.print("Ingrese Horas Extras Trabajadas:");
		int horas_trabajadas=teclado.nextInt();
		System.out.print("Ingrese Pago Por Horas");
		double pago_por_horas=teclado.nextDouble();
		double sueldo = pago_por_horas * horas_trabajadas;
		if (horas_trabjadas > 8 ) {
			sueldo = 8 * pago_por_horas;
			int horas_extras = horas_trabajadas - 8;
			double sueldo_extra = horas_extras * (pago_por_horas * 2);
			sueldo = sueldo + sueldo_extra;

		}
		




		System.out.print("\n\n\n");
		System.out.println("Codigo de empleado:" + cod_citas);
		System.out.println("Nombre del Empleado" + nombre);
		System.out.println("Sexo:"+sexo);
		System.out.println("Horas Trabajadas" + horas_trabajadas);
		System.out.println("Pago Por Hora" + pago_por_horas);
		System.out.println("Sueldo diario:" + sueldo_diario);
		System.out.println("Sueldo semanal:"+sueldo_semanal);
		System.out.println("Sueldo mensual:" + sueldo_mensual);
		System.out.println("Sueldo anual:" + sueldo_anual);+
		System.out.println("Sueldo hora:" + sueldo_hora);
		System.out.println("*--------------------------------------=");
		System.out.println("Pago Horas Extras:"+pagoHE);
		System.out.println("Deducciones:"deducciones);
		System.out.println("Sueldo Despues De Deducciones:" + sueldo_despues_deducciones);

	}

}