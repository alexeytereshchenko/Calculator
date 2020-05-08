package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    Button sum = new Button();

    @FXML
    private Label label1 = new Label(null);
    @FXML
    private Label label2 = new Label(null);

    private double number1;
    private double number2;
    private double result;
    private String operation;
    private String one   = "1";
    private String two   = "2";
    private String three = "3";
    private String four  = "4";
    private String five  = "5";
    private String six   = "6";
    private String seven = "7";
    private String eight = "8";
    private String nine  = "9";
    private String zero  = "0";

    @FXML
    public void plusOrMin(ActionEvent event){
        String a = label1.getText();

        switch (a.charAt(0)){
            case '-':
                String q = label1.getText();
                String p = q.replaceAll("-", "");
                label1.setText(p);
                break;
            case ' ':
                label1.setText("-" + label1.getText());
                break;
            case '0':
                label1.setText(label1.getText());
                break;
            default:
                label1.setText(label1.getText());
                break;
        }

    }

    @FXML
    public void root(ActionEvent event){
        label1.setText("√" + label1.getText());
    }

    @FXML
    public void dot(ActionEvent event) {

        if (label1.getText() == " "){
            label1.setText(label1.getText());
        }
        else {
            label1.setText(label1.getText() + ".");
        }
    }

    @FXML
    public void clear(ActionEvent event) {

        label2.setText("");
        label1.setText("");
        number1 = 0;
        number2 = 0;
    }

    @FXML
    public void smooth(ActionEvent event) {

        if(label1.getText().charAt(0) == '√'){
            label2.setText(label1.getText());

            String g = label1.getText().replace('√', ' ');
            double a = Math.sqrt(Double.parseDouble(g));

            label1.setText(String.valueOf(a));

        } else if ((label1.getText() == "") || (label2.getText() == "")) {
            label1.setText(label1.getText());

        }
        else {
            number2 = Double.parseDouble(label1.getText());

            label2.setText(label2.getText() + label1.getText());
            label1.setText("");

            Operations op = new Operations();
            result = op.operationsDouble(number1, number2, operation);

            if (result % 1 == 0) {
                label1.setText(String.valueOf((long)(result)));
            }else {
                label1.setText(String.valueOf(result));
            }

            number1 = 0;
            number2 = 0;
        }
    }

    @FXML
    public void sumClick(ActionEvent event) {
            if (label1.getText() == ""){
                    label1.setText(label1.getText());
             }
            else if (label2.getText() == "") {
                number1 = Double.parseDouble(label1.getText());
                operation = "+";
                if (number1 % 1 == 0){
                    label2.setText(label2.getText() + (long)(number1) + operation);
                    label1.setText("");
                }else {
                    operation = "+";
                    label2.setText(label2.getText() + number1 + operation);
                    label1.setText("");
                }
            }
    }

    @FXML
    public void subClick(ActionEvent event) {
        if (label1.getText() == ""){
            label1.setText(label1.getText());
        }else {
            number1 = Double.parseDouble(label1.getText());
            operation = "-";

            if (number1 % 1 == 0){
                label2.setText(label2.getText() + (long)(number1) + operation);
                label1.setText("");
            }else {
                label2.setText(label2.getText() + number1 + operation);
                label1.setText("");
            }

        }
    }

    @FXML
    public void mulClick(ActionEvent event) {
        if (label1.getText() == "") {
            label1.setText(label1.getText());
        } else {
            number1 = Double.parseDouble(label1.getText());
            operation = "*";
            if (number1 % 1 == 0){
                label2.setText(label2.getText() + (long)(number1) + operation);
                label1.setText("");
            }else {
                label2.setText(label2.getText() + number1 + operation);
                label1.setText("");
            }
        }
    }

    @FXML
    public void devClick(ActionEvent event) {
        if (label1.getText() == "") {
            label1.setText(label1.getText());
        } else {
            number1 = Double.parseDouble(label1.getText());
            operation = "/";
            if (number1 % 1 == 0){
                label2.setText(label2.getText() + (long)(number1) + operation);
                label1.setText("");
            }else {
                label2.setText(label2.getText() + number1 + operation);
                label1.setText("");
            }
        }
    }
    @FXML
    public void zeroClick(ActionEvent event) {

        switch (label1.getText()){
            case "0":
                label1.setText("0");
                break;
            default:
                label1.setText(label1.getText() + zero);
        }
    }

    @FXML
    public void oneClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(one);
                break;
            case "0":
                label1.setText(one);
                break;
             default:
                 label1.setText(label1.getText() + one);
        }
    }

    @FXML
    public void twoClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(two);
                break;
            case "0":
                label1.setText(two);
                break;
            default:
                label1.setText(label1.getText() + two);
        }
    }

    @FXML
    public void threeClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(three);
                break;
            case "0":
                label1.setText(three);
                break;
            default:
                label1.setText(label1.getText() + three);
        }
    }

    @FXML
    public void fourClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(four);
                break;
            case "0":
                label1.setText(four);
                break;
            default:
                label1.setText(label1.getText() + four);
        }
    }

    @FXML
    public void fiveClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(five);
                break;
            case "0":
                label1.setText(five);
                break;
            default:
                label1.setText(label1.getText() + five);
        }
    }

    @FXML
    public void sixClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(six);
                break;
            case "0":
                label1.setText(six);
                break;
            default:
                label1.setText(label1.getText() + six);
        }
    }

    @FXML
    public void sevenClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(seven);
                break;
            case "0":
                label1.setText(seven);
                break;
            default:
                label1.setText(label1.getText() + seven);
        }
    }

    @FXML
    public void eightClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(eight);
                break;
            case "0":
                label1.setText(eight);
                break;
            default:
                label1.setText(label1.getText() + eight);
        }
    }

    @FXML
    public void nineClick(ActionEvent event) {
        switch (label1.getText()){
            case "":
                label1.setText(nine);
                break;
            case "0":
                label1.setText(nine);
                break;
            default:
                label1.setText(label1.getText() + nine);
        }
    }

}
