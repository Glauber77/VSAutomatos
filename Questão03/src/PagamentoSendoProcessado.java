
public class PagamentoSendoProcessado implements PagamentosState{
	
	//Possiveis Respostas de chamadas do Pagamento, de acordo com o Diagrama.
	
			public PagamentosState IrPagamentoEfetuado() { 
				System.out.print("Pagamento já em andamento!\n");  
				return null;
				}
			public PagamentosState IrPagamentoSendoProcessado() {
				System.out.print("Pagamento Aguardando Processamento!\n");  
				return null;
			}
			public PagamentosState IrPagamentoAprovado() {
				System.out.print("Pagamento Aprovado!\n");  
				return new PagamentoAprovado();
			}
			public PagamentosState IrPagamentoNaoAprovado() {
				System.out.print("Pagamento Nao Aprovado!\n");  
				return new PagamentoNaoAprovado();
			}
			public PagamentosState IrPagamentoReembolsado() {
				System.out.print("Aguardando Pagamento!\n");  
				return null;
			}
			public PagamentosState IrPagamentoFinalizado() {
				System.out.print("Aguardando Pagamento!\n");  
				return null;
			}
			
			
}
