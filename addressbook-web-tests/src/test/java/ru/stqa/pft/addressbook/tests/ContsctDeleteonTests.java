package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContsctDeleteonTests extends TestBase {

  @Test
  public void testGroupDeleteon(){
    app.getContactHelper().goHome();
    List<ContactData> before = app.getContactHelper().getContactList();
    if (! app.getContactHelper().ifThereAContact()){
      app.getContactHelper().createContact(new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests", "FaxTests", "NotesTests", "test1"), true);
    }
    app.getContactHelper().selectContsct(before.size() - 1);
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().closeWindow();
    app.getContactHelper().goHome();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
    for (int i = 0; i < after.size(); i++){
      Assert.assertEquals(before.get(i), after.get(i));
    }
  }
}
