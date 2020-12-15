
public class PagamentoEfetuado implements PagamentosState{

	
		//Possiveis Respostas de chamadas do Pagamento, de acordo com o Diagrama.
	
		public PagamentosState IrPagamentoEfetuado() { 
			System.out.print("Pagamento já em andamento!\n");  
			return null;
			}
		public PagamentosState IrPagamentoSendoProcessado() {
			System.out.print("Pagamento Aguardando Processamento!\n");  
			return new PagamentoSendoProcessado();
		}
		public PagamentosState IrPagamentoAprovado() {
			System.out.print("Pagamento Aguardando Processamento!\n");  
			return null;
		}
		public PagamentosState IrPagamentoNaoAprovado() {
			System.out.print("Pagamento Aguardando Processamento!\n");  
			return null;
		}
		public PagamentosState IrPagamentoReembolsado() {
			System.out.print("Pagamento Aguardando Processamento!\n");  
			return null;
		}
		public PagamentosState IrPagamentoFinalizado() {
			System.out.print("Pagamento Aguardando Processamento!\n");  
			return null;
		}
		
		
		
		
	

}
