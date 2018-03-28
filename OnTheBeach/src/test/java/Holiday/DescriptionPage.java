package Holiday;

import org.openqa.selenium.By;

public class DescriptionPage extends Base {
    String exProductName;
    public String getProductName(){
        exProductName=driver.findElement(By.className("hotel-result__name")).getText();
        return exProductName;
    }
}
