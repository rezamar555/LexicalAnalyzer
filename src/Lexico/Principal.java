/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

import java.io.File;

/**
 *
 * @author mareyes
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "/home/mareyes/Documents/Universidad/S10/AutII/Semantico/src/semantico/Lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
