package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){ }

    public static void deletarUsuario(){ }

    public static void atualizarUsuario() {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        String user, nome, senha;
        int anoNascimento;
        System.out.print("Usuário para atualizar: ");
        user = sc.nextLine();
        for (Usuario usuario : listaUsuario) {
            if (usuario.getUsuario().equals(user)) {
                found = true;
                System.out.print("Atualizar nome: ");
                nome = sc.nextLine();
                usuario.setNome(nome);
                System.out.print("Atualizar data de nascimento: ");
                anoNascimento = sc.nextInt();
                usuario.setAnoNascimento(anoNascimento);
                System.out.print("Atualizar senha: ");
                senha = sc.nextLine();
                usuario.setSenha(senha);
                break;
            }
        }
        if (!found)
            System.out.println("Usuário não encontrado");
    }

    public static void listarUsuarios(){ }
}
