package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.core.view.accessibility.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0775b {

    /* renamed from: A, reason: collision with root package name */
    public static final int f13422A = 128;

    /* renamed from: B, reason: collision with root package name */
    public static final int f13423B = 256;

    /* renamed from: C, reason: collision with root package name */
    public static final int f13424C = 512;

    /* renamed from: D, reason: collision with root package name */
    public static final int f13425D = -1;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f13426a = 128;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f13427b = 256;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f13428c = 512;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f13429d = 1024;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f13430e = 2048;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f13431f = 4096;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f13432g = 8192;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13433h = 16384;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13434i = 32768;

    /* renamed from: j, reason: collision with root package name */
    public static final int f13435j = 65536;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13436k = 131072;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13437l = 262144;

    /* renamed from: m, reason: collision with root package name */
    public static final int f13438m = 524288;

    /* renamed from: n, reason: collision with root package name */
    public static final int f13439n = 1048576;

    /* renamed from: o, reason: collision with root package name */
    public static final int f13440o = 2097152;

    /* renamed from: p, reason: collision with root package name */
    public static final int f13441p = 4194304;

    /* renamed from: q, reason: collision with root package name */
    public static final int f13442q = 8388608;

    /* renamed from: r, reason: collision with root package name */
    public static final int f13443r = 16777216;

    /* renamed from: s, reason: collision with root package name */
    public static final int f13444s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f13445t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f13446u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f13447v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13448w = 8;

    /* renamed from: x, reason: collision with root package name */
    public static final int f13449x = 16;

    /* renamed from: y, reason: collision with root package name */
    public static final int f13450y = 32;

    /* renamed from: z, reason: collision with root package name */
    public static final int f13451z = 64;

    @W(16)
    /* renamed from: androidx.core.view.accessibility.b$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @InterfaceC0577u
        static int b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @InterfaceC0577u
        static void c(AccessibilityEvent accessibilityEvent, int i4) {
            accessibilityEvent.setAction(i4);
        }

        @InterfaceC0577u
        static void d(AccessibilityEvent accessibilityEvent, int i4) {
            accessibilityEvent.setMovementGranularity(i4);
        }
    }

    @W(19)
    /* renamed from: androidx.core.view.accessibility.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0105b {
        private C0105b() {
        }

        @InterfaceC0577u
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @InterfaceC0577u
        static void b(AccessibilityEvent accessibilityEvent, int i4) {
            accessibilityEvent.setContentChangeTypes(i4);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.view.accessibility.b$c */
    /* loaded from: classes.dex */
    public @interface c {
    }

    private C0775b() {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, T t3) {
        accessibilityEvent.appendRecord((AccessibilityRecord) t3.g());
    }

    @Deprecated
    public static T b(AccessibilityEvent accessibilityEvent) {
        return new T(accessibilityEvent);
    }

    public static int c(@androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static int d(@androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        return C0105b.a(accessibilityEvent);
    }

    public static int e(@androidx.annotation.N AccessibilityEvent accessibilityEvent) {
        return a.b(accessibilityEvent);
    }

    @Deprecated
    public static T f(AccessibilityEvent accessibilityEvent, int i4) {
        return new T(accessibilityEvent.getRecord(i4));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void h(@androidx.annotation.N AccessibilityEvent accessibilityEvent, int i4) {
        a.c(accessibilityEvent, i4);
    }

    public static void i(@androidx.annotation.N AccessibilityEvent accessibilityEvent, int i4) {
        C0105b.b(accessibilityEvent, i4);
    }

    public static void j(@androidx.annotation.N AccessibilityEvent accessibilityEvent, int i4) {
        a.d(accessibilityEvent, i4);
    }
}
