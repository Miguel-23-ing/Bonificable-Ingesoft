package model;


public class Ia {

    private String[] keyWord;
    private String[] answers;

    public Ia() {

        // Inicializa los nombres de los planetas
        keyWord = new String[] {
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
            "Haumea",
            "Hi",
            "Hey",
            "Hello"

        };

        // Inicializa los datos de los planetas
        answers = new String[] {
            "Mercurio es el planeta más cercano al Sol.",
            "Venus es el segundo planeta del sistema solar y es conocido como el planeta hermano de la Tierra.",
            "La Tierra es nuestro planeta, el tercero del sistema solar y el único conocido que alberga vida.",
            "Marte es el cuarto planeta del sistema solar y es conocido como el planeta rojo debido a su color característico.",
            "Hi",
            "Heyy",
            "Hellouuu"

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
        for (int i = 0; i < keyWord.length; i++) {
            if (keyWord[i].equalsIgnoreCase(planet)) {
                return answers[i];
            }
        }
        return "Lo siento, no tengo información sobre ese planeta.";
    }

}
