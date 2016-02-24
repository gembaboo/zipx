package org.gembaboo.zipx;

import org.gembaboo.zipx.Zipx;
import org.junit.Test;

import java.io.File;


public class ZipxTest {


    public static final String CURRENT_DIR = System.getProperty("user.dir");
    public static final String OUTPUT_FOLDER = CURRENT_DIR + File.separator + "target";

    private Zipx zipx = new Zipx();

    @Test
    public void testSimpleZip() {
        zipx.unZipWithZipInputStream(CURRENT_DIR + File.separator + "testfile.zip", OUTPUT_FOLDER + File.separator + "zip");
    }

    @Test
    public void testBzip2() {
        zipx.unZipWithZipInputStream(CURRENT_DIR + File.separator + "testfile-bzip2.zipx", OUTPUT_FOLDER + File.separator + "bzip2");
    }

    @Test(expected = Exception.class)
    public void testLzma() {
        zipx.unZipWithZipInputStream(CURRENT_DIR + File.separator + "testfile-lzma.zipx", OUTPUT_FOLDER + File.separator + "lzma");
    }

}
