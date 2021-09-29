package modulo2;

import java.util.Scanner;

public class Aula11_Revisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        cabecalho();

        char continuar;
        short opcao;
        do {


            do {

                System.out.println("Escolha uma das opções: \n1.Crédito Pessoal  \n2.Crédito Imobiliário  \n3.Crédito Empresarial \n4.Empréstimo Consignado  \n5.Sair\n ");
                opcao = scanner.nextShort();
                scanner.nextLine();


                switch (opcao) {
                    case 1:
                        System.out.println("Crédito Pessoal");
                        break;
                    case 2:
                        System.out.println("Crédito Imobiliário");
                        break;

                    case 3:
                        System.out.println("Crédito Empresarial");
                        break;

                    case 4:
                        System.out.println("Empréstimo Consignado");
                        break;

                    case 5:
                        System.out.println("=============Obrigado!==============");
                        break;
                    default:
                        System.out.println("Número inválido \n Digite novamente");
                        break;

                }
            } while (opcao < 1 || opcao > 5);


            do {
                System.out.println("+++++++++++Deseja continuar?+++++++++++++");
                System.out.println("\n Digite V para voltar ao menu e S para sair");
                continuar = scanner.nextLine().toUpperCase().charAt(0);

                if (continuar != 'V' && continuar != 'S') {
                    System.out.println("Carácter inválido");

                }
            } while (continuar != 'V' && continuar != 'S');
        }while (continuar == 'V');
        }

    static void cabecalho(){
        System.out.println("=========== Bradesco Financiamentos ============");

    }
}