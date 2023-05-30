package model;

import java.util.HashMap;
import java.util.Map;

public class Ia {
    private Map<String, String> planetData;

    public Ia() {
        // Inicializa los datos de los planetas
        planetData = new HashMap<>();
        planetData.put("Mercurio", "Mercurio es el planeta más cercano al Sol.");
        planetData.put("Venus", "Venus es el segundo planeta del sistema solar y es conocido como el planeta hermano de la Tierra.");
        planetData.put("Tierra", "La Tierra es nuestro planeta, el tercero del sistema solar y el único conocido que alberga vida.");
        planetData.put("Marte", "Marte es el cuarto planeta del sistema solar y es conocido como el planeta rojo debido a su color característico.");
        // Agrega más datos de los planetas según sea necesario
    }

    public String getPlanetInfo(String planet) {
        return planetData.getOrDefault(planet, "Lo siento, no tengo información sobre ese planeta.");
    }

}
