package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchPageAmazon extends CommonAPI {

        public void searchMenu() throws InterruptedException {

            typeOnElementNEnter("#twotabsearchtextbox","Books");
            navigateBack();
            typeOnElementNEnter("#twotabsearchtextbox","Toys");
            navigateBack();
            typeOnElementNEnter("#twotabsearchtextbox","iPhone");
        }

}
