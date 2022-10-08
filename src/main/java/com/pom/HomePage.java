package com.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	
	@FindBy (xpath = "//span[text()='Select Your State']")
	private WebElement state;
	
	public HomePage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getState() {
		return state;
	}
	@FindBy(xpath = "//span[normalize-space()='Tamil Nadu']")
	private WebElement selectState;
	
	public WebElement getSelectState() {
		return selectState;
	}
	@FindBy(xpath = "//span[text()='Select District']")
	private WebElement district;
	
	public WebElement getDistrict() {
		return district;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Chennai']")
	private WebElement chennai;
	
	public WebElement getChennai() {
		return chennai ;
	}
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath = "//label[text()='18+']")
	private WebElement age;
	
	public WebElement getAge() {
		return age;
	}
	@FindBy(xpath = "//span[text()='18+']")
	private WebElement checkage;
	
	public WebElement getCheckAge() {
		return checkage;
	}
	
	@FindBy(xpath = "//label[text()='Dose 2']")
	private WebElement dose;
	
	public WebElement getDose() {
		return dose;
	}
	@FindBy(xpath = "//span[text()='2']")
	private WebElement checkdose;
	
	public WebElement getCheckDose() {
		return checkdose;
	}
	@FindBy(xpath = "//label[text()='Paid']")
	private WebElement paid;
	
	public WebElement getPaid() {
		return paid ;
	}
	@FindBy(xpath = "//span[text()='Paid']")
	private WebElement checkpaid;
	
	public WebElement getCheckPaid() {
		return checkpaid ;
	}
	@FindBy(xpath = "//label[text()='Covishield']")
	private WebElement vaccine;
	
	public WebElement getVaccine() {
		return vaccine;
	}
	@FindBy(xpath = "//span[text()='COVISHIELD']")
	private WebElement checkvaccine;
	
	public WebElement getCheckVaccine() {
		return checkvaccine;
	}
	@FindBy(xpath ="//div[contains(@class,'cvc-list')]/child::div/child::div/h5")
	private List<WebElement> hospitalnames;
	
	public List<WebElement> getHspitalNames() {
		return hospitalnames;
	}
	
	
	@FindBy(xpath = "//div[contains(@class,'cvc-list')]")
	private List<WebElement> hospitallist;
	
	public List<WebElement> getHospitalList() {
		return hospitallist;
	}
//	@FindBy(xpath = "(//div[contains(@class,'cvc-list')]/child::div/child::div/h5)["+value+"]")
//	private WebElement hospitalname;
//	
//	public WebElement getHospitalName() {
//		return hospitalname;
//	}
}
	
