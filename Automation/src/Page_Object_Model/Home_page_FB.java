package Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page_FB 
{
	
		public WebDriver driver;
		
		public Home_page_FB(WebDriver driver) 
		{
			this.driver = driver;
		}
		
		@FindBy(xpath="//span[@class='_2md']")
		private WebElement FBIconButton_Header;
		
		@FindBy(name="q")
		private WebElement FBProfileSearch_Header;
		
		@FindBy(xpath="//div[@class='_6qfu _5lxt f_click']")
		private WebElement YourPagesDropDownMenu_Header;
		
		@FindBy(xpath="//span[@class='_1vp5 f_click']")
		private WebElement ProfileButton_Header;
		
		@FindBy(xpath="//a[@class='_2s25']")
		private WebElement HomeButton_Header;
		
		@FindBy(xpath="//a[@id='creation_hub_entrypoint']")
		private WebElement CreateButton_Header;
		
		@FindBy(xpath="//div[@id='fbRequestsFlyout']")
		private WebElement FriendRequestButton_Header;
		
		@FindBy(xpath="//span[@id='u_0_5']")
		private WebElement MessagesButton_Header;
		
		@FindBy(xpath="//span[@id='u_0_6']")
		private WebElement NotificationsButton_Header;
		
		@FindBy(xpath="//div[@class='_59fb _tmz f_click']")
		private WebElement QuickHelpButton_Header;


	
	public void FBIconClick() 
	{
		FBIconButton_Header.click();
	
	}
	
	public void FBProfileButtonClick(String search) throws InterruptedException 
	{
		
		FBProfileSearch_Header.sendKeys(search);
		Thread.sleep(4);
		FBProfileSearch_Header.click();
	}
	
	public void YourPagesButton() 
	{
		
		YourPagesDropDownMenu_Header.click();
	}
	
	public void ProfileButton() 
	{
		
		ProfileButton_Header.click();
	}
	
	public void HomeButton() 
	{
		
		HomeButton_Header.click();
	}
	public void CreateButton() 
	{
		
		CreateButton_Header.click();
	}
	public void FriendRequestButton() 
	{
		
		FriendRequestButton_Header.click();
	}
	
	public void MessageButton() 
	{
		
		MessagesButton_Header.click();
	}
	
	public void NotificationButton() 
	{
		
		NotificationsButton_Header.click();
	}
	
	public void QuickHelpButton() 
	{
		
		QuickHelpButton_Header.click();
	}
	
	
	
	
}
	

	

