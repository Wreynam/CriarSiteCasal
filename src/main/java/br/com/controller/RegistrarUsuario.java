package br.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dao.ContaDao;
import br.com.dao.InfoContaDao;
import br.com.model.Conta;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/registrarUsuario")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
	    
		
		ContaDao contaDao = new ContaDao();
		InfoContaDao infoContaDao = new InfoContaDao();
		
		
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		if(senha.matches(pattern)) {
			Conta conta = new Conta(nome, email, senha);
			contaDao.gravar(conta);
			infoContaDao.locarEspaco();
			response.sendRedirect("entrada");
		}
		response.sendRedirect("entrada?acao=registrar&msg=Erro No Cadastro");
		
		
	}

}
