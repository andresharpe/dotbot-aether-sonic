package androidx.core.app;

import android.content.res.Configuration;

/* renamed from: androidx.core.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12128a;

    /* renamed from: b, reason: collision with root package name */
    private final Configuration f12129b;

    public C0658w(boolean z3) {
        this.f12128a = z3;
        this.f12129b = null;
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    public Configuration a() {
        Configuration configuration = this.f12129b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.f12128a;
    }

    @androidx.annotation.W(26)
    public C0658w(boolean z3, @androidx.annotation.N Configuration configuration) {
        this.f12128a = z3;
        this.f12129b = configuration;
    }
}
