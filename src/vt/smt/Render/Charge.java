package vt.smt.Render;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * Created by semitro on 03.11.17.
 */
public class Charge  extends Pane {
    private vt.smt.Physics.Charge e;
    private ImageView rendered;

    public Charge(){
        rendered = new ImageView(new Image(getClass().getResourceAsStream("/res/minusE.png")));
        this.getChildren().add(rendered);
        setCharge(new vt.smt.Physics.Charge(1,new Point2D(0,0)));

    }
    public Charge(vt.smt.Physics.Charge charge){
        this();
        setCharge(charge);
    }

    public vt.smt.Physics.Charge getCharge() {
        return e;
    }

    public void setPosition(Point2D position){
        e.setPosition(position);
        setCharge(e);
    }
    public void setCharge(vt.smt.Physics.Charge e) {
        this.e = e;
        rendered.setTranslateX( e.getPosition().getX());
        rendered.setTranslateY( e.getPosition().getY());
    }
}