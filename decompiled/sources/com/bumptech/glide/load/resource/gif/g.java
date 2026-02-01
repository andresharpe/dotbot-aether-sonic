package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import com.bumptech.glide.util.l;
import com.bumptech.glide.util.n;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.gifdecoder.a f26599a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f26600b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f26601c;

    /* renamed from: d, reason: collision with root package name */
    final com.bumptech.glide.j f26602d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f26603e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26604f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f26605g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f26606h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.i<Bitmap> f26607i;

    /* renamed from: j, reason: collision with root package name */
    private a f26608j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26609k;

    /* renamed from: l, reason: collision with root package name */
    private a f26610l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f26611m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.i<Bitmap> f26612n;

    /* renamed from: o, reason: collision with root package name */
    private a f26613o;

    /* renamed from: p, reason: collision with root package name */
    @P
    private d f26614p;

    /* renamed from: q, reason: collision with root package name */
    private int f26615q;

    /* renamed from: r, reason: collision with root package name */
    private int f26616r;

    /* renamed from: s, reason: collision with root package name */
    private int f26617s;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public static class a extends com.bumptech.glide.request.target.e<Bitmap> {

        /* renamed from: H, reason: collision with root package name */
        private final Handler f26618H;

        /* renamed from: I, reason: collision with root package name */
        final int f26619I;

        /* renamed from: J, reason: collision with root package name */
        private final long f26620J;

        /* renamed from: K, reason: collision with root package name */
        private Bitmap f26621K;

        a(Handler handler, int i4, long j4) {
            this.f26618H = handler;
            this.f26619I = i4;
            this.f26620J = j4;
        }

        Bitmap f() {
            return this.f26621K;
        }

        @Override // com.bumptech.glide.request.target.p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(@N Bitmap bitmap, @P com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            this.f26621K = bitmap;
            this.f26618H.sendMessageAtTime(this.f26618H.obtainMessage(1, this), this.f26620J);
        }

        @Override // com.bumptech.glide.request.target.p
        public void r(@P Drawable drawable) {
            this.f26621K = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    private class c implements Handler.Callback {

        /* renamed from: d, reason: collision with root package name */
        static final int f26622d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f26623e = 2;

        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                g.this.o((a) message.obj);
                return true;
            }
            if (i4 == 2) {
                g.this.f26602d.C((a) message.obj);
                return false;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0
    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.bumptech.glide.b bVar, com.bumptech.glide.gifdecoder.a aVar, int i4, int i5, com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        this(bVar.h(), com.bumptech.glide.b.E(bVar.j()), aVar, null, k(com.bumptech.glide.b.E(bVar.j()), i4, i5), iVar, bitmap);
    }

    private static com.bumptech.glide.load.c g() {
        return new com.bumptech.glide.signature.e(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.i<Bitmap> k(com.bumptech.glide.j jVar, int i4, int i5) {
        return jVar.x().a(com.bumptech.glide.request.h.b1(com.bumptech.glide.load.engine.j.f26110b).U0(true).K0(true).z0(i4, i5));
    }

    private void n() {
        boolean z3;
        if (this.f26604f && !this.f26605g) {
            if (this.f26606h) {
                if (this.f26613o == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                l.a(z3, "Pending target must be null when starting from the first frame");
                this.f26599a.l();
                this.f26606h = false;
            }
            a aVar = this.f26613o;
            if (aVar != null) {
                this.f26613o = null;
                o(aVar);
                return;
            }
            this.f26605g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + this.f26599a.i();
            this.f26599a.f();
            this.f26610l = new a(this.f26600b, this.f26599a.n(), uptimeMillis);
            this.f26607i.a(com.bumptech.glide.request.h.s1(g())).n(this.f26599a).l1(this.f26610l);
        }
    }

    private void p() {
        Bitmap bitmap = this.f26611m;
        if (bitmap != null) {
            this.f26603e.d(bitmap);
            this.f26611m = null;
        }
    }

    private void t() {
        if (this.f26604f) {
            return;
        }
        this.f26604f = true;
        this.f26609k = false;
        n();
    }

    private void u() {
        this.f26604f = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f26601c.clear();
        p();
        u();
        a aVar = this.f26608j;
        if (aVar != null) {
            this.f26602d.C(aVar);
            this.f26608j = null;
        }
        a aVar2 = this.f26610l;
        if (aVar2 != null) {
            this.f26602d.C(aVar2);
            this.f26610l = null;
        }
        a aVar3 = this.f26613o;
        if (aVar3 != null) {
            this.f26602d.C(aVar3);
            this.f26613o = null;
        }
        this.f26599a.clear();
        this.f26609k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.f26599a.c().asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.f26608j;
        if (aVar != null) {
            return aVar.f();
        }
        return this.f26611m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        a aVar = this.f26608j;
        if (aVar != null) {
            return aVar.f26619I;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap e() {
        return this.f26611m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f26599a.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.load.i<Bitmap> h() {
        return this.f26612n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f26617s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f26599a.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f26599a.q() + this.f26615q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.f26616r;
    }

    @i0
    void o(a aVar) {
        d dVar = this.f26614p;
        if (dVar != null) {
            dVar.a();
        }
        this.f26605g = false;
        if (this.f26609k) {
            this.f26600b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f26604f) {
            if (this.f26606h) {
                this.f26600b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f26613o = aVar;
                return;
            }
        }
        if (aVar.f() != null) {
            p();
            a aVar2 = this.f26608j;
            this.f26608j = aVar;
            for (int size = this.f26601c.size() - 1; size >= 0; size--) {
                this.f26601c.get(size).a();
            }
            if (aVar2 != null) {
                this.f26600b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        this.f26612n = (com.bumptech.glide.load.i) l.d(iVar);
        this.f26611m = (Bitmap) l.d(bitmap);
        this.f26607i = this.f26607i.a(new com.bumptech.glide.request.h().N0(iVar));
        this.f26615q = n.h(bitmap);
        this.f26616r = bitmap.getWidth();
        this.f26617s = bitmap.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        l.a(!this.f26604f, "Can't restart a running animation");
        this.f26606h = true;
        a aVar = this.f26613o;
        if (aVar != null) {
            this.f26602d.C(aVar);
            this.f26613o = null;
        }
    }

    @i0
    void s(@P d dVar) {
        this.f26614p = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(b bVar) {
        if (!this.f26609k) {
            if (!this.f26601c.contains(bVar)) {
                boolean isEmpty = this.f26601c.isEmpty();
                this.f26601c.add(bVar);
                if (isEmpty) {
                    t();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(b bVar) {
        this.f26601c.remove(bVar);
        if (this.f26601c.isEmpty()) {
            u();
        }
    }

    g(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.j jVar, com.bumptech.glide.gifdecoder.a aVar, Handler handler, com.bumptech.glide.i<Bitmap> iVar, com.bumptech.glide.load.i<Bitmap> iVar2, Bitmap bitmap) {
        this.f26601c = new ArrayList();
        this.f26602d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f26603e = eVar;
        this.f26600b = handler;
        this.f26607i = iVar;
        this.f26599a = aVar;
        q(iVar2, bitmap);
    }
}
