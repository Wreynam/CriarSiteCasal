package br.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.ContaDao;
import br.com.model.Conta;

/**
 * Servlet implementation class RecuperarSenha
 */
@WebServlet("/recuperarSenha")
public class RecuperarSenha extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		Conta conta = new Conta(0,nome, email, true);
		ContaDao contaDao = new ContaDao();
		
		Conta contaExiste = contaDao.verificarExiste(conta);
		if(contaExiste != null) {
			request.setAttribute("ID", contaExiste.getId());
			rd = request.getRequestDispatcher("WEB-INF/jsp/novaSenha.jsp");
			rd.forward(request, response);
			return;
		}
		response.sendRedirect("entrada");
	}

}
