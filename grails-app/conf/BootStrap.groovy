/**
 * É no arquivo Bootstrap.groovy que incluímos todo o código que pode
 * ser executado no momento em que nossa aplicação é iniciada ou finalizada.
 * 
 * Um bom exemplo de uso seria garantir a presença dos registros de permissão
 * na nossa base de dados.
 * @author kicolobo
 *
 */
import itexto.issuer.*
class BootStrap {

    def init = { servletContext ->
		def permissoes = ["ROLE_ADMIN", "ROLE_CLIENTE", "ROLE_ATENDENTE"]
		if (true) return
		for (permissao in permissoes) {
			def registro = Permissao.findOrSaveByAuthority(permissao)
		}
    }
    def destroy = {
    }
}
