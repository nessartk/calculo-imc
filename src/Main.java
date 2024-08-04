import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua altura em metros: ");
        double altura = Double.parseDouble(sc.nextLine());

        System.out.println("Informe seu peso em Kg: ");
        double peso = Double.parseDouble(sc.nextLine());

        double imc = peso / (altura * altura);


        if (imc < 17) {
            System.out.printf("O valor do seu IMC é %.1f ( Considerado muito abaixo do peso) %n" , imc);
        } else if (17 <= imc && imc <= 18.49) {
            System.out.printf("O valor do seu IMC é %.1f ( Considerado abaixo do peso) %n", imc);
        } else if (18.50 <= imc && imc <= 24.99) {
            System.out.printf("O valor do seu IMC é %.1f ( considerado peso normal) %n", imc);
        } else if (25 <= imc && imc <= 29.99) {
            System.out.printf("O valor do seu IMC é %.1f ( Considerado acima do peso) %n", imc);
        } else if (30 <= imc && imc <= 34.99) {
            System.out.printf("O valor do seu IMC é %.1f ( Considerado Obesidade Grau I) %n", imc);
        } else if (35 <= imc && imc <= 35.99) {
            System.out.printf("O valor do seu IMC é %.1f ( Considerado Obesidade Grau II - Severa) %n", imc);
        } else {
            System.out.printf("O valor do seu IMC é %.1f ( Considerado Obesidade Grau III - Mórbida) %n", imc);
        }


    }
}