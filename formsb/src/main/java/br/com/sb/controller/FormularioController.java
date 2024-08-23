package br.com.sb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sb.conversor.HtmltoPdf;
import br.com.sb.model.Email;
import br.com.sb.model.Form;
import br.com.sb.model.User;

/**
 * Servlet implementation class FormularioContrroller
 */
@WebServlet("/formulario")
public class FormularioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormularioController() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formulario.jsp");
		
		String irFormulario = request.getParameter("irFormulario");
		if(irFormulario != null) {
			String voltarMenu = "voltarMenu";
			request.setAttribute("voltarMenu", voltarMenu);
		}
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("formulario.jsp");
		
		String mensagem = null;
		
		String voltarMenu = request.getParameter("voltarMenu");
		
		String cellName = request.getParameter("cellName");
		String trailerLocation = request.getParameter("trailerLocation");
		String contractor = request.getParameter("contractor");
		String hp = request.getParameter("hp");
		String rolt = request.getParameter("rolt");
		String forman = request.getParameter("forman");
		String lineman = request.getParameter("lineman");
		String groundhand = request.getParameter("groundhand");
		String jso1 = request.getParameter("jso1");
		String pdo1 = request.getParameter("pdo1");
		String fc1 = request.getParameter("fc1");
		String start1 = request.getParameter("start1");
		String stop1 = request.getParameter("stop1");
		String jso2 = request.getParameter("jso2");
		String pdo2 = request.getParameter("pdo2");
		String fc2 = request.getParameter("fc2");
		String start2 = request.getParameter("start2");
		String stop2 = request.getParameter("stop2");
		String jso3 = request.getParameter("jso3");
		String pdo3 = request.getParameter("pdo3");
		String fc3 = request.getParameter("fc3");
		String start3 = request.getParameter("start3");
		String stop3 = request.getParameter("stop3");
		String jso4 = request.getParameter("jso4");
		String pdo4 = request.getParameter("pdo4");
		String fc4 = request.getParameter("fc4");
		String start4 = request.getParameter("start4");
		String stop4 = request.getParameter("stop4");
		String jso5 = request.getParameter("jso5");
		String pdo5 = request.getParameter("pdo5");
		String fc5 = request.getParameter("fc5");
		String start5 = request.getParameter("start5");
		String stop5 = request.getParameter("stop5");
		String jso6 = request.getParameter("jso6");
		String pdo6 = request.getParameter("pdo6");
		String fc6 = request.getParameter("fc6");
		String start6 = request.getParameter("start6");
		String stop6 = request.getParameter("stop6");
		String jso7 = request.getParameter("jso7");
		String pdo7 = request.getParameter("pdo7");
		String fc7 = request.getParameter("fc7");
		String start7 = request.getParameter("start7");
		String stop7 = request.getParameter("stop7");
		String jso8 = request.getParameter("jso8");
		String pdo8 = request.getParameter("pdo8");
		String fc8 = request.getParameter("fc8");
		String start8 = request.getParameter("start8");
		String stop8 = request.getParameter("stop8");
		String jso9 = request.getParameter("jso9");
		String pdo9 = request.getParameter("pdo8");
		String fc9 = request.getParameter("fc9");
		String start9 = request.getParameter("start9");
		String stop9 = request.getParameter("stop9");
		String jso10 = request.getParameter("jso10");
		String pdo10 = request.getParameter("pdo10");
		String fc10 = request.getParameter("fc10");
		String start10 = request.getParameter("start10");
		String stop10 = request.getParameter("stop10");
		String jso11 = request.getParameter("jso11");
		String pdo11 = request.getParameter("pdo11");
		String fc11 = request.getParameter("fc11");
		String start11 = request.getParameter("start11");
		String stop11 = request.getParameter("stop11");
		String jso12 = request.getParameter("jso12");
		String pdo12 = request.getParameter("pdo12");
		String fc12 = request.getParameter("fc12");
		String start12 = request.getParameter("start12");
		String stop12 = request.getParameter("stop12");
		String jso13 = request.getParameter("jso13");
		String pdo13 = request.getParameter("pdo13");
		String fc13 = request.getParameter("fc13");
		String start13 = request.getParameter("start13");
		String stop13 = request.getParameter("stop13");
		String jso14 = request.getParameter("jso14");
		String pdo14 = request.getParameter("pdo14");
		String fc14 = request.getParameter("fc14");
		String start14 = request.getParameter("start14");
		String stop14 = request.getParameter("stop14");
		String jso15 = request.getParameter("jso15");
		String pdo15 = request.getParameter("pdo15");
		String fc15 = request.getParameter("fc15");
		String start15 = request.getParameter("start15");
		String stop15 = request.getParameter("stop15");
		String jso16 = request.getParameter("jso16");
		String pdo16 = request.getParameter("pdo16");
		String fc16 = request.getParameter("fc16");
		String start16 = request.getParameter("start16");
		String stop16 = request.getParameter("stop16");
		String washers = request.getParameter("washers");
		String thimbleEyeNut = request.getParameter("thimbleEyeNut");
		String longExtensionBolts = request.getParameter("longExtensionBolts");
		String shortExtensionBolts = request.getParameter("shortExtensionBolts");
		String suspenseClamps = request.getParameter("suspenseClamps");
		String angledSuspensionClamps = request.getParameter("angledSuspensionClamps");
		String jHook = request.getParameter("jHook");
		String longEyeNuts = request.getParameter("longEyeNuts");
		String eyeNuts = request.getParameter("eyeNuts");
		String deadEnd144 = request.getParameter("deadEnd144");
		String deadEnd288 = request.getParameter("deadEnd288");
		String deadEnd144wThimble = request.getParameter("deadEnd144wThimble");
		String deadEnd288wThimble = request.getParameter("deadEnd288wThimble");
		String nuts = request.getParameter("nuts");
		String snoShoes = request.getParameter("snoShoes");
		String lashingWire = request.getParameter("lashingWire");
		String lashingClamps = request.getParameter("lashingClamps");
		String cableTieStraps = request.getParameter("cableTieStraps");
		String cableStraps = request.getParameter("cableStraps");
		String Tape = request.getParameter("Tape");
		String strandSpacer = request.getParameter("strandSpacer");
		String fiberMarkers = request.getParameter("fiberMarkers");
		String treeGuards = request.getParameter("treeGuards");
		String Copper = request.getParameter("Copper");
		String groundingClamps = request.getParameter("groundingClamps");
		String universalClamps = request.getParameter("universalClamps");
		String observation = request.getParameter("observation");
		String printName = request.getParameter("printName");
		
		Form form = new Form();

		form.setCellName(cellName);
		form.setTrailerLocation(trailerLocation);
		form.setContractor(contractor);
		form.setHp(hp);
		form.setRolt(rolt);
		form.setForman(forman);
		form.setLineman(lineman);
		form.setGroundhand(groundhand);
		form.setJso1(jso1);
		form.setPdo1(pdo1);
		form.setFc1(fc1);
		form.setStop1(stop1);
		form.setStart1(start1);
		form.setTotalFootage1("");
		form.setJso2(jso2);
		form.setPdo2(pdo2);
		form.setFc2(fc2);
		form.setStop2(stop2);
		form.setStart2(start2);
		form.setTotalFootage2("");
		form.setJso3(jso3);
		form.setPdo3(pdo3);
		form.setFc3(fc3);
		form.setStop3(stop3);
		form.setStart3(start3);
		form.setTotalFootage3("");
		form.setJso4(jso4);
		form.setPdo4(pdo4);
		form.setFc4(fc4);
		form.setStop4(stop4);
		form.setStart4(start4);
		form.setTotalFootage4("");
		form.setJso5(jso5);
		form.setPdo5(pdo5);
		form.setFc5(fc5);
		form.setStop5(stop5);
		form.setStart5(start5);
		form.setTotalFootage5("");
		form.setJso6(jso6);
		form.setPdo6(pdo6);
		form.setFc6(fc6);
		form.setStop6(stop6);
		form.setStart6(start6);
		form.setTotalFootage6("");
		form.setJso7(jso7);
		form.setPdo7(pdo7);
		form.setFc7(fc7);
		form.setStop7(stop7);
		form.setStart7(start7);
		form.setTotalFootage7("");
		form.setJso8(jso8);
		form.setPdo8(pdo8);
		form.setFc8(fc8);
		form.setStop8(stop8);
		form.setStart8(start8);
		form.setTotalFootage8("");
		form.setJso9(jso9);
		form.setPdo9(pdo9);
		form.setFc9(fc9);
		form.setStop9(stop9);
		form.setStart9(start9);
		form.setTotalFootage9("");
		form.setJso10(jso10);
		form.setPdo10(pdo10);
		form.setFc10(fc10);
		form.setStop10(stop10);
		form.setStart10(start10);
		form.setTotalFootage10("");
		form.setJso11(jso11);
		form.setPdo11(pdo11);
		form.setFc11(fc11);
		form.setStop11(stop11);
		form.setStart11(start11);
		form.setTotalFootage11("");
		form.setJso12(jso12);
		form.setPdo12(pdo12);
		form.setFc12(fc12);
		form.setStop12(stop12);
		form.setStart12(start12);
		form.setTotalFootage12("");
		form.setJso13(jso13);
		form.setPdo13(pdo13);
		form.setFc13(fc13);
		form.setStop13(stop13);
		form.setStart13(start13);
		form.setTotalFootage13("");
		form.setJso14(jso14);
		form.setPdo14(pdo14);
		form.setFc14(fc14);
		form.setStop14(stop14);
		form.setStart14(start14);
		form.setTotalFootage14("");
		form.setJso15(jso15);
		form.setPdo15(pdo15);
		form.setFc15(fc15);
		form.setStop15(stop15);
		form.setStart15(start15);
		form.setTotalFootage15("");
		form.setJso16(jso16);
		form.setPdo16(pdo16);
		form.setFc16(fc16);
		form.setStop16(stop16);
		form.setStart16(start16);
		form.setTotalFootage16("");
		form.setWashers(washers);
		form.setThimbleEyeNut(thimbleEyeNut);
		form.setLongExtensionBolts(longExtensionBolts);
		form.setShortExtensionBolts(shortExtensionBolts);
		form.setSuspenseClamps(suspenseClamps);
		form.setAngledSuspensionClamps(angledSuspensionClamps);
		form.setjHook(jHook);
		form.setLongEyeNuts(longEyeNuts);
		form.setEyeNuts(eyeNuts);
		form.setDeadEnd144(deadEnd144);
		form.setDeadEnd288(deadEnd288);
		form.setDeadEnd144wThimble(deadEnd144wThimble);
		form.setDeadEnd288wThimble(deadEnd288wThimble);
		form.setNuts(nuts);
		form.setSnoShoes(snoShoes);
		form.setLashingWire(lashingWire);
		form.setLashingClamps(lashingClamps);
		form.setCableTieStraps(cableTieStraps);
		form.setCableStraps(cableStraps);
		form.setTape(Tape);
		form.setStrandSpacer(strandSpacer);
		form.setFiberMarkers(fiberMarkers);
		form.setTreeGuards(treeGuards);
		form.setCopper(Copper);
		form.setGroundingClamps(groundingClamps);
		form.setUniversalClamps(universalClamps);
		form.setObservation(observation);
		form.setPrintName(printName);
		
		try {
			if (voltarMenu!=null){
				request.setAttribute("voltarMenu", voltarMenu);
			}
			String jsp = form.FormHtml();
			HtmltoPdf conversor = new HtmltoPdf();
			if (cellName!=null) {
				conversor.setPdfName(cellName);
			}
			conversor.converteHtml(jsp);
				
			Email email = new Email();
			email.setPdfName(conversor.getPdfName());
			List<User> listaUsers = new User().consultarUsuarios();
			for (User usuario:listaUsers) {
				if(usuario.getRecebeForm()==1) {
					email.setEmailDestino(usuario.getEmail());
					email.enviaEmail();
				}
			}
			dispatcher = request.getRequestDispatcher("formEnviado.jsp");
		} catch (Exception e) {
			mensagem = "Ocorreu um erro ao enviar o formulário para o email. Recarregue a página e tente novamente!";
			e.printStackTrace();
		}
		
		if (mensagem != null) {
			dispatcher = request.getRequestDispatcher("formulario.jsp");
		}
		
		request.setAttribute("mensagem", mensagem);
		dispatcher.forward(request, response);
		
		
	}

}
