package com.example.examenrepassimple.html;

import java.io.PrintWriter;
import java.util.Scanner;

public class html {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el títol de la pàgina: ");
        String titol = sc.nextLine();

        System.out.println("Introdueix el titol principal");
        String titolP = sc.nextLine();

        System.out.println("Introdueix el contingut del paràgraf");
        String paragraf = sc.nextLine();

        try{

            PrintWriter writer = new PrintWriter("Generar.xml", "UTF-8");

            writer.println("<html>");
                writer.println("<head>");
                    writer.println("<title>" + titol + "</title>");
                writer.println("</head>");
                writer.println("<body>");
                    writer.println("<h1>" + titolP + "</h1>");
                    writer.println("<p>" + paragraf + "</p>");
                writer.println("</body>");
            writer.println("</html>");

            writer.close();

        }catch(Exception e){
            System.out.println(e);
        }

    }

}
