package strategy;

import java.util.List;

public class ExportadorTXT extends ExportadorComum {

	@Override
	protected String abrirDocumento() {
		return "";
	}

	@Override
	protected String formatarParagrafo(String paragrafo) {
		return paragrafo + "\n";
	}

	@Override
	protected String fecharDocumento() {
		return "";
	}
}