import java.util.Random;

public class SimularSoteio {

    //associa a jogada ao jogador

    private int[] jogadaSorteada = new int[7];


    public SimularSoteio() {

        this.realizarSorteio();

        this.ordenarSorteio();

    }



    private void realizarSorteio() {
        for (int i = 0; i < 5; i++) {

            this.jogadaSorteada[i] = new Random().nextInt(50) + 1;
        }

        this.jogadaSorteada[5] = new Random().nextInt(11) + 1;
        this.jogadaSorteada[6] = new Random().nextInt(11) + 1;
    }


    private void ordenarSorteio() {


        for(int i = 0; i < this.jogadaSorteada.length - 2; i++){

            for(int j = 0; j<this.jogadaSorteada.length - 3; j++){

                if(this.jogadaSorteada[j] > this.jogadaSorteada[j + 1]){

                    int bubbleAux = this.jogadaSorteada[j];
                    this.jogadaSorteada[j] = this.jogadaSorteada[j+1];
                    this.jogadaSorteada[j+1] = bubbleAux;
                }

            }
        }


        if(this.jogadaSorteada[5] > this.jogadaSorteada[6]){

            int aux = this.jogadaSorteada[6];
            this.jogadaSorteada[6] = this.jogadaSorteada[5];
            this.jogadaSorteada[5] = aux;

        }

    }

    public int[] getJogadaSorteada() {
        return jogadaSorteada;
    }
}
