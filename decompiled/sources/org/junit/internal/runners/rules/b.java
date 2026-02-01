package org.junit.internal.runners.rules;

import java.lang.annotation.Annotation;
import org.junit.runners.model.c;

/* loaded from: classes2.dex */
class b extends Exception {

    /* renamed from: E, reason: collision with root package name */
    private static final long f55639E = 3176511008672645574L;

    public b(c<?> cVar, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", cls.getSimpleName(), cVar.d(), str));
    }
}
