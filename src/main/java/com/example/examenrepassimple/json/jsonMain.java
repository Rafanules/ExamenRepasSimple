package com.example.examenrepassimple.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class jsonMain {
    public static void main(String[] args) {

        try {

            //convertir el json a un objeto java y los volcamos a un objeto del tipo principal ({)
            ObjectMapper om = new ObjectMapper();
            Empreses datosEmpreses = om.readValue(new File("src/main/resources/empreses.json"), Empreses.class);

            //volcamos la informacion de empresa a un objeto de ese mismo tipo ( contiene datos de "empresa":{ )
            Empresa datosEmpresa = datosEmpreses.getEmpresa();

            //volcamos la informacion de empleats a un objeto de ese mismo tipo en este caso una list (contiene datos de "empleats":{)
            List <Empleat> empleats = datosEmpresa.getEmpleats();

            System.out.println("Nom empresa: "+datosEmpresa.getNom());
            System.out.println("Empleats: ");

            for(int i = 0;i<empleats.size();i++){//recorrem la list per mostrar els datos de empleats
                System.out.println("Nom: "+empleats.get(i).getNom());
                System.out.println("Edat: "+ empleats.get(i).getEdat());

            }


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
