public class Anakart {
    private String model;
    private String uretici;
    private int yuvaSayisi;
    private String isletimSistemi;
    
    public Anakart(String model, String uretici, int yuvaSayisi, String isletimSistemi){
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi = yuvaSayisi;
        this.isletimSistemi = isletimSistemi;
    }
    
    public void isletimSistemiYukle(String isletimSistemi){
        this.isletimSistemi = isletimSistemi;
        
        System.out.println("Isletim sistemi yuklendi: " + isletimSistemi);
        
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the uretici
     */
    public String getUretici() {
        return uretici;
    }

    /**
     * @param uretici the uretici to set
     */
    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    /**
     * @return the yuvaSayisi
     */
    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    /**
     * @param yuvaSayisi the yuvaSayisi to set
     */
    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    /**
     * @return the isletimSistemi
     */
    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    /**
     * @param isletimSistemi the isletimSistemi to set
     */
    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }
    
}
