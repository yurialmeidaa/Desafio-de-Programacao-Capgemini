package br.com.desafio;

public class Questao01 {

    public static void printarEscada(int n){
        int k = 2 * n - 2;
        int j;
        int i;



        for ( i = 0; i < n; i++){
            for ( j = 0; j < k; j++){
                System.out.print(" ");
            }
            k = k -2;
            for (j=0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        int n  = 6;



        printarEscada(n);






    }
}
