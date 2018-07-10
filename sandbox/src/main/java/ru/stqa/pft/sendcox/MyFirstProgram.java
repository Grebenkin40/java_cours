package ru.stqa.pft.sendcox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello ("user");
    hello ("Alexei");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " +s.l + " = " + s.area ());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(1, 6);
    Point p2 = new Point(10, 10);
    System.out.println("Расстояние между точками с коардинатами (" + p1.f + ":" + p1.g + ")"+ " ("+ p2.f + ":" + p2.g + ") = " + p2.distance(p1));
  }


  public static void hello (String somebody) {
    System.out.println("Hello," + somebody + "!");
  }

  public static double area (Square s){
    return s.l * s.l;
  }

  public static double area (Rectangle r){

    return r.a * r.b;
  }



  public static double distance (Point p1, Point p2){

    return Math.sqrt ( Math.pow(p1.f-p2.f, 2) + Math.pow(p1.g-p2.g, 2) );
  }


}

