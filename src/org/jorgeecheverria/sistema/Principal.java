/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorgeecheverria.sistema;

import java.io.InputStream;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

import org.jorgeecheverria.controller.CalculadoraController;

/**
 *
 * @author Profesores
 */
public class Principal extends Application {
   
    private final String PAQUETE_VISTA = "/org/jorgeecheverria/view/" ; 
    private final String PAQUETE_CSS = "/org/jorgeecheverria/css/" ; 
    
    private Stage escenarioPrincipal; 
    private Scene escena; 
    
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        
        this.escenarioPrincipal = escenarioPrincipal;  
        escenarioPrincipal.setTitle("Calculadora Fx !!!!!"); 
        ventanaCalculadora();
        escenarioPrincipal.show();
        
        //  Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));        
        //  Scene scene = new Scene(root);        
        //  stage.setScene(scene);
        //  stage.show();                                          
    
        
    }
    
     public void ventanaCalculadora() {  
    try{
        CalculadoraController calculadoraController = (CalculadoraController) cambiarEscena("CalculadoraFxView.fxml", 800, 250); 
        calculadoraController.setEscenarioPrincipal(this);
        
    }catch(Exception e){ 
        e.printStackTrace();  
    }
} 
     
     public Initializable cambiarEscena(String fxml, int ancho, int alto) throws Exception{ 
        Initializable resultado = null;   
        
        FXMLLoader cargadorFXML = new FXMLLoader();  
        
       InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA + fxml); 
       cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory()); 
                
       cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA)); 
                
        escena = new Scene((SplitPane)cargadorFXML.load(archivo),ancho,alto); 
        
        escena.getStylesheets().add(getClass().getResource(PAQUETE_CSS + "aplication.css").toExternalForm());
        
        escenarioPrincipal.setScene(escena); 
        escenarioPrincipal.sizeToScene();         
        
        resultado = (Initializable) cargadorFXML.getController();
        
        return resultado; 
        
        
        /*
         Parent root = FXMLLoader.load(getClass().getResource("fxCalculator.fxml"));
         Scene scene = new Scene(root);
        
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        
        stage.setScene(scene);
        
        stage.setResizable(false);
        
        stage.getIcons().add(new Image(getClass().getResourceAsStream("player.png")));
        
        stage.setTitle("Super FX-Calculator");
        
        stage.show();
        
        */
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
