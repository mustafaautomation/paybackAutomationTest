package utilities

import io.appium.java_client.AppiumDriver
import io.appium.java_client.remote.AndroidMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.MalformedURLException
import java.net.URL
import java.util.concurrent.TimeUnit

class ProjectSetup {

    val driver: WebDriver
        get() = Companion.driver

    companion object {
        lateinit var driver: WebDriver
            private set
    }
    fun setupDriver() {


        val capabilities = DesiredCapabilities()
        setDesiredCapabiltiesForAndroid(capabilities)
        try {
            Companion.driver = AppiumDriver(URL("http://0.0.0.0:4723/wd/hub"), capabilities).apply {
            }
        } catch (e: MalformedURLException) {
            e.printStackTrace()
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)
    }

    fun setDesiredCapabiltiesForAndroid( desiredCapabilities: DesiredCapabilities){

        val PLATFORM_NAME: String = PropertyUtils.getProperty("android.platform")
        val PLATFORM_VERSION: String = PropertyUtils.getProperty("android.platform.version")
        val DEVICE_NAME: String = PropertyUtils.getProperty("android.device.name")
        val APP_FULL_RESET: String = PropertyUtils.getProperty("android.app.full.reset")
        val APP_NO_RESET: String = PropertyUtils.getProperty("android.app.no.reset")

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME)
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME)
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION)
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, APP_FULL_RESET)
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, APP_NO_RESET)
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true)

    }

    fun closeDriver() {
        driver.close()
    }
}