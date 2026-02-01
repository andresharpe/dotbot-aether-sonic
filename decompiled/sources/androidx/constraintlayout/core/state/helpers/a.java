package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends androidx.constraintlayout.core.state.d {

    /* renamed from: o0, reason: collision with root package name */
    private float f7740o0;

    public a(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.f7740o0 = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.d, androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.f
    public void a() {
        Iterator<Object> it = this.f7736m0.iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.core.state.a f4 = this.f7734k0.f(it.next());
            f4.v();
            Object obj = this.f7684O;
            if (obj != null) {
                f4.B0(obj);
            } else {
                Object obj2 = this.f7685P;
                if (obj2 != null) {
                    f4.A0(obj2);
                } else {
                    f4.B0(State.f7659n);
                }
            }
            Object obj3 = this.f7686Q;
            if (obj3 != null) {
                f4.B(obj3);
            } else {
                Object obj4 = this.f7687R;
                if (obj4 != null) {
                    f4.A(obj4);
                } else {
                    f4.A(State.f7659n);
                }
            }
            float f5 = this.f7740o0;
            if (f5 != 0.5f) {
                f4.Y(f5);
            }
        }
    }
}
