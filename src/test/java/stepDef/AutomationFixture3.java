package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class AutomationFixture3 extends BaseFixture {

//    public static WebDriver driver= null;

//    @Given("I setup CHROME browser")
//    public void i_setup_chrome_browser() {
//
//        System.out.println("Chrome Launched");
//    }

    @And("I open url {string}")
    public void iOpenUrl(String arg0) {
        System.out.println("URL Opened");
        // String baseUrl = "https://in.linkedin.com/";
        driver.get(arg0);  //hit url
        driver.manage().window().maximize();
    }


    @Given("I click on button {string}")
    public void iClickOnButton(String arg0) {
        System.out.println("Clicked on button");
    }

    @And("I wait for {string} second")
    public void iWaitForSecond(String arg0) throws InterruptedException {
        Thread.sleep(5000);
    }


    @Given("I populate field {string} with value {string}")
    public void iPopulateFieldWithValue(String arg0, String arg1) {
        
        
    }

    @And("I populate picker field {string} with value {string}")
    public void iPopulatePickerFieldWithValue(String arg0, String arg1) {
        
    }

    @And("I wait for progress bar  \\/\\/ wait- Explicit, Implicit, fluent")
    public void iWaitForProgressBarWaitExplicitImplicitFluent() {
        
    }

    @And("I populate dropdown field {string} with value {string}")
    public void iPopulateDropdownFieldWithValue(String arg0, String arg1) {
    }
}
