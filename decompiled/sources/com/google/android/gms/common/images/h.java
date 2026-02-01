package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.P;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.C1244d;
import com.google.android.gms.common.internal.C1281w;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<ImageManager.a> f28589c;

    public h(ImageManager.a aVar, Uri uri) {
        super(uri, 0);
        C1244d.c(aVar);
        this.f28589c = new WeakReference<>(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.images.i
    public final void a(@P Drawable drawable, boolean z3, boolean z4, boolean z5) {
        ImageManager.a aVar;
        if (!z4 && (aVar = this.f28589c.get()) != null) {
            aVar.a(this.f28590a.f28587a, drawable, z5);
        }
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        ImageManager.a aVar = this.f28589c.get();
        ImageManager.a aVar2 = hVar.f28589c.get();
        if (aVar2 != null && aVar != null && C1281w.b(aVar2, aVar) && C1281w.b(hVar.f28590a, this.f28590a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C1281w.c(this.f28590a);
    }
}
