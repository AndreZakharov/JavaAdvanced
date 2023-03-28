package module4;

import java.io.*;
import java.util.stream.Stream;

public class ReaderForFile {
    public static String fileReaderMethod(String path) throws IOException {
        File file = new File(path);
        String text = new String();
        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader br = new BufferedReader(fileReader);

            Stream<String> lines = br.lines();
            for (String str: lines.toList()
                 ) {
               text+=str;
            }
            return text;
        }

    }
}
