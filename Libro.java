//Sergio Ivan Tostado Nieto A01229274
//Programacion Orientada a Objetos
//17/ 01/ 2018

public class Libro{
	private String autor;
	private String titulo;
	private String editorial;
	private String isbn; 
	public Libro(){
		autor = "Patric Süskind";
		titulo = "El perfume";
		editorial = "booket";
		isbn = "84-322-1606-2";
	}
	public Libro(String aut, String tit, String ed, String isb){
		autor = aut;
		titulo = tit;
		editorial = ed;
		isbn = isb;
	}
	public void setAutor(String aut){
		autor = aut;
	}
	public void setTitulo(String tit){
		titulo = tit;
	}
	public void setEditorial(String ed){
		editorial = ed;
	}
	public void setIsbn(String isb){
		isbn = isb;
	}
	public String getAutor(){
		return autor;
	}
	public String getTitulo(){
		return titulo;
	}
	public String getEditorial(){
		return editorial;
	}
	public String getIsbn(){
		return isbn;
	}
	public static void main(String[] args){
		Libro harryPotter = new Libro("J.K. Rowling", "Harry Potter", "Alfaguara", "123-2345-32-3");
		Libro elPerfume = new Libro();
		Libro noSilverBullet = new Libro();

		noSilverBullet.setAutor("Frederick Brooks");
		noSilverBullet.setTitulo("No Silver Bullet");
		noSilverBullet.setEditorial("University of North Carolina");
		noSilverBullet.setIsbn("12-4213-234-32");
		
		System.out.println("Autores: ");
		System.out.println(harryPotter.getAutor() + ", " + elPerfume.getAutor() + ", " + noSilverBullet.getAutor());
		System.out.println("Titulos: ");
		System.out.println(harryPotter.getTitulo() + ", " + elPerfume.getTitulo() + ", " + noSilverBullet.getTitulo());
		System.out.println("Editoriales: ");
		System.out.println(harryPotter.getEditorial() + ", " + elPerfume.getEditorial() + ", " + noSilverBullet.getEditorial());
		System.out.println("ISBN's: ");
		System.out.println(harryPotter.getIsbn() + ", " + elPerfume.getIsbn() + ", " + noSilverBullet.getIsbn());
	}
}