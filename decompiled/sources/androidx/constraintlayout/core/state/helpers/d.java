package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d extends androidx.constraintlayout.core.state.d {

    /* renamed from: o0, reason: collision with root package name */
    protected float f7746o0;

    /* renamed from: p0, reason: collision with root package name */
    protected HashMap<String, Float> f7747p0;

    /* renamed from: q0, reason: collision with root package name */
    protected HashMap<String, Float> f7748q0;

    /* renamed from: r0, reason: collision with root package name */
    protected HashMap<String, Float> f7749r0;

    /* renamed from: s0, reason: collision with root package name */
    protected State.Chain f7750s0;

    public d(State state, State.Helper helper) {
        super(state, helper);
        this.f7746o0 = 0.5f;
        this.f7750s0 = State.Chain.SPREAD;
    }

    public void Q0(String str, float f4, float f5, float f6) {
        super.M0(str);
        if (!Float.isNaN(f4)) {
            if (this.f7747p0 == null) {
                this.f7747p0 = new HashMap<>();
            }
            this.f7747p0.put(str, Float.valueOf(f4));
        }
        if (!Float.isNaN(f5)) {
            if (this.f7748q0 == null) {
                this.f7748q0 = new HashMap<>();
            }
            this.f7748q0.put(str, Float.valueOf(f5));
        }
        if (!Float.isNaN(f6)) {
            if (this.f7749r0 == null) {
                this.f7749r0 = new HashMap<>();
            }
            this.f7749r0.put(str, Float.valueOf(f6));
        }
    }

    @Override // androidx.constraintlayout.core.state.a
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public d n(float f4) {
        this.f7746o0 = f4;
        return this;
    }

    public float S0() {
        return this.f7746o0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float T0(String str) {
        HashMap<String, Float> hashMap = this.f7749r0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.f7749r0.get(str).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float U0(String str) {
        HashMap<String, Float> hashMap = this.f7748q0;
        if (hashMap != null && hashMap.containsKey(str)) {
            return this.f7748q0.get(str).floatValue();
        }
        return 0.0f;
    }

    public State.Chain V0() {
        return State.Chain.SPREAD;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float W0(String str) {
        HashMap<String, Float> hashMap = this.f7747p0;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return -1.0f;
        }
        return this.f7747p0.get(str).floatValue();
    }

    public d X0(State.Chain chain) {
        this.f7750s0 = chain;
        return this;
    }
}
