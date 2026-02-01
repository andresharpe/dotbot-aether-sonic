package org.junit.runners.model;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public interface a {
    <T extends Annotation> T a(Class<T> cls);

    Annotation[] i();
}
