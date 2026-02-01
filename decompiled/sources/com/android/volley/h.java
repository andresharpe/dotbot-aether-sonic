package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class h implements q {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f24480a;

    /* loaded from: classes.dex */
    class a implements Executor {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Handler f24481E;

        a(Handler handler) {
            this.f24481E = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f24481E.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private final Request f24483E;

        /* renamed from: F, reason: collision with root package name */
        private final p f24484F;

        /* renamed from: G, reason: collision with root package name */
        private final Runnable f24485G;

        public b(Request request, p pVar, Runnable runnable) {
            this.f24483E = request;
            this.f24484F = pVar;
            this.f24485G = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24483E.I()) {
                this.f24483E.m("canceled-at-delivery");
                return;
            }
            if (this.f24484F.b()) {
                this.f24483E.j(this.f24484F.f24520a);
            } else {
                this.f24483E.i(this.f24484F.f24522c);
            }
            if (this.f24484F.f24523d) {
                this.f24483E.e("intermediate-response");
            } else {
                this.f24483E.m("done");
            }
            Runnable runnable = this.f24485G;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public h(Handler handler) {
        this.f24480a = new a(handler);
    }

    @Override // com.android.volley.q
    public void a(Request<?> request, p<?> pVar) {
        b(request, pVar, null);
    }

    @Override // com.android.volley.q
    public void b(Request<?> request, p<?> pVar, Runnable runnable) {
        request.J();
        request.e("post-response");
        this.f24480a.execute(new b(request, pVar, runnable));
    }

    @Override // com.android.volley.q
    public void c(Request<?> request, VolleyError volleyError) {
        request.e("post-error");
        this.f24480a.execute(new b(request, p.a(volleyError), null));
    }

    public h(Executor executor) {
        this.f24480a = executor;
    }
}
