package br.com.moikawa;

import java.util.Scanner;

public class ControleDeFluxo {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o  valor da primeira nota: ");
        int nota1 = s.nextInt();
        System.out.println("Digite o  valor da segunda nota: ");
        int nota2 = s.nextInt();
        System.out.println("Digite o  valor da terceira nota: ");
        int nota3 = s.nextInt();
        System.out.println("Digite o  valor da quarta nota: ");
        int nota4 = s.nextInt();

        int nota = ((nota1 + nota2 + nota3 + nota4) / 4);
        String notaST = getnota((nota1 + nota2 + nota3 + nota4) / 4);
        System.out.println(notaST);
    }

    public static String getnota(int nota) {
        if (nota >= 7) {
            return "Aprovado";
        } else if (nota >= 5) {
            return "Recuperacao";
        } else {
            return "Reprovado";
        }
    }
}
