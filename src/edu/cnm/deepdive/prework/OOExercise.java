package edu.cnm.deepdive.prework;

// https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html
//
// ####### QUESTIONS #######
// 1. Real-world objects contain ___ and ___. state, behavior
// 2. A software object's state is stored in ___. fields
// 3. A software object's behavior is exposed through ___. methods
// 4. Hiding internal data from the outside world, and accessing it only through
//    publicly exposed methods is known as data ___. encapsulation
// 5. A blueprint for a software object is called a ___. class
// 6. Common behavior can be defined in a ___ and inherited into a ___ using
//    the ___ keyword. superclass, subclass, extends
// 7. A collection of methods with no implementation is called an ___. interface
// 8. A namespace that organizes classes and interfaces by functionality
//    is called a ___. package
// 9. The term API stands for ___? Application Programming Interface

// ####### EXERCISES #######
// 1. Create new classes for each real-world object that you observed at the beginning
//    of this trail. Refer to the Bicycle class if you forget the required syntax.
// 2. For each new class that you've created above, create an interface that defines
//    its behavior, then require your class to implement it. Omit one or two methods
//    and try compiling. What does the error look like?
//      -> edu.cnm.deepdive.prework.LGk20plus is not abstract and does not override
//         abstract method ringerVolumeDown() in edu.cnm.deepdive.prework.Phone

import java.util.ArrayList;
import java.util.Comparator;

public class OOExercise {

  public static void main(String[] args) {

    LGk20plus myPhone = new LGk20plus();

    //Test power on
    System.out.println("Turning phone " + myPhone.togglePower());
    System.out.println();

    //Test adding contacts and sorting by last name
    System.out.println("Adding contacts...");
    myPhone.addContact(new PhoneContact("Bruce", "Wayne", "Gotham City", "735-111-1111", "iamthenight@email.com"));
    myPhone.addContact(new PhoneContact("Peter", "Parker", "New York City","212-111-1111", "thwipthwip@email.com"));
    myPhone.addContact(new PhoneContact("Clark", "Kent", "Metropolis", "618-111-1111", "manosteel@email.com"));
    myPhone.addContact(new PhoneContact("Tony", "Stark", "Malibu, CA", "310-111-1111", "runbeforeyouwalk@email.com"));
    myPhone.viewContacts();
    System.out.println();

    //Test removing contacts and sorting
    System.out.println("Deleting contact at index 10 (n/a)...");
    myPhone.removeContact(10);
    System.out.println();
    System.out.println("Deleting contact at index 2 (Tony Stark)...");
    myPhone.removeContact(2);
    System.out.println();
    myPhone.viewContacts();
    System.out.println();

    //Test missed calls
    System.out.println("Testing missed calls...");
    System.out.println("New missed calls: " + myPhone.newMissedCall());
    System.out.println("New missed calls: " + myPhone.newMissedCall());
    System.out.println("Listened to missed call. Remaining: " + myPhone.listenToMissedCall());
    System.out.println("Listened to missed call. Remaining: " + myPhone.listenToMissedCall());
    System.out.println("Listened to missed call. Remaining: " + myPhone.listenToMissedCall());
    System.out.println();

    //Test text messages
    System.out.println("Testing text messages...");
    System.out.println("New text messages: " + myPhone.newTextMessage());
    System.out.println("New text messages: " + myPhone.newTextMessage());
    System.out.println("Read text message. Remaining: " + myPhone.listenToMissedCall());
    System.out.println("Read text message. Remaining: " + myPhone.listenToMissedCall());
    System.out.println("Read text message. Remaining: " + myPhone.listenToMissedCall());
    System.out.println();

    //Test volume control down and up
    System.out.println("Volume up: " + myPhone.ringerVolumeUp());
    System.out.println("Volume down: " + myPhone.ringerVolumeDown());
    System.out.println("Volume down: " + myPhone.ringerVolumeDown());
    System.out.println("Volume down: " + myPhone.ringerVolumeDown());
    for (int i = 0; i < 11; i++) {
      System.out.println("Volume up: " + myPhone.ringerVolumeUp());
    }
    System.out.println();

    //Turn phone off
    System.out.println("Turning phone " + myPhone.togglePower());
    System.out.println();

  }
}
