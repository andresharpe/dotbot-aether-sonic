package com.android.volley.toolbox;

import androidx.annotation.P;
import com.android.volley.Request;
import com.android.volley.p;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class u<T> extends Request<T> {

    /* renamed from: Z, reason: collision with root package name */
    protected static final String f24662Z = "utf-8";

    /* renamed from: a0, reason: collision with root package name */
    private static final String f24663a0 = String.format("application/json; charset=%s", f24662Z);

    /* renamed from: W, reason: collision with root package name */
    private final Object f24664W;

    /* renamed from: X, reason: collision with root package name */
    @P
    @androidx.annotation.B("mLock")
    private p.b<T> f24665X;

    /* renamed from: Y, reason: collision with root package name */
    @P
    private final String f24666Y;

    @Deprecated
    public u(String str, String str2, p.b<T> bVar, p.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public abstract com.android.volley.p<T> N(com.android.volley.l lVar);

    @Override // com.android.volley.Request
    public void f() {
        super.f();
        synchronized (this.f24664W) {
            this.f24665X = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public void j(T t3) {
        p.b<T> bVar;
        synchronized (this.f24664W) {
            bVar = this.f24665X;
        }
        if (bVar != null) {
            bVar.b(t3);
        }
    }

    @Override // com.android.volley.Request
    public byte[] n() {
        try {
            String str = this.f24666Y;
            if (str == null) {
                return null;
            }
            return str.getBytes(f24662Z);
        } catch (UnsupportedEncodingException unused) {
            com.android.volley.s.g("Unsupported Encoding while trying to get the bytes of %s using %s", this.f24666Y, f24662Z);
            return null;
        }
    }

    @Override // com.android.volley.Request
    public String o() {
        return f24663a0;
    }

    @Override // com.android.volley.Request
    @Deprecated
    public byte[] w() {
        return n();
    }

    @Override // com.android.volley.Request
    @Deprecated
    public String x() {
        return o();
    }

    public u(int i4, String str, @P String str2, p.b<T> bVar, @P p.a aVar) {
        super(i4, str, aVar);
        this.f24664W = new Object();
        this.f24665X = bVar;
        this.f24666Y = str2;
    }
}
