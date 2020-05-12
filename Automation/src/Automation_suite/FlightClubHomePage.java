package Automation_suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightClubHomePage {
	public WebDriver driver;
	public FlightClubHomePage(WebDriver driver)
		{
			this.driver = driver;
		}
	
		//Top of the page
		@FindBy(how=How.XPATH,using="//*[@id=\"header\"]/div/div/div[2]/div[1]/a/img")WebElement FlightClubLogo;
		@FindBy(how=How.XPATH,using="//div[@class='sc-1vc6951-4 fjGVyT']//input[@class='qsv2zw-0 HYptD']")WebElement SearchBarInput;
		@FindBy(how=How.XPATH,using="//div[@class='sc-1vc6951-4 fjGVyT']//input[@class='qsv2zw-0 HYptD']")WebElement SearchBar1;
		@FindBy(how=How.XPATH,using="//*[@id=\"header\"]/div/div/div[3]/div[1]/div[1]/a")WebElement CurrencyDropDownButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"sign-in-dropdown\"]/span")WebElement Join_SigninButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"header-cart\"]/span")WebElement ShoppingCartButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"header-cart\"]/div/span[1]/span")WebElement PriceButton;
		@FindBy(how=How.XPATH,using="//div[@class='sc-1frxhio-2 jyEwfQ']")WebElement Black_Red13;
		@FindBy(how=How.XPATH,using="//ul[@class='sc-1vc6951-2 jXcjFN']//*[text()='Air Jordans']")WebElement AirJordansButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"nav\"]/li[2]/a")WebElement NikeButton;
		@FindBy(how=How.XPATH,using="//ul[@class='sc-1vc6951-2 jXcjFN']//*[text()='Adidas']")WebElement AdidasButton;
		@FindBy(how=How.XPATH,using="//ul[@class='sc-1vc6951-2 jXcjFN']//*[text()='Yeezy']")WebElement YezzyButton;
		@FindBy(how=How.XPATH,using="//ul[@class='sc-1vc6951-2 jXcjFN']//*[text()=\"More Sneakers\"]")WebElement MoreSneakersButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"nav\"]/li[6]/a")WebElement ApparelButton;
		@FindBy(how=How.XPATH,using="//ul[@class='sc-1vc6951-2 jXcjFN']//*[text()=\"New Releases\"]")WebElement NewReleasesButton;
		@FindBy(how=How.XPATH,using="//ul[@class='sc-1vc6951-2 jXcjFN']//*[text()=\"Price Drops\"]")WebElement PriceDropsButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"nosto-section-homepage-recommendations\"]/div[3]/button")WebElement ShowMoreButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"entire-page-wrap\"]/div[4]/div/div/div[7]/div/div[2]/div[1]/div/a/img")WebElement LosAngelesImage;
		@FindBy(how=How.XPATH,using="//*[@id=\"entire-page-wrap\"]/div[4]/div/div/div[7]/div/div[2]/div[1]/div/a/img")WebElement MiamiImage;
		@FindBy(how=How.XPATH,using="//*[@id=\"entire-page-wrap\"]/div[4]/div/div/div[7]/div/div[2]/div[3]/div/a/img")WebElement NewYorkImage;
		@FindBy(how=How.XPATH,using="//*[@id=\"newsletter-footer\"]")WebElement EnterYourEmailInputField;
		@FindBy(how=How.XPATH,using="//*[@id=\"signup-newsletter-footer\"]")WebElement SignUpButton;
		//Customer Service Bottom of the page
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[1]/div/ul[1]/li[1]/a")WebElement TrackYourOrderButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[1]/div/ul[1]/li[2]/a")WebElement FQAButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[1]/div/ul[1]/li[3]/a")WebElement Delivery_ReturnButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[1]/div/ul[1]/li[4]")WebElement PaymentMethodButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[1]/div/ul[1]/li[5]/a")WebElement TermsOFUseButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[1]/div/ul[1]/li[6]/a")WebElement PrivacyPolicyButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[1]/div/ul[1]/li[7]/a")WebElement ContactUsButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"privacy-settings\"]")WebElement PrivacySettingsButton;
		//About Flight Club at bottom of the page
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[2]/div/ul/li[1]/a")WebElement OurHistoryButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[2]/div/ul/li[2]/a")WebElement ConsignmentButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[2]/div/ul/li[3]/a")WebElement OurStoreButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[2]/div/ul/li[4]/a")WebElement MediaRetionsButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[2]/div/ul/li[5]/a")WebElement JobsButton;
		//Top Categories at the bottom of the page
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[3]/div/ul/li[1]/a")WebElement NewArrivalsButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[3]/div/ul/li[2]/a")WebElement AirJordansButton2;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[3]/div/ul/li[3]/a")WebElement NikeBasketballButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[3]/div/ul/li[4]/a")WebElement NikeRunningButton;
		@FindBy(how=How.XPATH,using="//*[@id=\"footer\"]/div/div[3]/div/ul/li[5]/a")WebElement NewBalanceButton;


		public void FlightClubLogo()
		{
			FlightClubLogo.click();
		}
		
		public void SearchBar(String SBInput) 
		{
			SearchBarInput.sendKeys(SBInput);
		}
		
		public void ClickSearchBar() 
		{
			SearchBar1.submit();
		}
		
		public void BlackRed13s()
		{
			Black_Red13.click();
		}
		
		public void CurrencyDropDown() 
		{
			CurrencyDropDownButton.click();
		}
		public void Join_Signin()
		{
			Join_SigninButton.click();
		}
		
		public void ShoppingCart() 
		{
			ShoppingCartButton.click();
		}
		public void Price() 
		{
			PriceButton.click();
		}
		public void AirJordans()
		{
			AirJordansButton.click();
		}
		public void NikeButton()
		{
			NikeButton.click();
		}
		public void Adidas() 
		{
			AdidasButton.click();
		}
		public void Yezzy()
		{
			YezzyButton.click();
		}
		public void MoreSneakers() 
		{
			MoreSneakersButton.click();
		}
		public void Apparel() 
		{
			ApparelButton.click();
		}
		public void NewReleases()
		{
			NewReleasesButton.click();
		}
		public void PriceDrops()
		{
			PriceDropsButton.click();
		}
		public void ShowMore() 
		{
			ShowMoreButton.click();
		}
		public void LosAngelesImage()
		{
			LosAngelesImage.click();
		}
		public void MiamiImage() 
		{
			MiamiImage.click();
		}
		public void NewYorkImage() 
		{
			NewYorkImage.click();
		}
		public void EnterYourEmailInputField(String emial) 
		{
			EnterYourEmailInputField.sendKeys("email");
		}
		public void SignUpButton() 
		{
			SignUpButton.click();
		}
		public void TrackYourOrderButton() 
		{
			TrackYourOrderButton.click();
		}
		public void FQAButton()
		{
			FQAButton.click();
		}
		public void Delivery_ReturnButton()
		{
			Delivery_ReturnButton.click();
		}
		public void PaymentMethodButton() 
		{
			PaymentMethodButton.click();
		}
		public void TermsOFUseButton()
		{
			TermsOFUseButton.click();
		}
		public void PrivacyPolicyButton() 
		{
			PrivacyPolicyButton.click();
		}
		public void ContactUsButton()
		{
			ContactUsButton.click();
		}
		public void PrivacySettingsButton() 
		{
			PrivacySettingsButton.click();
		}
		public void OurHistoryButton()
		{
			OurHistoryButton.click();
		}
		public void ConsignmentButton()
		{
			ConsignmentButton.click();
		}
		public void OurStoreButton() 
		{
			OurStoreButton.click();
		}
		public void MediaRetionsButton()
		{
			MediaRetionsButton.click();
		}
		public void JobsButton() 
		{
			JobsButton.click();
		}
		public void NewArrivalsButton()
		{
			NewArrivalsButton.click();
		}
		public void AirJordansButton2()
		{
			AirJordansButton2.click();
		}
		public void NikeBasketballButton() 
		{
			NikeBasketballButton.click();
		}
		public void NikeRunningButton() 
		{
			NikeRunningButton.click();
		}
		public void NewBalanceButton() 
		{
			NewBalanceButton.click();
		}
}
