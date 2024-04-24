package steps;

import core.Driver;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ProdutosPage;

import static org.junit.Assert.assertEquals;

public class ProdutosSteps {
    ProdutosPage produtosPage;

    @Então("valido que exibe a tela produtos")
    public void validoQueExibeATelaProdutos() {
        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());
    }

    @Quando("seleciono o pacote de cursos")
    public void selecionoOPacoteDeCursos() {
        Driver.swipe(0, 0, "down", 1.0);
        produtosPage.clickPacoteCurso();
    }

}
