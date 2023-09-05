package gui;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{
	

	@FXML
	private TextField txtId;
	
	@FXML
	private TextField name;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;

	@FXML
	private Button btCancel;

	@FXML
	public void onBtSaveAction() {
	    Alert alert = new Alert(AlertType.CONFIRMATION);
	    alert.setTitle("Sucesso");
	    alert.setHeaderText(null);
	    alert.setContentText("Salvar usuário");

	    // Exibir a caixa de diálogo de confirmação e aguardar a resposta do usuário
	    Optional<ButtonType> result = alert.showAndWait();

	    // Verificar se o usuário clicou em OK
	    if (result.isPresent() && result.get() == ButtonType.OK) {
	        // Coloque aqui o código a ser executado quando o usuário clicar em OK
	        System.out.println("Usuário clicou em OK.");
	    }
	}

	@FXML
	public void onBtCancelAction() {
	    Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Cancelar");
	    alert.setHeaderText(null);
	    alert.setContentText("Cancelar usuário");

	    // Exibir a caixa de diálogo de informações
	    alert.showAndWait();
	}

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
		
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(name, 30);
	}

}
