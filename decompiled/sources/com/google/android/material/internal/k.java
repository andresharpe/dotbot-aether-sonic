package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class k extends androidx.appcompat.view.menu.g {
    public k(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    @N
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) a(i4, i5, i6, charSequence);
        m mVar = new m(x(), this, jVar);
        jVar.A(mVar);
        return mVar;
    }
}
