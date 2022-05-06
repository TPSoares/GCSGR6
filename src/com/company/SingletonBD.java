package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){ }

    public static void deletarUsuario(){
        Scanner sc = new Scanner (System.in);
        System.out.println(" digite o usuario que deseja remover");
        String usuarioD = sc.next();
        for (Usuario usuario: listaUsuario) {
            if (usuario.getUsuario().equals(usuarioD)) {
                listaUsuario.remove(usuario);
                break;
            }
        }
    }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }
}
