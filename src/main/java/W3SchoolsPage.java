import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class W3SchoolsPage {

    private WebDriver driver;



    

    public W3SchoolsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getCompanyName(String companyName){

         String Xpath = String.format("//td[text()='%s']",companyName);
         return driver.findElement(By.xpath(Xpath)).getText();

    }

    public String getCountry(String country){

        String Xpath = String.format("//td[text()='%s']",country);
        return driver.findElement(By.xpath(Xpath)).getText();

    }









}
