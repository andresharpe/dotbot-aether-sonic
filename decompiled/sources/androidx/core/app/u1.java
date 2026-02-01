package androidx.core.app;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12097a;

    /* renamed from: b, reason: collision with root package name */
    private final Configuration f12098b;

    public u1(boolean z3) {
        this.f12097a = z3;
        this.f12098b = null;
    }

    @androidx.annotation.N
    @androidx.annotation.W(26)
    public Configuration a() {
        Configuration configuration = this.f12098b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }

    public boolean b() {
        return this.f12097a;
    }

    @androidx.annotation.W(26)
    public u1(boolean z3, @androidx.annotation.N Configuration configuration) {
        this.f12097a = z3;
        this.f12098b = configuration;
    }
}
