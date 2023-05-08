import java.util.*;
public class Calculadora
{
	public static void main(String args[]) {
		int pri,sec,total,eleccion;
		sc Scanner = new Scanner (System.in);
		System.out.print("Ingrese primer numero:");
		pri=sc.nextInt();
		System.out.print("Ingrese segundo numero:");
		sec=sc.nextInt();
		System.out.print("Escriba el numero segun la accion: 1.Sumar");
		eleccion=sc.nextInt();
		switch(eleccion){
			case 1:System.out.print(add(pri,sec));
			       break;
		}
			
	}
	public static int add(int a,int b){
		return a+b;
	}
}
