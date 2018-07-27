package ru.stqa.pft.addressbook.appmeneger;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigetionHelper extends HelperBase{


  public NavigetionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupCreation() {
      click(By.linkText("groups"));
  }
}
