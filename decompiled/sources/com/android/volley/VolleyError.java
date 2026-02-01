package com.android.volley;

/* loaded from: classes.dex */
public class VolleyError extends Exception {

    /* renamed from: E, reason: collision with root package name */
    public final l f24405E;

    /* renamed from: F, reason: collision with root package name */
    private long f24406F;

    public VolleyError() {
        this.f24405E = null;
    }

    public long a() {
        return this.f24406F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j4) {
        this.f24406F = j4;
    }

    public VolleyError(l lVar) {
        this.f24405E = lVar;
    }

    public VolleyError(String str) {
        super(str);
        this.f24405E = null;
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
        this.f24405E = null;
    }

    public VolleyError(Throwable th) {
        super(th);
        this.f24405E = null;
    }
}
