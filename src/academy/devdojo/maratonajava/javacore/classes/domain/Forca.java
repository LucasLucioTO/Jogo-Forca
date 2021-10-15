package academy.devdojo.maratonajava.javacore.classes.domain;

import academy.devdojo.maratonajava.javacore.classes.domain.Palavras;
import java.util.*;

public class Forca {
    Palavras palavras = new Palavras();
    Scanner write = new Scanner(System.in);
    int num;
    String word, words;
    Random gerador = new Random();
    public void forca(){
        System.out.println("Digite \n 1-fácil\n2-médio\n3-difícil" );
        num = write.nextInt();
        if(num == 1) {

            String[] facil = palavras.palavras[0];
            String[] imagem = facil[gerador.nextInt(facil.length)].split("");
            String[] visual = {"_", "_", "_", "_",};
            String letter;
            int i = 0;
            int count = 0;
            for(;;){
                while (i < imagem.length) {
                    System.out.print(visual[i]);
                    i++;
                }
                System.out.println("digite uma letra");
                letter = write.nextLine();
               for(i=0; i<=imagem.length; i++){

               }
            }

        }
    }
}
