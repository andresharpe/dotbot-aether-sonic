package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1285y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.gms.measurement.internal.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1720t1 extends A2 {

    /* renamed from: c, reason: collision with root package name */
    private char f30972c;

    /* renamed from: d, reason: collision with root package name */
    private long f30973d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.B("this")
    private String f30974e;

    /* renamed from: f, reason: collision with root package name */
    private final C1708r1 f30975f;

    /* renamed from: g, reason: collision with root package name */
    private final C1708r1 f30976g;

    /* renamed from: h, reason: collision with root package name */
    private final C1708r1 f30977h;

    /* renamed from: i, reason: collision with root package name */
    private final C1708r1 f30978i;

    /* renamed from: j, reason: collision with root package name */
    private final C1708r1 f30979j;

    /* renamed from: k, reason: collision with root package name */
    private final C1708r1 f30980k;

    /* renamed from: l, reason: collision with root package name */
    private final C1708r1 f30981l;

    /* renamed from: m, reason: collision with root package name */
    private final C1708r1 f30982m;

    /* renamed from: n, reason: collision with root package name */
    private final C1708r1 f30983n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1720t1(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30972c = (char) 0;
        this.f30973d = -1L;
        this.f30975f = new C1708r1(this, 6, false, false);
        this.f30976g = new C1708r1(this, 6, true, false);
        this.f30977h = new C1708r1(this, 6, false, true);
        this.f30978i = new C1708r1(this, 5, false, false);
        this.f30979j = new C1708r1(this, 5, true, false);
        this.f30980k = new C1708r1(this, 5, false, true);
        this.f30981l = new C1708r1(this, 4, false, false);
        this.f30982m = new C1708r1(this, 3, false, false);
        this.f30983n = new C1708r1(this, 2, false, false);
    }

    private static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new C1714s1(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String y(boolean z3, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String z4 = z(z3, obj);
        String z5 = z(z3, obj2);
        String z6 = z(z3, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(z4)) {
            sb.append(str2);
            sb.append(z4);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(z5)) {
            sb.append(str2);
            sb.append(z5);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(z6)) {
            sb.append(str3);
            sb.append(z6);
        }
        return sb.toString();
    }

    @com.google.android.gms.common.util.D
    static String z(boolean z3, Object obj) {
        String str;
        String th;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i4 = 0;
        if (obj instanceof Long) {
            if (!z3) {
                return obj.toString();
            }
            Long l4 = (Long) obj;
            if (Math.abs(l4.longValue()) < 100) {
                return obj.toString();
            }
            if (obj.toString().charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l4.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z3) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb = new StringBuilder(th);
            String E3 = E(C1638f2.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i4];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(E3)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i4++;
            }
            return sb.toString();
        }
        if (obj instanceof C1714s1) {
            str = ((C1714s1) obj).f30961a;
            return str;
        }
        if (z3) {
            return "-";
        }
        return obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    @com.google.android.gms.common.util.D
    public final String A() {
        String str;
        synchronized (this) {
            try {
                if (this.f30974e == null) {
                    if (this.f31060a.O() != null) {
                        this.f30974e = this.f31060a.O();
                    } else {
                        this.f30974e = this.f31060a.x().u();
                    }
                }
                C1285y.l(this.f30974e);
                str = this.f30974e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(int i4, boolean z3, boolean z4, String str, Object obj, Object obj2, Object obj3) {
        if (!z3 && Log.isLoggable(A(), i4)) {
            Log.println(i4, A(), y(false, str, obj, obj2, obj3));
        }
        if (!z4 && i4 >= 5) {
            C1285y.l(str);
            C1620c2 E3 = this.f31060a.E();
            if (E3 == null) {
                Log.println(6, A(), "Scheduler not set. Not logging error/warn");
            } else {
                if (!E3.l()) {
                    Log.println(6, A(), "Scheduler not initialized. Not logging error/warn");
                    return;
                }
                if (i4 >= 9) {
                    i4 = 8;
                }
                E3.x(new RunnableC1703q1(this, i4, str, obj, obj2, obj3));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.A2
    protected final boolean h() {
        return false;
    }

    public final C1708r1 o() {
        return this.f30982m;
    }

    public final C1708r1 p() {
        return this.f30975f;
    }

    public final C1708r1 q() {
        return this.f30977h;
    }

    public final C1708r1 r() {
        return this.f30976g;
    }

    public final C1708r1 s() {
        return this.f30981l;
    }

    public final C1708r1 t() {
        return this.f30983n;
    }

    public final C1708r1 u() {
        return this.f30978i;
    }

    public final C1708r1 v() {
        return this.f30980k;
    }

    public final C1708r1 w() {
        return this.f30979j;
    }
}
