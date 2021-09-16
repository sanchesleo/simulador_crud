package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {

	private static List<Usuario> lista = new ArrayList<>();
	private static int id = 1;

	public static void adiciona(Usuario usuario) {
		usuario.setId(id++);
		lista.add(usuario);
	}

	public static void remove(int id) {
		Iterator<Usuario> it = lista.iterator();
		while (it.hasNext()) {
			Usuario usuario = it.next();
			if (usuario.getId() == id) {
				it.remove();
			}
		}
	}

	public static List<Usuario> getUsuarios() {
		return lista;
	}

	public static Usuario buscaUsuarioID(int id) {
		for (Usuario usuario : lista) {
			if (usuario.getId() == id) {
				return usuario;
			}
		}
		return null;
	}

}
