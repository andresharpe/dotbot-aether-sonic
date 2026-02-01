package S1;

import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d
    private String f1739a;

    /* renamed from: b, reason: collision with root package name */
    @d
    private String f1740b;

    /* renamed from: c, reason: collision with root package name */
    @d
    private String f1741c;

    /* renamed from: d, reason: collision with root package name */
    @d
    private String f1742d;

    public b(@d String name, @d String version, @d String url, @d String file) {
        F.p(name, "name");
        F.p(version, "version");
        F.p(url, "url");
        F.p(file, "file");
        this.f1739a = name;
        this.f1740b = version;
        this.f1741c = url;
        this.f1742d = file;
    }

    public static /* synthetic */ b f(b bVar, String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = bVar.f1739a;
        }
        if ((i4 & 2) != 0) {
            str2 = bVar.f1740b;
        }
        if ((i4 & 4) != 0) {
            str3 = bVar.f1741c;
        }
        if ((i4 & 8) != 0) {
            str4 = bVar.f1742d;
        }
        return bVar.e(str, str2, str3, str4);
    }

    @d
    public final String a() {
        return this.f1739a;
    }

    @d
    public final String b() {
        return this.f1740b;
    }

    @d
    public final String c() {
        return this.f1741c;
    }

    @d
    public final String d() {
        return this.f1742d;
    }

    @d
    public final b e(@d String name, @d String version, @d String url, @d String file) {
        F.p(name, "name");
        F.p(version, "version");
        F.p(url, "url");
        F.p(file, "file");
        return new b(name, version, url, file);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (F.g(this.f1739a, bVar.f1739a) && F.g(this.f1740b, bVar.f1740b) && F.g(this.f1741c, bVar.f1741c) && F.g(this.f1742d, bVar.f1742d)) {
            return true;
        }
        return false;
    }

    @d
    public final String g() {
        return this.f1742d;
    }

    @d
    public final String h() {
        return this.f1739a;
    }

    public int hashCode() {
        return (((((this.f1739a.hashCode() * 31) + this.f1740b.hashCode()) * 31) + this.f1741c.hashCode()) * 31) + this.f1742d.hashCode();
    }

    @d
    public final String i() {
        return this.f1741c;
    }

    @d
    public final String j() {
        return this.f1740b;
    }

    public final void k(@d String str) {
        F.p(str, "<set-?>");
        this.f1742d = str;
    }

    public final void l(@d String str) {
        F.p(str, "<set-?>");
        this.f1739a = str;
    }

    public final void m(@d String str) {
        F.p(str, "<set-?>");
        this.f1741c = str;
    }

    public final void n(@d String str) {
        F.p(str, "<set-?>");
        this.f1740b = str;
    }

    @d
    public String toString() {
        return "XmlData(name=" + this.f1739a + ", version=" + this.f1740b + ", url=" + this.f1741c + ", file=" + this.f1742d + ")";
    }
}
