package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

@WebServlet("/alteraUsuario")
public class AlteraUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nomeUsuario = request.getParameter("nome");
		String emailUsuario = request.getParameter("email");
		String telefoneUsuario = request.getParameter("telefone");
		String senhaUsuario = request.getParameter("senha");

		Usuario usuario = Database.buscaUsuarioID(id);
		usuario.setNome(nomeUsuario);
		usuario.setEmail(emailUsuario);
		usuario.setTelefone(telefoneUsuario);
		usuario.setSenha(senhaUsuario);

		response.sendRedirect("listaUsuarios");

	}

}
