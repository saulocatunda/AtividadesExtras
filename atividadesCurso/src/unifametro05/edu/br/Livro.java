package unifametro05.edu.br;

public class Livro {
	//Atributos
	String editoraLivro;
	int paginasLivro;
	String tituloLivro;
	//Qt livros criados.
	public static int livrosCriados;
	//Construtor com parametros
	public Livro(String editoraLivro, int paginasLivro, String tituloLivro) {
		this.editoraLivro = editoraLivro;
		this.paginasLivro = paginasLivro;
		this.tituloLivro = tituloLivro;
		livrosCriados++;
	}
	//Construtor sem parametros
	public Livro () {
		livrosCriados++;
	}
	public String getEditoraLivro() {
		return editoraLivro;
	}
	public void setEditoraLivro(String editoraLivro) {
		this.editoraLivro = editoraLivro;
	}
	public int getPaginasLivro() {
		return paginasLivro;
	}
	public void setPaginasLivro(int paginasLivro) {
		this.paginasLivro = paginasLivro;
	}
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public static int getLivrosCriados() {
		return livrosCriados;
	}
	public static void setLivrosCriados(int livrosCriados) {
		Livro.livrosCriados = livrosCriados;
	}
	
	
	
}
