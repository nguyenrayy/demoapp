module com.dotringuyen.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dotringuyen.bmiapp to javafx.fxml;
    exports com.dotringuyen.bmiapp;
}
