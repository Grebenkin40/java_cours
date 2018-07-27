package ru.stqa.pft.addressbook.appmeneger;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationMeneger {
  FirefoxDriver wd;

  private SessionHelper sessionHelper;
  private NavigetionHelper navigetionHelper;
  private GroupHelper groupHelper;


  public void init() {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    groupHelper = new GroupHelper(wd);
    navigetionHelper = new NavigetionHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigetionHelper getNavigetionHelper() {
    return navigetionHelper;
  }
}
