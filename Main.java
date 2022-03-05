import java.io.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File games = new File("E://Games");
        File temp = new File("E://Games//temp");
        File src = new File("E://Games//src");
        File res = new File("E://Games//res");
        File savegames = new File("E://Games//savegames");
        File main = new File("E://Games//src//main");
        File test = new File("E://Games//src//test");
        File mainJava = new File("E://Games//src//main//Main.java");
        File utilsJava = new File("E://Games//src//main//Utils.java");
        File drawables = new File("E://Games//res//drawables");
        File vectors = new File("E://Games//res//vectors");
        File icons = new File("E://Games//res//icons");
        File tempTxt = new File("E://Games//temp//temp.txt");
        try {
            if (games.mkdir()) sb.append("Каталог \"E:/Games\" создан\n");
            if (temp.mkdir()) sb.append("Каталог \"E:/Games/temp\" создан\n");
            if (src.mkdir()) sb.append("Каталог \"E:/Games/src\" создан\n");
            if (res.mkdir()) sb.append("Каталог \"E:/Games/res\" создан\n");
            if (savegames.mkdir()) sb.append("Каталог \"D:/Games/savegames\" создан\n");
            if (main.mkdir()) sb.append("Каталог \"E:/Games/src/main\" создан\n");
            if (test.mkdir()) sb.append("Каталог \"E:/Games/src/test\" создан\n");
            if (mainJava.createNewFile()) sb.append("Файл \"E:/Games/src/main/Main.java\" создан\n");
            if (utilsJava.createNewFile()) sb.append("Файл \"E:/Games/src/main/Utils.java\" создан\n");
            if (drawables.mkdir()) sb.append("Каталог \"E:/Games/res/drawables\" создан\n");
            if (vectors.mkdir()) sb.append("Каталог \"E:/Games/res/vectors\" создан\n");
            if (icons.mkdir()) sb.append("Каталог \"E:/Games/res/icons\" создан\n");
            if (tempTxt.createNewFile()) sb.append("Файл \"E:/Games/temp/temp.txt\" создан\n");
            FileWriter log = new FileWriter("E://Games//temp//temp.txt", false);
            log.write(sb.toString());
            log.flush();
        } catch (IOException ex) {
            sb.append(ex.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("E://Games//temp//temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

