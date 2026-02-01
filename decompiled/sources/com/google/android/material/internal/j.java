package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface j<T extends j<T>> extends Checkable {

    /* loaded from: classes2.dex */
    public interface a<C> {
        void a(C c4, boolean z3);
    }

    @androidx.annotation.D
    int getId();

    void setInternalOnCheckedChangeListener(@P a<T> aVar);
}
