import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "E://Games";
        StringBuilder sb = new StringBuilder();
        List<File> folderList = Arrays.asList(
                new File (path),
                new File (path, "temp"),
                new File (path, "src"),
                new File (path, "res"),
                new File (path, "savegames"),
                new File (path, "src//main"),
                new File (path, "src//test"),
                new File (path, "res//drawables"),
                new File (path, "res//vectors"),
                new File (path, "res//icons")
        );
        List<File> fileList = Arrays.asList(
                new File(path,"src//main//Main.java"),
                new File(path,"src//main//Utils.java"),
                new File(path,"src//temp//temp.txt")
        );
        folderList.stream().forEach(folder -> {
            if (folder.mkdir()) sb.append("каталог " + folder + " создан\n");
            else sb.append("каталог " + folder + " не создан\n");
        });
        fileList.stream().forEach(file -> {
            try {
                if (file.createNewFile()) sb.append("файл " + file + " создан\n");
                else sb.append("файл " + file + " не создан\n");
            } catch (IOException ex) {
                sb.append(ex.getMessage() + '\n');
            }
        });
        try (FileWriter log = new FileWriter("E://Games//temp//temp.txt", false)){
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

