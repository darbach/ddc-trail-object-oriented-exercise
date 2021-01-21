package edu.cnm.deepdive.prework;

import java.util.Comparator;

public interface Contact {

  /**
   * Get first name of contact.
   * @return first name
   */
  String getFirstName();

  /**
   * Set first name of contact.
   * @param firstName first name of the contact
   */
  void setFirstName(String firstName);

  /**
   * Get last name of contact.
   * @return last name
   */
  String getLastName();

  /**
   * Set last name of contact.
   * @param lastName last name of the contact
   */
  void setLastName(String lastName);

  /**
   * Get address of contact.
   * @return address
   */
  String getAddress();

  /**
   * Set address of contact.
   * @param address address of the contact
   */
  void setAddress(String address);
}
