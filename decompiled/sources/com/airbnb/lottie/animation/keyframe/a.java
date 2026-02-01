package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.N;
import androidx.annotation.P;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final d<K> f21360c;

    /* renamed from: e, reason: collision with root package name */
    @P
    protected com.airbnb.lottie.value.j<A> f21362e;

    /* renamed from: a, reason: collision with root package name */
    final List<b> f21358a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f21359b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f21361d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    @P
    private A f21363f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f21364g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f21365h = -1.0f;

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f4) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f4) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f4);

        com.airbnb.lottie.value.a<T> b();

        boolean c(float f4);

        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        float d();

        @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends com.airbnb.lottie.value.a<T>> f21366a;

        /* renamed from: c, reason: collision with root package name */
        private com.airbnb.lottie.value.a<T> f21368c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f21369d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        @N
        private com.airbnb.lottie.value.a<T> f21367b = f(0.0f);

        e(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f21366a = list;
        }

        private com.airbnb.lottie.value.a<T> f(float f4) {
            List<? extends com.airbnb.lottie.value.a<T>> list = this.f21366a;
            com.airbnb.lottie.value.a<T> aVar = list.get(list.size() - 1);
            if (f4 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f21366a.size() - 2; size >= 1; size--) {
                com.airbnb.lottie.value.a<T> aVar2 = this.f21366a.get(size);
                if (this.f21367b != aVar2 && aVar2.a(f4)) {
                    return aVar2;
                }
            }
            return this.f21366a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f4) {
            com.airbnb.lottie.value.a<T> aVar = this.f21368c;
            com.airbnb.lottie.value.a<T> aVar2 = this.f21367b;
            if (aVar == aVar2 && this.f21369d == f4) {
                return true;
            }
            this.f21368c = aVar2;
            this.f21369d = f4;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        @N
        public com.airbnb.lottie.value.a<T> b() {
            return this.f21367b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f4) {
            if (this.f21367b.a(f4)) {
                return !this.f21367b.h();
            }
            this.f21367b = f(f4);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f21366a.get(r0.size() - 1).b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f21366a.get(0).e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final com.airbnb.lottie.value.a<T> f21370a;

        /* renamed from: b, reason: collision with root package name */
        private float f21371b = -1.0f;

        f(List<? extends com.airbnb.lottie.value.a<T>> list) {
            this.f21370a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean a(float f4) {
            if (this.f21371b == f4) {
                return true;
            }
            this.f21371b = f4;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public com.airbnb.lottie.value.a<T> b() {
            return this.f21370a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean c(float f4) {
            return !this.f21370a.h();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float d() {
            return this.f21370a.b();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public float e() {
            return this.f21370a.e();
        }

        @Override // com.airbnb.lottie.animation.keyframe.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends com.airbnb.lottie.value.a<K>> list) {
        this.f21360c = o(list);
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    private float g() {
        if (this.f21364g == -1.0f) {
            this.f21364g = this.f21360c.e();
        }
        return this.f21364g;
    }

    private static <T> d<T> o(List<? extends com.airbnb.lottie.value.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.f21358a.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.airbnb.lottie.value.a<K> b() {
        com.airbnb.lottie.e.a("BaseKeyframeAnimation#getCurrentKeyframe");
        com.airbnb.lottie.value.a<K> b4 = this.f21360c.b();
        com.airbnb.lottie.e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b4;
    }

    @InterfaceC0580x(from = com.google.firebase.remoteconfig.l.f37524n, to = 1.0d)
    float c() {
        if (this.f21365h == -1.0f) {
            this.f21365h = this.f21360c.d();
        }
        return this.f21365h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float d() {
        com.airbnb.lottie.value.a<K> b4 = b();
        if (b4.h()) {
            return 0.0f;
        }
        return b4.f23314d.getInterpolation(e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        if (this.f21359b) {
            return 0.0f;
        }
        com.airbnb.lottie.value.a<K> b4 = b();
        if (b4.h()) {
            return 0.0f;
        }
        return (this.f21361d - b4.e()) / (b4.b() - b4.e());
    }

    public float f() {
        return this.f21361d;
    }

    public A h() {
        A i4;
        float e4 = e();
        if (this.f21362e == null && this.f21360c.a(e4)) {
            return this.f21363f;
        }
        com.airbnb.lottie.value.a<K> b4 = b();
        Interpolator interpolator = b4.f23315e;
        if (interpolator != null && b4.f23316f != null) {
            i4 = j(b4, e4, interpolator.getInterpolation(e4), b4.f23316f.getInterpolation(e4));
        } else {
            i4 = i(b4, d());
        }
        this.f21363f = i4;
        return i4;
    }

    abstract A i(com.airbnb.lottie.value.a<K> aVar, float f4);

    protected A j(com.airbnb.lottie.value.a<K> aVar, float f4, float f5, float f6) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i4 = 0; i4 < this.f21358a.size(); i4++) {
            this.f21358a.get(i4).a();
        }
    }

    public void l() {
        this.f21359b = true;
    }

    public void m(@InterfaceC0580x(from = 0.0d, to = 1.0d) float f4) {
        if (this.f21360c.isEmpty()) {
            return;
        }
        if (f4 < g()) {
            f4 = g();
        } else if (f4 > c()) {
            f4 = c();
        }
        if (f4 == this.f21361d) {
            return;
        }
        this.f21361d = f4;
        if (this.f21360c.c(f4)) {
            k();
        }
    }

    public void n(@P com.airbnb.lottie.value.j<A> jVar) {
        com.airbnb.lottie.value.j<A> jVar2 = this.f21362e;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f21362e = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
