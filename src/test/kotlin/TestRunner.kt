import com.tngtech.jgiven.annotation.ScenarioState
import com.tngtech.jgiven.junit.ScenarioTest
import io.appium.java_client.AppiumDriver
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebDriver
import pages.InitiateApplication
import stepDefinitions.Given
import stepDefinitions.Then
import stepDefinitions.When
import utilities.ProjectSetup


open class TestRunner: ScenarioTest<Given?, When?,Then?>() {
    private val application = ProjectSetup()
    private lateinit var initiateApplication: InitiateApplication
    fun setup(){
        application.setupDriver()
        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
    }

    @ScenarioState
    var driver: AppiumDriver? = null

    @Before
    fun openApplicationFromDrawer()  {

        setup()


    }
    @Test
    fun jgivenScenario(){
        getScenario().startScenario("");
        given()
            ?.`I click on the Application icon on Drawer`();
        given()
            ?.`I successfully navigated inside the application`()
    }



    }