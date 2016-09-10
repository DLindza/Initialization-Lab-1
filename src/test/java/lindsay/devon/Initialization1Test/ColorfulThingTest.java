package lindsay.devon.Initialization1Test;
import static org.junit.Assert.*;

import javafx.scene.effect.Light;
import lindsay.devon.Intialization1.ColorfulThing;
import org.junit.Test;

/**
 * Created by devonlindsay on 9/10/16.
 */

public class ColorfulThingTest {

    @Test
    public void getColorTest(){
        ColorfulThing coly = new ColorfulThing(ColorfulThing.Color.LIGHT);
        assertSame("Value should be LIGHT", ColorfulThing.Color.LIGHT, coly.getColor());
    }




}
