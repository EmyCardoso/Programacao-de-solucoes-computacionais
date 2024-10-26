
public class Cliente {

	private String nome;
	private String cpf;
	private Conta corrente;
	
 //metodo construtor 
	public Cliente(String nome, String cpf, Conta corrente) {
		this.nome = nome;
		this.cpf =cpf;
		this.conta = corrente;
	}
	
//metodo acesso
	public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public Corrente getConta(){
        return corrente;
    }
    
    //metodo modificadores
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setConta(Conta corrente){
        this.conta = corrente;
    }
    
}
	


