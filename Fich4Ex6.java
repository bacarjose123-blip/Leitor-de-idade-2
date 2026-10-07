import java.io.*;
public class Fich4Ex6 {
    public static void main(String [] args) throws IOException{

        int num5a100;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite alguns numero no intervalo de 5 a 100");
        num5a100 = Integer.parseInt(x.readLine());

        int somamut6e7 = 0;
        for(int i = 5;i <= 100;i++ ) {

            if (i % 6 == 0 && i % 7 == 0) {
                somamut6e7++;
            }
        }
        System.out.print("a sima dos numeros multiplos de 6 e 7 e:"+somamut6e7++);
            }
        }






