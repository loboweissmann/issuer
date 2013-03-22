package itexto.issuer

class UsuarioService {
	
	
	/**
	 * Retorna true caso o usuario passado como parametro seja um cliente
	 * @param usuario
	 * @return
	 */
    boolean isCliente(Usuario usuario) {
		usuario != null &&
		UsuarioPermissao.findByPermissaoAndUsuario(Permissao.findByAuthority("ROLE_CLIENTE"), usuario) != null
    }
	
	
}
