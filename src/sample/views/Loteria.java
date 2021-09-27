package sample.views;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class Loteria extends Stage {
    private Scene scene;//Es la ventana donde estan los componentes
    private VBox vbox;//contenedor de todo
    private HBox hBox1; //HBox para contener a los botones de cambio de plantilla
    private Button btnAtras, btnSiguiente, btnEmpezar;
    private HBox hBox2;//HBox para contener al gridpane(plantilla) y al label(mazo)
    private Button [][] arrayPlantilla = new Button[3][3];
    private String[] arrImagenes = {"loteriacarta1.jpg", "loteriacarta2.jpg", "loteriacarta3.jpg", "loteriacarta4.jpg",
            "loteriacarta5.jpg", "loteriacarta6.jpg", "loteriacarta7.jpg", "loteriacarta8.png", "loteriacarta9.jpg",
            "loteriacarta10.jpg", "loteriacarta11.jpg", "loteriacarta12.jpg", "loteriacarta13.jpg", "loteriacarta14.jpg",
            "loteriacarta15.jpg", "loteriacarta16.jpg", "loteriacarta17.jpg", "loteriacarta18.jpg", "loteriacarta19.jpg",
            "loteriacarta20.jpg", "loteriacarta21.jpg", "loteriacarta22.jpg", "loteriacarta23.jpg", "loteriacarta24.jpg",
            "loteriacarta25.jpg", "loteriacarta26.jpg", "loteriacarta27.jpg", };
    private GridPane gridPlantilla;
    private Image imgCarta;
    private Label lblMazo;
    private File file, file2;

    public Loteria(){
        CrearUI();
        this.setTitle("Loteria");
        this.setScene(scene);
        this.show();}

    private void CrearUI(){
     vbox = new VBox();
     hBox1 = new HBox();
     btnSiguiente = new Button("Plantilla siguiente >");
     btnAtras = new Button("< Plantilla anterior");
     btnEmpezar = new Button("START");
     btnEmpezar.setAlignment(Pos.BOTTOM_RIGHT);
     hBox1.getChildren().addAll(btnAtras, btnSiguiente, btnEmpezar);
     hBox1.setSpacing(10);

     hBox2 = new HBox();
     gridPlantilla = new GridPane();
     int imagen = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
        arrayPlantilla[j][i] = new Button();
        arrayPlantilla[j][i].setPrefSize(120,140);
        file = new File("src/sample/images/"+arrImagenes[imagen]);
        imgCarta = new Image(file.toURI().toString());
        ImageView view = new ImageView(imgCarta);
        view.setFitHeight(1400);
        view.setFitWidth(100);
        view.setPreserveRatio(true);
        arrayPlantilla[j][i].setGraphic(view);
        imagen++;
        gridPlantilla.add(arrayPlantilla[j][i],j, i);}}

        //Si EN LA 1ER PLANTILLA PRESIONO SEGUIENTE... MUESTRAME LA 2DA PLANTILLA
        btnSiguiente.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int imagen = 9;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        arrayPlantilla[j][i] = new Button();
                        arrayPlantilla[j][i].setPrefSize(120,140);
                        file = new File("src/sample/images/"+arrImagenes[imagen]);
                        imgCarta = new Image(file.toURI().toString());
                        ImageView view = new ImageView(imgCarta);
                        view.setFitHeight(1400);
                        view.setFitWidth(100);
                        view.setPreserveRatio(true);
                        arrayPlantilla[j][i].setGraphic(view);
                        imagen++;
                        gridPlantilla.add(arrayPlantilla[j][i],j, i);}}

        //Si EN LA 2DA PLANTILLA PRESIONO ATRAS... MUESTRAME LA PLANTILLA 1
            btnAtras.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    int imagen = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            arrayPlantilla[j][i] = new Button();
                            arrayPlantilla[j][i].setPrefSize(120,140);
                            file = new File("src/sample/images/"+arrImagenes[imagen]);
                            imgCarta = new Image(file.toURI().toString());
                            ImageView view = new ImageView(imgCarta);
                            view.setFitHeight(1400);
                            view.setFitWidth(100);
                            view.setPreserveRatio(true);
                            arrayPlantilla[j][i].setGraphic(view);
                            imagen++;
                            gridPlantilla.add(arrayPlantilla[j][i],j, i);}} }});

        //SI EN LA 2DA PLANTILLA PRESIONO SIGUIENTE...MUESTRAME LA PLANTILLA 3
                btnSiguiente.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        int imagen = 18;
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                arrayPlantilla[j][i] = new Button();
                                arrayPlantilla[j][i].setPrefSize(120,140);
                                file = new File("src/sample/images/"+arrImagenes[imagen]);
                                imgCarta = new Image(file.toURI().toString());
                                ImageView view = new ImageView(imgCarta);
                                view.setFitHeight(1400);
                                view.setFitWidth(100);
                                view.setPreserveRatio(true);
                                arrayPlantilla[j][i].setGraphic(view);
                                imagen++;
                                gridPlantilla.add(arrayPlantilla[j][i],j, i);}}
                }});

        //SI EN LA 3ER PLANTILLA PRESIONO ATRAS...MUESTRAME LA PLATILLA 2
                btnAtras.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        int imagen = 9;
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                arrayPlantilla[j][i] = new Button();
                                arrayPlantilla[j][i].setPrefSize(120,140);
                                file = new File("src/sample/images/"+arrImagenes[imagen]);
                                imgCarta = new Image(file.toURI().toString());
                                ImageView view = new ImageView(imgCarta);
                                view.setFitHeight(1400);
                                view.setFitWidth(100);
                                view.setPreserveRatio(true);
                                arrayPlantilla[j][i].setGraphic(view);
                                imagen++;
                                gridPlantilla.add(arrayPlantilla[j][i],j, i);}}
                    }});
            }});

        hBox2.getChildren().addAll(gridPlantilla);
        hBox2.setSpacing(10);

     btnEmpezar.setOnMouseClicked(new EventHandler<MouseEvent>() {
         @Override
         public void handle(MouseEvent mouseEvent) {
                 lblMazo = new Label();
                 int imagen = 0;
                 file = new File("src/sample/images/" + arrImagenes[imagen]);
                 imgCarta = new Image(file.toURI().toString());
                 ImageView view = new ImageView(imgCarta);
                 view.setFitWidth(200);
                 view.setFitHeight(220);
                 view.setPreserveRatio(true);
                 lblMazo.setGraphic(view);
                 hBox2.getChildren().addAll(lblMazo);
                 Timer sleep = new Timer();
         }});

     vbox.getChildren().addAll(hBox1, hBox2);
     vbox.setSpacing(10);
     vbox.setPadding(new Insets(20));
     scene = new Scene(vbox, 627, 572);
    }}
