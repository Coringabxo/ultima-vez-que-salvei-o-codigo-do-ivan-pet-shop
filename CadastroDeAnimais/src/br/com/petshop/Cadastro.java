package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private ArrayList<Animal> animais;
    private Scanner scanner;

    public Cadastro() {
        animais = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void cadastrarCachorro() {
        System.out.print("Nome do cachorro: ");
        String nomeCachorro = scanner.nextLine();
        System.out.print("Tamanho do cachorro: ");
        int tamanhoCachorro = scanner.nextInt();
        System.out.print("Idade do cachorro: ");
        int idadeCachorro = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Raça do cachorro: ");
        String raca = scanner.nextLine();
        animais.add(new Cachorro(nomeCachorro, idadeCachorro, tamanhoCachorro, raca));
        System.out.println("Cachorro cadastrado com sucesso!");
    }

    public void cadastrarGato() {
        System.out.print("Nome do gato: ");
        String nomeGato = scanner.nextLine();
        System.out.print("Tamanho do gato: ");
        int tamanhoGato = scanner.nextInt();
        System.out.print("Idade do gato: ");
        int idadeGato = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor do pelo do gato: ");
        String corPelo = scanner.nextLine();
        animais.add(new Gato(nomeGato, idadeGato, tamanhoGato, corPelo));
        System.out.println("Gato cadastrado com sucesso!");
    }

    public void cadastrarFurao() {
        System.out.print("Nome do furão: ");
        String nomeFurao = scanner.nextLine();
        System.out.print("Tamanho do furão: ");
        int tamanhoFurao = scanner.nextInt();
        System.out.print("Idade do furão: ");
        int idadeFurao = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Cor do pelo do furão: ");
        String corRaca = scanner.nextLine();
        animais.add(new Furão(nomeFurao, idadeFurao, tamanhoFurao, corRaca));
        System.out.println("Furão cadastrado com sucesso!");
    }

    public void exibirAnimais() {
        System.out.println("\n=== Lista de Animais ===");
        for (Animal animal : animais) {
            animal.exibirInfo();
            System.out.println("------------------------");
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}
