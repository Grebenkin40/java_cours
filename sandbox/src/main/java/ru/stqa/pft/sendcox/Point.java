package ru.stqa.pft.sendcox;

public class Point {

  public double f;
  public double g;

  public Point(double f, double g) {

    this.f = f;
    this.g = g;
  }
  public  double distance(Point p1){

    return Math.sqrt ( Math.pow(f-p1.f, 2) + Math.pow(g-p1.g, 2) );
  }
}
