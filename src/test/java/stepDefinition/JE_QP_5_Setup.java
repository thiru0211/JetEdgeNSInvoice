package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class JE_QP_5_Setup {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check Setup User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Setup User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");
	}

	@And("click the Signin button To Check Setup")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.print("\u001B[1mlogin button clicked\u001B[0m");
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("close the Setup Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");
	}

	@Then("Click menu button in homepage in Setup")
	public void click_menu_button_in_homepage_in_gl_upload2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span"));
		ele.click();
	}

	@And("Click Fuel Surcharge Setup button in Setup")
	public void click_view_trips2_button_in_gl_upload2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[1]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[1]/a/span"));
		ele1.click();
	}

	@Then("Click add new button in Fuel Surcharge Setup")
	public void click_add_new_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddnew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddnew"));
		ele.click();
	}

	@And("Click back button in Fuel Surcharge Setup")
	public void click_back_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click save button in Fuel Surcharge Setup")
	public void click_save_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("Enter valid trip purpose {string} in Fuel Surcharge Setup")
	public void enter_valid_trip_purpose_in_fuel_surcharge_setup(String TripName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripPorpose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripPorpose"));
		ele.sendKeys(TripName);
	}

	@Then("Click Quoted live hour radio button in Fuel Surcharge Setup")
	public void click_quoted_live_hour_radio_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoBillingType_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoBillingType_1"));
		ele.click();
	}

	@And("Click Trip end date radio button in Fuel Surcharge Setup")
	public void click_trip_end_date_radio_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoDateby_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoDateby_1"));
		ele.click();
	}

	@Then("Enter valid start date in Fuel Surcharge Setup")
	public void enter_valid_start_date_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtStartDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtStartDate"));
		ele.click();
		// Select date
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[1]"));
		ele1.click();
	}

	@And("Enter valid end date in Fuel Surcharge Setup")
	public void enter_valid_end_date_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEndDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtEndDate"));
		ele.click();
		// Select date
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]"));
		ele1.click();
	}

	@Then("Enter valid unit price in Fuel Surcharge Setup")
	public void enter_valid_unit_price_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtUnitPrice")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtUnitPrice"));
		ele.sendKeys("1000");
	}

	@And("Click clear button in Fuel Surcharge Setup")
	public void click_clear_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear1"));
		ele.click();
	}

	@Then("Click Actual live hour radio button in Fuel Surcharge Setup")
	public void click_actual_live_hour_radio_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoBillingType_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoBillingType_0"));
		ele.click();
	}

	@And("Click Trip Start date radio button in Fuel Surcharge Setup")
	public void click_trip_start_date_radio_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoDateby_2")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoDateby_2"));
		ele.click();
	}

	@And("Click Quoted date radio button in Fuel Surcharge Setup")
	public void click_quoted_date_radio_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoDateby_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoDateby_0"));
		ele.click();
	}

	@Then("Click edit button in Fuel Surcharge Setup")
	public void click_edit_button_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvFuelSucharge_lnkEdit_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvFuelSucharge_lnkEdit_0"));
		ele.click();
	}

	@And("Click edit button in webtable in Fuel Surcharge Setup")
	public void click_edit_button_in_webtable_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvFuelSurchrgeLOG_lnkEdit_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvFuelSurchrgeLOG_lnkEdit_0"));
		ele.click();
	}

	@Then("Modify the details in Fuel Surcharge Setup")
	public void modify_the_details_in_fuel_surcharge_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripPorpose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripPorpose"));
		String Text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtTripPorpose"));
		ele1.sendKeys(Text);
	}

	@And("Click GL Code Setup button in Setup")
	public void click_gl_code_setup_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[2]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[2]/a/span"));
		ele1.click();
	}

	@Then("Select All option in company tab in GL Code Setup")
	public void select_all_option_in_company_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompanyFilter")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompanyFilter"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("ALL");
	}

	@And("Click search button in GL Code Setup")
	public void click_search_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSearch")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSearch"));
		ele.click();
	}

	@Then("Select Jet Edge option in company tab in GL Code Setup")
	public void select_jet_edge_option_in_company_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompanyFilter")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompanyFilter"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Jet Edge");
	}

	@Then("Select Jet Select option in company tab in GL Code Setup")
	public void select_jet_select_option_in_company_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompanyFilter")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompanyFilter"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Jet Select");
	}

	@Then("Select Off Fleet option in company tab in GL Code Setup")
	public void select_off_fleet_option_in_company_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompanyFilter")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompanyFilter"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Off-Fleet");
	}

	@And("Select All option in Entry Status tab in GL Code Setup")
	public void select_all_option_in_entry_status_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlEntryStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlEntryStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("ALL");
	}

	@And("Select Completed option in Entry Status tab in GL Code Setup")
	public void select_completed_option_in_entry_status_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlEntryStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlEntryStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Completed");
	}

	@And("Select Pending option in Entry Status tab in GL Code Setup")
	public void select_pending_option_in_entry_status_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlEntryStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlEntryStatus"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Pending");
	}

	@Then("Select All option in GP Upload Flag option tab in GL Code Setup")
	public void select_all_option_in_gp_upload_flag_option_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPUploadFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPUploadFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("ALL");
	}

	@Then("Select Yes option in GP Upload Flag option tab in GL Code Setup")
	public void select_yes_option_in_gp_upload_flag_option_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPUploadFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPUploadFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Yes");
	}

	@Then("Select No option in GP Upload Flag option tab in GL Code Setup")
	public void select_no_option_in_gp_upload_flag_option_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPUploadFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPUploadFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("No");
	}

	@And("Select All option in Status option tab in GL Code Setup")
	public void select_all_option_in_status_option_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlStatusFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlStatusFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("ALL");
	}

	@And("Select Active option in Status option tab in GL Code Setup")
	public void select_active_option_in_status_option_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlStatusFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlStatusFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Active");
	}

	@And("Select Inactive option in Status option tab in GL Code Setup")
	public void select_Inactive_option_in_status_option_tab_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlStatusFlag")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlStatusFlag"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Inactive");
	}

	@Then("Enter valid Item code {string} in GL Code Setup")
	public void enter_valid_item_code_in_gl_code_setup(String ItemCode) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtSearch")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtSearch"));
		ele.sendKeys(ItemCode);
	}

	@Then("Click add new button in GL Code Setup")
	public void click_add_new_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click back button in GL Code Setup")
	public void click_back_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@Then("Click save button in GL Code Setup")
	public void click_save_button_in_gl_code_setup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0);");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div[3]/div/input[1]")));
		ele = driver.findElement(
				By.xpath("/html/body/form/div[5]/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div[3]/div/input[1]"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("Select valid company name {string} in GL Code Setup")
	public void select_valid_company_name_in_gl_code_setup(String CompanyName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel = new Select(ele);
		sel.selectByVisibleText(CompanyName);
	}

	@Then("Click revenue radio button in GL Code Setup")
	public void click_revenue_radio_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblItemType_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblItemType_0"));
		ele.click();
	}

	@And("Click Expense radio button in GL Code Setup")
	public void click_expense_radio_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblItemType_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblItemType_1"));
		ele.click();
	}

	@Then("Click Tax radio button in GL Code Setup")
	public void click_tax_radio_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblItemType_2")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblItemType_2"));
		ele.click();
	}

	@And("Click clear button in GL Code Setup")
	public void click_clear_button_in_gl_code_setup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0);");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear1"));
		ele.click();
	}

	@And("Click others radio button in Department Code Setup in GL Code Setup")
	public void click_others_radio_button_in_department_code_setup_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblDepCode_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblDepCode_1"));
		ele.click();
	}

	@Then("Enter valid Department Code {string} in Department Code Setup in GL Code Setup")
	public void enter_valid_department_code_in_department_code_setup_in_gl_code_setup(String DepCode) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtDepCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtDepCode"));
		ele.sendKeys(DepCode);
	}

	@And("Click yes radio button in Account Number Setup in GL Code Setup")
	public void click_yes_radio_button_in_account_number_setup_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblOverwrite_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblOverwrite_1"));
		ele.click();
	}

	@Then("Enter valid Account Number {string} in Account Number Setup in GL Code Setup")
	public void enter_valid_account_number_in_account_number_setup_in_gl_code_setup(String AccNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtAccNo")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtAccNo"));
		ele.sendKeys(AccNumber);
	}

	@And("Click inactive radio button in status field in GL Code Setup")
	public void click_inactive_radio_button_in_status_field_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblStatus_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblStatus_1"));
		ele.click();
	}

	@Then("Enter FOS Item Number {string} in GL Code Setup")
	public void enter_fos_item_number_in_gl_code_setup(String ItemNum) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtItemNumber")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtItemNumber"));
		ele.sendKeys(ItemNum);
	}

	@And("Enter FOS Item Description {string} in GL Code Setup")
	public void enter_fos_item_description_in_gl_code_setup(String ItemDes) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtItemDescr")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtItemDescr"));
		ele.sendKeys(ItemDes);
	}

	@Then("Enter Trip Type {string} in GL Code Setup")
	public void enter_trip_type_in_gl_code_setup(String TripType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele.sendKeys(TripType);
	}

	@And("Select valid effective from date in FOS Input in GL Code Setup")
	public void select_valid_effective_from_date_in_fos_input_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEffFrom")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtEffFrom"));
		ele.click();
		// Date select
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]"));
		ele1.click();
	}

	@Then("Click no radio button in Non Inventory in GL Code Setup")
	public void click_no_radio_button_in_non_inventory_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoIncludes_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoIncludes_1"));
		ele.click();
	}

	@And("Select valid effective from date in Non Inventory in GL Code Setup")
	public void select_valid_effective_from_date_in_non_inventory_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEffectiveNON")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtEffectiveNON"));
		ele.click();
		// Date select
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]"));
		ele1.click();
	}

	@Then("Enter valid notes in Non Inventory in GL Code Setup")
	public void enter_valid_notes_in_non_inventory_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNotes")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.sendKeys("Test");
	}

	@And("Enter valid Alternative FOS Item Number in NS Input in GL Code Setup")
	public void enter_valid_alternative_fos_item_number_in_ns_input_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtANItemNumber")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtANItemNumber"));
		ele.sendKeys("Test");
	}

	@Then("Enter valid GL Code in NS Input in GL Code Setup")
	public void enter_valid_gl_code_in_ns_input_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtGLCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtGLCode"));
		ele.sendKeys("40404");
	}

	@And("Click By Hour radio button in NS Input in GL Code Setup")
	public void click_by_hour_radio_button_in_ns_input_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rblSplitBy_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rblSplitBy_1"));
		ele.click();
	}

	@Then("Enter valid Item Number in NS Input in GL Code Setup")
	public void enter_valid_item_number_in_ns_input_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtItemNoGP")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtItemNoGP"));
		ele.sendKeys("TEST CHARTER FEE");
	}

	@And("Enter valid Item Description in NS Input in GL Code Setup")
	public void enter_valid_item_description_in_ns_input_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtItemDescGP")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtItemDescGP"));
		ele.sendKeys("TEST CHARTER FEE");
	}

	@Then("Click edit button in GL Code Setup")
	public void click_edit_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvGLCode_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvGLCode_lnkEdit_0\"]/span"));
		ele.click();
	}

	@And("Click history button in GL Code Setup")
	public void click_history_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnHistory")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnHistory"));
		ele.click();
	}

	@Then("Click close button in history in GL Code Setup")
	public void click_close_button_in_history_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnHisClose")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnHisClose"));
		ele.click();
	}

	@And("Modify the details in GL Code Setup")
	public void modify_the_details_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtItemNumber")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtItemNumber"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtItemNumber"));
		ele1.sendKeys(text);
	}

	@Then("Click delete button in GL Code Setup")
	public void click_delete_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvGLCode_imbDelete_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvGLCode_imbDelete_0"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblMsgDelete")));
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_lblMsgDelete"));
		String text = ele1.getText();
		// System.out.println("Delete message displayed like : "+text);
		System.out.print("\u001B[1mDelete message displayed like : \u001B[0m" + text);
	}

	@And("Click no button in GL Code Setup")
	public void click_no_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnCloseD")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnCloseD"));
		ele.click();
	}

	@And("Click yes button in GL Code Setup")
	public void click_yes_button_in_gl_code_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnYesDelete")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnYesDelete"));
		ele.click();
	}

	@And("Click Company GL Setup button in Setup")
	public void click_company_gl_setup_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[3]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[3]/a/span"));
		ele1.click();
	}

	@Then("Click add new button in Company GL Setup")
	public void click_add_new_button_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click back button in Company GL Setup")
	public void click_back_button_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click save button in Company GL Setup")
	public void click_save_button_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("Select valid company name in Company GL Setup")
	public void select_valid_company_name_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlCompany"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Enter valid GL Code {string} in Company GL Setup")
	public void enter_valid_gl_code_in_company_gl_setup(String GLCode) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtGLCode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtGLCode"));
		ele.sendKeys(GLCode);
	}

	@And("Enter valid trip type {string} in Company GL Setup")
	public void enter_valid_trip_type_in_company_gl_setup(String TripType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele.sendKeys(TripType);
	}

	@Then("Select valid date in effective from calendar in Company GL Setup")
	public void select_valid_date_in_effective_from_calendar_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtEffFrom")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtEffFrom"));
		ele.click();
		// Date select
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[5]/td[5]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[5]/td[5]"));
		ele1.click();
	}

	@And("Enter valid notes {string} in Company GL Setup")
	public void enter_valid_notes_test_in_company_gl_setup(String Notes) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNotes")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		ele.sendKeys(Notes);
	}

	@Then("Click clear button in Company GL Setup")
	public void click_clear_button_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear1"));
		ele.click();
	}

	@Then("Click edit button in Company GL Setup")
	public void click_edit_button_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCompanySetup_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCompanySetup_lnkEdit_0\"]/span"));
		ele.click();
	}

	@And("Modify valid details in Company GL Setup")
	public void modify_valid_details_in_company_gl_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtTripType")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtTripType"));
		ele1.sendKeys(text);
	}

	@And("Click Rate Setup button in Setup")
	public void click_rate_setup_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[6]/a/span[1]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[6]/a/span[1]"));
		ele1.click();

	}

	@Then("Click add new button in rate setup")
	public void click_add_new_button_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click back button in rate setup")
	public void click_back_button_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click save button in rate setup")
	public void click_save_button_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("Click Rate Setup radio button in rate setup")
	public void click_rate_setup_radio_button_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdosetup_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdosetup_1"));
		ele.click();
	}

	@Then("Enter valid rate type {string} in rate setup")
	public void enter_valid_rate_type_in_rate_setup(String RateType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdosetup_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdosetup_1"));
		ele.sendKeys(RateType);
	}

	@And("Enter valid FOS Item number {string} in rate setup")
	public void enter_valid_fos_item_number_in_rate_setup(String ItemNum) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdosetup_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdosetup_1"));
		ele.sendKeys(ItemNum);
	}

	@Then("Enter valid Effective From in rate setup")
	public void enter_valid_effective_from_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txteffform")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txteffform"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[5]/td[5]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[5]/td[5]"));
		ele1.click();
	}

	@And("Enter valid GL Code {string} in rate setup")
	public void enter_valid_gl_code_in_rate_setup(String GLCode) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtglcode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtglcode"));
		ele.sendKeys(GLCode);
	}

	@Then("Enter valid NS Item Number {string} in rate setup")
	public void enter_valid_ns_item_number_in_rate_setup(String NSItemNum) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNSitemno")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNSitemno"));
		ele.sendKeys(NSItemNum);
	}

	@And("Enter valid NS Item Description {string} in rate setup")
	public void enter_valid_ns_item_description_in_rate_setup(String NSItemDes) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNSDescription")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNSDescription"));
		ele.sendKeys(NSItemDes);
	}

	@Then("Click clear button in rate setup")
	public void click_clear_button_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear1"));
		ele.click();
	}

	@And("Click Company radio button in rate setup")
	public void click_company_radio_button_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdosetup_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdosetup_0"));
		ele.click();
	}

	@Then("Enter valid Company {string} in rate setup")
	public void enter_valid_company_in_rate_setup(String CompanyName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtcompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtcompany"));
		ele.sendKeys(CompanyName);
	}

	@Then("Click edit button in rate setup")
	public void click_edit_button_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCompanySetup_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCompanySetup_lnkEdit_0\"]/span"));
		ele.click();
	}

	@And("Click edit button in web table in rate setup")
	public void click_edit_button_in_web_table_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvRateSetupLog_lnkEdit_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvRateSetupLog_lnkEdit_0"));
		ele.click();
	}

	@Then("Modify the valid details in rate setup")
	public void modify_the_valid_details_in_rate_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtglcode")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtglcode"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtglcode"));
		ele1.sendKeys(text);
	}

	@And("Click price Setup button in Setup")
	public void click_price_setup_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[7]/a/span[1]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[7]/a/span[1]"));
		ele1.click();
	}

	@Then("Click Add new button in Setup")
	public void click_add_new_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click back button in Setup")
	public void click_back_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click save button in price setup")
	public void click_save_button_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("Enter valid Company name {string} in price Setup")
	public void enter_valid_company_name_in_price_setup(String CompName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtCompany"));
		ele.sendKeys(CompName);
	}

	@Then("Enter valid FOS Item Number {string} in price Setup")
	public void enter_valid_fos_item_number_in_price_setup(String ItemNum) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtfositem")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtfositem"));
		ele.sendKeys(ItemNum);
	}

	@And("Click super mid radio button in price Setup")
	public void click_super_mid_radio_button_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoTailType_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoTailType_1"));
		ele.click();
	}

	@Then("Click Block Hours radio button in price Setup")
	public void click_block_hours_radio_button_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoBillHour_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoBillHour_1"));
		ele.click();
	}

	@And("Select valid Effective From date in price Setup")
	public void select_valid_effective_from_date_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txteffform")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txteffform"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[5]/td[5]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[5]/td[5]"));
		ele1.click();
	}

	@Then("Enter valid Unit Price {string} in price Setup")
	public void enter_valid_unit_price_in_price_setup(String UnitPrice) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtUnitPrice")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtUnitPrice"));
		ele.sendKeys(UnitPrice);
	}

	@And("Click clear button in Setup")
	public void click_clear_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear1"));
		ele.click();
	}

	@And("Click Heavy radio button in price Setup")
	public void click_heavy_radio_button_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoTailType_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoTailType_0"));
		ele.click();
	}

	@Then("Click Flight Hours radio button in price Setup")
	public void click_flight_hours_radio_button_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoBillHour_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoBillHour_0"));
		ele.click();
	}

	@Then("Click edit button in price setup")
	public void click_edit_button_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCompanySetup_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCompanySetup_lnkEdit_0\"]/span"));
		ele.click();
	}

	@And("Click edit button in web table in price setup")
	public void click_edit_button_in_web_table_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvRateSetupLog_lnkEdit_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvRateSetupLog_lnkEdit_0"));
		ele.click();
	}

	@Then("Modify the valid details in price setup")
	public void modify_the_valid_details_in_price_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtUnitPrice")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtUnitPrice"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtUnitPrice"));
		ele1.sendKeys(text);
	}

	@And("Click NS Customer button in Setup")
	public void click_ns_customer_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[8]/a/span[1]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[8]/a/span[1]"));
		ele1.click();
	}

	@Then("Click Add new button in NS Customer")
	public void click_add_new_button_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click back button in NS Customer")
	public void click_back_button_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click save button in NS Customer")
	public void click_save_button_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("Enter valid NS Customer ID {string} in NS Customer")
	public void enter_valid_ns_customer_id_in_ns_customer(String CusID) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNSCustomerID")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNSCustomerID"));
		ele.sendKeys(CusID);
	}

	@Then("Enter valid NS Customer Name {string} in NS Customer")
	public void enter_valid_ns_customer_name_in_ns_customer(String NSCusName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNSCustomerName")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNSCustomerName"));
		ele.sendKeys(NSCusName);
	}

	@And("Click Yes radio button in status field in NS Customer")
	public void click_yes_radio_button_in_status_field_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoStatus_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoStatus_0"));
		ele.click();
	}

	@Then("Click clear button in NS Customer")
	public void click_clear_button_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear1"));
		ele.click();
	}

	@And("Click No radio button in status field in NS Customer")
	public void click_No_radio_button_in_status_field_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoStatus_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoStatus_1"));
		ele.click();
	}

	@Then("Click Edit button in NS Customer")
	public void click_edit_button_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCustomerMapping_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCustomerMapping_lnkEdit_0\"]/span"));
		ele.click();
	}

	@And("Modify valid details in NS Customer")
	public void modify_valid_details_in_ns_customer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNSCustomerID")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtNSCustomerID"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtNSCustomerID"));
		ele1.sendKeys(text);
	}

	@And("Click Exclude Line Item button in Setup")
	public void click_exclude_line_item_button_in_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[9]/a/span[1]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[5]/div/ul/li[9]/a/span[1]"));
		ele1.click();
	}

	@Then("Click add new button in Exclude Line Item")
	public void click_add_new_button_in_exclude_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnAddNew")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnAddNew"));
		ele.click();
	}

	@And("Click back button in Exclude Line Item")
	public void click_back_button_in_exclude_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBack")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBack"));
		ele.click();
	}

	@And("Click save button in Exclude Line Item")
	public void click_save_button_in_exclude_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnSave")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.print("\u001B[1mAlert message is displayed like : \u001B[0m" + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.print("\u001B[1mNo Alert message is displayed\u001B[0m");
		}
	}

	@And("Enter valid company name {string} in Exclude Line Item")
	public void enter_valid_company_name_in_exclude_line_item(String CompName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtCompany")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtCompany"));
		ele.sendKeys(CompName);
	}

	@Then("Enter valid FOS Item Number {string} in Exclude Line Items")
	public void enter_valid_fos_item_number_in_exclude_line_items(String ItemNum) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFOSItemNumber")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFOSItemNumber"));
		ele.sendKeys(ItemNum);
	}

	@And("Click Yes radio button in Exclude Line Items")
	public void click_yes_radio_button_in_exclude_line_items() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoStatus_1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoStatus_1"));
		ele.click();
	}

	@And("Click clear button in Exclude Line Item")
	public void click_clear_button_in_exclude_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear1")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear1"));
		ele.click();
	}

	@And("Click No radio button in Exclude Line Items")
	public void click_no_radio_button_in_exclude_line_items() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_rdoStatus_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_rdoStatus_0"));
		ele.click();
	}

	@Then("Click edit button in Exclude Line Item")
	public void click_edit_button_in_exclude_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCustomerMapping_lnkEdit_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvCustomerMapping_lnkEdit_0\"]/span"));
		ele.click();
	}

	@And("Modify valid details in Exclude Line Item")
	public void modify_valid_details_in_exclude_line_item() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFOSItemNumber")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFOSItemNumber"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtFOSItemNumber"));
		ele1.sendKeys(text);
	}
}
