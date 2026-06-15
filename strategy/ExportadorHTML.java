package strategy;

public class ExportadorHTML extends ExportadorComum {
	@Override
	protected String abrirDocumento() { return "<html><body>\n"; }

	@Override
	protected String formatarParagrafo(String paragrafo) { return "<p>" + paragrafo + "</p>\n"; }

	@Override
	protected String fecharDocumento() { return "</body></html>"; }
}