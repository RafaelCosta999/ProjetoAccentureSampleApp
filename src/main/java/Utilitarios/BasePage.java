package Utilitarios;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static final int TIMEOUT = 2;
	public static final int TIMEOUT_LOADING = 120;
	public static final int POLLING = 100;
	
	public WebDriver driver;
	public WebDriverWait wait;
	WebDriverWait waitLoading;
	public int retentativa;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	public void verificarEClicar(WebElement botao) {
		try {

			System.out.println("Vai clicar!!! --- " + botao.toString());
			botao.click();

		} catch (NoSuchElementException e) {
			System.out.println("ElementoNaoEncontrado: " + botao + "  -  " + e.getCause());
		} catch (TimeoutException timeoutEx) {
			System.out.println("TimeOut: " + botao + "  -  " + timeoutEx.getCause());
		} catch (StaleElementReferenceException sere) {
			System.out.println("StaleElementReferenceException: " + botao + "  -  " + sere.getCause());
		} catch(WebDriverException e) {
			System.err.println("WebDriverException: " + botao + "  -  " + e.getMessage());
			retentativa ++;
			if(retentativa <= 10) {
				try {
					Thread.sleep(100);
				} catch (Exception e1) {}
				verificarEClicar(botao);
			}
		}
	}
	
	public void digitarDadoCampo(WebElement campoTexto, String sDado) {
		int iCount = 0;
		try {
			verificarEClicar(campoTexto);
			campoTexto.clear();
			while (!campoTexto.getAttribute("value").equals("") & iCount < 5) {
				campoTexto.clear();
			}
			while (campoTexto.getAttribute("value").equals("") & iCount < 5) {
				campoTexto.clear();
				campoTexto.clear();
				campoTexto.sendKeys(sDado);
				System.out.println("******* Digitando: " + campoTexto.getAttribute("value"));
				iCount++;
			}
		} catch (Exception e) {
			System.out.println("digitarDadoCampo: " + campoTexto + "  -  " + e.getCause());
		}
	}
	
	public void Clicar(WebElement element) {
		element.click();
	}

}
