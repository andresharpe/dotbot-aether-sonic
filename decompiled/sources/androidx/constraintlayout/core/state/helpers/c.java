package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;

/* loaded from: classes.dex */
public class c extends androidx.constraintlayout.core.state.d {

    /* renamed from: o0, reason: collision with root package name */
    private State.Direction f7742o0;

    /* renamed from: p0, reason: collision with root package name */
    private int f7743p0;

    /* renamed from: q0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.a f7744q0;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7745a;

        static {
            int[] iArr = new int[State.Direction.values().length];
            f7745a = iArr;
            try {
                iArr[State.Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7745a[State.Direction.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7745a[State.Direction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7745a[State.Direction.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7745a[State.Direction.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7745a[State.Direction.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(State state) {
        super(state, State.Helper.BARRIER);
    }

    @Override // androidx.constraintlayout.core.state.d
    public androidx.constraintlayout.core.widgets.h N0() {
        if (this.f7744q0 == null) {
            this.f7744q0 = new androidx.constraintlayout.core.widgets.a();
        }
        return this.f7744q0;
    }

    public void Q0(State.Direction direction) {
        this.f7742o0 = direction;
    }

    @Override // androidx.constraintlayout.core.state.d, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.f
    public void a() {
        N0();
        int i4 = a.f7745a[this.f7742o0.ordinal()];
        int i5 = 3;
        if (i4 != 3 && i4 != 4) {
            if (i4 != 5) {
                if (i4 != 6) {
                    i5 = 0;
                }
            } else {
                i5 = 2;
            }
        } else {
            i5 = 1;
        }
        this.f7744q0.u2(i5);
        this.f7744q0.v2(this.f7743p0);
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a c0(int i4) {
        this.f7743p0 = i4;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.a
    public androidx.constraintlayout.core.state.a d0(Object obj) {
        c0(this.f7734k0.g(obj));
        return this;
    }
}
