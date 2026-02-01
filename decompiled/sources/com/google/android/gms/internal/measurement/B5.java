package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class B5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f29272a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f29273b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f29274c;

    /* renamed from: d, reason: collision with root package name */
    private static final A5 f29275d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f29276e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f29277f;

    /* renamed from: g, reason: collision with root package name */
    static final long f29278g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f29279h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B5.<clinit>():void");
    }

    private B5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i4 = C1534x3.f29834a;
        try {
            Class cls2 = f29273b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(Object obj, long j4) {
        return f29275d.g(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C() {
        return f29277f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D() {
        return f29276e;
    }

    private static int E(Class cls) {
        if (f29277f) {
            return f29275d.h(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f29277f) {
            return f29275d.i(cls);
        }
        return -1;
    }

    private static Field b() {
        int i4 = C1534x3.f29834a;
        Field c4 = c(Buffer.class, "effectiveDirectAddress");
        if (c4 == null) {
            Field c5 = c(Buffer.class, "address");
            if (c5 != null && c5.getType() == Long.TYPE) {
                return c5;
            }
            return null;
        }
        return c4;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        A5 a5 = f29275d;
        int j6 = a5.j(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        a5.n(obj, j5, ((255 & b4) << i4) | (j6 & (~(255 << i4))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j4, byte b4) {
        long j5 = (-4) & j4;
        A5 a5 = f29275d;
        int i4 = (((int) j4) & 3) << 3;
        a5.n(obj, j5, ((255 & b4) << i4) | (a5.j(obj, j5) & (~(255 << i4))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double f(Object obj, long j4) {
        return f29275d.a(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float g(Object obj, long j4) {
        return f29275d.b(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(Object obj, long j4) {
        return f29275d.j(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long i(Object obj, long j4) {
        return f29275d.k(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object j(Class cls) {
        try {
            return f29272a.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object k(Object obj, long j4) {
        return f29275d.m(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1536x5());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(B5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(Object obj, long j4, boolean z3) {
        f29275d.c(obj, j4, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(byte[] bArr, long j4, byte b4) {
        f29275d.d(bArr, f29278g + j4, b4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(Object obj, long j4, double d4) {
        f29275d.e(obj, j4, d4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(Object obj, long j4, float f4) {
        f29275d.f(obj, j4, f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void v(Object obj, long j4, int i4) {
        f29275d.n(obj, j4, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Object obj, long j4, long j5) {
        f29275d.o(obj, j4, j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(Object obj, long j4, Object obj2) {
        f29275d.p(obj, j4, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean y(Object obj, long j4) {
        if (((byte) ((f29275d.j(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean z(Object obj, long j4) {
        if (((byte) ((f29275d.j(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }
}
