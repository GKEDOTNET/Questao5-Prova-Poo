/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package app;

import java.util.Scanner;

/**
 *
 * @author Gustavo Kovaleski Estlin
 */
public class Main {

    public static void main(String[] args) {
        
        Editora ed = new Editora();
        Livro lv = new Livro();

        Scanner sc = new Scanner(System.in);
        System.out.println("--[Adicionar a EDITORA]-- ");
        System.out.print("\nInforme o ID: ");
        ed.setIdEditora(sc.nextInt());
        System.out.print("\nInforme o NOME da Editora: ");
        ed.setNomeEditora(sc.next());
        System.out.print("\nInforme o EMAIL da Editora: ");
        ed.setEmail(sc.next());
        
        System.out.println("\n\n--[Adicionar o LIVRO]-- ");
        lv.idEditora = ed.idEditora;
        System.out.print("\nInforme o TITULO: ");
        lv.setTituloLivro(sc.next());
        System.out.print("\nInforme o AUTOR: ");
        lv.setAutorLivro(sc.next());
        System.out.print("\nInforme o ANO: ");
        lv.setAno(sc.nextInt());
        
        System.out.println("--[DADOS]--\n\nTitulo: "+lv.getTituloLivro()+"\nAutor: "+lv.getAutorLivro()+"\nAno: "+lv.getAno()+"\nID editora: "+lv.idEditora+"\nEditora: "+ed.getNomeEditora()+"\nContato Editora: "+ed.getEmail());
        



    }
}
