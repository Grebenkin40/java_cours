package ru.stqa.pft.addressbook.appmeneger;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{


  public ContactHelper(FirefoxDriver wd) {
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

      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[4]")).isSelected()) {
        click(By.xpath("//div[@id='content']/form/select[5]//option[4]"));
      }
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
}
