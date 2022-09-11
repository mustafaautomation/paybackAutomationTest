package stepDefinitions

import com.tngtech.jgiven.Stage
import com.tngtech.jgiven.annotation.*
import io.appium.java_client.AppiumDriver
import pages.InitiateApplication
import utilities.ProjectSetup

//This class contains Given Method functionalities
open class Given : Stage<Given?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    private lateinit var initiateApplication: InitiateApplication

    @Throws(InterruptedException::class)
    fun `I click on the Application icon on Drawer`() {

        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
        initiateApplication.openApplicationFromList();

    }

}