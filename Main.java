public class Main {

    public static void main(String[] args) {

        // Paso 1: La biblioteca registra los libros disponibles
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "978-0544003415");
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8491050230");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Paso 2: Un estudiante solicita un libro
        Estudiante estudiante1 = new Estudiante("Ana Torres");

        // Paso 3: El sistema busca el libro y crea un registro de préstamo
        Libro libroEncontrado = biblioteca.buscarLibro("978-0307474728");

        if (libroEncontrado != null && libroEncontrado.getEstado()) {
            // Paso 4: El préstamo guarda el estudiante, el libro y la fecha
            Prestamo prestamo1 = new Prestamo(1, estudiante1, libroEncontrado);
            libroEncontrado.setEstado(false); // el libro queda no disponible

            biblioteca.realizarPrestamo(prestamo1);
            System.out.println("Préstamo realizado exitosamente.");
        } else {
            System.out.println("El libro no está disponible.");
        }

        System.out.println();

        // Paso 5: La biblioteca muestra los libros y los préstamos
        biblioteca.mostrarLibros();
        System.out.println();
        biblioteca.mostrarPrestamos();
    }
}
