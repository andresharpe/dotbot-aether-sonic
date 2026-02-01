package com.google.android.datatransport.cct;

import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.datatransport.runtime.h;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: c, reason: collision with root package name */
    static final String f27172c = "cct";

    /* renamed from: d, reason: collision with root package name */
    static final String f27173d;

    /* renamed from: e, reason: collision with root package name */
    static final String f27174e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f27175f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f27176g = "1$";

    /* renamed from: h, reason: collision with root package name */
    private static final String f27177h = "\\";

    /* renamed from: i, reason: collision with root package name */
    private static final Set<com.google.android.datatransport.c> f27178i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f27179j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f27180k;

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f27181a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f27182b;

    static {
        String a4 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f27173d = a4;
        String a5 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f27174e = a5;
        String a6 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f27175f = a6;
        f27178i = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.c.b("proto"), com.google.android.datatransport.c.b("json"))));
        f27179j = new a(a4, null);
        f27180k = new a(a5, a6);
    }

    public a(@N String str, @P String str2) {
        this.f27181a = str;
        this.f27182b = str2;
    }

    @N
    static String c(@N byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    @N
    static byte[] d(@N String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    @N
    public static a e(@N byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith(f27176g)) {
            String[] split = str.substring(2).split(Pattern.quote(f27177h), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // com.google.android.datatransport.runtime.h
    public Set<com.google.android.datatransport.c> a() {
        return f27178i;
    }

    @P
    public byte[] b() {
        String str = this.f27182b;
        if (str == null && this.f27181a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = f27176g;
        objArr[1] = this.f27181a;
        objArr[2] = f27177h;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @P
    public String f() {
        return this.f27182b;
    }

    @N
    public String g() {
        return this.f27181a;
    }

    @Override // com.google.android.datatransport.runtime.g
    @P
    public byte[] getExtras() {
        return b();
    }

    @Override // com.google.android.datatransport.runtime.g
    @N
    public String getName() {
        return f27172c;
    }
}
