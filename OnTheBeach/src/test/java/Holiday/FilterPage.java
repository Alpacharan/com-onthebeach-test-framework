package Holiday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FilterPage extends Base {
    String AcProductName;
  /*  public void filter(String fil) {
        List<WebElement> filter = driver.findElements(By.cssSelector(".filters__label.filters__label--checkbox"));
        for (WebElement element : filter) {
            if (element.getText().equalsIgnoreCase(fil)) {
                element.click();
                break;
            }
        }
    }*/

    public void setFilterRating(String filRating) {
        List<WebElement> filterRating = driver.findElements(By.cssSelector(".filters__label.filters__label--checkbox"));
        for (WebElement element : filterRating) {
            if (element.getAttribute("for").equalsIgnoreCase(filRating)) {
                element.click();
                break;
            }
        }
    }

    public void expandFilterType(String type, String fil) {
        List<WebElement> expandFilterTypes = driver.findElements(By.cssSelector(".filters__group"));
        for (WebElement expandFilterType : expandFilterTypes) {
            if (expandFilterType.getText().contains(type)) {
                if (expandFilterType.getAttribute("data-expanded").equalsIgnoreCase("false")) {
                    expandFilterType.click();
                    break;
                }
            }
        }

        List<WebElement> filter = driver.findElements(By.cssSelector(".filters__label.filters__label--checkbox"));
        for (WebElement element : filter) {
            if (element.getText().equalsIgnoreCase(fil)) {
                element.click();
                break;
            }
        }
    }

    public void clickGrid(String listGrid) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> listgrid = driver.findElements(By.cssSelector("div[class=\"result-display__header result-display__header--flush result-display__header--right\"]>button"));
        for (WebElement element : listgrid) {
            if (element.getText().equalsIgnoreCase(listGrid)) {
                element.click();
                break;
            }
        }
    }
    public String getProductName() {
        AcProductName = driver.findElement(By.xpath(".//*[@id='search_results']/div[1]/div[6]/div/a/div/div[1]/h2")).getText();
        return AcProductName;
    }
    public void selectDest(String place){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<WebElement> filter = driver.findElements(By.cssSelector(".deal-result__name"));
        for (WebElement element : filter) {
            if (element.getText().equalsIgnoreCase(place)) {
                element.click();
                break;
            }
        }
    }

}