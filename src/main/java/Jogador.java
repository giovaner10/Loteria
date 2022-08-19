import java.util.ArrayList;

public class Jogador {

    private ArrayList<Jogada> jogada  = new ArrayList<>();

    public Jogador() {
    }

    public void adicionarJogada(Jogada jogada){
        this.jogada.add(jogada);
    }

    public ArrayList<Jogada> getjogada() {
        return this.jogada;
    }
}
