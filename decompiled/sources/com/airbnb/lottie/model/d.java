package com.airbnb.lottie.model;

import androidx.annotation.InterfaceC0567j;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f21696c = new d("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f21697a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private e f21698b;

    public d(String... strArr) {
        this.f21697a = Arrays.asList(strArr);
    }

    private boolean b() {
        return this.f21697a.get(r0.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    @InterfaceC0567j
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d a(String str) {
        d dVar = new d(this);
        dVar.f21697a.add(str);
        return dVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i4) {
        boolean z3;
        boolean z4;
        if (i4 >= this.f21697a.size()) {
            return false;
        }
        if (i4 == this.f21697a.size() - 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str2 = this.f21697a.get(i4);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((!z3 && (i4 != this.f21697a.size() - 2 || !b())) || !z4) {
                return false;
            }
            return true;
        }
        if (!z3 && this.f21697a.get(i4 + 1).equals(str)) {
            if (i4 != this.f21697a.size() - 2 && (i4 != this.f21697a.size() - 3 || !b())) {
                return false;
            }
            return true;
        }
        if (z3) {
            return true;
        }
        int i5 = i4 + 1;
        if (i5 < this.f21697a.size() - 1) {
            return false;
        }
        return this.f21697a.get(i5).equals(str);
    }

    @P
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e d() {
        return this.f21698b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i4) {
        if (f(str)) {
            return 0;
        }
        if (!this.f21697a.get(i4).equals("**")) {
            return 1;
        }
        if (i4 == this.f21697a.size() - 1 || !this.f21697a.get(i4 + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public String g() {
        return this.f21697a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h(String str, int i4) {
        if (f(str)) {
            return true;
        }
        if (i4 >= this.f21697a.size()) {
            return false;
        }
        if (this.f21697a.get(i4).equals(str) || this.f21697a.get(i4).equals("**") || this.f21697a.get(i4).equals("*")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean i(String str, int i4) {
        if ("__container".equals(str) || i4 < this.f21697a.size() - 1 || this.f21697a.get(i4).equals("**")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d j(e eVar) {
        d dVar = new d(this);
        dVar.f21698b = eVar;
        return dVar;
    }

    public String toString() {
        boolean z3;
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f21697a);
        sb.append(",resolved=");
        if (this.f21698b != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sb.append(z3);
        sb.append('}');
        return sb.toString();
    }

    private d(d dVar) {
        this.f21697a = new ArrayList(dVar.f21697a);
        this.f21698b = dVar.f21698b;
    }
}
