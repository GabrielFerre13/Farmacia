import model.Medicamento;

public class EstoqueService {

    public void baixarEstoque (Medicamento medicamento, int quantidade){
        if (medicamento.getQuantidadeEstoque() >= quantidade) {
            medicamento.atualizarQuantidadeEstoque(medicamento.getQuantidadeEstoque() - quantidade);

        }
    }

    public void aumentarEstoque(Medicamento medicamento, int quantidade) {
        if (quantidade > 0) {
            medicamento.atualizarQuantidadeEstoque(medicamento.getQuantidadeEstoque() + quantidade);

        }
    }
}
