package BibliotecaPessoal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Biblioteca {
	List<Livro> biblioteca = new ArrayList<>();
	List<Livro> livroLido = new ArrayList<>();
	List<Livro> nLido = new ArrayList<>();


	public void adicionarLivro(Livro livro) {
		biblioteca.add(livro);
		if (livro.getLido()) {
			getLivroLido().add(livro);
		}else {
			getnLido().add(livro);
		}
	}

	public void mostrarTodosLivros() {
		for (Livro livros : biblioteca ) {
			System.out.println( livros.getAutor());
		}
	}

	public void mostrarLivrosLidos() {

		for (Livro livro : livroLido) {
			JOptionPane.showMessageDialog(null, livro.getTitulo());
		}

	}

	public void livroAleatorio() {
		Random gerarNumeroAleatorio = new Random();
		int minimo = 0;
		int maximo = getnLido().size();
		
			int aleatorio = gerarNumeroAleatorio.nextInt(maximo - minimo);
			JOptionPane.showMessageDialog(null,"Livro no modo aleatorio é: "
					+ ""+ getnLido().get(aleatorio).getTitulo());

	}
	
	public void terminouLivro() {
		int index;
		String terminado = JOptionPane.showInputDialog("Qual livro você terminou ??");
		
		
		for(Livro livro : biblioteca) {
	
			if(livro.getTitulo().equals(terminado) && !livro.getLido()){
				livroLido.add(livro);
				nLido.remove(livro);
				break;
			}
			
			// descobrir algum jeito de mandar uma mensagem de sucesso ou falha 
		}
		
	}

	
	
	public List<Livro> getLivroLido() {
		return livroLido;
	}

	public void setLivroLido(List<Livro> livroLido) {
		this.livroLido = livroLido;
	}

	public List<Livro> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(List<Livro> biblioteca) {
		this.biblioteca = biblioteca;
	}


	public List<Livro> getnLido() {
		return nLido;
	}

	public void setnLido(List<Livro> nLido) {
		this.nLido = nLido;
	}

}




