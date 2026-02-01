package com.harman.jbl.partybox.ui.toneshifter;

import X2.p;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class i extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<Integer> f45691H = new P<>(0);

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final P<Integer> f45692I = new P<>();

    /* renamed from: J, reason: collision with root package name */
    public PartyBoxDevice f45693J;

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.toneshifter.ToneShifterViewModel$fetchData$1", f = "ToneShifterDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class a extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45694I;

        a(kotlin.coroutines.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45694I == 0) {
                W.n(obj);
                i.this.y().r(kotlin.coroutines.jvm.internal.a.f(i.this.w().q1()));
                i.this.x().r(i.this.y().f());
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((a) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new a(cVar);
        }
    }

    public final void A(@l3.d PartyBoxDevice partyBoxDevice) {
        F.p(partyBoxDevice, "<set-?>");
        this.f45693J = partyBoxDevice;
    }

    public final void B(int i4) {
        Integer f4 = this.f45691H.f();
        if (f4 != null && i4 == f4.intValue()) {
            return;
        }
        this.f45691H.r(Integer.valueOf(i4));
    }

    public final void u() {
        z2.e e4 = com.harman.sdk.b.f47608a.e(w());
        if (e4 != null) {
            PartyBoxDevice w3 = w();
            Integer f4 = this.f45691H.f();
            F.m(f4);
            e4.e0(w3, f4.intValue(), null);
        }
    }

    public final void v() {
        C2323l.f(k0.a(this), null, null, new a(null), 3, null);
    }

    @l3.d
    public final PartyBoxDevice w() {
        PartyBoxDevice partyBoxDevice = this.f45693J;
        if (partyBoxDevice != null) {
            return partyBoxDevice;
        }
        F.S("device");
        return null;
    }

    @l3.d
    public final P<Integer> x() {
        return this.f45692I;
    }

    @l3.d
    public final P<Integer> y() {
        return this.f45691H;
    }

    public final void z() {
        this.f45691H.r(0);
    }
}
