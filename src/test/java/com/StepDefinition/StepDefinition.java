package com.StepDefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.BaseClass.BaseClass;
import com.pom.HomePage;
import com.property.ConfigurationHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	HomePage hp = new HomePage(driver);
	@Given(": User Enters Cowin Website")
	public void user_enters_cowin_website() throws IOException {
		
		String url = ConfigurationHelper.getInstance().getUrl();
		getUrl(url);
		//getUrl("https://www.cowin.gov.in/");
		implicityWait();	    
	}
	@When(": User Selects the State")
	public void user_selects_the_state() {
		WebElement state = hp.getState();
		jsclick(state);
		WebElement Tn = hp.getSelectState();
		jsclick(Tn);
			
	}
	@When(": User Selects the District")
	public void user_selects_the_district() throws InterruptedException {
	    WebElement district = hp.getDistrict();
	   sleep();
	    jsclick(district);
	    //waitTillVisibility("\\span[text()='Select District']");
	    WebElement ch = hp.getChennai();
	    jsclick(ch);
	}
	@When(": User click on the Search button")
	public void user_click_on_the_search_button() {
	    WebElement search = hp.getSearch();
	    jsclick(search);
	}
	@When(":User Selects the preferable options")
	public void user_selects_the_preferable_options() throws InterruptedException {
	    WebElement age = hp.getAge();
	    sleep();
	    jsclick(age);
	    String a = text(age);
	    WebElement dose = hp.getDose();
	    jsclick(dose);
	    String d = text(dose);
	    WebElement paid = hp.getPaid();
	    jsclick(paid);
	    String p = text(paid);
	    WebElement vaccine = hp.getVaccine();
	    jsclick(vaccine);
	    String v = text(vaccine);
	    WebElement checkAge = hp.getCheckAge();
		WebElement checkDose = hp.getCheckDose();
		WebElement checkPaid = hp.getCheckPaid();
		WebElement checkVaccine = hp.getCheckVaccine();
		String v1 = text(checkVaccine);
		String p1 = text(checkPaid);
		String d1 = text(checkDose);
		String a1 = text(checkAge);
		
		if(a.equals(a1)|| d.contains(d1) || p.equals(p1) || v.equals(v1)) {
			printText("Verification Sucess");
		}
		
		
	    
	}
	@Then(": User Checks the Optins Selected is correct")
	public void user_checks_the_optins_selected_is_correct() {
		WebElement checkAge = hp.getCheckAge();
		
		
		
		
	    
	}
	@Then(": User Checks the List of Hospitals available")
	public void user_checks_the_list_of_hospitals_available() {
	   List<WebElement> hspitalNames = hp.getHspitalNames();
	   for(int i= 1; i<=hspitalNames.size(); i ++ ) {
		   WebElement name = driver.findElement(By.xpath("(//div[contains(@class,'cvc-list')]/child::div/child::div/h5)["+i+"]"));
           String text = text(name);
           printText(text);
	   }
	}

}
