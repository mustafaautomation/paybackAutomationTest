package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import utilities.BaseSetup

class CouponPage(driver: AppiumDriver) : BaseSetup(driver) {


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Coupons']")
    var couponIconNav: WebElement? = null

    fun validateUserOnCouponPage()
    {
        couponIconNav?.isEnabled
    }




}