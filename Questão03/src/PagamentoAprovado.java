
public class PagamentoAprovado implements PagamentosState{
	
	//Possiveis Respostas de chamadas do Pagamento, de acordo com o Diagrama.
	
			public PagamentosState IrPagamentoEfetuado() { 
				System.out.print("Pagamento já em andamento!\n");  
				return null;
				}
			public PagamentosState IrPagamentoSendoProcessado() {
				System.out.print("Pagamento já Processado!\n");  
				return null;
			}
			public PagamentosState IrPagamentoAprovado() {
				System.out.print("Pagamento Aprovado!\n");  
				return null;
			}
			public PagamentosState IrPagamentoNaoAprovado() {
				System.out.print("Pagamento já Aprovado!\n");  
				return null;
			}
			public PagamentosState IrPagamentoReembolsado() {
				System.out.print("Cliente pede Reembolso de Pagamento!\n");  
				return new PagamentoReembolsado();
			}
			public PagamentosState IrPagamentoFinalizado() {
				System.out.print("Pagamento Finalizado!\n");  
				return new PagamentoFinalizado();
			}
			
}
