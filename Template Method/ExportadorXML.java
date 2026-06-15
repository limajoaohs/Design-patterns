package strategy;

import java.util.List;

public class ExportadorXML extends ExportadorComum {

	@Override
	protected String abrirDocumento() {
		return "<doc>\n";
	}

	@Override
	protected String formatarParagrafo(String paragrafo) {
		return "<parag>" + paragrafo + "</parag>\n";
	}

	@Override
	protected String fecharDocumento() {
		return "</doc>";
	}
}