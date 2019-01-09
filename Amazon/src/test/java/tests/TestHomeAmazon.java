package tests;

import org.testng.annotations.Test;
import search.SearchPageAmazon;

public class TestHomeAmazon extends SearchPageAmazon {


    @Test
    public void test1() throws InterruptedException {

        searchMenu();
        System.out.println("Search Done!!!");
    }

    @Test
    public void test2() {

        getCurrentURL();
    }

    @Test
    public void test3(){

        getPageTitle();
    }

}
