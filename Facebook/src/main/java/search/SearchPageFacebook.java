package search;

import base.CommonAPI;

public class SearchPageFacebook extends CommonAPI {

    public void searchMenu() throws InterruptedException {

        typeOnElementNEnter("#twotabsearchtextbox","Papri");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","Halima");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","Amela");
    }
}
