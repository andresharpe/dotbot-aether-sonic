package androidx.navigation;

import androidx.navigation.C0947y;

@A
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final C0947y.a f16266a = new C0947y.a();

    /* renamed from: b, reason: collision with root package name */
    @l3.e
    private String f16267b;

    /* renamed from: c, reason: collision with root package name */
    @l3.e
    private String f16268c;

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private String f16269d;

    @l3.d
    public final C0947y a() {
        C0947y.a aVar = this.f16266a;
        if (d() == null && b() == null && c() == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
        }
        String d4 = d();
        if (d4 != null) {
            aVar.g(d4);
        }
        String b4 = b();
        if (b4 != null) {
            aVar.e(b4);
        }
        String c4 = c();
        if (c4 != null) {
            aVar.f(c4);
        }
        return aVar.a();
    }

    @l3.e
    public final String b() {
        return this.f16268c;
    }

    @l3.e
    public final String c() {
        return this.f16269d;
    }

    @l3.e
    public final String d() {
        return this.f16267b;
    }

    public final void e(@l3.e String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.f16268c = str;
    }

    public final void f(@l3.e String str) {
        this.f16269d = str;
    }

    public final void g(@l3.e String str) {
        this.f16267b = str;
    }
}
