        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fis_microproyecto1.e1b;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author Isaac
 */
public class FIS_Microproyecto1E1B {
    private String path_FIS = "src/fis_microproyecto1/e1b/fis_ojos.fcl";
    private FIS fis_var;
    
    public FIS_Microproyecto1E1B(){
        this.fis_var = FIS.load(this.path_FIS, true);
        
        if(this.fis_var == null){
         System.out.println("Error al cargar el FIS");
        }
    
    }
    public double evaluarAstigmatismo(double agudeza_visual, double refraccion, double fatiga_ocular, double dolor_ocular){
        this.fis_var.setVariable("agudeza_Visual", agudeza_visual);
        this.fis_var.setVariable("refraccion", refraccion);
        this.fis_var.setVariable("fatiga_ocular", fatiga_ocular);
        this.fis_var.setVariable("dolor_ocular", dolor_ocular);
        this.fis_var.evaluate();
        
        return this.fis_var.getVariable("astigmatismo").getLatestDefuzzifiedValue();
    }
    public double evaluarMiopia(double agudeza_visual, double refraccion, double fatiga_ocular, double dolor_ocular){
        this.fis_var.setVariable("agudeza_Visual", agudeza_visual);
        this.fis_var.setVariable("refraccion", refraccion);
        this.fis_var.setVariable("fatiga_ocular", fatiga_ocular);
        this.fis_var.setVariable("dolor_ocular", dolor_ocular);
        this.fis_var.evaluate();
        
        return this.fis_var.getVariable("miopia").getLatestDefuzzifiedValue();
    }
    
    public double evaluarHipermetropia(double agudeza_visual, double refraccion, double fatiga_ocular, double dolor_ocular){
        this.fis_var.setVariable("agudeza_Visual", agudeza_visual);
        this.fis_var.setVariable("refraccion", refraccion);
        this.fis_var.setVariable("fatiga_ocular", fatiga_ocular);
        this.fis_var.setVariable("dolor_ocular", dolor_ocular);
        this.fis_var.evaluate();
        
        return this.fis_var.getVariable("hipermetropia").getLatestDefuzzifiedValue();
    }
    
    public String get_astigmatismo(){
        String[] CD_salida = {"nulo", "leve", "moderada", "alta"};
        String result = "";
        for(int i = 0; i < CD_salida.length; i++){
            if(this.fis_var.getVariable("astigmatismo").getMembership(CD_salida[i]) > 0){
                result += CD_salida[i] + ",";
            }
        }
        return result;
    }
    public String get_miopia(){
        String[] CD_salida1 = {"nula", "leve", "moderada", "alta"};
        String result1 = "";
        for(int i = 0; i < CD_salida1.length; i++){
            if(this.fis_var.getVariable("miopia").getMembership(CD_salida1[i]) > 0){
                result1 += CD_salida1[i] + ",";
            }
        }
        return result1;
    }
    public String get_hipermetropia(){
        String[] CD_salida2 = {"nula", "leve", "moderada", "alta"};
        String result2 = "";
        for(int i = 0; i < CD_salida2.length; i++){
            if(this.fis_var.getVariable("hipermetropia").getMembership(CD_salida2[i]) > 0){
                result2 += CD_salida2[i] + ",";
            }
        }
        return result2;
    }
}