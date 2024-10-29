
public class CartaoCredito extends Pagamento {
	    private String numeroDoCartao;

	    public CartaoCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao){
	        super(nomeDoPagador, cpf, valorASerPago);
	        this.numeroDoCartao = numeroDoCartao;
	    }

	    public String getCartaoCredito(){
	        return numeroDoCartao;
	    }

	    public void setCartaoCredito(String numeroDoCartao){
	        this.numeroDoCartao = numeroDoCartao;
	    }
	}

