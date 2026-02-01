package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.J;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class O extends J {

    /* renamed from: E0, reason: collision with root package name */
    private static final int f19938E0 = 1;

    /* renamed from: F0, reason: collision with root package name */
    private static final int f19939F0 = 2;

    /* renamed from: G0, reason: collision with root package name */
    private static final int f19940G0 = 4;

    /* renamed from: H0, reason: collision with root package name */
    private static final int f19941H0 = 8;

    /* renamed from: I0, reason: collision with root package name */
    public static final int f19942I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    public static final int f19943J0 = 1;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f19944A0;

    /* renamed from: B0, reason: collision with root package name */
    int f19945B0;

    /* renamed from: C0, reason: collision with root package name */
    boolean f19946C0;

    /* renamed from: D0, reason: collision with root package name */
    private int f19947D0;

    /* renamed from: z0, reason: collision with root package name */
    private ArrayList<J> f19948z0;

    /* loaded from: classes.dex */
    class a extends L {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J f19949a;

        a(J j4) {
            this.f19949a = j4;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            this.f19949a.t0();
            j4.m0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends L {

        /* renamed from: a, reason: collision with root package name */
        O f19951a;

        b(O o4) {
            this.f19951a = o4;
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void a(@androidx.annotation.N J j4) {
            O o4 = this.f19951a;
            if (!o4.f19946C0) {
                o4.C0();
                this.f19951a.f19946C0 = true;
            }
        }

        @Override // androidx.transition.L, androidx.transition.J.h
        public void c(@androidx.annotation.N J j4) {
            O o4 = this.f19951a;
            int i4 = o4.f19945B0 - 1;
            o4.f19945B0 = i4;
            if (i4 == 0) {
                o4.f19946C0 = false;
                o4.w();
            }
            j4.m0(this);
        }
    }

    public O() {
        this.f19948z0 = new ArrayList<>();
        this.f19944A0 = true;
        this.f19946C0 = false;
        this.f19947D0 = 0;
    }

    private void K0(@androidx.annotation.N J j4) {
        this.f19948z0.add(j4);
        j4.f19902V = this;
    }

    private void Y0() {
        b bVar = new b(this);
        Iterator<J> it = this.f19948z0.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f19945B0 = this.f19948z0.size();
    }

    @Override // androidx.transition.J
    public void A0(N n4) {
        super.A0(n4);
        this.f19947D0 |= 2;
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).A0(n4);
        }
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public J D(int i4, boolean z3) {
        for (int i5 = 0; i5 < this.f19948z0.size(); i5++) {
            this.f19948z0.get(i5).D(i4, z3);
        }
        return super.D(i4, z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.J
    public String D0(String str) {
        String D02 = super.D0(str);
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(D02);
            sb.append("\n");
            sb.append(this.f19948z0.get(i4).D0(str + "  "));
            D02 = sb.toString();
        }
        return D02;
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public J E(@androidx.annotation.N View view, boolean z3) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).E(view, z3);
        }
        return super.E(view, z3);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public O a(@androidx.annotation.N J.h hVar) {
        return (O) super.a(hVar);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public J F(@androidx.annotation.N Class<?> cls, boolean z3) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).F(cls, z3);
        }
        return super.F(cls, z3);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public O b(@androidx.annotation.D int i4) {
        for (int i5 = 0; i5 < this.f19948z0.size(); i5++) {
            this.f19948z0.get(i5).b(i4);
        }
        return (O) super.b(i4);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    public J G(@androidx.annotation.N String str, boolean z3) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).G(str, z3);
        }
        return super.G(str, z3);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public O d(@androidx.annotation.N View view) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).d(view);
        }
        return (O) super.d(view);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public O e(@androidx.annotation.N Class<?> cls) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).e(cls);
        }
        return (O) super.e(cls);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public O f(@androidx.annotation.N String str) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).f(str);
        }
        return (O) super.f(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.J
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void J(ViewGroup viewGroup) {
        super.J(viewGroup);
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).J(viewGroup);
        }
    }

    @androidx.annotation.N
    public O J0(@androidx.annotation.N J j4) {
        K0(j4);
        long j5 = this.f19887G;
        if (j5 >= 0) {
            j4.v0(j5);
        }
        if ((this.f19947D0 & 1) != 0) {
            j4.x0(N());
        }
        if ((this.f19947D0 & 2) != 0) {
            j4.A0(R());
        }
        if ((this.f19947D0 & 4) != 0) {
            j4.z0(Q());
        }
        if ((this.f19947D0 & 8) != 0) {
            j4.w0(M());
        }
        return this;
    }

    public int L0() {
        return !this.f19944A0 ? 1 : 0;
    }

    @androidx.annotation.P
    public J M0(int i4) {
        if (i4 >= 0 && i4 < this.f19948z0.size()) {
            return this.f19948z0.get(i4);
        }
        return null;
    }

    public int N0() {
        return this.f19948z0.size();
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public O m0(@androidx.annotation.N J.h hVar) {
        return (O) super.m0(hVar);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public O n0(@androidx.annotation.D int i4) {
        for (int i5 = 0; i5 < this.f19948z0.size(); i5++) {
            this.f19948z0.get(i5).n0(i4);
        }
        return (O) super.n0(i4);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public O o0(@androidx.annotation.N View view) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).o0(view);
        }
        return (O) super.o0(view);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public O p0(@androidx.annotation.N Class<?> cls) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).p0(cls);
        }
        return (O) super.p0(cls);
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public O q0(@androidx.annotation.N String str) {
        for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
            this.f19948z0.get(i4).q0(str);
        }
        return (O) super.q0(str);
    }

    @androidx.annotation.N
    public O T0(@androidx.annotation.N J j4) {
        this.f19948z0.remove(j4);
        j4.f19902V = null;
        return this;
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public O v0(long j4) {
        ArrayList<J> arrayList;
        super.v0(j4);
        if (this.f19887G >= 0 && (arrayList = this.f19948z0) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f19948z0.get(i4).v0(j4);
            }
        }
        return this;
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public O x0(@androidx.annotation.P TimeInterpolator timeInterpolator) {
        this.f19947D0 |= 1;
        ArrayList<J> arrayList = this.f19948z0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f19948z0.get(i4).x0(timeInterpolator);
            }
        }
        return (O) super.x0(timeInterpolator);
    }

    @androidx.annotation.N
    public O W0(int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                this.f19944A0 = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i4);
            }
        } else {
            this.f19944A0 = true;
        }
        return this;
    }

    @Override // androidx.transition.J
    @androidx.annotation.N
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public O B0(long j4) {
        return (O) super.B0(j4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.J
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k() {
        super.k();
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).k();
        }
    }

    @Override // androidx.transition.J
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void k0(View view) {
        super.k0(view);
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).k0(view);
        }
    }

    @Override // androidx.transition.J
    public void l(@androidx.annotation.N S s4) {
        if (c0(s4.f19960b)) {
            Iterator<J> it = this.f19948z0.iterator();
            while (it.hasNext()) {
                J next = it.next();
                if (next.c0(s4.f19960b)) {
                    next.l(s4);
                    s4.f19961c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.J
    public void o(S s4) {
        super.o(s4);
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).o(s4);
        }
    }

    @Override // androidx.transition.J
    public void p(@androidx.annotation.N S s4) {
        if (c0(s4.f19960b)) {
            Iterator<J> it = this.f19948z0.iterator();
            while (it.hasNext()) {
                J next = it.next();
                if (next.c0(s4.f19960b)) {
                    next.p(s4);
                    s4.f19961c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.J
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void r0(View view) {
        super.r0(view);
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).r0(view);
        }
    }

    @Override // androidx.transition.J
    /* renamed from: s */
    public J clone() {
        O o4 = (O) super.clone();
        o4.f19948z0 = new ArrayList<>();
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            o4.K0(this.f19948z0.get(i4).clone());
        }
        return o4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.J
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void t0() {
        if (this.f19948z0.isEmpty()) {
            C0();
            w();
            return;
        }
        Y0();
        if (!this.f19944A0) {
            for (int i4 = 1; i4 < this.f19948z0.size(); i4++) {
                this.f19948z0.get(i4 - 1).a(new a(this.f19948z0.get(i4)));
            }
            J j4 = this.f19948z0.get(0);
            if (j4 != null) {
                j4.t0();
                return;
            }
            return;
        }
        Iterator<J> it = this.f19948z0.iterator();
        while (it.hasNext()) {
            it.next().t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.J
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void u(ViewGroup viewGroup, T t3, T t4, ArrayList<S> arrayList, ArrayList<S> arrayList2) {
        long T3 = T();
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            J j4 = this.f19948z0.get(i4);
            if (T3 > 0 && (this.f19944A0 || i4 == 0)) {
                long T4 = j4.T();
                if (T4 > 0) {
                    j4.B0(T4 + T3);
                } else {
                    j4.B0(T3);
                }
            }
            j4.u(viewGroup, t3, t4, arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.J
    public void u0(boolean z3) {
        super.u0(z3);
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).u0(z3);
        }
    }

    @Override // androidx.transition.J
    public void w0(J.f fVar) {
        super.w0(fVar);
        this.f19947D0 |= 8;
        int size = this.f19948z0.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f19948z0.get(i4).w0(fVar);
        }
    }

    @Override // androidx.transition.J
    public void z0(AbstractC0991z abstractC0991z) {
        super.z0(abstractC0991z);
        this.f19947D0 |= 4;
        if (this.f19948z0 != null) {
            for (int i4 = 0; i4 < this.f19948z0.size(); i4++) {
                this.f19948z0.get(i4).z0(abstractC0991z);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public O(@androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19948z0 = new ArrayList<>();
        this.f19944A0 = true;
        this.f19946C0 = false;
        this.f19947D0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.f19843i);
        W0(androidx.core.content.res.n.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
