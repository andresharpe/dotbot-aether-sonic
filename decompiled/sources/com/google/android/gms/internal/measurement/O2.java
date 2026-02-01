package com.google.android.gms.internal.measurement;

import android.net.Uri;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public final class O2 {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.collection.l f29411a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O2(androidx.collection.l lVar) {
        this.f29411a = lVar;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri == null) {
            return null;
        }
        androidx.collection.l lVar = (androidx.collection.l) this.f29411a.get(uri.toString());
        if (lVar == null) {
            return null;
        }
        return (String) lVar.get("".concat(String.valueOf(str3)));
    }
}
