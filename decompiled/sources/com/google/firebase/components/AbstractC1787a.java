package com.google.firebase.components;

import java.util.Set;

/* renamed from: com.google.firebase.components.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1787a implements g {
    @Override // com.google.firebase.components.g
    public <T> T a(Class<T> cls) {
        C1.b<T> b4 = b(cls);
        if (b4 == null) {
            return null;
        }
        return b4.get();
    }

    @Override // com.google.firebase.components.g
    public <T> Set<T> e(Class<T> cls) {
        return d(cls).get();
    }
}
