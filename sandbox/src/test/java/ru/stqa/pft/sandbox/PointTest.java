package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sendcox.Point;

public class PointTest {
  @Test
  public void testArea(){

    Point p1 = new Point(1, 6);
    Point p2 = new Point(10, 10);
    Assert.assertEquals(p2.distance(p1), 9.848857801796104);
  }
}
