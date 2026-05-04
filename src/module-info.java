module pacman.game {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.media;
    requires org.jetbrains.annotations;

    opens ui;
    opens model to javafx.base;
}
