package Examen2evalCasa;

import java.util.Scanner;

public class Menu {

	private String[] opciones;
	private int num_opciones;
	private String titulo;

	private final static int MAX_OPCIONES = 20;

	public Menu() {
		opciones = new String[MAX_OPCIONES];
		titulo = "Menú";
	}

	public Menu(String[] opciones, int num_opciones) {
		this.opciones = new String[MAX_OPCIONES];
		for (int i = 0; i < num_opciones; i++)
			this.opciones[i] = opciones[i];
		titulo = "Menú";
		this.num_opciones = num_opciones;
	}

	public void añadirOpción(String nuevaOpción) {
		if (num_opciones < MAX_OPCIONES) {
			this.opciones[num_opciones] = nuevaOpción;
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
		int opción;

		imprimir();
		System.out.println(" Opción: ");
		opción = scn.nextInt();

		return opción;
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