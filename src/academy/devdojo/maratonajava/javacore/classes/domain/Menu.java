package academy.devdojo.maratonajava.javacore.classes.domain;

import academy.devdojo.maratonajava.javacore.classes.domain.Forca;
import java.util.*;

public class Menu {
    Forca forca = new Forca();
    Scanner write = new Scanner(System.in);
    int resposta;
    public void menu() {
        for(;;) {
            System.out.println("Deseja jogar? 1-sim 2-não");
            resposta = write.nextInt();
            if(resposta == 1){
                System.out.println("entrou!!!!");
            }
            else{
                break;
            }
        }
    }
}
