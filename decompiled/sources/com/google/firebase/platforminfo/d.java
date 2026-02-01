package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f37351b;

    /* renamed from: a, reason: collision with root package name */
    private final Set<f> f37352a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f37351b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f37351b;
                    if (dVar == null) {
                        dVar = new d();
                        f37351b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f37352a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f37352a);
        }
        return unmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.f37352a) {
            this.f37352a.add(f.a(str, str2));
        }
    }
}
