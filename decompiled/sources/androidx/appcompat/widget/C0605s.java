package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.InterfaceC0563f;
import d.C2042a;

/* renamed from: androidx.appcompat.widget.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0605s extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f6316b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f6317a;

    public C0605s(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, @InterfaceC0563f int i4) {
        super(context, attributeSet, i4);
        a(context, attributeSet, i4, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i4, int i5) {
        g0 G3 = g0.G(context, attributeSet, C2042a.m.S4, i4, i5);
        if (G3.C(C2042a.m.V4)) {
            b(G3.a(C2042a.m.V4, false));
        }
        setBackgroundDrawable(G3.h(C2042a.m.T4));
        G3.I();
    }

    private void b(boolean z3) {
        if (f6316b) {
            this.f6317a = z3;
        } else {
            androidx.core.widget.p.c(this, z3);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        if (f6316b && this.f6317a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f6316b && this.f6317a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    public C0605s(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, @InterfaceC0563f int i4, @androidx.annotation.d0 int i5) {
        super(context, attributeSet, i4, i5);
        a(context, attributeSet, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f6316b && this.f6317a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
