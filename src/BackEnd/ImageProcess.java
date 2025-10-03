package BackEnd;
//Load va xu li anh

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageProcess {
    public ImageProcess(){}
    public static ImageIcon LoadImageIcon(String path, int width, int height){
        return new ImageIcon(path);
    }

}
