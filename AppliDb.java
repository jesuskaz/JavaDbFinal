/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jesus
 */
public class AppliDb extends Application {

    private static int rs;

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IllegalAccessException, InstantiationException {
        launch(args);
    }

    public static int insertData(String nom, String prenom, String adresse, String tel) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        String requete = ("INSERT INTO info(nom,prenom,adresse,tel) VALUES('" + nom + "','" + prenom + "','" + adresse + "','" + tel + "')");
        try {
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            Statement stm = conn.createStatement();
            int rs = stm.executeUpdate(requete);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static int insertDataB(String nom, String prenom, String adresse, String tel) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        String requete = ("INSERT INTO Bloquer(nom,prenom,adresse,tel) VALUES('" + nom + "','" + prenom + "','" + adresse + "','" + tel + "')");
        try {
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            Statement stm = conn.createStatement();
            int rs = stm.executeUpdate(requete);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static int insertDataF(String nom, String prenom, String adresse, String tel) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        String requete = ("INSERT INTO Favori(nom,prenom,adresse,tel) VALUES('" + nom + "','" + prenom + "','" + adresse + "','" + tel + "')");
        try {
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            Statement stm = conn.createStatement();
            int rs = stm.executeUpdate(requete);
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    /**
     *
     * @return @throws Exception
     */
    public static ArrayList selectData() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        String requete = ("SELECT * FROM info");
        String nom = null, prenom, adresse, tel;
        ArrayList<String> liste = new ArrayList<String>();
        try {
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            Statement etat = conn.createStatement();
            ResultSet rs = etat.executeQuery(requete);

            String id;
            while (rs.next()) {
                nom = rs.getString("nom");
                prenom = rs.getString("prenom");
                adresse = rs.getString("adresse");
                tel = rs.getString("tel");
                id = rs.getString("id");
                liste.add(id);
                liste.add(nom);
                liste.add(prenom);
                liste.add(adresse);
                liste.add(tel);
                System.out.println(id + " " + nom + " " + prenom + " " + " " + adresse + " " + tel);
            }

        } catch (Exception e) {
        } finally {
            System.out.println("Data");
        }
        return liste;
    }
    public static ArrayList selectDataf() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        String requete = ("SELECT * FROM Favori");
        String nom = null, prenom, adresse, tel;
        ArrayList<String> liste = new ArrayList<String>();
        try {
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            Statement etat = conn.createStatement();
            ResultSet rs = etat.executeQuery(requete);

            String id;
            while (rs.next()) {
                nom = rs.getString("nom");
                prenom = rs.getString("prenom");
                adresse = rs.getString("adresse");
                tel = rs.getString("tel");
                id = rs.getString("id");
                liste.add(id);
                liste.add(nom);
                liste.add(prenom);
                liste.add(adresse);
                liste.add(tel);
            }

        } 
        catch (Exception e){}
        return liste;
    }
    public static ArrayList selectDataF(String pre) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        String requete = ("SELECT * FROM info WHERE prenom = '" + pre + "';");
        ArrayList<String> liste = new ArrayList<String>();
        try {
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            Statement etat = conn.createStatement();
            ResultSet rs = etat.executeQuery(requete);
            String nom = null, prenom, adresse, tel;
            String id;
            while (rs.next()) {
                nom = rs.getString("nom");
                prenom = rs.getString("prenom");
                adresse = rs.getString("adresse");
                tel = rs.getString("tel");
                id = rs.getString("id");
                liste.add(id);
                liste.add(nom);
                liste.add(prenom);
                liste.add(adresse);
                liste.add(tel);

            }
        } catch (Exception e) {
        }
        return liste;
    }

    public static ArrayList selectDataB() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        String requete = ("SELECT * FROM Bloquer");
        ArrayList<String> tab = new ArrayList<String>();
        try {
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            Statement etat = conn.createStatement();
            ResultSet rs = etat.executeQuery(requete);
            String nom = null, prenom, adresse, tel;
            String id;
            while (rs.next()) {
                nom = rs.getString("nom");
                prenom = rs.getString("prenom");
                adresse = rs.getString("adresse");
                tel = rs.getString("tel");
                id = rs.getString("id");
                tab.add(id);
                tab.add(nom);
                tab.add(prenom);
                tab.add(adresse);
                tab.add(tel);
            }
        } 
        catch (Exception e) {}
        return tab;
    }

    public static void deleteData(String pre) throws Exception {

        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            PreparedStatement etat = conn.prepareStatement("DELETE FROM info WHERE prenom='" + pre + "';");
            etat.executeUpdate();
            System.out.println("Suppression reussie de l'id" + pre);

        } catch (Exception e) {
        }
    }

    public static void updateData(String pre, String nom, String prenom, String adresse, String tel) throws Exception {

        String hote = "jdbc:mysql://localhost:3306/Cordonnee";
        String user = "root";
        String pssw = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(hote, user, pssw);
            PreparedStatement etat = conn.prepareStatement("UPDATE info SET nom,prenom,adresse,tel WHER prenom='" + nom + "','" + prenom + "','" + adresse + "','" + tel + "','" + pre + "';");
            etat.executeUpdate();
            System.out.println("Suppression reussie de l'id" + pre);

        } catch (Exception e) {
        }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("AdminApp");

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 700, 500);
        primaryStage.setScene(scene);
        VBox vbox1 = new VBox();
        vbox1.setPadding(new Insets(1, 400, 0, 10));
        vbox1.setSpacing(5);

        Label label1 = new Label("Nom");
        Label label2 = new Label("Prenom");
        Label label3 = new Label("Adresse");
        Label label4 = new Label("Telephone");
        Label rech = new Label("Recherche");
        
        TextField text1 = new TextField();
        TextField text2 = new TextField();
        TextField text3 = new TextField();
        TextField text4 = new TextField();
        TextField reseach = new TextField();
        
        HBox hbox2 = new HBox();
        Button btn1 = new Button("Create");
        Button btn2 = new Button("Read");
        Button btn3 = new Button("Delete");
        Button btn4 = new Button("Update");
        hbox2.getChildren().addAll(btn1, btn2, btn3, btn4);
        hbox2.setPadding(new Insets(10));
        hbox2.setSpacing(5);
        vbox1.getChildren().addAll(label1, text1, label2, text2, label3, text3, label4, text4,rech,reseach);

        HBox hbox1 = new HBox();
        ListView<String> liste = new ListView<>();
        liste.getItems().add("ID   NOM   PRENOM   ADRESSE  TELEPHONE");
        vbox1.getChildren().addAll(liste);
        double width = 600 + liste.getInsets().getLeft() + liste.getInsets().getRight();
        liste.setPrefWidth(Math.max(liste.getPrefWidth(), width));
        hbox1.setSpacing(5);
        hbox1.setPadding(new Insets(10));
        hbox1.getChildren().addAll(liste);

        root.setCenter(hbox1);
        root.setTop(vbox1);
        root.setBottom(hbox2);

        HBox hbox3 = new HBox();
        
        VBox vbox3 = new VBox();
        /*ComboBox<String> cmb = new ComboBox<String>();
        cmb.getItems().add("1");
        cmb.getItems().add("2");
        cmb.getItems().add("3");
        cmb.getItems().add("4");
        cmb.getItems().add("5");
        cmb.getItems().add("6");
        cmb.getItems().add("7");
        cmb.getItems().add("8");
        cmb.getItems().add("9");
        cmb.getItems().add("10");
        vbox3.getChildren().addAll(cmb);*/

        //CheckBox checkbox1 = new CheckBox("Masquer");
        CheckBox checkbox2 = new CheckBox("Bloquer");
        CheckBox checkbox3 = new CheckBox("Favoris");
        vbox3.getChildren().addAll(checkbox2, checkbox3);
        vbox3.setPadding(new Insets(12));
        vbox3.setSpacing(10);
        root.setRight(vbox3);
        primaryStage.show();

        //Event
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String nom = text1.getText();
                String prenom = text2.getText();
                String adresse = text3.getText();
                String tel = text4.getText();
                String personne = nom + "," + prenom + "," + adresse + "," + tel;
                try {
                    if (checkbox3.isSelected()) 
                    {
                        String pren = reseach.getText();
                        ArrayList listF = selectDataF(pren);
                        System.out.println(listF);
                        String id;
                        id = (String)listF.get(0);
                        String name;
                        name = (String)listF.get(1);
                        String prename;
                        prename = (String)listF.get(2);
                        String adress;
                        adress = (String)listF.get(3);
                        String phone;
                        phone = (String)listF.get(4);
                        System.out.println("NOM RECUPERER : "+name+" "+prename);
                        int value = insertDataF(name,prename, adress, phone);
                        String chaine = (id+"  "+name+"  "+prename+"  "+adresse+"  "+phone);
                        liste.getItems().add(chaine);
                        System.out.println(value);
                    }
                   
                    if(checkbox2.isSelected())
                    {
                       // String element = cmb.getValue();
                        //int conver = Integer.valueOf(element);
                        String pre = reseach.getText();
                        ArrayList chaine = selectDataF(pre);
                        String id = (String)chaine.get(0);
                        int convert = Integer.valueOf(id);
                        String name = (String) chaine.get(1);
                        String prename = (String) chaine.get(2);
                        String adress = (String)chaine.get(3);
                        String phone = (String)chaine.get(4);
                        int value = insertDataB(name,prename,adresse,phone);
                        deleteData(pre);
                        System.out.println("Success Save");
                    }
                    else 
                    {
                        int value = insertData(nom, prenom, adresse, tel);
                       System.out.println("Success Save");
                    }
                    int value = insertDataF(nom, prenom, adresse, tel);
                    System.out.println("Success Save");
                    

                } catch (Exception ex) {
                    Logger.getLogger(AppliDb.class.getName()).log(Level.SEVERE, null, ex);
                }
                //liste.getItems().addAll(nom,prenom,adresse,tel);
            }
        });
        btn2.setOnAction((ActionEvent e) -> {
            try {

                liste.getItems().add("CONTACT FAVORIS");
                ArrayList data3 = selectDataf();
                String id3,nom3,prenom3,adresse3,tel3;
                id3 = (String) data3.get(0);
                nom3 = (String) data3.get(1);
                prenom3 = (String) data3.get(2);
                adresse3 = (String) data3.get(3);
                tel3 = (String) data3.get(4);
                String chaine3 = (id3+" "+nom3+" "+prenom3+" "+adresse3+" "+tel3);
                liste.getItems().add(chaine3);
                
              
                //ArrayList all = selectDataF();
                liste.getItems().add("CONTACT GENERAL");
                ArrayList data = selectData();
                String id,nom,prenom,adresse,tel;
                id = (String)data.get(0);
                nom = (String)data.get(1);
                prenom = (String)data.get(2);
                adresse = (String)data.get(3);
                tel = (String)data.get(4);
                String chaine = (id+" "+nom+" "+prenom+" "+adresse+" "+tel);
                liste.getItems().add(chaine);
                
                liste.getItems().add("CONTACT BLOQUE");
                ArrayList data2 = selectDataB();
                String id2,nom2,prenom2,adresse2,tel2;
                id2 = (String)data2.get(0);
                nom = (String)data2.get(1);
                prenom = (String)data2.get(2);
                adresse = (String)data2.get(3);
                tel = (String)data2.get(4);
                String chaine2 = (id2+" "+nom+" "+prenom+" "+adresse+" "+tel);
                liste.getItems().add(chaine2);
                
            } catch (Exception ex) {
                Logger.getLogger(AppliDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btn3.setOnAction((ActionEvent e) -> {
            try {
                //String delete = cmb.getValue();
                //int del = Integer.valueOf(delete);
                String pre = reseach.getText();
                deleteData(pre);
            } catch (Exception ex) {
                Logger.getLogger(AppliDb.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                String nom = text1.getText();
                String prenom = text2.getText();
                String adresse = text3.getText();
                String tel = text4.getText();
                System.out.println(nom);
                System.out.println(prenom);
                try {

                    //String valeur = cmb.getValue();
                    //int val = Integer.valueOf(valeur);
                    String pre = reseach.getText();
                    updateData(pre, nom, prenom, adresse, tel);

                } catch (Exception ex) {
                    Logger.getLogger(AppliDb.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
