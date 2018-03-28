package Holiday;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HeaderPage extends Base {
    Utils utils = new Utils();

    public void clickToCategory(String to) {
        List<WebElement> megaNavLists = driver.findElements(By.cssSelector(".search-mode-selector__link"));
        for (WebElement element : megaNavLists) {
            if (element.getText().equalsIgnoreCase(to)) {
                element.click();
                break;
            }
        }
    }

    public void selectDestination(String dest) {
        Select drpCountry = new Select(driver.findElement(By.name("search[destination_id]")));
        drpCountry.selectByVisibleText(dest);
    }

    public void selectAirport(String dest) {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Select drpCountry = new Select(driver.findElement(By.name("search[departing_from]")));
        drpCountry.selectByValue(dest);
    }

    public void clickDaNi(String d) {
        List<WebElement> months = driver.findElements(By.cssSelector("button.search-input"));
        for (WebElement element : months) {
            if (element.getText().equalsIgnoreCase(d)) {
                element.click();
                break;
            }
        }
    }

    public void selectDate(String month, String date) {
        // driver.findElement(By.cssSelector("button.search-input")).click();
        driver.findElement(By.className("toggle-switch__handle")).click();
        List<WebElement> months = driver.findElements(By.cssSelector(".column-4.panel-toggle-input-container"));
        for (WebElement element : months) {
            if (element.getText().equalsIgnoreCase(month)) {
                element.click();
                break;
            }
        }
        List<WebElement> days = driver.findElements(By.cssSelector(".datepicker__date"));
        for (WebElement element : days) {
            if (element.getText().equalsIgnoreCase(date)) {
                element.click();
                break;
            }
        }
    }

    public void nightSelect(String numberOfNight) {
        List<WebElement> nights = driver.findElements(By.cssSelector(".column-3.panel-toggle-input-container"));
        for (WebElement element : nights) {
            if (element.getText().equalsIgnoreCase(numberOfNight)) {
                element.click();
                break;
            }
        }
    }
    public void selectParty(String party,String children,String infant){
        List<WebElement> months = driver.findElements(By.cssSelector("button.search-input"));
        for (WebElement element : months) {
            if (element.getAttribute("data-field").equalsIgnoreCase(party)) {
                element.click();
                break;
            }
        }
        Select chilren=new Select(driver.findElement(By.name("search[children]")));
        chilren.selectByValue(children);
        Select infan=new Select(driver.findElement(By.name("search[infants]")));
        infan.selectByValue(infant);
    }
    public void search(){
        driver.findElement(By.cssSelector(".search-submit-container")).click();
    }
}