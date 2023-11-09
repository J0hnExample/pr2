package example01;

/* "import static" means that we can use methods and public attributed from this class (Assertions)
without specifying the class name. This makes our code shorter. We use the "assertEquals()" method below. */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import de.bht.pr2.lession02.Car;
import org.junit.jupiter.api.Test;

class Example01Test {

  // Test a program with JUnit

  // @Test This is an Annotation
  
  
  @Test
  void testStandortKmStand() {
    Car car = new Car("Audi", "gelb", "Berlin", 10000);

    car.drive("Hamburg", 300); 
    assertEquals("Hamburg", car.getPosition());           // Assert
    assertEquals(10300, car.getKmStatus());                             // Act
    
  }
  @Test
  void testStandortKmStand21() {
    Car car = new Car("Audi", "gelb", "Berlin", 10000);
    car.fly("Alaska", 50000);
    assertEquals("Alaska", car.getPosition());           // Assert
    assertEquals(60000, car.getKmStatus());   
                 // Assert
  }
}
