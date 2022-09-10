package stepDefinitions

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.annotation.ScenarioState;
import io.appium.java_client.AppiumDriver
import pages.HomePage
import pages.InitiateApplication
import utilities.ProjectSetup

open class When : Stage<When?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    lateinit var initiateApplication: InitiateApplication
    lateinit var homePage: HomePage




    @Throws(InterruptedException::class)
    fun `I successfully navigated inside the application`() {
        homePage = HomePage(application.driver as AppiumDriver)

        homePage.validateUserOnHomePage()

    }


    @Throws(InterruptedException::class)
    fun `I click on the coupon to consume`(): When? {


        return self()
    }
}