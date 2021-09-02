package repository;

import model.Bill;
import model.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public static void saveFile(List<Phone> phoneList) {
        try {
            File file = new File("src\\data\\phones.csv");
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Phone phone : phoneList) {
                bw.write(phone.getName() +
                        ",     " + phone.getId() +
                        ",     " + phone.getColor() +
                        ",     " + phone.getQuantity() +
                        ",     " + phone.getYearManufacture() +
                        ",     " + phone.getMade() +
                        ",     " + phone.getPrice() + "\n");
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Phone> readFile() {
        List<Phone> products = new ArrayList<>();

        try {
            File file = new File("src\\data\\phones.csv");
            if (!file.exists()) {
                return products;
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] phone = line.split("\\,     ");
                Phone phone1 = new Phone();
                phone1.setName(phone[0]);
                phone1.setId(Integer.parseInt(phone[1]));
                phone1.setColor(phone[2]);
                phone1.setQuantity(Integer.parseInt(phone[3]));
                phone1.setYearManufacture(phone[4]);
                phone1.setMade(phone[5]);
                phone1.setPrice(Double.parseDouble(phone[6]));
                products.add(phone1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

}
