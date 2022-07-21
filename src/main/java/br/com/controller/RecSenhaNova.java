package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.ContaDao;
import br.com.model.Conta;

/**
 * Servlet implementation class RecSenhaNova
 */
@WebServlet("/recSenhaNova")
public class RecSenhaNova extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		
		int ID = Integer.parseInt(request.getParameter("ID"));
		String novaSenha = request.getParameter("novaSenha");
		String novaSenhaConfirmar = request.getParameter("novaSenhaConfirmar");
		
		Conta conta = new Conta(novaSenha);
		ContaDao contaDao = new ContaDao();
		
		if(novaSenha.equals(novaSenhaConfirmar)) {
			if(novaSenha.matches(pattern)) {
				contaDao.atualizarContaSenha(conta, ID);
				response.sendRedirect("entrada");
				return;
			}
		}
		response.sendRedirect("entrada?acao=recuperarSenha");
	}

}
