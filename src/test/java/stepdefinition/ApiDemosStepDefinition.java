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

    @Then("the user drags and drops elements successfully")
    public void verifyDragAndDrop() {
        ApiDemosAppImplementation.verifyDragAndDrop();
    }

    @When("the user performs a double tap action")
    public void doubleTapping() {
        ApiDemosAppImplementation.doubleTapAction();
    }

    @Then("the user experiences a double tap effect")
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

    @Then("the swipe action is successful")
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
