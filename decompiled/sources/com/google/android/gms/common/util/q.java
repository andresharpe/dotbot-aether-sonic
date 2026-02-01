package com.google.android.gms.common.util;

import android.os.ParcelFileDescriptor;
import androidx.annotation.N;
import com.google.android.gms.common.internal.C1285y;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

@com.google.android.gms.common.internal.D
@I0.a
@Deprecated
/* loaded from: classes.dex */
public final class q {
    private q() {
    }

    @I0.a
    public static void a(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @I0.a
    public static void b(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @I0.a
    @Deprecated
    public static long c(@N InputStream inputStream, @N OutputStream outputStream) throws IOException {
        return d(inputStream, outputStream, false, 1024);
    }

    @I0.a
    @Deprecated
    public static long d(@N InputStream inputStream, @N OutputStream outputStream, boolean z3, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        long j4 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i4);
                if (read == -1) {
                    break;
                }
                j4 += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                if (z3) {
                    b(inputStream);
                    b(outputStream);
                }
                throw th;
            }
        }
        if (z3) {
            b(inputStream);
            b(outputStream);
        }
        return j4;
    }

    @I0.a
    public static boolean e(@N byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @I0.a
    @N
    @Deprecated
    public static byte[] f(@N InputStream inputStream) throws IOException {
        return g(inputStream, true);
    }

    @I0.a
    @N
    @Deprecated
    public static byte[] g(@N InputStream inputStream, boolean z3) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(inputStream, byteArrayOutputStream, z3, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    @I0.a
    @N
    @Deprecated
    public static byte[] h(@N InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1285y.l(inputStream);
        C1285y.l(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
