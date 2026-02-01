package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class X3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f29551b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile X3 f29552c;

    /* renamed from: d, reason: collision with root package name */
    static final X3 f29553d = new X3(true);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f29554e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Map f29555a;

    X3() {
        this.f29555a = new HashMap();
    }

    public static X3 a() {
        X3 x3 = f29552c;
        if (x3 != null) {
            return x3;
        }
        synchronized (X3.class) {
            try {
                X3 x32 = f29552c;
                if (x32 != null) {
                    return x32;
                }
                X3 b4 = AbstractC1384e4.b(X3.class);
                f29552c = b4;
                return b4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1424j4 b(P4 p4, int i4) {
        return (C1424j4) this.f29555a.get(new W3(p4, i4));
    }

    X3(boolean z3) {
        this.f29555a = Collections.emptyMap();
    }
}
