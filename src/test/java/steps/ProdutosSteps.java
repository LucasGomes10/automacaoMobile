package steps;

import io.cucumber.java.pt.Então;
import pages.ProdutosPage;

import static org.junit.Assert.assertEquals;

public class ProdutosSteps {
    ProdutosPage produtosPage;

    @Então("valido que exibe a tela produtos")
    public void validoQueExibeATelaProdutos() {
        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());
    }

}
