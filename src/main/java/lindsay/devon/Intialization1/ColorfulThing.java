package lindsay.devon.Intialization1;

/**
 * Created by devonlindsay on 9/10/16.
 */
public class ColorfulThing {

    private Color color;

    public ColorfulThing (Color color) {
        this.color = color;
        System.out.println(color);
    }

    public Color getColor() {

        return color;

    }

    public enum Color {LIGHT,DARK,PURE}




}
