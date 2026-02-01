package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements androidx.appcompat.view.menu.o {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.o
    public void e(androidx.appcompat.view.menu.g gVar) {
    }

    @Override // androidx.appcompat.view.menu.o
    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
