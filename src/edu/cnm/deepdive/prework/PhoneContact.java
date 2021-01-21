package edu.cnm.deepdive.prework;

import java.util.Comparator;

public class PhoneContact implements Contact {

  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private String emailAddress;
  private Comparator<PhoneContact> comparator;

  /**
   * Constructor
   * @param firstName first name
   * @param lastName last name
   * @param address address
   * @param phoneNumber phone number string
   * @param emailAddress email address
   */
  public PhoneContact(String firstName, String lastName, String address, String phoneNumber,
      String emailAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.comparator = new Comparator<PhoneContact>() {
      @Override
      public int compare(PhoneContact c1, PhoneContact c2) {
        String name1 = c1.lastName + ", " + c1.firstName;
        String name2 = c2.lastName + ", " + c2.firstName;
        return name1.compareTo(name2);
      }
    };
  }

  @Override
  public String getFirstName() {
    return firstName;
  }

  @Override
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public String getLastName() {
    return lastName;
  }

  @Override
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String getAddress() {
    return address;
  }

  @Override
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Get phone # of contact.
   * @return
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Set phone # of contact.
   * @param phoneNumber phone number
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   * Get email address of contact.
   * @return
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * Set email address of contact.
   * @param emailAddress email address
   */
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  @Override
  public String toString() {
    return "Name: " + firstName + " " + lastName
        + "\nAddress: " + address
        + "\nPhone #: " + phoneNumber
        + "\nEmail: " + emailAddress;
  }

  public Comparator<PhoneContact> getComparator() {
    return comparator;
  }
}
