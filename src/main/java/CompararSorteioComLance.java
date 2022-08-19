
import java.util.ArrayList;

public class CompararSorteioComLance {


    private int qEstrelas;
    private int qChaves;


    public void calcularSeusValoresAcertados(ArrayList<Jogada> jogadaArrayList, int[] valorSorteado) {

        for (Jogada jogada : jogadaArrayList) {

            this.qEstrelas = 0;
            this.qChaves = 0;


            for (int i = 0; i < 7; i++) {
                System.out.print(jogada.getLance()[i] + " ");
            }

            System.out.println();

            for (int i = 0; i < 7; i++) {
                System.out.print(valorSorteado[i] + " ");
            }


            for (int i = 0; i < 7; i++) {

                if (jogada.getLance()[i] == valorSorteado[i]) {

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

    }

    @Override
    public String toString() {
        return "CompararSorteioComLance{ " +
                " qEstrelas = " + qEstrelas +
                ", qChaves = " + qChaves +
                '}';
    }
}
