package br.com.desafio;

import java.util.Scanner;

public class Questao02 {

   /* public static boolean senhaForte(String senha) {
        if (senha.length() < 6) return false;

        boolean achouNumero = false;
        boolean achouMaiuscula = false;
        boolean achouMinuscula = false;
        boolean achouSimbolo = false;
        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                achouNumero = true;
            } else if (c >= 'A' && c <= 'Z') {
                achouMaiuscula = true;
            } else if (c >= 'a' && c <= 'z') {
                achouMinuscula = true;
            } else {
                achouSimbolo = true;
            }
        }
        return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
    }*/

    public static void senhaMinima(String senha){
        int tamanhoSenha = 0;
        if (senha.length() < 6) {
            tamanhoSenha = 6 - senha.length();
            System.out.println(tamanhoSenha);
        }else{
            System.out.println("Senha com o tamanho minimo");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha;

        System.out.println("Digite a senha desejada");

        senha = scan.nextLine();

        senhaMinima(senha);


    }
}
