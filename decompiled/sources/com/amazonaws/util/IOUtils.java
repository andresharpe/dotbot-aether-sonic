package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public enum IOUtils {
    ;

    private static final int BUFFER_SIZE = 4096;
    private static final com.amazonaws.logging.c logger = LogFactory.c(IOUtils.class);

    public static void b(Closeable closeable, com.amazonaws.logging.c cVar) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e4) {
                if (logger.f()) {
                    logger.b("Ignore failure in closing the Closeable", e4);
                }
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j4 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > -1) {
                outputStream.write(bArr, 0, read);
                j4 += read;
            } else {
                return j4;
            }
        }
    }

    public static void f(Closeable closeable, com.amazonaws.logging.c cVar) {
        b(closeable, cVar);
    }

    public static byte[] g(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public static String i(InputStream inputStream) throws IOException {
        return new String(g(inputStream), w.f24366b);
    }
}
