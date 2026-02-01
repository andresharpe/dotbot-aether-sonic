package com.spotify.protocol.client;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static b f48873a = d.f48876a;

    /* renamed from: b, reason: collision with root package name */
    private static a f48874b = c.f48875a;

    /* loaded from: classes2.dex */
    public interface a {
        void b(boolean expression, String message);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(String format, Object... args);

        void c(Throwable e4, String format, Object... args);

        void d(String format, Object... args);

        void e(Throwable e4, String format, Object... args);
    }

    /* loaded from: classes2.dex */
    private static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f48875a = new c();

        private c() {
        }

        @Override // com.spotify.protocol.client.f.a
        public void b(boolean expression, String message) {
        }
    }

    /* loaded from: classes2.dex */
    private static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f48876a = new d();

        private d() {
        }

        @Override // com.spotify.protocol.client.f.b
        public void a(String format, Object... args) {
        }

        @Override // com.spotify.protocol.client.f.b
        public void c(Throwable e4, String format, Object... args) {
        }

        @Override // com.spotify.protocol.client.f.b
        public void d(String format, Object... args) {
        }

        @Override // com.spotify.protocol.client.f.b
        public void e(Throwable e4, String format, Object... args) {
        }
    }

    private f() {
    }

    public static void a(boolean expression, String message) {
        f48874b.b(expression, message);
    }

    public static void b(String format, Object... args) {
        f48873a.a(format, args);
    }

    public static void c(Throwable e4, String format, Object... args) {
        f48873a.c(e4, format, args);
    }

    public static void d(String format, Object... args) {
        f48873a.d(format, args);
    }

    public static void e(Throwable e4, String format, Object... args) {
        f48873a.e(e4, format, args);
    }

    public static void f(a assertion) {
        if (assertion == null) {
            assertion = c.f48875a;
        }
        f48874b = assertion;
    }

    public static void g(b logger) {
        if (logger == null) {
            logger = d.f48876a;
        }
        f48873a = logger;
    }
}
