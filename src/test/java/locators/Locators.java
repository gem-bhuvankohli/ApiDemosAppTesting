package locators;

import org.openqa.selenium.By;

public class Locators {
    // Common locators
    public static final By positiveButton = By.id("com.touchboarder.android.api.demos:id/buttonDefaultPositive");

    // API Demos page locators
    public static final By apiDemosBtn = By.xpath("//*[@text='API Demos']");
    public static final By appBtn = By.xpath("//*[@text='App']");
    public static final By activityBtn = By.xpath("//*[@text='Activity']");
    public static final By setWallpaperBtn = By.id("com.touchboarder.android.api.demos:id/setwallpaper");

    // Views and Drag and Drop locators
    public static final By viewsBtn = By.xpath("//*[@text='Views']");
    public static final By dragAndDropBtn = By.xpath("//*[@text='Drag and Drop']");
    public static final By dragDot1 = By.id("com.touchboarder.android.api.demos:id/drag_dot_1");
    public static final By dragDot2 = By.id("com.touchboarder.android.api.demos:id/drag_dot_2");

    // Double Tap locator
    public static final By nextBtn = By.id("com.touchboarder.android.api.demos:id/next");

    public static final By navigateUpBtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
}
