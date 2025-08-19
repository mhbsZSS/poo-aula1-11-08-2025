package app;

import app.Aluno;
import app.Cliente;

public class PrimeiraClasse { //É obrigatório esse primeiro item na programação
    public static void main(String[] args){ //Esse método principal só teremos um na programação
        Aluno a1 = new Aluno(); //new serve para alocar um novo recurso para o objeto e nesse caso será chamado o objeto Aluno
        a1.nome = "Marcio Hernani";
        a1.idade = 35;

        Aluno a2 = a1;
        a2.nome = "José";

        Aluno a3 = new Aluno("Hernani",35); //new serve para alocar um novo recurso para o objeto e nesse caso será chamado o objeto Aluno
        

        System.out.println("[A1]");
        System.out.println("nome = " + a1.nome); //Aspas duplas devem ser usadas sempre para caractere
        System.out.println("idade = " + a1.idade);
        System.out.println();

        System.out.println("[A2]");
        System.out.println("nome = " + a2.nome); //Aspas duplas devem ser usadas sempre para caractere
        System.out.println("idade = " + a2.idade);
        System.out.println();

        System.out.println("[CHAMADA DE MÉTODO ]");
        System.out.println("A1 = " + a1.getDados());
        System.out.println("A2 = " + a2.getDados());
        System.out.println();

        System.out.println("[A3]");
        System.out.println("A3 = " + a3.getDados()); 

        Cliente c1 = new Cliente();
        c1.setNome("teste");
        c1.setSaldo(450);
        System.out.println("[Chamada de GET]");
        System.out.println(c1.getNome());
        System.out.println(c1.getSaldo());
    }
    
}