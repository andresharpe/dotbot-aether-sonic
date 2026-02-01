package org.junit.runner;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends org.junit.validator.a {
    @Override // org.junit.validator.a
    public List<Exception> a(org.junit.runners.model.j jVar) {
        if (jVar.a(org.junit.h.class) != null) {
            return Collections.singletonList(new Exception("@FixMethodOrder cannot be combined with @OrderWith"));
        }
        return Collections.emptyList();
    }
}
