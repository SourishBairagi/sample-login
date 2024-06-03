module com.oop.new_project.login {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.new_project.login to javafx.fxml;
    exports com.oop.new_project.login;
}