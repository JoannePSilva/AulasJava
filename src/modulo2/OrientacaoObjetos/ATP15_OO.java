package modulo2.OrientacaoObjetos;

public class ATP15_OO {

    public static void main(String[] args) {
        Pessoa ps = new Pessoa();
        Pessoa ps1 = new Pessoa();

        ps.nome = "Joanne";
        ps.idade = 34;
        ps.sobrenome = "Silva";

        ps1.nome = "Marta";
        ps1.sobrenome = "Ferreira";
        ps1.idade = 25;

        System.out.println("------------------------------");
        System.out.println(ps.nome + " " + ps.sobrenome);
        System.out.println("Idade: " + ps.idade);
        System.out.println("------------------------------");
        System.out.println(ps1.nome + " " + ps1.sobrenome);
        System.out.println("idade: " + ps1.idade);


    }
}
