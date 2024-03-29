package com.inetbanking.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartpagedata {

WebDriver ldriver;
	

	public flipkartpagedata(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath="//*[@name='q']")
	@CacheLookup
	WebElement searchelement;
	
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement phoneimage;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")
	@CacheLookup
	WebElement phonebuy;
	
	public void searchelem(String iphone) {
		
		searchelement.sendKeys(iphone);
		
	}
		public void searchbox() {
		searchelement.sendKeys(Keys.ENTER);
		
	}
		
		
		public void phoneselect() {
			phoneimage.click();
		}
		
		public void phonebuy() {
			phonebuy.click();
		}
}


