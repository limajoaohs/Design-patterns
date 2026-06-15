import java.util.List;

public class GeradorTXT extends GeradorArquivo {
    public GeradorTXT(PosProcessador posProcessador) {
        super(posProcessador);
    }

    @Override
    protected String gerarConteudo(List<String> paragrafos) {
        String res = "";
        for (String parag : paragrafos) {
            res += parag + "\n";
        }
        return res;
    }
}