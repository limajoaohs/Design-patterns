import java.util.List;

public class GeradorXML extends GeradorArquivo {
    public GeradorXML(PosProcessador posProcessador) {
        super(posProcessador);
    }

    @Override
    protected String gerarConteudo(List<String> paragrafos) {
        String res = "<doc>\n";
        for (String parag : paragrafos) {
            res += "<parag>" + parag + "</parag>\n";
        }
        return res + "</doc>";
    }
}