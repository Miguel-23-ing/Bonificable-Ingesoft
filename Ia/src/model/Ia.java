package model;

public class Ia {
    private String[] planetNames;
    private String[] planetData;

    public Ia() {
        // Inicializa los nombres de los planetas
        planetNames = new String[] {
                "Mercurio",
                "Venus",
                "Tierra",
                "Marte",
                "Jupiter",
                "Saturno",
                "Urano",
                "Neptuno",
                "Ceres",
                "Eris",
                "Makeake",
                "Haumea"
        };

        // Inicializa los datos de los planetas
        planetData = new String[] {
                "Mercurio es el planeta más cercano al Sol.",
                "Venus es el segundo planeta del sistema solar y es conocido como el planeta hermano de la Tierra.",
                "La Tierra es nuestro planeta, el tercero del sistema solar y el único conocido que alberga vida.",
                "Marte es el cuarto planeta del sistema solar y es conocido como el planeta rojo debido a su color característico."
                // Agrega más datos de los planetas según sea necesario
        };
    }

    public void printPlanetInfo(String planet) throws InterruptedException {
        String planetInfo = getPlanetInfo(planet);

        if (!planetInfo.equals("Lo siento, no tengo información sobre ese planeta.")) {
            for (int i = 0; i < planetInfo.length(); i++) {
                System.out.print(planetInfo.charAt(i));
                Thread.sleep(50); // Añade un pequeño retraso de 50 milisegundos entre cada letra impresa
            }
        } else {
            System.out.println(planetInfo);
        }
    }

    private String getPlanetInfo(String planet) {
        for (int i = 0; i < planetNames.length; i++) {
            if (planetNames[i].equalsIgnoreCase(planet)) {
                return planetData[i];
            }
        }
        return "Lo siento, no tengo información sobre ese planeta.";
    }

}