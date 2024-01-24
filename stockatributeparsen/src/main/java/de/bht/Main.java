package de.bht;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



   

    public class MeasurementParser {
        private List<Measurement> measurements;
    
        public MeasurementParser(String data) {
            this.measurements = new ArrayList<>();
            parseData(data);
        }
    
        private void parseData(String data) {
            if (data == null || data.isEmpty()) {
                throw new MeasurementParseException("No data: " + data);
            }
    
            List<String> errorMessages = new ArrayList<>();
            String[] lines = data.split("\n");
            String exampleData = "4545;2023-01-26T16:15:12+00:00;260;25\n4544;;1055;1023";
            for (String line : lines) {
                String[] columns = line.split(";");
                if (columns.length != 4) {
                    errorMessages.add("Not enough columns: " + line);
                    continue;
                }
    
                String carPlateStr = columns[0].trim();
                String date = columns[1].trim();
                String startSecondStr = columns[2].trim();
                String finishSecondStr = columns[3].trim();
    
                // Überprüfung auf leere Spalten
                if (carPlateStr.isEmpty()) errorMessages.add("Column 0 is empty: " + line);
                if (date.isEmpty()) errorMessages.add("Column 1 is empty: " + exampleData);
                if (startSecondStr.isEmpty()) errorMessages.add("Column 2 is empty: " + line);
                if (finishSecondStr.isEmpty()) errorMessages.add("Column 3 is empty: " + line);
    
                try {
                    int carPlate = Integer.parseInt(carPlateStr);
                    int startSecond = Integer.parseInt(startSecondStr);
                    int finishSecond = Integer.parseInt(finishSecondStr);
                    measurements.add(new Measurement(carPlate, date, startSecond, finishSecond));
                } catch (NumberFormatException e) {
                    errorMessages.add("Invalid number format: " + line);
                }
            }
    
            if (!errorMessages.isEmpty()) {
                throw new MeasurementParseException(String.join("\n", errorMessages));
            }
        }
    
        public List<Measurement> getMeasurements() {
            return measurements;
        }
    }
    
    public class Measurement {
        private Integer carPlate;
        private String date;
        private Integer startSecond;
        private Integer finishSecond;
    
        public Measurement(Integer carPlate, String date, Integer startSecond, Integer finishSecond) {
            this.carPlate = carPlate;
            this.date = date;
            this.startSecond = startSecond;
            this.finishSecond = finishSecond;
        }
    
        public Integer getCarPlate() {
            return carPlate;
        }
    
        public String getDate() {
            return date;
        }
    
        public Integer getStartSecond() {
            return startSecond;
        }
    
        public Integer getFinishSecond() {
            return finishSecond;
        }
    }
    
    public class MeasurementParseException extends RuntimeException {
        public MeasurementParseException(String message) {
            super(message);
        }
    }
}

