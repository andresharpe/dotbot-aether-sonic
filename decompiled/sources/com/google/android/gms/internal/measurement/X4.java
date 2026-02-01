package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class X4 {

    /* renamed from: c, reason: collision with root package name */
    private static final X4 f29556c = new X4();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f29558b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1361b5 f29557a = new I4();

    private X4() {
    }

    public static X4 a() {
        return f29556c;
    }

    public final InterfaceC1353a5 b(Class cls) {
        C1503t4.f(cls, "messageType");
        InterfaceC1353a5 interfaceC1353a5 = (InterfaceC1353a5) this.f29558b.get(cls);
        if (interfaceC1353a5 == null) {
            interfaceC1353a5 = this.f29557a.zza(cls);
            C1503t4.f(cls, "messageType");
            C1503t4.f(interfaceC1353a5, "schema");
            InterfaceC1353a5 interfaceC1353a52 = (InterfaceC1353a5) this.f29558b.putIfAbsent(cls, interfaceC1353a5);
            if (interfaceC1353a52 != null) {
                return interfaceC1353a52;
            }
        }
        return interfaceC1353a5;
    }
}
