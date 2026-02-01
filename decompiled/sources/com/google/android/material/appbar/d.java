package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.N;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    private e f31367a;

    /* renamed from: b, reason: collision with root package name */
    private int f31368b;

    /* renamed from: c, reason: collision with root package name */
    private int f31369c;

    public d() {
        this.f31368b = 0;
        this.f31369c = 0;
    }

    public int G() {
        e eVar = this.f31367a;
        if (eVar != null) {
            return eVar.d();
        }
        return 0;
    }

    public int H() {
        e eVar = this.f31367a;
        if (eVar != null) {
            return eVar.e();
        }
        return 0;
    }

    public boolean I() {
        e eVar = this.f31367a;
        if (eVar != null && eVar.f()) {
            return true;
        }
        return false;
    }

    public boolean J() {
        e eVar = this.f31367a;
        if (eVar != null && eVar.g()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4) {
        coordinatorLayout.P(v3, i4);
    }

    public void L(boolean z3) {
        e eVar = this.f31367a;
        if (eVar != null) {
            eVar.i(z3);
        }
    }

    public boolean M(int i4) {
        e eVar = this.f31367a;
        if (eVar != null) {
            return eVar.j(i4);
        }
        this.f31369c = i4;
        return false;
    }

    public boolean N(int i4) {
        e eVar = this.f31367a;
        if (eVar != null) {
            return eVar.k(i4);
        }
        this.f31368b = i4;
        return false;
    }

    public void O(boolean z3) {
        e eVar = this.f31367a;
        if (eVar != null) {
            eVar.l(z3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@N CoordinatorLayout coordinatorLayout, @N V v3, int i4) {
        K(coordinatorLayout, v3, i4);
        if (this.f31367a == null) {
            this.f31367a = new e(v3);
        }
        this.f31367a.h();
        this.f31367a.a();
        int i5 = this.f31368b;
        if (i5 != 0) {
            this.f31367a.k(i5);
            this.f31368b = 0;
        }
        int i6 = this.f31369c;
        if (i6 != 0) {
            this.f31367a.j(i6);
            this.f31369c = 0;
            return true;
        }
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31368b = 0;
        this.f31369c = 0;
    }
}
