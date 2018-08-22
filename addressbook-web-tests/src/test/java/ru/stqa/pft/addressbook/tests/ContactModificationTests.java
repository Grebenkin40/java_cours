package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification(){
    app.getContactHelper().goHome();
    if (! app.getContactHelper().ifThereAContact()){
    app.getContactHelper().createContact(new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests", "FaxTests", "NotesTests", "test1"), true);
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().editContact(before.size() - 1);
    //ContactData contact = new ContactData("NameTests1", "NicknameTests2", "TitleTests3", "CompanyTests4", "Hometests5", "Faxtests6", "Notestests7", null);
    app.getContactHelper().fillContactForm(new ContactData("NameTests1", "NicknameTests2", "TitleTests3", "CompanyTests4", "Hometests5", "Faxtests6", "Notestests7", null),false);
    app.getContactHelper().updateContsct();
    app.getContactHelper().goHome();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    //before.remove(before.size() - 1);
   // before.add(contact);
   // Assert.assertEquals( new HashSet<Object>(before),  new HashSet<Object>(after));
  }

}
