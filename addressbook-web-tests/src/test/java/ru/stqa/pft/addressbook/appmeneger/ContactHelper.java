package ru.stqa.pft.addressbook.appmeneger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

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

  public void fillContactForm(ContactData contactData, boolean crearion) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("home"), contactData.getHome());
    type(By.name("fax"), contactData.getFax());
    type(By.name("notes"), contactData.getNotes());

   // if (crearion){
  //    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
  //  } else {
   //   Assert.assertFalse(isElementPresent(By.name("new_group")));
  //  }
  }

  private void name(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void gotoContactCreation() {
    click(By.linkText("add new"));
  }

  public void selectContsct(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void deleteSelectedContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void editContact(int index) {
    wd.findElements(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).get(index).click();
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





  public void createContact(ContactData contact, boolean b) {
    gotoContactCreation();
    fillContactForm(contact, b);
    submitContactForm();
    reternToContactPage();
  }

  public boolean ifThereAContact() {
    return isElementPresent(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public int getContactCount() {
   return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("selected[]"));
    for (WebElement element : elements){
      String name = element.getText();
      ContactData contact = new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests", "FaxTests", "NotesTests", "test1");
    contacts.add(contact);
    }
  return contacts;
  }

  // public void setContactCount(int contactCount) {
 //   this.contactCount = contactCount;
//  }
}

