
package com.bit.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shared {
	
	ChromeDriver dr;
	public Shared(ChromeDriver dr) {
		this.dr = dr;
	}
	
	public Shared() {
		
	}
	
	public void verifyTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
		boolean result = actualTitle.equals(expectedTitle);
		
		if(result) {
			System.out.println("HomePage Title matched .....");
		}else {
			System.out.println("HomePage title did not match : " + actualTitle);
		}
	}
	
	public void clickOnAnyemenet(WebElement ele) {
		ele.click();
	}
	
	public void typeOnAnyElement(WebElement ele, String value) {
		
		ele.sendKeys(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
