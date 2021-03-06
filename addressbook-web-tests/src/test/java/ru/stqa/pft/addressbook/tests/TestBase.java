package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import ru.stqa.pft.addressbook.appmeneger.ApplicationMeneger;

public class TestBase {

  protected static final ApplicationMeneger app = new ApplicationMeneger(BrowserType.CHROME);


  @BeforeSuite

  public void setUp() throws Exception {
    app.init();
  }

  @AfterSuite
  public void tearDown() {
    app.stop();
  }

}
