package ru.stqa.pft.addressbook.appmeneger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;


import java.util.concurrent.TimeUnit;

public class ApplicationMeneger {
  private  String browser;
  WebDriver wd;

  private  ContactHelper contactHelper;
  private SessionHelper sessionHelper;
  private NavigetionHelper navigetionHelper;
  private GroupHelper groupHelper;
  private String brouser;

  public ApplicationMeneger(String browser) {
    this.browser = browser;
  }


  public void init() {
    if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    }else if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.IE)){
      wd = new ChromeDriver();
    }
    //wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigetionHelper = new NavigetionHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }

  public GroupHelper Group() {
    return groupHelper;
  }

  public NavigetionHelper goTo() {
    return navigetionHelper;
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }
}
