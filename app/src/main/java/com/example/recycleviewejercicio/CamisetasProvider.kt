package com.example.recycleviewejercicio

import com.example.recycleviewejercicio.Camiseta

//En esta clase metemos los datos que vamos a tener
class CamisetasProvider {
    companion object {
        val camisetasList = listOf<Camiseta>(
            Camiseta(
                model = "Trapstar Classic Negra/Blanco",
                color = "Negra",
                description = "100% algodón\n" +
                        "O-cuello\n" +
                        "Sin decoloración\n" +
                        "Impresión de alta calidad\n" +
                        "Ligero y cómodo\n" +
                        "Tipo de patrón Imprimir",
                photo = "https://trapstarshooters.es/wp-content/uploads/2023/11/Camiseta-Trapstar-Classic-NegraBlanco-2.webp"
            ),
            Camiseta(
                model = "T-For Trapstar Corazones",
                color = "Negra",
                description = "100% algodón\n" +
                        "O-cuello\n" +
                        "Sin decoloración\n" +
                        "Impresión de alta calidad\n" +
                        "Ligero y cómodo\n" +
                        "Tipo de patrón Imprimir",
                photo = "https://trapstarshooters.es/wp-content/uploads/2023/11/Camiseta-T-For-Trapstar-Corazones-2.webp"
            ),
            Camiseta(
                model = "Galaxy Trapstar Amarillo",
                color = "Amarilla",
                description = "100% algodón\n" +
                        "O-cuello\n" +
                        "Sin decoloración\n" +
                        "Impresión de alta calidad\n" +
                        "Ligero y cómodo\n" +
                        "Tipo de patrón Imprimir",
                photo = "https://trapstarshooters.es/wp-content/uploads/2023/11/Camiseta-Galaxy-Trapstar-Amarillo-2.webp"
            ),
            Camiseta(
                model = "T-For Trapstar Paint Blanco",
                color = "Blanca",
                description = "100% algodón\n" +
                        "O-cuello\n" +
                        "Sin decoloración\n" +
                        "Impresión de alta calidad\n" +
                        "Ligero y cómodo\n" +
                        "Tipo de patrón Imprimir",
                photo = "https://trapstarshooters.es/wp-content/uploads/2023/11/Camiseta-T-For-Trapstar-Paint-Blanco-2.webp"
            ),
            Camiseta(
                model = "Trapstar Clout Blanco",
                color = "Blanca",
                description = "100% algodón\n" +
                        "O-cuello\n" +
                        "Sin decoloración\n" +
                        "Impresión de alta calidad\n" +
                        "Ligero y cómodo\n" +
                        "Tipo de patrón Imprimir",
                photo = "https://trapstarshooters.es/wp-content/uploads/2023/11/Camiseta-Trapstar-Clout-Blanco-2.webp"
            ),
            Camiseta(
                model = "Trapstar Es Un Fuego Secreto Blanco",
                color = "Blanca",
                description = "100% algodón\n" +
                        "O-cuello\n" +
                        "Sin decoloración\n" +
                        "Impresión de alta calidad\n" +
                        "Ligero y cómodo\n" +
                        "Tipo de patrón Imprimir",
                photo = "https://trapstarshooters.es/wp-content/uploads/2023/11/Camiseta-Trapstar-Es-Un-Fuego-Secreto-Blanco-2.webp"
            )
        )
    }
}