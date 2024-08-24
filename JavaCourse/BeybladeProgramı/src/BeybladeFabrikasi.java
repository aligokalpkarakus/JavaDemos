public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beybladeTuru){
        
        if(beybladeTuru.equals("Dragon")){
            return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konusma");
        }
        else if(beybladeTuru.equals("Dranza")){
            return new Dranza("Kai", 600, 400, "Kirmizi Anka Kusu");
        }
        else if(beybladeTuru.equals("Drayga")){
            return new Dranza("Rei", 800, 250, "Beyaz Kaplan");
        }
        else if(beybladeTuru.equals("Draciel")){
            return new Dranza("Max", 400, 1000, "Kara Kaplumbaga");
        }
        else{
            return null;
        }
        
    }
}
