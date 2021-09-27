package sample.views;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class Taquimecanografo extends Stage implements EventHandler<KeyEvent> {
    private Scene escena;
    private VBox vBox, vTeclado;
    private HBox hFuncion, hNum, hTap; //teclas de funcion
    private TextArea txTexto;
    private TextArea txtAreaEscritura;
    private ToolBar tolOpciones;
    private Button btnAbrir;
    private Image imgOpcion;
    private File file;
    private ImageView imvOpcion;
    private FileChooser flcArchivo;
    private Button[] arrBtnFunc = new Button[16];
    private Button[] arrBtnNumeric = new Button[15];
    private Button[] arrBtnTabul = new Button[15];
    private String[] arrSimTabul = {"->", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "´", "+", "}", "repag"};
    private Button[] arrBtnMayus = new Button[14];
    private Button[] arrBtnShift = new Button[13];
    private Button[] arrBtnSpace = new Button[11];
    private boolean ban = false; //detecta cuando se presiona y suelta una tecla
    private String file2;

    public Taquimecanografo(){
        CrearUI();
        this.setTitle("Taquimecanografo");
        this.setScene(escena);
        this.show();}

    private void CrearUI() {
        vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        tolOpciones = new ToolBar();
        //imgOpcion = new Image("sample/images/fileopen.png");
        file = new File("src/sample/images/fileopen.png");
        imgOpcion = new Image(file.toURI().toString());
        imvOpcion = new ImageView(imgOpcion);
        imvOpcion.setFitHeight(37);
        imvOpcion.setFitHeight(37);
        btnAbrir = new Button();
        btnAbrir.setOnAction(event -> tlbOpciones(1));
        btnAbrir.setGraphic(imvOpcion);
        //btnAbrir.setId(btn_menuu);
        tolOpciones.getItems().addAll(btnAbrir);
        txTexto = new TextArea();
        txTexto.setEditable(false);
        txtAreaEscritura = new TextArea();
        txtAreaEscritura.setOnKeyPressed(this);
        txtAreaEscritura.setOnKeyReleased(this);

        vTeclado = new VBox();
        hFuncion = new HBox();
        hNum = new HBox();
        hTap = new HBox();
        hTap.setSpacing(5d);
        setButtons(arrBtnTabul, hTap, arrSimTabul);
        vTeclado.getChildren().addAll(hFuncion, hNum, hTap);
        vBox.getChildren().addAll(txTexto, txtAreaEscritura, tolOpciones, vTeclado);
        escena = new Scene(vBox, 600, 300);
        file = new File("src/sample/css/style.css");
        file2 = file.toURI().toString();
        escena.getStylesheets().add(file2);
    }

    private void setButtons(Button[] arrBtns, HBox hBtns, String[] arSimbolos ){
        for (int i = 0; i <arrBtns.length ; i++) {
            arrBtns[i] = new Button(arSimbolos[i]);
            hBtns.getChildren().add(arrBtns[i]);
        }}

    private void tlbOpciones(int opc) {
        switch(opc){
            case 1:  flcArchivo = new FileChooser();
                     flcArchivo.setTitle("Buscar Archivo");
                     flcArchivo.getExtensionFilters().add(new FileChooser.ExtensionFilter("TXT", "*.txt"));
                     File file = flcArchivo.showOpenDialog(this);
        }}

    @Override
    public void handle(KeyEvent keyEvent) {
        switch(keyEvent.getCode().toString()){
            case "Q":
            if(ban == false) {
                    arrBtnTabul[1].setStyle("-fx-background-color: blue");
            }else{
                arrBtnTabul[1].setStyle("-fx-background-color: gray");
            }
            break;}
            ban = !ban;
            //System.out.println(keyEvent.getCode().toString());
            }
            }
