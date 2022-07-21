package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.dao.InfoContaDao;
import br.com.model.Conta;
import br.com.model.InfoConta;

/**
 * Servlet implementation class AtualizarCadastroInfoConta
 */
@WebServlet("/atualizarCadastroInfoConta")
public class AtualizarCadastroInfoConta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCasal = request.getParameter("nomeCasal");
		String dataCasamento = request.getParameter("dataCasamento");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String enderecoAcesso = request.getParameter("enderecoAcesso");
		String sobreCasal = request.getParameter("sobreCasal");
		
		InfoConta infoConta = new InfoConta(nomeCasal, dataCasamento, cidade, estado, enderecoAcesso, sobreCasal);
		InfoContaDao infoContaDao = new InfoContaDao();
		
		HttpSession sessao = request.getSession();
		Conta contaLogada = (Conta)sessao.getAttribute("contaLogada");
		
		infoContaDao.atualizarInfoConta(infoConta, contaLogada.getId());
		
		response.sendRedirect("entrada?acao=telaPrincipal");
	}

}
