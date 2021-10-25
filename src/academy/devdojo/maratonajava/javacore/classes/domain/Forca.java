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
                    for (i = 0; i < imagem.length; i++) {
                        System.out.print(visual[i]);
                    }
                    System.out.println("\nDigite uma letra");
                    letter = write.nextLine();
                    for (i = 0; i < imagem.length; i++) {
                        if (letter.equals(imagem[i])) {
                            visual[i] = imagem[i];
                            imagem[i] = "";
                            c++;
                        }
                        else {
                            count++;

                            if (count == imagem.length) {
                                attempt--;
                            }
                        }

                    }
                    count = 0;
                    if (c == imagem.length) {
                        for (i = 0; i < imagem.length; i++) {
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

                String[] medio = palavras.palavras[1];
                int iden = gerador.nextInt(medio.length);
                String[] imagem = medio[iden].split("");
                String[] visual = {"_", "_", "_", "_", "_",};
                String[] ajuda = dicas.medio[iden];


                while (attempt != 0) {
                    System.out.println("Você tem "+attempt+" vidas.");
                    for (n = 0; n < ajuda.length; n++) {
                        System.out.println(ajuda[n]);
                    }
                    for (i = 0; i < imagem.length; i++) {
                        System.out.print(visual[i]);
                    }
                    System.out.println("\nDigite uma letra");
                    letter = write.nextLine();
                    for (i = 0; i < imagem.length; i++) {
                        if (letter.equals(imagem[i])) {
                            visual[i] = imagem[i];
                            imagem[i] = "";
                            c++;
                        }
                        else {
                            count++;

                            if (count == imagem.length) {
                                attempt--;
                            }
                        }

                    }
                    count = 0;
                    if (c == imagem.length) {
                        for (i = 0; i < imagem.length; i++) {
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
            else if(num == 3) {

                String[] dificil = palavras.palavras[2];
                int iden = gerador.nextInt(dificil.length);
                String[] imagem = dificil[iden].split("");
                String[] visual = {"_", "_", "_", "_", "_", "_",};
                String[] ajuda = dicas.dificil[iden];


                while (attempt != 0) {
                    System.out.println("Você tem "+attempt+" vidas.");
                    for (n = 0; n < ajuda.length; n++) {
                        System.out.println(ajuda[n]);
                    }
                    for (i = 0; i < imagem.length; i++) {
                        System.out.print(visual[i]);
                    }
                    System.out.println("\nDigite uma letra");
                    letter = write.nextLine();
                    for (i = 0; i < imagem.length; i++) {
                        if (letter.equals(imagem[i])) {
                            visual[i] = imagem[i];
                            imagem[i] = "";
                            c++;
                        }
                        else {
                            count++;

                            if (count == imagem.length) {
                                attempt--;
                            }
                        }

                    }
                    count = 0;
                    if (c == imagem.length) {
                        for (i = 0; i < imagem.length; i++) {
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
            else{
                break;
            }
        }
    }
}
