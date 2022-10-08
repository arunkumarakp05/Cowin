package com.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.property.ConfigurationHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\CoWinFeature\\Cowin.feature",
glue = "com.StepDefinition", monochrome = true , plugin = "pretty" )
public class Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws IOException {
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver = BaseClass.browserLaunch(browser);
		

	}
	@AfterClass
	public static void tearDown() {
		BaseClass.close();
		

	}

}
