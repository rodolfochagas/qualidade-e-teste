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

// public class LogInEditAlunoLogOutTest {
//     private WebDriver driver;
//     private Map < String, Object > vars;
//     JavascriptExecutor js;
    
//     @Before
//     public void setUp() {
//         System.setProperty("webdriver.chrome.driver", "chromedriver_linux64//chromedriver");
//         ChromeOptions option = new ChromeOptions();
// //        option.addArguments("--headless");
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
//     public void logInEditAlunoLogOut() {
//         driver.get("https://localhost:5000/");
//         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
//         driver.manage().window().setSize(new Dimension(1382, 784)); {
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
//         driver.findElement(By.cssSelector(".collection-item:nth-child(1) .title")).click();
//         driver.findElement(By.cssSelector("#md-tab-label-0-4 > .md-tab-label-aux")).click();
//         driver.findElement(By.id("edit-attenders-icon")).click();
//         driver.findElement(By.cssSelector("div:nth-child(4) > .row > .material-icons")).click();
//         driver.findElement(By.id("edit-attenders-icon")).click();
//         driver.findElement(By.id("add-attenders-icon")).click();
//         driver.findElement(By.id("input-attender-simple")).sendKeys("student3@gmail.com");
//         driver.findElement(By.id("put-modal-btn")).click();
//         driver.findElement(By.id("arrow-drop-down")).click();
//         driver.findElement(By.id("logout-button")).click();
//     }
// }