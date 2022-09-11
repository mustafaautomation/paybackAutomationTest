package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import utilities.BaseSetup

//this class contain action and element to initiate Application from drawer
class InitiateApplication(driver: AppiumDriver) : BaseSetup(driver) {

    //element of this class
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"PAYBACK\"]")
    var applicationIcon: WebElement? = null

    //Action of this class
    fun openApplicationFromList()
    {
        applicationIcon?.click()
    }

}