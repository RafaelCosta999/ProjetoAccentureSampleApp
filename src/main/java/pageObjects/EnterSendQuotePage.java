package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilitarios.BasePage;

public class EnterSendQuotePage extends BasePage{
	
	public EnterSendQuotePage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="email")
	protected WebElement email;
	
	@FindBy(id="phone")
	protected WebElement phone;
	
	@FindBy(id="username")
	protected WebElement username;
	
	@FindBy(id="password")
	protected WebElement password;
	
	@FindBy(id="confirmpassword")
	protected WebElement confirm_password;
	
	@FindBy(id="Comments")
	protected WebElement comments;
	
	@FindBy(id="sendemail")
	protected WebElement btn_send;
	
	@FindBy(xpath="/html/body/div[4]/h2")
	protected WebElement txt_sucess;
	
	@FindBy(xpath="/html/body/div[4]/div[7]/div/button")
	protected WebElement btn_ok;
	
	
	
	public void preencheEmail(String newEmail) throws InterruptedException {
		email.click();
		digitarDadoCampo(email, newEmail);
		Thread.sleep(1000);
	}
	
	public void preenchePhone(String newPhone) throws InterruptedException {
		phone.click();
		digitarDadoCampo(phone, newPhone);
		Thread.sleep(1000);
	}
	
	public void preencheUserName(String newUserName) throws InterruptedException {
		username.click();
		digitarDadoCampo(username, newUserName);
		Thread.sleep(1000);
	}
	
	public void preenchePassword(String newPassword) throws InterruptedException {
		password.click();
		digitarDadoCampo(password, newPassword);
		Thread.sleep(1000);
	}
	
	public void preencheConfirmPassword(String passwordConfirm) throws InterruptedException {
		confirm_password.click();
		digitarDadoCampo(confirm_password, passwordConfirm);
		Thread.sleep(1000);
	}
	
	public void preencheComments(String newComments) throws InterruptedException {
		comments.click();
		digitarDadoCampo(comments, newComments);
		Thread.sleep(1000);
	}
	
	public void buttonSend () throws InterruptedException {
		verificarEClicar(btn_send);
		Thread.sleep(8000);
	}
	
	public void validarCadastroSucesso () {
		txt_sucess.isDisplayed();
		System.out.println(txt_sucess.getText());
	}
	

}
