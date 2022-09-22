package Classes;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface WriterData extends BookData{
    String findWriter(String bookName) throws IOException;
}
