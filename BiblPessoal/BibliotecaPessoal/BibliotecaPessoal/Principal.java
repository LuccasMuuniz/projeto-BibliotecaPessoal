package BibliotecaPessoal;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		boolean continuar = true;

		while(continuar) {
			int opcaoEscolha =Integer.parseInt(JOptionPane.showInputDialog("1 - ADICIONAR LIVRO\n"
					+"2 - mostrar todos livros\n"
					+"3 - mostrar livros já lidos\n"
					+"4 - livros aleatorios\n"
					+"5 - terminei de ler um livro\n"
					+"6 - sair"));
			switch (opcaoEscolha) {
			case 1:
				Livro livro = new Livro();

				String autor = JOptionPane.showInputDialog("AUTOR");
				livro.setAutor(autor);

				String titulo = JOptionPane.showInputDialog("titulo");
				livro.setTitulo(titulo);

				int rLido = JOptionPane.showConfirmDialog(null, "Ja leu? ");
				if (rLido ==0) {
					livro.setLido(true);
				}else {
					livro.setLido(false);
				}

				biblioteca.adicionarLivro(livro);
				break;
			case 2:
				biblioteca.mostrarTodosLivros();
				break;
			case 3:
				biblioteca.mostrarLivrosLidos();
				break;
			case 4:
				biblioteca.livroAleatorio();
				break;
			case 5:
				biblioteca.terminouLivro();
				break;
			case 6:
				continuar = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Informe um numero valido");
				break;
			}

			/*int rContinuar = JOptionPane.showConfirmDialog(null, "Deseja continuar ? ");
			if (!(rContinuar ==0)) {
				continuar  = false;*/
		}
	}
}
