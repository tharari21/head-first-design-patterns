package com.tomerharari;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    // InputStream is the component in this case  -- basically the class that gets decorated (like Beverage)
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        System.out.println("\nREADING");
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        System.out.println("\nREADINGBYTE");
        int result = in.read(b, off, len);
        for (int i = off; i< off+result; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Tomer\\IdeaProjects\\head-first-design-patterns\\chapter-3\\src\\main\\java\\com\\tomerharari\\test.txt")));
            while ((c = in.read()) > 0) {
                System.out.print((char)c);
            }
            in.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
