package com.google.android.gms.common.images;

import K0.c;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1275t;
import com.google.android.gms.common.internal.C1281w;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@c.a(creator = "WebImageCreator")
/* loaded from: classes.dex */
public final class b extends K0.a {

    @N
    public static final Parcelable.Creator<b> CREATOR = new j();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f28574E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getUrl", id = 2)
    private final Uri f28575F;

    /* renamed from: G, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getWidth", id = 3)
    private final int f28576G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getHeight", id = 4)
    private final int f28577H;

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public b(@c.e(id = 1) int i4, @c.e(id = 2) Uri uri, @c.e(id = 3) int i5, @c.e(id = 4) int i6) {
        this.f28574E = i4;
        this.f28575F = uri;
        this.f28576G = i5;
        this.f28577H = i6;
    }

    public int c0() {
        return this.f28577H;
    }

    @N
    public Uri e0() {
        return this.f28575F;
    }

    public boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (C1281w.b(this.f28575F, bVar.f28575F) && this.f28576G == bVar.f28576G && this.f28577H == bVar.f28577H) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C1281w.c(this.f28575F, Integer.valueOf(this.f28576G), Integer.valueOf(this.f28577H));
    }

    public int i0() {
        return this.f28576G;
    }

    @N
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", Integer.valueOf(this.f28576G), Integer.valueOf(this.f28577H), this.f28575F.toString());
    }

    @I0.a
    @N
    public JSONObject u0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C1275t.f28813a, this.f28575F.toString());
            jSONObject.put("width", this.f28576G);
            jSONObject.put("height", this.f28577H);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f28574E);
        K0.b.S(parcel, 2, e0(), i4, false);
        K0.b.F(parcel, 3, i0());
        K0.b.F(parcel, 4, c0());
        K0.b.b(parcel, a4);
    }

    public b(@N Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public b(@N Uri uri, int i4, int i5) throws IllegalArgumentException {
        this(1, uri, i4, i5);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @I0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@androidx.annotation.N org.json.JSONObject r5) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.b.<init>(org.json.JSONObject):void");
    }
}
