import com.arellano.designpatterns.liskovandsegregation.IFelino;
import com.arellano.designpatterns.liskovandsegregation.IFelinoSalvaje;
import com.arellano.designpatterns.liskovandsegregation.Jaguar;
import com.arellano.designpatterns.openclose.Caballos;
import com.arellano.designpatterns.openclose.Dog;
import com.arellano.presentation.Presentation;
import com.arellano.presentation.PresentationOpenClose;

public class Main {
    public static void main(String[] args) {
        Jaguar jaguar = new Jaguar(23, "Sabana");
        IFelino jaguar2 = new Jaguar(23, "Sabana");
        IFelinoSalvaje jaguar3 = new Jaguar(23, "Sabana");
    }
}
