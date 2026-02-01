package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.m;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w1.InterfaceC2431a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static final a f27452e = new C0257a().b();

    /* renamed from: a, reason: collision with root package name */
    private final e f27453a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f27454b;

    /* renamed from: c, reason: collision with root package name */
    private final b f27455c;

    /* renamed from: d, reason: collision with root package name */
    private final String f27456d;

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0257a {

        /* renamed from: a, reason: collision with root package name */
        private e f27457a = null;

        /* renamed from: b, reason: collision with root package name */
        private List<c> f27458b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private b f27459c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f27460d = "";

        C0257a() {
        }

        public C0257a a(c cVar) {
            this.f27458b.add(cVar);
            return this;
        }

        public a b() {
            return new a(this.f27457a, Collections.unmodifiableList(this.f27458b), this.f27459c, this.f27460d);
        }

        public C0257a c(String str) {
            this.f27460d = str;
            return this;
        }

        public C0257a d(b bVar) {
            this.f27459c = bVar;
            return this;
        }

        public C0257a e(List<c> list) {
            this.f27458b = list;
            return this;
        }

        public C0257a f(e eVar) {
            this.f27457a = eVar;
            return this;
        }
    }

    a(e eVar, List<c> list, b bVar, String str) {
        this.f27453a = eVar;
        this.f27454b = list;
        this.f27455c = bVar;
        this.f27456d = str;
    }

    public static a b() {
        return f27452e;
    }

    public static C0257a h() {
        return new C0257a();
    }

    @Protobuf(tag = 4)
    public String a() {
        return this.f27456d;
    }

    @InterfaceC2431a.b
    public b c() {
        b bVar = this.f27455c;
        if (bVar == null) {
            return b.a();
        }
        return bVar;
    }

    @InterfaceC2431a.InterfaceC0549a(name = "globalMetrics")
    @Protobuf(tag = 3)
    public b d() {
        return this.f27455c;
    }

    @InterfaceC2431a.InterfaceC0549a(name = "logSourceMetrics")
    @Protobuf(tag = 2)
    public List<c> e() {
        return this.f27454b;
    }

    @InterfaceC2431a.b
    public e f() {
        e eVar = this.f27453a;
        if (eVar == null) {
            return e.a();
        }
        return eVar;
    }

    @InterfaceC2431a.InterfaceC0549a(name = "window")
    @Protobuf(tag = 1)
    public e g() {
        return this.f27453a;
    }

    public byte[] i() {
        return m.b(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        m.a(this, outputStream);
    }
}
