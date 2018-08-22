package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;

public class ContactsCreationTests extends TestBase {


    @Test
    public void testContactsCreation() {
      app.getContactHelper().goHome();
      List<ContactData> before = app.getContactHelper().getContactList();
      app.getContactHelper().createContact(new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests", "FaxTests", "NotesTests", "test1"), true);
      List<ContactData> after = app.getContactHelper().getContactList();
      Assert.assertEquals(after.size(), before.size() +1);

    }

}