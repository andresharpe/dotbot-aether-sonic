package com.google.android.gms.common.stats;

import androidx.annotation.N;
import com.google.android.gms.common.internal.ReflectedParcelable;

@I0.a
@Deprecated
/* loaded from: classes.dex */
public abstract class StatsEvent extends K0.a implements ReflectedParcelable {

    @I0.a
    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        @I0.a
        public static final int f28941a = 7;

        /* renamed from: b, reason: collision with root package name */
        @I0.a
        public static final int f28942b = 8;
    }

    public abstract int c0();

    public abstract long e0();

    public abstract long i0();

    @N
    public final String toString() {
        return i0() + "\t" + c0() + "\t" + e0() + u0();
    }

    @N
    public abstract String u0();
}
