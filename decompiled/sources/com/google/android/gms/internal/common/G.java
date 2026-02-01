package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final x f29136a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f29137b;

    /* renamed from: c, reason: collision with root package name */
    private final D f29138c;

    private G(D d4, boolean z3, x xVar, int i4, byte[] bArr) {
        this.f29138c = d4;
        this.f29137b = z3;
        this.f29136a = xVar;
    }

    public static G c(x xVar) {
        return new G(new D(xVar), false, w.f29161b, Integer.MAX_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator h(CharSequence charSequence) {
        return new C(this.f29138c, this, charSequence);
    }

    public final G b() {
        return new G(this.f29138c, true, this.f29136a, Integer.MAX_VALUE, null);
    }

    public final Iterable d(CharSequence charSequence) {
        return new E(this, charSequence);
    }

    public final List f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator h4 = h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h4.hasNext()) {
            arrayList.add((String) h4.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
