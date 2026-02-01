package org.junit.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class g implements l {

    /* renamed from: b, reason: collision with root package name */
    private static final g f55675b = new g(Collections.emptyList());

    /* renamed from: a, reason: collision with root package name */
    private List<l> f55676a;

    private g(List<l> list) {
        this.f55676a = list;
    }

    public static g c() {
        return f55675b;
    }

    public static g d(l lVar) {
        return c().b(lVar);
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        return new h(iVar, this.f55676a, description);
    }

    public g b(l lVar) {
        if (lVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(lVar);
            arrayList.addAll(this.f55676a);
            return new g(arrayList);
        }
        throw new NullPointerException("The enclosed rule must not be null");
    }
}
