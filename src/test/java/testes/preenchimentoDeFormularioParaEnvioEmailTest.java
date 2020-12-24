package testes;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class preenchimentoDeFormularioParaEnvioEmailTest {

	@Test
	public void testPreencherFormulario() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Xanavi\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().window().maximize();
		navegador.get("http://sampleapp.tricentis.com/101/app.php");
				
		Select comboMake = new Select(navegador.findElement(By.id("make")));
		comboMake.selectByIndex(7);

		Select comboModel = new Select(navegador.findElement(By.id("model")));
		comboModel.selectByIndex(3);

		WebElement cylinderCapacity = navegador.findElement(By.id("cylindercapacity"));
		cylinderCapacity.sendKeys("1500");

		WebElement enginePerformance = navegador.findElement(By.id("engineperformance"));
		enginePerformance.sendKeys("950");

		WebElement dateManufacture = navegador.findElement(By.id("dateofmanufacture"));
		dateManufacture.sendKeys("05/09/2020");

		Select comboSeats = new Select(navegador.findElement(By.id("numberofseats")));
		comboSeats.selectByIndex(5);

		// Informar se o veículo possui o volante no lado direito

		// Essa linha seleciona a opção "Sim"
		
		navegador.findElement(By.xpath("//form[@id='insurance-form']/div/section/div[7]/p/label/span")).click();
	    
		// Essa linha seleciona a opção "Não"
		// navegador.findElement(By.xpath("//form[@id='insurance-form']/div/section/div[7]/p/label[2]/span")).click();

		
		Select comboSeatsBike = new Select(navegador.findElement(By.id("numberofseatsmotorcycle")));
		comboSeatsBike.selectByIndex(2);
		
		Select fuelType = new Select(navegador.findElement(By.id("fuel")));
		fuelType.selectByIndex(1);
		
		WebElement payloadKg = navegador.findElement(By.id("payload"));
		payloadKg.sendKeys("500");

		WebElement totalWeight = navegador.findElement(By.id("totalweight"));
		totalWeight.sendKeys("2500");

		WebElement listPrice = navegador.findElement(By.id("listprice"));
		listPrice.sendKeys("1000");

		WebElement licensePlate = navegador.findElement(By.id("licenseplatenumber"));
		licensePlate.sendKeys("CZK2526");

		WebElement annualMileage = navegador.findElement(By.id("annualmileage"));
		annualMileage.sendKeys("65000");

		WebElement btnNext = navegador.findElement(By.id("nextenterinsurantdata"));
		btnNext.click();
		
		// próxima pagina

		WebElement firstName = navegador.findElement(By.id("firstname"));
		firstName.sendKeys("Wellington");

		WebElement lastName = navegador.findElement(By.id("lastname"));
		lastName.sendKeys("Santos");

		WebElement birthDate = navegador.findElement(By.id("birthdate"));
		birthDate.sendKeys("04/25/1996");
		
		WebElement checkBox = navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]"));
		checkBox.click();
		
		WebElement streetAddress = navegador.findElement(By.id("streetaddress"));
		streetAddress.sendKeys("Rua dos Alfineiros");
		
		Select comboCountry = new Select(navegador.findElement(By.id("country")));
		comboCountry.selectByIndex(31);

		WebElement zipCode = navegador.findElement(By.id("zipcode"));
		zipCode.sendKeys("04476300");

		WebElement city = navegador.findElement(By.id("city"));
		city.sendKeys("São Paulo");
		
		Select comboOccupation = new Select(navegador.findElement(By.id("occupation")));
		comboOccupation.selectByIndex(1);
		
		WebElement checkBoxSpeeding = navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
		checkBoxSpeeding.click();
		
		WebElement checkBoxBungeeJump = navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]"));
		checkBoxBungeeJump.click();
		
		WebElement checkBoxSkydiving = navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]"));
		checkBoxSkydiving.click();
		
		WebElement webSite = navegador.findElement(By.id("website"));
		webSite.sendKeys("naotenhosite.com.br");

		// proxima pagina

		WebElement btnNextPage2 = navegador.findElement(By.id("nextenterproductdata"));
		btnNextPage2.click();

		// mandar a data um mes após o dia atual
		 
		Calendar c = Calendar.getInstance();
		Date dateNxtMounth = new Date();
		c.add(Calendar.DAY_OF_MONTH, +32);
		dateNxtMounth = c.getTime();
		String data = new SimpleDateFormat("MM/dd/yyyy").format(dateNxtMounth);
	
		WebElement startDate = navegador.findElement(By.id("startdate"));
		startDate.sendKeys(data);
		
		Select comboInsurance = new Select(navegador.findElement(By.id("insurancesum")));
		comboInsurance.selectByIndex(1);
		
		Select comboMerit = new Select(navegador.findElement(By.id("meritrating")));
		comboMerit.selectByIndex(2);
		
		Select comboDamage = new Select(navegador.findElement(By.id("damageinsurance")));
		comboDamage.selectByIndex(3);
		
		WebElement checkBoxEuro = navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]"));
		checkBoxEuro.click();
		
		WebElement checkBoxLegal = navegador.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]"));
		checkBoxLegal.click();
		
		Select comboCourtesy = new Select(navegador.findElement(By.id("courtesycar")));
		comboCourtesy.selectByIndex(2);

		// proxima pagina

		WebElement btnNextPage3 = navegador.findElement(By.id("nextselectpriceoption"));
		btnNextPage3.click();
		
		WebElement radioBtnPrice = navegador.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]"));
		radioBtnPrice.click();
		
		// proxima pagina
		
		WebElement tabSendQuote = navegador.findElement(By.id("sendquote"));
		tabSendQuote.click();
		
		WebElement email = navegador.findElement(By.id("email"));
		email.sendKeys("fulano_beltrano@hotmail.com");
		
		WebElement phone = navegador.findElement(By.id("phone"));
		phone.sendKeys("56147896");
		
		WebElement username = navegador.findElement(By.id("username"));
		username.sendKeys("user_test");
		
		WebElement password = navegador.findElement(By.id("password"));
		password.sendKeys("Ab741852c");
		
		WebElement confirmPwd = navegador.findElement(By.id("confirmpassword"));
		confirmPwd.sendKeys("Ab741852c");
		
		WebElement comments = navegador.findElement(By.id("Comments"));
		comments.sendKeys("aqui jaz um comentario de teste");
		
		WebElement btnSend = navegador.findElement(By.id("sendemail"));
		btnSend.click();	
		
//		Aguarde e quando aparecer clique no botão ok
		
		WebElement btnConfirm = (new WebDriverWait(navegador, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[7]/div/button")));
		btnConfirm.click();
		
		navegador.close();
		
	}
}
