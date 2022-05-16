/**
 * Usamos o Exercicio orignal do modulo e adicionamos 5 tarefas
 * 1- calcular a idade do usuario
 * 2- alterar a senha de usuario
 * 3- validar a senha para que tenha comprimento suficiente
 * 4- adicionar um campo de e-mail para o cadastro de usuario
 * 5- adicionar este Java Doc
 */
package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    private static void validarSenha(String senha) throws InvalidPasswordException {
        if (senha.length() <= 6) {
            throw new InvalidPasswordException("Senha deve ser maior que 6 caracteres");
        }
    }

    public static void adicionarUsuario(){
        Scanner sc = new Scanner(System.in);
        String senha;
        System.out.println("Informe o username: ");
        String usuario = sc.next();
        while (true) {
            System.out.println("Informe a senha do usuário: ");
            senha = sc.next();
            try {
                validarSenha(senha);
                break;
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Informe o nome: ");
        String name = sc.next();
        System.out.println("Informe o ano de nascimento do usuário: ");
        Integer anoNascimento = sc.nextInt();

        Usuario novoUsuario = new Usuario(usuario, senha, name, anoNascimento);

        listaUsuario.add(novoUsuario);


    }

    public static void deletarUsuario(){
        boolean found = false;
        Scanner sc = new Scanner (System.in);
        System.out.println(" digite o usuario que deseja remover");
        String usuarioD = sc.next();
        for (Usuario usuario: listaUsuario) {
            if (usuario.getUsuario().equals(usuarioD)) {
                found = true;
                listaUsuario.remove(usuario);
                break;
            }
        }
        if (!found)
            System.out.println("Usuário não encontrado");
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
                while (true) {
                    System.out.print("Atualizar senha: ");
                    senha = sc.nextLine();
                    try {
                        validarSenha(senha);
                        break;
                    } catch (InvalidPasswordException e) {
                        System.out.println(e.getMessage());
                    }
                }
                usuario.setSenha(senha);
                break;
            }
        }
        if (!found)
            System.out.println("Usuário não encontrado");
    }

    public static void atualizarSenha() {
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(" digite o usuário que deseja alterar a senha:");
        String user, senha;
        user = sc.nextLine();
        for (Usuario usuario : listaUsuario) {
            if (usuario.getUsuario().equals(user)) {
                found = true;
                while (true) {
                    System.out.print("Nova senha do usuário: ");
                    senha = sc.nextLine();
                    try {
                        validarSenha(senha);
                        break;
                    } catch (InvalidPasswordException e) {
                        System.out.println(e.getMessage());
                    }
                }
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