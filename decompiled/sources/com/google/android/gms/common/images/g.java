package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1244d;
import com.google.android.gms.common.internal.C1281w;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<ImageView> f28588c;

    public g(ImageView imageView, int i4) {
        super(Uri.EMPTY, i4);
        C1244d.c(imageView);
        this.f28588c = new WeakReference<>(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.images.i
    public final void a(@P Drawable drawable, boolean z3, boolean z4, boolean z5) {
        ImageView imageView = this.f28588c.get();
        if (imageView != null) {
            if (!z4 && !z5 && (imageView instanceof com.google.android.gms.internal.base.j)) {
                throw null;
            }
            boolean z6 = false;
            if (!z4 && !z3) {
                z6 = true;
            }
            if (z6) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 != null) {
                    if (drawable2 instanceof com.google.android.gms.internal.base.i) {
                        drawable2 = ((com.google.android.gms.internal.base.i) drawable2).a();
                    }
                } else {
                    drawable2 = null;
                }
                drawable = new com.google.android.gms.internal.base.i(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (!(imageView instanceof com.google.android.gms.internal.base.j)) {
                if (drawable != null && z6) {
                    ((com.google.android.gms.internal.base.i) drawable).b(250);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        ImageView imageView = this.f28588c.get();
        ImageView imageView2 = ((g) obj).f28588c.get();
        if (imageView2 != null && imageView != null && C1281w.b(imageView2, imageView)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public g(ImageView imageView, Uri uri) {
        super(uri, 0);
        C1244d.c(imageView);
        this.f28588c = new WeakReference<>(imageView);
    }
}
