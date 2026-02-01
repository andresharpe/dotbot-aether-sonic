package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends androidx.constraintlayout.core.state.d {

    /* renamed from: o0, reason: collision with root package name */
    private float f7741o0;

    public b(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.f7741o0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.d, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.f
    public void a() {
        Iterator<Object> it = this.f7736m0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a f4 = this.f7734k0.f(it.next());
            f4.w();
            Object obj = this.f7688S;
            if (obj != null) {
                f4.E0(obj);
            } else {
                Object obj2 = this.f7689T;
                if (obj2 != null) {
                    f4.D0(obj2);
                } else {
                    f4.E0(State.f7659n);
                }
            }
            Object obj3 = this.f7690U;
            if (obj3 != null) {
                f4.q(obj3);
            } else {
                Object obj4 = this.f7691V;
                if (obj4 != null) {
                    f4.p(obj4);
                } else {
                    f4.p(State.f7659n);
                }
            }
            float f5 = this.f7741o0;
            if (f5 != 0.5f) {
                f4.J0(f5);
            }
        }
    }
}
