package de.bht;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



   

    

    static class MeasurementParser {
        private List<Measurement> measurements = new LinkedList<Measurement>();
        public MeasurementParser(String data) {
            if(data == null || data.trim().isEmpty()) {
                throw new MeasurementParseException("No data: " + data);
            }
            
            String[] rows = data.split("\n");
            for(String row : rows) {
                String [] columns = row.split(";");
                
                if(columns == null || columns.length != 4) {
                    throw new MeasurementParseException("Not enough columns: " + data);
                }
                
                if(columns[0] == null || columns[0].trim().isEmpty()) {
                    throw new MeasurementParseException("Column 0 is empty: " + data);
                }
                
                if(columns[1] == null || columns[1].trim().isEmpty()) {
                    throw new MeasurementParseException("Column 1 is empty: " + data);
                }
                
                if(columns[2] == null || columns[2].trim().isEmpty()) {
                    throw new MeasurementParseException("Column 2 is empty: " + data);
                }
                
                
                if(columns[3] == null || columns[3].trim().isEmpty()) {
                    throw new MeasurementParseException("Column 3 is empty: " + data);
                }            
                
                measurements.add(new Measurement(
                    Integer.parseInt(columns[0]), 
                    columns[1],
                    Integer.parseInt(columns[2]), 
                    Integer.parseInt(columns[3])));
            }
        }
        
        public List<Measurement> getMeasurements() {
            return measurements;
        }
    }
    
    static class MeasurementParseException extends RuntimeException {
        public MeasurementParseException(String message) {
            super(message);
        }
    }
    
    
    public class Measurement {
    
      private String date;
      private Integer carPlate;
      private Integer finishSecond;
      private Integer startSecond;
    
      public Measurement(Integer carPlate, String date, Integer startSecond, Integer finishSecond) {
        this.date = date;
        this.carPlate = carPlate;
        this.finishSecond = finishSecond;
        this.startSecond = startSecond;
      }
      
      public String getDate() {
        return date;
      }
    
      public Integer getCarPlate() {
        return carPlate;
      }
    
      public Integer getStartSecond() {
        return startSecond;
      }
    
      public Integer getFinishSecond() {
        return finishSecond;
      }
    }
}