package com.google.android.gms.common.images;

import android.net.Uri;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1281w;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f28587a;

    public f(Uri uri) {
        this.f28587a = uri;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return C1281w.b(((f) obj).f28587a, this.f28587a);
    }

    public final int hashCode() {
        return C1281w.c(this.f28587a);
    }
}
