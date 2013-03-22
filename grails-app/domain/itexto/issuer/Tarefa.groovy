package itexto.issuer

class Tarefa {
	
	String titulo
	String descricao
	Date dataCadastro = new Date()
	StatusTarefa status = StatusTarefa.ABERTA
	
	static belongsTo = [projeto:Projeto, responsavel:Usuario]
	
    static constraints = {
		titulo(nullable:false, blank:false, maxSize:128)
		descricao(nullable:false, blank:false, maxSize:4096)
		dataCadastro(nullable:false)
		dataCadastro(nullable:false)
		status(nullable:false)
		projeto(nullable:false)
		responsavel(nullable:true)
    }
}
