import java.util.Scanner;



public class Operaciones {

    public static int Multiplicar(int x, int y){
        int multi=x*y;
        return multi;
        }

        public static int Dividir(int x, int y){
            int division=x/y;
            return division;
        }


    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1=teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int num2=teclado.nextInt();

       int resultado1=Multiplicar(num1, num2);
       int resultado2=Dividir(num1, num2);

       System.out.println("El resultado de la multiplicación es " + resultado1);
       System.out.println("El resultado de la división es " + resultado2);

    }
    
}
