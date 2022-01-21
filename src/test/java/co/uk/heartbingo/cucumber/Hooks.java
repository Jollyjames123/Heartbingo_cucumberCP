package co.uk.heartbingo.cucumber;

import co.uk.heartbingo.propertyreader.PropertyReader;
import co.uk.heartbingo.utility.Utility;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utility {

    //This will run before every scenario
    @Before
    public void setUp() {

        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
        Reporter.assignAuthor("Chetan Patel");
    }

    //This will run after every scenario
    @After
    public void tearDown(Scenario scenario) {

        //Using isfailed() method from Scenario interface for taking screenshot if scenario fails
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                //add screenshot to the report
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
