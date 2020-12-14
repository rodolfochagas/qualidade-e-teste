package e2e;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
public class LogInCoursesLogOutTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
	 System.setProperty("webdriver.chrome.driver","chromedriver_linux64//chromedriver");
	 ChromeOptions option = new ChromeOptions();
	 option.addArguments("--headless");
	 option.setAcceptInsecureCerts(true);
	 driver = new ChromeDriver(option);
	 js = (JavascriptExecutor) driver;
	 vars = new HashMap<String, Object>();
	}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void logInCoursesLogOut() {
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 driver.get("https://localhost:5000/");
 driver.manage().window().setSize(new Dimension(1382, 784));
 driver.findElement(By.cssSelector("li:nth-child(2) > .navbar-button")).click();
 driver.findElement(By.id("email")).sendKeys("teacher@gmail.com");
 driver.findElement(By.id("password")).click();
 driver.findElement(By.id("password")).sendKeys("pass");
 driver.findElement(By.id("log-in-btn")).click();
 driver.findElement(By.cssSelector(".collection-item:nth-child(1) .title")).click();
 driver.findElement(By.id("sessions-tab-icon")).click();
 driver.findElement(By.id("forum-tab-icon")).click();
 driver.findElement(By.cssSelector("#md-tab-label-0-3 > .md-tab-label-aux")).click();
 driver.findElement(By.cssSelector("#md-tab-label-0-4 > .md-tab-label-aux")).click();
 driver.findElement(By.id("add-attenders-icon")).click();
// {
//   WebElement element = driver.findElement(By.id("put-modal-btn"));
//   Actions builder = new Actions(driver);
//   builder.moveToElement(element).perform();
// }
// driver.findElement(By.cssSelector(".ng-invalid .modal-action")).click();
// driver.findElement(By.id("edit-attenders-icon")).click();
// driver.findElement(By.id("edit-attenders-icon")).click();
// driver.findElement(By.id("files-tab-icon")).click();
// driver.findElement(By.id("add-files-icon")).click();
// driver.findElement(By.cssSelector("#course-details-modal .modal-action")).click();
// driver.findElement(By.cssSelector(".material-icons:nth-child(2)")).click();
// driver.findElement(By.cssSelector(".add-element-icon")).click();
// js.executeScript("window.scrollTo(0,100)");
// driver.findElement(By.cssSelector("#md-tab-label-0-2 > .md-tab-label-aux")).click();
// driver.findElement(By.id("edit-forum-icon")).click();
// driver.findElement(By.cssSelector(".ng-valid .modal-action")).click();
// driver.findElement(By.cssSelector("#md-tab-label-0-1 > .md-tab-label-aux")).click();
// driver.findElement(By.id("add-session-icon")).click();
// driver.findElement(By.cssSelector(".ng-invalid .modal-action")).click();
// driver.findElement(By.id("info-tab-icon")).click();
// driver.findElement(By.id("edit-course-info")).click();
// driver.findElement(By.cssSelector(".ql-editor")).click();
// js.executeScript("window.scrollTo(0,200)");
// driver.findElement(By.cssSelector(".left")).click();
// driver.findElement(By.cssSelector("#textEditorRowButtons > .waves-effect:nth-child(1)")).click();
// driver.findElement(By.cssSelector(".medium")).click();
// driver.findElement(By.id("arrow-drop-down")).click();
// driver.findElement(By.id("logout-button")).click();
}
}
