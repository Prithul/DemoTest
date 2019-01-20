package search;

import base.CommonAPI;

public class SearchPageFacebook extends CommonAPI {

    public void searchMenu() throws InterruptedException {

        typeOnElementNEnter("#twotabsearchbox","Amela");
        navigateBack();
        typeOnElementNEnter("#twotabsearchbox","Halima");
        navigateBack();

    }
}
