package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.F;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.K;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: h, reason: collision with root package name */
    public static final long f12573h = Long.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public static final int f12574i = 100;

    /* renamed from: j, reason: collision with root package name */
    public static final int f12575j = 102;

    /* renamed from: k, reason: collision with root package name */
    public static final int f12576k = 104;

    /* renamed from: l, reason: collision with root package name */
    private static final long f12577l = -1;

    /* renamed from: a, reason: collision with root package name */
    final int f12578a;

    /* renamed from: b, reason: collision with root package name */
    final long f12579b;

    /* renamed from: c, reason: collision with root package name */
    final long f12580c;

    /* renamed from: d, reason: collision with root package name */
    final long f12581d;

    /* renamed from: e, reason: collision with root package name */
    final int f12582e;

    /* renamed from: f, reason: collision with root package name */
    final float f12583f;

    /* renamed from: g, reason: collision with root package name */
    final long f12584g;

    @W(19)
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Class<?> f12585a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f12586b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f12587c;

        /* renamed from: d, reason: collision with root package name */
        private static Method f12588d;

        /* renamed from: e, reason: collision with root package name */
        private static Method f12589e;

        /* renamed from: f, reason: collision with root package name */
        private static Method f12590f;

        private a() {
        }

        public static Object a(C c4, String str) {
            try {
                if (f12585a == null) {
                    f12585a = Class.forName("android.location.LocationRequest");
                }
                if (f12586b == null) {
                    Method declaredMethod = f12585a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f12586b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object invoke = f12586b.invoke(null, str, Long.valueOf(c4.b()), Float.valueOf(c4.e()), Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (f12587c == null) {
                    Method declaredMethod2 = f12585a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f12587c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f12587c.invoke(invoke, Integer.valueOf(c4.g()));
                if (f12588d == null) {
                    Method declaredMethod3 = f12585a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f12588d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f12588d.invoke(invoke, Long.valueOf(c4.f()));
                if (c4.d() < Integer.MAX_VALUE) {
                    if (f12589e == null) {
                        Method declaredMethod4 = f12585a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f12589e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f12589e.invoke(invoke, Integer.valueOf(c4.d()));
                }
                if (c4.a() < Long.MAX_VALUE) {
                    if (f12590f == null) {
                        Method declaredMethod5 = f12585a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f12590f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f12590f.invoke(invoke, Long.valueOf(c4.a()));
                }
                return invoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @W(ConstraintLayout.b.a.f9573F)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        public static LocationRequest a(C c4) {
            return new LocationRequest.Builder(c4.b()).setQuality(c4.g()).setMinUpdateIntervalMillis(c4.f()).setDurationMillis(c4.a()).setMaxUpdates(c4.d()).setMinUpdateDistanceMeters(c4.e()).setMaxUpdateDelayMillis(c4.c()).build();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface d {
    }

    C(long j4, int i4, long j5, int i5, long j6, float f4, long j7) {
        this.f12579b = j4;
        this.f12578a = i4;
        this.f12580c = j6;
        this.f12581d = j5;
        this.f12582e = i5;
        this.f12583f = f4;
        this.f12584g = j7;
    }

    @F(from = 1)
    public long a() {
        return this.f12581d;
    }

    @F(from = 0)
    public long b() {
        return this.f12579b;
    }

    @F(from = 0)
    public long c() {
        return this.f12584g;
    }

    @F(from = 1, to = 2147483647L)
    public int d() {
        return this.f12582e;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 3.4028234663852886E38d)
    public float e() {
        return this.f12583f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c4 = (C) obj;
        if (this.f12578a == c4.f12578a && this.f12579b == c4.f12579b && this.f12580c == c4.f12580c && this.f12581d == c4.f12581d && this.f12582e == c4.f12582e && Float.compare(c4.f12583f, this.f12583f) == 0 && this.f12584g == c4.f12584g) {
            return true;
        }
        return false;
    }

    @F(from = 0)
    public long f() {
        long j4 = this.f12580c;
        if (j4 == -1) {
            return this.f12579b;
        }
        return j4;
    }

    public int g() {
        return this.f12578a;
    }

    @N
    @W(ConstraintLayout.b.a.f9573F)
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i4 = this.f12578a * 31;
        long j4 = this.f12579b;
        int i5 = (i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f12580c;
        return i5 + ((int) (j5 ^ (j5 >>> 32)));
    }

    @P
    @SuppressLint({"NewApi"})
    @W(19)
    public LocationRequest i(@N String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h();
        }
        return B.a(a.a(this, str));
    }

    @N
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.f12579b != Long.MAX_VALUE) {
            sb.append("@");
            K.e(this.f12579b, sb);
            int i4 = this.f12578a;
            if (i4 != 100) {
                if (i4 != 102) {
                    if (i4 == 104) {
                        sb.append(" LOW_POWER");
                    }
                } else {
                    sb.append(" BALANCED");
                }
            } else {
                sb.append(" HIGH_ACCURACY");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.f12581d != Long.MAX_VALUE) {
            sb.append(", duration=");
            K.e(this.f12581d, sb);
        }
        if (this.f12582e != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f12582e);
        }
        long j4 = this.f12580c;
        if (j4 != -1 && j4 < this.f12579b) {
            sb.append(", minUpdateInterval=");
            K.e(this.f12580c, sb);
        }
        if (this.f12583f > com.google.firebase.remoteconfig.l.f37524n) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f12583f);
        }
        if (this.f12584g / 2 > this.f12579b) {
            sb.append(", maxUpdateDelay=");
            K.e(this.f12584g, sb);
        }
        sb.append(']');
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private long f12591a;

        /* renamed from: b, reason: collision with root package name */
        private int f12592b;

        /* renamed from: c, reason: collision with root package name */
        private long f12593c;

        /* renamed from: d, reason: collision with root package name */
        private int f12594d;

        /* renamed from: e, reason: collision with root package name */
        private long f12595e;

        /* renamed from: f, reason: collision with root package name */
        private float f12596f;

        /* renamed from: g, reason: collision with root package name */
        private long f12597g;

        public c(long j4) {
            d(j4);
            this.f12592b = 102;
            this.f12593c = Long.MAX_VALUE;
            this.f12594d = Integer.MAX_VALUE;
            this.f12595e = -1L;
            this.f12596f = 0.0f;
            this.f12597g = 0L;
        }

        @N
        public C a() {
            boolean z3;
            if (this.f12591a == Long.MAX_VALUE && this.f12595e == -1) {
                z3 = false;
            } else {
                z3 = true;
            }
            androidx.core.util.u.o(z3, "passive location requests must have an explicit minimum update interval");
            long j4 = this.f12591a;
            return new C(j4, this.f12592b, this.f12593c, this.f12594d, Math.min(this.f12595e, j4), this.f12596f, this.f12597g);
        }

        @N
        public c b() {
            this.f12595e = -1L;
            return this;
        }

        @N
        public c c(@F(from = 1) long j4) {
            this.f12593c = androidx.core.util.u.h(j4, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @N
        public c d(@F(from = 0) long j4) {
            this.f12591a = androidx.core.util.u.h(j4, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @N
        public c e(@F(from = 0) long j4) {
            this.f12597g = j4;
            this.f12597g = androidx.core.util.u.h(j4, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @N
        public c f(@F(from = 1, to = 2147483647L) int i4) {
            this.f12594d = androidx.core.util.u.g(i4, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @N
        public c g(@InterfaceC0580x(from = 0.0d, to = 3.4028234663852886E38d) float f4) {
            this.f12596f = f4;
            this.f12596f = androidx.core.util.u.f(f4, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @N
        public c h(@F(from = 0) long j4) {
            this.f12595e = androidx.core.util.u.h(j4, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @N
        public c i(int i4) {
            boolean z3;
            if (i4 != 104 && i4 != 102 && i4 != 100) {
                z3 = false;
            } else {
                z3 = true;
            }
            androidx.core.util.u.c(z3, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i4));
            this.f12592b = i4;
            return this;
        }

        public c(@N C c4) {
            this.f12591a = c4.f12579b;
            this.f12592b = c4.f12578a;
            this.f12593c = c4.f12581d;
            this.f12594d = c4.f12582e;
            this.f12595e = c4.f12580c;
            this.f12596f = c4.f12583f;
            this.f12597g = c4.f12584g;
        }
    }
}
