package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String nickname;
  private final String title;
  private final String company;
  private final String home;
  private final String fax;
  private final String notes;

  public ContactData(String name, String nickname, String title, String company, String home, String fax, String notes) {
    this.name = name;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.home = home;
    this.fax = fax;
    this.notes = notes;
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
}
