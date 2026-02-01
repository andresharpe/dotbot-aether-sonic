package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.blankj.utilcode.util.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102m {

    /* renamed from: a, reason: collision with root package name */
    private static C1104n f25030a;

    public static JSONObject A(@androidx.annotation.N String str, @androidx.annotation.P JSONObject jSONObject, @androidx.annotation.N C1104n c1104n) {
        return c1104n.t(str, jSONObject);
    }

    public static <T> T B(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator) {
        return (T) C(str, creator, o());
    }

    public static <T> T C(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, @androidx.annotation.N C1104n c1104n) {
        return (T) c1104n.u(str, creator);
    }

    public static <T> T D(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, @androidx.annotation.P T t3) {
        return (T) E(str, creator, t3, o());
    }

    public static <T> T E(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, @androidx.annotation.P T t3, @androidx.annotation.N C1104n c1104n) {
        return (T) c1104n.v(str, creator, t3);
    }

    public static Object F(@androidx.annotation.N String str) {
        return G(str, o());
    }

    public static Object G(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.w(str);
    }

    public static Object H(@androidx.annotation.N String str, @androidx.annotation.P Object obj) {
        return I(str, obj, o());
    }

    public static Object I(@androidx.annotation.N String str, @androidx.annotation.P Object obj, @androidx.annotation.N C1104n c1104n) {
        return c1104n.x(str, obj);
    }

    public static String J(@androidx.annotation.N String str) {
        return K(str, o());
    }

    public static String K(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.y(str);
    }

    public static String L(@androidx.annotation.N String str, @androidx.annotation.P String str2) {
        return M(str, str2, o());
    }

    public static String M(@androidx.annotation.N String str, @androidx.annotation.P String str2, @androidx.annotation.N C1104n c1104n) {
        return c1104n.z(str, str2);
    }

    public static void N(@androidx.annotation.N String str, @androidx.annotation.P Bitmap bitmap) {
        Q(str, bitmap, o());
    }

    public static void O(@androidx.annotation.N String str, @androidx.annotation.P Bitmap bitmap, int i4) {
        P(str, bitmap, i4, o());
    }

    public static void P(@androidx.annotation.N String str, @androidx.annotation.P Bitmap bitmap, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.B(str, bitmap, i4);
    }

    public static void Q(@androidx.annotation.N String str, @androidx.annotation.P Bitmap bitmap, @androidx.annotation.N C1104n c1104n) {
        c1104n.A(str, bitmap);
    }

    public static void R(@androidx.annotation.N String str, @androidx.annotation.P Drawable drawable) {
        U(str, drawable, o());
    }

    public static void S(@androidx.annotation.N String str, @androidx.annotation.P Drawable drawable, int i4) {
        T(str, drawable, i4, o());
    }

    public static void T(@androidx.annotation.N String str, @androidx.annotation.P Drawable drawable, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.D(str, drawable, i4);
    }

    public static void U(@androidx.annotation.N String str, @androidx.annotation.P Drawable drawable, @androidx.annotation.N C1104n c1104n) {
        c1104n.C(str, drawable);
    }

    public static void V(@androidx.annotation.N String str, @androidx.annotation.P Parcelable parcelable) {
        Y(str, parcelable, o());
    }

    public static void W(@androidx.annotation.N String str, @androidx.annotation.P Parcelable parcelable, int i4) {
        X(str, parcelable, i4, o());
    }

    public static void X(@androidx.annotation.N String str, @androidx.annotation.P Parcelable parcelable, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.F(str, parcelable, i4);
    }

    public static void Y(@androidx.annotation.N String str, @androidx.annotation.P Parcelable parcelable, @androidx.annotation.N C1104n c1104n) {
        c1104n.E(str, parcelable);
    }

    public static void Z(@androidx.annotation.N String str, @androidx.annotation.P Serializable serializable) {
        c0(str, serializable, o());
    }

    public static boolean a() {
        return b(o());
    }

    public static void a0(@androidx.annotation.N String str, @androidx.annotation.P Serializable serializable, int i4) {
        b0(str, serializable, i4, o());
    }

    public static boolean b(@androidx.annotation.N C1104n c1104n) {
        return c1104n.a();
    }

    public static void b0(@androidx.annotation.N String str, @androidx.annotation.P Serializable serializable, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.H(str, serializable, i4);
    }

    public static Bitmap c(@androidx.annotation.N String str) {
        return f(str, o());
    }

    public static void c0(@androidx.annotation.N String str, @androidx.annotation.P Serializable serializable, @androidx.annotation.N C1104n c1104n) {
        c1104n.G(str, serializable);
    }

    public static Bitmap d(@androidx.annotation.N String str, @androidx.annotation.P Bitmap bitmap) {
        return e(str, bitmap, o());
    }

    public static void d0(@androidx.annotation.N String str, @androidx.annotation.P String str2) {
        g0(str, str2, o());
    }

    public static Bitmap e(@androidx.annotation.N String str, @androidx.annotation.P Bitmap bitmap, @androidx.annotation.N C1104n c1104n) {
        return c1104n.c(str, bitmap);
    }

    public static void e0(@androidx.annotation.N String str, @androidx.annotation.P String str2, int i4) {
        f0(str, str2, i4, o());
    }

    public static Bitmap f(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.b(str);
    }

    public static void f0(@androidx.annotation.N String str, @androidx.annotation.P String str2, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.J(str, str2, i4);
    }

    public static byte[] g(@androidx.annotation.N String str) {
        return h(str, o());
    }

    public static void g0(@androidx.annotation.N String str, @androidx.annotation.P String str2, @androidx.annotation.N C1104n c1104n) {
        c1104n.I(str, str2);
    }

    public static byte[] h(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.d(str);
    }

    public static void h0(@androidx.annotation.N String str, @androidx.annotation.P JSONArray jSONArray) {
        k0(str, jSONArray, o());
    }

    public static byte[] i(@androidx.annotation.N String str, @androidx.annotation.P byte[] bArr) {
        return j(str, bArr, o());
    }

    public static void i0(@androidx.annotation.N String str, @androidx.annotation.P JSONArray jSONArray, int i4) {
        j0(str, jSONArray, i4, o());
    }

    public static byte[] j(@androidx.annotation.N String str, @androidx.annotation.P byte[] bArr, @androidx.annotation.N C1104n c1104n) {
        return c1104n.e(str, bArr);
    }

    public static void j0(@androidx.annotation.N String str, @androidx.annotation.P JSONArray jSONArray, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.L(str, jSONArray, i4);
    }

    public static int k() {
        return l(o());
    }

    public static void k0(@androidx.annotation.N String str, @androidx.annotation.P JSONArray jSONArray, @androidx.annotation.N C1104n c1104n) {
        c1104n.K(str, jSONArray);
    }

    public static int l(@androidx.annotation.N C1104n c1104n) {
        return c1104n.f();
    }

    public static void l0(@androidx.annotation.N String str, @androidx.annotation.P JSONObject jSONObject) {
        o0(str, jSONObject, o());
    }

    public static long m() {
        return n(o());
    }

    public static void m0(@androidx.annotation.N String str, @androidx.annotation.P JSONObject jSONObject, int i4) {
        n0(str, jSONObject, i4, o());
    }

    public static long n(@androidx.annotation.N C1104n c1104n) {
        return c1104n.g();
    }

    public static void n0(@androidx.annotation.N String str, @androidx.annotation.P JSONObject jSONObject, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.N(str, jSONObject, i4);
    }

    @androidx.annotation.N
    private static C1104n o() {
        C1104n c1104n = f25030a;
        if (c1104n == null) {
            return C1104n.k();
        }
        return c1104n;
    }

    public static void o0(@androidx.annotation.N String str, @androidx.annotation.P JSONObject jSONObject, @androidx.annotation.N C1104n c1104n) {
        c1104n.M(str, jSONObject);
    }

    public static Drawable p(@androidx.annotation.N String str) {
        return s(str, o());
    }

    public static void p0(@androidx.annotation.N String str, @androidx.annotation.P byte[] bArr) {
        s0(str, bArr, o());
    }

    public static Drawable q(@androidx.annotation.N String str, @androidx.annotation.P Drawable drawable) {
        return r(str, drawable, o());
    }

    public static void q0(@androidx.annotation.N String str, @androidx.annotation.P byte[] bArr, int i4) {
        r0(str, bArr, i4, o());
    }

    public static Drawable r(@androidx.annotation.N String str, @androidx.annotation.P Drawable drawable, @androidx.annotation.N C1104n c1104n) {
        return c1104n.j(str, drawable);
    }

    public static void r0(@androidx.annotation.N String str, @androidx.annotation.P byte[] bArr, int i4, @androidx.annotation.N C1104n c1104n) {
        c1104n.P(str, bArr, i4);
    }

    public static Drawable s(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.i(str);
    }

    public static void s0(@androidx.annotation.N String str, @androidx.annotation.P byte[] bArr, @androidx.annotation.N C1104n c1104n) {
        c1104n.O(str, bArr);
    }

    public static JSONArray t(@androidx.annotation.N String str) {
        return u(str, o());
    }

    public static boolean t0(@androidx.annotation.N String str) {
        return u0(str, o());
    }

    public static JSONArray u(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.q(str);
    }

    public static boolean u0(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.T(str);
    }

    public static JSONArray v(@androidx.annotation.N String str, @androidx.annotation.P JSONArray jSONArray) {
        return w(str, jSONArray, o());
    }

    public static void v0(@androidx.annotation.P C1104n c1104n) {
        f25030a = c1104n;
    }

    public static JSONArray w(@androidx.annotation.N String str, @androidx.annotation.P JSONArray jSONArray, @androidx.annotation.N C1104n c1104n) {
        return c1104n.r(str, jSONArray);
    }

    public static JSONObject x(@androidx.annotation.N String str) {
        return y(str, o());
    }

    public static JSONObject y(@androidx.annotation.N String str, @androidx.annotation.N C1104n c1104n) {
        return c1104n.s(str);
    }

    public static JSONObject z(@androidx.annotation.N String str, @androidx.annotation.P JSONObject jSONObject) {
        return A(str, jSONObject, o());
    }
}
