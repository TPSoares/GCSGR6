package com.company;

import java.util.Scanner;

public class SingletonBD {

    private SingletonBD() { }

    public static void adicionarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do usuário: ");
        String name = sc.next();
        System.out.println("Informe a senha do usuário: ");
        String senha = sc.next();
        System.out.println("Informe o ano de nascimento do usuário: ");
        Integer anoNascimento = sc.nextInt();

        Usuario usuario = new Usuario("Usuário", senha, name, anoNascimento);

        //usuario.setUsuario();

    }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }
}
