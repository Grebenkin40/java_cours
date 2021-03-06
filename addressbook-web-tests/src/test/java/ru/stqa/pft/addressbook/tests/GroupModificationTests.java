package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupModificationTests extends TestBase {

  @BeforeMethod
  public void ensurePreconditions(){
    app.goTo().GroupPage();
    if (app.Group().List().size() == 0){
      app.Group().creatGroup(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testGroupModification(){
    List<GroupData> before =app.Group().List();
    int index = before.size() -1;
    GroupData group = new GroupData().withId(before.get(before.size() -1).getId()).withName("test1").withHeader("test2").withFooter("test3");
    app.Group().modifyGroup(index, group);
    List<GroupData> after =app.Group().List();
    Assert.assertEquals(after.size(), before.size());

    before.remove(index);
    before.add(group);
    Comparator<? super GroupData> byId =(g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }


}
