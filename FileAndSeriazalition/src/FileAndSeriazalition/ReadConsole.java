package FileAndSeriazalition;

import java.io.IOException;
import java.io.InputStream;

class ReadConsole {

    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true) {
            System.out.print("Nhập 1 ký tự: ");
            int ch = is.read();
            if (ch == 'q') {
                System.out.print("finish!");
                break;
            }
            is.skip(2);
            System.out.println("Ký tự nhận được: " + (char) ch);
        }
    }
}
