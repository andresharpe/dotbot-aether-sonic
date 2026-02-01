package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0891i {
    @androidx.annotation.N
    @Deprecated
    public Fragment b(@androidx.annotation.N Context context, @androidx.annotation.N String str, @androidx.annotation.P Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @androidx.annotation.P
    public abstract View c(@androidx.annotation.D int i4);

    public abstract boolean e();
}
