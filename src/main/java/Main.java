import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main extends Application {
    //EntityManager em = Persistence.createEntityManagerFactory("app").createEntityManager();

    private Stage stage;
    private Scene scene;
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        Parent pane01 = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        scene = new Scene(pane01);
        //scene.getStylesheets().add("/styles/Styles.css");
        stage.setTitle("Conta Bancária");
        //stage.setMaximized(true);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[]args){
        launch(args);
    }

}

//https://github.com/valdineisaugo/Projeto_Hibernate
//https://www.tutorialspoint.com/how-to-insert-an-image-in-to-mysql-database-using-java-program
//https://www.tutorialspoint.com/how-to-insert-an-image-in-to-mysql-database-using-java-program