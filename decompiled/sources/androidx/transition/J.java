package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.view.C0823k0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class J implements Cloneable {

    /* renamed from: k0, reason: collision with root package name */
    private static final String f19870k0 = "Transition";

    /* renamed from: l0, reason: collision with root package name */
    static final boolean f19871l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f19872m0 = 1;

    /* renamed from: n0, reason: collision with root package name */
    private static final int f19873n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f19874o0 = 2;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f19875p0 = 3;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f19876q0 = 4;

    /* renamed from: r0, reason: collision with root package name */
    private static final int f19877r0 = 4;

    /* renamed from: s0, reason: collision with root package name */
    private static final String f19878s0 = "instance";

    /* renamed from: t0, reason: collision with root package name */
    private static final String f19879t0 = "name";

    /* renamed from: u0, reason: collision with root package name */
    private static final String f19880u0 = "id";

    /* renamed from: v0, reason: collision with root package name */
    private static final String f19881v0 = "itemId";

    /* renamed from: w0, reason: collision with root package name */
    private static final int[] f19882w0 = {2, 1, 3, 4};

    /* renamed from: x0, reason: collision with root package name */
    private static final AbstractC0991z f19883x0 = new a();

    /* renamed from: y0, reason: collision with root package name */
    private static ThreadLocal<androidx.collection.a<Animator, d>> f19884y0 = new ThreadLocal<>();

    /* renamed from: X, reason: collision with root package name */
    private ArrayList<S> f19904X;

    /* renamed from: Y, reason: collision with root package name */
    private ArrayList<S> f19905Y;

    /* renamed from: g0, reason: collision with root package name */
    N f19913g0;

    /* renamed from: h0, reason: collision with root package name */
    private f f19914h0;

    /* renamed from: i0, reason: collision with root package name */
    private androidx.collection.a<String, String> f19915i0;

    /* renamed from: E, reason: collision with root package name */
    private String f19885E = getClass().getName();

    /* renamed from: F, reason: collision with root package name */
    private long f19886F = -1;

    /* renamed from: G, reason: collision with root package name */
    long f19887G = -1;

    /* renamed from: H, reason: collision with root package name */
    private TimeInterpolator f19888H = null;

    /* renamed from: I, reason: collision with root package name */
    ArrayList<Integer> f19889I = new ArrayList<>();

    /* renamed from: J, reason: collision with root package name */
    ArrayList<View> f19890J = new ArrayList<>();

    /* renamed from: K, reason: collision with root package name */
    private ArrayList<String> f19891K = null;

    /* renamed from: L, reason: collision with root package name */
    private ArrayList<Class<?>> f19892L = null;

    /* renamed from: M, reason: collision with root package name */
    private ArrayList<Integer> f19893M = null;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList<View> f19894N = null;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList<Class<?>> f19895O = null;

    /* renamed from: P, reason: collision with root package name */
    private ArrayList<String> f19896P = null;

    /* renamed from: Q, reason: collision with root package name */
    private ArrayList<Integer> f19897Q = null;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList<View> f19898R = null;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList<Class<?>> f19899S = null;

    /* renamed from: T, reason: collision with root package name */
    private T f19900T = new T();

    /* renamed from: U, reason: collision with root package name */
    private T f19901U = new T();

    /* renamed from: V, reason: collision with root package name */
    O f19902V = null;

    /* renamed from: W, reason: collision with root package name */
    private int[] f19903W = f19882w0;

    /* renamed from: Z, reason: collision with root package name */
    boolean f19906Z = false;

    /* renamed from: a0, reason: collision with root package name */
    ArrayList<Animator> f19907a0 = new ArrayList<>();

    /* renamed from: b0, reason: collision with root package name */
    private int f19908b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f19909c0 = false;

    /* renamed from: d0, reason: collision with root package name */
    private boolean f19910d0 = false;

    /* renamed from: e0, reason: collision with root package name */
    private ArrayList<h> f19911e0 = null;

    /* renamed from: f0, reason: collision with root package name */
    private ArrayList<Animator> f19912f0 = new ArrayList<>();

    /* renamed from: j0, reason: collision with root package name */
    private AbstractC0991z f19916j0 = f19883x0;

    /* loaded from: classes.dex */
    class a extends AbstractC0991z {
        a() {
        }

        @Override // androidx.transition.AbstractC0991z
        public Path a(float f4, float f5, float f6, float f7) {
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f6, f7);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f19917a;

        b(androidx.collection.a aVar) {
            this.f19917a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19917a.remove(animator);
            J.this.f19907a0.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            J.this.f19907a0.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            J.this.w();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        View f19920a;

        /* renamed from: b, reason: collision with root package name */
        String f19921b;

        /* renamed from: c, reason: collision with root package name */
        S f19922c;

        /* renamed from: d, reason: collision with root package name */
        x0 f19923d;

        /* renamed from: e, reason: collision with root package name */
        J f19924e;

        d(View view, String str, J j4, x0 x0Var, S s4) {
            this.f19920a = view;
            this.f19921b = str;
            this.f19922c = s4;
            this.f19923d = x0Var;
            this.f19924e = j4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {
        private e() {
        }

        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t3) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t3)) {
                arrayList.add(t3);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t3) {
            if (arrayList != null) {
                arrayList.remove(t3);
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract Rect a(@androidx.annotation.N J j4);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface g {
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(@androidx.annotation.N J j4);

        void b(@androidx.annotation.N J j4);

        void c(@androidx.annotation.N J j4);

        void d(@androidx.annotation.N J j4);

        void e(@androidx.annotation.N J j4);
    }

    public J() {
    }

    private ArrayList<Integer> B(ArrayList<Integer> arrayList, int i4, boolean z3) {
        if (i4 > 0) {
            if (z3) {
                return e.a(arrayList, Integer.valueOf(i4));
            }
            return e.b(arrayList, Integer.valueOf(i4));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> C(ArrayList<T> arrayList, T t3, boolean z3) {
        if (t3 != null) {
            if (z3) {
                return e.a(arrayList, t3);
            }
            return e.b(arrayList, t3);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> H(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z3) {
        if (cls != null) {
            if (z3) {
                return e.a(arrayList, cls);
            }
            return e.b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> I(ArrayList<View> arrayList, View view, boolean z3) {
        if (view != null) {
            if (z3) {
                return e.a(arrayList, view);
            }
            return e.b(arrayList, view);
        }
        return arrayList;
    }

    private static androidx.collection.a<Animator, d> S() {
        androidx.collection.a<Animator, d> aVar = f19884y0.get();
        if (aVar == null) {
            androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
            f19884y0.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    private static boolean b0(int i4) {
        return i4 >= 1 && i4 <= 4;
    }

    private static boolean d0(S s4, S s5, String str) {
        Object obj = s4.f19959a.get(str);
        Object obj2 = s5.f19959a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void e0(androidx.collection.a<View, S> aVar, androidx.collection.a<View, S> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View valueAt = sparseArray.valueAt(i4);
            if (valueAt != null && c0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i4))) != null && c0(view)) {
                S s4 = aVar.get(valueAt);
                S s5 = aVar2.get(view);
                if (s4 != null && s5 != null) {
                    this.f19904X.add(s4);
                    this.f19905Y.add(s5);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void f0(androidx.collection.a<View, S> aVar, androidx.collection.a<View, S> aVar2) {
        S remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m4 = aVar.m(size);
            if (m4 != null && c0(m4) && (remove = aVar2.remove(m4)) != null && c0(remove.f19960b)) {
                this.f19904X.add(aVar.o(size));
                this.f19905Y.add(remove);
            }
        }
    }

    private void g(androidx.collection.a<View, S> aVar, androidx.collection.a<View, S> aVar2) {
        for (int i4 = 0; i4 < aVar.size(); i4++) {
            S q4 = aVar.q(i4);
            if (c0(q4.f19960b)) {
                this.f19904X.add(q4);
                this.f19905Y.add(null);
            }
        }
        for (int i5 = 0; i5 < aVar2.size(); i5++) {
            S q5 = aVar2.q(i5);
            if (c0(q5.f19960b)) {
                this.f19905Y.add(q5);
                this.f19904X.add(null);
            }
        }
    }

    private void g0(androidx.collection.a<View, S> aVar, androidx.collection.a<View, S> aVar2, androidx.collection.h<View> hVar, androidx.collection.h<View> hVar2) {
        View i4;
        int A3 = hVar.A();
        for (int i5 = 0; i5 < A3; i5++) {
            View B3 = hVar.B(i5);
            if (B3 != null && c0(B3) && (i4 = hVar2.i(hVar.o(i5))) != null && c0(i4)) {
                S s4 = aVar.get(B3);
                S s5 = aVar2.get(i4);
                if (s4 != null && s5 != null) {
                    this.f19904X.add(s4);
                    this.f19905Y.add(s5);
                    aVar.remove(B3);
                    aVar2.remove(i4);
                }
            }
        }
    }

    private static void h(T t3, View view, S s4) {
        t3.f19962a.put(view, s4);
        int id = view.getId();
        if (id >= 0) {
            if (t3.f19963b.indexOfKey(id) >= 0) {
                t3.f19963b.put(id, null);
            } else {
                t3.f19963b.put(id, view);
            }
        }
        String x02 = C0823k0.x0(view);
        if (x02 != null) {
            if (t3.f19965d.containsKey(x02)) {
                t3.f19965d.put(x02, null);
            } else {
                t3.f19965d.put(x02, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (t3.f19964c.k(itemIdAtPosition) >= 0) {
                    View i4 = t3.f19964c.i(itemIdAtPosition);
                    if (i4 != null) {
                        C0823k0.Q1(i4, false);
                        t3.f19964c.p(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C0823k0.Q1(view, true);
                t3.f19964c.p(itemIdAtPosition, view);
            }
        }
    }

    private void h0(androidx.collection.a<View, S> aVar, androidx.collection.a<View, S> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View q4 = aVar3.q(i4);
            if (q4 != null && c0(q4) && (view = aVar4.get(aVar3.m(i4))) != null && c0(view)) {
                S s4 = aVar.get(q4);
                S s5 = aVar2.get(view);
                if (s4 != null && s5 != null) {
                    this.f19904X.add(s4);
                    this.f19905Y.add(s5);
                    aVar.remove(q4);
                    aVar2.remove(view);
                }
            }
        }
    }

    private static boolean i(int[] iArr, int i4) {
        int i5 = iArr[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            if (iArr[i6] == i5) {
                return true;
            }
        }
        return false;
    }

    private void i0(T t3, T t4) {
        androidx.collection.a<View, S> aVar = new androidx.collection.a<>(t3.f19962a);
        androidx.collection.a<View, S> aVar2 = new androidx.collection.a<>(t4.f19962a);
        int i4 = 0;
        while (true) {
            int[] iArr = this.f19903W;
            if (i4 < iArr.length) {
                int i5 = iArr[i4];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 4) {
                                g0(aVar, aVar2, t3.f19964c, t4.f19964c);
                            }
                        } else {
                            e0(aVar, aVar2, t3.f19963b, t4.f19963b);
                        }
                    } else {
                        h0(aVar, aVar2, t3.f19965d, t4.f19965d);
                    }
                } else {
                    f0(aVar, aVar2);
                }
                i4++;
            } else {
                g(aVar, aVar2);
                return;
            }
        }
    }

    private static int[] j0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i4 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i4] = 3;
            } else if (f19878s0.equalsIgnoreCase(trim)) {
                iArr[i4] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i4] = 2;
            } else if (f19881v0.equalsIgnoreCase(trim)) {
                iArr[i4] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i4);
                i4--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i4++;
        }
        return iArr;
    }

    private void n(View view, boolean z3) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f19893M;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.f19894N;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.f19895O;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f19895O.get(i4).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            S s4 = new S(view);
            if (z3) {
                p(s4);
            } else {
                l(s4);
            }
            s4.f19961c.add(this);
            o(s4);
            if (z3) {
                h(this.f19900T, view, s4);
            } else {
                h(this.f19901U, view, s4);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.f19897Q;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
                return;
            }
            ArrayList<View> arrayList5 = this.f19898R;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList<Class<?>> arrayList6 = this.f19899S;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    if (this.f19899S.get(i5).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                n(viewGroup.getChildAt(i6), z3);
            }
        }
    }

    private void s0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            j(animator);
        }
    }

    @androidx.annotation.N
    public J A(@androidx.annotation.N Class<?> cls, boolean z3) {
        this.f19899S = H(this.f19899S, cls, z3);
        return this;
    }

    public void A0(@androidx.annotation.P N n4) {
        this.f19913g0 = n4;
    }

    @androidx.annotation.N
    public J B0(long j4) {
        this.f19886F = j4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void C0() {
        if (this.f19908b0 == 0) {
            ArrayList<h> arrayList = this.f19911e0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19911e0.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((h) arrayList2.get(i4)).a(this);
                }
            }
            this.f19910d0 = false;
        }
        this.f19908b0++;
    }

    @androidx.annotation.N
    public J D(@androidx.annotation.D int i4, boolean z3) {
        this.f19893M = B(this.f19893M, i4, z3);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String D0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f19887G != -1) {
            str2 = str2 + "dur(" + this.f19887G + ") ";
        }
        if (this.f19886F != -1) {
            str2 = str2 + "dly(" + this.f19886F + ") ";
        }
        if (this.f19888H != null) {
            str2 = str2 + "interp(" + this.f19888H + ") ";
        }
        if (this.f19889I.size() > 0 || this.f19890J.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f19889I.size() > 0) {
                for (int i4 = 0; i4 < this.f19889I.size(); i4++) {
                    if (i4 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f19889I.get(i4);
                }
            }
            if (this.f19890J.size() > 0) {
                for (int i5 = 0; i5 < this.f19890J.size(); i5++) {
                    if (i5 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f19890J.get(i5);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    @androidx.annotation.N
    public J E(@androidx.annotation.N View view, boolean z3) {
        this.f19894N = I(this.f19894N, view, z3);
        return this;
    }

    @androidx.annotation.N
    public J F(@androidx.annotation.N Class<?> cls, boolean z3) {
        this.f19895O = H(this.f19895O, cls, z3);
        return this;
    }

    @androidx.annotation.N
    public J G(@androidx.annotation.N String str, boolean z3) {
        this.f19896P = C(this.f19896P, str, z3);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void J(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> S3 = S();
        int size = S3.size();
        if (viewGroup != null && size != 0) {
            x0 d4 = f0.d(viewGroup);
            androidx.collection.a aVar = new androidx.collection.a(S3);
            S3.clear();
            for (int i4 = size - 1; i4 >= 0; i4--) {
                d dVar = (d) aVar.q(i4);
                if (dVar.f19920a != null && d4 != null && d4.equals(dVar.f19923d)) {
                    ((Animator) aVar.m(i4)).end();
                }
            }
        }
    }

    public long K() {
        return this.f19887G;
    }

    @androidx.annotation.P
    public Rect L() {
        f fVar = this.f19914h0;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @androidx.annotation.P
    public f M() {
        return this.f19914h0;
    }

    @androidx.annotation.P
    public TimeInterpolator N() {
        return this.f19888H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S O(View view, boolean z3) {
        ArrayList<S> arrayList;
        ArrayList<S> arrayList2;
        O o4 = this.f19902V;
        if (o4 != null) {
            return o4.O(view, z3);
        }
        if (z3) {
            arrayList = this.f19904X;
        } else {
            arrayList = this.f19905Y;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                S s4 = arrayList.get(i4);
                if (s4 == null) {
                    return null;
                }
                if (s4.f19960b == view) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < 0) {
            return null;
        }
        if (z3) {
            arrayList2 = this.f19905Y;
        } else {
            arrayList2 = this.f19904X;
        }
        return arrayList2.get(i4);
    }

    @androidx.annotation.N
    public String P() {
        return this.f19885E;
    }

    @androidx.annotation.N
    public AbstractC0991z Q() {
        return this.f19916j0;
    }

    @androidx.annotation.P
    public N R() {
        return this.f19913g0;
    }

    public long T() {
        return this.f19886F;
    }

    @androidx.annotation.N
    public List<Integer> U() {
        return this.f19889I;
    }

    @androidx.annotation.P
    public List<String> V() {
        return this.f19891K;
    }

    @androidx.annotation.P
    public List<Class<?>> W() {
        return this.f19892L;
    }

    @androidx.annotation.N
    public List<View> X() {
        return this.f19890J;
    }

    @androidx.annotation.P
    public String[] Y() {
        return null;
    }

    @androidx.annotation.P
    public S Z(@androidx.annotation.N View view, boolean z3) {
        T t3;
        O o4 = this.f19902V;
        if (o4 != null) {
            return o4.Z(view, z3);
        }
        if (z3) {
            t3 = this.f19900T;
        } else {
            t3 = this.f19901U;
        }
        return t3.f19962a.get(view);
    }

    @androidx.annotation.N
    public J a(@androidx.annotation.N h hVar) {
        if (this.f19911e0 == null) {
            this.f19911e0 = new ArrayList<>();
        }
        this.f19911e0.add(hVar);
        return this;
    }

    public boolean a0(@androidx.annotation.P S s4, @androidx.annotation.P S s5) {
        if (s4 == null || s5 == null) {
            return false;
        }
        String[] Y3 = Y();
        if (Y3 != null) {
            for (String str : Y3) {
                if (!d0(s4, s5, str)) {
                }
            }
            return false;
        }
        Iterator<String> it = s4.f19959a.keySet().iterator();
        while (it.hasNext()) {
            if (d0(s4, s5, it.next())) {
            }
        }
        return false;
        return true;
    }

    @androidx.annotation.N
    public J b(@androidx.annotation.D int i4) {
        if (i4 != 0) {
            this.f19889I.add(Integer.valueOf(i4));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f19893M;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f19894N;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f19895O;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (this.f19895O.get(i4).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f19896P != null && C0823k0.x0(view) != null && this.f19896P.contains(C0823k0.x0(view))) {
            return false;
        }
        if ((this.f19889I.size() == 0 && this.f19890J.size() == 0 && (((arrayList = this.f19892L) == null || arrayList.isEmpty()) && ((arrayList2 = this.f19891K) == null || arrayList2.isEmpty()))) || this.f19889I.contains(Integer.valueOf(id)) || this.f19890J.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f19891K;
        if (arrayList6 != null && arrayList6.contains(C0823k0.x0(view))) {
            return true;
        }
        if (this.f19892L != null) {
            for (int i5 = 0; i5 < this.f19892L.size(); i5++) {
                if (this.f19892L.get(i5).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @androidx.annotation.N
    public J d(@androidx.annotation.N View view) {
        this.f19890J.add(view);
        return this;
    }

    @androidx.annotation.N
    public J e(@androidx.annotation.N Class<?> cls) {
        if (this.f19892L == null) {
            this.f19892L = new ArrayList<>();
        }
        this.f19892L.add(cls);
        return this;
    }

    @androidx.annotation.N
    public J f(@androidx.annotation.N String str) {
        if (this.f19891K == null) {
            this.f19891K = new ArrayList<>();
        }
        this.f19891K.add(str);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected void j(Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (K() >= 0) {
            animator.setDuration(K());
        }
        if (T() >= 0) {
            animator.setStartDelay(T() + animator.getStartDelay());
        }
        if (N() != null) {
            animator.setInterpolator(N());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k() {
        for (int size = this.f19907a0.size() - 1; size >= 0; size--) {
            this.f19907a0.get(size).cancel();
        }
        ArrayList<h> arrayList = this.f19911e0;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f19911e0.clone();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((h) arrayList2.get(i4)).d(this);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k0(View view) {
        if (!this.f19910d0) {
            for (int size = this.f19907a0.size() - 1; size >= 0; size--) {
                C0967a.b(this.f19907a0.get(size));
            }
            ArrayList<h> arrayList = this.f19911e0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19911e0.clone();
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((h) arrayList2.get(i4)).b(this);
                }
            }
            this.f19909c0 = true;
        }
    }

    public abstract void l(@androidx.annotation.N S s4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l0(ViewGroup viewGroup) {
        d dVar;
        this.f19904X = new ArrayList<>();
        this.f19905Y = new ArrayList<>();
        i0(this.f19900T, this.f19901U);
        androidx.collection.a<Animator, d> S3 = S();
        int size = S3.size();
        x0 d4 = f0.d(viewGroup);
        for (int i4 = size - 1; i4 >= 0; i4--) {
            Animator m4 = S3.m(i4);
            if (m4 != null && (dVar = S3.get(m4)) != null && dVar.f19920a != null && d4.equals(dVar.f19923d)) {
                S s4 = dVar.f19922c;
                View view = dVar.f19920a;
                S Z3 = Z(view, true);
                S O3 = O(view, true);
                if (Z3 == null && O3 == null) {
                    O3 = this.f19901U.f19962a.get(view);
                }
                if ((Z3 != null || O3 != null) && dVar.f19924e.a0(s4, O3)) {
                    if (!m4.isRunning() && !m4.isStarted()) {
                        S3.remove(m4);
                    } else {
                        m4.cancel();
                    }
                }
            }
        }
        u(viewGroup, this.f19900T, this.f19901U, this.f19904X, this.f19905Y);
        t0();
    }

    @androidx.annotation.N
    public J m0(@androidx.annotation.N h hVar) {
        ArrayList<h> arrayList = this.f19911e0;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.f19911e0.size() == 0) {
            this.f19911e0 = null;
        }
        return this;
    }

    @androidx.annotation.N
    public J n0(@androidx.annotation.D int i4) {
        if (i4 != 0) {
            this.f19889I.remove(Integer.valueOf(i4));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(S s4) {
        String[] b4;
        if (this.f19913g0 == null || s4.f19959a.isEmpty() || (b4 = this.f19913g0.b()) == null) {
            return;
        }
        for (String str : b4) {
            if (!s4.f19959a.containsKey(str)) {
                this.f19913g0.a(s4);
                return;
            }
        }
    }

    @androidx.annotation.N
    public J o0(@androidx.annotation.N View view) {
        this.f19890J.remove(view);
        return this;
    }

    public abstract void p(@androidx.annotation.N S s4);

    @androidx.annotation.N
    public J p0(@androidx.annotation.N Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f19892L;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(ViewGroup viewGroup, boolean z3) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        r(z3);
        if ((this.f19889I.size() <= 0 && this.f19890J.size() <= 0) || (((arrayList = this.f19891K) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f19892L) != null && !arrayList2.isEmpty()))) {
            n(viewGroup, z3);
        } else {
            for (int i4 = 0; i4 < this.f19889I.size(); i4++) {
                View findViewById = viewGroup.findViewById(this.f19889I.get(i4).intValue());
                if (findViewById != null) {
                    S s4 = new S(findViewById);
                    if (z3) {
                        p(s4);
                    } else {
                        l(s4);
                    }
                    s4.f19961c.add(this);
                    o(s4);
                    if (z3) {
                        h(this.f19900T, findViewById, s4);
                    } else {
                        h(this.f19901U, findViewById, s4);
                    }
                }
            }
            for (int i5 = 0; i5 < this.f19890J.size(); i5++) {
                View view = this.f19890J.get(i5);
                S s5 = new S(view);
                if (z3) {
                    p(s5);
                } else {
                    l(s5);
                }
                s5.f19961c.add(this);
                o(s5);
                if (z3) {
                    h(this.f19900T, view, s5);
                } else {
                    h(this.f19901U, view, s5);
                }
            }
        }
        if (!z3 && (aVar = this.f19915i0) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList3.add(this.f19900T.f19965d.remove(this.f19915i0.m(i6)));
            }
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) arrayList3.get(i7);
                if (view2 != null) {
                    this.f19900T.f19965d.put(this.f19915i0.q(i7), view2);
                }
            }
        }
    }

    @androidx.annotation.N
    public J q0(@androidx.annotation.N String str) {
        ArrayList<String> arrayList = this.f19891K;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z3) {
        if (z3) {
            this.f19900T.f19962a.clear();
            this.f19900T.f19963b.clear();
            this.f19900T.f19964c.b();
        } else {
            this.f19901U.f19962a.clear();
            this.f19901U.f19963b.clear();
            this.f19901U.f19964c.b();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r0(View view) {
        if (this.f19909c0) {
            if (!this.f19910d0) {
                for (int size = this.f19907a0.size() - 1; size >= 0; size--) {
                    C0967a.c(this.f19907a0.get(size));
                }
                ArrayList<h> arrayList = this.f19911e0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f19911e0.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((h) arrayList2.get(i4)).e(this);
                    }
                }
            }
            this.f19909c0 = false;
        }
    }

    @Override // 
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public J clone() {
        try {
            J j4 = (J) super.clone();
            j4.f19912f0 = new ArrayList<>();
            j4.f19900T = new T();
            j4.f19901U = new T();
            j4.f19904X = null;
            j4.f19905Y = null;
            return j4;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @androidx.annotation.P
    public Animator t(@androidx.annotation.N ViewGroup viewGroup, @androidx.annotation.P S s4, @androidx.annotation.P S s5) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void t0() {
        C0();
        androidx.collection.a<Animator, d> S3 = S();
        Iterator<Animator> it = this.f19912f0.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (S3.containsKey(next)) {
                C0();
                s0(next, S3);
            }
        }
        this.f19912f0.clear();
        w();
    }

    public String toString() {
        return D0("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void u(ViewGroup viewGroup, T t3, T t4, ArrayList<S> arrayList, ArrayList<S> arrayList2) {
        Animator t5;
        int i4;
        View view;
        Animator animator;
        S s4;
        Animator animator2;
        S s5;
        androidx.collection.a<Animator, d> S3 = S();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j4 = Long.MAX_VALUE;
        int i5 = 0;
        while (i5 < size) {
            S s6 = arrayList.get(i5);
            S s7 = arrayList2.get(i5);
            if (s6 != null && !s6.f19961c.contains(this)) {
                s6 = null;
            }
            if (s7 != null && !s7.f19961c.contains(this)) {
                s7 = null;
            }
            if ((s6 == null && s7 == null) || ((s6 != null && s7 != null && !a0(s6, s7)) || (t5 = t(viewGroup, s6, s7)) == null)) {
                i4 = size;
            } else {
                if (s7 != null) {
                    view = s7.f19960b;
                    String[] Y3 = Y();
                    if (Y3 != null && Y3.length > 0) {
                        s5 = new S(view);
                        i4 = size;
                        S s8 = t4.f19962a.get(view);
                        if (s8 != null) {
                            int i6 = 0;
                            while (i6 < Y3.length) {
                                Map<String, Object> map = s5.f19959a;
                                String str = Y3[i6];
                                map.put(str, s8.f19959a.get(str));
                                i6++;
                                Y3 = Y3;
                            }
                        }
                        int size2 = S3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 < size2) {
                                d dVar = S3.get(S3.m(i7));
                                if (dVar.f19922c != null && dVar.f19920a == view && dVar.f19921b.equals(P()) && dVar.f19922c.equals(s5)) {
                                    animator2 = null;
                                    break;
                                }
                                i7++;
                            } else {
                                animator2 = t5;
                                break;
                            }
                        }
                    } else {
                        i4 = size;
                        animator2 = t5;
                        s5 = null;
                    }
                    animator = animator2;
                    s4 = s5;
                } else {
                    i4 = size;
                    view = s6.f19960b;
                    animator = t5;
                    s4 = null;
                }
                if (animator != null) {
                    N n4 = this.f19913g0;
                    if (n4 != null) {
                        long c4 = n4.c(viewGroup, this, s6, s7);
                        sparseIntArray.put(this.f19912f0.size(), (int) c4);
                        j4 = Math.min(c4, j4);
                    }
                    S3.put(animator, new d(view, P(), this, f0.d(viewGroup), s4));
                    this.f19912f0.add(animator);
                    j4 = j4;
                }
            }
            i5++;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator3 = this.f19912f0.get(sparseIntArray.keyAt(i8));
                animator3.setStartDelay((sparseIntArray.valueAt(i8) - j4) + animator3.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u0(boolean z3) {
        this.f19906Z = z3;
    }

    @androidx.annotation.N
    public J v0(long j4) {
        this.f19887G = j4;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void w() {
        int i4 = this.f19908b0 - 1;
        this.f19908b0 = i4;
        if (i4 == 0) {
            ArrayList<h> arrayList = this.f19911e0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19911e0.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((h) arrayList2.get(i5)).c(this);
                }
            }
            for (int i6 = 0; i6 < this.f19900T.f19964c.A(); i6++) {
                View B3 = this.f19900T.f19964c.B(i6);
                if (B3 != null) {
                    C0823k0.Q1(B3, false);
                }
            }
            for (int i7 = 0; i7 < this.f19901U.f19964c.A(); i7++) {
                View B4 = this.f19901U.f19964c.B(i7);
                if (B4 != null) {
                    C0823k0.Q1(B4, false);
                }
            }
            this.f19910d0 = true;
        }
    }

    public void w0(@androidx.annotation.P f fVar) {
        this.f19914h0 = fVar;
    }

    @androidx.annotation.N
    public J x(@androidx.annotation.D int i4, boolean z3) {
        this.f19897Q = B(this.f19897Q, i4, z3);
        return this;
    }

    @androidx.annotation.N
    public J x0(@androidx.annotation.P TimeInterpolator timeInterpolator) {
        this.f19888H = timeInterpolator;
        return this;
    }

    @androidx.annotation.N
    public J y(@androidx.annotation.N View view, boolean z3) {
        this.f19898R = I(this.f19898R, view, z3);
        return this;
    }

    public void y0(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i4 = 0; i4 < iArr.length; i4++) {
                if (b0(iArr[i4])) {
                    if (i(iArr, i4)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.f19903W = (int[]) iArr.clone();
            return;
        }
        this.f19903W = f19882w0;
    }

    public void z0(@androidx.annotation.P AbstractC0991z abstractC0991z) {
        if (abstractC0991z == null) {
            this.f19916j0 = f19883x0;
        } else {
            this.f19916j0 = abstractC0991z;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public J(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19837c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k4 = androidx.core.content.res.n.k(obtainStyledAttributes, xmlResourceParser, v.h.f7538b, 1, -1);
        if (k4 >= 0) {
            v0(k4);
        }
        long k5 = androidx.core.content.res.n.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k5 > 0) {
            B0(k5);
        }
        int l4 = androidx.core.content.res.n.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l4 > 0) {
            x0(AnimationUtils.loadInterpolator(context, l4));
        }
        String m4 = androidx.core.content.res.n.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m4 != null) {
            y0(j0(m4));
        }
        obtainStyledAttributes.recycle();
    }
}
