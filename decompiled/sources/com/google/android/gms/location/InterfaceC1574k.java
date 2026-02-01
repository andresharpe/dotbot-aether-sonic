package com.google.android.gms.location;

import androidx.annotation.InterfaceC0580x;
import com.google.android.gms.common.internal.C1285y;

@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.location.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1574k {

    /* renamed from: p, reason: collision with root package name */
    public static final int f30012p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f30013q = 2;

    /* renamed from: r, reason: collision with root package name */
    public static final int f30014r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final long f30015s = -1;

    @com.google.android.gms.common.util.D
    /* renamed from: com.google.android.gms.location.k$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private double f30020e;

        /* renamed from: f, reason: collision with root package name */
        private double f30021f;

        /* renamed from: g, reason: collision with root package name */
        private float f30022g;

        /* renamed from: a, reason: collision with root package name */
        private String f30016a = null;

        /* renamed from: b, reason: collision with root package name */
        @c
        private int f30017b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f30018c = Long.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        private short f30019d = -1;

        /* renamed from: h, reason: collision with root package name */
        private int f30023h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f30024i = -1;

        @androidx.annotation.N
        public InterfaceC1574k a() {
            String str = this.f30016a;
            if (str != null) {
                int i4 = this.f30017b;
                if (i4 != 0) {
                    if ((i4 & 4) != 0 && this.f30024i < 0) {
                        throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
                    }
                    long j4 = this.f30018c;
                    if (j4 != Long.MIN_VALUE) {
                        if (this.f30019d != -1) {
                            int i5 = this.f30023h;
                            if (i5 >= 0) {
                                return new com.google.android.gms.internal.location.G(str, i4, (short) 1, this.f30020e, this.f30021f, this.f30022g, j4, i5, this.f30024i);
                            }
                            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                        }
                        throw new IllegalArgumentException("Geofence region not set.");
                    }
                    throw new IllegalArgumentException("Expiration not set.");
                }
                throw new IllegalArgumentException("Transitions types not set.");
            }
            throw new IllegalArgumentException("Request ID not set.");
        }

        @androidx.annotation.N
        public a b(@InterfaceC0580x(from = -90.0d, to = 90.0d) double d4, @InterfaceC0580x(from = -180.0d, to = 180.0d) double d5, @InterfaceC0580x(from = 0.0d, fromInclusive = false) float f4) {
            boolean z3;
            boolean z4;
            boolean z5 = false;
            if (d4 >= -90.0d && d4 <= 90.0d) {
                z3 = true;
            } else {
                z3 = false;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d4);
            C1285y.b(z3, sb.toString());
            if (d5 >= -180.0d && d5 <= 180.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d5);
            C1285y.b(z4, sb2.toString());
            if (f4 > 0.0f) {
                z5 = true;
            }
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f4);
            C1285y.b(z5, sb3.toString());
            this.f30019d = (short) 1;
            this.f30020e = d4;
            this.f30021f = d5;
            this.f30022g = f4;
            return this;
        }

        @androidx.annotation.N
        public a c(long j4) {
            if (j4 < 0) {
                this.f30018c = -1L;
            } else {
                this.f30018c = com.google.android.gms.common.util.k.e().c() + j4;
            }
            return this;
        }

        @androidx.annotation.N
        public a d(int i4) {
            this.f30024i = i4;
            return this;
        }

        @androidx.annotation.N
        public a e(@androidx.annotation.F(from = 0) int i4) {
            this.f30023h = i4;
            return this;
        }

        @androidx.annotation.N
        public a f(@androidx.annotation.N String str) {
            this.f30016a = (String) C1285y.m(str, "Request ID can't be set to null");
            return this;
        }

        @androidx.annotation.N
        public a g(@c int i4) {
            this.f30017b = i4;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.location.k$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* renamed from: com.google.android.gms.location.k$c */
    /* loaded from: classes2.dex */
    public @interface c {
    }

    @androidx.annotation.N
    String c();
}
