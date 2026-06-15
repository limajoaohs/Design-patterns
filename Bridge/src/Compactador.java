public class Compactador implements PosProcessador {
    @Override
    public String posprocessar(String conteudo) {
        return "[Compactado] " + conteudo;
    }
}