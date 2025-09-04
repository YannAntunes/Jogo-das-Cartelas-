/*  Nome: Yann Antunes Lopes
    RA:20246966 
    Data:03/09/2025
*/

import java.util.Scanner;

class JogoCartelas {
    public static void main(String[] args) {
        System.out.println("Bem-Vindos ao Jogo das Cartelas!");

        int[][] cartelas = {
            {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63},
            {2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31,34,35,38,39,42,43,46,47,50,51,54,55,58,59,62,63},
            {4,5,6,7,12,13,14,15,20,21,22,23,28,29,30,31,36,37,38,39,44,45,46,47,52,53,54,55,60,61,62,63},
            {8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31,40,41,42,43,44,45,46,47,56,57,58,59,60,61,62,63},
            {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63},
            {32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63}
        };

        Scanner sc = new Scanner(System.in);
        boolean[] respostas = new boolean[6];

        for(int i = 0; i < cartelas.length; i++) {
            System.out.println("Cartela: " + (i+1) + ":");

            for(int j = 0; j < cartelas[i].length; j++) {   
                System.out.printf("%2d ", cartelas[i][j]);
                if ((j+1) % 8 == 0) {
                    System.out.println("teste");
                }
            }        
             
            System.out.println();

            System.out.println("Seu numero esta na cartela " + (i+1) + "? (s/n)");
            String resposta = sc.nextLine();
            respostas[i] = resposta.equalsIgnoreCase("s");
            
        }
    
        int numeroJogador = 0;
        int[] valoresBits = {1, 2, 4, 8, 16, 32};

        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i]) {
                numeroJogador += valoresBits[i];
            }
        }
        
        System.out.println("\nO numero que voce pensou e: " + numeroJogador);
        sc.close();
    
    } 
}