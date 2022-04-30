package com.company;

import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){ }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){
        System.out.println("*** LISTA DE USUÁRIOS ***");
        for (Usuario usuario: listaUsuario) {
            System.out.println(usuario.toString() + ", ");
        }
    }
}
