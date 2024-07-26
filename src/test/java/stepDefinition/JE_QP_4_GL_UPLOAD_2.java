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

public class JE_QP_4_GL_UPLOAD_2 {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check GL UPLOAD2 User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check GL UPLOAD2 User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check GL UPLOAD2")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No Alert message is displayed");
		}
	}

	@And("close the GL UPLOAD2 Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@And("Click menu button in homepage in GL UPLOAD2")
	public void click_menu_button_in_homepage_in_gl_upload2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span"));
		ele.click();
	}

	@Then("Click View trips2 button in GL UPLOAD2")
	public void click_view_trips2_button_in_gl_upload2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[1]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[1]/a/span"));
		ele1.click();
	}

	@And("Select valid from date in View trips2")
	public void select_valid_from_date_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate1"));
		ele.click();
		// Month Click
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/thead/tr[2]/th[2]"));
		ele1.click();
		// Year click
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]")));
		ele2 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/thead/tr[2]/th[2]"));
		ele2.click();
		// 2021 click
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[3]")));
		ele3 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[3]/table/tbody/tr/td/span[3]"));
		ele3.click();
		// Jan click
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]")));
		ele4 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[2]/table/tbody/tr/td/span[1]"));
		ele4.click();
		// Date click
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]")));
		ele5 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]"));
		ele5.click();

	}

	@Then("Select jet edge option in company dropdown in View trips2")
	public void select_jet_edge_option_in_company_dropdown_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Jet Edge");
	}

	@And("Click search button in View trips2")
	public void click_search_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSearch")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSearch"));
		ele.click();
	}

	@Then("Select Jet select option in company dropdown in View trips2")
	public void select_jet_select_option_in_company_dropdown_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Jet Select");
	}

	@Then("Select Off Fleet option in company dropdown in View trips2")
	public void select_off_fleet_option_in_company_dropdown_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Off-Fleet");
	}

	@Then("Select Jet Edge &  Jet select  option in company dropdown in View trips2")
	public void select_jet_edge_jet_select_option_in_company_dropdown_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Jet Edge & Jet Select");
	}

	@Then("Select All option in company dropdown in View trips2")
	public void select_all_option_in_company_dropdown_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("ALL");
	}

	@And("Select Yes option in multi tail option in View trips2")
	public void select_yes_option_in_multi_tail_option_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlMultFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlMultFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Yes");
	}

	@And("Select No option in multi tail option in View trips2")
	public void select_no_option_in_multi_tail_option_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlMultFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlMultFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("No");
	}

	@And("Select All option in multi tail option")
	public void select_all_option_in_multi_tail_option() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlMultFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlMultFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("All");
	}

	@Then("Select Yes option in Show POS option")
	public void select_yes_option_in_show_pos_option() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlmatchStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlmatchStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Yes");
	}

	@Then("Select No option in Show POS option")
	public void select_no_option_in_show_pos_option() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlmatchStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlmatchStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("No");
	}

	@Then("Select All option in Show POS option")
	public void select_all_option_in_show_pos_option() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlmatchStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlmatchStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("All");
	}

	@And("Select All option in GP Invoice Status option")
	public void select_all_option_in_gp_invoice_status_option() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("All");
	}

	@And("Select GP Uploaded option in GP Invoice Status option")
	public void select_gp_uploaded_option_in_gp_invoice_status_option() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("GP Uploaded");
	}

	@And("Select GP Pending option in GP Invoice Status option")
	public void select_gp_pending_option_in_gp_invoice_status_option() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("GP Pending");
	}

	@Then("Enter valid trip number in View trips2")
	public void enter_valid_trip_number_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTrip")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTrip"));
		ele.sendKeys("48494");
	}

	@Then("Click edit button in View trips2")
	public void click_edit_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvTripDetails_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvTripDetails_lnkEdit_0\"]/span"));
		ele.click();
	}

	@And("Click back button in View trips2")
	public void click_back_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTrip")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTrip"));
		ele.click();
	}

	@And("Click Add line item button in View trips2")
	public void click_add_line_item_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddLineItem")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddLineItem"));
		ele.click();
	}

	@Then("Click close button in Add line item button in View trips2")
	public void click_close_button_in_add_line_item_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnLineClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnLineClose"));
		ele.click();
	}

	@Then("Click save button in Add line item button in View trips2")
	public void click_save_button_in_add_line_item_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid GL Code in Add Line Item")
	public void enter_valid_gl_code_in_add_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNGLCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNGLCode"));
		ele.sendKeys("TEST");
	}

	@And("Enter valid Line number in Add Line Item")
	public void enter_valid_line_number_in_add_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNLine")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNLine"));
		ele.sendKeys("5");
	}

	@Then("Enter valid Item Code in Add Line Item")
	public void enter_valid_item_code_in_add_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNItemCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNItemCode"));
		ele.sendKeys("TEST");
	}

	@And("Enter valid Item Description in Add Line Item")
	public void enter_valid_item_description_in_add_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNItemDescrition")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNItemDescrition"));
		ele.sendKeys("TEST");
	}

	@Then("Enter valid GP Item Code in Add Line Item")
	public void enter_valid_gp_item_code_in_add_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNGPItemCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNGPItemCode"));
		ele.sendKeys("TEST");
	}

	@And("Enter valid GP Item Description in Add Line Item")
	public void enter_valid_gp_item_description_in_add_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNGPItemDescription")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNGPItemDescription"));
		ele.sendKeys("TEST");
	}

	@Then("Enter valid Amount in Add Line Item")
	public void enter_valid_amount_in_add_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNAmount")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNAmount"));
		ele.sendKeys("1000");
	}

	@And("Click edit line item button in View trips2")
	public void click_edit_line_item_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvSalesLineItem_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvSalesLineItem_lnkEdit_0\"]/span"));
		ele.click();
	}

	@Then("Enter valid notes details in edit line item button in View trips2")
	public void enter_valid_notes_details_in_edit_line_item_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ttPENotes")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ttPENotes"));
		ele.sendKeys("TEST");
	}

	@And("Enter valid revised amount in edit line item button in View trips2")
	public void enter_valid_revised_amount_in_edit_line_item_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvEdit_txtAmount_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvEdit_txtAmount_0"));
		ele.sendKeys("24496.6");
	}

	@And("Click edit button in customer name in View trips2")
	public void click_edit_button_in_customer_name_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_lnkEditCust\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_lnkEditCust\"]/span"));
		ele.click();
	}

	@Then("Click close button in customer name in View trips2")
	public void click_close_button_in_customer_name_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCustClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnCustClose"));
		ele.click();
	}

	@And("Modify the details in customer name in View trips2")
	public void modify_the_details_in_customer_name_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtQuoteNo")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtQuoteNo"));
		String text = ele.getAttribute("value");
		ele.clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtQuoteNo")));
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtQuoteNo"));
		ele1.sendKeys(text);
	}

	@Then("Click save button in customer name in View trips2")
	public void click_save_button_in_customer_name_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCustUpdate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnCustUpdate"));
		ele.click();
	}

	@And("Click view flight log button in View trips2")
	public void click_view_flight_log_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnViewLog")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnViewLog"));
		ele.click();
	}

	@Then("Click close button in Flight Log Details in View trips2")
	public void click_close_button_in_flight_log_details_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnHisClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnHisClose"));
		ele.click();
	}

	@And("Click verify button in View trips2")
	public void click_verify_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnVerify")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnVerify"));
		ele.click();
	}

	@Then("Click close button in Approve the Invoices in View trips2")
	public void click_close_button_in_approve_the_invoices_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnVClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnVClose"));
		ele.click();
	}

	@Then("Click no radio button in View trips2")
	public void click_no_radio_button_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblVStatus_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblVStatus_1"));
		ele.click();
	}

	@And("Enter valid notes in Approve the Invoices in View trips2")
	public void enter_valid_notes_in_approve_the_invoices_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtVNotes")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtVNotes"));
		ele.sendKeys("TEST");
	}

	@Then("Click submit button in Approve the Invoices in View trips2")
	public void click_submit_button_in_approve_the_invoices_in_view_trips2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnPVSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnPVSave"));
		ele.click();
	}

	@Then("Click Global Config Setup button in GL UPLOAD2")
	public void click_global_config_setup_button_in_gl_upload2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[2]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[2]/a/span"));
		ele1.click();
	}

	@And("Select valid date in choose date in Global Config Setup")
	public void select_valid_date_in_choose_date_in_global_config_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnPVSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnPVSave"));
		String text = ele.getAttribute("value");
		System.out.println("Date in the tab : " + text);
	}

	@Then("Click total hour by leg radio button in Global Config Setup")
	public void click_total_hour_by_leg_radio_button_in_global_config_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSetupBy_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblSetupBy_1"));
		ele.click();
	}

	@And("Click Flight Hour radio button in Global Config Setup")
	public void click_flight_hour_radio_button_in_global_config_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSpltHour_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblSpltHour_0"));
		ele.click();
	}

	@Then("Click update button in Global Config Setup")
	public void click_update_button_in_global_config_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
	}

	@And("Click Live hour by leg radio button in Global Config Setup")
	public void click_live_hour_by_leg_radio_button_in_global_config_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSetupBy_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblSetupBy_0"));
		ele.click();
	}

	@Then("Click Block Hour radio button in Global Config Setup")
	public void click_block_hour_radio_button_in_global_config_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSpltHour_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblSpltHour_1"));
		ele.click();
	}
}
