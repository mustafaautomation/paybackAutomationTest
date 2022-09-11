package stepDefinitions

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import io.appium.java_client.AppiumDriver
import pages.CouponFilterPage
import pages.CouponPage
import utilities.ProjectSetup

//This class contains When Method functionalities
open class When : Stage<When?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    val application = ProjectSetup()
    lateinit var couponPage: CouponPage
    lateinit var couponFilterPage: CouponFilterPage

    @Throws(InterruptedException::class)
    fun `I click on the Coupon icon on navbar`() {
        couponPage = CouponPage(application.driver as AppiumDriver)
        couponFilterPage = CouponFilterPage(application.driver as AppiumDriver)
        couponPage.clickOnCouponPage()

    }

    @Throws(InterruptedException::class)
    fun `I click on the Filter Button`() {

        couponPage.clickOnFiltersBtn()

    }

    @Throws(InterruptedException::class)
    fun `I select REWE my preffered Coupon partner`() {

        couponFilterPage.clickOnCouponPartnerRewe()

    }

    @Throws(InterruptedException::class)
    fun `I tap on the Activate Coupon Button`() {

        couponPage.activateCoupon()

    }

    @Throws(InterruptedException::class)
    fun `I tap on the Activated Coupon Screen`() {


        couponPage.navigateToActivatedCouponsPage()

    }

}