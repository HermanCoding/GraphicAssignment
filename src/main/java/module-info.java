module com.example.graphicassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.graphicassignment to javafx.fxml;
    exports com.example.graphicassignment;
}