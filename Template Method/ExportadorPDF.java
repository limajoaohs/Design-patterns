package strategy;

import java.util.List;

public class ExportadorPDF implements Exportador{
    @Override
    public String exportar(List<String> paragrafos){
        String res = "";
        for(String para : paragrafos){
            res += para + "\n";
        }
        return res;
    }
}
