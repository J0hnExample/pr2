package de.bht.pr2.lab02.part1;

import org.junit.jupiter.api.Test;

class MyTest {



  @Test
  void testParsing() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {
    Student student1 = new Student("Leon Lustig,70022,Screen Based Media,312");
  }
  @Test
  void testRegistrationNumber() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {
    Student student1 = new Student("Leon Lustig,70221,Technische Informatik,312");
  }
  @Test
  void testCourses() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {
    Student student1 = new Student("Leon Lustig,70221,Technisches Zeichnen,312");
  }
  @Test
  void testTuitonFee() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {
    Student student1 = new Student("Leon Lustig,70221,Technische Informatik,31");
  }
}
