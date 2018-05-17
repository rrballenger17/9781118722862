import org.junit.Test;

import java.io.*;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class DecoratorPatternTest {






    @Test
    public void decoratorPattern() throws IOException {

        // new file with path and file
        final File f = new File("target", "out.bin");

        // file output stream
        final FileOutputStream fos = new FileOutputStream(f);

        // bufferOutputStream and objectOutputStream take fileOutputStream
        final BufferedOutputStream bos = new BufferedOutputStream(fos);
        final ObjectOutputStream oos = new ObjectOutputStream(fos);

        // write to the objectOutputStream
        oos.writeBoolean(true);
        oos.writeInt(42);
        oos.writeObject(new ArrayList<Integer>());

        // flush oos and close all
        oos.flush();
        oos.close();
        bos.close();
        fos.close();

        assertTrue(f.exists());
    }





}