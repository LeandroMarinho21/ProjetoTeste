package br.ltmarinho.page;

import org.openqa.selenium.WebDriver;

public class FormularioPage {
	
	private FormularioMetodos Metodos;
	
	public FormularioPage(WebDriver driver) {
		Metodos = new FormularioMetodos(driver);
	}
	
	/********* Acesso e Driver ************/	
	
	public void acess() {
		Metodos.acess();
	}
	
	/********* Combos with verify ************/

	public void setMake() {
		Metodos.selectCombo("make", "BMW");
	}
	
	public void setModel() {
		Metodos.selectCombo("model", "Motorcycle");
	}
	
	public void setSeatsCar() {
		Metodos.selectCombo("numberofseats", "3");
	}
	
	public void setFuelType() {
		Metodos.selectCombo("fuel", "Gas");
	}
	
	public void setSeatsCycle() {
		Metodos.selectCombo("numberofseatsmotorcycle", "2");
	}
	
	public void setCountry() {
		Metodos.selectCombo("country", "Brazil");
	}
	
	public void setOccupation() {
		Metodos.selectCombo("occupation", "Employee");
	}	
	
	public void setInsuranceSum() {
		Metodos.selectCombo("insurancesum", "3.000.000,00");
	}	
	
	public void setMeritRating() {
		Metodos.selectCombo("meritrating", "Bonus 1");
	}	
	
	public void setDamageInsurance() {
		Metodos.selectCombo("damageinsurance", "Full Coverage");
	}	
	
	public void setCourtesyCar() {
		Metodos.selectCombo("courtesycar", "Yes");
		
	/********* Radio and Check  with verify ************/		
	}	
	
	public void setRightHandDriver() {
		Metodos.clickRadioX("//label[text()='No']");
	}
	
	public void setGender() {
		Metodos.clickRadioX("//label[text()='Male']");
	}
	
	public void setHobbies() {
		Metodos.clickRadioX("//label[text()=' Speeding']");
	}
	
	public void setOptionalProducts() {
		Metodos.clickRadioX("//label[text()='Euro Protection']");
		Metodos.clickRadioX("//label[text()='Legal Defense Insurance']");
	}
	
	public void setSelectPriceOption() {
		Metodos.clickRadioX("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]/span");
	}
	
	/********* Write with verify ************/
		
	public void setCylinderCapacity() {
		Metodos.write("cylindercapacity", "400");
	}
	
	public void setEnginePerformance() {
		Metodos.write("engineperformance", "100");
	}
	
	public void setDateOfManufacture() {
		Metodos.write("dateofmanufacture", "10/21/1997");
	}
	
	public void setPayload() {
		Metodos.write("payload", "20");
	}
	
	public void setTotalWeight() {
		Metodos.write("totalweight", "2000");
	}
	
	public void setListPrice() {
		Metodos.write("listprice", "50000");
	}
	
	public void setLicensePlateNumber() {
		Metodos.write("licenseplatenumber", "456-7890");
	}
	
	public void setAnnualMileage() {
		Metodos.write("annualmileage", "60000");
	}
	
	public void setFirstName() {
		Metodos.write("firstname", "Leonardo");
	}
	
	public void setLastName() {
		Metodos.write("lastname", "Souza");
	}
	
	public void setDateOfBirth() {
		Metodos.write("birthdate", "10/05/1990");
	}
	
	public void setStreetAddress() {
		Metodos.write("streetaddress", "4554");
	}
	
	public void setZipCode() {
		Metodos.write("zipcode", "4144");
	}
	
	public void setCity() {
		Metodos.write("city", "São Paulo");
	}
	
	public void setWebsite() {
		Metodos.write("website", "www.google.com");
	}
	
	public void setStartDate() {
		Metodos.write("startdate", "10/30/2021");
	}
	
	public void setEmail() {
		Metodos.write("email", "leandro.tmarinho21@gmail.com");
	}
	
	public void setPhone() {
		Metodos.write("phone", "11949430943");
	}
	
	public void setUsername() {
		Metodos.write("username", "irl123");
	}
	
	public void setPassword() {
		Metodos.write("password", "Lri123456");
	}
	
	public void setConfirmPassword() {
		Metodos.write("confirmpassword", "Lri123456");
	}
	
	public void setComments() {
		Metodos.write("Comments", "Comentario");
	}
	
	/********* Click ************/
	
	public void clickNextEnterInsurantData() {
		Metodos.clickButton("nextenterinsurantdata");
	}
	
	public void clickNextEnterProductData() {
		Metodos.clickButton("nextenterproductdata");
	}
	
	public void clickNextSelectPriceOption() {
		Metodos.clickButton("nextselectpriceoption");
	}
	
	public void clickNextSendQuote() {
		Metodos.clickButton("nextsendquote");
	}
	
	public void clickSendEmail() {
		Metodos.clickButton("sendemail");
	}
	
	public void clickConfirm() {
		Metodos.clickButtonX("//button[@class='confirm']");
	}
	
	public void clickViewQuote() {
		Metodos.clickButton("viewquote");
	}
	
	/********* Upload ************/
	
	public void Upload() {
		Metodos.upload();
	}
	
	/********* Waiting and Loading ************/
	
	public void waitingtoclicknext() {
		Metodos.waitingtoclick("nextsendquote");
	}
	
	public void waitingtoclickconfirm() {
		Metodos.waitingtoclickX("//button[@class='confirm']");
	}	
	
	public void loading() {
		Metodos.waiting("//*[@id=\"LoadingPDF\"]");
	}
	
	/********* Verify text ************/
	
	public void verifyText() {
		Metodos.obteinText("/html/body/div[4]/h2[text()='Sending e-mail success!']");
	}
	
	/********* Ending ************/
	
	public void exitBrowser() {
		Metodos.driver.quit();
	}
		
}



