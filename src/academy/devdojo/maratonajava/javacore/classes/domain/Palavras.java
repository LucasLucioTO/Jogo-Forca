package academy.devdojo.maratonajava.javacore.classes.domain;

public class Palavras {
    public String[][] palavras = new String[3][];

    public Palavras() {
        palavras[0] = new String[]{"novo", "casa", "faca", "foca", "mesa", "meta", "luiz", "tapa", "moto", "roda" };
        palavras[1] = new String[]{"maria", "casal", "marta", "noivo", "rolha", "motor", "lucas", "canal", "cinco", "vinte" };
        palavras[2] = new String[]{"quatro", "objeto", "banana", "casaco", "macaco", "bonita", "barato", "girafa", "batata", "novato" };
    }

    public String[][] getPalavras() {
        return palavras;
    }

    public void setPalavras(String[][] palavras) {
        this.palavras = palavras;
    }
}
