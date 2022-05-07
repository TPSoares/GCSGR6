package com.company;

import java.util.ArrayList;
import java.util.Calendar;
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

    public static void listarUsuarios(){
        System.out.println("*** LISTA DE USUÁRIOS ***");
        for (Usuario usuario: listaUsuario) {
            System.out.println(usuario.toString() + ", ");
        }
    }

    public static void calcularIdadeUsuario(){
        Calendar calendar = Calendar.getInstance();
        Integer anoAtual = calendar.get(Calendar.YEAR);

        boolean found = false;
        Scanner sc = new Scanner(System.in);
        String usuarioInformado, nome, senha;
        int anoNascimento;
        System.out.print("Usuário para calcular a idade: ");
        usuarioInformado = sc.nextLine();
        for (Usuario usuario : listaUsuario) {
            if (usuario.getUsuario().equals(usuarioInformado)) {
                found = true;
                System.out.print("A idade do usuário nome " + usuario.getNome()
                        + " é " + (anoAtual - usuario.getAnoNascimento()) + " anos.\n");
                break;
            }
        }
        if (!found)
            System.out.println("Usuário não encontrado.\n");

    }

}