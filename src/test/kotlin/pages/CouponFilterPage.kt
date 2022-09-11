package pages

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.WebElement
import utilities.BaseSetup
//this class contains Coupons Filter Page elements and actions
class CouponFilterPage(driver: AppiumDriver) : BaseSetup(driver){

    //elements of Coupons Filter Page
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[3]/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView")
    var couponPartnerRewe: WebElement? = null

    @AndroidFindBy(id = "de.payback.client.android:id/done")
    var doneBtn: WebElement? = null

    @AndroidFindBy(id = "de.payback.client.android:id/coupon_action_reset")
    var resetBtn: WebElement? = null

    //Actions of Coupon Filter Page
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