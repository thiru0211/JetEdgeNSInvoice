package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE_QP_2_NSUpload {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check NSUpload User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check NSUpload User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check NSUpload")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert message is displayed");
		}
	}


	@And("close the NSUpload Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@And("Click menu button in homepage")
	public void Click_menu_button_in_homepage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span"));
		ele.click();
	}

	@Then("Click Verify Trips button in NSUpload")
	public void Click_Verify_Trips_button_in_NSUpload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/div/ul/li[5]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/div/ul/li[5]/a/span"));
		ele1.click();
	}

	@And("Select from date is greater in verify trips")
	public void select_from_date_is_greater_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate1"));
		ele.click();
		//Month click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]"));
		ele1.click();
		//year click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]")));
		ele2 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]"));
		ele2.click();
		//2024 click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[6]")));
		ele3 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[6]"));
		ele3.click();
		//Jan click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]")));
		ele4 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]"));
		ele4.click();
		// Date Click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]")));
		ele5 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]"));
		ele5.click();
	}


	@Then("Select to date is smaller in verify trips")
	public void select_to_date_is_smaller_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate1"));
		ele.click();
		//Month click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]"));
		ele1.click();
		//year click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]")));
		ele2 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]"));
		ele2.click();
		//2023 click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[5]")));
		ele3 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[5]"));
		ele3.click();
		//Jan click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]")));
		ele4 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]"));
		ele4.click();
		// Date Click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]")));
		ele5 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]"));
		ele5.click();
	}



	@And("Click search button in verify trips")
	public void click_search_button_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSearch")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSearch"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert messgae displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed after click search button");
		}
	}

	@Then("Select valid from date in verify trips")
	public void select_valid_from_date_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate1"));
		ele.click();
		//Month click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]"));
		ele1.click();
		//year click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]")));
		ele2 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]"));
		ele2.click();
		//2023 click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[5]")));
		ele3 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[5]"));
		ele3.click();
		//Jan click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]")));
		ele4 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]"));
		ele4.click();
		// Date Click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]")));
		ele5 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]"));
		ele5.click();
	}

	@Then("Select valid to date in verify trips")
	public void select_valid_to_date_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate1"));
		ele.click();
		//Month click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]"));
		ele1.click();
		//year click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]")));
		ele2 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]"));
		ele2.click();
		//2024 click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[6]")));
		ele3 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[6]"));
		ele3.click();
		//Jun click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[6]")));
		ele4 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[6]"));
		ele4.click();
		// Date Click
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]")));
		ele5 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]"));
		ele5.click();
	}

	@And("Select valid company name in verify trips")
	public void select_valid_company_name_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Select valid multi tail in verify trips")
	public void select_valid_multi_tail_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlMultFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlMultFlag"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@And("Select valid  Segment Tax Check in verify trips")
	public void select_valid_segment_tax_check_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlmatchStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlmatchStatus"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Select valid Trip Purpose in verify trips")
	public void select_valid_trip_purpose_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlTripPurpose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlTripPurpose"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@And("Select valid  NS Status in verify trips")
	public void select_valid_ns_status_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Enter valid trip number in verify trips")
	public void enter_valid_trip_number_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTrip")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTrip"));
		ele.sendKeys("55459");
	}

	@Then("Click export button in verify trips")
	public void click_export_button_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnExport")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnExport"));
		ele.click();
	}

	@Then("Select sort by trip in verify trips")
	public void select_sort_by_trip_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@And("Select ascending option in verify trips")
	public void select_ascending_option_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlascdesc")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlascdesc"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Click go button in verify trips")
	public void click_go_button_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button12")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Button12"));
		ele.click();
	}

	@And("Select descending option in verify trips")
	public void select_descending_option_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlascdesc")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlascdesc"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select sort by from date in verify trips")
	public void select_sort_by_from_date_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select sort by to date in verify trips")
	public void select_sort_by_to_date_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}

	@Then("Select sort by Cutomer ID in verify trips")
	public void select_sort_by_Cutomer_ID_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(3);
	}

	@Then("Select sort by Cutomer Name in verify trips")
	public void select_sort_by_Cutomer_Name_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(4);
	}

	@Then("Select sort by Company in verify trips")
	public void select_sort_by_Company_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(5);
	}

	@Then("Select sort by Sales Person in verify trips")
	public void select_sort_by_Sales_Person_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(6);
	}

	@Then("Select sort by Contact in verify trips")
	public void select_sort_by_Contact_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(7);
	}

	@Then("Select sort by NS Status in verify trips")
	public void select_sort_by_NS_Status_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(8);
	}

	@Then("Select sort by Amount in verify trips")
	public void select_sort_by_Amount_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlSortBy")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(9);
	}

	@Then("Click edit button in verify trips")
	public void click_edit_button_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[15]/a/span")));
		ele = driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[15]/a/span"));
		ele.click();
	}
	@And("Clear quote number in verify trips")
	public void clear_quote_number_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtQuoteNo")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtQuoteNo"));
		ele.clear();
	}
	@Then("Clear Customer ID in verify trips")
	public void clear_customer_id_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCustomerID")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtCustomerID"));
		ele.clear();
	}
	@And("Clear Customer Name in verify trips")
	public void clear_customer_name_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCustomerName")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtCustomerName"));
		ele.clear();
	}
	@Then("Click update button in verify trips")
	public void click_update_button_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCustUpdate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnCustUpdate"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed Like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Is Displayed");
		}
	}

	@And("Modify quote number in verify trips")
	public void modify_quote_number_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtQuoteNo")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtQuoteNo"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtQuoteNo"));
		ele1.sendKeys(text);

	}
	@Then("Modify Customer ID in verify trips")
	public void modify_customer_id_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCustomerID")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtCustomerID"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtCustomerID"));
		ele1.sendKeys(text);
	}
	@And("Modify Customer Name in verify trips")
	public void modify_customer_name_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCustomerName")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtCustomerName"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtCustomerName"));
		ele1.sendKeys(text);
	}
	@Then("Click edit button in Line Item")
	public void click_edit_button_in_Line_Item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td/div[2]/div/div/table/tbody/tr[2]/td[7]/a/span")));
		ele = driver.findElement(By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr/td/div[2]/div/div/table/tbody/tr[2]/td[7]/a/span"));
		ele.click();
	}

	@Then("Click close button in Line Item")
	public void click_close_button_in_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnEditClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnEditClose"));
		ele.click();
	}

	@Then("Clear Item Code in Line Item")
	public void clear_item_code_in_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblPItemCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblPItemCode"));
		ele.clear();
	}
	@And("Clear Item Description in Line Item")
	public void clear_item_description_in_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblPItemDesc")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblPItemDesc"));
		ele.clear();
	}
	@Then("Click save button in Line Item")
	public void click_save_button_in_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed Like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Is Displayed");
		}
	}

	@Then("Modify Item Code in Line Item")
	public void modify_item_code_in_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblPItemDesc")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblPItemDesc"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_lblPItemDesc"));
		ele1.sendKeys(text);
	}
	@Then("Modify Item Description in Line Item")
	public void modify_item_description_in_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblPItemDesc")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblPItemDesc"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_lblPItemDesc"));
		ele1.sendKeys(text);
	}
	@Then("Click close button in Success message")
	public void click_close_button_in_success_message() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
		ele.click();
	}

	@And("Click action button in verify trips")
	public void click_action_button_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_RT2\"]/div/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_RT2\"]/div/a"));
		ele.click();
	}

	@And("Click close button in Success message in action")
	public void Click_close_button_in_Success_message_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button5")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Button5"));
		ele.click();
	}

	@And("Click close button in verify trip")
	public void Click_close_button_in_verify_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
		ele.click();
	}

	@Then("Click verify trips in action")
	public void click_verify_trips_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_liVerTrip\"]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_liVerTrip\"]/a/span"));
		ele.click();
	}

	@And("Click no radio button in verify trip")
	public void click_no_radio_button_in_verify_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblVerified_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblVerified_1"));
		if(!ele.isSelected()) {
			System.out.println("Radio button is not selected");
			ele.click();
		}
		else {
			System.out.println("Radio button is already selected");
		}
	}
	@Then("Enter valid notes in verify trip")
	public void enter_valid_notes_in_verify_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtVReason")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtVReason"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtVReason"));
		ele1.sendKeys(text);
	}
	@And("Click submit button inn verify trip")
	public void click_submit_button_inn_verify_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnVerified")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnVerified"));
		ele.click();
	}

	@Then("Click flight log in action")
	public void click_flight_log_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_liViewLog\"]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_liViewLog\"]/a/span"));
		ele.click();
	}
	@And("Click close button in leg details")
	public void click_close_button_in_leg_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnHisClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnHisClose"));
		ele.click();
	}

	@Then("Click Invoiced in GP in action")
	public void click_invoiced_in_gp_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_li1\"]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_li1\"]/a/span"));
		ele.click();
	}
	@And("Click close button in Invoiced in GP")
	public void click_close_button_in_invoiced_in_gp() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Button11")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Button11"));
		ele.click();
	}

	@And("Click close button in Invoiced GP")
	public void click_close_button_in_invoiced_gp() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
		ele.click();
	}

	@And("Click no radio button in Invoiced in GP")
	public void click_no_radio_button_in_invoiced_in_gp() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoinvoicedinGP_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoinvoicedinGP_1"));
		if(!ele.isSelected()) {
			System.out.println("Radio button is not selected");
			ele.click();
		}
		else {
			System.out.println("Radio button is already selected");
		}
	}
	@Then("Enter valid notes in Invoiced in GP")
	public void enter_valid_notes_in_invoiced_in_gp() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtGPNotes")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtGPNotes"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtGPNotes"));
		ele1.sendKeys("Test");
	}
	@And("Click submit button in Invoiced in GP")
	public void click_submit_button_in_invoiced_in_gp() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnGpinv")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnGpinv"));
		ele.click();
	}

	@Then("Click Ignore Trip in action")
	public void click_ignore_trip_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_liIgnore\"]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_liIgnore\"]/a/span"));
		ele.click();
	}
	@And("Click close button in Ignore Trip")
	public void click_close_button_in_ignore_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnIgnoreCancel")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnIgnoreCancel"));
		ele.click();
	}

	@And("Click close button in Ignore Trips")
	public void click_close_button_in_ignore_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
		ele.click();
	}

	@And("Click no radio button in Ignore Trip")
	public void click_no_radio_button_in_ignore_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblIgnore_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblIgnore_1"));
		if(!ele.isSelected()) {
			System.out.println("Radio button is not selected");
			ele.click();
		}
		else {
			System.out.println("Radio button is already selected");
		}
	}
	@Then("Enter valid reson in Ignore Trip")
	public void enter_valid_notes_in_ignore_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtReason")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtReason"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtReason"));
		ele1.sendKeys("Test");
	}
	@And("Click submit button in Ignore Trip")
	public void click_submit_button_in_ignore_trip() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnIgnoreSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnIgnoreSave"));
		ele.click();
	}

	@Then("Click Add Line Item in action")
	public void click_add_line_item_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_liAddItem\"]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_liAddItem\"]/a/span"));
		ele.click();
	}
	@And("Click close button in Add Line Item")
	public void click_close_button_in_add_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnLineClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnLineClose"));
		ele.click();
	}

	@Then("Click close button in Add Line Items")
	public void click_close_button_in_add_line_items() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
		ele.click();
	}

	@And("Click save button in Add Line Item")
	public void click_save_button_in_add_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSaveLine")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSaveLine"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert Message Displayed Like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert Message Is Displayed");
		}
	}

	@And("Click radio button in Add Line Item")
	public void click_radio_button_in_add_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblItemType_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblItemType_1"));
		if(!ele.isSelected()) {
			System.out.println("Radio button is not selected");
			ele.click();
		}
		else {
			System.out.println("Radio button is already selected");
		}
	}
	@Then("Select valid item code in Add Line Item")
	public void select_valid_item_code_in_add_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlNItemCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlNItemCode"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}
	@And("Enter valid amount in Add Line Item")
	public void enter_valid_amount_in_add_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNAmount")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNAmount"));
		ele.sendKeys("200");
	}

	@Then("Click Audit log in action")
	public void click_audit_log_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_liChangeLOg\"]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_liChangeLOg\"]/a/span"));
		ele.click();
	}
	@And("Click close button in Line Item Log Details")
	public void click_close_button_in_line_item_log_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddClose"));
		ele.click();
	}

	@Then("Click view list in action")
	public void click_view_lsit_in_action() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_liBack\"]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_liBack\"]/a/span"));
		ele.click();
	}

	@And("Click back button in verify trips")
	public void click_back_button_in_verify_trips() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnViewQuote")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnViewQuote"));
		ele.click();
	}

	@Then("Click NS Upload button in NSUpload")
	public void click_ns_upload_button_in_ns_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/div/ul/li[4]/a/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/div/ul/li[4]/a/span"));
		ele.click();
	}
	@Then("Select higher from date in Net Suite Upload")
	public void select_higher_from_date_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]")));
		ele2 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[6]")));
		ele3 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[6]"));
		ele3.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[12]")));
		ele4 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[12]"));
		ele4.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]")));
		ele5 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]"));
		ele5.click();
	}

	@Then("Select lower to date in Net Suite Upload")
	public void select_lower_to_date_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]")));
		ele2 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[5]")));
		ele3 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[5]"));
		ele3.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]")));
		ele4 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]"));
		ele4.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]")));
		ele5 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]"));
		ele5.click();
	}
	@Then("Click search button in Net Suite Upload")
	public void click_search_button_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnRun")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnRun"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert message is displayed");
		}
	}

	@And("Enter valid trip number in Net Suite Upload")
	public void enter_valid_trip_number_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripFilter")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripFilter"));
		ele.sendKeys("6432895");
	}

	@And("Select valid NS Status in Net Suite Upload")
	public void select_valid_ns_status_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlStaus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlStaus"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Click view button in trip dropdown")
	public void click_view_button_in_trip_dropdown() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvMonth_adetail_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvMonth_adetail_0"));
		ele.click();
	}

	@And("Click view button in Net Suite Upload")
	public void click_view_button_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvMonth_imbView_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvMonth_imbView_0"));
		ele.click();
	}

	@Then("Click step1 button in Net Suite Upload")
	public void click_step1_button_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_ancPreviewLayout\"]/div/div[1]/div/label[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ancPreviewLayout\"]/div/div[1]/div/label[2]"));
		ele.click();
	}
	@And("Click go to next step button in step1")
	public void click_go_to_next_step_button_in_step1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnStep3ContinueA")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnStep3ContinueA"));
		ele.click();
	}

	@Then("Click step2 button in Net Suite Upload")
	public void click_step2_button_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_ancGPUpload\"]/div/div[1]/div/label[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ancGPUpload\"]/div/div[1]/div/label[2]"));
		ele.click();
	}

	@And("Click go to next step button in step2")
	public void click_go_to_next_step_button_in_step2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnStep4ContinueA")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnStep4ContinueA"));
		ele.click();
	}

	@And("Click yes radio button in step2")
	public void click_yes_radio_button_in_step2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblUpload_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblUpload_1"));
		if(!ele.isSelected()) {
			System.out.println("Radio button is not selected");
			ele.click();
		}
		else {
			System.out.println("Radio button is already selected");
		}
	}
	@Then("Enter valid notes in step2")
	public void enter_valid_notes_in_step2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtAPPNotes")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtAPPNotes"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtAPPNotes"));
		ele1.sendKeys("test");
	}

	@Then("Click step3 button in Net Suite Upload")
	public void click_step3_button_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_ancLockStatus\"]/div/div[1]/div/label[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ancLockStatus\"]/div/div[1]/div/label[2]"));
		ele.click();
	}
	@And("Click yes radio button in step3")
	public void click_yes_radio_button_in_step3() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblLockPerDiem_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblLockPerDiem_1"));
		if(!ele.isSelected()) {
			System.out.println("Radio button is not selected");
			ele.click();
		}
		else {
			System.out.println("Radio button is already selected");
		}
	}
	@Then("Enter valid notes in step3")
	public void enter_valid_notes_in_step3() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtLockedNotes")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtLockedNotes"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtLockedNotes"));
		ele1.sendKeys("test");
	}
	@And("Click unlock batch button in step3")
	public void click_unlock_batch_button_in_step3() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnLocked")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnLocked"));
		ele.click();
	}
	
	@And("Click lock batch button in step3")
	public void click_lock_batch_button_in_step3() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnLocked")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnLocked"));
		ele.click();
	}
	@Then("Click close button in step3")
	public void click_close_button_in_step3() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClose"));
		ele.click();
	}
	
	@Then("Click back button in Net Suite Upload")
	public void click_back_button_in_net_suite_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack1"));
		ele.click();
	}
}