package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;

/* renamed from: androidx.core.content.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666a {
    private C0666a() {
    }

    @androidx.annotation.N
    public static Context a(@androidx.annotation.N ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
