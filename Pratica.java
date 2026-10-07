import java.io.*;
public class Pratica {
     public static void main (String[] args) throws IOException {
         int opcao=0;
         BufferedReader B= new BufferedReader (new InputStreamReader(System.in));


         System.out.println("1: Jeep");
         System.out.println("2: Ford");
         System.out.println("3: VW");
         System.out.println("4: Audi");
         System.out.println("Qual e o carro que vais escilher");
         opcao  = Integer.parseInt(B.readLine());

         switch (opcao){
             case 1:
                 System.out.println("Escolheste o Jeep");
                 break;
             case 2:
                 System.out.println("Escolheste o Ford");
                 break;
             case 3:
                 System.out.println("Escolheste o VW");
                 break;
             case 4:
                 System.out.println("Escolheste O Audi");
                 break;
             default:
                 System.out.println("Opcao Invalida");
                 break;
         }

     }
}