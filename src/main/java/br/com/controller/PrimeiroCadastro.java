package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.dao.ContaDao;
import br.com.dao.InfoContaDao;
import br.com.model.Conta;
import br.com.model.InfoConta;

/**
 * Servlet implementation class AtualizarCadastro
 */
@WebServlet("/primeiroCadastro")
public class PrimeiroCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Informações da Conta
		String nomeAmor = request.getParameter("nomeAmor");
		String emailAmor = request.getParameter("emailAmor");
		Conta conta = new Conta(nomeAmor, emailAmor, false);
		
		ContaDao contaDao = new ContaDao();
		HttpSession sessao = request.getSession();
		Conta contaLogada = (Conta)sessao.getAttribute("contaLogada");
		contaDao.gravarPrimeiro(conta, contaLogada.getId());
		
		//Informaçoes do casal
		String dataCasamento = request.getParameter("dataCasamento");
		String acessoSite = request.getParameter("acessoSite");
		InfoConta infoConta = new InfoConta(dataCasamento, acessoSite);
		
		InfoContaDao infoContaDao = new InfoContaDao();
		infoContaDao.gravarPrimeiro(infoConta, contaLogada.getId());
		
		response.sendRedirect("entrada?acao=telaPrincipal");
		
	}

}
