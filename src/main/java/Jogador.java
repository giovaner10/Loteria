import java.util.ArrayList;

public class Jogador {




    private Jogada jogada;


    public Jogador() {
    }


    public void adicionarJogada(Jogada jogada){

        this.jogada = jogada;

    }

    public int[] getjogada() {
        return jogada.getLance();
    }
}
