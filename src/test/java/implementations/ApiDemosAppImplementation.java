package implementations;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import utils.ConfigReader;

import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ApiDemosAppImplementation {
    public static AppiumDriver driver;

    /**
     * Opens the application.
     * Initializes the appium driver with desired capabilities and opens the application.
     */
    public static void openApplication() {
        try {
            // Set up desired capabilities
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", ConfigReader.getProperty("appium.deviceName"));
            cap.setCapability("udid", ConfigReader.getProperty("appium.udid"));
            cap.setCapability("platformName", ConfigReader.getProperty("appium.platformName"));
            cap.setCapability("app", System.getProperty("user.dir") + ConfigReader.getProperty("appium.appPath"));
            cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

            // Initialize the driver
            URL url = new URL(ConfigReader.getProperty("appium.appUrl"));
            driver = new AndroidDriver(url, cap);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Performs scroll action.
     * Simulates scrolling actions within the application.
     */
    public static void scrollAction() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Click on the positive button
        WebElement positiveButton = driver.findElement(Locators.positiveButton);
        positiveButton.click();

        // Click on the API Demos button
        WebElement apiDemosBtn = driver.findElement(Locators.apiDemosBtn);
        apiDemosBtn.click();

        // Click on App button
        WebElement appBtn = driver.findElement(Locators.appBtn);
        appBtn.click();

        // Click on Activity button
        WebElement activityBtn = driver.findElement(Locators.activityBtn);
        activityBtn.click();

        // Scroll to SetWallpaper option
        WebElement setWallpaper = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"SetWallpaper\").instance(0))"));
        setWallpaper.click();

        // Click on the Set Wallpaper button
        WebElement setWallpaperBtn = driver.findElement(Locators.setWallpaperBtn);
        setWallpaperBtn.click();

        // Navigate back
        driver.navigate().back();
        driver.navigate().back();
    }

    /**
     * Performs drag and drop action.
     * Simulates a drag and drop action within the application.
     */
    public static void dragAndDropAction() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Click on the navigate up button
        WebElement navigateUpBtn = driver.findElement(Locators.navigateUpBtn);
        navigateUpBtn.click();

        // Click on the Views button
        WebElement viewsBtn = driver.findElement(Locators.viewsBtn);
        viewsBtn.click();

        // Click on the Drag and Drop button
        WebElement dragAndDropBtn = driver.findElement(Locators.dragAndDropBtn);
        dragAndDropBtn.click();

        // Perform drag and drop
        WebElement dragDot1 = driver.findElement(Locators.dragDot1);
        WebElement dragDot2 = driver.findElement(Locators.dragDot2);
        TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
        LongPressOptions lp = new LongPressOptions();
        lp.withElement(ElementOption.element(dragDot1))
                .withDuration(Duration.ofSeconds(3));
        touchAction.longPress(lp)
                .moveTo(ElementOption.element(dragDot2))
                .release()
                .perform();

        // Navigate back
        driver.navigate().back();
    }

    /**
     * Performs double tap action.
     * Simulates a double tap action within the application.
     */
    public static void doubleTapAction() {
        // Click on the TextSwitcher button
        WebElement textSwitcherBtn = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"TextSwitcher\").instance(0))"));
        textSwitcherBtn.click();

        // Perform double tap
        WebElement nextBtn = driver.findElement(Locators.nextBtn);
        TapOptions tapOptions = new TapOptions();
        tapOptions.withElement(ElementOption.element(nextBtn)).withTapsCount(2);
        TouchAction action = new TouchAction<>((PerformsTouchActions) driver);
        action.tap(tapOptions).perform();

        // Navigate back
        driver.navigate().back();
    }

    /**
     * Performs scroll-up action.
     * Simulates scrolling up within the application.
     */
    public static void scrollUpAction() {
        // Scroll up to find the Events button
        WebElement eventsBtn = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Events\").instance(0))"));
        eventsBtn.click();
        driver.navigate().back();
    }
    /**
     * Performs swipe right action.
     * Simulates swiping within the application.
     */
    public static void swipeAction(){
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Rotating Button\").instance(0))")).click();
        WebElement translationX = driver.findElement(Locators.translationX);
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)translationX).getId(),
                "direction","right",
                "percent","0.75"
        ));
    }
}
