module com.example.graphicassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.graphicassignment to javafx.fxml;
    exports com.example.graphicassignment;
}