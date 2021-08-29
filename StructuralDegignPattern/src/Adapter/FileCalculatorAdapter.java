package Adapter;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator{
    @Override
   public long  calculateSize(File path) {
        FileCalculator fileCalculator = new FileCalculatorAdapter();
        File file = new File(String.valueOf(path));
        return fileCalculator.calculateSize(file);
    }
}
