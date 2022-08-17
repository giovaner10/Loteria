public class CompararSorteioComLance {


    private int qEstrelas;
    private int qChaves;


    public void calcularSeusValoresAcertados(int[] jogada, int[] valorSorteado) {


        for (int i = 0; i < 7; i++) {
            System.out.print(jogada[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.print(valorSorteado[i]  + " ");
        }



        for (int i = 0; i < 7; i++) {

            if (jogada[i] == valorSorteado[i]) {

                if (i < 5) {

                    qChaves++;
                }

                if (i >= 5) {

                    qEstrelas++;

                }
            }
        }

        System.out.println(this.toString());

    }


    @Override
    public String toString() {
        return "CompararSorteioComLance{ " +
                " qEstrelas = " + qEstrelas +
                ", qChaves = " + qChaves +
                '}';
    }
}
