package modulo1.aula9;

import java.util.Scanner;

public class Aula9_calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        cabecalho();


        System.out.println("Digite o primeiro número");
        double primeiroNumero = scanner.nextDouble();
        System.out.println("Digite o segundo numero");
        double segundoNumero = scanner.nextDouble();


        System.out.println(soma(primeiroNumero, segundoNumero));
        System.out.println(subtracao(primeiroNumero, segundoNumero));
        System.out.println(multiplicacao(primeiroNumero, segundoNumero));
        System.out.println(divisao(primeiroNumero, segundoNumero));

    }

    static void cabecalho(){
        System.out.println("=========== Calculadora Cap ============");
    }


    static double soma(double primeiroNumero, double segundoNumero) {
        double calculo = primeiroNumero + segundoNumero;
        return calculo;
    }

    static double subtracao(double primeiroNumero, double segundoNumero) {
        double calculo = primeiroNumero - segundoNumero;
        return calculo;
    }


    static double multiplicacao(double primeiroNumero, double segundoNumero) {
        double calculo = primeiroNumero * segundoNumero;
        return calculo;
    }

    static double divisao(double primeiroNumero, double segundoNumero) {
        double calculo = primeiroNumero / segundoNumero;
        return calculo;
    }
}
