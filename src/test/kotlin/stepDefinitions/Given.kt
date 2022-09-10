package stepDefinitions

import com.tngtech.jgiven.Stage
import com.tngtech.jgiven.annotation.BeforeStage
import com.tngtech.jgiven.annotation.ProvidedScenarioState
import com.tngtech.jgiven.annotation.ScenarioState
import io.appium.java_client.AppiumDriver
import pages.HomePage
import pages.InitiateApplication
import utilities.ProjectSetup

open class Given : Stage<Given?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    lateinit var initiateApplication: InitiateApplication
    lateinit var homePage: HomePage




    @BeforeStage
    @Throws(InterruptedException::class)
    fun `I click on the Application icon on Drawer`() {

        application.setupDriver()
        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
        homePage = HomePage(application.driver as AppiumDriver)
        initiateApplication.openApplicationFromList();

    }

    @BeforeStage
    @Throws(InterruptedException::class)
    fun `I successfully navigated inside the application`() {


        homePage.validateUserOnHomePage()

    }

}