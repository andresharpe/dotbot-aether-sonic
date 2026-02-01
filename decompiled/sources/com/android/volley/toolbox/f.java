package com.android.volley.toolbox;

import android.os.SystemClock;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.b;
import com.android.volley.toolbox.AbstractC1075c;
import com.android.volley.toolbox.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class f extends com.android.volley.b {

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1075c f24561d;

    /* renamed from: e, reason: collision with root package name */
    private final h f24562e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AbstractC1075c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Request f24563a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f24564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b.InterfaceC0209b f24565c;

        a(Request request, long j4, b.InterfaceC0209b interfaceC0209b) {
            this.f24563a = request;
            this.f24564b = j4;
            this.f24565c = interfaceC0209b;
        }

        @Override // com.android.volley.toolbox.AbstractC1075c.b
        public void a(AuthFailureError authFailureError) {
            this.f24565c.a(authFailureError);
        }

        @Override // com.android.volley.toolbox.AbstractC1075c.b
        public void b(n nVar) {
            f.this.n(this.f24563a, this.f24564b, nVar, this.f24565c);
        }

        @Override // com.android.volley.toolbox.AbstractC1075c.b
        public void c(IOException iOException) {
            f.this.m(this.f24563a, this.f24565c, iOException, this.f24564b, null, null);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final int f24567c = 4096;

        /* renamed from: a, reason: collision with root package name */
        @N
        private AbstractC1075c f24568a;

        /* renamed from: b, reason: collision with root package name */
        private h f24569b = null;

        public b(@N AbstractC1075c abstractC1075c) {
            this.f24568a = abstractC1075c;
        }

        public f a() {
            if (this.f24569b == null) {
                this.f24569b = new h(4096);
            }
            return new f(this.f24568a, this.f24569b, null);
        }

        public b b(h hVar) {
            this.f24569b = hVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c<T> extends com.android.volley.o<T> {

        /* renamed from: F, reason: collision with root package name */
        final Request<T> f24570F;

        /* renamed from: G, reason: collision with root package name */
        final w.b f24571G;

        /* renamed from: H, reason: collision with root package name */
        final b.InterfaceC0209b f24572H;

        c(Request<T> request, w.b bVar, b.InterfaceC0209b interfaceC0209b) {
            super(request);
            this.f24570F = request;
            this.f24571G = bVar;
            this.f24572H = interfaceC0209b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w.a(this.f24570F, this.f24571G);
                f.this.e(this.f24570F, this.f24572H);
            } catch (VolleyError e4) {
                this.f24572H.a(e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d<T> extends com.android.volley.o<T> {

        /* renamed from: F, reason: collision with root package name */
        InputStream f24574F;

        /* renamed from: G, reason: collision with root package name */
        n f24575G;

        /* renamed from: H, reason: collision with root package name */
        Request<T> f24576H;

        /* renamed from: I, reason: collision with root package name */
        b.InterfaceC0209b f24577I;

        /* renamed from: J, reason: collision with root package name */
        long f24578J;

        /* renamed from: K, reason: collision with root package name */
        List<com.android.volley.i> f24579K;

        /* renamed from: L, reason: collision with root package name */
        int f24580L;

        d(InputStream inputStream, n nVar, Request<T> request, b.InterfaceC0209b interfaceC0209b, long j4, List<com.android.volley.i> list, int i4) {
            super(request);
            this.f24574F = inputStream;
            this.f24575G = nVar;
            this.f24576H = request;
            this.f24577I = interfaceC0209b;
            this.f24578J = j4;
            this.f24579K = list;
            this.f24580L = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.o(this.f24578J, this.f24580L, this.f24575G, this.f24576H, this.f24577I, this.f24579K, w.c(this.f24574F, this.f24575G.c(), f.this.f24562e));
            } catch (IOException e4) {
                f.this.m(this.f24576H, this.f24577I, e4, this.f24578J, this.f24575G, null);
            }
        }
    }

    /* synthetic */ f(AbstractC1075c abstractC1075c, h hVar, a aVar) {
        this(abstractC1075c, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Request<?> request, b.InterfaceC0209b interfaceC0209b, IOException iOException, long j4, @P n nVar, @P byte[] bArr) {
        try {
            b().execute(new c(request, w.e(request, iOException, j4, nVar, bArr), interfaceC0209b));
        } catch (VolleyError e4) {
            interfaceC0209b.a(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Request<?> request, long j4, n nVar, b.InterfaceC0209b interfaceC0209b) {
        int e4 = nVar.e();
        List<com.android.volley.i> d4 = nVar.d();
        if (e4 == 304) {
            interfaceC0209b.b(w.b(request, SystemClock.elapsedRealtime() - j4, d4));
            return;
        }
        byte[] b4 = nVar.b();
        if (b4 == null && nVar.a() == null) {
            b4 = new byte[0];
        }
        byte[] bArr = b4;
        if (bArr != null) {
            o(j4, e4, nVar, request, interfaceC0209b, d4, bArr);
        } else {
            b().execute(new d(nVar.a(), nVar, request, interfaceC0209b, j4, d4, e4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(long j4, int i4, n nVar, Request<?> request, b.InterfaceC0209b interfaceC0209b, List<com.android.volley.i> list, byte[] bArr) {
        w.d(SystemClock.elapsedRealtime() - j4, request, bArr, i4);
        if (i4 >= 200 && i4 <= 299) {
            interfaceC0209b.b(new com.android.volley.l(i4, bArr, false, SystemClock.elapsedRealtime() - j4, list));
        } else {
            m(request, interfaceC0209b, new IOException(), j4, nVar, bArr);
        }
    }

    @Override // com.android.volley.b
    public void e(Request<?> request, b.InterfaceC0209b interfaceC0209b) {
        if (b() != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f24561d.c(request, m.c(request.p()), new a(request, elapsedRealtime, interfaceC0209b));
            return;
        }
        throw new IllegalStateException("mBlockingExecuter must be set before making a request");
    }

    @Override // com.android.volley.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f(ExecutorService executorService) {
        super.f(executorService);
        this.f24561d.f(executorService);
    }

    @Override // com.android.volley.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g(ExecutorService executorService) {
        super.g(executorService);
        this.f24561d.g(executorService);
    }

    private f(AbstractC1075c abstractC1075c, h hVar) {
        this.f24561d = abstractC1075c;
        this.f24562e = hVar;
    }
}
