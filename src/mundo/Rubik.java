package mundo;

/**
 *
 * @author Juan Diego Galindo
 * @author Geronimo Nicolas Moreno
 * @author Sofia Torres Paez
 */
public class Rubik {
    private Cubo cuborubik [][][];

    public Rubik() {
        
        cuborubik = new Cubo [2][2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    cuborubik[i][j][k] = new Cubo();
                }
            }
        }
    }

    public Cubo[][][] getCuborubik() {
        return cuborubik;
    }

    public void setCuborubik(Cubo[][][] cuborubik) {
        this.cuborubik = cuborubik;
    }
    
    public void giroX(int disco){
        Cubo cubo1; 
        cubo1 = cuborubik [disco][0][0];
        cuborubik [disco][0][0] = cuborubik [disco][0][1];
        cuborubik [disco][0][1] = cuborubik [disco][1][1];
        cuborubik [disco][1][1] = cuborubik [disco][1][0];
        cuborubik [disco][1][0] = cubo1;
        
        cuborubik [disco][0][0].giroEjeX();
        cuborubik [disco][0][1].giroEjeX();
        cuborubik [disco][1][0].giroEjeX();
        cuborubik [disco][1][1].giroEjeX();
    }
    
    public void giroY(int disco){
        Cubo cubo1;
        cubo1 = cuborubik [0][disco][0];
        cuborubik [0][disco][0] = cuborubik [0][disco][1];
        cuborubik [0][disco][1] = cuborubik [1][disco][1];
        cuborubik [1][disco][1] = cuborubik [1][disco][0];
        cuborubik [1][disco][0] = cubo1;
      
        cuborubik [0][disco][0].giroEjeY();
        cuborubik [1][disco][0].giroEjeY();
        cuborubik [1][disco][1].giroEjeY();
        cuborubik [0][disco][1].giroEjeY();
    }
    
    public void giroZ(int disco){
        Cubo cubo1;
        cubo1 = cuborubik [0][0][disco];
        cuborubik [0][0][disco] = cuborubik [1][0][disco];
        cuborubik [1][0][disco] = cuborubik [1][1][disco];
        cuborubik [1][1][disco] = cuborubik [0][1][disco];
        cuborubik [0][1][disco] = cubo1;
        
        cuborubik [0][0][disco].giroEjeZ();
        cuborubik [1][0][disco].giroEjeZ();
        cuborubik [1][1][disco].giroEjeZ();
        cuborubik [0][1][disco].giroEjeZ();
    }
}