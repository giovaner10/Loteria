public class Jogada {

    private int[] lance = new int[7];


    public Jogada(int[] jogada) {
        this.lance = jogada;
        this.ordenarSorteio();
    }



    private void ordenarSorteio() {


        for(int i = 0; i < 5; i++){

            for(int j = 0; j< 4; j++){

                if(this.lance[j] > this.lance[j + 1]){

                    int bubbleAux = this.lance[j];
                    this.lance[j] = this.lance[j+1];
                    this.lance[j+1] = bubbleAux;
                }

            }
        }


        if(this.lance[5] > this.lance[6]){

            int aux = this.lance[6];
            this.lance[6] = this.lance[5];
            this.lance[5] = aux;

        }

    }


    public int[] getLance() {
        return lance;
    }
}
