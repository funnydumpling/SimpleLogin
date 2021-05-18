package com.interview.webapp.login;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoOR {
	
	@FindBy(xpath = "*//table//tr[1]//input")
	private WebElement textBoxUsername;
	
	@FindBy(xpath = "*//table//tr[2]//input")
	private WebElement textBoxPassword;
	
	@FindBy(xpath = "*//table//tr[3]//input")
	private WebElement buttonLogin;
		
	@FindBy(tagName = "ul")
	private List<WebElement> listMenuItems ;
	
	DemoOR(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTextBoxUsername() {
		return textBoxUsername;
	}

	public WebElement getTextBoxPassword() {
		return textBoxPassword;
	}

	public WebElement getButtonLogin() {
		return buttonLogin;
	}

	public List<WebElement> getListMenuItems() {
		return listMenuItems;
	}

	public void display()
	{
		for(WebElement w : getListMenuItems())
		{
			System.out.println(w.getText());
		}
	}
	
	//Method to Menu Option on sending String value
	public void selectMenuOption(String menuOption)
	{
		for(WebElement w : getListMenuItems())
		{
			if(w.getText().equals(menuOption))
				w.click();
		}
	}
	
	
	
	
	
	
}
