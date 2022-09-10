package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import utilities.BaseSetup

class CouponFilterPage(driver: AppiumDriver) : BaseSetup(driver){


    @AndroidFindBy(xpath = "//android.widget.FrameLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView")
    var couponPartnerRewe: WebElement? = null

    @AndroidFindBy(id = "de.payback.client.android:id/done")
    var doneBtn: WebElement? = null

    @AndroidFindBy(id = "de.payback.client.android:id/coupon_action_reset")
    var resetBtn: WebElement? = null




    fun clickOnCouponPartnerRewe()
    {
        couponPartnerRewe?.click()
    }

    fun validateFilterPage()
    {
        doneBtn?.isDisplayed
        resetBtn?.isDisplayed
    }


}