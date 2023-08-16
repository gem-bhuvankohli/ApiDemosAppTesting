package stepdefinition;

import implementations.ApiDemosAppImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiDemosStepDefinition {
    @Given("the ApiDemo application is open")
    public void openTheApiDemoApplication() {
        ApiDemosAppImplementation.openApplication();
    }

    @When("the user performs a scroll action and updates wallpaper")
    public void performScrollAction() {
        ApiDemosAppImplementation.scrollAction();
    }

    @When("the user performs a drag and drop action")
    public void performDragAndDrop() {
        ApiDemosAppImplementation.dragAndDropAction();
    }

    @Then("verifying dragging and dropping element is successful by verifying text at bottom after drop")
    public void verifyDragAndDrop() {
        ApiDemosAppImplementation.verifyDragAndDrop();
    }

    @When("the user performs a double tap action")
    public void doubleTapping() {
        ApiDemosAppImplementation.doubleTapAction();
    }

    @Then("verifying double tap effect by verifying tap count text is 2")
    public void verifyDoubleTapEffect() {
        ApiDemosAppImplementation.verifyDoubleTap();
    }

    @When("the user performs a scroll up action")
    public void performScrollUpAction() {
        ApiDemosAppImplementation.scrollUpAction();
    }

    @Then("the user scrolls up to find the Events button")
    public void verifyScrollUpAction() {
        ApiDemosAppImplementation.verifyEventsButtonIsPresent();
    }

    @Then("verifying swipe action is successful by verifying width of scroll is different from initial state")
    public void verifySwipeAction() {
        ApiDemosAppImplementation.verifySwipeAction();
    }

    @When("the user performs a swipe right action")
    public void performSwipeRightAction() {
        ApiDemosAppImplementation.swipeRight();
    }

    @When("the user performs a swipe left action")
    public void performSwipeLeftAction() {
        ApiDemosAppImplementation.swipeLeft();
    }
}
