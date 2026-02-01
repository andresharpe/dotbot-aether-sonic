package com.amazonaws.util;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
class r extends com.amazonaws.internal.i {

    /* renamed from: G, reason: collision with root package name */
    private static final int f24355G = 200;

    /* renamed from: E, reason: collision with root package name */
    private final byte[] f24356E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f24357F;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f24358a;

        public a(String str) {
            this.f24358a = str;
        }

        public String a() {
            return this.f24358a;
        }

        public boolean b(String str) {
            if (!this.f24358a.startsWith(str)) {
                return false;
            }
            this.f24358a = this.f24358a.substring(str.length());
            return true;
        }

        public boolean c(String str) {
            int indexOf = this.f24358a.indexOf(str);
            if (indexOf < 0) {
                return false;
            }
            this.f24358a = this.f24358a.substring(indexOf + str.length());
            return true;
        }

        public boolean d(String str) {
            if (!this.f24358a.startsWith(str)) {
                return false;
            }
            while (this.f24358a.startsWith(str)) {
                this.f24358a = this.f24358a.substring(str.length());
            }
            return true;
        }
    }

    public r(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
        this.f24356E = new byte[200];
        this.f24357F = false;
    }

    private int d(String str) {
        a aVar = new a(str);
        if (!aVar.b("xmlns")) {
            return -1;
        }
        aVar.d(" ");
        if (!aVar.b("=")) {
            return -1;
        }
        aVar.d(" ");
        if (!aVar.b("\"") || !aVar.c("\"")) {
            return -1;
        }
        return str.length() - aVar.a().length();
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        c();
        int read = ((FilterInputStream) this).in.read();
        if (read != 120 || this.f24357F) {
            return read;
        }
        this.f24356E[0] = (byte) read;
        ((FilterInputStream) this).in.mark(this.f24356E.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f24356E;
        int read2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        int d4 = d(new String(this.f24356E, 0, read2 + 1, w.f24366b));
        if (d4 <= 0) {
            return read;
        }
        for (int i4 = 0; i4 < d4 - 1; i4++) {
            ((FilterInputStream) this).in.read();
        }
        int read3 = ((FilterInputStream) this).in.read();
        this.f24357F = true;
        return read3;
    }

    @Override // com.amazonaws.internal.i, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        for (int i6 = 0; i6 < i5; i6++) {
            int read = read();
            if (read == -1) {
                if (i6 == 0) {
                    return -1;
                }
                return i6;
            }
            bArr[i6 + i4] = (byte) read;
        }
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
