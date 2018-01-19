package com.cui.csci1101.assignment5;

import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
 
public class AudioPlaylist extends Application {
   private AudioClip audio;
   private Button play, stop, exit;
   
   public void start(Stage primaryStage) {
      String clipURL = "http://www.music.helsinki.fi/tmt/opetus/uusmedia/esim/a2002011001-e02.wav";
      audio = new AudioClip(clipURL); // create an audio from the AudioClip object
      play = new Button("Play"); // create a button
      play.setStyle("-fx-font:18 Arial");
      stop = new Button("Stop");
      stop.setStyle("-fx-font:18 Arial");
      exit = new Button("Exit");
      exit.setStyle("-fx-font:18 Arial");
      play.setOnAction(this::processButtonPress); // when press the button which is called play, then will go to processButtonPress
      stop.setOnAction(this::processButtonPress);
      exit.setOnAction(this::processButtonPress);
      FlowPane pane = new FlowPane(play, stop, exit); // Create a pane from FlowPane object
      pane.setAlignment(Pos.CENTER); // let the pane in the center of the scene
      pane.setHgap(20); //let buttons have 20 gap between each other
      pane.setStyle("-fx-background-color: LIGHTBLUE"); // set the background of the pane colour
      Scene scene = new Scene(pane,500,100); // create a scene which include the pane and length is 500, width is 100
      primaryStage.setTitle("Welcome to audio playlist"); // set the title of the stage
      primaryStage.setScene(scene); //set the scene to this stage
      primaryStage.show(); // show the stage
   }
   public void processButtonPress(ActionEvent event) {
      if(event.getSource() == play) {
          audio.play(); // if user press the play button, it will run
      }
      else if(event.getSource() == stop) {
          audio.stop();
      }
      else if(event.getSource() == exit) {
          System.exit(0);
      }
   }
   public static void main(String [] args) {
       Application.launch(args);
   }
}       

