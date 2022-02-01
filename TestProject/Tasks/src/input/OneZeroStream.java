package input;

import java.io.IOException;
import java.io.InputStream;

public class OneZeroStream extends InputStream {
    private byte[] bytes = {'1', ' ', '0', ' '};
    int i = 0;

    @Override
    public int read() throws IOException {
        if (i >= bytes.length)
            i = 0;
        return bytes[i++];
    }
}

