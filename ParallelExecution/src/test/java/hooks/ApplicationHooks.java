package hooks;

 

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utilities.Context;

public class ApplicationHooks {

public Context context;

 

    public ApplicationHooks(Context context) {
        this.context = context;
    }

    @After
    public void tearDown( )  {
        context.getDriver().close();
    }

    @AfterStep  // in case of error or the test case failure the screen will captured
    public void addScreenshot(Scenario scenario) {

        WebDriver driver =  context.getDriver();
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }

    }

}