package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.N;
import androidx.annotation.P;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25485a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f25486b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25487c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f25488d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f25489e = 0;

    /* renamed from: com.bumptech.glide.gifdecoder.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0221a {
        @N
        Bitmap a(int i4, int i5, @N Bitmap.Config config);

        @N
        int[] b(int i4);

        void c(@N Bitmap bitmap);

        void d(@N byte[] bArr);

        @N
        byte[] e(int i4);

        void f(@N int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    int a();

    int b();

    @N
    ByteBuffer c();

    void clear();

    int d(@P InputStream inputStream, int i4);

    @P
    Bitmap e();

    void f();

    void g(@N c cVar, @N byte[] bArr);

    int getStatus();

    int h();

    int i();

    void j(@N Bitmap.Config config);

    int k(int i4);

    void l();

    void m(@N c cVar, @N ByteBuffer byteBuffer);

    int n();

    void o(@N c cVar, @N ByteBuffer byteBuffer, int i4);

    int p();

    int q();

    int r();

    int read(@P byte[] bArr);

    @Deprecated
    int s();
}
