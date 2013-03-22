package itexto.issuer

class HistoricoStatusTarefa {
	
	Date dataCadastro = new Date()
	StatusTarefa status
	
	static belongsTo = [tarefa:Tarefa, usuario:Usuario]
	
    static constraints = {
		dataCadastro(nullable:false)
		status(nullable:false)
		tarefa(nullable:false)
		usuario(nullable:false)
    }
}
