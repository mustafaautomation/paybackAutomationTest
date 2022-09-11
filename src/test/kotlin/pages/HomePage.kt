package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import utilities.BaseSetup

//This class contains element and action for Home Page
class HomePage(driver: AppiumDriver) : BaseSetup(driver) {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Aktuell']")
    var homeNav: WebElement? = null

    fun validateUserOnHomePage()
    {
        homeNav?.isEnabled
    }

}