package itexto.issuer

class ComentarioTarefa {
	
	Date dataCadastro = new Date()
	String comentario
	
	static belongsTo = [autor:Usuario, tarefa:Tarefa]
	
    static constraints = {
		dataCadastro(nullable:false)
		autor(nullable:false)
		tarefa(nullable:false)
		comentario(nullable:false, blank:false, maxSize:4096)
    }
}
