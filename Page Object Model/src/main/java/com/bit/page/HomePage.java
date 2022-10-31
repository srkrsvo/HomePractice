package com.bit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	/*
	 * design pattern
	 * page factory 
	 * LoadableComponent
	 */
	
	ChromeDriver dr;
	Shared shared;
	
	public HomePage(ChromeDriver dr){
		this.dr = dr;
		shared = new Shared(dr);
		PageFactory.initElements(dr, this);
	}
	
	Shared s = new Shared();
	
	
	//Element repository...............................
	String ss = "hi";
	
	@FindBy(id="utilityNav-registries") 
	WebElement registryLink;
	
	@FindBy(id="utilityNav-weeklyAd")
	WebElement weeklyaddLink;
	
	@FindBy(how=How.XPATH, using="serthserthert")
	WebElement ele; //old way of doing things
	
	//End of Element Repository...........................
	
	

	public void verifyHomePageTitle(String expectedTitle) {
		
		shared.verifyTitle(expectedTitle);
		
		
		/*
		 * String actualTitle = dr.getTitle();
		 * boolean result = actualTitle.equals(expectedTitle);
		
		if(result) {
			System.out.println("HomePage Title matched .....");
		}else {
			System.out.println("HomePage title did not match : " + actualTitle);
		}
		*/
	}
	
	public RegistryPage clickRegistryLink() {

		//shared.clickOnAnyemenet(By.id("utilityNav-registries"));
		//dr.findElement(By.id("utilityNav-registries")).click();
		
		shared.clickOnAnyemenet(registryLink);
		return new RegistryPage(dr);
	}

	public WeeklyAdd clickOnWeeklyAddLink() {
		
		shared.clickOnAnyemenet(weeklyaddLink);
		return new WeeklyAdd(dr);
	}
	
	
}
