package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class d extends a implements androidx.constraintlayout.core.state.helpers.e {

    /* renamed from: k0, reason: collision with root package name */
    protected final State f7734k0;

    /* renamed from: l0, reason: collision with root package name */
    final State.Helper f7735l0;

    /* renamed from: m0, reason: collision with root package name */
    protected ArrayList<Object> f7736m0;

    /* renamed from: n0, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.h f7737n0;

    public d(State state, State.Helper helper) {
        super(state);
        this.f7736m0 = new ArrayList<>();
        this.f7734k0 = state;
        this.f7735l0 = helper;
    }

    public d M0(Object... objArr) {
        Collections.addAll(this.f7736m0, objArr);
        return this;
    }

    public androidx.constraintlayout.core.widgets.h N0() {
        return this.f7737n0;
    }

    public State.Helper O0() {
        return this.f7735l0;
    }

    public void P0(androidx.constraintlayout.core.widgets.h hVar) {
        this.f7737n0 = hVar;
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.f
    public void a() {
    }

    @Override // androidx.constraintlayout.core.state.a, androidx.constraintlayout.core.state.f
    public ConstraintWidget b() {
        return N0();
    }
}
