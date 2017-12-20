package com.example.estan.censodecarga;

/**
 * Created by Estan on 19/12/2017.
 */

public class Metodos {

    public static int valorCargaItem (String item){
        int w=0;
        if(item.equalsIgnoreCase("Foco (Bombillo) 60w")){
            w=60;
        }
        if(item.equalsIgnoreCase("Foco (Bombillo) 100w")){
            w=100;
        }
        if(item.equalsIgnoreCase(">Lámpara fluorescente 20w")){
            w=20;
        }
        if(item.equalsIgnoreCase("Lámpara Fluorescente 40w")){
            w=40;
        }
        if(item.equalsIgnoreCase("Lámpara fluorescente 75w")){
            w=75;
        }
        if(item.equalsIgnoreCase("Lámpara fluorescente 96w")){
            w=96;
        }



        return w;
    }

}
