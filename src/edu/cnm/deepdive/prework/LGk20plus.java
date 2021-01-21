package edu.cnm.deepdive.prework;

import edu.cnm.deepdive.prework.PhoneContact;
import java.util.ArrayList;

public class LGk20plus implements Phone {

  private PowerState poweredState = PowerState.OFF;
  private int ringerVolume = 1;
  private int unreadTextMessages = 0;
  private int missedCalls = 0;
  private ArrayList<PhoneContact> contacts = new ArrayList<PhoneContact>();

  /**
   * Turn the phone off and on.
   */
  @Override
  public PowerState togglePower() {
    if (poweredState == PowerState.OFF) {
      poweredState = PowerState.ON;
    } else {
      poweredState = PowerState.OFF;
    }
    return poweredState;
  }

  /**
   * Turn the ringer up. Max volume 10.
   * @return New ringer volume
   */
  public int ringerVolumeUp() {
    if (ringerVolume < 10) { ringerVolume++; }
    return ringerVolume;
  }

  /**
   * Turn the ringer down. Min volume 0.
   * @return New ringer volume
   */
  public int ringerVolumeDown() {
    if (ringerVolume > 0) { ringerVolume--; }
    return ringerVolume;
  }

  /**
   * Increment the number of unread text messages.
   * @return New number of unread text messages
   */
  public int newTextMessage() {
    return unreadTextMessages++;
  }

  /**
   * Read a text message, and decrement missed text messages.
   * @return New count of unread text messages.
   */
  public int readTextMessages() {
    if (unreadTextMessages > 0) {
      return unreadTextMessages--;
    }
    return unreadTextMessages;
  }

  /**
   * Increment the number of missed calls.
   * @return New number of missed calls.
   */
  public int newMissedCall() {
    return missedCalls++;
  }

  /**
   * Listen to voicemail of missed call, and decrement missed calls.
   * @return New count of missed calls
   */
  public int listenToMissedCall() {
    if (missedCalls > 0) {
      return missedCalls--;
    }
    return missedCalls;
  }

  /**
   * Adds a new contact and sorts alphabetized by last name then first name.
   * @param contact Contact object
   */
  public void addContact(PhoneContact contact) {
    contacts.add(contact);
    contacts.sort(contact.getComparator());
  }

  /**
   * Remove a contact at the given index
   * @param index
   * @return Contact that was removed
   */
  public PhoneContact removeContact(int index) {
    try {
      PhoneContact c = contacts.remove(index);
      return c;
    } catch (Exception e) {
      System.out.println("Contact at index " + index + " not found. Nothing removed.");
      return null;
    }
  }

  /**
   * View list of contacts
   */
  public void viewContacts() {
    System.out.println("CONTACT LIST...");
    System.out.println();
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println(contacts.get(i));
      if (i < contacts.size()-1) { System.out.println(); }
    }
  }

}
