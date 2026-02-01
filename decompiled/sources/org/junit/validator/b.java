package org.junit.validator;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<f, a> f55861a = new ConcurrentHashMap<>();

    public a a(f fVar) {
        ConcurrentHashMap<f, a> concurrentHashMap = f55861a;
        a aVar = concurrentHashMap.get(fVar);
        if (aVar != null) {
            return aVar;
        }
        Class<? extends a> value = fVar.value();
        try {
            concurrentHashMap.putIfAbsent(fVar, value.newInstance());
            return concurrentHashMap.get(fVar);
        } catch (Exception e4) {
            throw new RuntimeException("Exception received when creating AnnotationValidator class " + value.getName(), e4);
        }
    }
}
