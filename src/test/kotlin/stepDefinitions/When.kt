package stepDefinitions

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeStage
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import io.appium.java_client.AppiumDriver
import pages.CouponFilterPagePage
import pages.CouponPage
import pages.HomePage
import pages.InitiateApplication
import utilities.ProjectSetup

open class When : Stage<When?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    val application = ProjectSetup()
    lateinit var couponPage: CouponPage
    lateinit var couponFilterPagePage: CouponFilterPagePage

    @Throws(InterruptedException::class)
    fun `I click on the Coupon icon on navbar`() {
        couponPage = CouponPage(application.driver as AppiumDriver)
        couponFilterPagePage = CouponFilterPagePage(application.driver as AppiumDriver)
        couponPage.clickOnCouponPage()

    }

    @Throws(InterruptedException::class)
    fun `I click on the Filter Button`() {

        couponPage.clickOnFiltersBtn()

    }

    @Throws(InterruptedException::class)
    fun `I select REWE my preffered Coupon partner`() {

        couponFilterPagePage.clickOnCouponPartnerRewe()

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