package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import utilities.BaseSetup

class InitiateApplication(driver: AppiumDriver) : BaseSetup(driver) {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"PAYBACK\"]")
    var applicationIcon: WebElement? = null

    fun openApplicationFromList()
    {
        applicationIcon?.click()
    }




}