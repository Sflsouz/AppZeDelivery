package apoio;

public class Contexto {

	public Contexto() {
	}

	private static Contexto instancia;

	public static Contexto recuperarInstancia() {
		if (instancia == null)
			instancia = new Contexto();

		return instancia;
	}
	
	public static String nomeProduto;
	public static String Cep;
	public static String opcaoPagamento;
	public static float precoProduto;
	public static int qtdProduto;
	public static float totalPedido;
    public static String nomeCidadeAPI;
}
