package de.bht;

import java.io.*;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        // Beispiel-Instanz von Measurement erstellen
        // Achtung: Stellen Sie sicher, dass die Klasse Measurement das Serializable Interface implementiert
        Measurement measurement = new Measurement(); // Hier entsprechend anpassen

        MeasurementSerde serde = new MeasurementSerde();
        try {
            String serialized = serde.serializeToString(measurement);
            System.out.println("Serialisiert: " + serialized);

            Measurement deserialized = serde.deserializeFromString(serialized);
            System.out.println("Deserialisiert: " + deserialized);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static public class MeasurementSerde {
        public String serializeToString(Measurement m) throws IOException {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(m);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray()); 
        }
        
        public Measurement deserializeFromString(String s) 
          throws IOException, ClassNotFoundException {
            byte [] data = Base64.getDecoder().decode(s);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Measurement m = (Measurement) ois.readObject();
            ois.close();
            return m;
        }
    }

    // Annahme: Measurement ist eine Klasse, die das Serializable Interface implementiert
    static class Measurement implements Serializable {
        // Klasseninhalte hier...
    }
}
