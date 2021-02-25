package StepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dada;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.EnterInsurantDataPage;
import pageObjects.EnterPriceOptionPage;
import pageObjects.EnterProductDataPage;
import pageObjects.EnterSendQuotePage;
import pageObjects.EnterVahicleDataPage;

public class CadastroSteps {

	public WebDriver driver;
	EnterVahicleDataPage VA;
	EnterInsurantDataPage ID;
	EnterProductDataPage PD;
	EnterPriceOptionPage PO;
	EnterSendQuotePage SQ;

	@Dada("que abro o navegador Chrome")
	public void que_abro_o_navegador_chrome() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		VA=new EnterVahicleDataPage(driver);
	}

	@Quando("abro a URL {string}")
	public void abro_a_url(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(3000);
	}

	@E("preencho os dados do veiculo com {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string}")
	public void preencho_os_dados_do_veiculo_com_e_e_e_e_e_e_e_e_e_e_e_e(String marca, String model, String cylinder, String engine, String fabricacao, String number, String hand, String fuel, String payload, String weight, String price, String license, String mileage) throws Throwable {
		VA.selecionarMake(marca);
		VA.selecionarModel(model);
		VA.preencheCylinder(cylinder);
		VA.preencheEngine(engine);
		VA.dataFabricacao(fabricacao);
		VA.selecionarNumberOfSeats(number);
		VA.selecionarHandDriver(hand);
		VA.selSeats();
		VA.selecionarFuel(fuel);
		VA.preenchePayload(payload);
		VA.preencheTotalWeight(weight);
		VA.preencheListPrice(price);
		VA.preencheLicensePlate(license);
		VA.preencheAnualMileage(mileage);
	}

	@E("clico em avancar para dados do seguro")
	public void clico_em_avancar_para_dados_do_seguro() throws InterruptedException{
		VA.buttonNextInsurantDate();
		Thread.sleep(3000);
	}

	@E("preencho os dados do seguro {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string} e {string}")
	public void preencho_os_dados_do_seguro_e_e_e_e_e_e_e_e_e_e_e(String firtsName, String lastName, String birth, String gender, String andress, String country, String zipcode, String city, String occupation, String hobbies, String hobbies2, String site) throws Throwable {
		ID=new EnterInsurantDataPage(driver);
		ID.preencheFirtsname(firtsName);
		ID.preencheLastname(lastName);
		ID.preencheDateOfBirth(birth);
		ID.preencheGender(gender);
		ID.preencheStreetAndress(andress);
		ID.selecionarCountry(country);
		ID.preencheZipCode(zipcode);
		ID.preencheCity(city);
		ID.selecionarOccupation(occupation);
		ID.preencheHobbies(hobbies);
		ID.preencheHobbies(hobbies2);
		ID.preencheWebSite(site);
		ID.preenchePicture();
		
	}

	@E("clico em avancar para dados do produto")
	public void clico_em_avancar_para_dados_do_produto() {
		ID.buttonNextProductData();
	}

	@E("insiro os dados do produto {string} e {string} e {string} e {string} e {string} e {string}")
	public void insiro_os_dados_do_produto_e_e_e_e_e(String startDate, String insuranceSum, String MeritRating, String DamageInsurance, String optionalProducts, String courtesyCar) throws Throwable {
		PD=new EnterProductDataPage(driver);
		PD.preencheStartDate(startDate);
		PD.selecionaInsuranceSum(insuranceSum);
		PD.selecionaMeritRating(MeritRating);
		PD.selecionaDamageInsurance(DamageInsurance);
		PD.preencheOptionalProducts(optionalProducts);
		PD.selecionarCourtesyCar(courtesyCar);
	}

	@E("clico em avancar para opcao de preco")
	public void clico_em_avancar_para_opcao_de_preco() {
		PD.buttonNextPriceOption();
	}

	@E("seleciono a opcao de preco {string}")
	public void seleciono_a_opcao_de_preco(String priceOption) throws Throwable {
		PO=new EnterPriceOptionPage(driver);
		PO.selecionaPriceOption(priceOption);
	}

	@E("clico para avancar para envio de cotacao")
	public void clico_para_avancar_para_envio_de_cotacao() {
		PO.buttonSendQuote();
	}
	
	@Quando("preencho os dados finais da cotacao {string} e {string} e {string} e {string} e {string} e {string}")
	public void preencho_os_dados_finais_da_cotacao_e_e_e_e_e(String email, String phone, String userName, String password, String confirmPassword, String comments) throws Throwable {
		SQ=new EnterSendQuotePage(driver);
		SQ.preencheEmail(email);
		SQ.preenchePhone(phone);
		SQ.preencheUserName(userName);
		SQ.preenchePassword(password);
		SQ.preencheConfirmPassword(confirmPassword);
		SQ.preencheComments(comments);
	}

	@E("clico em enviar cotacao")
	public void clico_em_enviar_cotacao() throws Throwable {
		SQ.buttonSend();
		Thread.sleep(3000);
	}

	@Entao("valido o envio realizado com sucesso")
	public void valido_o_envio_realizado_com_sucesso() throws InterruptedException {
		SQ.validarCadastroSucesso();
		Thread.sleep(2000);
		driver.quit();
	}

}
