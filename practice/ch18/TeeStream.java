
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.File;
import org.apache.commons.io.output.TeeOutputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.*;
import static org.junit.Assert.assertEquals;


// input string to input stream
// create teeOutputStream for fileOutputStream (temp file) and byteArrayOutputStream
// ioutils copy input stream to teeOutputStream
// read temp file and get string from other output string
// verify that they are all correct

public class TeeStream {
        
    public static void main(String args[]) throws Exception{ 
        final String exampleText = "This is a string to be streamed.";
        final InputStream inputStream = IOUtils.toInputStream(exampleText);

        final File tempFile = File.createTempFile("example", "txt");
        tempFile.deleteOnExit();

        final OutputStream stream1 = new FileOutputStream(tempFile);
        final OutputStream stream2 = new ByteArrayOutputStream();

        final OutputStream tee = new TeeOutputStream(stream1, stream2);

        IOUtils.copy(inputStream, tee);

        final FileInputStream fis = new FileInputStream(tempFile);
        final String stream1Contents = IOUtils.toString(fis);
        final String stream2Contents = stream2.toString();

        assertEquals(exampleText, stream1Contents);
        assertEquals(exampleText, stream2Contents);

        System.out.println("All three strings should be: \n" + exampleText + "\n\n");

        System.out.println(exampleText);
        System.out.println(stream1Contents);
        System.out.println(stream2Contents);
    }

}







