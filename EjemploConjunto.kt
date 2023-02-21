fun main() {
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)// Muestra el tamaño del conjunto con la propiedad size.
    solarSystem.add("Pluto")// Agrega "Pluto" al conjunto solarSystem con el método add().
    println(solarSystem.size)// Muestra el size del conjunto después de agregar el elemento.
    solarSystem.remove("Pluto")// Usa la función remove() para quitar "Pluto".
    println(solarSystem.size)
    println(solarSystem.contains("Pluto")) // Muestra el tamaño de la colección y vuelve a llamar a contains() para comprobar si "Pluto" todavía está en el conjunto.
    // Ejecuta tu código. "Pluto" ya no está en el conjunto. El tamaño ahora es 8.
}