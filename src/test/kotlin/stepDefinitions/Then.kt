package stepDefinitions

import com.tngtech.jgiven.Stage
import com.tngtech.jgiven.annotation.BeforeStage
import com.tngtech.jgiven.annotation.ProvidedScenarioState
import com.tngtech.jgiven.annotation.ScenarioState
import io.appium.java_client.AppiumDriver
import pages.InitiateApplication
import utilities.ProjectSetup

open class Then : Stage<Then?>() {
    @ProvidedScenarioState
    var driver: AppiumDriver? = null
    private val application = ProjectSetup()
    lateinit var initiateApplication: InitiateApplication




    @BeforeStage
    @Throws(InterruptedException::class)
    fun `I click on the Application icon on Drawer`(): Then? {
        application.setupDriver()
        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
//        initiateApplication.openApplicationFromList();

        return self()
    }
}