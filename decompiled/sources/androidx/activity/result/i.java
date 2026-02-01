package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.app.C0623e;
import b.AbstractC1000a;

/* loaded from: classes.dex */
public abstract class i<I> {
    @N
    public abstract AbstractC1000a<I, ?> a();

    public void b(@SuppressLint({"UnknownNullness"}) I i4) {
        c(i4, null);
    }

    public abstract void c(@SuppressLint({"UnknownNullness"}) I i4, @P C0623e c0623e);

    @K
    public abstract void d();
}
