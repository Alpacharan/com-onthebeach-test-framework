import Holiday.Base;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    private Base base = new Base();

    @Before
    public void setUp() {
        base.openBrowser();
        base.maximiseBrowser();
        base.navigateTo("https://www.onthebeach.co.uk/");
        base.applyImpWaits();
    }
    @After
    public void quitDriver() {
        //if (scenario.isFailed()) {
        // utils.capScreenshot(driver, scenario.getName());
    }
    /*public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            utils.capScreenshot("Screenshot");
        }
        //base.closeBrowser();
    }*/
}



