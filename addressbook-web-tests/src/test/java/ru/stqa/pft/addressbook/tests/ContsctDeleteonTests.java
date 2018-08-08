package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContsctDeleteonTests extends TestBase {

  @Test
  public void testGroupDeleteon(){
    app.getContactHelper().goHome();
    if (! app.getContactHelper().ifThereAContact()){
      app.getContactHelper().createContact(new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests", "FaxTests", "NotesTests", "test1"), true);
    }
    app.getContactHelper().selectContsct();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().closeWindow();
    app.getContactHelper().gotoContactCreation();
  }
}
