module lk.ijse.my_last_only_last {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.my_last_only_last to javafx.fxml;
    exports lk.ijse.my_last_only_last;
}