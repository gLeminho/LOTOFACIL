import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
public class Lotofacil {
           
    public static void main(String[] args){
        lotofacil();
       
    }
       private static void lotofacil(){
        Scanner scn = new Scanner(System.in);

        Random random = new Random();
        int opcao = -1;
        

        do{
        System.out.println("*****************");
        System.out.println("Digite 1 se desejar apostar um número de 0 a 100");
        System.out.println("Digite 2 para apostar uma letra de a - z");
        System.out.println("Digite 3 para apostar em um número par ou ímpar");
        System.out.println("Digite 0 para sair");
        System.out.println("*****************");
        opcao = scn.nextInt();
        
        switch (opcao) {
            case 1:
            try{
            int numero;
            int numeroAleatorio;
            System.out.println("Digite um número entre 0 e 100");
            numero = scn.nextInt(); 

           

            if(numero > 100 || numero < 0){
                System.out.println("Aposta inválida");
                break;
            }
            numeroAleatorio = random.nextInt(101); // numero de 0 a 100
            
            if(numero == numeroAleatorio){
                System.out.println("Parabéns você ganhou 1000 reais");
            }else{
                System.out.println("Que pena você errou o numero sorteado foi: "+numeroAleatorio);
            }
            
        }catch(InputMismatchException e){
             System.out.println("O valor passado não foi um numero inteiro");
             scn.next(); // procura o próximo sacnner ou seja volta ao inicio
        }

        break;
            
            case 2:
            try{
            char letra;
            System.out.println("Digite uma letra: ");
            int input = System.in.read();
            letra = (char) input;
            
            if(Character.isLetter(letra)){
                    char letraMaiuscula = Character.toUpperCase(letra);

                    char letraPremiada = 'G';

                    if(letraMaiuscula == letraPremiada){
                    System.out.println("Parabéns você ganhou 500 reais");
                    }else{
                        System.out.println("Que pena a letra sorteada foi: "+letraPremiada);
                    }

                    }else{
                        System.out.println("O valor passado não foi uma letra");
                    }

            }catch(IOException e){
                System.out.println("code 1: Erro");
            }
            break;
            case 3:
            try{
            System.out.println("Digite um numero inteiro");
            int valor = scn.nextInt();

            if(valor % 2 == 0){
            System.out.println("Você ganhou R$ 100,00 reais");
            }else{
                System.out.println("Que pena o número digitado foi ímpar e a premiação foi para os números pares");
            }
        }catch(InputMismatchException e){
            System.out.println("Passe de valor um número inteiro");
            scn.next();
        }
            break;

            case 0:
            System.out.println("Obrigado por jogar");
            scn.close();
        
            default:
            System.out.println("Opção invalida");    
        }

       }while(opcao != 0);
    
    }

}
