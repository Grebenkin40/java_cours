package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
  private final String name;
  private final String nickname;
  private final String title;
  private final String company;
  private final String home;
  private final String fax;
  private final String notes;

  private String group;


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(name, that.name) &&
            Objects.equals(home, that.home);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name, home);
  }

  public ContactData(String name, String nickname, String title, String company, String home, String fax, String notes, String group) {

    this.name = name;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.home = home;
    this.fax = fax;
    this.notes = notes;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getHome() {
    return home;
  }

  public String getFax() {
    return fax;
  }

  public String getNotes() {
    return notes;
  }


  public String getGroup() {
    return group;
  }
}
