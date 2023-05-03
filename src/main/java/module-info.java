module com.example.pojetfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pojetfx to javafx.fxml;
    exports com.example.pojetfx;
}