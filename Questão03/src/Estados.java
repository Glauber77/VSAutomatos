
public class Estados {
	
	protected PagamentosState stats;
	
	//Inicia no Pagamento Efetuado!
	
	public Estados() { 
		stats = new PagamentoEfetuado();
	}
	
	public void IrPagamentoSendoProcessado() {
		stats = stats.IrPagamentoSendoProcessado();
	}
	
	public void IrPagamentoAprovado() {
		stats = stats.IrPagamentoAprovado();
	}
	
	public void IrPagamentoNaoAprovado() {
		stats = stats.IrPagamentoNaoAprovado();
	}
	
	public void IrPagamentoReembolsado() {
		stats = stats.IrPagamentoReembolsado();
	}
	
	public void IrPagamentoFinalizado() {
		stats = stats.IrPagamentoFinalizado();
	}
	
}
