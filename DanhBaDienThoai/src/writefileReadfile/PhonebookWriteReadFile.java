package writefileReadfile;

import model.PhoneBook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhonebookWriteReadFile {
    public static void saveFile(List<PhoneBook> phoneBookList) {
        try {
            File file = new File("src\\data\\phonebooks.csv");
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (PhoneBook phoneBook : phoneBookList) {
                bufferedWriter.write(phoneBook.getName() +
                        ", " + phoneBook.getId() +
                        ", " + phoneBook.getBirthday() +
                        ", " + phoneBook.getAddress() +
                        ", " + phoneBook.getNumberPhone() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<PhoneBook> readFile() {
        List<PhoneBook> phoneBooks = new ArrayList<>();
        try {
            File file = new File("src\\data\\phonebooks.csv");
            if (!file.exists()) {
                return phoneBooks;
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null && !line.isEmpty()) {
                String[] phoneBook = line.split("\\, ");
                PhoneBook phoneBook1 = new PhoneBook();
                phoneBook1.setName(phoneBook[0]);
                phoneBook1.setId(Integer.parseInt(phoneBook[1]));
                phoneBook1.setBirthday(phoneBook[2]);
                phoneBook1.setAddress(phoneBook[3]);
                phoneBook1.setNumberPhone(Integer.parseInt(phoneBook[4]));
                phoneBooks.add(phoneBook1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phoneBooks;
    }
}
