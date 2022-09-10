package stepDefinitions

import com.tngtech.jgiven.Stage
import com.tngtech.jgiven.annotation.BeforeStage
import com.tngtech.jgiven.annotation.ProvidedScenarioState
import com.tngtech.jgiven.annotation.ScenarioState
import io.appium.java_client.AppiumDriver
import pages.CouponPage
import pages.HomePage
import pages.InitiateApplication
import utilities.ProjectSetup

open class Then : Stage<Then?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    lateinit var initiateApplication: InitiateApplication
    lateinit var couponPage: CouponPage





    @Throws(InterruptedException::class)
    fun `I click on the Coupon icon on navbar`() {
        application.setupDriver()
        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
        couponPage = CouponPage(application.driver as AppiumDriver)
        couponPage.clickOnCouponPage()
        couponPage.validateUserOnCouponPage()


    }
}