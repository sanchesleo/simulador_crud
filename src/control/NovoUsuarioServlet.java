package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

@WebServlet("/novoUsuario")
public class NovoUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeUsuario = request.getParameter("nome");
		String emailUsuario = request.getParameter("email");
		String telefoneUsuario = request.getParameter("telefone");
		String senhaUsuario = request.getParameter("senha");

		Usuario usuario = new Usuario(nomeUsuario, emailUsuario, telefoneUsuario, senhaUsuario);
		Database.adiciona(usuario);

		request.setAttribute("usuario", usuario);
		response.sendRedirect("listaUsuarios");

	}

}
