package com.android.volley;

import android.content.Intent;

/* loaded from: classes.dex */
public class AuthFailureError extends VolleyError {

    /* renamed from: G, reason: collision with root package name */
    private Intent f24374G;

    public AuthFailureError() {
    }

    public Intent c() {
        return this.f24374G;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f24374G != null) {
            return "User needs to (re)enter credentials.";
        }
        return super.getMessage();
    }

    public AuthFailureError(Intent intent) {
        this.f24374G = intent;
    }

    public AuthFailureError(l lVar) {
        super(lVar);
    }

    public AuthFailureError(String str) {
        super(str);
    }

    public AuthFailureError(String str, Exception exc) {
        super(str, exc);
    }
}
