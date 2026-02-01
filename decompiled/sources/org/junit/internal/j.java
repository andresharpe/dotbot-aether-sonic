package org.junit.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
class j implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private final String f55564E;

    private j(Object obj) {
        this.f55564E = String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj) {
        if (obj != null && !(obj instanceof Serializable)) {
            return new j(obj);
        }
        return obj;
    }

    public String toString() {
        return this.f55564E;
    }
}
