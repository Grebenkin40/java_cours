package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContsctDeleteonTests extends TestBase {

  @Test
  public void testGroupDeleteon(){
    app.getContactHelper().gotoContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests","Faxtests", "Notestests"));
    app.getContactHelper().submitContactForm();
    app.getContactHelper().reternToContactPage();
    app.getContactHelper().selectContsct();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().closeWindow();
    app.getContactHelper().gotoContactCreation();
  }
}
