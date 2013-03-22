package itexto.issuer

class Projeto {
	
	String nome
	String descricao
	Boolean ativo = true
	Date dataCadastro = new Date()
	
	static belongsTo = [cliente:Usuario]
	
    static constraints = {
		nome(nullable:false, blank:false, maxSize:128, unique:['cliente'])
		descricao(nullable:false, blank:false, maxSize:255)
		ativo(nullable:false)
		dataCadastro(nullable:false)
		cliente(nullable:false)
    }
}
