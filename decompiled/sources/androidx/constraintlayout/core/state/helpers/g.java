package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends d {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7758a;

        static {
            int[] iArr = new int[State.Chain.values().length];
            f7758a = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7758a[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7758a[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.d, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.f
    public void a() {
        Iterator<Object> it = this.f7736m0.iterator();
        while (it.hasNext()) {
            this.f7734k0.f(it.next()).v();
        }
        Iterator<Object> it2 = this.f7736m0.iterator();
        androidx.constraintlayout.core.state.a aVar = null;
        androidx.constraintlayout.core.state.a aVar2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            androidx.constraintlayout.core.state.a f4 = this.f7734k0.f(next);
            if (aVar2 == null) {
                Object obj = this.f7684O;
                if (obj != null) {
                    f4.B0(obj).c0(this.f7718m).e0(this.f7724s);
                } else {
                    Object obj2 = this.f7685P;
                    if (obj2 != null) {
                        f4.A0(obj2).c0(this.f7718m).e0(this.f7724s);
                    } else {
                        Object obj3 = this.f7680K;
                        if (obj3 != null) {
                            f4.B0(obj3).c0(this.f7716k).e0(this.f7722q);
                        } else {
                            Object obj4 = this.f7681L;
                            if (obj4 != null) {
                                f4.A0(obj4).c0(this.f7716k).e0(this.f7722q);
                            } else {
                                f4.B0(State.f7659n).d0(Float.valueOf(U0(f4.getKey().toString())));
                            }
                        }
                    }
                }
                aVar2 = f4;
            }
            if (aVar != null) {
                String obj5 = aVar.getKey().toString();
                String obj6 = f4.getKey().toString();
                aVar.B(f4.getKey()).d0(Float.valueOf(T0(obj5)));
                f4.A0(aVar.getKey()).d0(Float.valueOf(U0(obj6)));
            }
            float W02 = W0(next.toString());
            if (W02 != -1.0f) {
                f4.t0(W02);
            }
            aVar = f4;
        }
        if (aVar != null) {
            Object obj7 = this.f7686Q;
            if (obj7 != null) {
                aVar.B(obj7).c0(this.f7719n).e0(this.f7725t);
            } else {
                Object obj8 = this.f7687R;
                if (obj8 != null) {
                    aVar.A(obj8).c0(this.f7719n).e0(this.f7725t);
                } else {
                    Object obj9 = this.f7682M;
                    if (obj9 != null) {
                        aVar.B(obj9).c0(this.f7717l).e0(this.f7723r);
                    } else {
                        Object obj10 = this.f7683N;
                        if (obj10 != null) {
                            aVar.A(obj10).c0(this.f7717l).e0(this.f7723r);
                        } else {
                            aVar.A(State.f7659n).d0(Float.valueOf(T0(aVar.getKey().toString())));
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f5 = this.f7746o0;
        if (f5 != 0.5f) {
            aVar2.Y(f5);
        }
        int i4 = a.f7758a[this.f7750s0.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    aVar2.s0(2);
                    return;
                }
                return;
            }
            aVar2.s0(1);
            return;
        }
        aVar2.s0(0);
    }
}
