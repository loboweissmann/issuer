package itexto.issuer;

public enum StatusTarefa {
	
	ABERTA(1, "Aberta"),
	ANDAMENTO(2, "Em andamento"),
	CANCELADA(3, "Cancelada"),
	ATENDIDA(4, "Atendida"),
	FECHADA(5, "Fechada");
	
	StatusTarefa(int id, String desc) {
		this.id = id;
		this.descricao = desc;
	}
	
	int id
	String descricao
	
	String toString() {
		this.descricao
	}
	
}
