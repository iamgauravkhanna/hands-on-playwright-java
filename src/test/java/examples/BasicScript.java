package examples;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BasicScript {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();

        Browser browser = playwright.firefox().launch();

        Page page = browser.newPage();
        page.navigate("http://playwright.dev");

        System.out.println(page.title());

        playwright.close();
    }
}