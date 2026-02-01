package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C0;
import com.blankj.utilcode.util.E0;
import com.blankj.utilcode.util.Y;
import com.blankj.utilcode.util.t0;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class H0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f24775a;

        /* renamed from: b, reason: collision with root package name */
        private LinkedHashMap<String, String> f24776b = new LinkedHashMap<>();

        /* renamed from: c, reason: collision with root package name */
        private LinkedHashMap<String, String> f24777c = new LinkedHashMap<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str) {
            this.f24775a = str;
        }

        private void d(Map<String, String> map, String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                int length = 19 - str.length();
                if (length > 0) {
                    str = str + "                   ".substring(0, length);
                }
                map.put(str, str2);
            }
        }

        private void e(Map<String, String> map, Map<String, String> map2) {
            if (map2 != null && !map2.isEmpty()) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    d(map, entry.getKey(), entry.getValue());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(String str, String str2) {
            d(this.f24776b, str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(String str, String str2) {
            d(this.f24777c, str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(Map<String, String> map) {
            e(this.f24777c, map);
        }

        public String f() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.f24777c.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = "************* " + this.f24775a + " Head ****************\n";
            sb.append(str);
            for (Map.Entry<String, String> entry : this.f24776b.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            sb.append("Rom Info           : ");
            sb.append(C1103m0.c());
            sb.append("\n");
            sb.append("Device Manufacturer: ");
            sb.append(Build.MANUFACTURER);
            sb.append("\n");
            sb.append("Device Model       : ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("Android Version    : ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\n");
            sb.append("Android SDK        : ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\n");
            sb.append("App VersionName    : ");
            sb.append(C1092h.G());
            sb.append("\n");
            sb.append("App VersionCode    : ");
            sb.append(C1092h.E());
            sb.append("\n");
            sb.append(f());
            sb.append(str);
            sb.append("\n");
            return sb.toString();
        }
    }

    H0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean A(CharSequence charSequence, CharSequence charSequence2) {
        return x0.a(charSequence, charSequence2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean A0() {
        return n0.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t0.b B(String str, boolean z3) {
        return t0.c(str, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B0() {
        return C1103m0.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri C(File file) {
        return D0.b(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C0(String str) {
        return r0.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void D() {
        C1078a.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D0(String str) {
        return x0.h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(Activity activity) {
        M.f(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean E0(@androidx.annotation.N View view, long j4) {
        return B.c(view, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String F(@androidx.annotation.P String str, Object... objArr) {
        return x0.c(str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] F0(JSONArray jSONArray) {
        return C1115z.K(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String G(String str) {
        return L.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] G0(JSONObject jSONObject) {
        return C1115z.L(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T H(String str, Type type) {
        return (T) J.i(str, type);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static View H0(@androidx.annotation.I int i4) {
        return J0.c(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity I(Context context) {
        return C1078a.x(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String I0(long j4, int i4) {
        return A0.P0(j4, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Activity> J() {
        return G0.f24754K.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void J0(File file) {
        G.J0(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K() {
        return q0.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] K0(Parcelable parcelable) {
        return C1115z.S(parcelable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Application L() {
        return G0.f24754K.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void L0() {
        M0(C1080b.k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.Y("android.permission.CALL_PHONE")
    public static Intent M(String str) {
        return K.a(str);
    }

    private static void M0(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            y0.d0().execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String N() {
        return C1097j0.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int N0(float f4) {
        return u0.g(f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent O(String str) {
        return K.h(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int O0(float f4) {
        return u0.h(f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File P(String str) {
        return G.C(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] P0(File file) {
        return F.a(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String Q() {
        return C1097j0.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Q0() {
        C1092h.f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long R(String str) {
        return G.W(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void R0(Activity activity) {
        G0.f24754K.u(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long S(String str) {
        return G.X(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void S0(Activity activity, E0.a aVar) {
        G0.f24754K.v(activity, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String T(Throwable th) {
        return z0.a(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T0(E0.a aVar) {
        G0.f24754K.w(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Gson U() {
        return J.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void U0(E0.d dVar) {
        G0.f24754K.y(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent V(Uri uri) {
        return K.i(uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void V0(Runnable runnable) {
        y0.s0(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent W(File file) {
        return K.j(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void W0(Runnable runnable, long j4) {
        y0.t0(runnable, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent X(String str, boolean z3) {
        return K.n(str, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] X0(Serializable serializable) {
        return C1115z.V(serializable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent Y(String str) {
        return K.o(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int Y0(float f4) {
        return u0.i(f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String Z(String str) {
        return C1078a.I(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void Z0() {
        C1078a.C1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, E0.a aVar) {
        G0.f24754K.d(activity, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a0() {
        return C1098k.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a1(String str) {
        return C1115z.X(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(E0.a aVar) {
        G0.f24754K.e(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Notification b0(Y.a aVar, E0.b<C0.g> bVar) {
        return Y.e(aVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b1(Object obj) {
        return J.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(E0.d dVar) {
        G0.f24754K.g(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c0(String str, String str2) {
        return K.p(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c1() {
        ToastUtils.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] d(byte[] bArr) {
        return D.b(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p0 d0() {
        return p0.k("Utils");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d1(CharSequence charSequence) {
        ToastUtils.V(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(byte[] bArr) {
        return D.d(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e0() {
        return C1098k.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e1(Application application) {
        G0.f24754K.B(application);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] f(Bitmap bitmap) {
        return ImageUtils.o(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f0(@androidx.annotation.c0 int i4) {
        return x0.d(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File f1(Uri uri) {
        return D0.g(uri);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] g(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4) {
        return ImageUtils.p(bitmap, compressFormat, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g0(@androidx.annotation.c0 int i4, Object... objArr) {
        return x0.e(i4, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap g1(View view) {
        return ImageUtils.i1(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable h(Bitmap bitmap) {
        return ImageUtils.q(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity h0() {
        return G0.f24754K.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h1(File file, byte[] bArr) {
        return F.v(file, bArr, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String i(long j4) {
        return C1115z.e(j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent i0(String str) {
        return K.E(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i1(String str, InputStream inputStream) {
        return F.P(str, inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap j(byte[] bArr) {
        return ImageUtils.r(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] j0(byte[] bArr, String str) {
        return E.r0(bArr, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j1(String str, String str2, boolean z3) {
        return F.W(str, str2, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable k(byte[] bArr) {
        return ImageUtils.s(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] k0(String str) {
        return C1115z.C(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l(byte[] bArr) {
        return C1115z.l(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l0(Application application) {
        G0.f24754K.q(application);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONArray m(byte[] bArr) {
        return C1115z.o(bArr);
    }

    static ByteArrayOutputStream m0(InputStream inputStream) {
        return C1115z.E(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject n(byte[] bArr) {
        return C1115z.p(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] n0(InputStream inputStream) {
        return C1115z.F(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object o(byte[] bArr) {
        return C1115z.q(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> o0(InputStream inputStream, String str) {
        return C1115z.H(inputStream, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T p(byte[] bArr, Parcelable.Creator<T> creator) {
        return (T) C1115z.s(bArr, creator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p0(Activity activity) {
        return C1078a.R(activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String q(byte[] bArr) {
        return C1115z.t(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q0() {
        return C1092h.N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r(File file) {
        return G.i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean r0() {
        return G0.f24754K.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(File file) {
        return G.k(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s0(String str) {
        return C1092h.R(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t(File file) {
        return G.m(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean t0(@androidx.annotation.N String str) {
        return C1092h.T(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u(File file) {
        return G.q(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean u0(File file) {
        return G.g0(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> E0.f<T> v(E0.f<T> fVar) {
        y0.d0().execute(fVar);
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v0(String... strArr) {
        return C1083c0.z(strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(float f4) {
        return u0.b(f4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(api = 23)
    public static boolean w0() {
        return C1083c0.A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bitmap x(Drawable drawable) {
        return ImageUtils.K(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x0(Intent intent) {
        return K.F(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] y(Drawable drawable) {
        return ImageUtils.L(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y0() {
        return J0.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] z(Drawable drawable, Bitmap.CompressFormat compressFormat, int i4) {
        return ImageUtils.M(drawable, compressFormat, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean z0() {
        return C1097j0.g();
    }
}
