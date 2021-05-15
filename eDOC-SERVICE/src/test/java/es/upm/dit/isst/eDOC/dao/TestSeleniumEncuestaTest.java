// Generated by Selenium IDE
package es.upm.dit.isst.eDOC.dao;
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
import java.net.MalformedURLException;
import java.net.URL;
public class TestSeleniumEncuestaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	System.setProperty( "webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testSeleniumEncuesta() {
    driver.get("http://localhost:8080/eDOC-WEBAPP/");
    driver.manage().window().setSize(new Dimension(1280, 682));
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("ana@alumnos.upm.es");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).sendKeys("ana");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.linkText("Encuestas")).click();
    driver.findElement(By.xpath("//tr[@id=\'1\']/td[5]/form/button")).click();
    driver.findElement(By.name("apuntes")).click();
    driver.findElement(By.name("apuntes")).click();
    driver.findElement(By.name("bibliografia")).click();
    driver.findElement(By.name("bibliografia")).click();
    driver.findElement(By.name("trabajos")).click();
    {
      WebElement dropdown = driver.findElement(By.name("trabajos"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("trabajos")).click();
    driver.findElement(By.name("examenes")).click();
    {
      WebElement dropdown = driver.findElement(By.name("examenes"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("examenes")).click();
    driver.findElement(By.name("sistema")).click();
    {
      WebElement dropdown = driver.findElement(By.name("sistema"));
      dropdown.findElement(By.xpath("//option[. = '5']")).click();
    }
    driver.findElement(By.name("sistema")).click();
    driver.findElement(By.name("esfuerzo")).click();
    {
      WebElement dropdown = driver.findElement(By.name("esfuerzo"));
      dropdown.findElement(By.xpath("//option[. = '2.5']")).click();
    }
    driver.findElement(By.name("esfuerzo")).click();
    driver.findElement(By.name("asistencia")).click();
    driver.findElement(By.name("asistencia")).click();
    driver.findElement(By.name("dia")).click();
    driver.findElement(By.name("dia")).click();
    driver.findElement(By.name("tutoria")).click();
    {
      WebElement dropdown = driver.findElement(By.name("tutoria"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("tutoria")).click();
    driver.findElement(By.name("interesante")).click();
    {
      WebElement dropdown = driver.findElement(By.name("interesante"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("interesante")).click();
    driver.findElement(By.name("preparacion")).click();
    driver.findElement(By.name("preparacion")).click();
    driver.findElement(By.name("conocimientos")).click();
    driver.findElement(By.name("conocimientos")).click();
    driver.findElement(By.name("horas")).click();
    {
      WebElement dropdown = driver.findElement(By.name("horas"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("horas")).click();
    driver.findElement(By.name("solapamientos")).click();
    {
      WebElement dropdown = driver.findElement(By.name("solapamientos"));
      dropdown.findElement(By.xpath("//option[. = '5']")).click();
    }
    driver.findElement(By.name("solapamientos")).click();
    driver.findElement(By.name("evaluacion")).click();
    driver.findElement(By.name("evaluacion")).click();
    driver.findElement(By.name("participacion")).click();
    driver.findElement(By.name("participacion")).click();
    driver.findElement(By.name("interes")).click();
    {
      WebElement dropdown = driver.findElement(By.name("interes"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("interes")).click();
    driver.findElement(By.name("guia")).click();
    driver.findElement(By.name("guia")).click();
    driver.findElement(By.name("accesible")).click();
    {
      WebElement dropdown = driver.findElement(By.name("accesible"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("accesible")).click();
    driver.findElement(By.name("coordinacion")).click();
    driver.findElement(By.name("coordinacion")).click();
    driver.findElement(By.name("horario")).click();
    {
      WebElement dropdown = driver.findElement(By.name("horario"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("horario")).click();
    driver.findElement(By.name("claridad")).click();
    driver.findElement(By.name("claridad")).click();
    driver.findElement(By.name("repetir")).click();
    driver.findElement(By.name("repetir")).click();
    driver.findElement(By.name("satisfaccion")).click();
    {
      WebElement dropdown = driver.findElement(By.name("satisfaccion"));
      dropdown.findElement(By.xpath("//option[. = '7.5']")).click();
    }
    driver.findElement(By.name("satisfaccion")).click();
    driver.findElement(By.id("comentarios")).click();
    driver.findElement(By.id("comentarios")).sendKeys("Ha sido una asignatura muy interesante");
    driver.findElement(By.name("terms")).click();
    driver.findElement(By.name("submit")).click();
  }
}
