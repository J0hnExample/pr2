package de.bht.pr2.lab04;


import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import serde.ObjectSerde;

 public class CertificateSerdeTest {

  @Test
  public void test1() {

    final Course prog1 = new Course("Programmierung 1", "Medieninformatik");
    final Student siamak = new Student(12345, "Siamak");
    final Subscription siamakProg1 = new Subscription(prog1, siamak);
    final Grade grade = new Grade(2.0, siamakProg1);

    //Added new arraylist to fix nullpointer exception
    final Certificate certificate = new Certificate(siamak, new ArrayList<>());
    certificate.addGrade(grade);

    final String path = "src/test/resources/certificate.txt";
    final ObjectSerde objectSerde = new ObjectSerde();
    objectSerde.serialize(certificate, path);
    Certificate certificate1 = (Certificate) objectSerde.deserialize(path);

    Assertions.assertEquals(certificate, certificate1);

  }
}

