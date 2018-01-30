package dagiel.spaceinvaders;

import javax.swing.*;

public class Shot extends Sprite {

    private final String shotImg = "src/images/missile.png";
    private final int H_SPACE = 6;
    private final int V_SPACE = 1;

    public Shot() {}

    public Shot(int x, int y) {
        initShot(x, y);
    }

    private void initShot(int x, int y) {
        ImageIcon ii = new ImageIcon(shotImg);
        setImage(ii.getImage());
        setX(x + H_SPACE);
        setY(y - V_SPACE);
    }

}
