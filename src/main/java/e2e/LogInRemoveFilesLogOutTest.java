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
// public class LogInRemoveFilesLogOutTest {
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
//     public void logInRemoveFilesLogOut() {
//         driver.get("https://localhost:5000/");
//         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
//         driver.manage().window().setSize(new Dimension(1936, 1096));
//         driver.findElement(By.cssSelector("li:nth-child(2) > .navbar-button")).click();
//         driver.findElement(By.id("email")).sendKeys("teacher@gmail.com");
//         driver.findElement(By.id("password")).click(); {
//             WebElement element = driver.findElement(By.id("log-in-btn"));
//             Actions builder = new Actions(driver);
//             builder.moveToElement(element).perform();
//         }
//         driver.findElement(By.id("password")).sendKeys("pass");
//         driver.findElement(By.id("log-in-btn")).click();
//         driver.findElement(By.cssSelector(".collection-item:nth-child(1) .l6")).click();
//         driver.findElement(By.id("files-tab-icon")).click();
//         driver.findElement(By.cssSelector(".material-icons:nth-child(2)")).click();
//         driver.findElement(By.cssSelector(".file-group-root > .drag-bag-editable > div:nth-child(5) .material-icons:nth-child(2)")).click();
//         driver.findElement(By.id("arrow-drop-down")).click();
//         driver.findElement(By.id("logout-button")).click();
//     }
// }