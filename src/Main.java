import com.arellano.designpatterns.openclose.Caballos;
import com.arellano.designpatterns.openclose.Dog;
import com.arellano.presentation.Presentation;
import com.arellano.presentation.PresentationOpenClose;

public class Main {
    public static void main(String[] args) {
        Dog doberman = new Dog("Doberman", 2, 4, 230f);
        Caballos horse = new Caballos(4, 230f);

        PresentationOpenClose presentationOpenClose = new PresentationOpenClose();
        presentationOpenClose.comidaPorDepartamentoDeLaGranja(doberman);
        presentationOpenClose.comidaPorDepartamentoDeLaGranja(doberman);
    }
}
