package br.ltmarinho.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormularioMetodos {
		
		WebDriver driver;
		
		public FormularioMetodos(WebDriver driver) {
			this.driver = driver;
		}
		
		public void acess () {
			driver.manage().window().maximize();
			driver.get("http://sampleapp.tricentis.com/101/app.php");
		}
		
		/********* TextField e TextArea ************/
		
		public void write(By by, String text){
			driver.findElement(by).clear();
			driver.findElement(by).sendKeys(text);
		}

		public void write(String id_input, String text){
			write(By.id(id_input), text);
			Assert.assertEquals(text, driver.findElement(By.id(id_input)).getAttribute("value"));
		}
		
		
		/********* Radio e Check ************/
		
		public boolean clickRadio(String id) {
			driver.findElement(By.id(id)).click();
			return driver.findElement(By.id(id)).isSelected();
		}
					
		public boolean clickRadioX(String xpath) {
			driver.findElement(By.xpath(xpath)).click();
			return driver.findElement(By.xpath(xpath)).isSelected();
		}
		
		
		/********* Combo ***********/
		
		public String selectCombo(String id, String value) {
			WebElement element = driver.findElement(By.id(id));
			Select combo = new Select(element);
			combo.selectByVisibleText(value);
			return combo.getFirstSelectedOption().getText();
		}
		
		
		/********* Button ************/
		
		public void clickButton(String id) {
			driver.findElement(By.id(id)).click();
		}
		
		public void clickButtonX(String xpath) {
			driver.findElement(By.xpath(xpath)).click();
		}	
		
		
		/********* Textos ************/
		
		public String obteinText(By by) {
			return driver.findElement(by).getText();	
		}
		
		public String obteinText(String xpath) {
			return obteinText(By.xpath(xpath));
		}
		
		
		/********* Upload ************/
		
		public void upload( ) {
			WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
			chooseFile.sendKeys(System.getProperty("user.dir") + "\\foto\\carro.jpg");
		}
		
		/********* Waiting and Loading ************/
		
		public void waitingtoclick(String id) {
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
		}	
		
		public void waitingtoclickX(String xpath) {
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		}	
		
		public void waiting(String xpath) {
			WebDriverWait wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
		}
							
		
}






