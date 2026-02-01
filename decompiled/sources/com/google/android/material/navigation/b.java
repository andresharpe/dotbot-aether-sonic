package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: Q, reason: collision with root package name */
    @N
    private final Class<?> f32774Q;

    /* renamed from: R, reason: collision with root package name */
    private final int f32775R;

    public b(@N Context context, @N Class<?> cls, int i4) {
        super(context);
        this.f32774Q = cls;
        this.f32775R = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.g
    @N
    public MenuItem a(int i4, int i5, int i6, @N CharSequence charSequence) {
        if (size() + 1 <= this.f32775R) {
            m0();
            MenuItem a4 = super.a(i4, i5, i6, charSequence);
            if (a4 instanceof j) {
                ((j) a4).w(true);
            }
            l0();
            return a4;
        }
        String simpleName = this.f32774Q.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.f32775R + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @N
    public SubMenu addSubMenu(int i4, int i5, int i6, @N CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f32774Q.getSimpleName() + " does not support submenus");
    }

    public int n0() {
        return this.f32775R;
    }
}
