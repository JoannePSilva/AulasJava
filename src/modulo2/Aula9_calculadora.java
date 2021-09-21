package modulo2;

import java.util.Scanner;

public class Aula9_calculadora {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cabecalho();
        imprime_menu();
        escolha_menu();
    }

    static void cabecalho(){
        System.out.println("======= Cap Calculadora =========\n");
    }
    static void imprime_menu(){
        System.out.println("Menu");
        System.out.println("\t1-Soma");
        System.out.println("\t2-Subtração");
        System.out.println("\t3-Divisão");
        System.out.println("\t4-Multiplicação");
        System.out.println("\t0-Sair");

    }
    static void escolha_menu(){
        double n1=0, n2=0, resultado =0;
      //  int opcao = ler_numero("Digite uma operação matemática:");

        /*if(opcao > 0){
            n1 = ler_numero("Digite o primeiro numero: ");
            n2 = ler_numero("Digite o segundo numero: ");
        }
        switch (opcao){
            case 1:
                resultado = soma(n1, n2);
                break;
            case 2:
                resultado = subtracao(n1, n2);
                break;
            case 3:
                resultado = divisao(n1, n2);
                break;
            case 4:
                resultado = multiplicacao(n1, n2);
                break;
            case 0:
                System.out.println("Até a próxima");
                return;
        }
        System.out.printf("O resultado da operação escolhida é %d :", resultado);*/
    }
    static double ler_numero(String mensagem){
        System.out.print(mensagem);
        double numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    static double soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }
    static double subtracao(double num1, double num2){
        double resultado =  num1 - num2;
        return resultado;
    }
    static double divisao(double num1, double num2){
        double resultado = num1 / num2;
        return  resultado;
    }
    static double multiplicacao(double num1, double num2){
        double resultado = num1 * num2;
        return  resultado;
    }

}


