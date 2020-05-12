package Automation_suite;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightClubSmokeTest extends FlightClubBaseClass {
		FlightClubHomePage homepage;
		
		@Test(groups={"Regression"}, priority=1)
		public void ValidateSearchBar() throws InterruptedException 
		{
			FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
			//Add explicit wait
			FlightClubTest.SearchBar("Jordan 13");
			Thread.sleep(8);
			FlightClubTest.BlackRed13s();
			String currentTitle=driver.getTitle();
			System.out.println(currentTitle);
			Assert.assertTrue(currentTitle.contains("Sneakers. Here. | Flight Club"));
			//If conditional for validation//
			//Scroll down to the footer and click contact us java_script executer //
			//Mouse hover over button and click//
			//For loop through elements	

		}
		
		@Test(groups={"Regression"},priority=2, dependsOnMethods="ValidateSearchBar")
		public void ValidateAirJordans() throws InterruptedException 
		{
			FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
			Thread.sleep(8);
			FlightClubTest.AirJordans();
			String currentTitle=driver.getTitle();
			System.out.println(currentTitle);
			Assert.assertTrue(currentTitle.contains("Air Jordans | Flight Club"));
			//If conditional for validation//
			//Scroll down to the footer and click contact us java_script executer //
			//Mouse hover over button and click//
			//For loop through elements
			
		}
		
		@Test(groups={"Regression"},priority=3, dependsOnMethods="ValidateAirJordans")
		public void ValidateYeezy() throws InterruptedException 
		{
			FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
			Thread.sleep(5);
			FlightClubTest.Yezzy();
			String currentTitle=driver.getTitle();
			System.out.println(currentTitle);
			Assert.assertTrue(currentTitle.contains("Yeezy - Adidas | Flight Club"));
			//If conditional for validation//
			//Scroll down to the footer and click contact us java_script executer //
			//Mouse hover over button and click//
			//For loop through elements
			
		}
		@Test(groups={"Regression"},priority=4, dependsOnMethods="ValidateYeezy")
		public void ValidateMoreSneakers() throws InterruptedException 
		{
			FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
			Thread.sleep(5);
			FlightClubTest.MoreSneakers();
			String currentTitle=driver.getTitle();
			System.out.println(currentTitle);
			Assert.assertTrue(currentTitle.contains("More Sneakers | Flight Club"));
			//If conditional for validation//
			//Scroll down to the footer and click contact us java_script executer //
			//Mouse hover over button and click//
			//For loop through elements
			
		}
		@Test(groups={"Regression"},priority=5, dependsOnMethods="ValidateMoreSneakers")
		public void ValidateAdidas() throws InterruptedException 
		{
			FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
			FlightClubTest.Adidas();
			String currentTitle=driver.getTitle();
			System.out.println(currentTitle);
			Assert.assertTrue(currentTitle.contains("Adidas | Flight Club"));
			//If conditional for validation//
			//Scroll down to the footer and click contact us java_script executer //
			//Mouse hover over button and click//
			//For loop through elements
			
		}
				
		@Test(groups={"Regression"},priority=7, dependsOnMethods="ValidateAdidas")
		public void ValidateNewReleases() throws InterruptedException 
		{
			FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
			FlightClubTest.NewReleases();
			String currentTitle=driver.getTitle();
			System.out.println(currentTitle);
			Assert.assertTrue(currentTitle.contains("New Releases | Flight Club"));
			//If conditional for validation//
			//Scroll down to the footer and click contact us java_script executer //
			//Mouse hover over button and click//
			//For loop through elements
			
			
			
		}
		
		@Test(groups={"Regression"},priority=8, dependsOnMethods="ValidateNewReleases")
		public void ValidatePriceDrops() throws InterruptedException 
		{
			FlightClubHomePage FlightClubTest = PageFactory.initElements(driver, FlightClubHomePage.class);
			FlightClubTest.PriceDrops();
			String currentTitle=driver.getTitle();
			System.out.println(currentTitle);
			Assert.assertTrue(currentTitle.contains("Price Drops | Flight Club"));
			//If conditional for validation//
			//Scroll down to the footer and click contact us java_script executer //
			//Mouse hover over button and click//
			//For loop through elements
				
			
		}

		
		
		
		
		
		}


