package com.google.android.gms.analytics;

import androidx.annotation.N;

@com.google.android.gms.common.util.D
@Deprecated
/* loaded from: classes.dex */
public interface g {

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f27789a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f27790b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f27791c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f27792d = 3;
    }

    @Deprecated
    void error(@N Exception exc);

    @Deprecated
    void error(@N String str);

    @Deprecated
    int getLogLevel();

    @Deprecated
    void info(@N String str);

    @Deprecated
    void setLogLevel(int i4);

    @Deprecated
    void verbose(@N String str);

    @Deprecated
    void warn(@N String str);
}
