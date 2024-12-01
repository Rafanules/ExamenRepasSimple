package com.example.examenrepassimple.JDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.sql.PreparedStatement;

@SpringBootApplication
public class conJdbc {


    public static void main(String[] args) {
        try{

            Connection conexio = null;
            ResultSet resultat = null;

            //sin ?
            //creem conexio
            conexio = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Usuario\\Desktop\\conexioJdbc\\src\\main\\resources\\sqlite (1).db");

            //creem, preparem y executem la sql
            PreparedStatement sql1 = conexio.prepareStatement("Select * from Empleats");
            resultat = sql1.executeQuery();


            while(resultat.next()){//mientras si no hay mas datos false
                String nif = resultat.getString("Nif");
                Double salari = resultat.getDouble("Salari");


                System.out.println("consulta 1");
                System.out.println("NIF: "+ nif);
                System.out.println("Salari: "+ salari);
            }
            resultat.close();



            //sql con ?
            PreparedStatement sql2 = conexio.prepareStatement("Select * From Empleats Where nom = ?");
            sql2.setString(1, "Jaime");//asignem valor al ?

            resultat = sql2.executeQuery();

            while(resultat.next()){
                String nif = resultat.getString("Nif");
                String nom = resultat.getString("Nom");
                String cognoms = resultat.getString("Cognoms");
                Double salari = resultat.getDouble("Salari");


                System.out.println("consulta 2");
                System.out.println("NIF: "+nif+" Nom: "+nom+" Cognoms: "+cognoms+" Salari: "+salari);

            }

            resultat.close();

            conexio.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
