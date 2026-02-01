package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class State {

    /* renamed from: j, reason: collision with root package name */
    static final int f7655j = -1;

    /* renamed from: k, reason: collision with root package name */
    static final int f7656k = 0;

    /* renamed from: l, reason: collision with root package name */
    static final int f7657l = 1;

    /* renamed from: m, reason: collision with root package name */
    static final int f7658m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final Integer f7659n = 0;

    /* renamed from: a, reason: collision with root package name */
    private c f7660a;

    /* renamed from: b, reason: collision with root package name */
    protected HashMap<Object, f> f7661b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    protected HashMap<Object, d> f7662c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f7663d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public final androidx.constraintlayout.core.state.a f7664e;

    /* renamed from: f, reason: collision with root package name */
    private int f7665f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList<Object> f7666g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList<ConstraintWidget> f7667h;

    /* renamed from: i, reason: collision with root package name */
    boolean f7668i;

    /* loaded from: classes.dex */
    public enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    /* loaded from: classes.dex */
    public enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* loaded from: classes.dex */
    public enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* loaded from: classes.dex */
    public enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7669a;

        static {
            int[] iArr = new int[Helper.values().length];
            f7669a = iArr;
            try {
                iArr[Helper.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7669a[Helper.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7669a[Helper.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7669a[Helper.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7669a[Helper.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public State() {
        androidx.constraintlayout.core.state.a aVar = new androidx.constraintlayout.core.state.a(this);
        this.f7664e = aVar;
        this.f7665f = 0;
        this.f7666g = new ArrayList<>();
        this.f7667h = new ArrayList<>();
        this.f7668i = true;
        this.f7661b.put(f7659n, aVar);
    }

    private String i() {
        int i4 = this.f7665f;
        this.f7665f = i4 + 1;
        return "__HELPER_KEY_" + i4 + "__";
    }

    public void A(String str, String str2) {
        ArrayList<String> arrayList;
        androidx.constraintlayout.core.state.a f4 = f(str);
        if (f4 instanceof androidx.constraintlayout.core.state.a) {
            f4.u0(str2);
            if (!this.f7663d.containsKey(str2)) {
                arrayList = new ArrayList<>();
                this.f7663d.put(str2, arrayList);
            } else {
                arrayList = this.f7663d.get(str2);
            }
            arrayList.add(str);
        }
    }

    public State B(Dimension dimension) {
        this.f7664e.y0(dimension);
        return this;
    }

    public androidx.constraintlayout.core.state.helpers.h C() {
        return (androidx.constraintlayout.core.state.helpers.h) o(null, Helper.VERTICAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.h D(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.h hVar = (androidx.constraintlayout.core.state.helpers.h) o(null, Helper.VERTICAL_CHAIN);
        hVar.M0(objArr);
        return hVar;
    }

    public androidx.constraintlayout.core.state.helpers.f E(Object obj) {
        return m(obj, 1);
    }

    public State F(Dimension dimension) {
        return B(dimension);
    }

    public void a(androidx.constraintlayout.core.widgets.d dVar) {
        d dVar2;
        androidx.constraintlayout.core.widgets.h N02;
        androidx.constraintlayout.core.widgets.h N03;
        dVar.p2();
        this.f7664e.W().a(this, dVar, 0);
        this.f7664e.E().a(this, dVar, 1);
        for (Object obj : this.f7662c.keySet()) {
            androidx.constraintlayout.core.widgets.h N04 = this.f7662c.get(obj).N0();
            if (N04 != null) {
                f fVar = this.f7661b.get(obj);
                if (fVar == null) {
                    fVar = f(obj);
                }
                fVar.c(N04);
            }
        }
        for (Object obj2 : this.f7661b.keySet()) {
            f fVar2 = this.f7661b.get(obj2);
            if (fVar2 != this.f7664e && (fVar2.e() instanceof d) && (N03 = ((d) fVar2.e()).N0()) != null) {
                f fVar3 = this.f7661b.get(obj2);
                if (fVar3 == null) {
                    fVar3 = f(obj2);
                }
                fVar3.c(N03);
            }
        }
        Iterator<Object> it = this.f7661b.keySet().iterator();
        while (it.hasNext()) {
            f fVar4 = this.f7661b.get(it.next());
            if (fVar4 != this.f7664e) {
                ConstraintWidget b4 = fVar4.b();
                b4.j1(fVar4.getKey().toString());
                b4.S1(null);
                if (fVar4.e() instanceof androidx.constraintlayout.core.state.helpers.f) {
                    fVar4.a();
                }
                dVar.b(b4);
            } else {
                fVar4.c(dVar);
            }
        }
        Iterator<Object> it2 = this.f7662c.keySet().iterator();
        while (it2.hasNext()) {
            d dVar3 = this.f7662c.get(it2.next());
            if (dVar3.N0() != null) {
                Iterator<Object> it3 = dVar3.f7736m0.iterator();
                while (it3.hasNext()) {
                    dVar3.N0().b(this.f7661b.get(it3.next()).b());
                }
                dVar3.a();
            } else {
                dVar3.a();
            }
        }
        Iterator<Object> it4 = this.f7661b.keySet().iterator();
        while (it4.hasNext()) {
            f fVar5 = this.f7661b.get(it4.next());
            if (fVar5 != this.f7664e && (fVar5.e() instanceof d) && (N02 = (dVar2 = (d) fVar5.e()).N0()) != null) {
                Iterator<Object> it5 = dVar2.f7736m0.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    f fVar6 = this.f7661b.get(next);
                    if (fVar6 != null) {
                        N02.b(fVar6.b());
                    } else if (next instanceof f) {
                        N02.b(((f) next).b());
                    } else {
                        System.out.println("couldn't find reference for " + next);
                    }
                }
                fVar5.a();
            }
        }
        for (Object obj3 : this.f7661b.keySet()) {
            f fVar7 = this.f7661b.get(obj3);
            fVar7.a();
            ConstraintWidget b5 = fVar7.b();
            if (b5 != null && obj3 != null) {
                b5.f7997o = obj3.toString();
            }
        }
    }

    public androidx.constraintlayout.core.state.helpers.c b(Object obj, Direction direction) {
        androidx.constraintlayout.core.state.a f4 = f(obj);
        if (f4.e() == null || !(f4.e() instanceof androidx.constraintlayout.core.state.helpers.c)) {
            androidx.constraintlayout.core.state.helpers.c cVar = new androidx.constraintlayout.core.state.helpers.c(this);
            cVar.Q0(direction);
            f4.q0(cVar);
        }
        return (androidx.constraintlayout.core.state.helpers.c) f4.e();
    }

    public void c(Object obj) {
        this.f7666g.add(obj);
        this.f7668i = true;
    }

    public androidx.constraintlayout.core.state.helpers.a d(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.a aVar = (androidx.constraintlayout.core.state.helpers.a) o(null, Helper.ALIGN_HORIZONTALLY);
        aVar.M0(objArr);
        return aVar;
    }

    public androidx.constraintlayout.core.state.helpers.b e(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.b bVar = (androidx.constraintlayout.core.state.helpers.b) o(null, Helper.ALIGN_VERTICALLY);
        bVar.M0(objArr);
        return bVar;
    }

    public androidx.constraintlayout.core.state.a f(Object obj) {
        f fVar = this.f7661b.get(obj);
        if (fVar == null) {
            fVar = h(obj);
            this.f7661b.put(obj, fVar);
            fVar.d(obj);
        }
        if (fVar instanceof androidx.constraintlayout.core.state.a) {
            return (androidx.constraintlayout.core.state.a) fVar;
        }
        return null;
    }

    public int g(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public androidx.constraintlayout.core.state.a h(Object obj) {
        return new androidx.constraintlayout.core.state.a(this);
    }

    public void j() {
        for (Object obj : this.f7661b.keySet()) {
            androidx.constraintlayout.core.state.a f4 = f(obj);
            if (f4 instanceof androidx.constraintlayout.core.state.a) {
                f4.x0(obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c k() {
        return this.f7660a;
    }

    public ArrayList<String> l(String str) {
        if (this.f7663d.containsKey(str)) {
            return this.f7663d.get(str);
        }
        return null;
    }

    public androidx.constraintlayout.core.state.helpers.f m(Object obj, int i4) {
        androidx.constraintlayout.core.state.a f4 = f(obj);
        if (f4.e() == null || !(f4.e() instanceof androidx.constraintlayout.core.state.helpers.f)) {
            androidx.constraintlayout.core.state.helpers.f fVar = new androidx.constraintlayout.core.state.helpers.f(this);
            fVar.i(i4);
            fVar.d(obj);
            f4.q0(fVar);
        }
        return (androidx.constraintlayout.core.state.helpers.f) f4.e();
    }

    public State n(Dimension dimension) {
        return z(dimension);
    }

    public d o(Object obj, Helper helper) {
        d gVar;
        if (obj == null) {
            obj = i();
        }
        d dVar = this.f7662c.get(obj);
        if (dVar == null) {
            int i4 = a.f7669a[helper.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                dVar = new d(this, helper);
                                dVar.d(obj);
                                this.f7662c.put(obj, dVar);
                            } else {
                                gVar = new androidx.constraintlayout.core.state.helpers.c(this);
                            }
                        } else {
                            gVar = new androidx.constraintlayout.core.state.helpers.b(this);
                        }
                    } else {
                        gVar = new androidx.constraintlayout.core.state.helpers.a(this);
                    }
                } else {
                    gVar = new androidx.constraintlayout.core.state.helpers.h(this);
                }
            } else {
                gVar = new androidx.constraintlayout.core.state.helpers.g(this);
            }
            dVar = gVar;
            dVar.d(obj);
            this.f7662c.put(obj, dVar);
        }
        return dVar;
    }

    public androidx.constraintlayout.core.state.helpers.g p() {
        return (androidx.constraintlayout.core.state.helpers.g) o(null, Helper.HORIZONTAL_CHAIN);
    }

    public androidx.constraintlayout.core.state.helpers.g q(Object... objArr) {
        androidx.constraintlayout.core.state.helpers.g gVar = (androidx.constraintlayout.core.state.helpers.g) o(null, Helper.HORIZONTAL_CHAIN);
        gVar.M0(objArr);
        return gVar;
    }

    public androidx.constraintlayout.core.state.helpers.f r(Object obj) {
        return m(obj, 0);
    }

    public boolean s(ConstraintWidget constraintWidget) {
        if (this.f7668i) {
            this.f7667h.clear();
            Iterator<Object> it = this.f7666g.iterator();
            while (it.hasNext()) {
                ConstraintWidget b4 = this.f7661b.get(it.next()).b();
                if (b4 != null) {
                    this.f7667h.add(b4);
                }
            }
            this.f7668i = false;
        }
        return this.f7667h.contains(constraintWidget);
    }

    public void t(Object obj, Object obj2) {
        androidx.constraintlayout.core.state.a f4 = f(obj);
        if (f4 instanceof androidx.constraintlayout.core.state.a) {
            f4.x0(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f u(Object obj) {
        return this.f7661b.get(obj);
    }

    public void v() {
        Iterator<Object> it = this.f7661b.keySet().iterator();
        while (it.hasNext()) {
            this.f7661b.get(it.next()).b().R0();
        }
        this.f7661b.clear();
        this.f7661b.put(f7659n, this.f7664e);
        this.f7662c.clear();
        this.f7663d.clear();
        this.f7666g.clear();
        this.f7668i = true;
    }

    public boolean w(int i4) {
        return this.f7664e.E().k(i4);
    }

    public boolean x(int i4) {
        return this.f7664e.W().k(i4);
    }

    public void y(c cVar) {
        this.f7660a = cVar;
    }

    public State z(Dimension dimension) {
        this.f7664e.r0(dimension);
        return this;
    }
}
