public class Libro {

    // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private boolean estado;

    // Constructor - el estado se inicializa en true (disponible)
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor  = autor;
        this.isbn   = isbn;
        this.estado = true;
    }

    // Getters necesarios para otras clases
    public String getIsbn()    { return isbn; }
    public boolean getEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }

    // Método toString
    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor +
               " | ISBN: " + isbn + " | Disponible: " + estado;
    }
}
