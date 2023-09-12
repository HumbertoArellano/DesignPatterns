import com.arellano.designpatterns.liskovandsegregation.IFelino;
import com.arellano.designpatterns.liskovandsegregation.IFelinoSalvaje;
import com.arellano.designpatterns.liskovandsegregation.Jaguar;
import com.arellano.designpatterns.openclose.Caballos;
import com.arellano.designpatterns.openclose.Dog;
import com.arellano.presentation.Presentation;
import com.arellano.presentation.PresentationOpenClose;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IFelino> listaDeFelinos = new ArrayList<>();

        Jaguar jaguar = new Jaguar(23, "Sabana");
        IFelino jaguar2 = new Jaguar(23, "Sabana");
        IFelinoSalvaje jaguar3 = new Jaguar(23, "Sabana");

        listaDeFelinos.add(jaguar);
        listaDeFelinos.add(jaguar2);
        listaDeFelinos.add(jaguar3);

        for(IFelino jaguarAll: listaDeFelinos){
            System.out.println(jaguarAll);
        }

    }
}
