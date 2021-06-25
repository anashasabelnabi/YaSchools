package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageBase{

	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"userProfile\"]/div[1]/div/div[1]/div[1]/div[2]/h3")
	public WebElement fullNameHeader;
	
	@FindBy(id="ProfileDropdown")
	public WebElement profileDropDown;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[3]/a")
	public WebElement logoutBtn;
	
	public void selectLogoutBtn() {
		clickButton(profileDropDown);
		clickButton(logoutBtn);
	}
	

}
