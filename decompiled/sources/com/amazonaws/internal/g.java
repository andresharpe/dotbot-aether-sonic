package com.amazonaws.internal;

import m0.InterfaceC2357a;

/* loaded from: classes.dex */
public abstract class g<R> {

    /* renamed from: a, reason: collision with root package name */
    private final String f23753a;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC2357a f23754E;

        a(InterfaceC2357a interfaceC2357a) {
            this.f23754E = interfaceC2357a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23754E.onResult(g.this.d());
            } catch (Exception e4) {
                if (g.this.f23753a == null) {
                    this.f23754E.a(e4);
                } else {
                    this.f23754E.a(new Exception(g.this.f23753a, e4));
                }
            }
        }
    }

    public g() {
        this.f23753a = null;
    }

    public void b(InterfaceC2357a<R> interfaceC2357a) {
        new Thread(new a(interfaceC2357a)).start();
    }

    public R c() throws Exception {
        return d();
    }

    public abstract R d() throws Exception;

    public g(String str) {
        this.f23753a = str;
    }
}
