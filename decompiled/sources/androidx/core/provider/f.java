package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.InterfaceC0562e;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.core.util.u;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f12766a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12767b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12768c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f12769d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12770e;

    /* renamed from: f, reason: collision with root package name */
    private final String f12771f;

    public f(@N String str, @N String str2, @N String str3, @N List<List<byte[]>> list) {
        this.f12766a = (String) u.l(str);
        this.f12767b = (String) u.l(str2);
        this.f12768c = (String) u.l(str3);
        this.f12769d = (List) u.l(list);
        this.f12770e = 0;
        this.f12771f = a(str, str2, str3);
    }

    private String a(@N String str, @N String str2, @N String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    @P
    public List<List<byte[]>> b() {
        return this.f12769d;
    }

    @InterfaceC0562e
    public int c() {
        return this.f12770e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String d() {
        return this.f12771f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String e() {
        return this.f12771f;
    }

    @N
    public String f() {
        return this.f12766a;
    }

    @N
    public String g() {
        return this.f12767b;
    }

    @N
    public String h() {
        return this.f12768c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f12766a + ", mProviderPackage: " + this.f12767b + ", mQuery: " + this.f12768c + ", mCertificates:");
        for (int i4 = 0; i4 < this.f12769d.size(); i4++) {
            sb.append(" [");
            List<byte[]> list = this.f12769d.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f12770e);
        return sb.toString();
    }

    public f(@N String str, @N String str2, @N String str3, @InterfaceC0562e int i4) {
        this.f12766a = (String) u.l(str);
        this.f12767b = (String) u.l(str2);
        this.f12768c = (String) u.l(str3);
        this.f12769d = null;
        u.a(i4 != 0);
        this.f12770e = i4;
        this.f12771f = a(str, str2, str3);
    }
}
