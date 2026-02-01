package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.blankj.utilcode.util.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1105o {

    /* renamed from: a, reason: collision with root package name */
    private static C1106p f25098a;

    public static JSONObject A(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        return c1106p.o(str);
    }

    public static JSONObject B(@androidx.annotation.N String str, JSONObject jSONObject) {
        return C(str, jSONObject, q());
    }

    public static JSONObject C(@androidx.annotation.N String str, JSONObject jSONObject, @androidx.annotation.N C1106p c1106p) {
        return c1106p.p(str, jSONObject);
    }

    public static <T> T D(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator) {
        return (T) E(str, creator, q());
    }

    public static <T> T E(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, @androidx.annotation.N C1106p c1106p) {
        return (T) c1106p.q(str, creator);
    }

    public static <T> T F(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, T t3) {
        return (T) G(str, creator, t3, q());
    }

    public static <T> T G(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, T t3, @androidx.annotation.N C1106p c1106p) {
        return (T) c1106p.r(str, creator, t3);
    }

    public static Object H(@androidx.annotation.N String str) {
        return I(str, q());
    }

    public static Object I(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        return c1106p.s(str);
    }

    public static Object J(@androidx.annotation.N String str, Object obj) {
        return K(str, obj, q());
    }

    public static Object K(@androidx.annotation.N String str, Object obj, @androidx.annotation.N C1106p c1106p) {
        return c1106p.t(str, obj);
    }

    public static String L(@androidx.annotation.N String str) {
        return M(str, q());
    }

    public static String M(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        return c1106p.u(str);
    }

    public static String N(@androidx.annotation.N String str, String str2) {
        return O(str, str2, q());
    }

    public static String O(@androidx.annotation.N String str, String str2, @androidx.annotation.N C1106p c1106p) {
        return c1106p.v(str, str2);
    }

    public static void P(@androidx.annotation.N String str, Bitmap bitmap) {
        S(str, bitmap, q());
    }

    public static void Q(@androidx.annotation.N String str, Bitmap bitmap, int i4) {
        R(str, bitmap, i4, q());
    }

    public static void R(@androidx.annotation.N String str, Bitmap bitmap, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.x(str, bitmap, i4);
    }

    public static void S(@androidx.annotation.N String str, Bitmap bitmap, @androidx.annotation.N C1106p c1106p) {
        c1106p.w(str, bitmap);
    }

    public static void T(@androidx.annotation.N String str, Drawable drawable) {
        W(str, drawable, q());
    }

    public static void U(@androidx.annotation.N String str, Drawable drawable, int i4) {
        V(str, drawable, i4, q());
    }

    public static void V(@androidx.annotation.N String str, Drawable drawable, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.z(str, drawable, i4);
    }

    public static void W(@androidx.annotation.N String str, Drawable drawable, @androidx.annotation.N C1106p c1106p) {
        c1106p.y(str, drawable);
    }

    public static void X(@androidx.annotation.N String str, Parcelable parcelable) {
        a0(str, parcelable, q());
    }

    public static void Y(@androidx.annotation.N String str, Parcelable parcelable, int i4) {
        Z(str, parcelable, i4, q());
    }

    public static void Z(@androidx.annotation.N String str, Parcelable parcelable, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.B(str, parcelable, i4);
    }

    public static void a() {
        b(q());
    }

    public static void a0(@androidx.annotation.N String str, Parcelable parcelable, @androidx.annotation.N C1106p c1106p) {
        c1106p.A(str, parcelable);
    }

    public static void b(@androidx.annotation.N C1106p c1106p) {
        c1106p.a();
    }

    public static void b0(@androidx.annotation.N String str, Serializable serializable) {
        e0(str, serializable, q());
    }

    public static Bitmap c(@androidx.annotation.N String str) {
        return f(str, q());
    }

    public static void c0(@androidx.annotation.N String str, Serializable serializable, int i4) {
        d0(str, serializable, i4, q());
    }

    public static Bitmap d(@androidx.annotation.N String str, Bitmap bitmap) {
        return e(str, bitmap, q());
    }

    public static void d0(@androidx.annotation.N String str, Serializable serializable, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.D(str, serializable, i4);
    }

    public static Bitmap e(@androidx.annotation.N String str, Bitmap bitmap, @androidx.annotation.N C1106p c1106p) {
        return c1106p.c(str, bitmap);
    }

    public static void e0(@androidx.annotation.N String str, Serializable serializable, @androidx.annotation.N C1106p c1106p) {
        c1106p.C(str, serializable);
    }

    public static Bitmap f(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        return c1106p.b(str);
    }

    public static void f0(@androidx.annotation.N String str, String str2) {
        i0(str, str2, q());
    }

    public static byte[] g(@androidx.annotation.N String str) {
        return h(str, q());
    }

    public static void g0(@androidx.annotation.N String str, String str2, int i4) {
        h0(str, str2, i4, q());
    }

    public static byte[] h(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        return c1106p.d(str);
    }

    public static void h0(@androidx.annotation.N String str, String str2, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.F(str, str2, i4);
    }

    public static byte[] i(@androidx.annotation.N String str, byte[] bArr) {
        return j(str, bArr, q());
    }

    public static void i0(@androidx.annotation.N String str, String str2, @androidx.annotation.N C1106p c1106p) {
        c1106p.E(str, str2);
    }

    public static byte[] j(@androidx.annotation.N String str, byte[] bArr, @androidx.annotation.N C1106p c1106p) {
        return c1106p.e(str, bArr);
    }

    public static void j0(@androidx.annotation.N String str, JSONArray jSONArray) {
        m0(str, jSONArray, q());
    }

    public static int k() {
        return l(q());
    }

    public static void k0(@androidx.annotation.N String str, JSONArray jSONArray, int i4) {
        l0(str, jSONArray, i4, q());
    }

    public static int l(@androidx.annotation.N C1106p c1106p) {
        return c1106p.f();
    }

    public static void l0(@androidx.annotation.N String str, JSONArray jSONArray, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.H(str, jSONArray, i4);
    }

    public static long m() {
        return n(q());
    }

    public static void m0(@androidx.annotation.N String str, JSONArray jSONArray, @androidx.annotation.N C1106p c1106p) {
        c1106p.G(str, jSONArray);
    }

    public static long n(@androidx.annotation.N C1106p c1106p) {
        return c1106p.g();
    }

    public static void n0(@androidx.annotation.N String str, JSONObject jSONObject) {
        q0(str, jSONObject, q());
    }

    public static int o() {
        return p(q());
    }

    public static void o0(@androidx.annotation.N String str, JSONObject jSONObject, int i4) {
        p0(str, jSONObject, i4, q());
    }

    public static int p(@androidx.annotation.N C1106p c1106p) {
        return c1106p.h();
    }

    public static void p0(@androidx.annotation.N String str, JSONObject jSONObject, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.J(str, jSONObject, i4);
    }

    private static C1106p q() {
        C1106p c1106p = f25098a;
        if (c1106p == null) {
            return C1106p.k();
        }
        return c1106p;
    }

    public static void q0(@androidx.annotation.N String str, JSONObject jSONObject, @androidx.annotation.N C1106p c1106p) {
        c1106p.I(str, jSONObject);
    }

    public static Drawable r(@androidx.annotation.N String str) {
        return u(str, q());
    }

    public static void r0(@androidx.annotation.N String str, byte[] bArr) {
        u0(str, bArr, q());
    }

    public static Drawable s(@androidx.annotation.N String str, Drawable drawable) {
        return t(str, drawable, q());
    }

    public static void s0(@androidx.annotation.N String str, byte[] bArr, int i4) {
        t0(str, bArr, i4, q());
    }

    public static Drawable t(@androidx.annotation.N String str, Drawable drawable, @androidx.annotation.N C1106p c1106p) {
        return c1106p.j(str, drawable);
    }

    public static void t0(@androidx.annotation.N String str, byte[] bArr, int i4, @androidx.annotation.N C1106p c1106p) {
        c1106p.L(str, bArr, i4);
    }

    public static Drawable u(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        return c1106p.i(str);
    }

    public static void u0(@androidx.annotation.N String str, byte[] bArr, @androidx.annotation.N C1106p c1106p) {
        c1106p.K(str, bArr);
    }

    public static JSONArray v(@androidx.annotation.N String str) {
        return w(str, q());
    }

    public static void v0(@androidx.annotation.N String str) {
        w0(str, q());
    }

    public static JSONArray w(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        return c1106p.m(str);
    }

    public static void w0(@androidx.annotation.N String str, @androidx.annotation.N C1106p c1106p) {
        c1106p.M(str);
    }

    public static JSONArray x(@androidx.annotation.N String str, JSONArray jSONArray) {
        return y(str, jSONArray, q());
    }

    public static void x0(C1106p c1106p) {
        f25098a = c1106p;
    }

    public static JSONArray y(@androidx.annotation.N String str, JSONArray jSONArray, @androidx.annotation.N C1106p c1106p) {
        return c1106p.n(str, jSONArray);
    }

    public static JSONObject z(@androidx.annotation.N String str) {
        return A(str, q());
    }
}
