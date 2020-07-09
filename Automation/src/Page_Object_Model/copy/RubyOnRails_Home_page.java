package Page_Object_Model.copy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/*  This class is our page objects dedicated to the home page, this file contains our web elements stored in variables
     which are the action events or clicks within a web page, and this class also provides us with methods that we can
     call over in our test scripts file, these methods specifically pertains to the page under test.  This class begins
     with a constructor that initiates our driver allowing driver to be established and used in our test scripts.
     this file does a lot of the setup and preparation for our test scripts and also allows us to maintain our code.
     of a developer changes any elements or tags in the document object model and previous working test scripts begin
     to fail, we can make the corrections in this class file and the corrections will work throughout the test suit*/

public class RubyOnRails_Home_page 
{
	
		public WebDriver driver;
		
		public RubyOnRails_Home_page(WebDriver driver) 
		{
			this.driver = driver;
		}
	///////////////////Navigation Bar Links///////////////////////////////////////////////////////////	
		@FindBy(xpath="//a[@class='text-gray-dark']")
		private WebElement RubyOnRailsLink;
		
		@FindBy(xpath="//img[@class='TableObject-item avatar flex-shrink-0']")
		private WebElement RubyOnRailsImage;
		
		@FindBy(xpath="//h1[@class='text-gray-dark lh-condensed mb-1 mb-md-2']")
		private WebElement RubyOnRailsH1HeaderText;
		
		@FindBy(xpath="//a[@class='UnderlineNav-item selected']")
		private WebElement Ruby_RepositoryLink;
		
		@FindBy(xpath="//a[@href='/orgs/rails/packages']")
		private WebElement Ruby_PackageLink;
		
		@FindBy(xpath="//a[@class='UnderlineNav-item '][@href=\"/orgs/rails/people\"]")
		private WebElement Ruby_PeopleLink;
		
		@FindBy(xpath="//a[@class='UnderlineNav-item '][@href=\"/orgs/rails/projects\"]")
		private WebElement Ruby_ProjectsLink;
	///////////////////Pinned Repository Links///////////////////////////////////////////////////////////
		
		
		@FindBy(xpath="//a[@class='btn btn-primary']")
		private WebElement Ruby_SignUp_Btn;
		
		@FindBy(xpath="//span[@class='repo'][@title='rails']")
		private WebElement Ruby_RailsLink;
		
		@FindBy(xpath="//span[@class='repo'][@title='jbuilder']")
		private WebElement Ruby_jbuilderLink;
		
		@FindBy(xpath="//span[@class='repo'][@title='spring']")
		private WebElement Ruby_springLink;
		
		@FindBy(xpath="//span[@class='repo'][@title='sprockets']")
		private WebElement Ruby_sprocketLink;
		
		@FindBy(xpath="//span[@class='repo'][@title='webpacker']")
		private WebElement Ruby_webpackerLink;
		
		@FindBy(xpath="//span[@class='repo'][@title='homepage']")
		private WebElement Ruby_homepageLink;
		////////////////////////Find a repository search bar//////////////////////////////////////////////
		
		@FindBy(xpath="//input[@id='your-repos-filter']")
		private WebElement Ruby_Find_a_repository_inputField;
		
		///////////////////Home Page Links////////////////////////////////////////////////////////////////
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails\"]")
		private WebElement rails_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-controller-testing\"]")
		private WebElement rails_controller_testing_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/webpacker\"]")
		private WebElement webpacker_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/sprockets\"]")
		private WebElement sprockets_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/homepage\"]")
		private WebElement homepage_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-contributors\"]")
		private WebElement rails_contributors_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/globalid\"]")
		private WebElement globalid_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/activeresource\"]")
		private WebElement acticeresource_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/weblog\"]")
		private WebElement weblog_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-dom-testing\"]")
		private WebElement rails_dom_testing_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/activerecord-session_store\"]")
		private WebElement activerecord_session_store_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-perftest\"]")
		private WebElement rails_perftest_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-master-hook\"]")
		private WebElement rails_master_hook_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/record_tag_helper\"]")
		private WebElement record_tage_helper_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/spring\"]")
		private WebElement spring_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/web-console\"]")
		private WebElement web_console_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/jbuilder\"]")
		private WebElement jbuilder_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/actionpack-page_caching\"]")
		private WebElement actionpack_pack_caching_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-docs-server\"]")
		private WebElement rails_docs_server_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/sprockets-rails\"]")
		private WebElement sprockets_rails_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-probot\"]")
		private WebElement rails_probot_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/buildkite-config\"]")
		private WebElement buildkite_config_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/jquery-rails\"]")
		private WebElement jquery_rails_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-dev-box\"]")
		private WebElement rails_dev_box_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/execjs\"]")
		private WebElement excecjs_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/rails-html-sanitizer\"]")
		private WebElement rails_html_sanitizer_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/discourse-rubyonrails-theme\"]")
		private WebElement discourse_rubyonrails_theme_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/jquery-ujs\"]")
		private WebElement jquery_ujs_Link;
		
		@FindBy(xpath="//a[@class='d-inline-block'][@href=\"/rails/pjax_rails\"]")
		private WebElement pjax_rails_Link;
		
		
		
		/////////////////Top Languages /////////////////////////////////////////////////////////////
		
		@FindBy(xpath="//div[@class='Box-body']//span[@itemprop='programmingLanguage'][text()='Ruby']")
		private WebElement TopLanguages_Ruby;
		
		@FindBy(xpath="//div[@class='Box-body']//span[@itemprop='programmingLanguage'][text()='JavaScript']")
		private WebElement TopLanguages_JavaScript;
		
		@FindBy(xpath="//div[@class='Box-body']//span[@itemprop='programmingLanguage'][text()='HTML']")
		private WebElement TopLanguages_HTML;
		
		@FindBy(xpath="//div[@class='Box-body']//span[@itemprop='programmingLanguage'][text()='Python']")
		private WebElement TopLanguages_Python;
		
		@FindBy(xpath="//div[@class='Box-body']//span[@itemprop='programmingLanguage'][text()='CSS']")
		private WebElement TopLanguages_CSS;
		
//////////////////// < Previous    Next > Buttons/////////////////////////////////////////////////
		
		
		@FindBy(xpath="//div[@class='pagination'][@aria-label='Pagination']//span[@class='previous_page disabled'][text()='Previous']")
		private WebElement Previous_Button;
		
		@FindBy(xpath="//a[@href=\"/rails?page=2\"][text()='Next']")
		private WebElement Next_Button;
		
		
		////////////////////////////////Footer Links///////////////////////////////////////////////////////////
		

	

	
	public void Click_RubyOnRailsLink() 
	{
		RubyOnRailsLink.click();
	
	}
	
	
	public void Verify_RubyOnRailsImage() 
	{
		
		RubyOnRailsImage.getText();
	}
	
	
	public void RubyOnRailsH1HeaderText() 
	{
		
		RubyOnRailsH1HeaderText.getText();
	}
	
	
	public void Ruby_RepositoryLink() 
	{
		
		Ruby_RepositoryLink.click();
	}
	
	
	public void Ruby_PackageLink() 
	{
		
		Ruby_PackageLink.click();
	}
	
	
	public void Ruby_PeopleLink() 
	{
		
		Ruby_PeopleLink.click();
	}
	
	public void Ruby_ProjectsLink() 
	{
		
		Ruby_ProjectsLink.click();
	}
	
	
	public void Ruby_Find_a_repository_inputField(String search_input) 
	{
		
		Ruby_Find_a_repository_inputField.sendKeys(search_input);
	}
	
	
	public void TopLanguages_Ruby() 
	{
		
		TopLanguages_Ruby.click();
	}
	
	
	public void Next_Button() 
	{
		
		Next_Button.click();
	}
	
	
	
	
}
	

	

