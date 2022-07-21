package br.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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

@WebServlet(urlPatterns = {"/entrada", ""})
public class Entrada extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		RequestDispatcher rd = null;
		if(acao == null) {
			rd = request.getRequestDispatcher("WEB-INF/jsp/login.jsp");
		}else if(acao.equals("registrar")){
			request.setAttribute("msg", request.getParameter("msg"));
			rd = request.getRequestDispatcher("WEB-INF/jsp/registrar.jsp");
		}else if(acao.equals("recuperarSenha")) {
			rd = request.getRequestDispatcher("WEB-INF/jsp/recuperarSenha.jsp");
		}else if(acao.equals("cadastrarCasal")){
			rd = request.getRequestDispatcher("WEB-INF/jsp/cadastroCasal.jsp");
		}else if(acao.equals("telaPrincipal")) {
			HttpSession sessao = request.getSession();
			Conta contaLogada = (Conta)sessao.getAttribute("contaLogada");
			ContaDao contaDao = new ContaDao();
			Conta conta = contaDao.buscarPorId(contaLogada.getId());
			
			InfoContaDao infoContaDao = new InfoContaDao();
			InfoConta infoConta = infoContaDao.buscarPorId(contaLogada.getId());
			
			request.setAttribute("conta", conta);
			request.setAttribute("infoConta", infoConta);
			rd = request.getRequestDispatcher("WEB-INF/jsp/telaPrincipal.jsp");
		}
		rd.forward(request, response);
	}

}
