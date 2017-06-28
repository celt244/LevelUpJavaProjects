package ua.dp.levelup.explorer;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

/**
 * Created by java on 21.02.2017.
 */
public class CommandLineApp {

    private  static final String DEFAULT_PATH = "D:\\";
    private static File currentDir = new File(DEFAULT_PATH);

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(currentDir.getPath() + ">");
            String line = scanner.nextLine();

            if (line.startsWith("print")){
                if (currentDir.isDirectory()) {
                    printAllDirectories(currentDir);
                }
            } else if (line.startsWith("mkDir")) {   // mkDir newFolderName
                createNewFolder(line, currentDir);
            } else if (line.startsWith("cd")) {
                changeDirectory(line);
            }
        }


    }

    private static void changeDirectory(String line) {
        final String folderName = line.split("\\s+")[1];

        if (folderName.contains("..")) {
            if (currentDir.getParentFile() != null)currentDir = currentDir.getParentFile();
            return;
        }

        File[] list = currentDir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File dir) {
                return dir.isDirectory() && dir.getName().contains(folderName);
            }
        });


            if (list.length == 1){
                File matchedFolder = list[0];
            currentDir = matchedFolder;

            } else if (list.length == 0) {
                System.out.println("No such file or directory");
            } else if (line.startsWith("cd"))  {
                changeDirectory(line);
            }


        File newFolder = new File(currentDir, folderName);


    }

    private static void createNewFolder(String line, File parent) {
        String folderName = line.split("\\s+")[1];

        File directory = new File(parent, folderName);
          directory.mkdir();

    }

    private static void printAllDirectories(File file) {
        File[] files = file.listFiles();
        for (File f : files){
            if (f.isDirectory() && !f.isHidden()) {
                System.out.println(f.getName());
            }
        }
    }
}
