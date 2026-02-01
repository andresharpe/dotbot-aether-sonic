package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@androidx.annotation.W(18)
/* loaded from: classes.dex */
class W implements X {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f19975a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public W(@androidx.annotation.N ViewGroup viewGroup) {
        this.f19975a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.e0
    public void a(@androidx.annotation.N Drawable drawable) {
        this.f19975a.add(drawable);
    }

    @Override // androidx.transition.e0
    public void b(@androidx.annotation.N Drawable drawable) {
        this.f19975a.remove(drawable);
    }

    @Override // androidx.transition.X
    public void c(@androidx.annotation.N View view) {
        this.f19975a.add(view);
    }

    @Override // androidx.transition.X
    public void d(@androidx.annotation.N View view) {
        this.f19975a.remove(view);
    }
}
