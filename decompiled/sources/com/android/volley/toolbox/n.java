package com.android.volley.toolbox;

import androidx.annotation.P;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f24619a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.android.volley.i> f24620b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24621c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final InputStream f24622d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final byte[] f24623e;

    public n(int i4, List<com.android.volley.i> list) {
        this(i4, list, -1, null);
    }

    @P
    public final InputStream a() {
        InputStream inputStream = this.f24622d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f24623e != null) {
            return new ByteArrayInputStream(this.f24623e);
        }
        return null;
    }

    @P
    public final byte[] b() {
        return this.f24623e;
    }

    public final int c() {
        return this.f24621c;
    }

    public final List<com.android.volley.i> d() {
        return Collections.unmodifiableList(this.f24620b);
    }

    public final int e() {
        return this.f24619a;
    }

    public n(int i4, List<com.android.volley.i> list, int i5, InputStream inputStream) {
        this.f24619a = i4;
        this.f24620b = list;
        this.f24621c = i5;
        this.f24622d = inputStream;
        this.f24623e = null;
    }

    public n(int i4, List<com.android.volley.i> list, byte[] bArr) {
        this.f24619a = i4;
        this.f24620b = list;
        this.f24621c = bArr.length;
        this.f24623e = bArr;
        this.f24622d = null;
    }
}
