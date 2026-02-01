package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import androidx.annotation.N;
import androidx.annotation.P;
import com.bumptech.glide.request.target.o;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class f<T> implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f25471a;

    /* renamed from: b, reason: collision with root package name */
    private final d f25472b;

    /* renamed from: c, reason: collision with root package name */
    private final j f25473c;

    /* renamed from: d, reason: collision with root package name */
    private final a<T> f25474d;

    /* renamed from: e, reason: collision with root package name */
    private final b<T> f25475e;

    /* renamed from: f, reason: collision with root package name */
    private int f25476f;

    /* renamed from: g, reason: collision with root package name */
    private int f25477g;

    /* renamed from: i, reason: collision with root package name */
    private int f25479i;

    /* renamed from: h, reason: collision with root package name */
    private int f25478h = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25480j = true;

    /* loaded from: classes.dex */
    public interface a<U> {
        @N
        List<U> a(int i4);

        @P
        i<?> b(@N U u3);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        @P
        int[] a(@N T t3, int i4, int i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements p<Object> {

        /* renamed from: E, reason: collision with root package name */
        int f25481E;

        /* renamed from: F, reason: collision with root package name */
        int f25482F;

        /* renamed from: G, reason: collision with root package name */
        @P
        private com.bumptech.glide.request.e f25483G;

        c() {
        }

        @Override // com.bumptech.glide.manager.m
        public void a() {
        }

        @Override // com.bumptech.glide.manager.m
        public void b() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void c(@N o oVar) {
        }

        @Override // com.bumptech.glide.manager.m
        public void d() {
        }

        @Override // com.bumptech.glide.request.target.p
        public void e(@N Object obj, @P com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void l(@P com.bumptech.glide.request.e eVar) {
            this.f25483G = eVar;
        }

        @Override // com.bumptech.glide.request.target.p
        public void m(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void p(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        @P
        public com.bumptech.glide.request.e q() {
            return this.f25483G;
        }

        @Override // com.bumptech.glide.request.target.p
        public void r(@P Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void s(@N o oVar) {
            oVar.f(this.f25482F, this.f25481E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Queue<c> f25484a;

        d(int i4) {
            this.f25484a = n.f(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                this.f25484a.offer(new c());
            }
        }

        public c a(int i4, int i5) {
            c poll = this.f25484a.poll();
            this.f25484a.offer(poll);
            poll.f25482F = i4;
            poll.f25481E = i5;
            return poll;
        }
    }

    public f(@N j jVar, @N a<T> aVar, @N b<T> bVar, int i4) {
        this.f25473c = jVar;
        this.f25474d = aVar;
        this.f25475e = bVar;
        this.f25471a = i4;
        this.f25472b = new d(i4 + 1);
    }

    private void a() {
        for (int i4 = 0; i4 < this.f25472b.f25484a.size(); i4++) {
            this.f25473c.C(this.f25472b.a(0, 0));
        }
    }

    private void b(int i4, int i5) {
        int min;
        int i6;
        if (i4 < i5) {
            i6 = Math.max(this.f25476f, i4);
            min = i5;
        } else {
            min = Math.min(this.f25477g, i4);
            i6 = i5;
        }
        int min2 = Math.min(this.f25479i, min);
        int min3 = Math.min(this.f25479i, Math.max(0, i6));
        if (i4 < i5) {
            for (int i7 = min3; i7 < min2; i7++) {
                d(this.f25474d.a(i7), i7, true);
            }
        } else {
            for (int i8 = min2 - 1; i8 >= min3; i8--) {
                d(this.f25474d.a(i8), i8, false);
            }
        }
        this.f25477g = min3;
        this.f25476f = min2;
    }

    private void c(int i4, boolean z3) {
        int i5;
        if (this.f25480j != z3) {
            this.f25480j = z3;
            a();
        }
        if (z3) {
            i5 = this.f25471a;
        } else {
            i5 = -this.f25471a;
        }
        b(i4, i5 + i4);
    }

    private void d(List<T> list, int i4, boolean z3) {
        int size = list.size();
        if (z3) {
            for (int i5 = 0; i5 < size; i5++) {
                e(list.get(i5), i4, i5);
            }
            return;
        }
        for (int i6 = size - 1; i6 >= 0; i6--) {
            e(list.get(i6), i4, i6);
        }
    }

    private void e(@P T t3, int i4, int i5) {
        int[] a4;
        i<?> b4;
        if (t3 == null || (a4 = this.f25475e.a(t3, i4, i5)) == null || (b4 = this.f25474d.b(t3)) == null) {
            return;
        }
        b4.l1(this.f25472b.a(a4[0], a4[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        this.f25479i = i6;
        int i7 = this.f25478h;
        if (i4 > i7) {
            c(i5 + i4, true);
        } else if (i4 < i7) {
            c(i4, false);
        }
        this.f25478h = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }
}
