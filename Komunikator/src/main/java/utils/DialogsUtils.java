package utils;

import java.util.Optional;

import controllers.SplashController;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DialogsUtils {

	public static void dialogAboutApplication() {
		Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);

		DialogPane dialogPane = informationAlert.getDialogPane();
		dialogPane.getStylesheets().add(DialogsUtils.class.getResource("/fxml/DarkTheme.css").toExternalForm());
		Stage stage = (Stage) informationAlert.getDialogPane().getScene().getWindow();

		stage.getIcons().add(new Image(SplashController.class.getResourceAsStream("../images/icon.png")));
		informationAlert.setTitle("About");
		informationAlert.setHeaderText("About app.");
		informationAlert.setContentText("This is a app. True a art.");
		informationAlert.showAndWait();

	}

	public static Optional<ButtonType> confirmationDialog(String titleString) {
		Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
		DialogPane dialogPane = confirmationAlert.getDialogPane();
		dialogPane.getStylesheets().add(DialogsUtils.class.getResource("/fxml/DarkTheme.css").toExternalForm());
		Stage stage = (Stage) confirmationAlert.getDialogPane().getScene().getWindow();

		stage.getIcons().add(new Image(SplashController.class.getResourceAsStream("../images/icon.png")));

		confirmationAlert.setTitle(titleString);
		confirmationAlert.setHeaderText("Are you sure?");

		Optional<ButtonType> result = confirmationAlert.showAndWait();

		return result;
	}
}
