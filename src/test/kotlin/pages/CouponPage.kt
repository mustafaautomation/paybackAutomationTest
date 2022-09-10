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

    @AndroidFindBy(id = "de.payback.client.android:id/not_activated_button")
    var couponNotActivatedBtn: WebElement? = null

    @AndroidFindBy(xpath = "//android.widget.Button[@text='REWE']")
    var selectedFilterOnCouponPage: WebElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='auf den Einkauf im REWE Markt oder beim Lieferservice!*']")
    var filteredCouponDescription: WebElement? = null

    @AndroidFindBy(id = "de.payback.client.android:id/redeem_offline_button")
    var redeemOfflineBtn: WebElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Aktiviert')]")
    var activatedCouponsPage: WebElement? = null

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Nicht aktiviert')]")
    var notActivatedCouponsPage: WebElement? = null






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

    fun validatePartnerisSelected(){

        selectedFilterOnCouponPage?.isDisplayed
        filteredCouponDescription?.isDisplayed
    }

    fun activateCoupon(){
        couponNotActivatedBtn?.isEnabled
        couponNotActivatedBtn?.click()
        redeemOfflineBtn?.isEnabled
    }

    fun validateCouponIsActivated(){


        filteredCouponDescription?.isDisplayed
        redeemOfflineBtn?.isEnabled

    }

    fun navigateToActivatedCouponsPage(){
        selectedFilterOnCouponPage?.click()
        activatedCouponsPage?.click()
    }

    fun validateCouponIsShownOnActivatedPage(){


        filteredCouponDescription?.isDisplayed
        redeemOfflineBtn?.isEnabled

    }



}