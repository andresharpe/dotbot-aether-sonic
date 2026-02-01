package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0205b f23917a;

    /* renamed from: b, reason: collision with root package name */
    private final a f23918b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23919c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23920d;

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23921a = new C0204a();

        /* renamed from: com.amazonaws.retry.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static class C0204a implements a {
            C0204a() {
            }

            @Override // com.amazonaws.retry.b.a
            public long a(com.amazonaws.b bVar, AmazonClientException amazonClientException, int i4) {
                return 0L;
            }
        }

        long a(com.amazonaws.b bVar, AmazonClientException amazonClientException, int i4);
    }

    /* renamed from: com.amazonaws.retry.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0205b {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC0205b f23922a = new a();

        /* renamed from: com.amazonaws.retry.b$b$a */
        /* loaded from: classes.dex */
        static class a implements InterfaceC0205b {
            a() {
            }

            @Override // com.amazonaws.retry.b.InterfaceC0205b
            public boolean a(com.amazonaws.b bVar, AmazonClientException amazonClientException, int i4) {
                return false;
            }
        }

        boolean a(com.amazonaws.b bVar, AmazonClientException amazonClientException, int i4);
    }

    public b(InterfaceC0205b interfaceC0205b, a aVar, int i4, boolean z3) {
        interfaceC0205b = interfaceC0205b == null ? com.amazonaws.retry.a.f23912h : interfaceC0205b;
        aVar = aVar == null ? com.amazonaws.retry.a.f23913i : aVar;
        if (i4 >= 0) {
            this.f23917a = interfaceC0205b;
            this.f23918b = aVar;
            this.f23919c = i4;
            this.f23920d = z3;
            return;
        }
        throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
    }

    public a a() {
        return this.f23918b;
    }

    public int b() {
        return this.f23919c;
    }

    public InterfaceC0205b c() {
        return this.f23917a;
    }

    public boolean d() {
        return this.f23920d;
    }
}
