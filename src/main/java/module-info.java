module com.schedule.schedulingapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.schedule.schedulingapplication to javafx.fxml;
    exports com.schedule.schedulingapplication;
    exports com.schedule.schedulingapplication.controllers;
    opens com.schedule.schedulingapplication.controllers to javafx.fxml;
}