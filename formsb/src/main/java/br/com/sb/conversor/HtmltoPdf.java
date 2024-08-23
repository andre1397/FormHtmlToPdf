package br.com.sb.conversor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

public class HtmltoPdf{
	
	String PdfName;
	
	public void converteHtml(String jsp) throws IOException{
		Document doc = Jsoup.parse(jsp,"UTF-8");
		String html = doc.toString();
		html = html.substring(html.indexOf("<meta charset=\"UTF-8\">"));
		html = html.replace("<a href=\"index.jsp\"><input type=\"button\" value=\"Desconectar\"></a>", "");
		html = html.replace("<div><br><br> <input type=\"submit\" value=\"Enviar\">", "");
		Document docHtml = Jsoup.parse(html);
		docHtml.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
		if(PdfName==null || PdfName.equals("")) {
			this.PdfName = "FormularioFibraOtica";
		}
		try	(OutputStream os = new FileOutputStream("C:\\FormularioPdf\\" + this.PdfName + ".pdf")){
			ITextRenderer renderer = new ITextRenderer();
			SharedContext cntxt = renderer.getSharedContext();
			cntxt.setPrint(true);
			cntxt.setInteractive(false);
			renderer.setDocumentFromString(docHtml.html());
			renderer.layout();
			renderer.createPDF(os);
			System.out.println("done");
		} catch (Exception e) {
			System.out.println("Erro ao converter o HTML para PDF: " + e);
		}
	}
	
	public void setPdfName(String cellName) {
		this.PdfName = cellName;
	}
	
	public String getPdfName() {
		return this.PdfName;
	}
}
