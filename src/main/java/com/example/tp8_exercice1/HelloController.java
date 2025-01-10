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
import java.io.FileNotFoundException;
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

    //BOUTTON d'INSCRIPTION
    @FXML
    protected void onHelloButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("inscription-view.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    //AFFICHER TEXTE dans texfield à coté de com
    @FXML
    protected void onNomButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

//    public void onButtonInscriptionClick(ActionEvent actionEvent) throws IOException {
//        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("inscription-view.fxml"));
//        Parent sceneget2 = fxmlLoader2.load();
//        //Nouveau stage avec la scene2
//        Stage stage = (Stage) sceneget2.getScene().getWindow();
//        stage.setTitle("Formulaire d'inscription");
//        Scene scene2 = new Scene(sceneget2);
//        stage.setScene(scene2);
//        stage.show();
//    }

    //BUTTON de CONNEXION
    @FXML
    protected void onValider() throws IOException {
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
            loader.setLocation(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } else {
            welcomeText.setText("Erreur d'authentification, veuillez réessayer");
        }
    }

    public void onValiderButtonClick() throws IOException {
        String loginUser = nom.getText();
        String passwordUser = password.getText();
        Boolean correctUser = false;
        Boolean correctPassword = false;
        try(FileInputStream fuser = new FileInputStream(new File("./files/users.xlsx")))
        {
            XSSFWorkbook workbook = new XSSFWorkbook(fuser);
            Sheet sheet = workbook.getSheetAt(0);

            for(int r = 1; r < sheet.getPhysicalNumberOfRows(); r++)
            {
                Row row = sheet.getRow(r);
                Cell userCell = row.getCell(1);

                if(userCell.toString().equals(loginUser)){
                    correctUser = true;
                    Cell passwordCell = row.getCell(2);
                    if(passwordCell.toString().equals(passwordUser)){
                        correctPassword = true;
                        break;
                    }
                }
            }
            if(correctUser && correctPassword)
            {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(this.getClass().getResource("affichage-view.fxml"));
                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            }
//            else
//            {
//                error.setText("ERROR LOGIN or PWD INCORRECT !!");
//            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        public void onValiderButtonClick() throws IOException {
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(this.getClass().getResource("inscription-view.fxml"));
//            Scene scene = new Scene(loader.load());
//            Stage stage = new Stage();
//            stage.setScene(scene);
//            stage.show();
//        }
    }
}
