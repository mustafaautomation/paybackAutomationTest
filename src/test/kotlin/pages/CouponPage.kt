package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import utilities.BaseSetup

class CouponPage(driver: AppiumDriver) : BaseSetup(driver) {


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Coupons']")
    var couponIconNav: WebElement? = null

    @AndroidFindBy(id = "de.payback.client.android:id/filter_button")
    var filtersBtn: WebElement? = null

    @AndroidFindBy(xpath = "")
    var : WebElement? = null

    @AndroidFindBy(xpath = "")
    var : WebElement? = null

    @AndroidFindBy(xpath = "")
    var : WebElement? = null


    fun validateUserOnCouponPage()
    {
        couponIconNav?.isEnabled
    }

    fun clickOnCouponPage()
    {
        couponIconNav?.click()
    }

    fun clickOnFiltersBtn(){

        filtersBtn?.click()
    }





}