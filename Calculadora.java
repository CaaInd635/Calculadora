import java.util.*;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, ans = 0 ;
        String sym;
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese la operacion ( + , - , * , /): ");
        sym = sc.next();
        System.out.print("Ingrese el primer numero: ");
        num2 = sc.nextInt();
        switch(sym){
            case "+" -> System.out.println(add(num1,num2));
            case "-" -> System.out.println(sub(num1,num2));
            case "*" -> System.out.println(mul(num1,num2));
            case "/" -> System.out.println(div(num1,num2));
        }
    }
    public static int add(int num1, int num2){
        int ans = num1 + num2;
        return ans;
    }
    public static int sub(int num1, int num2){
        int ans = num1 - num2;
        return ans;
    }
    public static int mul(int num1, int num2){
        int ans = num1 * num2;
        return ans;
    }
    public static int div(int num1, int num2){
        int ans = num1 / num2;
        return ans;
    }
}
