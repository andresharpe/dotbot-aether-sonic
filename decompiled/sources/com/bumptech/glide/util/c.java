package com.bumptech.glide.util;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: G, reason: collision with root package name */
    private static final String f26935G = "ContentLengthStream";

    /* renamed from: H, reason: collision with root package name */
    private static final int f26936H = -1;

    /* renamed from: E, reason: collision with root package name */
    private final long f26937E;

    /* renamed from: F, reason: collision with root package name */
    private int f26938F;

    private c(@N InputStream inputStream, long j4) {
        super(inputStream);
        this.f26937E = j4;
    }

    private int a(int i4) throws IOException {
        if (i4 >= 0) {
            this.f26938F += i4;
        } else if (this.f26937E - this.f26938F > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f26937E + ", but read: " + this.f26938F);
        }
        return i4;
    }

    @N
    public static InputStream b(@N InputStream inputStream, long j4) {
        return new c(inputStream, j4);
    }

    @N
    public static InputStream c(@N InputStream inputStream, @P String str) {
        return b(inputStream, d(str));
    }

    private static int d(@P String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e4) {
                if (Log.isLoggable(f26935G, 3)) {
                    Log.d(f26935G, "failed to parse content length header: " + str, e4);
                }
            }
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f26937E - this.f26938F, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i4, int i5) throws IOException {
        return a(super.read(bArr, i4, i5));
    }
}
