package com.company;

import java.util.Scanner;

public class SingletonBD {

    private SingletonBD() { }

    public static void adicionarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o username: ");
        String usuario = sc.next();
        System.out.println("Informe a senha do usuário: ");
        String senha = sc.next();
        System.out.println("Informe o nome completo: ");
        String name = sc.next();
        System.out.println("Informe o ano de nascimento do usuário: ");
        Integer anoNascimento = sc.nextInt();

        Usuario novoUsuario = new Usuario(usuario, senha, name, anoNascimento);

        listarUsuarios();

    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }
}
