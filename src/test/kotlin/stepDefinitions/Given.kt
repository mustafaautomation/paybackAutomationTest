package stepDefinitions

import com.tngtech.jgiven.Stage
import com.tngtech.jgiven.annotation.*
import io.appium.java_client.AppiumDriver
import org.junit.jupiter.api.BeforeAll
import pages.CouponFilterPagePage
import pages.CouponPage
import pages.HomePage
import pages.InitiateApplication
import utilities.ProjectSetup

open class Given : Stage<Given?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    private lateinit var initiateApplication: InitiateApplication
    lateinit var homePage: HomePage
    lateinit var couponPage: CouponPage
    lateinit var couponFilterPagePage: CouponFilterPagePage




    fun init(){
        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
        homePage = HomePage(application.driver as AppiumDriver)
        couponPage = CouponPage(application.driver as AppiumDriver)
        couponFilterPagePage = CouponFilterPagePage(application.driver as AppiumDriver)
        application.setupDriver()

    }

    @Throws(InterruptedException::class)
    fun `I click on the Application icon on Drawer`() {

        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
        initiateApplication.openApplicationFromList();

    }

}