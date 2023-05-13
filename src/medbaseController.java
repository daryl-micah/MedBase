import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.FileWriter;
import java.io.IOException;

public class medbaseController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField genderField;

    @FXML
    private TextField bloodTypeField;

    @FXML
    private TextField ailmentField;

    public void savePatient() {
        String fileName = "patients.csv";
        String[] header = {"Name", "Age", "Gender", "Blood Type", "Ailment"};

        try {
            FileWriter writer = new FileWriter(fileName, true);

            StringBuilder patientData = new StringBuilder();
            patientData.append(nameField.getText()).append(",");
            patientData.append(ageField.getText()).append(",");
            patientData.append(genderField.getText()).append(",");
            patientData.append(bloodTypeField.getText()).append(",");
            patientData.append(ailmentField.getText()).append("\n");
            writer.append(patientData.toString());
            writer.flush();
            writer.close();

            System.out.println("Patient details saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }
}





