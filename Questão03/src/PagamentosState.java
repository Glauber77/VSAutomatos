
public interface PagamentosState {

	PagamentosState IrPagamentoEfetuado();
	PagamentosState IrPagamentoSendoProcessado();
	PagamentosState IrPagamentoAprovado();
	PagamentosState IrPagamentoNaoAprovado();
	PagamentosState IrPagamentoReembolsado();
	PagamentosState IrPagamentoFinalizado();
	
}
