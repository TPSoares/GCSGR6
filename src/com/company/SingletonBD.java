package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o username: ");
        String usuario = sc.next();
        System.out.println("Informe a senha do usuário: ");
        String senha = sc.next();
        System.out.println("Informe o nome: ");
        String name = sc.next();
        System.out.println("Informe o ano de nascimento do usuário: ");
        Integer anoNascimento = sc.nextInt();

        Usuario novoUsuario = new Usuario(usuario, senha, name, anoNascimento);

        listaUsuario.add(novoUsuario);


    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios() {
        System.out.println("*** LISTA DE USUÁRIOS ***");
        for (Usuario usuario : listaUsuario) {
            System.out.println(usuario.toString() + ", ");
        }
    }
}