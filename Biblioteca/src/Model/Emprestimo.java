package Model;
import java.util.UUID;
import java.util.Date;
import Model.Livro;
import Model.Usuario;


public class Emprestimo {
	  
	private UUID idLivro;
	private UUID idUsuario;
	private Date DataPedido;
	private Date DataDevolucao;
	
    public Emprestimo(UUID idLivro, UUID idUsuario, Date DataPedido, Date DataDevolucao) 
    {
    	this.idLivro = idLivro;
    	this.idUsuario = idUsuario;
    	this.DataPedido = DataPedido;
    	this.DataDevolucao = DataDevolucao;
    }
    
    public UUID getIdLivro() {
        return idLivro;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public Date getDataPedido() {
        return DataPedido;
    }

    public Date getDataDevolucao() {
        return DataDevolucao;
    }
}