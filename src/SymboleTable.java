import java.util.ArrayList;
import java.util.List;

public class SymboleTable {

    List<Symbole> symboles = new ArrayList<Symbole>();

    public List<Symbole> getSymboles() {
        return symboles;
    }

    public void setSymboles(List<Symbole> symboles) {
        this.symboles = symboles;
    }

    public void print() {
        for(int i=0 ; i < symboles.size() ; i++) {
            if(symboles.get(i)!= null)
                System.out.println(symboles.get(i).getType() +
                        "\t\t\t\t" +
                        symboles.get(i).getValue()
                );
        }
    }
}

