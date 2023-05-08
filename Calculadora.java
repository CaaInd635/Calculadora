import java.util.*;
public class Calculadora
{
	public static void main(String args[]) {
		int pri,sec,total,eleccion;
		Scanner sc = new Scanner (System.in);
		System.out.print("Ingrese primer numero:");
		pri=sc.nextInt();
		System.out.print("Ingrese segundo numero:");
		sec=sc.nextInt();
		System.out.println("Escriba el numero segun la accion: 1.Sumar 2.Restar 3.Multiplicar 4.Dividir 5.Modulo");
		eleccion=sc.nextInt();
		System.out.print("Resultado: ");
		switch(eleccion){
			case 1:System.out.print(add(pri,sec));
			       break;
			case 2:System.out.print(sub(pri,sec));
			       break;
			case 3:System.out.print(mul(pri,sec));
			       break;
			case 4:System.out.print(div(Double.valueOf(pri),sec));
			       break;
			case 5:System.out.print(mod(pri,sec));
			       break;			
		}
			
	}
	public static int add(int a,int b){
		return a+b;
	}
	public static int sub(int a,int b){
		return a-b;
	}
	public static int mul(int a,int b){
		return a*b;
	}
	public static double div(double a,int b){
		return a/b;
	}
	public static int mod(int a,int b){
		return a%b;
	}
}
