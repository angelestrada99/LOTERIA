package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.views.Loteria;
import sample.views.Taquimecanografo;

public class Main extends Application {
    private BorderPane bdpPrincipal;
    private javafx.scene.control.MenuBar mnbOpciones;
    private javafx.scene.control.Menu menCompetencia1, menCompetencia2, menSalir;
    private MenuItem mitLoteria, mitTaqui, mitsalir;
    private Scene escena;

    @Override
    public void start(Stage primaryStage) throws Exception{
        CrearUI();
        escena=new Scene(bdpPrincipal);
        primaryStage.setScene(escena);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("FORMULARIO PRINCIPAL");
        primaryStage.show();}

    private void CrearUI() {
        bdpPrincipal=new BorderPane();
        mnbOpciones = new javafx.scene.control.MenuBar();
        menCompetencia1=new javafx.scene.control.Menu("1ra competencia");
        menCompetencia2=new javafx.scene.control.Menu("2da competencia");
        menSalir=new javafx.scene.control.Menu("Salir");
        //AGREGAR MENUS AL MENU BAR
        mnbOpciones.getMenus().addAll(menCompetencia1,menCompetencia2,menSalir);
        bdpPrincipal.setTop(mnbOpciones);//Manda a la parte top del border el "mnbOpciones"
        //Instanciamos los MenuItems
        mitLoteria = new MenuItem("LOTERIA");
        mitTaqui = new MenuItem("Taquimecanografo");
        //mitLoteria.setOnAction(event -> {new Loteria();
        //});
        mitLoteria.setOnAction(actionEvent -> MenuOpciones(1));
        mitTaqui.setOnAction(actionEvent -> MenuOpciones(2));
        menCompetencia1.getItems().addAll(mitLoteria, mitTaqui);
        mitsalir = new MenuItem("HASTA LUEGO...");
        mitsalir.setOnAction(actionEvent -> MenuOpciones(20));
        menSalir.getItems().addAll(mitsalir);
    }

    private void MenuOpciones(int opc){
        switch (opc){
            case 1: new Loteria();
            break;
            case 2: new Taquimecanografo();
                break;
            //Aqui irán los demás casos
            case 20: System.exit(0);
        }}

    public static void main(String[] args) {
        launch(args);
    }}
    //token: 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 gobierno federacion  galactico
/* arrayPlantilla[0][0] = new Button();
        arrayPlantilla[0][0].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[0]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view2 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[0][0].setGraphic(view2);
        gridPlantilla.add(arrayPlantilla[0][0],0, 0);

        arrayPlantilla[1][0] = new Button();
        arrayPlantilla[1][0].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[1]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view3 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[1][0].setGraphic(view3);
        gridPlantilla.add(arrayPlantilla[1][0],1, 0);

        arrayPlantilla[2][0] = new Button();
        arrayPlantilla[2][0].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[2]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view4 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[2][0].setGraphic(view2);
        gridPlantilla.add(arrayPlantilla[2][0],2, 0);

        arrayPlantilla[0][1] = new Button();
        arrayPlantilla[0][1].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[3]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view5 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[0][1].setGraphic(view5);
        gridPlantilla.add(arrayPlantilla[0][1],0, 1);

        arrayPlantilla[0][2] = new Button();
        arrayPlantilla[0][2].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[4]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view6 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[0][2].setGraphic(view6);
        gridPlantilla.add(arrayPlantilla[0][2],0, 2);

        arrayPlantilla[1][1] = new Button();
        arrayPlantilla[1][1].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[5]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view7 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[1][1].setGraphic(view7);
        gridPlantilla.add(arrayPlantilla[1][1],1, 1);

        arrayPlantilla[2][1] = new Button();
        arrayPlantilla[2][1].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[6]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view8 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[2][1].setGraphic(view8);
        gridPlantilla.add(arrayPlantilla[2][1],2, 1);

        arrayPlantilla[1][2] = new Button();
        arrayPlantilla[1][2].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[7]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view9 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[1][2].setGraphic(view9);
        gridPlantilla.add(arrayPlantilla[1][2],1, 2);

        arrayPlantilla[2][2] = new Button();
        arrayPlantilla[2][2].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[8]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view10 = new ImageView(imgCarta);
        view2.setFitHeight(1400);
        view2.setFitWidth(100);
        view2.setPreserveRatio(true);
        arrayPlantilla[2][2].setGraphic(view10);
        gridPlantilla.add(arrayPlantilla[2][2],2, 2);*/



