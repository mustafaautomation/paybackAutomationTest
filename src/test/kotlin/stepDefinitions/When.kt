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
    @ScenarioState
    lateinit var homePage: HomePage






    @Throws(InterruptedException::class)
    fun `I click on the coupo to consume`(): When? {


        return self()
    }
}