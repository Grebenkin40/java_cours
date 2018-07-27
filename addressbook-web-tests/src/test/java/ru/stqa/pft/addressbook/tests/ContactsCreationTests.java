package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactsCreationTests extends TestBase {


    @Test
    public void testContactsCreation() {

        app.getContactHelper().gotoContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("NameTests", "NicknameTests", "TitleTests", "CompanyTests", "Hometests", "FaxTests", "NotesTests"));
        app.getContactHelper().submitContactForm();
        app.getContactHelper().reternToContactPage();
    }

}