
import java.util.ArrayList;

public class CompararSorteioComLance {


    private int qEstrelas;
    private int qChaves;


    public void calcularSeusValoresAcertados(ArrayList<Jogada> jogadaArrayList, int[] valorSorteado) {

        for (Jogada jogada : jogadaArrayList) {

            this.qEstrelas = 0;
            this.qChaves = 0;

            System.out.print("USUARIO: ");
            for (int i = 0; i < 7; i++) {

                if (i < 5) {

                    System.out.print("C["+ i +"] = " +jogada.getLance()[i] + " , ");
                }

                if (i >= 5) {

                    System.out.print("E["+ (i == 5 ? 1 : 2) +"] = " + jogada.getLance()[i] + " ");

                }
            }

            System.out.println();
            System.out.print("MAQUINA: ");

            for (int i = 0; i < 7; i++) {

                if (i < 5) {

                    System.out.print("C["+ i +"] = " +valorSorteado[i] + " , ");
                }

                if (i >= 5) {

                    System.out.print("E["+ (i == 5 ? 1 : 2) +"] = " +valorSorteado[i] + " ");

                }
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


            System.out.println();
            System.out.println(this.toString());


        }

    }

    @Override
    public String toString() {
        return
                "qEstrelas = " + qEstrelas +
                ", qChaves = " + qChaves;
    }
}
