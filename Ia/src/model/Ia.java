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
            "Mercury is the closest planet to the Sun.",
            "Venus is the second planet in the solar system and is known as Earth's sister planet.",
            "Earth is our planet, the third planet in the solar system and the only one known to harbor life.",
            "Mars is the fourth planet in the solar system and is known as the red planet because of its characteristic color.",
            "Jupiter: gas giant, largest planet in the solar system",
            "Saturn: Spectacular rings, gaseous, known for its beauty.",
            "Uranus: Tilted planet, greenish blue, frozen.",
            "Neptune: Intense blue, last gas giant in the solar system",
            "Ceres: Dwarf planet, largest object in asteroid belt",
            "Eris: Dwarf planet, more massive than Pluto, far away.",
            "Makemake: Dwarf planet, icy surface, in the Kuiper belt.",
            "Haumea: Dwarf planet, elongated shape, rotates rapidly",
            "Hi, how can I help you?",
            "Heyy, how can I help you?",
            "Hellouuu, how can I help you?"

            // Agrega más datos de los planetas según sea necesario
        };
    }

    public void printPlanetInfo(String planet) throws InterruptedException {
        String planetInfo = getPlanetInfo(planet);

        if (!planetInfo.equals("Sorry, I have no information about that planet.")) {
            for (int i = 0; i < planetInfo.length(); i++) {
                System.out.print(planetInfo.charAt(i));
                Thread.sleep(50); // Añade un pequeño retraso de 50 milisegundos entre cada letra impresa
            }
        } else {
            String err = "Sorry, I have no information about that planet.";
            for(int i = 0; i < err.length(); i++){
                System.out.print(err.charAt(i));
                Thread.sleep(50);
            }
            
        }
    }

    private String getPlanetInfo(String planet) {
        for (int i = 0; i < keyWord.length; i++) {
            if (keyWord[i].equalsIgnoreCase(planet)) {
                return answers[i];
            }
        }
        return "Sorry, I have no information about that planet.";
    }

    public void input(String text) {
        String[] textArray = text.split(" ");
        
        for(int i = 0; i < textArray.length; i++){
            for(int j = 0; j < keyWord.length; j++){
                if(textArray[i].equalsIgnoreCase(keyWord[j])){
                    try{
                       
                        printPlanetInfo(keyWord[j]);
                    
                    }catch(Exception e){
                        System.out.println(e);
                    }
                
                }
            }
            
            if(i == textArray.length - 1){
                try{
                       
                    printPlanetInfo("Sorry, I have no information about that planet.");
                
                }catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
