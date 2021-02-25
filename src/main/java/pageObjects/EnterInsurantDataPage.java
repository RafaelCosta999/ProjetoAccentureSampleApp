package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilitarios.BasePage;

public class EnterInsurantDataPage extends BasePage{
	
	public EnterInsurantDataPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(id="firstname")
	protected WebElement firt_name;
	
	@FindBy(id="lastname")
	protected WebElement Last_name;
	
	@FindBy(id="birthdate")
	protected WebElement date_of_birth;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span")
	protected WebElement genderM;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span")
	protected WebElement genderF;
	
	@FindBy(id="streetaddress")
	protected WebElement Street_Andress;
	
	@FindBy(id="country")
	protected WebElement country;
	
	@FindBy(id="zipcode")
	protected WebElement zip_code;
	
	@FindBy(id="city")
	protected WebElement city;
	
	@FindBy(id="occupation")
	protected WebElement occupation;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span")
	protected WebElement speeding;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span")
	protected WebElement bungeejumping;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span")
	protected WebElement cliffdiving;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span")
	protected WebElement skydiving;
	
	@FindBy(xpath="//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span")
	protected WebElement other;
	
	@FindBy(id="website")
	protected WebElement website;
	
	@FindBy(id="nextenterproductdata")
	protected WebElement btn_next2;
	
	@FindBy(id="picture")
	protected WebElement picture;
	
	@FindBy(id="open")
	protected WebElement btn_open;

	
	
	protected WebElement escolha(String please) {
		return driver.findElement((By) By.xpath("//*[contains(text(), '" + please + "')]"));
	}

	
	
	public void preencheFirtsname(String name) throws InterruptedException {
		digitarDadoCampo(firt_name, name);
		Thread.sleep(1000);
	}
	
	public void preencheLastname(String lastname) throws InterruptedException {
		digitarDadoCampo(Last_name, lastname);
		Thread.sleep(1000);
	}
	
	public void preencheDateOfBirth(String dateOfBirth) throws InterruptedException {
		date_of_birth.click();
		digitarDadoCampo(date_of_birth, dateOfBirth);
		Thread.sleep(1000);
	}
	
	
	public void preencheGender (String sexo) throws InterruptedException{
		
		switch (sexo) {
		
			case "M":
				genderM.click();
				Thread.sleep(1000);
			break;
			
			case "F":
				genderF.click();
				Thread.sleep(1000);
			break;
		
		}
		
		return;
	}
	
	public void preencheStreetAndress(String andress) throws InterruptedException {
		digitarDadoCampo(Street_Andress, andress);
		Thread.sleep(1000);
	}
	
	public void selecionarCountry(String please) throws InterruptedException {
		verificarEClicar(country);
		Clicar(escolha(please));
		Thread.sleep(1000);
	}
	
	public void preencheZipCode(String zipCode) throws InterruptedException {
		digitarDadoCampo(zip_code, zipCode);
		Thread.sleep(1000);
	}
	
	public void preencheCity(String newCity) throws InterruptedException {
		digitarDadoCampo(city, newCity);
		Thread.sleep(1000);
	}
	
	public void selecionarOccupation(String please) throws InterruptedException {
		verificarEClicar(occupation);
		Clicar(escolha(please));
		Thread.sleep(1000);
	}
	
	public void preencheHobbies (String hobbie) throws InterruptedException{
		
		switch (hobbie) {
		
			case "Speeding":
				speeding.click();
				Thread.sleep(1000);
			break;
			
			case "Bungee":
				bungeejumping.click();
				Thread.sleep(1000);
			break;
			
			case "Cliff":
				cliffdiving.click();
				Thread.sleep(1000);
			break;
			
			case "Skydiving":
				skydiving.click();
				Thread.sleep(1000);
			break;
			
			case "Other":
				other.click();
				Thread.sleep(1000);
			break;
		
		}
		
		return;
	}
	
	public void preencheWebSite(String webSite) throws InterruptedException {
		digitarDadoCampo(website, webSite);
		Thread.sleep(1000);
	}
	
	public void preenchePicture() throws InterruptedException {
		
		verificarEClicar(btn_open);
		String uploadFile = System.getProperty("user.dir") + "\\src\\main\\resources\\Peixe.jpg";
		StringSelection fileUpload = new StringSelection(uploadFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileUpload, null);
		Thread.sleep(5000);
		
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void buttonNextProductData () {
		verificarEClicar(btn_next2);
	}

}
