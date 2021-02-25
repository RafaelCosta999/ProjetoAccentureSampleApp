package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilitarios.BasePage;

public class EnterVahicleDataPage extends BasePage{
	
	public EnterVahicleDataPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="/html/body/div[1]//form/div/section[1]/div[1]/select")
	protected WebElement sel_make;
	
	@FindBy(id="model")
	protected WebElement sel_model;
	
	@FindBy(id="cylindercapacity")
	protected WebElement cylinder_capacity;
	
	@FindBy(id="engineperformance")
	protected WebElement engine_performance;
	
	@FindBy(id="dateofmanufacture")
	protected WebElement date_of_manufacture;
	
	@FindBy(id="numberofseats")
	protected WebElement sel_number_of_seats;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")
	protected WebElement right_hand_drive_yes;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span")
	protected WebElement right_hand_drive_no;
	
	@FindBy(id="numberofseatsmotorcycle")
	protected WebElement sel_seats;
	
	@FindBy(id="fuel")
	protected WebElement fuel_type;
	
	@FindBy(id="payload")
	protected WebElement payload;
	
	@FindBy(id="totalweight")
	protected WebElement total_weight;
	
	@FindBy(id="listprice")
	protected WebElement list_price;
	
	@FindBy(id="licenseplatenumber")
	protected WebElement license_plate_number;
	
	@FindBy(id="annualmileage")
	protected WebElement annual_mileage;
	
	@FindBy(id="nextenterinsurantdata")
	protected WebElement btn_next1;
	
	@FindBy(xpath="//*[@id=\"site-content\"]/div/div[1]/div/div")
	protected WebElement page;

	
	
	protected WebElement escolha(String please) {
		return driver.findElement((By) By.xpath("//*[contains(text(), '" + please + "')]"));
	}
	
	public void selecionarMake(String please) throws InterruptedException {
		verificarEClicar(sel_make);
		Clicar(escolha(please));
		page.click();
		Thread.sleep(1000);
	}
	
	public void selecionarModel(String please) throws InterruptedException {
		verificarEClicar(sel_model);
		Clicar(escolha(please));
		page.click();
		Thread.sleep(1000);
	}
	
	public void preencheCylinder(String cylinder) throws InterruptedException {
		digitarDadoCampo(cylinder_capacity, cylinder);
		Thread.sleep(1000);
	}
	
	public void preencheEngine(String engine) throws InterruptedException {
		digitarDadoCampo(engine_performance, engine);
		Thread.sleep(1000);
	}
	
	public void dataFabricacao(String manufacture) throws InterruptedException {
		date_of_manufacture.click();
		digitarDadoCampo(date_of_manufacture, manufacture);
		Thread.sleep(1000);
	}
	
	public void selecionarNumberOfSeats(String please) throws InterruptedException {
		verificarEClicar(sel_model);
		Clicar(escolha(please));
		page.click();
		Thread.sleep(1000);
	}
	
	public void selecionarHandDriver (String YesorNo) throws InterruptedException{
		
		switch (YesorNo) {
		
			case "Yes":
				right_hand_drive_yes.click();
				Thread.sleep(1000);
			break;
			
			case "No":
				right_hand_drive_no.click();
				Thread.sleep(1000);
			break;
		
		}
		
		return;
	}
	
	public void selSeats() throws InterruptedException {
		verificarEClicar(sel_seats);
		sel_seats.sendKeys(Keys.ARROW_DOWN);
		sel_seats.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}
	
	public void selecionarFuel(String please) throws InterruptedException {
		verificarEClicar(fuel_type);
		Clicar(escolha(please));
		page.click();
		Thread.sleep(1000);
	}
	
	public void preenchePayload(String payloadKg) throws InterruptedException {
		digitarDadoCampo(payload, payloadKg);
		Thread.sleep(1000);
	}
	
	public void preencheTotalWeight(String weight) throws InterruptedException {
		digitarDadoCampo(total_weight, weight);
		Thread.sleep(1000);
	}
	
	public void preencheListPrice(String price) throws InterruptedException {
		digitarDadoCampo(list_price, price);
		Thread.sleep(1000);
	}
	
	public void preencheLicensePlate(String plate) throws InterruptedException {
		digitarDadoCampo(license_plate_number, plate);
		Thread.sleep(1000);
	}
	
	public void preencheAnualMileage(String mileage) throws InterruptedException {
		digitarDadoCampo(annual_mileage, mileage);
		Thread.sleep(1000);
	}
	
	public void buttonNextInsurantDate() throws InterruptedException {
		verificarEClicar(btn_next1);
	}

}
