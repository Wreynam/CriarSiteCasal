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
 * Servlet implementation class Logar
 */
@WebServlet("/logar")
public class Logar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		Conta contaLogando = new Conta(email,senha);
		HttpSession sessao = request.getSession();
		InfoConta infoConta = null;
		
		ContaDao contaDao = new ContaDao();
		Conta conta = contaDao.verificarLogin(contaLogando);
		if(conta != null) {
			sessao.setAttribute("contaLogada", conta);
			InfoContaDao infoContaDao = new InfoContaDao();
			infoConta = infoContaDao.buscarPorId(conta.getId());
			
		}else {
			response.sendRedirect("entrada");
			return;
		}
		if(infoConta.getDataCasamento() != null) {
			response.sendRedirect("entrada?acao=telaPrincipal");
			return;
		}
		response.sendRedirect("entrada?acao=cadastrarCasal");
	}

}
