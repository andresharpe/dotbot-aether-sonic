package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w1.InterfaceC2431a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f27464c = new a().b();

    /* renamed from: a, reason: collision with root package name */
    private final String f27465a;

    /* renamed from: b, reason: collision with root package name */
    private final List<LogEventDropped> f27466b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f27467a = "";

        /* renamed from: b, reason: collision with root package name */
        private List<LogEventDropped> f27468b = new ArrayList();

        a() {
        }

        public a a(LogEventDropped logEventDropped) {
            this.f27468b.add(logEventDropped);
            return this;
        }

        public c b() {
            return new c(this.f27467a, Collections.unmodifiableList(this.f27468b));
        }

        public a c(List<LogEventDropped> list) {
            this.f27468b = list;
            return this;
        }

        public a d(String str) {
            this.f27467a = str;
            return this;
        }
    }

    c(String str, List<LogEventDropped> list) {
        this.f27465a = str;
        this.f27466b = list;
    }

    public static c a() {
        return f27464c;
    }

    public static a d() {
        return new a();
    }

    @InterfaceC2431a.InterfaceC0549a(name = "logEventDropped")
    @Protobuf(tag = 2)
    public List<LogEventDropped> b() {
        return this.f27466b;
    }

    @Protobuf(tag = 1)
    public String c() {
        return this.f27465a;
    }
}
