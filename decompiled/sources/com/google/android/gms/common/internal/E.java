package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.v;
import com.google.android.gms.common.r;

@I0.a
/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f28615a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28616b;

    public E(@androidx.annotation.N Context context) {
        C1285y.l(context);
        Resources resources = context.getResources();
        this.f28615a = resources;
        this.f28616b = resources.getResourcePackageName(r.b.f28867a);
    }

    @androidx.annotation.P
    @I0.a
    public String a(@androidx.annotation.N String str) {
        int identifier = this.f28615a.getIdentifier(str, v.b.f7403e, this.f28616b);
        if (identifier == 0) {
            return null;
        }
        return this.f28615a.getString(identifier);
    }
}
