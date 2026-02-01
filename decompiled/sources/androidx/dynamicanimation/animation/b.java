package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.InterfaceC0580x;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import androidx.dynamicanimation.animation.a;
import androidx.dynamicanimation.animation.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: A, reason: collision with root package name */
    public static final float f14229A = 1.0f;

    /* renamed from: B, reason: collision with root package name */
    public static final float f14230B = 0.1f;

    /* renamed from: C, reason: collision with root package name */
    public static final float f14231C = 0.00390625f;

    /* renamed from: D, reason: collision with root package name */
    public static final float f14232D = 0.002f;

    /* renamed from: E, reason: collision with root package name */
    private static final float f14233E = Float.MAX_VALUE;

    /* renamed from: F, reason: collision with root package name */
    private static final float f14234F = 0.75f;

    /* renamed from: m, reason: collision with root package name */
    public static final s f14235m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f14236n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f14237o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f14238p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f14239q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f14240r = new l(androidx.constraintlayout.motion.widget.f.f8538i);

    /* renamed from: s, reason: collision with root package name */
    public static final s f14241s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f14242t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f14243u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f14244v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f14245w = new C0127b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f14246x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f14247y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f14248z = new e("scrollY");

    /* renamed from: a, reason: collision with root package name */
    float f14249a;

    /* renamed from: b, reason: collision with root package name */
    float f14250b;

    /* renamed from: c, reason: collision with root package name */
    boolean f14251c;

    /* renamed from: d, reason: collision with root package name */
    final Object f14252d;

    /* renamed from: e, reason: collision with root package name */
    final androidx.dynamicanimation.animation.d f14253e;

    /* renamed from: f, reason: collision with root package name */
    boolean f14254f;

    /* renamed from: g, reason: collision with root package name */
    float f14255g;

    /* renamed from: h, reason: collision with root package name */
    float f14256h;

    /* renamed from: i, reason: collision with root package name */
    private long f14257i;

    /* renamed from: j, reason: collision with root package name */
    private float f14258j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f14259k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f14260l;

    /* loaded from: classes.dex */
    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setY(f4);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0127b extends s {
        C0127b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return C0823k0.F0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            C0823k0.B2(view, f4);
        }
    }

    /* loaded from: classes.dex */
    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setAlpha(f4);
        }
    }

    /* loaded from: classes.dex */
    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setScrollX((int) f4);
        }
    }

    /* loaded from: classes.dex */
    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setScrollY((int) f4);
        }
    }

    /* loaded from: classes.dex */
    class f extends androidx.dynamicanimation.animation.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.dynamicanimation.animation.e f14261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, androidx.dynamicanimation.animation.e eVar) {
            super(str);
            this.f14261b = eVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(Object obj) {
            return this.f14261b.a();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(Object obj, float f4) {
            this.f14261b.b(f4);
        }
    }

    /* loaded from: classes.dex */
    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setTranslationX(f4);
        }
    }

    /* loaded from: classes.dex */
    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setTranslationY(f4);
        }
    }

    /* loaded from: classes.dex */
    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return C0823k0.A0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            C0823k0.w2(view, f4);
        }
    }

    /* loaded from: classes.dex */
    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setScaleX(f4);
        }
    }

    /* loaded from: classes.dex */
    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setScaleY(f4);
        }
    }

    /* loaded from: classes.dex */
    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setRotation(f4);
        }
    }

    /* loaded from: classes.dex */
    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setRotationX(f4);
        }
    }

    /* loaded from: classes.dex */
    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setRotationY(f4);
        }
    }

    /* loaded from: classes.dex */
    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f4) {
            view.setX(f4);
        }
    }

    /* loaded from: classes.dex */
    static class p {

        /* renamed from: a, reason: collision with root package name */
        float f14263a;

        /* renamed from: b, reason: collision with root package name */
        float f14264b;
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(b bVar, boolean z3, float f4, float f5);
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(b bVar, float f4, float f5);
    }

    /* loaded from: classes.dex */
    public static abstract class s extends androidx.dynamicanimation.animation.d<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(androidx.dynamicanimation.animation.e eVar) {
        this.f14249a = 0.0f;
        this.f14250b = Float.MAX_VALUE;
        this.f14251c = false;
        this.f14254f = false;
        this.f14255g = Float.MAX_VALUE;
        this.f14256h = -Float.MAX_VALUE;
        this.f14257i = 0L;
        this.f14259k = new ArrayList<>();
        this.f14260l = new ArrayList<>();
        this.f14252d = null;
        this.f14253e = new f("FloatValueHolder", eVar);
        this.f14258j = 1.0f;
    }

    private void e(boolean z3) {
        this.f14254f = false;
        androidx.dynamicanimation.animation.a.e().h(this);
        this.f14257i = 0L;
        this.f14251c = false;
        for (int i4 = 0; i4 < this.f14259k.size(); i4++) {
            if (this.f14259k.get(i4) != null) {
                this.f14259k.get(i4).a(this, z3, this.f14250b, this.f14249a);
            }
        }
        n(this.f14259k);
    }

    private float h() {
        return this.f14253e.b(this.f14252d);
    }

    private static <T> void m(ArrayList<T> arrayList, T t3) {
        int indexOf = arrayList.indexOf(t3);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    private static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void x() {
        if (!this.f14254f) {
            this.f14254f = true;
            if (!this.f14251c) {
                this.f14250b = h();
            }
            float f4 = this.f14250b;
            if (f4 <= this.f14255g && f4 >= this.f14256h) {
                androidx.dynamicanimation.animation.a.e().a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean a(long j4) {
        long j5 = this.f14257i;
        if (j5 == 0) {
            this.f14257i = j4;
            s(this.f14250b);
            return false;
        }
        this.f14257i = j4;
        boolean y3 = y(j4 - j5);
        float min = Math.min(this.f14250b, this.f14255g);
        this.f14250b = min;
        float max = Math.max(min, this.f14256h);
        this.f14250b = max;
        s(max);
        if (y3) {
            e(false);
        }
        return y3;
    }

    public T b(q qVar) {
        if (!this.f14259k.contains(qVar)) {
            this.f14259k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (!k()) {
            if (!this.f14260l.contains(rVar)) {
                this.f14260l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f14254f) {
                e(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    abstract float f(float f4, float f5);

    public float g() {
        return this.f14258j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f14258j * 0.75f;
    }

    abstract boolean j(float f4, float f5);

    public boolean k() {
        return this.f14254f;
    }

    public void l(q qVar) {
        m(this.f14259k, qVar);
    }

    public void o(r rVar) {
        m(this.f14260l, rVar);
    }

    public T p(float f4) {
        this.f14255g = f4;
        return this;
    }

    public T q(float f4) {
        this.f14256h = f4;
        return this;
    }

    public T r(@InterfaceC0580x(from = 0.0d, fromInclusive = false) float f4) {
        if (f4 > 0.0f) {
            this.f14258j = f4;
            v(f4 * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    void s(float f4) {
        this.f14253e.c(this.f14252d, f4);
        for (int i4 = 0; i4 < this.f14260l.size(); i4++) {
            if (this.f14260l.get(i4) != null) {
                this.f14260l.get(i4).a(this, this.f14250b, this.f14249a);
            }
        }
        n(this.f14260l);
    }

    public T t(float f4) {
        this.f14250b = f4;
        this.f14251c = true;
        return this;
    }

    public T u(float f4) {
        this.f14249a = f4;
        return this;
    }

    abstract void v(float f4);

    public void w() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f14254f) {
                x();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    abstract boolean y(long j4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> b(K k4, androidx.dynamicanimation.animation.d<K> dVar) {
        this.f14249a = 0.0f;
        this.f14250b = Float.MAX_VALUE;
        this.f14251c = false;
        this.f14254f = false;
        this.f14255g = Float.MAX_VALUE;
        this.f14256h = -Float.MAX_VALUE;
        this.f14257i = 0L;
        this.f14259k = new ArrayList<>();
        this.f14260l = new ArrayList<>();
        this.f14252d = k4;
        this.f14253e = dVar;
        if (dVar != f14240r && dVar != f14241s && dVar != f14242t) {
            if (dVar == f14246x) {
                this.f14258j = 0.00390625f;
                return;
            } else if (dVar != f14238p && dVar != f14239q) {
                this.f14258j = 1.0f;
                return;
            } else {
                this.f14258j = 0.00390625f;
                return;
            }
        }
        this.f14258j = 0.1f;
    }
}
