package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C1281w;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class d0 {

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.i0
    static final String f36894d = "!";

    /* renamed from: e, reason: collision with root package name */
    private static final String f36895e = "/topics/";

    /* renamed from: f, reason: collision with root package name */
    private static final String f36896f = "[a-zA-Z0-9-_.~%]{1,900}";

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f36897g = Pattern.compile(f36896f);

    /* renamed from: a, reason: collision with root package name */
    private final String f36898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f36899b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36900c;

    private d0(String str, String str2) {
        this.f36898a = d(str2, str);
        this.f36899b = str;
        this.f36900c = str + f36894d + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.P
    public static d0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(f36894d, -1);
        if (split.length != 2) {
            return null;
        }
        return new d0(split[0], split[1]);
    }

    @androidx.annotation.N
    private static String d(String str, String str2) {
        if (str != null && str.startsWith(f36895e)) {
            Log.w(C1821f.f36920a, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f36897g.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, f36896f));
    }

    public static d0 f(@androidx.annotation.N String str) {
        return new d0(androidx.exifinterface.media.a.T4, str);
    }

    public static d0 g(@androidx.annotation.N String str) {
        return new d0("U", str);
    }

    public String b() {
        return this.f36899b;
    }

    public String c() {
        return this.f36898a;
    }

    public String e() {
        return this.f36900c;
    }

    public boolean equals(@androidx.annotation.P Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.f36898a.equals(d0Var.f36898a) || !this.f36899b.equals(d0Var.f36899b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C1281w.c(this.f36899b, this.f36898a);
    }
}
