package com.example.locationcenter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
Management management=new Management();
    ArrayList<Center> centersList = management.centers;
    Center[] centersArray = centersList.toArray(new Center[0]);
    ArrayList<Center> centersList2 = management.centers2;
    ArrayList<Center> centersList3 = management.centers3;

    @Override
    public void start(Stage stage) throws IOException {

        // Adding 4-5 center



        GridPane grid1 = new GridPane();
        Scene scene = new Scene(grid1, 900, 650);
        grid1.setVgap(10);
        grid1.setHgap(10);
        Rectangle r1=new Rectangle();
        r1.setHeight(20);
        r1.setWidth(900);
        r1.setFill(Color.DARKBLUE);
        grid1.add(r1,0,0);

        Text contact=new Text("Contact us: 1234-5678");
        grid1.add(contact,0,0);

        Text status=new Text("      Check your vaccination status here:");
        Text enroll=new Text("      Get yourself Enroll for vaccination here:");
        Text verify=new Text("      Verify yourself for vaccinated here:");
        grid1.add(status,0,3);
        grid1.add(enroll,0,4);
        grid1.add(verify,0,5);
        status.setFont(Font.font("times new roman",15));
        enroll.setFont(Font.font("times new roman",15));
        verify.setFont(Font.font("times new roman",15));


       Button status1=new Button("Status");
        Button enroll1=new Button("Enroll");
        Button verify1=new Button("Verify");

        enroll1.setOnAction(w -> {
            GridPane grid2 = new GridPane();
            Scene scene2 = new Scene(grid2, 400, 300);
            grid2.setStyle("-fx-border-color: darkblue; -fx-border-width: 5px;");

   grid2.setHgap(20);
   grid2.setVgap(20);

            Text enrollement=new Text("ENROLLENT FOR VACCINATION");
            grid2.add(enrollement,0,0);
            enrollement.setFont(Font.font("times new roman",15));
           Text cnic=new Text("CNIC:");
            cnic.setFont(Font.font("times new roman",12));
           TextField codetext=new TextField();
           grid2.add(cnic,0,1);
           grid2.add(codetext,1,1);
          Text question=new Text("Do you want to get yourslf enrolled for vaccination");
            question.setFont(Font.font("times new roman",12));
          grid2.add(question,0,2);

            ColumnConstraints col1 = new ColumnConstraints();
            col1.setPercentWidth(30);
            ColumnConstraints col2 = new ColumnConstraints();
            col2.setPercentWidth(70);
            grid2.getColumnConstraints().addAll(col1, col2);

            HBox cnicBox = new HBox(10);
            cnicBox.getChildren().addAll(cnic, codetext);
            grid2.add(cnicBox, 0, 1, 2, 1); //


            RadioButton yesRadioButton = new RadioButton("Yes");
            RadioButton noRadioButton = new RadioButton("No");

            ToggleGroup toggleGroup = new ToggleGroup();
            yesRadioButton.setToggleGroup(toggleGroup);
            noRadioButton.setToggleGroup(toggleGroup);

            VBox radioButtons = new VBox(10); // You can adjust the spacing between buttons as needed
            radioButtons.getChildren().addAll(yesRadioButton, noRadioButton);
            grid2.add(radioButtons, 0, 3);

            yesRadioButton.setOnAction(e->{

                GridPane grid3 = new GridPane();
                Scene scene3 = new Scene(grid3, 900, 650);
               grid3.setPadding(new Insets(0,0,0,20));
                grid3.setStyle("-fx-border-color: darkblue; -fx-border-width: 5px;");

                grid3.setHgap(20);
                grid3.setVgap(20);

                Text enrollement2=new Text("ENROLLENT FOR VACCINATION");
                enrollement2.setFont(Font.font("times new roman",20));
                grid3.add(enrollement2,0,0);
                Text name=new Text("Name:");
                name.setFont(Font.font("times new roman",15));
                TextField name1=new TextField();

                HBox h1=new HBox();
                Text age=new Text("age:");
                age.setFont(Font.font("times new roman",15));
                TextField age1=new TextField();
                h1.getChildren().addAll(age,age1);

                HBox h2=new HBox();
                Text city=new Text("City:");
                city.setFont(Font.font("times new roman",15));
                TextField city1=new TextField();
                h2.getChildren().addAll(city,city1);

                HBox h3=new HBox();
                Text cnic2=new Text("CNIC:");
                cnic2.setFont(Font.font("times new roman",15));
                TextField codetext1=new TextField();
h3.getChildren().addAll(cnic2,codetext1);
                VBox v1=new VBox();
                v1.getChildren().addAll(h3,h1,h2);
v1.setSpacing(20);
                Text gender=new Text("Gender:");
                gender.setFont(Font.font("times new roman",15));
                Text phone=new Text("Phone number:");
                phone.setFont(Font.font("times new roman",15));
                TextField phone1=new TextField();
                Text address=new Text("Address:");
                address.setFont(Font.font("times new roman",15));
                TextField address1=new TextField();
                Text text1=new Text("Select your nearest vaccination center:");
                text1.setFont(Font.font("times new roman",15));
                Button Select=new Button("Select");
                HBox h5=new HBox();
                h5.getChildren().addAll(text1,Select);
                Select.setStyle("-fx-background-color: derive(DARKBLUE, 20%); -fx-background-radius: 20;");
Select.setTextFill(Color.WHITE);

                RadioButton maleRadioButton = new RadioButton("Male");
                RadioButton femaleRadioButton = new RadioButton("Female");
                maleRadioButton.setFont(Font.font("times new roman",15));
                femaleRadioButton.setFont(Font.font("times new roman",15));

                ToggleGroup toggleGroup1 = new ToggleGroup();
                maleRadioButton.setToggleGroup(toggleGroup1);
                femaleRadioButton.setToggleGroup(toggleGroup1);

                VBox radioButtons2 = new VBox(10); // You can adjust the spacing between buttons as needed
                radioButtons2.getChildren().addAll(femaleRadioButton, maleRadioButton);


                Button back=new Button("Back");
                back.setStyle("-fx-background-color: derive(DARKBLUE, 20%); -fx-background-radius: 20;");
                back.setTextFill(Color.WHITE);
                grid3.add(back,0,11);

                back.setOnAction(a->{
                    stage.setScene(scene); // Set the scene to the initial scene (grid1)
                    stage.show();
                });

                Select.setOnAction(x->{
                    GridPane grid4=new GridPane();
                    Scene scene4 = new Scene(grid4, 900, 650);
                    grid4.setStyle("-fx-border-color: darkblue; -fx-border-width: 5px;");
grid4.setPadding(new Insets(10,0,0,20));

                    HBox hb=new HBox();
                    Image logoImage1 = new Image("img_2.png");
                    ImageView logoImageView = new ImageView(logoImage1);

                    logoImageView.setFitWidth(100);
                    logoImageView.setFitHeight(100);

                    Text title2 = new Text("\nCOVID\nVACCINATION\nCENTER");
                    title2.setFont(Font.font("Times New Roman", 20));
                    title2.setFill(Color.DARKBLUE);
                    title2.setTextAlignment(TextAlignment.CENTER);
                  hb.getChildren().addAll(logoImageView,title2);
                  hb.setSpacing(20);
                  hb.setPadding(new Insets(10,0,0,100));
                  grid4.add(hb,0,0);

                    Label cityLabel = new Label("Select your city");

                    ComboBox<String> cityComboBox = new ComboBox<>();
                    cityComboBox.getItems().addAll("Lahore", "Faisalabad", "sahiwal");

                    cityComboBox.setOnAction(a -> {
                        String selectedCity = cityComboBox.getSelectionModel().getSelectedItem();
                        if (selectedCity != null && selectedCity.equals("Lahore")) {

                            setupCenterTable(grid4,stage, centersList);

                        }
                       else if (selectedCity != null && selectedCity.equals("Faisalabad")) {

                            setupCenterTable(grid4,stage, centersList2);

                        }
                        else if (selectedCity != null && selectedCity.equals("Sahiwal")) {

                            setupCenterTable(grid4,stage, centersList3);

                        }
                    });
                    VBox vbox = new VBox(10);
                    vbox.getChildren().addAll(cityLabel, cityComboBox);

                    grid4.add(vbox,0,1);


                    grid4.setVgap(20);
                          grid4.setHgap(20);
                    stage.setScene(scene4);
                    stage.show();



                });

                grid3.add(name, 0, 1);
                grid3.add(name1, 0, 2);

                grid3.add(v1, 0, 3);


                grid3.add(address, 0, 4);
                GridPane.setColumnSpan(address1, 2);
                grid3.add(address1, 0, 5);
                grid3.add(phone, 0, 6);
                GridPane.setColumnSpan(phone1, 2);
                grid3.add(phone1, 0, 7);

                grid3.add(gender, 0, 8);
                grid3.add(radioButtons2, 0,9 );
                grid3.add(h5,0,10);


                stage.setScene(scene3);
                stage.show();

            });
            stage.setScene(scene2);
            stage.show();
        });



        grid1.add(status1,7,3);
        grid1.add(enroll1,7,4);
        grid1.add(verify1,7,5);
        status1.setTextFill(Color.WHITE);
        enroll1.setTextFill(Color.WHITE);
        verify1.setTextFill(Color.WHITE);

        status1.setStyle("-fx-background-color: derive(DARKBLUE, 20%); -fx-background-radius: 20;");
        enroll1.setStyle("-fx-background-color: derive(DARKBLUE, 20%); -fx-background-radius: 20;");
        verify1.setStyle("-fx-background-color: derive(DARKBLUE, 20%); -fx-background-radius: 20;");


        Image logoImage = new Image("img_2.png");
        ImageView logoImageView = new ImageView(logoImage);

        logoImageView.setFitWidth(100);
        logoImageView.setFitHeight(100);
        grid1.add(logoImageView, 5, 1);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(12);
        grid1.getColumnConstraints().addAll(column1);

        Text title2 = new Text("COVID\nVACCINATION\nCENTER");
        title2.setFont(Font.font("Times New Roman", 20));
        title2.setFill(Color.DARKBLUE);
        title2.setTextAlignment(TextAlignment.CENTER);
        grid1.add(title2, 7, 1);

       Button back=new Button("Back");
        back.setStyle("-fx-background-color: derive(DARKBLUE, 20%); -fx-background-radius: 20;");
       back.setTextFill(Color.WHITE);
       grid1.add(back,1,6);


        HBox h1=new HBox();
        h1.setSpacing(30);
       h1.setPadding(new Insets(20,0,0,80));

        // Inside the start method after creating ImageViews

        Image i1 = new Image("img_4.png");
        ImageView imageView1 = new ImageView(i1);
        imageView1.setFitWidth(200); // Set width
        imageView1.setFitHeight(200); // Set height

        Image i2 = new Image("img_1.png");
        ImageView imageView2 = new ImageView(i2);
        imageView2.setFitWidth(200); // Set width
        imageView2.setFitHeight(200); // Set height

        Image i3 = new Image("img_5.png"); // Replace "img_3.png" with your third image path
        ImageView imageView3 = new ImageView(i3);
        imageView3.setFitWidth(200); // Set width
        imageView3.setFitHeight(200); // Set height


        Rectangle separator1 = new Rectangle(20, 200, Color.TRANSPARENT);
        separator1.setStroke(Color.TRANSPARENT);
        Rectangle separator2 = new Rectangle(20, 200, Color.TRANSPARENT);

        h1.setSpacing(30);
        h1.setPadding(new Insets(20, 0, 0, 80));
        h1.getChildren().addAll(imageView1, separator1, imageView2, separator2, imageView3);

        grid1.add(h1, 0, 7);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void setupCenterTable(GridPane grid4,Stage stage, ArrayList<Center> centersArray) {

        TableView<Center> centerTable = new TableView<>();
        centerTable.setEditable(false);

        TableColumn<Center, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameColumn.setMinWidth(50);

        TableColumn<Center, String> pincodeColumn = new TableColumn<>("Pincode");
        pincodeColumn.setCellValueFactory(new PropertyValueFactory<>("pincode"));
        pincodeColumn.setMinWidth(50);

        TableColumn<Center, String> locationColumn = new TableColumn<>("Location");
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        locationColumn.setMinWidth(50);

        TableColumn<Center, Integer> serialNumberColumn = new TableColumn<>("Serial Number");
        serialNumberColumn.setCellValueFactory(new PropertyValueFactory<>("serialNumber"));
        serialNumberColumn.setMinWidth(50);

        centerTable.getColumns().addAll(serialNumberColumn, nameColumn, pincodeColumn, locationColumn);
        centerTable.getItems().addAll(centersArray);

        TableColumn<Center, Void> actionColumn = new TableColumn<>("Actions");

        actionColumn.setCellFactory(param -> new TableCell<Center, Void>() {
            private final Button addButton = new Button("Add Slots");

            {
                addButton.setOnAction(event -> {

                    GridPane grid5 = new GridPane();
                    Scene scene5 = new Scene(grid5, 600, 350);
                    grid5.setPadding(new Insets(0,0,0,20));
                    grid5.setStyle("-fx-border-color: darkblue; -fx-border-width: 5px;");
                    grid5.setPadding(new Insets(20,0,0,20));
                    Center selectedCenter = getTableView().getItems().get(getIndex());
                    String name=selectedCenter.getName();
                    Text nametext=new Text(name);
                    nametext.setFont(Font.font("times new roman",20));
                    grid5.add(nametext,1,0);

                    Text time=new Text("Select suitable time to be vaccinated:");
                    TextField time2=new TextField();
                    time.setFont(Font.font("times new roman",15));

                    Text date=new Text("Select suitable date to be vaccinated:");
                    TextField date2=new TextField();
                    date.setFont(Font.font("times new roman",15));

                    Button confirm=new Button("Confirm");
                    confirm.setStyle("-fx-background-color: derive(DARKBLUE, 20%); -fx-background-radius: 20;");
                    confirm.setTextFill(Color.WHITE);


                    grid5.add(time,0,1);
                    grid5.add(time2,1,1);
                    grid5.add(date,0,2);
                    grid5.add(date2,1,2);
                    grid5.add(confirm,1,3);

                    grid5.setHgap(20);
                    grid5.setVgap(20);

                    stage.setScene(scene5);
                    stage.show();
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(addButton);
                }
            }



        });

        actionColumn.setPrefWidth(100);
        centerTable.getColumns().add(actionColumn); // Add the action column to the TableView


        grid4.add(centerTable, 0, 3);

        serialNumberColumn.setPrefWidth(100);
        nameColumn.setPrefWidth(200);
        pincodeColumn.setPrefWidth(100);
        locationColumn.setPrefWidth(250);

    }


    public static void main(String[] args) {

        Management management=new Management();
        launch();
    }
}
