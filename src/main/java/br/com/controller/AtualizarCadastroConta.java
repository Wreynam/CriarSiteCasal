package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.dao.ContaDao;
import br.com.model.Conta;

@WebServlet("/atualizarCadastroConta")
public class AtualizarCadastroConta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String sobre = request.getParameter("sobre");
		
		Conta conta = new Conta(nome, email, telefone, sobre);
		ContaDao contaDao = new ContaDao();
		HttpSession sessao = request.getSession();
		Conta contaLogada = (Conta)sessao.getAttribute("contaLogada");
		contaDao.atualizarConta(conta, contaLogada.getId() );
		
		response.sendRedirect("entrada?acao=telaPrincipal");
	}

}
