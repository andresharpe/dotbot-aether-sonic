package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.view.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f13466b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f13467c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f13468d = 1001;

    /* renamed from: e, reason: collision with root package name */
    public static final int f13469e = 1002;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13470f = 1003;

    /* renamed from: g, reason: collision with root package name */
    public static final int f13471g = 1004;

    /* renamed from: h, reason: collision with root package name */
    public static final int f13472h = 1006;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13473i = 1007;

    /* renamed from: j, reason: collision with root package name */
    public static final int f13474j = 1008;

    /* renamed from: k, reason: collision with root package name */
    public static final int f13475k = 1009;

    /* renamed from: l, reason: collision with root package name */
    public static final int f13476l = 1010;

    /* renamed from: m, reason: collision with root package name */
    public static final int f13477m = 1011;

    /* renamed from: n, reason: collision with root package name */
    public static final int f13478n = 1012;

    /* renamed from: o, reason: collision with root package name */
    public static final int f13479o = 1013;

    /* renamed from: p, reason: collision with root package name */
    public static final int f13480p = 1014;

    /* renamed from: q, reason: collision with root package name */
    public static final int f13481q = 1015;

    /* renamed from: r, reason: collision with root package name */
    public static final int f13482r = 1016;

    /* renamed from: s, reason: collision with root package name */
    public static final int f13483s = 1017;

    /* renamed from: t, reason: collision with root package name */
    public static final int f13484t = 1018;

    /* renamed from: u, reason: collision with root package name */
    public static final int f13485u = 1019;

    /* renamed from: v, reason: collision with root package name */
    public static final int f13486v = 1020;

    /* renamed from: w, reason: collision with root package name */
    public static final int f13487w = 1021;

    /* renamed from: x, reason: collision with root package name */
    public static final int f13488x = 1000;

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f13489a;

    @androidx.annotation.W(24)
    /* renamed from: androidx.core.view.e0$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static PointerIcon a(Bitmap bitmap, float f4, float f5) {
            return PointerIcon.create(bitmap, f4, f5);
        }

        @InterfaceC0577u
        static PointerIcon b(Context context, int i4) {
            return PointerIcon.getSystemIcon(context, i4);
        }

        @InterfaceC0577u
        static PointerIcon c(Resources resources, int i4) {
            return PointerIcon.load(resources, i4);
        }
    }

    private C0805e0(PointerIcon pointerIcon) {
        this.f13489a = pointerIcon;
    }

    @androidx.annotation.N
    public static C0805e0 a(@androidx.annotation.N Bitmap bitmap, float f4, float f5) {
        return new C0805e0(a.a(bitmap, f4, f5));
    }

    @androidx.annotation.N
    public static C0805e0 c(@androidx.annotation.N Context context, int i4) {
        return new C0805e0(a.b(context, i4));
    }

    @androidx.annotation.N
    public static C0805e0 d(@androidx.annotation.N Resources resources, int i4) {
        return new C0805e0(a.c(resources, i4));
    }

    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Object b() {
        return this.f13489a;
    }
}
