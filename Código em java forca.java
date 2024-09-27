//Gustavo H. Ferrari e Lincoln M. R. de Souza 1°Ano03 
//Jogo da Forca

import java.util.Scanner;
import java.util.Random; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jogo_continua = true;
        int t=0;
        String[ ] palavras ={"java","computador","crocodilo","motor", "gemeos","monitor","torre","Trabalho","prova","caderno","livro","celular","mouse","teclado","gabinete","Horário","Atenção","Máquina","Orelha","Zebra","paralelepípedo","Zinco","Paralela","Arara","espaço" };
        String palavra = palavras[random.nextInt(palavras.length)];   
        char[] letras = palavra.toCharArray();
        char[] acertos = palavra.toCharArray();
        for(int i=0;i<acertos.length;i++){
            acertos[i] = '_';
        }
        
        while(jogo_continua){
            boolean acertou = false;
            boolean acertado = true;
            if(t<2){
System.out.println("+*++++++++++++++\n+*++++++++++++++\n ++++++*       \n +++++         \n +++\n +++\n +++\n +++\n +++\n +++\n###***############ ");
            }
            if(t<4 && t>2){          System.out.println("+*++++++++++++++\n+*++++++++++++++\n ++++++*       |\n +++++         0\n +++\n +++\n +++\n +++\n +++\n +++\n###***############ ");
                }
            if(t<6 && t>4){          System.out.println("+*++++++++++++++\n+*++++++++++++++\n ++++++*       |\n +++++         0\n +++          ´|` \n +++\n +++\n +++\n +++\n +++\n###***############ ");
                }
            if(t<9 && t>6){          System.out.println("+*++++++++++++++\n+*++++++++++++++\n ++++++*       |\n +++++         0\n +++          ´|` \n +++          🦵\n +++\n +++\n +++\n +++\n###***############ ");
                }
            System.out.println("\n");
            System.out.println("Tentativas restantes: " + (9-t));
            for(int i=0;i<acertos.length;i++){
                System.out.print(acertos[i]); 
            }
            System.out.println("\nDigite uma letra");
            char letra_char = scanner.next().charAt(0);
            for(int i = 0; i < letras.length; i++){
                if(letra_char == letras[i]){
                    acertos[i] = letra_char;
                    System.out.println(acertos[i]);
                    acertou=true;
                    }else{
                }
            }
            if(!acertou){
                t++;
            }
            if(t>9){
                System.out.println("Você perdeu");
                System.out.println("Palavra correta: "+ palavra);
                System.out.println("Quer continuar? 0-Não 1-Sim");
                if(scanner.nextInt() == 0){
                    jogo_continua = false;
                }
                
            }
            for(int i = 0; i < letras.length; i++){
                if(acertos[i] == letras[i] && acertado){
                    acertado=true;
                    }else{
                    acertado=false;
                }
            }
            if(acertado){
                System.out.println("Você Ganhou");
                System.out.println("Quer continuar? 0-Não 1-Sim");
                if(scanner.nextInt() == 0){
                    jogo_continua = false;
                }
            }
        }
    }
}

