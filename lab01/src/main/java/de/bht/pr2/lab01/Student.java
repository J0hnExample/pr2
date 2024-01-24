package de.bht.pr2.lab01;

public class Student {

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
  public Student(String dataRow) throws StudentParseException, RegistrationNumberException, NotPaidTuitionFeeException, WrongCourseOfStudiesException {
    // TODO: Here goes your code ...
    String[] data = dataRow.split(",");
    if ( data.length != 4){
      throw new StudentParseException("Datenzeile kann nicht verarbeitet werden");
    }
    name = data[0];

    try {
      registrationNumber = Integer.parseInt(data[1]);
    } catch(NumberFormatException e){
      throw new RegistrationNumberException("Matrikelnummer nicht korrekt in Datei: " + dataRow + ".");
    }

    courseOfStudies = data[2];

    if (!courseOfStudies.equalsIgnoreCase("Medieninformatik") &&
        !courseOfStudies.equalsIgnoreCase("Technische Informatik") &&
        !courseOfStudies.equalsIgnoreCase("Druck- und Medientechnik") &&
        !courseOfStudies.equalsIgnoreCase("Screen Based Media")){
      throw new WrongCourseOfStudiesException("Der Kurs: " + courseOfStudies + " gehoert nicht zu Fachbereich VI");
    }

    int tuitionPaid = -1;
    try {
      tuitionPaid = Integer.parseInt(data[3]);
    } catch (NumberFormatException e){
      throw new StudentParseException("Falscher Wert in Zeile: " + dataRow + ".");
    }

    int toBePaid = TUITION_FEE -tuitionPaid;
    if (toBePaid > 0){
      throw new NotPaidTuitionFeeException("Student muss noch " + toBePaid + "€ zahlen");
    }


  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(int registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public String getCourseOfStudies() {
    return courseOfStudies;
  }

  public void setCourseOfStudies(String courseOfStudies) {
    this.courseOfStudies = courseOfStudies;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", registrationNumber=" + registrationNumber +
            ", courseOfStudies='" + courseOfStudies + '\'' +
            '}';
  }
}
