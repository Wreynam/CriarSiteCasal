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

/**
 * Servlet implementation class NovaSenha
 */
@WebServlet("/novaSenha")
public class NovaSenha extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		String senhaAtual = request.getParameter("senhaAtual");
		String novaSenha = request.getParameter("novaSenha");
		String novaSenhaConfirmar = request.getParameter("novaSenhaConfirmar");
		
		HttpSession sessao = request.getSession();
		Conta contaLogada = (Conta)sessao.getAttribute("contaLogada");
		int IdAtual = contaLogada.getId();
		
		ContaDao contaDao = new ContaDao();
		Conta contaTrocaSenha = contaDao.buscarPorIdSenha(IdAtual);
		/////////////////////////////////////////////////////
		if(contaTrocaSenha.getSenha().equals(senhaAtual)) {
			if(novaSenha.equals(novaSenhaConfirmar)) {
				if(novaSenha.matches(pattern)) {
					contaTrocaSenha.setSenha(novaSenha);
					contaDao.atualizarContaSenha(contaTrocaSenha, IdAtual);
				}
			}
		}
		/////////////////////////////////////////////////////
		
		response.sendRedirect("entrada?acao=telaPrincipal");
	}

}
