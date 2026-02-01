package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class f0 extends W {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f6198b;

    public f0(@androidx.annotation.N Context context, @androidx.annotation.N Resources resources) {
        super(resources);
        this.f6198b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.W, android.content.res.Resources
    public Drawable getDrawable(int i4) throws Resources.NotFoundException {
        Drawable a4 = a(i4);
        Context context = this.f6198b.get();
        if (a4 != null && context != null) {
            V.h().x(context, i4, a4);
        }
        return a4;
    }
}
