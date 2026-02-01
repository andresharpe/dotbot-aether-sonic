package com.android.volley.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.Request;

/* loaded from: classes.dex */
public class i extends Request<Object> {

    /* renamed from: W, reason: collision with root package name */
    private final com.android.volley.e f24591W;

    /* renamed from: X, reason: collision with root package name */
    private final Runnable f24592X;

    public i(com.android.volley.e eVar, Runnable runnable) {
        super(0, null, null);
        this.f24591W = eVar;
        this.f24592X = runnable;
    }

    @Override // com.android.volley.Request
    public Request.Priority A() {
        return Request.Priority.IMMEDIATE;
    }

    @Override // com.android.volley.Request
    public boolean I() {
        this.f24591W.clear();
        if (this.f24592X != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f24592X);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public com.android.volley.p<Object> N(com.android.volley.l lVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public void j(Object obj) {
    }
}
