package ru.stqa.pft.sendcox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void  main(String [] arge){

    String [] langs = {"java", "C#", "Python", "PHP"};

    List<String> languages = Arrays.asList("java", "C#", "Phyton", "PHP");

    for (String l: languages){
      System.out.println(" Я хочу выучить " + l);
    }
  }
}
