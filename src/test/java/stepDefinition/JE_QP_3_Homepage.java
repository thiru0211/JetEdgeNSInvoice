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

public class JE_QP_3_Homepage {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check Homepage User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Homepage User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.print("\u001B[1mUsername and password entered\u001B[0m");
	}

	@And("click the Signin button To Check Homepage")
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

	@And("close the Homepage Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.print("\u001B[1mPage is closed\u001B[0m");
	}

	@Then("Click GL Code setup button in homepage")
	public void click_gl_code_setup_button_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[1]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[1]/a/span[2]"));
		ele.click();
	}

	@And("Check landing page to GL Code setup page or not")
	public void check_landing_page_to_gl_code_setup_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualText = ele.getText();
		String ExpectedText = "GL Code Setup";
		if (ExpectedText.equals(ActualText)) {
			// System.out.println("Page landed to "+ ExpectedText +" sucessfully");
			System.out.print("\u001B[1mPage landed to \u001B[0m" + ExpectedText + "\u001B[1msucessfully\u001B[0m");

		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@Then("Click Ignored Trip setup button in homepage")
	public void click_ignored_trip_setup_button_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[2]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[2]/a/span[2]"));
		ele.click();
	}

	@And("Check landing page to Ignored Trip setup page or not")
	public void check_landing_page_to_ignored_trip_setup_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Span2")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Span2"));
		String ActualText = ele.getText();
		String ExpectedText = "Ignored Trip Setup";
		if (ExpectedText.equals(ActualText)) {
			// System.out.println("Page landed to "+ ExpectedText +" sucessfully");
			System.out.print("\u001B[1mPage landed to \u001B[0m" + ExpectedText + "\u001B[1msucessfully\u001B[0m");

		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@Then("Click NS FOS File upload button in homepage")
	public void click_ns_fos_file_upload_button_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[3]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[3]/a/span[2]"));
		ele.click();
	}

	@And("Check landing page NS FOS File upload page or not")
	public void check_landing_page_ns_fos_file_upload_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualText = ele.getText();
		String ExpectedText = "FOS Upload 1.0";
		if (ExpectedText.equals(ActualText)) {
			// System.out.println("Page landed to "+ ExpectedText +" sucessfully");
			System.out.print("\u001B[1mPage landed to \u001B[0m" + ExpectedText + "\u001B[1msucessfully\u001B[0m");

		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@Then("Click NS Audit report button in homepage")
	public void click_ns_audit_report_button_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[4]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[4]/a/span[2]"));
		ele.click();
	}

	@And("Check landing page NS Audit report page or not")
	public void check_landing_page_ns_audit_report_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualText = ele.getText();
		String ExpectedText = "Audit Report";
		if (ExpectedText.equals(ActualText)) {
			// System.out.println("Page landed to "+ ExpectedText +" sucessfully");
			System.out.print("\u001B[1mPage landed to \u001B[0m" + ExpectedText + "\u001B[1msucessfully\u001B[0m");

		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@Then("Click NS Verify trips button in homepage")
	public void click_ns_verify_trips_button_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[5]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[5]/a/span[2]"));
		ele.click();
	}

	@And("Check landing page NS Verify trips page or not")
	public void check_landing_page_ns_verify_trips_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualText = ele.getText();
		String ExpectedText = "VerifyTrips";
		if (ExpectedText.equals(ActualText)) {
			// System.out.println("Page landed to "+ ExpectedText +" sucessfully");
			System.out.print("\u001B[1mPage landed to \u001B[0m" + ExpectedText + "\u001B[1msucessfully\u001B[0m");

		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@Then("Click NS upload button in homepage")
	public void click_ns_upload_button_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[6]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[1]/div[1]/div/ul/li[6]/a/span[2]"));
		ele.click();
	}

	@And("Check landing page NS upload page or not")
	public void check_landing_page_ns_upload_page_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualText = ele.getText();
		String ExpectedText = "Net Suite Upload";
		if (ExpectedText.equals(ActualText)) {
			// System.out.println("Page landed to "+ ExpectedText +" sucessfully");
			System.out.print("\u001B[1mPage landed to \u001B[0m" + ExpectedText + "\u001B[1msucessfully\u001B[0m");

		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@Then("Click NS FOS File upload button in top of homepage")
	public void click_ns_fos_file_upload_button_in_top_of_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblRefreshedOn")));
		ele = driver.findElement(By.id("lblRefreshedOn"));
		ele.click();
	}

	@Then("Click view trips button in error tab")
	public void click_view_trips_button_in_error_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[1]/div/div/div[2]/p/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[1]/div/div/div[2]/p/a"));
		ele.click();
	}

	@And("Check NS Status should show error option or not")
	public void check_ns_status_should_show_error_option_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Error";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("NE Status tab shows "+ ExpectedOption +" option
			// sucessfully");
			System.out.print(
					"\u001B[1mNE Status tab shows \u001B[0m" + ExpectedOption + "\u001B[1moption sucessfully\u001B[0m");
		} else {
			// System.out.println("NE Status tab doesnot shows expected option");
			System.out.print("\u001B[1mNE Status tab doesnot shows expected option\u001B[0m");
		}
	}

	@Then("Click view trips button in Good to Go tab")
	public void click_view_trips_button_in_good_to_go_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[3]/div/div/div[2]/p/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[3]/div/div/div[2]/p/a"));
		ele.click();
	}

	@And("Check NS Status should show Ready to Go option or not")
	public void check_ns_status_should_show_ready_to_go_option_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Ready to Go";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("NE Status tab shows "+ ExpectedOption +" option
			// sucessfully");
			System.out.print(
					"\u001B[1mNE Status tab shows \u001B[0m" + ExpectedOption + "\u001B[1moption sucessfully\u001B[0m");
		} else {
			// System.out.println("NE Status tab doesnot shows expected option");
			System.out.print("\u001B[1mNE Status tab doesnot shows expected option\u001B[0m");
		}
	}

	@Then("Click view trips button in Verified tab")
	public void click_view_trips_button_in_verified_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[5]/div/div/div[2]/p/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[5]/div/div/div[2]/p/a"));
		ele.click();
	}

	@And("Check NS Status should show Verified option or not")
	public void check_ns_status_should_show_verified_option_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Verified";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("NE Status tab shows "+ ExpectedOption +" option
			// sucessfully");
			System.out.print(
					"\u001B[1mNE Status tab shows \u001B[0m" + ExpectedOption + "\u001B[1moption sucessfully\u001B[0m");
		} else {
			// System.out.println("NE Status tab doesnot shows expected option");
			System.out.print("\u001B[1mNE Status tab doesnot shows expected option\u001B[0m");
		}
	}

	@Then("Click view trips button in NS Pending tab")
	public void click_view_trips_button_in_ns_pending_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[7]/div/div/div[2]/p/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[7]/div/div/div[2]/p/a"));
		ele.click();
	}

	@And("Check NS Status should show NS Pending option or not")
	public void check_ns_status_should_show_ns_pending_option_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "NS Pending";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("NE Status tab shows "+ ExpectedOption +" option
			// sucessfully");
			System.out.print(
					"\u001B[1mNE Status tab shows \u001B[0m" + ExpectedOption + "\u001B[1moption sucessfully\u001B[0m");
		} else {
			// System.out.println("NE Status tab doesnot shows expected option");
			System.out.print("\u001B[1mNE Status tab doesnot shows expected option\u001B[0m");
		}
	}

	@Then("Click view trips button in Not Ready in FOS tab")
	public void click_view_trips_button_in_not_ready_in_fos_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[9]/div/div/div[2]/p/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[9]/div/div/div[2]/p/a"));
		ele.click();
	}

	@And("Check Trip Status should show No Quote option or not")
	public void check_trip_status_should_show_no_quote_option_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "No Quote";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Trip Status tab shows "+ ExpectedOption +" option
			// sucessfully");
			System.out.print("\u001B[1mTrip Status tab shows \u001B[0m" + ExpectedOption
					+ "\u001B[1moption sucessfully\u001B[0m");
		} else {
			// System.out.println("Trip Status tab doesnot shows expected option");
			System.out.print("\u001B[1mTrip Status tab doesnot shows expected option\u001B[0m");
		}
	}

	@Then("Click view trips button in GL Code Pending Item Code tab")
	public void click_view_trips_button_in_gl_code_pending_item_code_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[11]/div/div/div[2]/p/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[11]/div/div/div[2]/p/a"));
		ele.click();
	}

	@And("Check Entry Status should show Pending option or not")
	public void check_entry_status_should_show_pending_option_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlEntryStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlEntryStatus"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Pending";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Entry Status tab shows "+ ExpectedOption +" option
			// sucessfully");
			System.out.print("\u001B[1mEntry Status tab shows \u001B[0m" + ExpectedOption
					+ "\u001B[1moption sucessfully\u001B[0m");
		} else {
			// System.out.println("Entry Status tab doesnot shows expected option");
			System.out.print("\u001B[1mEntry Status tab doesnot shows expected option\u001B[0m");
		}
	}

	@Then("Click view trips button in Ignored tab")
	public void click_view_trips_button_in_ignored_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[13]/div/div/div[2]/p/a")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_content\"]/div/div/div/div[2]/div[13]/div/div/div[2]/p/a"));
		ele.click();
	}

	@And("Check Trip Status should show Ignored option or not")
	public void check_trip_status_should_show_ignored_option_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ddlGPStatus")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ddlGPStatus"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Ignored";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Trip Status tab shows "+ ExpectedOption +" option
			// sucessfully");
			System.out.print("\u001B[1mTrip Status tab shows \u001B[0m" + ExpectedOption
					+ "\u001B[1moption sucessfully\u001B[0m");
		} else {
			// System.out.println("Trip Status tab doesnot shows expected option");
			System.out.print("\u001B[1mTrip Status tab doesnot shows expected option\u001B[0m");
		}
	}

	@Then("Click valid date in NS Uploaded On")
	public void click_valid_date_in_ns_uploaded_on() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_gvLogDetails_lblModOn_0")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_gvLogDetails_lblModOn_0"));
		ele.click();
	}

	@And("Click back button in NS Uploaded Log")
	public void click_back_button_in_ns_uploaded_log() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnBackdefault")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnBackdefault"));
		ele.click();
	}

	@Then("Click user icon button")
	public void click_user_icon_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user_toggle\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user_toggle\"]/span"));
		ele.click();
	}

	@And("Click view trips 1.0 button")
	public void click_view_trips_1_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[1]/div/div[2]/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[1]/div/div[2]/div[1]"));
		ele.click();
	}

	@Then("check the page landed to view trips 1.0 or not")
	public void check_the_page_landed_to_view_trips_1_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "View Trips 1.O";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Page landed to "+ ExpectedOption +" page sucessfully");
			System.out
					.print("\u001B[1mPage landed to \u001B[0m" + ExpectedOption + "\u001B[1mpage sucessfully\u001B[0m");
		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@And("Click non inventory line item  button")
	public void click_non_inventory_line_item_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[2]/div/div[2]/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[2]/div/div[2]/div[1]"));
		ele.click();
	}

	@And("Click GL Code setup button")
	public void click_gl_code_setup_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[3]/div/div[2]/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[3]/div/div[2]/div[1]"));
		ele.click();
	}

	@Then("check the page landed to GL Code setup or not")
	public void check_the_page_landed_to_gl_code_setup_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "GL Code Setup";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Page landed to "+ ExpectedOption +" page sucessfully");
			System.out
					.print("\u001B[1mPage landed to \u001B[0m" + ExpectedOption + "\u001B[1mpage sucessfully\u001B[0m");
		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@And("Click Company GL setup button")
	public void click_company_gl_setup_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[4]/div/div[2]/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[4]/div/div[2]/div[1]"));
		ele.click();
	}

	@Then("check the page landed to Company GL setup or not")
	public void check_the_page_landed_to_company_gl_setup_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Span2")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Span2"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Company GL Setup";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Page landed to "+ ExpectedOption +" page sucessfully");
			System.out
					.print("\u001B[1mPage landed to \u001B[0m" + ExpectedOption + "\u001B[1mpage sucessfully\u001B[0m");
		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@And("Click Company setup button")
	public void click_company_setup_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[5]/div/div[2]/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[5]/div/div[2]/div[1]"));
		ele.click();
	}

	@Then("check the page landed to Company setup or not")
	public void check_the_page_landed_to_company_setup_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Span2")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Span2"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Company Setup";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Page landed to "+ ExpectedOption +" page sucessfully");
			System.out
					.print("\u001B[1mPage landed to \u001B[0m" + ExpectedOption + "\u001B[1mpage sucessfully\u001B[0m");
		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@And("Click Global config setup button")
	public void click_global_config_setup_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[6]/div/div[2]/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[6]/div/div[2]/div[1]"));
		ele.click();
	}

	@Then("check the page landed to Global config setup or not")
	public void check_the_page_landed_to_global_config_setup_or_not() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_Span2")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_Span2"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "Global Config Setup";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Page landed to "+ ExpectedOption +" page sucessfully");
			System.out
					.print("\u001B[1mPage landed to \u001B[0m" + ExpectedOption + "\u001B[1mpage sucessfully\u001B[0m");
		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@And("Click upload FOS Report {double}  button")
	public void click_upload_fos_report_button(Double double1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[7]/div/div[2]/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user\"]/div[2]/div[3]/a[7]/div/div[2]/div[1]"));
		ele.click();
	}

	@Then("check the page landed to upload FOS Report {double}  or not")
	public void check_the_page_landed_to_upload_fos_report_or_not(Double double1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_lblSubHeader")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_lblSubHeader"));
		String ActualOption = ele.getAttribute("value");
		String ExpectedOption = "FOS Upload 1.0";
		if (ExpectedOption.equals(ActualOption)) {
			// System.out.println("Page landed to "+ ExpectedOption +" page sucessfully");
			System.out
					.print("\u001B[1mPage landed to \u001B[0m" + ExpectedOption + "\u001B[1mpage sucessfully\u001B[0m");
		} else {
			// System.out.println("Page doesnot landed to expected page");
			System.out.print("\u001B[1mPage doesnot landed to expected page\u001B[0m");
		}
	}

	@Then("Click menu icon button in Homepage")
	public void click_menu_icon_button_in_homepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("kt_quick_actions_toggle")));
		ele = driver.findElement(By.id("kt_quick_actions_toggle"));
		ele.click();
	}

	@And("Click close button in menu bar")
	public void click_close_button_in_menu_bar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_actions_close\"]/i")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_actions_close\"]/i"));
		ele.click();
	}

	@And("Click close button in user icon")
	public void click_close_button_in_user_icon() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user_close\"]/i")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user_close\"]/i"));
		ele.click();
	}

}
