module co.edu.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens co.edu.uniquindio.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal;

    opens co.edu.uniquindio.proyectofinal.model;
    exports co.edu.uniquindio.proyectofinal.model;

    opens co.edu.uniquindio.proyectofinal.controller;
    exports co.edu.uniquindio.proyectofinal.controller;
}
