module com.example.pojetfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetfx to javafx.fxml;
    exports com.example.projetfx;
    exports com.example.partie1;

}