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

    // Scroll and Swipe locators
    public static final By navigateUpBtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");
    public static final By translationX = By.id("com.touchboarder.android.api.demos:id/translationX");
    public static final By rotatingSwipeBtn = By.id("com.touchboarder.android.api.demos:id/rotatingButton");

    // Verification locators
    public static final By verifyNumberOfTapsText = By.className("android.widget.TextView");
    public static final By verifyDragDropText = By.id("com.touchboarder.android.api.demos:id/drag_text");
    public static final By hoverButtonIsPresent = By.className("android.widget.Button");
}