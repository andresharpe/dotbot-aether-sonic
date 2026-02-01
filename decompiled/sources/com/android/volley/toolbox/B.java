package com.android.volley.toolbox;

import androidx.annotation.P;
import com.android.volley.Request;
import com.android.volley.p;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class B extends Request<String> {

    /* renamed from: W, reason: collision with root package name */
    private final Object f24543W;

    /* renamed from: X, reason: collision with root package name */
    @P
    @androidx.annotation.B("mLock")
    private p.b<String> f24544X;

    public B(int i4, String str, p.b<String> bVar, @P p.a aVar) {
        super(i4, str, aVar);
        this.f24543W = new Object();
        this.f24544X = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public com.android.volley.p<String> N(com.android.volley.l lVar) {
        String str;
        try {
            str = new String(lVar.f24494b, m.f(lVar.f24495c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(lVar.f24494b);
        }
        return com.android.volley.p.c(str, m.e(lVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void j(String str) {
        p.b<String> bVar;
        synchronized (this.f24543W) {
            bVar = this.f24544X;
        }
        if (bVar != null) {
            bVar.b(str);
        }
    }

    @Override // com.android.volley.Request
    public void f() {
        super.f();
        synchronized (this.f24543W) {
            this.f24544X = null;
        }
    }

    public B(String str, p.b<String> bVar, @P p.a aVar) {
        this(0, str, bVar, aVar);
    }
}
