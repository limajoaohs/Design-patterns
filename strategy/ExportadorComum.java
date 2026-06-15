package strategy;

import java.util.List;

public abstract class ExportadorComum implements Exportador{
    @Override
    public String exportar(List<String> paragrafos){
        StringBuilder res = new StringBuilder();
        res.append(abrirDocumento());
        for (String parag : paragrafos){
            res.append(formatarParagrafo(parag));
        }
        res.append(fecharDocumento());

        return res.toString();
    }
    protected abstract String abrirDocumento();
    protected abstract String formatarParagrafo(String paragrafo);
    protected abstract String fecharDocumento();
}
