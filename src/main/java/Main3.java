import java.util.HashMap;
import java.util.Map;


public class Main3 {

    public static void main(String[] args) {


        Map<String, String> palavras = new HashMap<>();


        palavras.put("Livro", "BooK");
        palavras.put("Cor", "Color");
        palavras.put("Rato", "Mouse");



        String traducao = palavras.get("Cor");

        System.out.println(traducao);


    }
}
