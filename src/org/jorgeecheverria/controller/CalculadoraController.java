/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorgeecheverria.controller;
import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.jorgeecheverria.sistema.Principal;

/**
 *
 * @author Profesores
 */
 
public class CalculadoraController implements Initializable {  
    private Principal escenarioPrincipal;
    
// public class CalculadoraController implements Inicializable {
    double number1 = 0.;
    double number2 = 0.;
    double solution;
    BigInteger soltn;
    long n1 = 0;
    long n2 = 0;
    String operation = "";
    
    @FXML
    private TextField txtDisplay;
    
    @FXML
    private void Btn7OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "7");
    }
    @FXML
    private void Btn8OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "8");
    }
    @FXML
    private void Btn9OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "9");
    }
    @FXML
    private void Btn4OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "4");
    }
    @FXML
    private void Btn5OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "5");
    }
    @FXML
    private void Btn6OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "6");
    }
    @FXML
    private void Btn3OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "3");
    }
    @FXML
    private void Btn2OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "2");
    }
    @FXML
    private void Btn1OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "1");
    }
    @FXML
    private void Btn0OnAction(ActionEvent event) {
        txtDisplay.setText(txtDisplay.getText() + "0");
    }
    @FXML
    private void BtnDecimalPointOnAction(ActionEvent event) {
        if(!txtDisplay.getText().contains("."))
            txtDisplay.setText(txtDisplay.getText() + ".");
    }
    @FXML
    private void BtnPlusMinusOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(!n.contains("-"))
            txtDisplay.setText("-" + n);
    }
    @FXML
    private void BtnClearOnAction(ActionEvent event) {
        txtDisplay.setPromptText("0");
        txtDisplay.setText("");
    }
    @FXML
    private void BtnClearCharOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        String nn;
        nn = n.substring(0, n.length()-1); 
        txtDisplay.setText(nn);
    }
    @FXML
    private void BtnPIOnAction(ActionEvent event) {
        txtDisplay.setText(String.valueOf(Math.PI));
    }
    @FXML
    private void BtnEOnAction(ActionEvent event) {
        txtDisplay.setText(String.valueOf(Math.E));
    }
    @FXML
    private void BtnSumOnAction(ActionEvent event) {
        operation = "suma";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            number1 = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnSubtractOnAction(ActionEvent event) {
        operation = "resta";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            number1 = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnProductOnAction(ActionEvent event) {
        operation = "producto";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            number1 = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnDivOnAction(ActionEvent event) {
        operation = "division";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            number1 = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnSquareRootOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.sqrt(nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnCubicRootOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.cbrt(nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnModulusOnAction(ActionEvent event) {
        operation = "modulo";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            number1 = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnPower2OnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.pow(nn, 2);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnPower3OnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.pow(nn, 3);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnPowXnOnAction(ActionEvent event) {
        operation = "potencia";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            number1 = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnExp10OnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.pow(10, nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnExpEOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.pow(Math.E, nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnLogOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.log10(nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnLnOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.log(nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnInverseOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = 1 / nn;
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnFactorialOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            long nn = Long.parseLong(n);
            BigInteger m;
            m = factorial(nn);
            n = String.valueOf(m);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnCombinationOnAction(ActionEvent event) {
        operation = "combination";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            n1 = Integer.parseInt(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnVariationOnAction(ActionEvent event) {
        operation = "variation";
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            n1 = Integer.parseInt(txtDisplay.getText());
            txtDisplay.setText("");
            txtDisplay.setPromptText("");
        }
    }
    @FXML
    private void BtnDegMinSecOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            n = degreesConversor(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnSineOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            if(nn >= 360 || nn < 0) nn %= 360;
            if(nn % 180 == 0) nn = 0;
            else nn = Math.sin(Math.toRadians(nn));
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnCosineOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            if(nn >= 360 || nn < 0) nn %= 360;
            if(nn == 90 || nn == 270) nn = 0;
            else nn = Math.cos(Math.toRadians(nn));
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnTangentOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            if(nn >= 360 || nn < 0) nn %= 360;

            if(nn == 0 || Math.abs(nn) == 180) nn = 0;
            else if(Math.abs(nn) == 45 || Math.abs(nn) == 225) nn = 1;
            else if(Math.abs(nn) == 135 || Math.abs(nn) == 315) nn = -1;
            else if(Math.abs(nn) == 90 || Math.abs(nn) == 270) nn = Double.NaN;
            else nn = Math.tan(Math.toRadians(nn));
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnASineOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.toDegrees(Math.asin(nn));
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnACosineOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.toDegrees(Math.acos(nn));
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnATangentOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.toDegrees(Math.atan(nn));
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnHypSineOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.sinh(nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnHypCosineOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.cosh(nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnHypTangentOnAction(ActionEvent event) {
        String n = txtDisplay.getText();
        if(n.length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            double nn = Double.parseDouble(n);
            nn = Math.tanh(nn);
            n = String.valueOf(nn);
            txtDisplay.setText(n);
        }
    }
    @FXML
    private void BtnEqualsOnAction(ActionEvent event) {
        if(txtDisplay.getText().length() == 0){
            txtDisplay.setText("Please, insert digits");
        }
        else {
            number2 = Double.parseDouble(txtDisplay.getText());
            switch (operation) {
                case "suma":
                    solution = number1 + number2;
                    txtDisplay.setText(String.valueOf(solution));
                    break;
                case "resta":
                    solution = number1 - number2;
                    System.out.println(solution);
                    txtDisplay.setText(String.valueOf(solution));
                    break;
                case "producto":
                    solution = number1 * number2;
                    txtDisplay.setText(String.valueOf(solution));
                    break;
                case "division":
                    solution = number1 / number2;
                    txtDisplay.setText(String.valueOf(solution));
                    break;
                case "potencia":
                    solution = Math.pow(number1, number2);
                    txtDisplay.setText(String.valueOf(solution));
                    break;
                case "modulo":
                    solution = number1 % number2;
                    txtDisplay.setText(String.valueOf(solution));
                    break;
                case "combination":
                    n2 = Long.parseLong(txtDisplay.getText());
                    soltn = combinatorial(n1, n2);
                    txtDisplay.setText(String.valueOf(soltn));
                    break;
                case "variation":
                    n2 = Long.parseLong(txtDisplay.getText());
                    soltn = variations(n1, n2);
                    txtDisplay.setText(String.valueOf(soltn));
                    break;
                default:
                    break;
            }
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public static BigInteger factorial(long n) {
    if (n == 0) return BigInteger.valueOf(1);
    BigInteger fact = BigInteger.valueOf(1);
    for (int i = 1; i <= n; i++) {
        fact = fact.multiply(BigInteger.valueOf(i));
	}
   
    return fact;
    }
    public static BigInteger combinatorial(long m, long n) {
        return factorial(m).divide(factorial(n).multiply(factorial(m - n)));
    }
    public static BigInteger variations(long m, long n) {
        return factorial(m).divide(factorial(m - n));
    }
    public static String degreesConversor(double x){
        int integer_part = (int) Math.floor(x);
        double decimal_part = x - Math.floor(x);
        int deg, min, secs;
        String expression;

        min = Math.abs((int) (decimal_part * 60.));
        secs = Math.abs((int) ((decimal_part * 60. - Math.floor(decimal_part * 60.)) * 60.));
        deg = integer_part;

        if(secs >= 60) {secs -= 60; min += 1;}
        if(min >= 60) {min -= 60; deg += 1;}
        if(deg >= 360) deg %= 360;
        if(deg < 0) deg += 360;

        expression = String.valueOf(deg) + "º " + String.valueOf(min) + 
                "' " + String.valueOf(secs) + "''";
        return expression;
    }
    
    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    public void menuPrincipal(){  
        escenarioPrincipal.ventanaCalculadora();
    } 
    
}
