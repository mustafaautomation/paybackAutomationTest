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
        getScenario().startScenario("User Opens the application and redeems the Rewe coupon");
        given()
            ?.`I click on the Application icon on Drawer`()
        then()
            ?.`I successfully navigated inside the application`()
        `when`()
            ?.`I click on the Coupon icon on navbar`()
        then()
            ?.`I am navigated to the Coupons Page`()


    }



    }