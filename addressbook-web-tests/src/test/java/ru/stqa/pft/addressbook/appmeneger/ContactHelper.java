package ru.stqa.pft.addressbook.appmeneger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{


  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void reternToContactPage() {
    click(By.linkText("home page"));
  }

  public void submitContactForm() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type (By.name("firstname"), contactData.getName());
    type (By.name("nickname"), contactData.getNickname());
    type (By.name("title"), contactData.getTitle());
    type (By.name("company"), contactData.getCompany());
    type (By.name("home"), contactData.getHome());
    type (By.name("fax"), contactData.getFax());
    type (By.name("notes"), contactData.getNotes());
  }

  private void name(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void gotoContactCreation() {
    click(By.linkText("add new"));
  }

  public void selectContsct() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void editContact() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void updateContsct() {
    click(By.name("update"));
  }


  public void goHome() {
    click(By.linkText("home"));
  }

  public void closeWindow() {
    wd.switchTo().alert().accept();
  }
}
