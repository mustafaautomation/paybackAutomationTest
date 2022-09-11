import com.tngtech.jgiven.annotation.ScenarioState
import com.tngtech.jgiven.junit.ScenarioTest
import io.appium.java_client.AppiumDriver
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.WebDriver
import pages.InitiateApplication
import stepDefinitions.Given
import stepDefinitions.Then
import stepDefinitions.When
import utilities.ProjectSetup


//This is test runner class
open class TestRunner: ScenarioTest<Given?, When?,Then?>() {
    private val application = ProjectSetup()
    private lateinit var initiateApplication: InitiateApplication
    //Function to init Everything
    fun setup(){
        application.setupDriver()
        initiateApplication = InitiateApplication(application.driver as AppiumDriver)
    }

    //function to shutdown driwer
    fun shutDown(){
        application.closeDriver()
    }

    @ScenarioState
    var driver: AppiumDriver? = null

    @Before
    fun openApplicationFromDrawer()  {

        setup()

    }

    //Jgiven Scenario
    @Test
    fun jgivenScenario(){
        getScenario().startScenario("User Opens the application and Activate the Rewe partner Coupon");
        given()
            ?.`I click on the Application icon on Drawer`()
        then()
            ?.`I successfully navigated inside the application`()
        `when`()
            ?.`I click on the Coupon icon on navbar`()
        then()
            ?.`I am navigated to the Coupons Page`()
        `when`()
            ?.`I click on the Filter Button`()
        then()
            ?.`I am navigated to Filters Screen`()
        `when`()
            ?.`I select REWE my preffered Coupon partner`()
        then()
            ?.`Rewe coupon is being displayed`()
        `when`()
            ?.`I tap on the Activate Coupon Button`()
        then()
            ?.`I can see that Coupon Is Activated`()
        `when`()
            ?.`I tap on the Activated Coupon Screen`()
        then()
            ?.`I can see that my Activated Coupon is showed here`()

    }

    @After
    fun closeApplication(){
        shutDown()
    }


}