package edu.cnm.deepdive.prework;

import java.util.ArrayList;

public interface Phone {

  enum PowerState { ON, OFF; }

  PowerState togglePower();
  int ringerVolumeUp();
  int ringerVolumeDown();
  int newTextMessage();
  int readTextMessages();
  int newMissedCall();
  int listenToMissedCall();
}
