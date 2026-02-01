package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class f implements e, androidx.constraintlayout.core.state.f {

    /* renamed from: a, reason: collision with root package name */
    final State f7751a;

    /* renamed from: b, reason: collision with root package name */
    private int f7752b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.f f7753c;

    /* renamed from: d, reason: collision with root package name */
    private int f7754d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f7755e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f7756f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private Object f7757g;

    public f(State state) {
        this.f7751a = state;
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.f
    public void a() {
        this.f7753c.C2(this.f7752b);
        int i4 = this.f7754d;
        if (i4 != -1) {
            this.f7753c.x2(i4);
            return;
        }
        int i5 = this.f7755e;
        if (i5 != -1) {
            this.f7753c.y2(i5);
        } else {
            this.f7753c.z2(this.f7756f);
        }
    }

    @Override // androidx.constraintlayout.core.state.helpers.e, androidx.constraintlayout.core.state.f
    public ConstraintWidget b() {
        if (this.f7753c == null) {
            this.f7753c = new androidx.constraintlayout.core.widgets.f();
        }
        return this.f7753c;
    }

    @Override // androidx.constraintlayout.core.state.f
    public void c(ConstraintWidget constraintWidget) {
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            this.f7753c = (androidx.constraintlayout.core.widgets.f) constraintWidget;
        } else {
            this.f7753c = null;
        }
    }

    @Override // androidx.constraintlayout.core.state.f
    public void d(Object obj) {
        this.f7757g = obj;
    }

    @Override // androidx.constraintlayout.core.state.f
    public e e() {
        return null;
    }

    public f f(Object obj) {
        this.f7754d = -1;
        this.f7755e = this.f7751a.g(obj);
        this.f7756f = 0.0f;
        return this;
    }

    public int g() {
        return this.f7752b;
    }

    @Override // androidx.constraintlayout.core.state.f
    public Object getKey() {
        return this.f7757g;
    }

    public f h(float f4) {
        this.f7754d = -1;
        this.f7755e = -1;
        this.f7756f = f4;
        return this;
    }

    public void i(int i4) {
        this.f7752b = i4;
    }

    public f j(Object obj) {
        this.f7754d = this.f7751a.g(obj);
        this.f7755e = -1;
        this.f7756f = 0.0f;
        return this;
    }
}
