package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
class D {
    D() {
    }

    private static void a(@androidx.annotation.P InputStream inputStream, @androidx.annotation.N File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        C1799g.f(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C1799g.f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(File file, List<C> list) {
        for (C c4 : list) {
            InputStream inputStream = null;
            try {
                inputStream = c4.b();
                if (inputStream != null) {
                    a(inputStream, new File(file, c4.a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C1799g.f(null);
                throw th;
            }
            C1799g.f(inputStream);
        }
    }
}
