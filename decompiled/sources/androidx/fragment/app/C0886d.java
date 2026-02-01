package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.y1;
import androidx.core.os.C0742e;
import androidx.core.view.C0823k0;
import androidx.core.view.C0835n0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0802d0;
import androidx.fragment.app.C0890h;
import androidx.fragment.app.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0886d extends M {

    /* renamed from: androidx.fragment.app.d$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15253a;

        static {
            int[] iArr = new int[M.e.c.values().length];
            f15253a = iArr;
            try {
                iArr[M.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15253a[M.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15253a[M.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15253a[M.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ List f15254E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ M.e f15255F;

        b(List list, M.e eVar) {
            this.f15254E = list;
            this.f15255F = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15254E.contains(this.f15255F)) {
                this.f15254E.remove(this.f15255F);
                C0886d.this.s(this.f15255F);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f15257a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f15258b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f15259c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M.e f15260d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f15261e;

        c(ViewGroup viewGroup, View view, boolean z3, M.e eVar, k kVar) {
            this.f15257a = viewGroup;
            this.f15258b = view;
            this.f15259c = z3;
            this.f15260d = eVar;
            this.f15261e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f15257a.endViewTransition(this.f15258b);
            if (this.f15259c) {
                this.f15260d.e().b(this.f15258b);
            }
            this.f15261e.a();
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "Animator from operation " + this.f15260d + " has ended.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0131d implements C0742e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f15263a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M.e f15264b;

        C0131d(Animator animator, M.e eVar) {
            this.f15263a = animator;
            this.f15264b = eVar;
        }

        @Override // androidx.core.os.C0742e.b
        public void onCancel() {
            this.f15263a.end();
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "Animator from operation " + this.f15264b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M.e f15266a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f15267b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f15268c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f15269d;

        /* renamed from: androidx.fragment.app.d$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f15267b.endViewTransition(eVar.f15268c);
                e.this.f15269d.a();
            }
        }

        e(M.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f15266a = eVar;
            this.f15267b = viewGroup;
            this.f15268c = view;
            this.f15269d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f15267b.post(new a());
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "Animation from operation " + this.f15266a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "Animation from operation " + this.f15266a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$f */
    /* loaded from: classes.dex */
    public class f implements C0742e.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f15272a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f15273b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f15274c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M.e f15275d;

        f(View view, ViewGroup viewGroup, k kVar, M.e eVar) {
            this.f15272a = view;
            this.f15273b = viewGroup;
            this.f15274c = kVar;
            this.f15275d = eVar;
        }

        @Override // androidx.core.os.C0742e.b
        public void onCancel() {
            this.f15272a.clearAnimation();
            this.f15273b.endViewTransition(this.f15272a);
            this.f15274c.a();
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "Animation from operation " + this.f15275d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ M.e f15277E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ M.e f15278F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ boolean f15279G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f15280H;

        g(M.e eVar, M.e eVar2, boolean z3, androidx.collection.a aVar) {
            this.f15277E = eVar;
            this.f15278F = eVar2;
            this.f15279G = z3;
            this.f15280H = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            H.a(this.f15277E.f(), this.f15278F.f(), this.f15279G, this.f15280H, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ J f15282E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ View f15283F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Rect f15284G;

        h(J j4, View view, Rect rect) {
            this.f15282E = j4;
            this.f15283F = view;
            this.f15284G = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15282E.h(this.f15283F, this.f15284G);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ ArrayList f15286E;

        i(ArrayList arrayList) {
            this.f15286E = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            H.e(this.f15286E, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ m f15288E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ M.e f15289F;

        j(m mVar, M.e eVar) {
            this.f15288E = mVar;
            this.f15289F = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15288E.a();
            if (FragmentManager.S0(2)) {
                Log.v(FragmentManager.f15087P, "Transition for operation " + this.f15289F + "has completed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.d$k */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f15291c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15292d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.P
        private C0890h.a f15293e;

        k(@androidx.annotation.N M.e eVar, @androidx.annotation.N C0742e c0742e, boolean z3) {
            super(eVar, c0742e);
            this.f15292d = false;
            this.f15291c = z3;
        }

        @androidx.annotation.P
        C0890h.a e(@androidx.annotation.N Context context) {
            boolean z3;
            if (this.f15292d) {
                return this.f15293e;
            }
            Fragment f4 = b().f();
            if (b().e() == M.e.c.VISIBLE) {
                z3 = true;
            } else {
                z3 = false;
            }
            C0890h.a b4 = C0890h.b(context, f4, z3, this.f15291c);
            this.f15293e = b4;
            this.f15292d = true;
            return b4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.d$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        private final M.e f15294a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.N
        private final C0742e f15295b;

        l(@androidx.annotation.N M.e eVar, @androidx.annotation.N C0742e c0742e) {
            this.f15294a = eVar;
            this.f15295b = c0742e;
        }

        void a() {
            this.f15294a.d(this.f15295b);
        }

        @androidx.annotation.N
        M.e b() {
            return this.f15294a;
        }

        @androidx.annotation.N
        C0742e c() {
            return this.f15295b;
        }

        boolean d() {
            M.e.c cVar;
            M.e.c f4 = M.e.c.f(this.f15294a.f().f15026m0);
            M.e.c e4 = this.f15294a.e();
            if (f4 != e4 && (f4 == (cVar = M.e.c.VISIBLE) || e4 == cVar)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.d$m */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        private final Object f15296c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f15297d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.P
        private final Object f15298e;

        m(@androidx.annotation.N M.e eVar, @androidx.annotation.N C0742e c0742e, boolean z3, boolean z4) {
            super(eVar, c0742e);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (eVar.e() == M.e.c.VISIBLE) {
                if (z3) {
                    enterTransition = eVar.f().getReenterTransition();
                } else {
                    enterTransition = eVar.f().getEnterTransition();
                }
                this.f15296c = enterTransition;
                if (z3) {
                    allowEnterTransitionOverlap = eVar.f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = eVar.f().getAllowEnterTransitionOverlap();
                }
                this.f15297d = allowEnterTransitionOverlap;
            } else {
                if (z3) {
                    exitTransition = eVar.f().getReturnTransition();
                } else {
                    exitTransition = eVar.f().getExitTransition();
                }
                this.f15296c = exitTransition;
                this.f15297d = true;
            }
            if (z4) {
                if (z3) {
                    this.f15298e = eVar.f().getSharedElementReturnTransition();
                    return;
                } else {
                    this.f15298e = eVar.f().getSharedElementEnterTransition();
                    return;
                }
            }
            this.f15298e = null;
        }

        @androidx.annotation.P
        private J f(Object obj) {
            if (obj == null) {
                return null;
            }
            J j4 = H.f15164a;
            if (j4 != null && j4.e(obj)) {
                return j4;
            }
            J j5 = H.f15165b;
            if (j5 != null && j5.e(obj)) {
                return j5;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        @androidx.annotation.P
        J e() {
            J f4 = f(this.f15296c);
            J f5 = f(this.f15298e);
            if (f4 != null && f5 != null && f4 != f5) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f15296c + " which uses a different Transition  type than its shared element transition " + this.f15298e);
            }
            if (f4 == null) {
                return f5;
            }
            return f4;
        }

        @androidx.annotation.P
        public Object g() {
            return this.f15298e;
        }

        @androidx.annotation.P
        Object h() {
            return this.f15296c;
        }

        public boolean i() {
            if (this.f15298e != null) {
                return true;
            }
            return false;
        }

        boolean j() {
            return this.f15297d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0886d(@androidx.annotation.N ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(@androidx.annotation.N List<k> list, @androidx.annotation.N List<M.e> list2, boolean z3, @androidx.annotation.N Map<M.e, Boolean> map) {
        int i4;
        boolean z4;
        Context context;
        View view;
        int i5;
        boolean z5;
        M.e eVar;
        ViewGroup m4 = m();
        Context context2 = m4.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = list.iterator();
        boolean z6 = false;
        while (true) {
            i4 = 2;
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (next.d()) {
                next.a();
            } else {
                C0890h.a e4 = next.e(context2);
                if (e4 == null) {
                    next.a();
                } else {
                    Animator animator = e4.f15309b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        M.e b4 = next.b();
                        Fragment f4 = b4.f();
                        if (Boolean.TRUE.equals(map.get(b4))) {
                            if (FragmentManager.S0(2)) {
                                Log.v(FragmentManager.f15087P, "Ignoring Animator set on " + f4 + " as this Fragment was involved in a Transition.");
                            }
                            next.a();
                        } else {
                            if (b4.e() == M.e.c.GONE) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                list2.remove(b4);
                            }
                            View view2 = f4.f15026m0;
                            m4.startViewTransition(view2);
                            animator.addListener(new c(m4, view2, z5, b4, next));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.S0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                eVar = b4;
                                sb.append(eVar);
                                sb.append(" has started.");
                                Log.v(FragmentManager.f15087P, sb.toString());
                            } else {
                                eVar = b4;
                            }
                            next.c().d(new C0131d(animator, eVar));
                            z6 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            M.e b5 = kVar.b();
            Fragment f5 = b5.f();
            if (z3) {
                if (FragmentManager.S0(i4)) {
                    Log.v(FragmentManager.f15087P, "Ignoring Animation set on " + f5 + " as Animations cannot run alongside Transitions.");
                }
                kVar.a();
            } else if (z6) {
                if (FragmentManager.S0(i4)) {
                    Log.v(FragmentManager.f15087P, "Ignoring Animation set on " + f5 + " as Animations cannot run alongside Animators.");
                }
                kVar.a();
            } else {
                View view3 = f5.f15026m0;
                Animation animation = (Animation) androidx.core.util.u.l(((C0890h.a) androidx.core.util.u.l(kVar.e(context2))).f15308a);
                if (b5.e() != M.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar.a();
                    z4 = z6;
                    context = context2;
                    i5 = i4;
                    view = view3;
                } else {
                    m4.startViewTransition(view3);
                    C0890h.b bVar = new C0890h.b(animation, m4, view3);
                    z4 = z6;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new e(b5, m4, view3, kVar));
                    view.startAnimation(bVar);
                    i5 = 2;
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "Animation from operation " + b5 + " has started.");
                    }
                }
                kVar.c().d(new f(view, m4, kVar, b5));
                i4 = i5;
                z6 = z4;
                context2 = context;
            }
        }
    }

    @androidx.annotation.N
    private Map<M.e, Boolean> x(@androidx.annotation.N List<m> list, @androidx.annotation.N List<M.e> list2, boolean z3, @androidx.annotation.P M.e eVar, @androidx.annotation.P M.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        M.e eVar3;
        M.e eVar4;
        View view2;
        androidx.collection.a aVar;
        M.e eVar5;
        HashMap hashMap;
        ArrayList<View> arrayList3;
        View view3;
        J j4;
        ArrayList<View> arrayList4;
        M.e eVar6;
        Rect rect;
        y1 i4;
        y1 k4;
        ArrayList<String> arrayList5;
        int i5;
        View view4;
        String b4;
        ArrayList<String> arrayList6;
        boolean z4 = z3;
        M.e eVar7 = eVar;
        M.e eVar8 = eVar2;
        HashMap hashMap2 = new HashMap();
        J j5 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                J e4 = mVar.e();
                if (j5 == null) {
                    j5 = e4;
                } else if (e4 != null && j5 != e4) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (j5 == null) {
            for (m mVar2 : list) {
                hashMap2.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap2;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Iterator<m> it = list.iterator();
        Object obj3 = null;
        View view6 = null;
        boolean z5 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            str = FragmentManager.f15087P;
            if (!hasNext) {
                break;
            }
            m next = it.next();
            if (!next.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                eVar5 = eVar7;
                hashMap = hashMap2;
                arrayList3 = arrayList7;
                view3 = view5;
                j4 = j5;
                arrayList4 = arrayList8;
                eVar6 = eVar8;
                rect = rect2;
                view6 = view6;
            } else {
                Object w3 = j5.w(j5.f(next.g()));
                ArrayList<String> t3 = eVar2.f().t();
                ArrayList<String> t4 = eVar.f().t();
                ArrayList<String> u3 = eVar.f().u();
                View view7 = view6;
                HashMap hashMap3 = hashMap2;
                int i6 = 0;
                while (i6 < u3.size()) {
                    int indexOf = t3.indexOf(u3.get(i6));
                    ArrayList<String> arrayList9 = u3;
                    if (indexOf != -1) {
                        t3.set(indexOf, t4.get(i6));
                    }
                    i6++;
                    u3 = arrayList9;
                }
                ArrayList<String> u4 = eVar2.f().u();
                if (!z4) {
                    i4 = eVar.f().k();
                    k4 = eVar2.f().i();
                } else {
                    i4 = eVar.f().i();
                    k4 = eVar2.f().k();
                }
                int size = t3.size();
                View view8 = view5;
                int i7 = 0;
                while (i7 < size) {
                    aVar2.put(t3.get(i7), u4.get(i7));
                    i7++;
                    size = size;
                    rect2 = rect2;
                }
                Rect rect3 = rect2;
                if (FragmentManager.S0(2)) {
                    Log.v(FragmentManager.f15087P, ">>> entering view names <<<");
                    for (Iterator<String> it2 = u4.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v(FragmentManager.f15087P, "Name: " + it2.next());
                    }
                    Log.v(FragmentManager.f15087P, ">>> exiting view names <<<");
                    for (Iterator<String> it3 = t3.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v(FragmentManager.f15087P, "Name: " + it3.next());
                    }
                }
                androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                u(aVar3, eVar.f().f15026m0);
                aVar3.u(t3);
                if (i4 != null) {
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "Executing exit callback for operation " + eVar7);
                    }
                    i4.d(t3, aVar3);
                    int size2 = t3.size() - 1;
                    while (size2 >= 0) {
                        String str4 = t3.get(size2);
                        View view9 = aVar3.get(str4);
                        if (view9 == null) {
                            aVar2.remove(str4);
                            arrayList6 = t3;
                        } else {
                            arrayList6 = t3;
                            if (!str4.equals(C0823k0.x0(view9))) {
                                aVar2.put(C0823k0.x0(view9), (String) aVar2.remove(str4));
                            }
                        }
                        size2--;
                        t3 = arrayList6;
                    }
                    arrayList5 = t3;
                } else {
                    arrayList5 = t3;
                    aVar2.u(aVar3.keySet());
                }
                androidx.collection.a<String, View> aVar4 = new androidx.collection.a<>();
                u(aVar4, eVar2.f().f15026m0);
                aVar4.u(u4);
                aVar4.u(aVar2.values());
                if (k4 != null) {
                    if (FragmentManager.S0(2)) {
                        Log.v(FragmentManager.f15087P, "Executing enter callback for operation " + eVar8);
                    }
                    k4.d(u4, aVar4);
                    for (int size3 = u4.size() - 1; size3 >= 0; size3--) {
                        String str5 = u4.get(size3);
                        View view10 = aVar4.get(str5);
                        if (view10 == null) {
                            String b5 = H.b(aVar2, str5);
                            if (b5 != null) {
                                aVar2.remove(b5);
                            }
                        } else if (!str5.equals(C0823k0.x0(view10)) && (b4 = H.b(aVar2, str5)) != null) {
                            aVar2.put(b4, C0823k0.x0(view10));
                        }
                    }
                } else {
                    H.d(aVar2, aVar4);
                }
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList8;
                    eVar5 = eVar7;
                    arrayList3 = arrayList7;
                    j4 = j5;
                    view6 = view7;
                    view3 = view8;
                    hashMap = hashMap3;
                    rect = rect3;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    H.a(eVar2.f(), eVar.f(), z4, aVar3, true);
                    aVar = aVar2;
                    ArrayList<View> arrayList10 = arrayList8;
                    ViewTreeObserverOnPreDrawListenerC0802d0.a(m(), new g(eVar2, eVar, z3, aVar4));
                    arrayList7.addAll(aVar3.values());
                    if (arrayList5.isEmpty()) {
                        i5 = 0;
                        view6 = view7;
                    } else {
                        i5 = 0;
                        view6 = aVar3.get(arrayList5.get(0));
                        j5.r(w3, view6);
                    }
                    arrayList10.addAll(aVar4.values());
                    if (u4.isEmpty() || (view4 = aVar4.get(u4.get(i5))) == null) {
                        rect = rect3;
                        view3 = view8;
                    } else {
                        rect = rect3;
                        ViewTreeObserverOnPreDrawListenerC0802d0.a(m(), new h(j5, view4, rect));
                        view3 = view8;
                        z5 = true;
                    }
                    j5.u(w3, view3, arrayList7);
                    arrayList3 = arrayList7;
                    j4 = j5;
                    j5.p(w3, null, null, null, null, w3, arrayList10);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    arrayList4 = arrayList10;
                    hashMap = hashMap3;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = w3;
                }
            }
            view5 = view3;
            rect2 = rect;
            arrayList7 = arrayList3;
            arrayList8 = arrayList4;
            eVar8 = eVar6;
            z4 = z3;
            hashMap2 = hashMap;
            j5 = j4;
            eVar7 = eVar5;
            aVar2 = aVar;
        }
        View view11 = view6;
        androidx.collection.a aVar5 = aVar2;
        M.e eVar9 = eVar7;
        HashMap hashMap4 = hashMap2;
        ArrayList<View> arrayList11 = arrayList7;
        View view12 = view5;
        J j6 = j5;
        ArrayList<View> arrayList12 = arrayList8;
        M.e eVar10 = eVar8;
        Rect rect4 = rect2;
        ArrayList arrayList13 = new ArrayList();
        Iterator<m> it4 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it4.hasNext()) {
            m next2 = it4.next();
            if (next2.d()) {
                hashMap4.put(next2.b(), Boolean.FALSE);
                next2.a();
                it4 = it4;
            } else {
                Iterator<m> it5 = it4;
                Object f4 = j6.f(next2.h());
                M.e b6 = next2.b();
                boolean z6 = obj3 != null && (b6 == eVar9 || b6 == eVar10);
                if (f4 == null) {
                    if (!z6) {
                        hashMap4.put(b6, Boolean.FALSE);
                        next2.a();
                    }
                    view = view12;
                    str3 = str;
                    arrayList = arrayList11;
                    arrayList2 = arrayList12;
                    obj = obj4;
                    obj2 = obj5;
                    eVar3 = eVar10;
                    view2 = view11;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList14 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList14, b6.f().f15026m0);
                    if (z6) {
                        if (b6 == eVar9) {
                            arrayList14.removeAll(arrayList11);
                        } else {
                            arrayList14.removeAll(arrayList12);
                        }
                    }
                    if (arrayList14.isEmpty()) {
                        j6.a(f4, view12);
                        view = view12;
                        arrayList = arrayList11;
                        arrayList2 = arrayList12;
                        obj2 = obj5;
                        eVar4 = b6;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        j6.b(f4, arrayList14);
                        view = view12;
                        obj = obj6;
                        arrayList = arrayList11;
                        obj2 = obj5;
                        arrayList2 = arrayList12;
                        eVar3 = eVar10;
                        j6.p(f4, f4, arrayList14, null, null, null, null);
                        if (b6.e() == M.e.c.GONE) {
                            eVar4 = b6;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList15 = new ArrayList<>(arrayList14);
                            arrayList15.remove(eVar4.f().f15026m0);
                            j6.o(f4, eVar4.f().f15026m0, arrayList15);
                            ViewTreeObserverOnPreDrawListenerC0802d0.a(m(), new i(arrayList14));
                        } else {
                            eVar4 = b6;
                        }
                    }
                    if (eVar4.e() == M.e.c.VISIBLE) {
                        arrayList13.addAll(arrayList14);
                        if (z5) {
                            j6.q(f4, rect4);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        j6.r(f4, view2);
                    }
                    hashMap4.put(eVar4, Boolean.TRUE);
                    if (next2.j()) {
                        obj2 = j6.k(obj2, f4, null);
                    } else {
                        obj = j6.k(obj, f4, null);
                    }
                }
                it4 = it5;
                obj4 = obj;
                view11 = view2;
                obj5 = obj2;
                eVar10 = eVar3;
                str = str3;
                view12 = view;
                arrayList11 = arrayList;
                arrayList12 = arrayList2;
            }
        }
        String str6 = str;
        ArrayList<View> arrayList16 = arrayList11;
        ArrayList<View> arrayList17 = arrayList12;
        M.e eVar11 = eVar10;
        Object j7 = j6.j(obj5, obj4, obj3);
        if (j7 == null) {
            return hashMap4;
        }
        for (m mVar3 : list) {
            if (!mVar3.d()) {
                Object h4 = mVar3.h();
                M.e b7 = mVar3.b();
                boolean z7 = obj3 != null && (b7 == eVar9 || b7 == eVar11);
                if (h4 == null && !z7) {
                    str2 = str6;
                } else if (!C0823k0.U0(m())) {
                    if (FragmentManager.S0(2)) {
                        str2 = str6;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b7);
                    } else {
                        str2 = str6;
                    }
                    mVar3.a();
                } else {
                    str2 = str6;
                    j6.s(mVar3.b().f(), j7, mVar3.c(), new j(mVar3, b7));
                }
                str6 = str2;
            }
        }
        String str7 = str6;
        if (!C0823k0.U0(m())) {
            return hashMap4;
        }
        H.e(arrayList13, 4);
        ArrayList<String> l4 = j6.l(arrayList17);
        if (FragmentManager.S0(2)) {
            Log.v(str7, ">>>>> Beginning transition <<<<<");
            Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it6 = arrayList16.iterator();
            while (it6.hasNext()) {
                View next3 = it6.next();
                Log.v(str7, "View: " + next3 + " Name: " + C0823k0.x0(next3));
            }
            Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it7 = arrayList17.iterator();
            while (it7.hasNext()) {
                View next4 = it7.next();
                Log.v(str7, "View: " + next4 + " Name: " + C0823k0.x0(next4));
            }
        }
        j6.c(m(), j7);
        j6.t(m(), arrayList16, arrayList17, l4, aVar5);
        H.e(arrayList13, 0);
        j6.v(obj3, arrayList16, arrayList17);
        return hashMap4;
    }

    @Override // androidx.fragment.app.M
    void f(@androidx.annotation.N List<M.e> list, boolean z3) {
        M.e eVar = null;
        M.e eVar2 = null;
        for (M.e eVar3 : list) {
            M.e.c f4 = M.e.c.f(eVar3.f().f15026m0);
            int i4 = a.f15253a[eVar3.e().ordinal()];
            if (i4 != 1 && i4 != 2 && i4 != 3) {
                if (i4 == 4 && f4 != M.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (f4 == M.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (M.e eVar4 : list) {
            C0742e c0742e = new C0742e();
            eVar4.j(c0742e);
            arrayList.add(new k(eVar4, c0742e, z3));
            C0742e c0742e2 = new C0742e();
            eVar4.j(c0742e2);
            boolean z4 = false;
            if (z3) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, c0742e2, z3, z4));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z4 = true;
                arrayList2.add(new m(eVar4, c0742e2, z3, z4));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, c0742e2, z3, z4));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z4 = true;
                arrayList2.add(new m(eVar4, c0742e2, z3, z4));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<M.e, Boolean> x3 = x(arrayList2, arrayList3, z3, eVar, eVar2);
        w(arrayList, arrayList3, x3.containsValue(Boolean.TRUE), x3);
        Iterator<M.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        arrayList3.clear();
        if (FragmentManager.S0(2)) {
            Log.v(FragmentManager.f15087P, "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(@androidx.annotation.N M.e eVar) {
        eVar.e().b(eVar.f().f15026m0);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0835n0.c(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    void u(Map<String, View> map, @androidx.annotation.N View view) {
        String x02 = C0823k0.x0(view);
        if (x02 != null) {
            map.put(x02, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(@androidx.annotation.N androidx.collection.a<String, View> aVar, @androidx.annotation.N Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C0823k0.x0(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
