package fis_microproyecto1_e1b;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
//import java.util.Scanner;
import fis_microproyecto1_e1b_interfaz.fis_ojosUI;
public class FIS_Microproyecto1E1B {
    
    public static void main(String[] args) {
        
        fis_ojosUI gui = new fis_ojosUI();
        gui.setVisible(true);
        
        // Por consola
        /*
        Scanner scanner = new Scanner(System.in);
        FIS_Microproyecto1E1B Ceguera = new FIS_Microproyecto1E1B();
        while(true) {
            System.out.println("=== Sistema de nivel de ceguera ===");
            System.out.println("1. Evaluar su nivel de ceguera");
            System.out.println("2. Salir");
            System.out.print("Eleccion: ");
            int opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("\nIngrese el nivel de Agudeza Visual en dioptrias (0.2 ~ 10)");
                    double agudeza_visual = scanner.nextDouble();
                    System.out.println("Ingrese el nivel de refraccion (-10 ~ -0.25)");
                    double refraccion = scanner.nextDouble();
                    System.out.println("Ingrese la fatiga ocular que siente en un rango de (0 ~ 10)");
                    double fatiga_ocular = scanner.nextDouble();
                    System.out.println("Ingrese el dolor ocular que siente en un rango de (0 ~ 10)");
                    double dolor_ocular = scanner.nextDouble();
                    
                    if (agudeza_visual > 10 || refraccion > -0.25 || fatiga_ocular > 10 || dolor_ocular > 10 || agudeza_visual < 0.2 || refraccion < -10 || fatiga_ocular < 0 || dolor_ocular < 0) {
                        System.out.println("Ingrese valores válidos");
                        break;
                    }
                    
                    String resultado = Ceguera.evaluarCeguera(agudeza_visual, refraccion, fatiga_ocular, dolor_ocular);
                    System.out.println(resultado);
                    break;
                    
                case 2:
                    System.out.println("============ Adios ============");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        */
        
    }
    
    public String evaluarCeguera(double agudeza_visual, double refraccion, double fatiga_ocular, double dolor_ocular) {
        
        String fileName = "src/fis_microproyecto1_e1b/fis_ojos.fcl";
        FIS fis = FIS.load(fileName, true);
        
        if (fis == null) {
            System.err.println("Error: No se puede cargar el archivo '" + fileName + "'");
            return "Error al cargar el sistema difuso";
        }
        
        // Entradas
        fis.setVariable("fatiga_ocular", fatiga_ocular);
        fis.setVariable("refraccion", refraccion);
        fis.setVariable("agudeza_visual", agudeza_visual);
        fis.setVariable("dolor_ocular", dolor_ocular);
        fis.evaluate();
        
        // Salidas
        double Astigmatismo = fis.getVariable("astigmatismo").getValue();
        double Miopia = fis.getVariable("miopia").getValue();
        double Hipermetropia = fis.getVariable("hipermetropia").getValue();
        
        // Grados de pertenencia
        double pertenenciaNula = fis.getVariable("astigmatismo").getMembership("nulo");
        double pertenenciaLeve = fis.getVariable("astigmatismo").getMembership("leve");
        double pertenenciaModerada = fis.getVariable("astigmatismo").getMembership("moderada");
        double pertenenciaAlta = fis.getVariable("astigmatismo").getMembership("alta");
        double pertenenciaNulaM = fis.getVariable("miopia").getMembership("nula");
        double pertenenciaLeveM = fis.getVariable("miopia").getMembership("leve");
        double pertenenciaModeradaM = fis.getVariable("miopia").getMembership("moderada");
        double pertenenciaAltaM = fis.getVariable("miopia").getMembership("alta");
        double pertenenciaNulaH = fis.getVariable("hipermetropia").getMembership("nula");
        double pertenenciaLeveH = fis.getVariable("hipermetropia").getMembership("leve");
        double pertenenciaModeradaH = fis.getVariable("hipermetropia").getMembership("moderada");
        double pertenenciaAltaH = fis.getVariable("hipermetropia").getMembership("alta");
        
        // Obtener conjunto con mayor pertenencia
        String AstigmatismoMayor = obtenerConjuntoMayor(pertenenciaNula, pertenenciaLeve, pertenenciaModerada, pertenenciaAlta, "nulo", "leve", "moderada", "alta");
        double gradoAstigmatismo = obtenerGradoMayor(pertenenciaNula, pertenenciaLeve, pertenenciaModerada, pertenenciaAlta);
        String MiopiaMayor = obtenerConjuntoMayor(pertenenciaNulaM, pertenenciaLeveM, pertenenciaModeradaM, pertenenciaAltaM, "nula", "leve", "moderada", "alta");
        double gradoMiopia = obtenerGradoMayor(pertenenciaNulaM, pertenenciaLeveM, pertenenciaModeradaM, pertenenciaAltaM);
        String HipermetropiaMayor = obtenerConjuntoMayor(pertenenciaNulaH, pertenenciaLeveH, pertenenciaModeradaH, pertenenciaAltaH, "nula", "leve", "moderada", "alta");
        double gradoHipermetropia = obtenerGradoMayor(pertenenciaNulaH, pertenenciaLeveH, pertenenciaModeradaH, pertenenciaAltaH);
        
        // Gráficos
        JFuzzyChart.get().chart(fis.getFunctionBlock("Ceguera"));
        
        return String.format("""
            Nivel de Astigmatismo: %.2fD
            Categoría: %s (Grado de pertenencia: %.2f)
            
            Nivel de Miopia (Negativo en teoria): %.1fD
            Categoria: %s (Grado de pertenencia: %.2f)
            
            Nivel de Hipermetropia: %.1fD
            Nivel: %s (Grado de pertenencia: %.2f)
            """, 
            Astigmatismo, AstigmatismoMayor, gradoAstigmatismo, 
            Miopia, MiopiaMayor, gradoMiopia, Hipermetropia, 
            HipermetropiaMayor, gradoHipermetropia);
    }
    
    private String obtenerConjuntoMayor(double valor1, double valor2, double valor3, double valor4, String cat1, String cat2, String cat3, String cat4) {
        if (valor1 >= valor2 && valor1 >= valor3 && valor1 >= valor4) return cat1;
        if (valor2 >= valor1 && valor2 >= valor3 && valor2 >= valor4) return cat2;
        if (valor3 >= valor1 && valor3 >= valor2 && valor3 >= valor4) return cat3;
        return cat4;
    }
    
    private double obtenerGradoMayor(double valor1, double valor2, double valor3, double valor4) {
        return Math.max(Math.max(Math.max(valor1, valor2), valor3), valor4);
    }
}
