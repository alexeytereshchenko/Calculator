package sample;

import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.Node;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.text.Text;
public class test {

    @FXML
    Button sum = new Button();
    @FXML
    Label label = new Label();
    @FXML
    Label label2 = new Label();
    Integer a;
    String a1 = "1";
    String a2 = "2";
    String a3 = "3";
    String a4 = "4";
    String a5 = "5";
    String a6 = "6";
    String a7 = "7";
    String a8 = "8";
    String a9 = "9";
    String a0 = "0";
    String oper;
    private String s;
    int c = 0;
    private int f,p;
    private String r;

    @FXML
    public void one(ActionEvent event) {
        if (label.equals("")){
            label.setText(a1);
        }
        label.setText(label.getText() + a1);
        c = 1;
    }

    @FXML
    public void seven(ActionEvent event) {
        if (label.equals("")) {
            label.setText(a7);
        }
        label.setText(label.getText() + a7);
        c += 7;
//    System.out.println(c);
    }

    @FXML
    public void clear(ActionEvent event) {
        label2.setText(label.getText());
        label.setText("");
//        label2.setText("");
    }

    public void zero(){
        if (label.equals("")) {
            label.setText(a0);
        }
        label.setText(label.getText() + a0);
    }


    public void cancel(){}
    @FXML
    public void sum(){
        if (!label.equals("")) {
            s = label.getText();
            f = Integer.parseInt(s);
            System.out.println(f);
            oper = "+";
            label2.setText(s + "+");
            label.setText("");
        }

        if (label.equals("")){
            label.setText("");
        }
//        label.setText(label.getText() + "+");
    }

    @FXML
    public void smooth(ActionEvent event) {
        p = Integer.parseInt(label.getText());
        Operations op = new Operations();
        label2.setText(label2.getText() + label.getText());
        label.setText("");
//        int m = op.operations(f,p,oper);
//        label.setText(toString());
//        String hj = String.valueOf(m);
//        label.setText(hj);
//        System.out.println("Vidpov " + m);
//         String l = label.getText();
//        System.out.println(label.getText());
//        System.out.println(event.getSource());
//        int i = s.length();
//        System.out.println(s.length());

//        System.out.println(l.);

//          String b = label.getText();
//          s = "";
//          r = ""
//          p = Integer.parseInt(label.getText(), 3);
//        System.out.println(p);
//        int g = Integer.
//        System.out.println(g);
    }

    public void mul(){}
    public void sub(){}

    public void two(ActionEvent event) {
        if (label.equals("")) {
            label.setText(a2);
        }
        label.setText(label.getText() + a2);
        c += 2;
    }

    public void three() {
        if (label.equals("")) {
            label.setText(a3);
        }
        label.setText(label.getText() + a3);
        c =+ 3;
    }

    public void four() {
        if (label.equals("")) {
            label.setText(a4);
        }
        label.setText(label.getText() + a4);
        c += 4;
    }

    public void five() {
        if (label.equals("")) {
            label.setText(a5);
        }
        label.setText(label.getText() + a5);
        c += 5;
    }

    public void six() {
        if (label.equals("")) {
            label.setText(a6);
        }
        label.setText(label.getText() + a6);
        c += 6;
    }

    public void eight() {
        if (label.equals("")) {
            label.setText(a8);
        }
        label.setText(label.getText() + a8);
        c += 8;
    }

    public void nine() {
        if (label.equals("")) {
            label.setText(a9);
        }
        label.setText(label.getText() + a9);
        c += 9;
    }
}