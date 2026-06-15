import java.util.List;

public abstract class GeradorArquivo {
    protected PosProcessador posProcessador;

    public GeradorArquivo(PosProcessador posProcessador) {
        this.posProcessador = posProcessador;
    }

    public final String gerarArquivo(List<String> paragrafos) {
        String conteudo = gerarConteudo(paragrafos);
        return posProcessador.posprocessar(conteudo);
    }

    protected abstract String gerarConteudo(List<String> paragrafos);
}