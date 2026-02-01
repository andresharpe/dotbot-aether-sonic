package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f7738b = new g();

    /* renamed from: a, reason: collision with root package name */
    private HashMap<String, h> f7739a = new HashMap<>();

    public static g c() {
        return f7738b;
    }

    public String a(String str) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            return hVar.b();
        }
        return null;
    }

    public String b(String str) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            return hVar.g();
        }
        return null;
    }

    public long d(String str) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            return hVar.h();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.f7739a.keySet();
    }

    public void f(String str, h hVar) {
        this.f7739a.put(str, hVar);
    }

    public void g(String str, int i4) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            hVar.c(i4);
        }
    }

    public void h(String str, int i4) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            hVar.d(i4);
        }
    }

    public void i(String str, h hVar) {
        this.f7739a.remove(str);
    }

    public void j(String str, String str2) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            hVar.a(str2);
        }
    }

    public void k(String str, int i4, int i5) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            hVar.f(i4, i5);
        }
    }

    public void l(String str, float f4) {
        h hVar = this.f7739a.get(str);
        if (hVar != null) {
            hVar.e(f4);
        }
    }
}
