package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

@androidx.annotation.W(18)
/* loaded from: classes.dex */
class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f20002a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(@androidx.annotation.N View view) {
        this.f20002a = view.getOverlay();
    }

    @Override // androidx.transition.e0
    public void a(@androidx.annotation.N Drawable drawable) {
        this.f20002a.add(drawable);
    }

    @Override // androidx.transition.e0
    public void b(@androidx.annotation.N Drawable drawable) {
        this.f20002a.remove(drawable);
    }
}
