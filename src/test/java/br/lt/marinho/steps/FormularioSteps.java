package br.lt.marinho.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.ltmarinho.page.FormularioPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class FormularioSteps {

	private static WebDriver driver;
	private static FormularioPage m;

	@Given("I access the form")
	public void iAccessTheForm() {
		driver = new ChromeDriver();
		m = new FormularioPage(driver);
		m.acess();
	}

	@And("I fill out the form Enter Vehicle Data")
	public void IFillOutTheFormEnterVehicleData() {
		m.setMake();
		m.setModel();
		m.setCylinderCapacity();
		m.setEnginePerformance();
		m.setDateOfManufacture();
		m.setSeatsCar();
		m.setRightHandDriver();
		m.setSeatsCycle();
		m.setFuelType();
		m.setPayload();
		m.setTotalWeight();
		m.setListPrice();
		m.setLicensePlateNumber();
		m.setAnnualMileage();
		m.clickNextEnterInsurantData();
	}

	@And("I fill out the form Enter Insert data")
	public void iFillOutTheFormEnterInsertData() {
		m.setFirstName();
		m.setLastName();
		m.setDateOfBirth();
		m.setGender();
		m.setStreetAddress();
		m.setCountry();
		m.setZipCode();
		m.setCity();
		m.setOccupation();
		m.setHobbies();
		m.setWebsite();
		m.Upload();
		m.clickNextEnterProductData();
	}

	@And("I fill out the form Enter Product Data")
	public void iFillOutTheFormEnterProductData() {
		m.setStartDate();
		m.setInsuranceSum();
		m.setMeritRating();
		m.setDamageInsurance();
		m.setOptionalProducts();
		m.setCourtesyCar();
		m.clickNextSelectPriceOption();
	}

	@And("I fill out the form Select Price Option")
	public void iFillOutTheFormSelectPriceOption() {
		m.setSelectPriceOption();
		m.waitingtoclicknext();
		m.clickNextSendQuote();
	}

	@And("I fill out the form Send Quote")
	public void iFillOutTheFormSendQuote() {
		m.setEmail();
		m.setPhone();
		m.setUsername();
		m.setPassword();
		m.setConfirmPassword();
		m.setComments();
		m.clickSendEmail();
		m.loading();
	}

	@And("I should see {string}")
	public void iShouldSee(String string) {
		m.waitingtoclickconfirm();
		m.verifyText();
		m.clickConfirm();
	}

	@After
	public void fecharBrowser() {
		m.exitBrowser();
	}
}
