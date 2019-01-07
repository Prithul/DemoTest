package search;

import base.CommonAPI;

public class SearchPageCNN extends CommonAPI {


    public void searchMenu() throws InterruptedException {

        typeOnElementNEnter("#twotabsearchtextbox","Politics");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","Weather");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","Finance");
    }
}
