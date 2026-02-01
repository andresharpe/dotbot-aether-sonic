package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.databinding.i;
import androidx.databinding.u;
import androidx.databinding.w;
import androidx.databinding.x;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import i0.InterfaceC2066b;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import u.C2420a;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends C0863a implements InterfaceC2066b {

    /* renamed from: W, reason: collision with root package name */
    private static final int f13979W = 1;

    /* renamed from: X, reason: collision with root package name */
    private static final int f13980X = 2;

    /* renamed from: Y, reason: collision with root package name */
    private static final int f13981Y = 3;

    /* renamed from: Z, reason: collision with root package name */
    public static final String f13982Z = "binding_";

    /* renamed from: a0, reason: collision with root package name */
    private static final int f13983a0 = 8;

    /* renamed from: F, reason: collision with root package name */
    private final Runnable f13992F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f13993G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f13994H;

    /* renamed from: I, reason: collision with root package name */
    private F[] f13995I;

    /* renamed from: J, reason: collision with root package name */
    private final View f13996J;

    /* renamed from: K, reason: collision with root package name */
    private androidx.databinding.i<z, ViewDataBinding, Void> f13997K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f13998L;

    /* renamed from: M, reason: collision with root package name */
    private Choreographer f13999M;

    /* renamed from: N, reason: collision with root package name */
    private final Choreographer.FrameCallback f14000N;

    /* renamed from: O, reason: collision with root package name */
    private Handler f14001O;

    /* renamed from: P, reason: collision with root package name */
    protected final androidx.databinding.l f14002P;

    /* renamed from: Q, reason: collision with root package name */
    private ViewDataBinding f14003Q;

    /* renamed from: R, reason: collision with root package name */
    private androidx.lifecycle.E f14004R;

    /* renamed from: S, reason: collision with root package name */
    private OnStartListener f14005S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f14006T;

    /* renamed from: U, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean f14007U;

    /* renamed from: V, reason: collision with root package name */
    static int f13978V = Build.VERSION.SDK_INT;

    /* renamed from: b0, reason: collision with root package name */
    private static final boolean f13984b0 = true;

    /* renamed from: c0, reason: collision with root package name */
    private static final androidx.databinding.j f13985c0 = new a();

    /* renamed from: d0, reason: collision with root package name */
    private static final androidx.databinding.j f13986d0 = new b();

    /* renamed from: e0, reason: collision with root package name */
    private static final androidx.databinding.j f13987e0 = new c();

    /* renamed from: f0, reason: collision with root package name */
    private static final androidx.databinding.j f13988f0 = new d();

    /* renamed from: g0, reason: collision with root package name */
    private static final i.a<z, ViewDataBinding, Void> f13989g0 = new e();

    /* renamed from: h0, reason: collision with root package name */
    private static final ReferenceQueue<ViewDataBinding> f13990h0 = new ReferenceQueue<>();

    /* renamed from: i0, reason: collision with root package name */
    private static final View.OnAttachStateChangeListener f13991i0 = new f();

    /* loaded from: classes.dex */
    static class OnStartListener implements androidx.lifecycle.D {

        /* renamed from: E, reason: collision with root package name */
        final WeakReference<ViewDataBinding> f14008E;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @S(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f14008E.get();
            if (viewDataBinding != null) {
                viewDataBinding.y();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f14008E = new WeakReference<>(viewDataBinding);
        }
    }

    /* loaded from: classes.dex */
    class a implements androidx.databinding.j {
        a() {
        }

        @Override // androidx.databinding.j
        public F a(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new n(viewDataBinding, i4, referenceQueue).c();
        }
    }

    /* loaded from: classes.dex */
    class b implements androidx.databinding.j {
        b() {
        }

        @Override // androidx.databinding.j
        public F a(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i4, referenceQueue).c();
        }
    }

    /* loaded from: classes.dex */
    class c implements androidx.databinding.j {
        c() {
        }

        @Override // androidx.databinding.j
        public F a(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i4, referenceQueue).c();
        }
    }

    /* loaded from: classes.dex */
    class d implements androidx.databinding.j {
        d() {
        }

        @Override // androidx.databinding.j
        public F a(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new j(viewDataBinding, i4, referenceQueue).c();
        }
    }

    /* loaded from: classes.dex */
    class e extends i.a<z, ViewDataBinding, Void> {
        e() {
        }

        @Override // androidx.databinding.i.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(z zVar, ViewDataBinding viewDataBinding, int i4, Void r4) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        zVar.a(viewDataBinding);
                        return;
                    }
                    return;
                }
                zVar.b(viewDataBinding);
                return;
            }
            if (!zVar.c(viewDataBinding)) {
                viewDataBinding.f13994H = true;
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.E(view).f13992F.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f13993G = false;
            }
            ViewDataBinding.y0();
            if (!ViewDataBinding.this.f13996J.isAttachedToWindow()) {
                ViewDataBinding.this.f13996J.removeOnAttachStateChangeListener(ViewDataBinding.f13991i0);
                ViewDataBinding.this.f13996J.addOnAttachStateChangeListener(ViewDataBinding.f13991i0);
            } else {
                ViewDataBinding.this.y();
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j4) {
            ViewDataBinding.this.f13992F.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final String[][] f14011a;

        /* renamed from: b, reason: collision with root package name */
        public final int[][] f14012b;

        /* renamed from: c, reason: collision with root package name */
        public final int[][] f14013c;

        public i(int i4) {
            this.f14011a = new String[i4];
            this.f14012b = new int[i4];
            this.f14013c = new int[i4];
        }

        public void a(int i4, String[] strArr, int[] iArr, int[] iArr2) {
            this.f14011a[i4] = strArr;
            this.f14012b[i4] = iArr;
            this.f14013c[i4] = iArr2;
        }
    }

    /* loaded from: classes.dex */
    private static class j implements Q, y<LiveData<?>> {

        /* renamed from: a, reason: collision with root package name */
        final F<LiveData<?>> f14014a;

        /* renamed from: b, reason: collision with root package name */
        @P
        WeakReference<androidx.lifecycle.E> f14015b = null;

        public j(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f14014a = new F<>(viewDataBinding, i4, this, referenceQueue);
        }

        @P
        private androidx.lifecycle.E g() {
            WeakReference<androidx.lifecycle.E> weakReference = this.f14015b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.databinding.y
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(LiveData<?> liveData) {
            androidx.lifecycle.E g4 = g();
            if (g4 != null) {
                liveData.k(g4, this);
            }
        }

        @Override // androidx.databinding.y
        public void b(@P androidx.lifecycle.E e4) {
            androidx.lifecycle.E g4 = g();
            LiveData<?> b4 = this.f14014a.b();
            if (b4 != null) {
                if (g4 != null) {
                    b4.p(this);
                }
                if (e4 != null) {
                    b4.k(e4, this);
                }
            }
            if (e4 != null) {
                this.f14015b = new WeakReference<>(e4);
            }
        }

        @Override // androidx.databinding.y
        public F<LiveData<?>> c() {
            return this.f14014a;
        }

        @Override // androidx.lifecycle.Q
        public void f(@P Object obj) {
            ViewDataBinding a4 = this.f14014a.a();
            if (a4 != null) {
                F<LiveData<?>> f4 = this.f14014a;
                a4.g0(f4.f13952b, f4.b(), 0);
            }
        }

        @Override // androidx.databinding.y
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(LiveData<?> liveData) {
            liveData.p(this);
        }
    }

    /* loaded from: classes.dex */
    protected static abstract class k extends u.a implements o {

        /* renamed from: a, reason: collision with root package name */
        final int f14016a;

        public k(int i4) {
            this.f14016a = i4;
        }

        @Override // androidx.databinding.u.a
        public void f(u uVar, int i4) {
            if (i4 == this.f14016a || i4 == 0) {
                a();
            }
        }
    }

    /* loaded from: classes.dex */
    private static class l extends w.a implements y<w> {

        /* renamed from: a, reason: collision with root package name */
        final F<w> f14017a;

        public l(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f14017a = new F<>(viewDataBinding, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.w.a
        public void a(w wVar) {
            w b4;
            ViewDataBinding a4 = this.f14017a.a();
            if (a4 == null || (b4 = this.f14017a.b()) != wVar) {
                return;
            }
            a4.g0(this.f14017a.f13952b, b4, 0);
        }

        @Override // androidx.databinding.y
        public void b(androidx.lifecycle.E e4) {
        }

        @Override // androidx.databinding.y
        public F<w> c() {
            return this.f14017a;
        }

        @Override // androidx.databinding.w.a
        public void f(w wVar, int i4, int i5) {
            a(wVar);
        }

        @Override // androidx.databinding.w.a
        public void g(w wVar, int i4, int i5) {
            a(wVar);
        }

        @Override // androidx.databinding.w.a
        public void h(w wVar, int i4, int i5, int i6) {
            a(wVar);
        }

        @Override // androidx.databinding.w.a
        public void i(w wVar, int i4, int i5) {
            a(wVar);
        }

        @Override // androidx.databinding.y
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) {
            wVar.G(this);
        }

        @Override // androidx.databinding.y
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public void d(w wVar) {
            wVar.h(this);
        }
    }

    /* loaded from: classes.dex */
    private static class m extends x.a implements y<x> {

        /* renamed from: a, reason: collision with root package name */
        final F<x> f14018a;

        public m(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f14018a = new F<>(viewDataBinding, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.x.a
        public void a(x xVar, Object obj) {
            ViewDataBinding a4 = this.f14018a.a();
            if (a4 != null && xVar == this.f14018a.b()) {
                a4.g0(this.f14018a.f13952b, xVar, 0);
            }
        }

        @Override // androidx.databinding.y
        public void b(androidx.lifecycle.E e4) {
        }

        @Override // androidx.databinding.y
        public F<x> c() {
            return this.f14018a;
        }

        @Override // androidx.databinding.y
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(x xVar) {
            xVar.b(this);
        }

        @Override // androidx.databinding.y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(x xVar) {
            xVar.d(this);
        }
    }

    /* loaded from: classes.dex */
    private static class n extends u.a implements y<u> {

        /* renamed from: a, reason: collision with root package name */
        final F<u> f14019a;

        public n(ViewDataBinding viewDataBinding, int i4, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f14019a = new F<>(viewDataBinding, i4, this, referenceQueue);
        }

        @Override // androidx.databinding.y
        public void b(androidx.lifecycle.E e4) {
        }

        @Override // androidx.databinding.y
        public F<u> c() {
            return this.f14019a;
        }

        @Override // androidx.databinding.u.a
        public void f(u uVar, int i4) {
            ViewDataBinding a4 = this.f14019a.a();
            if (a4 == null || this.f14019a.b() != uVar) {
                return;
            }
            a4.g0(this.f14019a.f13952b, uVar, i4);
        }

        @Override // androidx.databinding.y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(u uVar) {
            uVar.a(this);
        }

        @Override // androidx.databinding.y
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(u uVar) {
            uVar.c(this);
        }
    }

    protected ViewDataBinding(androidx.databinding.l lVar, View view, int i4) {
        this.f13992F = new g();
        this.f13993G = false;
        this.f13994H = false;
        this.f14002P = lVar;
        this.f13995I = new F[i4];
        this.f13996J = view;
        if (Looper.myLooper() != null) {
            if (f13984b0) {
                this.f13999M = Choreographer.getInstance();
                this.f14000N = new h();
                return;
            } else {
                this.f14000N = null;
                this.f14001O = new Handler(Looper.myLooper());
                return;
            }
        }
        throw new IllegalStateException("DataBinding must be created in view's UI Thread");
    }

    private static int B(ViewGroup viewGroup, int i4) {
        String str;
        String str2 = (String) viewGroup.getChildAt(i4).getTag();
        String substring = str2.substring(0, str2.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i5 = i4 + 1; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt.getTag() instanceof String) {
                str = (String) childAt.getTag();
            } else {
                str = null;
            }
            if (str != null && str.startsWith(substring)) {
                if (str.length() == str2.length() && str.charAt(str.length() - 1) == '0') {
                    return i4;
                }
                if (k0(str, length)) {
                    i4 = i5;
                }
            }
        }
        return i4;
    }

    protected static byte C0(Byte b4) {
        if (b4 == null) {
            return (byte) 0;
        }
        return b4.byteValue();
    }

    protected static char D0(Character ch) {
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ViewDataBinding E(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C2420a.C0547a.f57880a);
        }
        return null;
    }

    protected static double E0(Double d4) {
        if (d4 == null) {
            return com.google.firebase.remoteconfig.l.f37524n;
        }
        return d4.doubleValue();
    }

    protected static float F0(Float f4) {
        if (f4 == null) {
            return 0.0f;
        }
        return f4.floatValue();
    }

    public static int G() {
        return f13978V;
    }

    protected static int G0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    protected static long H0(Long l4) {
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int I(View view, int i4) {
        return view.getContext().getColor(i4);
    }

    protected static short I0(Short sh) {
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    protected static ColorStateList J(View view, int i4) {
        return view.getContext().getColorStateList(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean J0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected static Drawable K(View view, int i4) {
        return view.getContext().getDrawable(i4);
    }

    protected static void K0(ViewDataBinding viewDataBinding, o oVar, k kVar) {
        if (oVar != kVar) {
            if (oVar != null) {
                viewDataBinding.c((k) oVar);
            }
            if (kVar != null) {
                viewDataBinding.a(kVar);
            }
        }
    }

    protected static <K, T> T L(Map<K, T> map, K k4) {
        if (map == null) {
            return null;
        }
        return map.get(k4);
    }

    protected static byte M(byte[] bArr, int i4) {
        if (bArr != null && i4 >= 0 && i4 < bArr.length) {
            return bArr[i4];
        }
        return (byte) 0;
    }

    protected static char N(char[] cArr, int i4) {
        if (cArr != null && i4 >= 0 && i4 < cArr.length) {
            return cArr[i4];
        }
        return (char) 0;
    }

    protected static double O(double[] dArr, int i4) {
        if (dArr != null && i4 >= 0 && i4 < dArr.length) {
            return dArr[i4];
        }
        return com.google.firebase.remoteconfig.l.f37524n;
    }

    protected static float P(float[] fArr, int i4) {
        if (fArr != null && i4 >= 0 && i4 < fArr.length) {
            return fArr[i4];
        }
        return 0.0f;
    }

    @TargetApi(16)
    protected static <T> void P0(LongSparseArray<T> longSparseArray, int i4, T t3) {
        if (longSparseArray != null && i4 >= 0 && i4 < longSparseArray.size()) {
            longSparseArray.put(i4, t3);
        }
    }

    protected static int Q(int[] iArr, int i4) {
        if (iArr != null && i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        return 0;
    }

    protected static <T> void Q0(SparseArray<T> sparseArray, int i4, T t3) {
        if (sparseArray != null && i4 >= 0 && i4 < sparseArray.size()) {
            sparseArray.put(i4, t3);
        }
    }

    protected static long R(long[] jArr, int i4) {
        if (jArr != null && i4 >= 0 && i4 < jArr.length) {
            return jArr[i4];
        }
        return 0L;
    }

    protected static void R0(SparseBooleanArray sparseBooleanArray, int i4, boolean z3) {
        if (sparseBooleanArray != null && i4 >= 0 && i4 < sparseBooleanArray.size()) {
            sparseBooleanArray.put(i4, z3);
        }
    }

    protected static <T> T S(T[] tArr, int i4) {
        if (tArr != null && i4 >= 0 && i4 < tArr.length) {
            return tArr[i4];
        }
        return null;
    }

    protected static void S0(SparseIntArray sparseIntArray, int i4, int i5) {
        if (sparseIntArray != null && i4 >= 0 && i4 < sparseIntArray.size()) {
            sparseIntArray.put(i4, i5);
        }
    }

    protected static short T(short[] sArr, int i4) {
        if (sArr != null && i4 >= 0 && i4 < sArr.length) {
            return sArr[i4];
        }
        return (short) 0;
    }

    @TargetApi(18)
    protected static void T0(SparseLongArray sparseLongArray, int i4, long j4) {
        if (sparseLongArray != null && i4 >= 0 && i4 < sparseLongArray.size()) {
            sparseLongArray.put(i4, j4);
        }
    }

    protected static boolean U(boolean[] zArr, int i4) {
        if (zArr != null && i4 >= 0 && i4 < zArr.length) {
            return zArr[i4];
        }
        return false;
    }

    protected static <T> void U0(androidx.collection.h<T> hVar, int i4, T t3) {
        if (hVar != null && i4 >= 0 && i4 < hVar.A()) {
            hVar.p(i4, t3);
        }
    }

    protected static <T> void V0(List<T> list, int i4, T t3) {
        if (list != null && i4 >= 0 && i4 < list.size()) {
            list.set(i4, t3);
        }
    }

    protected static int W(SparseIntArray sparseIntArray, int i4) {
        if (sparseIntArray != null && i4 >= 0) {
            return sparseIntArray.get(i4);
        }
        return 0;
    }

    protected static <K, T> void W0(Map<K, T> map, K k4, T t3) {
        if (map == null) {
            return;
        }
        map.put(k4, t3);
    }

    @TargetApi(18)
    protected static long X(SparseLongArray sparseLongArray, int i4) {
        if (sparseLongArray != null && i4 >= 0) {
            return sparseLongArray.get(i4);
        }
        return 0L;
    }

    protected static void X0(byte[] bArr, int i4, byte b4) {
        if (bArr != null && i4 >= 0 && i4 < bArr.length) {
            bArr[i4] = b4;
        }
    }

    @TargetApi(16)
    protected static <T> T Y(LongSparseArray<T> longSparseArray, int i4) {
        if (longSparseArray != null && i4 >= 0) {
            return longSparseArray.get(i4);
        }
        return null;
    }

    protected static void Y0(char[] cArr, int i4, char c4) {
        if (cArr != null && i4 >= 0 && i4 < cArr.length) {
            cArr[i4] = c4;
        }
    }

    protected static <T> T Z(SparseArray<T> sparseArray, int i4) {
        if (sparseArray != null && i4 >= 0) {
            return sparseArray.get(i4);
        }
        return null;
    }

    protected static void Z0(double[] dArr, int i4, double d4) {
        if (dArr != null && i4 >= 0 && i4 < dArr.length) {
            dArr[i4] = d4;
        }
    }

    protected static void a1(float[] fArr, int i4, float f4) {
        if (fArr != null && i4 >= 0 && i4 < fArr.length) {
            fArr[i4] = f4;
        }
    }

    protected static <T> T b0(androidx.collection.h<T> hVar, int i4) {
        if (hVar != null && i4 >= 0) {
            return hVar.i(i4);
        }
        return null;
    }

    protected static void b1(int[] iArr, int i4, int i5) {
        if (iArr != null && i4 >= 0 && i4 < iArr.length) {
            iArr[i4] = i5;
        }
    }

    protected static <T> T c0(List<T> list, int i4) {
        if (list != null && i4 >= 0 && i4 < list.size()) {
            return list.get(i4);
        }
        return null;
    }

    protected static void c1(long[] jArr, int i4, long j4) {
        if (jArr != null && i4 >= 0 && i4 < jArr.length) {
            jArr[i4] = j4;
        }
    }

    protected static boolean d0(SparseBooleanArray sparseBooleanArray, int i4) {
        if (sparseBooleanArray != null && i4 >= 0) {
            return sparseBooleanArray.get(i4);
        }
        return false;
    }

    protected static <T> void d1(T[] tArr, int i4, T t3) {
        if (tArr != null && i4 >= 0 && i4 < tArr.length) {
            tArr[i4] = t3;
        }
    }

    protected static void e1(short[] sArr, int i4, short s4) {
        if (sArr != null && i4 >= 0 && i4 < sArr.length) {
            sArr[i4] = s4;
        }
    }

    protected static void f1(boolean[] zArr, int i4, boolean z3) {
        if (zArr != null && i4 >= 0 && i4 < zArr.length) {
            zArr[i4] = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <T extends ViewDataBinding> T i0(@N LayoutInflater layoutInflater, int i4, @P ViewGroup viewGroup, boolean z3, @P Object obj) {
        return (T) androidx.databinding.m.k(layoutInflater, i4, viewGroup, z3, s(obj));
    }

    private static boolean k0(String str, int i4) {
        int length = str.length();
        if (length == i4) {
            return false;
        }
        while (i4 < length) {
            if (!Character.isDigit(str.charAt(i4))) {
                return false;
            }
            i4++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l0(androidx.databinding.l r17, android.view.View r18, java.lang.Object[] r19, androidx.databinding.ViewDataBinding.i r20, android.util.SparseIntArray r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.l0(androidx.databinding.l, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object[] m0(androidx.databinding.l lVar, View view, int i4, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i4];
        l0(lVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    protected static Object[] n0(androidx.databinding.l lVar, View[] viewArr, int i4, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i4];
        for (View view : viewArr) {
            l0(lVar, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    protected static byte p0(String str, byte b4) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b4;
        }
    }

    protected static char q0(String str, char c4) {
        if (str != null && !str.isEmpty()) {
            return str.charAt(0);
        }
        return c4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static ViewDataBinding r(Object obj, View view, int i4) {
        return androidx.databinding.m.c(s(obj), view, i4);
    }

    protected static double r0(String str, double d4) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d4;
        }
    }

    private static androidx.databinding.l s(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof androidx.databinding.l) {
            return (androidx.databinding.l) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    protected static float s0(String str, float f4) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f4;
        }
    }

    protected static int t0(String str, int i4) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i4;
        }
    }

    protected static long u0(String str, long j4) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    protected static short v0(String str, short s4) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s4;
        }
    }

    private void w() {
        if (this.f13998L) {
            B0();
            return;
        }
        if (!h0()) {
            return;
        }
        this.f13998L = true;
        this.f13994H = false;
        androidx.databinding.i<z, ViewDataBinding, Void> iVar = this.f13997K;
        if (iVar != null) {
            iVar.i(this, 1, null);
            if (this.f13994H) {
                this.f13997K.i(this, 2, null);
            }
        }
        if (!this.f13994H) {
            v();
            androidx.databinding.i<z, ViewDataBinding, Void> iVar2 = this.f13997K;
            if (iVar2 != null) {
                iVar2.i(this, 3, null);
            }
        }
        this.f13998L = false;
    }

    protected static boolean w0(String str, boolean z3) {
        if (str == null) {
            return z3;
        }
        return Boolean.parseBoolean(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void x(ViewDataBinding viewDataBinding) {
        viewDataBinding.w();
    }

    private static int x0(String str, int i4) {
        int i5 = 0;
        while (i4 < str.length()) {
            i5 = (i5 * 10) + (str.charAt(i4) - '0');
            i4++;
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y0() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f13990h0.poll();
            if (poll != null) {
                if (poll instanceof F) {
                    ((F) poll).e();
                }
            } else {
                return;
            }
        }
    }

    private static int z(String str, int i4, i iVar, int i5) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f14011a[i5];
        int length = strArr.length;
        while (i4 < length) {
            if (TextUtils.equals(subSequence, strArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public void A0(@N z zVar) {
        androidx.databinding.i<z, ViewDataBinding, Void> iVar = this.f13997K;
        if (iVar != null) {
            iVar.o(zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B0() {
        ViewDataBinding viewDataBinding = this.f14003Q;
        if (viewDataBinding != null) {
            viewDataBinding.B0();
            return;
        }
        androidx.lifecycle.E e4 = this.f14004R;
        if (e4 != null && !e4.getLifecycle().b().e(Lifecycle.State.STARTED)) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f13993G) {
                    return;
                }
                this.f13993G = true;
                if (f13984b0) {
                    this.f13999M.postFrameCallback(this.f14000N);
                } else {
                    this.f14001O.post(this.f13992F);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C() {
        v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L0(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f14003Q = this;
        }
    }

    @K
    public void M0(@P androidx.lifecycle.E e4) {
        if (e4 instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        androidx.lifecycle.E e5 = this.f14004R;
        if (e5 == e4) {
            return;
        }
        if (e5 != null) {
            e5.getLifecycle().d(this.f14005S);
        }
        this.f14004R = e4;
        if (e4 != null) {
            if (this.f14005S == null) {
                this.f14005S = new OnStartListener(this, null);
            }
            e4.getLifecycle().a(this.f14005S);
        }
        for (F f4 : this.f13995I) {
            if (f4 != null) {
                f4.c(e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void N0(View view) {
        view.setTag(C2420a.C0547a.f57880a, this);
    }

    protected void O0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(C2420a.C0547a.f57880a, this);
        }
    }

    @Override // i0.InterfaceC2066b
    @N
    public View d() {
        return this.f13996J;
    }

    @P
    public androidx.lifecycle.E e0() {
        return this.f14004R;
    }

    protected Object f0(int i4) {
        F f4 = this.f13995I[i4];
        if (f4 == null) {
            return null;
        }
        return f4.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void g0(int i4, Object obj, int i5) {
        if (!this.f14006T && !this.f14007U && o0(i4, obj, i5)) {
            B0();
        }
    }

    public abstract boolean g1(int i4, @P Object obj);

    public abstract boolean h0();

    public void h1() {
        for (F f4 : this.f13995I) {
            if (f4 != null) {
                f4.e();
            }
        }
    }

    protected boolean i1(int i4) {
        F f4 = this.f13995I[i4];
        if (f4 != null) {
            return f4.e();
        }
        return false;
    }

    public abstract void j0();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean j1(int i4, LiveData<?> liveData) {
        this.f14006T = true;
        try {
            return n1(i4, liveData, f13988f0);
        } finally {
            this.f14006T = false;
        }
    }

    protected boolean k1(int i4, u uVar) {
        return n1(i4, uVar, f13985c0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l1(int i4, w wVar) {
        return n1(i4, wVar, f13986d0);
    }

    protected boolean m1(int i4, x xVar) {
        return n1(i4, xVar, f13987e0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean n1(int i4, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return i1(i4);
        }
        F f4 = this.f13995I[i4];
        if (f4 == null) {
            z0(i4, obj, jVar);
            return true;
        }
        if (f4.b() == obj) {
            return false;
        }
        i1(i4);
        z0(i4, obj, jVar);
        return true;
    }

    protected abstract boolean o0(int i4, Object obj, int i5);

    public void q(@N z zVar) {
        if (this.f13997K == null) {
            this.f13997K = new androidx.databinding.i<>(f13989g0);
        }
        this.f13997K.a(zVar);
    }

    protected void u(Class<?> cls) {
        if (this.f14002P != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected abstract void v();

    public void y() {
        ViewDataBinding viewDataBinding = this.f14003Q;
        if (viewDataBinding == null) {
            w();
        } else {
            viewDataBinding.y();
        }
    }

    protected void z0(int i4, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return;
        }
        F f4 = this.f13995I[i4];
        if (f4 == null) {
            f4 = jVar.a(this, i4, f13990h0);
            this.f13995I[i4] = f4;
            androidx.lifecycle.E e4 = this.f14004R;
            if (e4 != null) {
                f4.c(e4);
            }
        }
        f4.d(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewDataBinding(Object obj, View view, int i4) {
        this(s(obj), view, i4);
    }
}
