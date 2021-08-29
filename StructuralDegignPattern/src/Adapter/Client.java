package Adapter;

import java.io.File;

public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path){
        long size = fileCalculator.calculateSize(new File(path));
        System.out.println("Size: " + size);
    }
}
