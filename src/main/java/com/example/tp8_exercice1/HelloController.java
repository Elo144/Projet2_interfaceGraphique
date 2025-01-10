package com.example.tp8_exercice1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText2;

    @FXML
    private TextField nom;

    @FXML
    private TextField password;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onValiderButtonClick() throws IOException {
        welcomeText2.setText("Connexion...");
        String loginnom = nom.getText();
        String loginpassword = password.getText();
        boolean correctnom = false;
        boolean correctpassword = false;

        // Process of reading the Excel file
        try (FileInputStream fileusers = new FileInputStream(new File("./file/users.xlsx"))) {
            XSSFWorkbook workbook = new XSSFWorkbook(fileusers);
            // Open the first sheet
            Sheet sheet1 = workbook.getSheetAt(0);

            // Verify data
            for (int r = 1; r < sheet1.getPhysicalNumberOfRows(); r++) {
                Row row = sheet1.getRow(r);
                if (row != null) {
                    Cell userCell = row.getCell(0); // Assuming username is in the first column (index 0)
                    Cell passwordCell = row.getCell(1); // Assuming password is in the second column (index 1)

                    if (userCell != null && userCell.toString().equals(loginnom)) {
                        correctnom = true;
                    }
                    if (passwordCell != null && passwordCell.toString().equals(loginpassword)) {
                        correctpassword = true;
                    }

                    // Break early if both match
                    if (correctnom && correctpassword) {
                        break;
                    }
                }
            }
        }

        if (correctnom && correctpassword) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("home.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else {
            welcomeText.setText("Erreur d'authentification, veuillez réessayer");
        }
    }

    @FXML
    protected void onNomButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onButtonInscriptionClick(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("inscription-view.fxml"));
        Parent sceneget2 = fxmlLoader2.load();
        //Nouveau stage avec la scene2
        Stage stage = (Stage) sceneget2.getScene().getWindow();
        stage.setTitle("Formulaire d'inscription");
        Scene scene2 = new Scene(sceneget2);
        stage.setScene(scene2);
        stage.show();
    }
}
