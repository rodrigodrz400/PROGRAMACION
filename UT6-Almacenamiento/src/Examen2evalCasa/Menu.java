package Examen2evalCasa;

import java.util.Scanner;

public class Menu {

	private String[] opciones;
	private int num_opciones;
	private String titulo;

	private final static int MAX_OPCIONES = 20;

	public Menu() {
		opciones = new String[MAX_OPCIONES];
		titulo = "Men�";
	}

	public Menu(String[] opciones, int num_opciones) {
		this.opciones = new String[MAX_OPCIONES];
		for (int i = 0; i < num_opciones; i++)
			this.opciones[i] = opciones[i];
		titulo = "Men�";
		this.num_opciones = num_opciones;
	}

	public void a�adirOpci�n(String nuevaOpci�n) {
		if (num_opciones < MAX_OPCIONES) {
			this.opciones[num_opciones] = nuevaOpci�n;
			num_opciones++;
		}
	}

	public void imprimir() {
		System.out.println(titulo);
		for (int i = 0; i < titulo.length(); i++)
			System.out.print("-");
		System.out.println();
		for (int i = 0; i < num_opciones; i++)
			System.out.println((i + 1) + ". " + opciones[i]);
	}

	public int imprimirYPreguntar() {
		Scanner scn = new Scanner(System.in);
		int opci�n;

		imprimir();
		System.out.println(" Opci�n: ");
		opci�n = scn.nextInt();

		return opci�n;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static void main(String[] args) {

		Menu menu1;

		String[] opciones = { "Uno", "Dos", "Tres" };

		menu1 = new Menu(opciones, 3);

		System.out.println("Ha seleccionado " + menu1.imprimirYPreguntar());

	}

}