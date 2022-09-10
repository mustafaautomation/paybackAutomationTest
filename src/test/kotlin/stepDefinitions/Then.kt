package stepDefinitions

import com.tngtech.jgiven.Stage
import com.tngtech.jgiven.annotation.ProvidedScenarioState
import io.appium.java_client.AppiumDriver
import pages.CouponFilterPage
import pages.CouponPage
import pages.HomePage
import utilities.ProjectSetup

open class Then : Stage<Then?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    lateinit var homePage: HomePage
    private lateinit var couponPage: CouponPage
    lateinit var couponFilterPage: CouponFilterPage

    @Throws(InterruptedException::class)
    fun `I successfully navigated inside the application`() {
        homePage = HomePage(application.driver as AppiumDriver)
        couponPage = CouponPage(application.driver as AppiumDriver)
        couponFilterPage = CouponFilterPage(application.driver as AppiumDriver)
        homePage.validateUserOnHomePage()

    }
    @Throws(InterruptedException::class)
    fun `I am navigated to the Coupons Page`() {

        couponPage.validateUserOnCouponPage()
    }

    @Throws(InterruptedException::class)
    fun `I am navigated to Filters Screen`() {

        couponFilterPage.validateFilterPage()
    }

    @Throws(InterruptedException::class)
    fun `Rewe coupon is being displayed`() {

        couponPage.validatePartnerisSelected()
    }

    @Throws(InterruptedException::class)
    fun `I can see that Coupon Is Activated`() {

        couponPage.validateCouponIsActivated()

    }

    @Throws(InterruptedException::class)
    fun `I can see that my Activated Coupon is showed here`() {

        couponPage.validateCouponIsShownOnActivatedPage()

    }





}