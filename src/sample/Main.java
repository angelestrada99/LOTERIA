package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    private BorderPane bdpPrincipal;
    private javafx.scene.control.MenuBar mnbOpciones;
    private javafx.scene.control.Menu menCompetencia1, menCompetencia2, menSalir;
    private MenuItem mitLoteria, mitsalir;
    private Scene escena;

    @Override
    public void start(Stage primaryStage) throws Exception{
        CrearUI();
        escena=new Scene(bdpPrincipal);
        primaryStage.setScene(escena);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("FORMULARIO PRINCIPAL");
        primaryStage.show();
    }

    private void CrearUI() {
        bdpPrincipal=new BorderPane();
        mnbOpciones = new javafx.scene.control.MenuBar();
        menCompetencia1=new javafx.scene.control.Menu("1ra competencia");
        menCompetencia2=new javafx.scene.control.Menu("2da competencia");
        menSalir=new javafx.scene.control.Menu("Salir");
        mnbOpciones.getMenus().addAll(menCompetencia1,menCompetencia2,menSalir);
        bdpPrincipal.setTop(mnbOpciones);

    }

    public static void main(String[] args) {
        launch(args);
    }
}
