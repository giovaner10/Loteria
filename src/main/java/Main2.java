import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {

        int[] novoSorteioFinal = new SimularSoteio().getJogadaSorteada();  //criamos o valor sorteado

        int contador = 0;

        while (true){  //enquanto n acertamos o valor, esse while vai continuar

            int[] jogadaSorteada = new SimularSoteio().getJogadaSorteada();  //vai gerar nosso novo sorteio a a cada novo ciclo do while

       /*     if(contador > 30){
                    jogadaSorteada = novoSorteioFinal;
            }*/



            if(Arrays.equals(novoSorteioFinal, jogadaSorteada)){ // vai comparar o sorteio final com o sorteio da rodada
                break;  // enquanto os valores forem diferentes nao vai parar
            }


            System.out.print("sorteio final:    ");
            for (int i = 0; i < 7; i++) {

                System.out.print(novoSorteioFinal[i] + " ");

            }

            System.out.println(" ");
            System.out.print("Sorteio de agora:     ");
            for (int i = 0; i < 7; i++) {

                System.out.print(jogadaSorteada[i] + " ");

            }

            System.out.println(" ");

            contador++;  // vai incremetar a cada nova jogada

            System.out.println("Foram jogadas " +  contador + " vezes");

            Thread.sleep(0);
            System.out.println();
            System.out.println();



        }


        System.out.println("VC PRECISOU DE " + contador + " para acertar o jogo");
    }
}
