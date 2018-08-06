package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.getNavigetionHelper().gotoGroupCreation();
        app.getGroupHelper().creatGroup(new GroupData("test11", null, null));
    }

}
