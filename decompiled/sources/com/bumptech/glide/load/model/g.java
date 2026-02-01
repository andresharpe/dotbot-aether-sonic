package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class g implements com.bumptech.glide.load.c {

    /* renamed from: j, reason: collision with root package name */
    private static final String f26295j = "@#&=*+-_.,:!?()/~'%;$";

    /* renamed from: c, reason: collision with root package name */
    private final h f26296c;

    /* renamed from: d, reason: collision with root package name */
    @P
    private final URL f26297d;

    /* renamed from: e, reason: collision with root package name */
    @P
    private final String f26298e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private String f26299f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private URL f26300g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private volatile byte[] f26301h;

    /* renamed from: i, reason: collision with root package name */
    private int f26302i;

    public g(URL url) {
        this(url, h.f26304b);
    }

    private byte[] d() {
        if (this.f26301h == null) {
            this.f26301h = c().getBytes(com.bumptech.glide.load.c.f25784b);
        }
        return this.f26301h;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f26299f)) {
            String str = this.f26298e;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) com.bumptech.glide.util.l.d(this.f26297d)).toString();
            }
            this.f26299f = Uri.encode(str, f26295j);
        }
        return this.f26299f;
    }

    private URL g() throws MalformedURLException {
        if (this.f26300g == null) {
            this.f26300g = new URL(f());
        }
        return this.f26300g;
    }

    @Override // com.bumptech.glide.load.c
    public void a(@N MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f26298e;
        if (str == null) {
            return ((URL) com.bumptech.glide.util.l.d(this.f26297d)).toString();
        }
        return str;
    }

    public Map<String, String> e() {
        return this.f26296c.a();
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!c().equals(gVar.c()) || !this.f26296c.equals(gVar.f26296c)) {
            return false;
        }
        return true;
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
        if (this.f26302i == 0) {
            int hashCode = c().hashCode();
            this.f26302i = hashCode;
            this.f26302i = (hashCode * 31) + this.f26296c.hashCode();
        }
        return this.f26302i;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public g(String str) {
        this(str, h.f26304b);
    }

    public g(URL url, h hVar) {
        this.f26297d = (URL) com.bumptech.glide.util.l.d(url);
        this.f26298e = null;
        this.f26296c = (h) com.bumptech.glide.util.l.d(hVar);
    }

    public g(String str, h hVar) {
        this.f26297d = null;
        this.f26298e = com.bumptech.glide.util.l.b(str);
        this.f26296c = (h) com.bumptech.glide.util.l.d(hVar);
    }
}
