package de.bht.pr2.lab01;

import java.util.ArrayList;
import java.util.List;

public class Student {
  List<String> data = new ArrayList<String>();
  

  //-------------------------------------------
  // Attribute
  private String name = "";
  

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) {
    // TODO: Here goes your code ...
  }
}
