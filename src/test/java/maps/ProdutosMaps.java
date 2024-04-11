package maps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProdutosMaps {
    @AndroidFindBy(accessibility = "conhecaTodosOsNossoCursos")
    protected WebElement txtTituloProdutos;

    @AndroidFindBy(accessibility = "pacote_11_cursos_19_tecnologias_buttonComprar_home")
    protected WebElement btnPacoteCursos;

}
