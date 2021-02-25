package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilitarios.BasePage;

public class EnterProductDataPage extends BasePage {
	
	public EnterProductDataPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="startdate")
	protected WebElement start_date;
	
	@FindBy(id="insurancesum")
	protected WebElement insurance_sum;
	
	@FindBy(id="meritrating")
	protected WebElement merit_rating;
	
	@FindBy(id="damageinsurance")
	protected WebElement damage_insurance;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")
	protected WebElement euro_protection;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span")
	protected WebElement legal_defense;
	
	@FindBy(id="courtesycar")
	protected WebElement courtesy_car;
	
	@FindBy(id="nextselectpriceoption")
	protected WebElement btn_next3;
	
	
	
	protected WebElement escolha(String please) {
		return driver.findElement((By) By.xpath("//*[contains(text(), '" + please + "')]"));
	}
	
	
	
	public void preencheStartDate(String dateStart) throws InterruptedException {
		start_date.click();
		digitarDadoCampo(start_date, dateStart);
		Thread.sleep(1000);
	}
	
	public void selecionaInsuranceSum(String please) throws InterruptedException {
		verificarEClicar(insurance_sum);
		Clicar(escolha(please));
		Thread.sleep(1000);
	}
	
	public void selecionaMeritRating(String please) throws InterruptedException {
		verificarEClicar(merit_rating);
		Clicar(escolha(please));
		Thread.sleep(1000);
	}
	
	public void selecionaDamageInsurance(String please) throws InterruptedException {
		verificarEClicar(damage_insurance);
		Clicar(escolha(please));
		Thread.sleep(1000);
	}
	
	
	public void preencheOptionalProducts (String product) throws InterruptedException{
		
		switch (product) {
		
			case "Euro":
				euro_protection.click();
				Thread.sleep(1000);
			break;
			
			case "Legal":
				legal_defense.click();
				Thread.sleep(1000);
			break;
		
		}
		
		return;
	}
	
	public void selecionarCourtesyCar(String please) throws InterruptedException {
		verificarEClicar(courtesy_car);
		Clicar(escolha(please));
		Thread.sleep(1000);
	}
	
	public void buttonNextPriceOption () {
		verificarEClicar(btn_next3);
	}

}
