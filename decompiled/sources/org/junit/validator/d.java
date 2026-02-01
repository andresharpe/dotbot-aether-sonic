package org.junit.validator;

import java.util.Collections;
import java.util.List;
import org.junit.runners.model.j;

/* loaded from: classes2.dex */
public class d implements e {

    /* renamed from: a, reason: collision with root package name */
    private static final List<Exception> f55864a = Collections.emptyList();

    @Override // org.junit.validator.e
    public List<Exception> a(j jVar) {
        if (jVar.t()) {
            return f55864a;
        }
        return Collections.singletonList(new Exception("The class " + jVar.o() + " is not public."));
    }
}
