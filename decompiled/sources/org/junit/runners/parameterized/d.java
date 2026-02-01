package org.junit.runners.parameterized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.runners.model.j;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f55857a;

    /* renamed from: b, reason: collision with root package name */
    private final j f55858b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Object> f55859c;

    public d(String str, j jVar, List<Object> list) {
        org.junit.internal.a.b(str, "The name is missing.");
        org.junit.internal.a.b(jVar, "The test class is missing.");
        org.junit.internal.a.b(list, "The parameters are missing.");
        this.f55857a = str;
        this.f55858b = jVar;
        this.f55859c = Collections.unmodifiableList(new ArrayList(list));
    }

    public String a() {
        return this.f55857a;
    }

    public List<Object> b() {
        return this.f55859c;
    }

    public j c() {
        return this.f55858b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f55857a.equals(dVar.f55857a) && this.f55859c.equals(dVar.f55859c) && this.f55858b.equals(dVar.f55858b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f55857a.hashCode() + 14747) * 14747) + this.f55858b.hashCode()) * 14747) + this.f55859c.hashCode();
    }

    public String toString() {
        return this.f55858b.o() + " '" + this.f55857a + "' with parameters " + this.f55859c;
    }
}
