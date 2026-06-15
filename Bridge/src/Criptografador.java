public class Criptografador implements PosProcessador {
    @Override
    public String posprocessar(String conteudo) {
        return "[Criptografado] " + conteudo;
    }
}