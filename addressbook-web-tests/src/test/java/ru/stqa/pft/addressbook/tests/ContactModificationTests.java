package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification(){
    //app.getContactHelper().gotoContactCreation();
   // app.getContactHelper().fillContactForm(new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests","Faxtests", "Notestests", null),true);
   // app.getContactHelper().submitContactForm();
   // app.getContactHelper().reternToContactPage();
    app.getContactHelper().goHome();
    app.getContactHelper().editContact();
    app.getContactHelper().fillContactForm(new ContactData("NameTests1", "NicknameTests2", "TitleTests3", "CompanyTests4", "Hometests5", "Faxtests6", "Notestests7", null),false);
    app.getContactHelper().updateContsct();
    app.getContactHelper().goHome();
  }

}
