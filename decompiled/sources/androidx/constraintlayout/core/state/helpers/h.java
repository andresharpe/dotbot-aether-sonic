package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends d {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7759a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f7759a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7759a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7759a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.d, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.f
    public void a() {
        Iterator<Object> it = this.f7736m0.iterator();
        while (it.hasNext()) {
            this.f7734k0.f(it.next()).w();
        }
        Iterator<Object> it2 = this.f7736m0.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            androidx.constraintlayout.core.state.a f4 = this.f7734k0.f(next);
            if (aVar2 == null) {
                Object obj = this.f7688S;
                if (obj != null) {
                    f4.E0(obj).c0(this.f7720o).e0(this.f7726u);
                } else {
                    Object obj2 = this.f7689T;
                    if (obj2 != null) {
                        f4.D0(obj2).c0(this.f7720o).e0(this.f7726u);
                    } else {
                        f4.E0(State.f7659n).d0(Float.valueOf(U0(f4.getKey().toString())));
                    }
                }
                aVar2 = f4;
            }
            if (aVar != null) {
                String obj3 = aVar.getKey().toString();
                String obj4 = f4.getKey().toString();
                aVar.q(f4.getKey()).d0(Float.valueOf(T0(obj3)));
                f4.D0(aVar.getKey()).d0(Float.valueOf(U0(obj4)));
            }
            float W02 = W0(next.toString());
            if (W02 != -1.0f) {
                f4.w0(W02);
            }
            aVar = f4;
        }
        if (aVar != null) {
            Object obj5 = this.f7690U;
            if (obj5 != null) {
                aVar.q(obj5).c0(this.f7721p).e0(this.f7727v);
            } else {
                Object obj6 = this.f7691V;
                if (obj6 != null) {
                    aVar.p(obj6).c0(this.f7721p).e0(this.f7727v);
                } else {
                    aVar.p(State.f7659n).d0(Float.valueOf(T0(aVar.getKey().toString())));
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f5 = this.f7746o0;
        if (f5 != 0.5f) {
            aVar2.J0(f5);
        }
        int i4 = a.f7759a[this.f7750s0.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    aVar2.v0(2);
                    return;
                }
                return;
            }
            aVar2.v0(1);
            return;
        }
        aVar2.v0(0);
    }
}
