import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Jogador player = new Jogador();
        Jogador playerJogadaAleatoria = new Jogador();

        SimularSoteio sorteio = new SimularSoteio();
        SimularSoteio sorteioAleatorio = new SimularSoteio();


        CompararSorteioComLance compararSorteioComLance = new CompararSorteioComLance();


        //while () {
        System.out.println("Informe o que voce quer fazer " +
                "\n1 - aposta" +
                "\n2 - apostas" +
                "\n3 - apostas" +
                "\n4 - apostas" +
                "\n5 - apostas" +
                "\n6 - simular um sorteio" +
                "\n7 - gerar chaves aleatorias para o seu sorteio");


        int opcaoDeAposta = scanner.nextInt();
        
        if(opcaoDeAposta == 7){

            System.out.println("Quantos apostas aleatorias vc vai querer fazer?");
            int numeroDeJogadasAleatorias = scanner.nextInt();



            for (int i = 0; i < numeroDeJogadasAleatorias; i++) {     


                System.out.println("APOSTA: " + (i + 1));

                int[] minhaJogada = new int[7];

                for (int j = 0; j < 7; j++) {  

                    if (j < 5) {
                        
                       
                        minhaJogada[j] =  new Random().nextInt(50) + 1;;

                    }

                    if (j >= 5) {

                       
                        minhaJogada[j] =  new Random().nextInt(11) + 1;;
                    }

                } 
                Jogada jogo = new Jogada(minhaJogada);  
                player.adicionarJogada(jogo); 


            } 


            compararSorteioComLance.calcularSeusValoresAcertados(player.getjogada(), sorteio.getJogadaSorteada());
            
            
            
            
        }

        else if (opcaoDeAposta == 6) {

            Jogada jogadaAleatoria = new Jogada(new SimularSoteio().getJogadaSorteada());

            playerJogadaAleatoria.adicionarJogada(jogadaAleatoria);

            compararSorteioComLance.calcularSeusValoresAcertados(playerJogadaAleatoria.getjogada(), sorteioAleatorio.getJogadaSorteada());


        } else if (opcaoDeAposta != 6 && opcaoDeAposta != 7){


            for (int i = 0; i < opcaoDeAposta; i++) {     /// o for mais externo , o da quantidade de jogadas se inicia aqui


                System.out.println("APOSTA: " + (i + 1));

                int[] minhaJogada = new int[7];

                for (int j = 0; j < 7; j++) {  /// o for mais interno , o que vai receber as chaves e as estrelas comeca aqui, apos seu termino ele volta pro for da quantidade de jogadas

                    if (j < 5) {

                        System.out.println("Informe o valor da " + (j + 1) + " chave");


                        int dezena = scanner.nextInt();

                        while (dezena < 0 || dezena > 50) {
                            System.out.println("INVALIDO: Informe um valor entre 1 a 50  - " + (j + 1) + " CHAVE");
                            dezena = scanner.nextInt();

                        }
                        minhaJogada[j] = dezena;

                    }

                    if (j >= 5) {

                        System.out.println("Informe o valor da estrela");
                        int dezena = scanner.nextInt();

                        while (dezena < 0 || dezena > 11) {
                            System.out.println("INVALIDO: Informe um valor entre 1 a 50  - " + (j + 1) + " ESTRELA");
                            dezena = scanner.nextInt();

                        }
                        minhaJogada[j] = dezena;
                    }

                } // o for que recebe as chaves e as estrelas acaba aqui
                Jogada jogo = new Jogada(minhaJogada);  // nessa linha eu vou guardar a minha jogada, ou seja, as chaves e as estelas, criando um nova instancia de jogada
                player.adicionarJogada(jogo); // aqui eu vou ta adicionando uma nova jogada, que eh justamente a da linha acima, 'jogo'


            } /// o for mais externo , o da quantidade de jogadas acaba aqui


            compararSorteioComLance.calcularSeusValoresAcertados(player.getjogada(), sorteio.getJogadaSorteada()); /// nessa linha calculamos os acertos, ela vai receber o jogador e sua lista de jogadas

            //verificar metodo calcularSeusValoresAcertados da classe CompararSorteioComLance

            // o segunda parametro eh justamente nossa chave sorteada
        }

    }
    // }
}
