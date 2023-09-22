package Main;

import Methods.InverterCores;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage imagem = ImageIO.read(new File("C:\\Users\\NOTEBOOK\\PDI\\Aula3\\src\\Imagem\\sombrinhas.jpg"));
        InverterCores.inverterCores(imagem);
    }
}
