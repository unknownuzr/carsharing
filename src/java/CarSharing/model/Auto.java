/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarSharing.model;

/**
 *
 * @author Düring, Matti
 */
public class Auto {
    private String fabrikat;
    private String modell;
    
    public Auto(String fabrikat, String modell){
        this.fabrikat = fabrikat;
        this.modell = modell;
    }

    public String getFabrikat() {
        return fabrikat;
    }

    public void setFabrikat(String fabrikat) {
        this.fabrikat = fabrikat;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
    
    @Override
    public String toString(){
        return this.getFabrikat() + " " + this.getModell();
    }
}
