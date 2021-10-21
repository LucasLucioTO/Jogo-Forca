package academy.devdojo.maratonajava.javacore.classes.domain;

import academy.devdojo.maratonajava.javacore.classes.domain.Palavras;
import academy.devdojo.maratonajava.javacore.classes.domain.Dicas;
import java.util.*;

public class Forca {
    Palavras palavras = new Palavras();
    Dicas dicas = new Dicas();
    Scanner write = new Scanner(System.in);
    Scanner inteiro = new Scanner(System.in);
    int num;
    Random gerador = new Random();
    int i , n, count, attempt, c;
    String letter = "";
    public void forca(){
        for(;;){
            count = 0;
            attempt = 6;
            c = 0;
            System.out.println("Digite\n1-Fácil\n2-Médio\n3-Difícil\n4-Sair" );
            num = inteiro.nextInt();
            if(num == 1) {


                String[] facil = palavras.palavras[0];
                int iden = gerador.nextInt(facil.length);
                String[] imagem = facil[iden].split("");
                String[] visual = {"_", "_", "_", "_",};
                String[] ajuda = dicas.facil[iden];


                while (attempt != 0) {
                    System.out.println("Você tem "+attempt+" vidas.");
                    for (n = 0; n < ajuda.length; n++) {
                        System.out.println(ajuda[n]);
                    }
                    for (i = 0; i < 4; i++) {
                        System.out.print(visual[i]);
                    }
                    System.out.println("\nDigite uma letra");
                    letter = write.nextLine();
                    for (i = 0; i < 4; i++) {
                        if (letter.equals(imagem[i])) {
                            visual[i] = imagem[i];
                            imagem[i] = "";
                            c++;
                        }
                        else {
                            count++;

                            if (count == 4) {
                                attempt--;
                            }
                        }

                    }
                    count = 0;
                    if (c == 4) {
                        for (i = 0; i < 4; i++) {
                            System.out.print(visual[i]);
                        }
                        System.out.println("");
                        System.out.println("Você venceu");
                        break;
                    }
                }

                if(attempt == 0){
                    System.out.println("Você perdeu");
                }
            }
            else if(num == 2) {

                System.out.println("entrouuu!!!");
                String[] facil = palavras.palavras[1];
                String[] imagem = facil[gerador.nextInt(facil.length)].split("");
                String[] visual = {"_", "_", "_", "_", "_", };



                while (attempt != 0) {
                    System.out.println("Você tem "+attempt+" vidas.");
                    for (i = 0; i < imagem.length; i++) {
                        System.out.print(visual[i]);
                    }
                    System.out.println("\nDigite uma letra");
                    letter = write.nextLine();
                    for (i = 0; i < imagem.length; i++) {
                        System.out.println("entrou for");
                        if (letter.equals(imagem[i])) {

                            visual[i] = imagem[i];

                            c++;
                            if (c == imagem.length) {
                                System.out.println("Você venceu");
                                break;
                            }
                        }
                        else {

                            count++;
                            System.out.println(count);
                            if (count == imagem.length) {

                                attempt--;
                                count = 0;
                            }
                        }


                    }
                }
                System.out.println("Você perdeu");
            }
            else if(num == 3) {

                System.out.println("entrouuu!!!");
                String[] facil = palavras.palavras[2];
                String[] imagem = facil[gerador.nextInt(facil.length)].split("");
                String[] visual = {"_", "_", "_", "_", "_", "_",};

                while (attempt != 0) {
                    System.out.println("Você tem "+attempt+" vidas.");
                    for (i = 0; i < imagem.length; i++) {
                        System.out.print(visual[i]);
                    }
                    System.out.println("\nDigite uma letra");
                    letter = write.nextLine();
                    for (i = 0; i < imagem.length; i++) {

                        if (letter.equals(imagem[i])) {
                            visual[i] = imagem[i];

                            c++;
                            if (c == imagem.length) {
                                System.out.println("Você venceu");
                                break;
                            }
                        }
                        else {
                           count++;
                           System.out.println(count);
                           if (count == imagem.length) {
                               attempt--;
                               count = 0;
                           }
                        }


                    }
                }
                System.out.println("Você perdeu");
            }
            else{
                break;
            }
        }
    }
}
