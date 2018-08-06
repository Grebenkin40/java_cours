package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDelitionTests extends TestBase {

    @Test
    public void testGroupDelition() {
        app.getNavigetionHelper().gotoGroupCreation();
        if (! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().creatGroup(new GroupData("test11", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().reternToGroupPage();
    }


}
