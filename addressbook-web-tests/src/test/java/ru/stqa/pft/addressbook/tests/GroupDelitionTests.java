package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDelitionTests extends TestBase {

    @Test
    public void testGroupDelition() {
        app.getNavigetionHelper().gotoGroupCreation();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().reternToGroupPage();
    }


}
