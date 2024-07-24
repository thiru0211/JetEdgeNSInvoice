package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class JE_QP_6_FOSUpload1 {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));
	public String filepath="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeNSInvoicePortal\\Files\\Blank.xlsx";

	@Given("To Check FOS Upload User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check FOS Upload User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check FOS Upload")
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

	@And("close the FOS Upload Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}


	@Then("Click menu button in homepage in FOS Upload")
	public void click_menu_button_in_homepage_in_gl_upload2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_desktop_toggle\"]/span"));
		ele.click();
	}
	
	@Then("Click FOS Upload1 button in menu")
	public void click_fos_upload1_button_in_menu() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[1]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[1]/a/span"));
		ele1.click();
	}
	@And("Click help button in FOS Upload1")
	public void click_help_button_in_fos_upload1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnhelp")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnhelp"));
		ele.click();
	}
	@And("Click upload button in FOS Upload1")
	public void click_upload_button_in_fos_upload1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
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
	@Then("Select valid from date in FOS Upload1")
	public void select_valid_from_date_in_fos_upload1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]"));
		ele1.click();
	}
	@And("Select valid to date in FOS Upload1")
	public void select_valid_to_date_in_fos_upload1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]"));
		ele1.click();
	}
	@Then("Upload valid file in FOS Upload1")
	public void upload_valid_file_in_fos_upload1() throws AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_divForm\"]/div/div[1]/div[3]")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_divForm\"]/div/div[1]/div[3]"));
		ele.click();
		StringSelection selection=new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Then("Click clear button in FOS Upload1")
	public void click_clear_button_in_fos_upload1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@And("Enter valid notes {string} in FOS Upload1")
	public void enter_valid_notes_in_fos_upload1(String Notes) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.sendKeys(Notes);
	}
	@Then("Click download button in FOS Upload1")
	public void click_download_button_in_fos_upload1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvFileLog_imbExport_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvFileLog_imbExport_0\"]/span"));
		ele.click();
	}
	
	@Then("Click FOS Upload2 button in menu")
	public void click_fos_upload2_button_in_menu() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[2]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[2]/a/span"));
		ele1.click();
	}
	@And("Click help button in FOS Upload2")
	public void click_help_button_in_fos_Upload2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnhelp")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnhelp"));
		ele.click();
	}
	@And("Click upload button in FOS Upload2")
	public void click_upload_button_in_fos_Upload2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
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
	@Then("Select valid from date in FOS Upload2")
	public void select_valid_from_date_in_fos_Upload2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]"));
		ele1.click();
	}
	@And("Select valid to date in FOS Upload2")
	public void select_valid_to_date_in_fos_Upload2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]"));
		ele1.click();
	}
	@Then("Upload valid file in FOS Upload2")
	public void upload_valid_file_in_fos_Upload2() throws AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_divForm\"]/div/div[1]/div[3]")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_divForm\"]/div/div[1]/div[3]"));
		ele.click();
		StringSelection selection=new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Then("Click clear button in FOS Upload2")
	public void click_clear_button_in_fos_Upload2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@And("Enter valid notes {string} in FOS Upload2")
	public void enter_valid_notes_in_fos_Upload2(String Notes) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.sendKeys(Notes);
	}
	@Then("Click download button in FOS Upload2")
	public void click_download_button_in_fos_Upload2() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvFileLog_imbExport_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvFileLog_imbExport_0\"]/span"));
		ele.click();
	}
	@And("Click Off-Fleet Upload button in menu")
	public void click_off_fleet_upload_button_in_menu() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[3]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[3]/a/span"));
		ele1.click();
	}
	@Then("Click help button in Off-Fleet Upload")
	public void click_help_button_in_off_fleet_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnhelp")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnhelp"));
		ele.click();
	}
	@Then("Click upload button in Off-Fleet Upload")
	public void click_upload_button_in_off_fleet_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_ButSubmit")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_ButSubmit"));
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
	@Then("Select valid from date in Off-Fleet Upload")
	public void select_valid_from_date_in_off_fleet_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[1]/td[2]"));
		ele1.click();
	}
	@And("Select valid to date in Off-Fleet Upload")
	public void select_valid_to_date_in_off_fleet_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"kt_body\"]/div[6]/div[1]/table/tbody/tr[6]/td[7]"));
		ele1.click();
	}
	@Then("Upload valid file in Off-Fleet Upload")
	public void upload_valid_file_in_off_fleet_upload() throws AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_divForm\"]/div/div[1]/div[3]")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_divForm\"]/div/div[1]/div[3]"));
		ele.click();
		StringSelection selection=new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot=new Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	@Then("Click clear button in Off-Fleet Upload")
	public void click_clear_button_in_off_fleet_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.click();
	}
	
	@And("Enter valid notes {string} in Off-Fleet Upload")
	public void enter_valid_notes_in_off_fleet_upload(String Notes) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_btnClear")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_btnClear"));
		ele.sendKeys(Notes);
	}
	@Then("Click download button in Off-Fleet Upload")
	public void click_download_button_in_off_fleet_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ContentPlaceHolder1_gvFileLog_imbExport_0\"]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_gvFileLog_imbExport_0\"]/span"));
		ele.click();
	}
	
	@And("Check data is cleared or not in FOS Upload1")
	public void check_data_is_cleared_or_not_in_fos_upload1() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtFromDate")));
		ele = driver.findElement(By.id("ContentPlaceHolder1_txtFromDate"));
		String FromDate = ele.getAttribute("value");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtToMonth")));
		ele1 = driver.findElement(By.id("ContentPlaceHolder1_txtToMonth"));
		String ToDate = ele1.getAttribute("value");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ContentPlaceHolder1_txtNotes")));
		ele2 = driver.findElement(By.id("ContentPlaceHolder1_txtNotes"));
		String Notes = ele2.getAttribute("value");
		if(FromDate.isEmpty() && ToDate.isEmpty() && Notes.isEmpty()) {
			System.out.println("Data is cleared");
			
		}
		else {
			System.out.println("Data is not cleared");
			System.out.println("Data is displayed like : "+FromDate+ToDate+Notes);
		}
	}
}
