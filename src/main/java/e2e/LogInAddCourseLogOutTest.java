// package e2e;

// import org.junit.Test;
// import org.junit.Before;
// import org.junit.After;
// import static org.junit.Assert.*;
// import static org.hamcrest.CoreMatchers.is;
// import static org.hamcrest.core.IsNot.not;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.Dimension;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.Alert;
// import org.openqa.selenium.Keys;
// import java.util.*;
// import java.util.concurrent.TimeUnit;
// import java.net.MalformedURLException;
// import java.net.URL;
// public class LogInAddCourseLogOutTest {
//     private WebDriver driver;
//     private Map < String, Object > vars;
//     JavascriptExecutor js;

//     @Before
//     public void setUp() {
//         System.setProperty("webdriver.chrome.driver", "chromedriver_linux64//chromedriver");
//         ChromeOptions option = new ChromeOptions();
//         //	 option.addArguments("--headless");
//         option.setAcceptInsecureCerts(true);
//         driver = new ChromeDriver(option);
//         js = (JavascriptExecutor) driver;
//         vars = new HashMap < String, Object > ();
//     }

//     @After
//     public void tearDown() {
//         driver.quit();
//     }

//     @Test
//     public void logInAddCourseLogOut() {
//         driver.get("https://localhost:5000/");
//         driver.manage().window().setSize(new Dimension(1936, 1096)); {
//             WebElement element = driver.findElement(By.cssSelector("li:nth-child(2) > .navbar-button"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element).perform();
//         } {
//             WebElement element = driver.findElement(By.cssSelector("li:nth-child(2) > .navbar-button"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element).perform();
//         }
//         driver.findElement(By.cssSelector("li:nth-child(2) > .navbar-button")).click(); {
//             WebElement element = driver.findElement(By.tagName("body"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element, 0, 0).perform();
//         }
//         driver.findElement(By.id("email")).sendKeys("teacher@gmail.com");
//         driver.findElement(By.id("password")).click();
//         driver.findElement(By.id("password")).sendKeys("pass");
//         driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
//         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//         driver.findElement(By.id("add-course-icon")).click(); {
//             WebElement element = driver.findElement(By.id("add-course-icon"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element).perform();
//         } {
//             WebElement element = driver.findElement(By.tagName("body"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element, 0, 0).perform();
//         }
//         driver.findElement(By.id("input-post-course-name")).click();
//         driver.findElement(By.id("input-post-course-name")).sendKeys("New");
//         driver.findElement(By.id("submit-post-course-btn")).click();
//         driver.findElement(By.cssSelector(".collection-item:nth-child(3) .l6")).click();
//         driver.findElement(By.id("edit-course-info")).click();
//         driver.findElement(By.cssSelector(".ql-editor")).click(); {
//             WebElement element = driver.findElement(By.id("send-info-btn"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element).perform();
//         } {
//             WebElement element = driver.findElement(By.cssSelector(".ql-editor"));
//             js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<p>novo</p>'}", element);
//         }
//         driver.findElement(By.id("send-info-btn")).click();
//         driver.findElement(By.cssSelector(".medium")).click();
//         driver.findElement(By.cssSelector(".collection-item:nth-child(3) .material-icons")).click(); {
//             WebElement element = driver.findElement(By.cssSelector(".collection-item:nth-child(3) .material-icons"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element).perform();
//         } {
//             WebElement element = driver.findElement(By.tagName("body"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element, 0, 0).perform();
//         }
//         driver.findElement(By.id("label-delete-checkbox")).click();
//         driver.findElement(By.id("delete-course-btn")).click();
//         driver.findElement(By.id("arrow-drop-down")).click();
//         driver.findElement(By.id("logout-button")).click();
//     }
// }