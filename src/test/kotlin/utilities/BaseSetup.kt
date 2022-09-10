package utilities

import io.appium.java_client.AppiumDriver
import io.appium.java_client.pagefactory.AppiumFieldDecorator
import org.openqa.selenium.support.PageFactory
import java.time.Duration


open class BaseSetup  (private val driver: AppiumDriver) {

    init {
        initializeElements()
    }

    private fun initializeElements() {
        PageFactory.initElements(AppiumFieldDecorator(driver, Duration.ofSeconds(IMPLICIT_WAIT.toLong())), this);
    }

    companion object {
        val IMPLICIT_WAIT = 30
    }

}