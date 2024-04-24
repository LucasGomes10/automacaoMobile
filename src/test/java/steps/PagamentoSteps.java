package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.PagamentoPage;

import java.util.Map;

import static org.junit.Assert.assertEquals;


public class PagamentoSteps {
    PagamentoPage pagamentoPage;

    @Quando("seleciono a opcao cartao de credito")
    public void selecionoAOpcaoCartaoDeCredito() {
        pagamentoPage = new PagamentoPage();
        pagamentoPage.clickCartaoDeCredito();
    }

    @Quando("realizo a compra com os seguintes dados")
    public void realizoACompraComOsSeguintesDados(Map<String, String> map) {
        pagamentoPage.finalizaCompraCartao(map.get("numeroCartao"), map.get("vencimento"),
                map.get("cvv"), map.get("nomeTitular"), map.get("cpfTitular"));

    }

    @Entao("valido que foi exibido a mensagem {string}")
    public void validoQueFoiExibidoAMensagem(String msg) {
        assertEquals(msg, pagamentoPage.getMsgPagamento());

    }
}
