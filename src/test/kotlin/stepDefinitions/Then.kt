package stepDefinitions

import com.tngtech.jgiven.Stage
import com.tngtech.jgiven.annotation.BeforeStage
import com.tngtech.jgiven.annotation.ProvidedScenarioState
import com.tngtech.jgiven.annotation.ScenarioState
import io.appium.java_client.AppiumDriver
import pages.CouponFilterPagePage
import pages.CouponPage
import pages.HomePage
import pages.InitiateApplication
import utilities.ProjectSetup

open class Then : Stage<Then?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    lateinit var initiateApplication: InitiateApplication
    lateinit var homePage: HomePage
    private lateinit var couponPage: CouponPage
    lateinit var couponFilterPagePage: CouponFilterPagePage

    @BeforeStage
    fun init(){
        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
        homePage = HomePage(application.driver as AppiumDriver)
        couponPage = CouponPage(application.driver as AppiumDriver)
        couponFilterPagePage = CouponFilterPagePage(application.driver as AppiumDriver)

    }

    @Throws(InterruptedException::class)
    fun `I successfully navigated inside the application`() {

        homePage.validateUserOnHomePage()

    }
    @Throws(InterruptedException::class)
    fun `I am navigated to the Coupons Page`() {
        couponPage.validateUserOnCouponPage()
    }

}