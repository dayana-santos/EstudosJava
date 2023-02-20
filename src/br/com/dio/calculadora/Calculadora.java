package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//      variáveis

        int a, b;

//        Impressão dos valores
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

//        soma das variáveis
        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

//        impressão das variáveis
        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);


    }

//    funções da calculadora (métodos)
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
