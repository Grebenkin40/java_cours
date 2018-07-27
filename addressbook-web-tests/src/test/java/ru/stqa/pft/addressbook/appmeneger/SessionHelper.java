package ru.stqa.pft.addressbook.appmeneger;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase{

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String username, String passwerd) {
    type(By.name("user"), username);
    type(By.name("pass"), passwerd);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

}
