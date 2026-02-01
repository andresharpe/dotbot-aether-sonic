package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;
import w1.InterfaceC2431a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f27461b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final d f27462a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private d f27463a = null;

        a() {
        }

        public b a() {
            return new b(this.f27463a);
        }

        public a b(d dVar) {
            this.f27463a = dVar;
            return this;
        }
    }

    b(d dVar) {
        this.f27462a = dVar;
    }

    public static b a() {
        return f27461b;
    }

    public static a d() {
        return new a();
    }

    @InterfaceC2431a.b
    public d b() {
        d dVar = this.f27462a;
        if (dVar == null) {
            return d.b();
        }
        return dVar;
    }

    @InterfaceC2431a.InterfaceC0549a(name = "storageMetrics")
    @Protobuf(tag = 1)
    public d c() {
        return this.f27462a;
    }
}
