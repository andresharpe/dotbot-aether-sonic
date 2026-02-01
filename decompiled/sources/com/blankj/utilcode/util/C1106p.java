package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import r0.InterfaceC2401a;

/* renamed from: com.blankj.utilcode.util.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106p implements InterfaceC2401a {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, C1106p> f25100g = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final r f25101e;

    /* renamed from: f, reason: collision with root package name */
    private final C1104n f25102f;

    private C1106p(r rVar, C1104n c1104n) {
        this.f25101e = rVar;
        this.f25102f = c1104n;
    }

    public static C1106p k() {
        return l(r.e(), C1104n.k());
    }

    public static C1106p l(@androidx.annotation.N r rVar, @androidx.annotation.N C1104n c1104n) {
        String str = c1104n.toString() + "_" + rVar.toString();
        Map<String, C1106p> map = f25100g;
        C1106p c1106p = map.get(str);
        if (c1106p == null) {
            synchronized (C1106p.class) {
                try {
                    c1106p = map.get(str);
                    if (c1106p == null) {
                        c1106p = new C1106p(rVar, c1104n);
                        map.put(str, c1106p);
                    }
                } finally {
                }
            }
        }
        return c1106p;
    }

    public void A(@androidx.annotation.N String str, Parcelable parcelable) {
        B(str, parcelable, -1);
    }

    public void B(@androidx.annotation.N String str, Parcelable parcelable, int i4) {
        this.f25101e.i(str, parcelable, i4);
        this.f25102f.F(str, parcelable, i4);
    }

    public void C(@androidx.annotation.N String str, Serializable serializable) {
        D(str, serializable, -1);
    }

    public void D(@androidx.annotation.N String str, Serializable serializable, int i4) {
        this.f25101e.i(str, serializable, i4);
        this.f25102f.H(str, serializable, i4);
    }

    public void E(@androidx.annotation.N String str, String str2) {
        F(str, str2, -1);
    }

    public void F(@androidx.annotation.N String str, String str2, int i4) {
        this.f25101e.i(str, str2, i4);
        this.f25102f.J(str, str2, i4);
    }

    public void G(@androidx.annotation.N String str, JSONArray jSONArray) {
        H(str, jSONArray, -1);
    }

    public void H(@androidx.annotation.N String str, JSONArray jSONArray, int i4) {
        this.f25101e.i(str, jSONArray, i4);
        this.f25102f.L(str, jSONArray, i4);
    }

    public void I(@androidx.annotation.N String str, JSONObject jSONObject) {
        J(str, jSONObject, -1);
    }

    public void J(@androidx.annotation.N String str, JSONObject jSONObject, int i4) {
        this.f25101e.i(str, jSONObject, i4);
        this.f25102f.N(str, jSONObject, i4);
    }

    public void K(@androidx.annotation.N String str, byte[] bArr) {
        L(str, bArr, -1);
    }

    public void L(@androidx.annotation.N String str, byte[] bArr, int i4) {
        this.f25101e.i(str, bArr, i4);
        this.f25102f.P(str, bArr, i4);
    }

    public void M(@androidx.annotation.N String str) {
        this.f25101e.j(str);
        this.f25102f.T(str);
    }

    public void a() {
        this.f25101e.a();
        this.f25102f.a();
    }

    public Bitmap b(@androidx.annotation.N String str) {
        return c(str, null);
    }

    public Bitmap c(@androidx.annotation.N String str, Bitmap bitmap) {
        Bitmap bitmap2 = (Bitmap) this.f25101e.b(str);
        if (bitmap2 != null) {
            return bitmap2;
        }
        Bitmap b4 = this.f25102f.b(str);
        if (b4 != null) {
            this.f25101e.h(str, b4);
            return b4;
        }
        return bitmap;
    }

    public byte[] d(@androidx.annotation.N String str) {
        return e(str, null);
    }

    public byte[] e(@androidx.annotation.N String str, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.f25101e.b(str);
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] d4 = this.f25102f.d(str);
        if (d4 != null) {
            this.f25101e.h(str, d4);
            return d4;
        }
        return bArr;
    }

    public int f() {
        return this.f25102f.f();
    }

    public long g() {
        return this.f25102f.g();
    }

    public int h() {
        return this.f25101e.d();
    }

    public Drawable i(@androidx.annotation.N String str) {
        return j(str, null);
    }

    public Drawable j(@androidx.annotation.N String str, Drawable drawable) {
        Drawable drawable2 = (Drawable) this.f25101e.b(str);
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable i4 = this.f25102f.i(str);
        if (i4 != null) {
            this.f25101e.h(str, i4);
            return i4;
        }
        return drawable;
    }

    public JSONArray m(@androidx.annotation.N String str) {
        return n(str, null);
    }

    public JSONArray n(@androidx.annotation.N String str, JSONArray jSONArray) {
        JSONArray jSONArray2 = (JSONArray) this.f25101e.b(str);
        if (jSONArray2 != null) {
            return jSONArray2;
        }
        JSONArray q4 = this.f25102f.q(str);
        if (q4 != null) {
            this.f25101e.h(str, q4);
            return q4;
        }
        return jSONArray;
    }

    public JSONObject o(@androidx.annotation.N String str) {
        return p(str, null);
    }

    public JSONObject p(@androidx.annotation.N String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = (JSONObject) this.f25101e.b(str);
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        JSONObject s4 = this.f25102f.s(str);
        if (s4 != null) {
            this.f25101e.h(str, s4);
            return s4;
        }
        return jSONObject;
    }

    public <T> T q(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator) {
        return (T) r(str, creator, null);
    }

    public <T> T r(@androidx.annotation.N String str, @androidx.annotation.N Parcelable.Creator<T> creator, T t3) {
        T t4 = (T) this.f25101e.b(str);
        if (t4 != null) {
            return t4;
        }
        T t5 = (T) this.f25102f.u(str, creator);
        if (t5 != null) {
            this.f25101e.h(str, t5);
            return t5;
        }
        return t3;
    }

    public Object s(@androidx.annotation.N String str) {
        return t(str, null);
    }

    public Object t(@androidx.annotation.N String str, Object obj) {
        Object b4 = this.f25101e.b(str);
        if (b4 != null) {
            return b4;
        }
        Object w3 = this.f25102f.w(str);
        if (w3 != null) {
            this.f25101e.h(str, w3);
            return w3;
        }
        return obj;
    }

    public String u(@androidx.annotation.N String str) {
        return v(str, null);
    }

    public String v(@androidx.annotation.N String str, String str2) {
        String str3 = (String) this.f25101e.b(str);
        if (str3 != null) {
            return str3;
        }
        String y3 = this.f25102f.y(str);
        if (y3 != null) {
            this.f25101e.h(str, y3);
            return y3;
        }
        return str2;
    }

    public void w(@androidx.annotation.N String str, Bitmap bitmap) {
        x(str, bitmap, -1);
    }

    public void x(@androidx.annotation.N String str, Bitmap bitmap, int i4) {
        this.f25101e.i(str, bitmap, i4);
        this.f25102f.B(str, bitmap, i4);
    }

    public void y(@androidx.annotation.N String str, Drawable drawable) {
        z(str, drawable, -1);
    }

    public void z(@androidx.annotation.N String str, Drawable drawable, int i4) {
        this.f25101e.i(str, drawable, i4);
        this.f25102f.D(str, drawable, i4);
    }
}
