package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private static final int f24353a = 14;

    /* renamed from: b, reason: collision with root package name */
    private static final int f24354b = 16384;

    public static byte[] a(File file) throws IOException {
        return b(new FileInputStream(file));
    }

    public static byte[] b(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                byte[] digest = messageDigest.digest();
                try {
                    bufferedInputStream.close();
                } catch (Exception e4) {
                    LogFactory.c(q.class).a("Unable to close input stream of hash candidate: " + e4);
                }
                return digest;
            } catch (NoSuchAlgorithmException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Exception e6) {
                LogFactory.c(q.class).a("Unable to close input stream of hash candidate: " + e6);
            }
            throw th;
        }
    }

    public static byte[] c(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static String d(File file) throws IOException {
        return Base64.g(a(file));
    }

    public static String e(InputStream inputStream) throws IOException {
        return Base64.g(b(inputStream));
    }

    public static String f(byte[] bArr) {
        return Base64.g(c(bArr));
    }
}
