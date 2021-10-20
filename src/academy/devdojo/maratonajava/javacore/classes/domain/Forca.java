package academy.devdojo.maratonajava.javacore.classes.domain;

import academy.devdojo.maratonajava.javacore.classes.domain.Palavras;
import java.util.*;

public class Forca {
    Palavras palavras = new Palavras();
    Scanner write = new Scanner(System.in);
    int num;
    Random gerador = new Random();
    int i = 0;
    int count = 0;
    int attempt = 6;
    int c = 0;
    String letter = "";
    public void forca(){
        for(;;){
            System.out.println("Digite\n1-Fácil\n2-Médio\n3-Difícil\n4-Sair" );
            num = write.nextInt();
            if(num == 1) {


                String[] facil = palavras.palavras[0];
                String[] imagem = facil[gerador.nextInt(facil.length)].split("");
                String[] visual = {"_", "_", "_", "_",};


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
                            System.out.println("entrou if");
                            visual[i] = imagem[i];
                            System.out.println(visual[i]);
                            c++;
                            if (c == imagem.length) {
                                System.out.println("Você venceu");
                                break;
                            }
                        }
                        else {
                            System.out.println("entrou else");
                            count++;
                            System.out.println(count);
                            if (count == imagem.length) {
                                System.out.println("faz o favor");
                                attempt--;
                                count = 0;
                            }
                        }
                        System.out.println(visual[i]);

                    }
                }
                System.out.println("Você perdeu");
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
