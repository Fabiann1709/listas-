

package com.mycompany.listas;
import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        ArrayList<String> listas = new ArrayList<>();
        
        System.out.println(listas.size());
        System.out.println(listas.isEmpty());
        
        listas.add("hola");
        listas.add("mundo");
        listas.add("bello");
        
        ArrayList<String> listas2 = new ArrayList<>();
        listas2.add("nuevo");
        listas2.addAll(listas);
        
        System.out.println(listas2);
        
        listas.set(2,"bonito");
        
        listas.remove(0);
        
        System.out.println(listas);
        
        System.out.println(listas.get(1));
        
        
    }
}
