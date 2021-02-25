package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilitarios.BasePage;

public class EnterPriceOptionPage extends BasePage {
	
	public EnterPriceOptionPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")
	protected WebElement silver;
	
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")
	protected WebElement gold;
	
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")
	protected WebElement platinum;
	
	@FindBy(xpath="//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")
	protected WebElement ultimate;	
	
	@FindBy(id="nextsendquote")
	protected WebElement btn_next4;	
	

	
	
	public void selecionaPriceOption (String tipo) throws InterruptedException{
		
		switch (tipo) {
		
			case "Silver":
				silver.click();
				Thread.sleep(1000);
			break;
			
			case "Gold":
				gold.click();
				Thread.sleep(1000);
			break;
			
			case "Platinum":
				platinum.click();
				Thread.sleep(1000);
			break;
			
			case "Ultimate":
				ultimate.click();
				Thread.sleep(1000);
			break;
		
		}
		
		return;
	}
	
	public void buttonSendQuote () {
		verificarEClicar(btn_next4);
	}
	

}
