package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintAnchor {

    /* renamed from: j, reason: collision with root package name */
    private static final boolean f7878j = false;

    /* renamed from: k, reason: collision with root package name */
    private static final int f7879k = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    private int f7881b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7882c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintWidget f7883d;

    /* renamed from: e, reason: collision with root package name */
    public final Type f7884e;

    /* renamed from: f, reason: collision with root package name */
    public ConstraintAnchor f7885f;

    /* renamed from: i, reason: collision with root package name */
    SolverVariable f7888i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<ConstraintAnchor> f7880a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f7886g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f7887h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7889a;

        static {
            int[] iArr = new int[Type.values().length];
            f7889a = iArr;
            try {
                iArr[Type.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7889a[Type.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7889a[Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7889a[Type.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7889a[Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7889a[Type.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7889a[Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7889a[Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7889a[Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f7883d = constraintWidget;
        this.f7884e = type;
    }

    private boolean s(ConstraintWidget constraintWidget, HashSet<ConstraintWidget> hashSet) {
        if (hashSet.contains(constraintWidget)) {
            return false;
        }
        hashSet.add(constraintWidget);
        if (constraintWidget == i()) {
            return true;
        }
        ArrayList<ConstraintAnchor> s4 = constraintWidget.s();
        int size = s4.size();
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintAnchor constraintAnchor = s4.get(i4);
            if (constraintAnchor.u(this) && constraintAnchor.p() && s(constraintAnchor.k().i(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public void A(int i4) {
        this.f7881b = i4;
        this.f7882c = true;
    }

    public void B(int i4) {
        if (p()) {
            this.f7887h = i4;
        }
    }

    public void C(int i4) {
        if (p()) {
            this.f7886g = i4;
        }
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i4) {
        return b(constraintAnchor, i4, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i4, int i5, boolean z3) {
        if (constraintAnchor == null) {
            x();
            return true;
        }
        if (!z3 && !v(constraintAnchor)) {
            return false;
        }
        this.f7885f = constraintAnchor;
        if (constraintAnchor.f7880a == null) {
            constraintAnchor.f7880a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f7885f.f7880a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f7886g = i4;
        this.f7887h = i5;
        return true;
    }

    public void c(ConstraintAnchor constraintAnchor, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor2 = this.f7885f;
        if (constraintAnchor2 != null && (hashSet = constraintAnchor2.f7880a) != null) {
            hashSet.remove(this);
        }
        ConstraintAnchor constraintAnchor3 = constraintAnchor.f7885f;
        if (constraintAnchor3 != null) {
            this.f7885f = hashMap.get(constraintAnchor.f7885f.f7883d).r(constraintAnchor3.l());
        } else {
            this.f7885f = null;
        }
        ConstraintAnchor constraintAnchor4 = this.f7885f;
        if (constraintAnchor4 != null) {
            if (constraintAnchor4.f7880a == null) {
                constraintAnchor4.f7880a = new HashSet<>();
            }
            this.f7885f.f7880a.add(this);
        }
        this.f7886g = constraintAnchor.f7886g;
        this.f7887h = constraintAnchor.f7887h;
    }

    public void d(int i4, ArrayList<o> arrayList, o oVar) {
        HashSet<ConstraintAnchor> hashSet = this.f7880a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.i.a(it.next().f7883d, i4, arrayList, oVar);
            }
        }
    }

    public HashSet<ConstraintAnchor> e() {
        return this.f7880a;
    }

    public int f() {
        if (!this.f7882c) {
            return 0;
        }
        return this.f7881b;
    }

    public int g() {
        ConstraintAnchor constraintAnchor;
        if (this.f7883d.l0() == 8) {
            return 0;
        }
        if (this.f7887h != Integer.MIN_VALUE && (constraintAnchor = this.f7885f) != null && constraintAnchor.f7883d.l0() == 8) {
            return this.f7887h;
        }
        return this.f7886g;
    }

    public final ConstraintAnchor h() {
        switch (a.f7889a[this.f7884e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f7883d.f7959S;
            case 3:
                return this.f7883d.f7955Q;
            case 4:
                return this.f7883d.f7961T;
            case 5:
                return this.f7883d.f7957R;
            default:
                throw new AssertionError(this.f7884e.name());
        }
    }

    public ConstraintWidget i() {
        return this.f7883d;
    }

    public SolverVariable j() {
        return this.f7888i;
    }

    public ConstraintAnchor k() {
        return this.f7885f;
    }

    public Type l() {
        return this.f7884e;
    }

    public boolean m() {
        HashSet<ConstraintAnchor> hashSet = this.f7880a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().h().p()) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        HashSet<ConstraintAnchor> hashSet = this.f7880a;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean o() {
        return this.f7882c;
    }

    public boolean p() {
        if (this.f7885f != null) {
            return true;
        }
        return false;
    }

    public boolean q(ConstraintWidget constraintWidget) {
        if (s(constraintWidget, new HashSet<>())) {
            return false;
        }
        ConstraintWidget U3 = i().U();
        if (U3 != constraintWidget && constraintWidget.U() != U3) {
            return false;
        }
        return true;
    }

    public boolean r(ConstraintWidget constraintWidget, ConstraintAnchor constraintAnchor) {
        return q(constraintWidget);
    }

    public boolean t() {
        switch (a.f7889a[this.f7884e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new AssertionError(this.f7884e.name());
        }
    }

    public String toString() {
        return this.f7883d.y() + ":" + this.f7884e.toString();
    }

    public boolean u(ConstraintAnchor constraintAnchor) {
        Type l4 = constraintAnchor.l();
        Type type = this.f7884e;
        if (l4 == type) {
            return true;
        }
        switch (a.f7889a[type.ordinal()]) {
            case 1:
                if (l4 != Type.BASELINE) {
                    return true;
                }
                return false;
            case 2:
            case 3:
            case 7:
                if (l4 == Type.LEFT || l4 == Type.RIGHT || l4 == Type.CENTER_X) {
                    return true;
                }
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
                if (l4 == Type.TOP || l4 == Type.BOTTOM || l4 == Type.CENTER_Y || l4 == Type.BASELINE) {
                    return true;
                }
                return false;
            case 9:
                return false;
            default:
                throw new AssertionError(this.f7884e.name());
        }
    }

    public boolean v(ConstraintAnchor constraintAnchor) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type l4 = constraintAnchor.l();
        Type type = this.f7884e;
        if (l4 == type) {
            if (type == Type.BASELINE && (!constraintAnchor.i().q0() || !i().q0())) {
                return false;
            }
            return true;
        }
        switch (a.f7889a[type.ordinal()]) {
            case 1:
                if (l4 == Type.BASELINE || l4 == Type.CENTER_X || l4 == Type.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (l4 != Type.LEFT && l4 != Type.RIGHT) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (constraintAnchor.i() instanceof f) {
                    if (z3 || l4 == Type.CENTER_X) {
                        z5 = true;
                    }
                    return z5;
                }
                return z3;
            case 4:
            case 5:
                if (l4 != Type.TOP && l4 != Type.BOTTOM) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (constraintAnchor.i() instanceof f) {
                    if (z4 || l4 == Type.CENTER_Y) {
                        z5 = true;
                    }
                    return z5;
                }
                return z4;
            case 6:
                if (l4 == Type.LEFT || l4 == Type.RIGHT) {
                    return false;
                }
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f7884e.name());
        }
    }

    public boolean w() {
        switch (a.f7889a[this.f7884e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 7:
                return false;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
                return true;
            default:
                throw new AssertionError(this.f7884e.name());
        }
    }

    public void x() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f7885f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f7880a) != null) {
            hashSet.remove(this);
            if (this.f7885f.f7880a.size() == 0) {
                this.f7885f.f7880a = null;
            }
        }
        this.f7880a = null;
        this.f7885f = null;
        this.f7886g = 0;
        this.f7887h = Integer.MIN_VALUE;
        this.f7882c = false;
        this.f7881b = 0;
    }

    public void y() {
        this.f7882c = false;
        this.f7881b = 0;
    }

    public void z(androidx.constraintlayout.core.c cVar) {
        SolverVariable solverVariable = this.f7888i;
        if (solverVariable == null) {
            this.f7888i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.l();
        }
    }
}
