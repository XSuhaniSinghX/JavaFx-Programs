import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import java.util.Scanner;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;


  public class RadioQuestion extends Application
  {
      public static void main(String args[])
      {
          launch();
      }
      @Override
      public void start(Stage primaryStage)
      {
          ToggleGroup tg=new ToggleGroup();
          Scanner in=new Scanner(System.in);
          System.out.println("Enter the name of Test");

          
          String test =in.nextLine();
          primaryStage.setTitle(test);
          System.out.println("Enter the question" );
          String q1=in.nextLine();
          Label lbl=new Label(q1);
          System.out.println("Enter the options");
           System.out.println("Option 1:");
          String s1=in.nextLine();
          System.out.println("Option 2:");
          String s2=in.nextLine();
          System.out.println("Option 3:");
          String s3=in.nextLine();
          System.out.println("Option 4:");
          String s4=in.nextLine();
          //Declaring the buttons
         RadioButton rb1=new RadioButton(s1);
         RadioButton rb2=new RadioButton(s2);
         RadioButton rb3=new RadioButton(s3);
         RadioButton rb4=new RadioButton(s3);
         /*ToggleGoup is used so that only one optionis chosen
           or else all the options will be able to be chosen at 
          once and it mightfunction just like a checkbox. 
         But the program will be compiled just fine without it*/
         rb1.setToggleGroup(tg);
          rb2.setToggleGroup(tg);
           rb3.setToggleGroup(tg);
            rb4.setToggleGroup(tg);
         primaryStage.setTitle("RADIO");
         VBox root=new VBox();
         root.getChildren().add(lbl);
        root.getChildren().addAll(rb1,rb2,rb3,rb4);
        Scene sc=new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();
    }
        
      }
  
