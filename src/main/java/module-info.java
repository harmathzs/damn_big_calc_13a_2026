module com.example.damnbigcalc {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.example.damnbigcalc to javafx.fxml;
    exports com.example.damnbigcalc;
}