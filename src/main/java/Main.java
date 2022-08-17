public class Main {

    public static void main(String[] args) {


        int[] minhasJogadas = {40, 2, 4, 6, 86, 5, 8};

        Jogada jogo = new Jogada(minhasJogadas);


        Jogador player = new Jogador();

        player.adicionarJogada(jogo);

        SimularSoteio novoSorteio = new SimularSoteio();


        CompararSorteioComLance comLance = new CompararSorteioComLance();

        comLance.calcularSeusValoresAcertados(player.getjogada(), novoSorteio.getJogadaSorteada());







    }
}
