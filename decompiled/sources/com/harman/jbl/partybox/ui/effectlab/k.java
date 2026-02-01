package com.harman.jbl.partybox.ui.effectlab;

import X2.p;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.djeffects.model.DJFilterName;
import com.harman.jbl.partybox.ui.djeffects.model.DJVoiceName;
import com.harman.jbl.partybox.ui.djeffects.model.DjEffectToneId;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class k extends com.harman.jbl.partybox.c {

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    public static final a f43544T = new a(null);

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    private static final String f43545U = "EffectLabViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.d
    private final List<Integer> f43546P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final int[] f43547Q = {j.f.Y5, j.f.X5, j.f.Z5, j.f.V5, j.f.b6, j.f.c6, j.f.d6, j.f.W5};

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final int[] f43548R = {j.f.R5, j.f.L5, j.f.O5, j.f.T5, j.f.Q5};

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final z2.d f43549S = new b();

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements z2.d {
        b() {
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            k.this.a0(device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            k.this.a0(device, code, msg);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.effectlab.EffectLabViewModel$setDJTone$1", f = "EffectLabViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class c extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43551I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f43552J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f43553K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ k f43554L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i4, HmDevice hmDevice, k kVar, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f43552J = i4;
            this.f43553K = hmDevice;
            this.f43554L = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43551I == 0) {
                W.n(obj);
                DjEffectToneId djEffectToneId = DjEffectToneId.TONE_UNKNOWN;
                switch (this.f43552J) {
                    case 0:
                        djEffectToneId = DjEffectToneId.TONE_HORN;
                        break;
                    case 1:
                        djEffectToneId = DjEffectToneId.TONE_GAME;
                        break;
                    case 2:
                        djEffectToneId = DjEffectToneId.TONE_LIKE;
                        break;
                    case 3:
                        djEffectToneId = DjEffectToneId.TONE_BOO;
                        break;
                    case 4:
                        djEffectToneId = DjEffectToneId.TONE_SCRATCH_1;
                        break;
                    case 5:
                        djEffectToneId = DjEffectToneId.TONE_SCRATCH_2;
                        break;
                    case 6:
                        djEffectToneId = DjEffectToneId.TONE_SCRATCH_3;
                        break;
                    case 7:
                        djEffectToneId = DjEffectToneId.TONE_CLAPPING;
                        break;
                }
                T1.a.a("EffectLabViewModel, setDJTone,  device = " + this.f43553K + ",tone = " + djEffectToneId);
                z2.f b4 = com.harman.sdk.b.f47608a.b(this.f43553K);
                if (b4 != null) {
                    b4.v(this.f43553K, djEffectToneId.g(), this.f43554L.f43549S);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(this.f43552J, this.f43553K, this.f43554L, cVar);
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.effectlab.EffectLabViewModel$setDJVoice$1", f = "EffectLabViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class d extends SuspendLambda implements p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43555I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f43556J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f43557K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ k f43558L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i4, HmDevice hmDevice, k kVar, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f43556J = i4;
            this.f43557K = hmDevice;
            this.f43558L = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43555I == 0) {
                W.n(obj);
                DJVoiceName dJVoiceName = DJVoiceName.UNKNOWN;
                int i4 = this.f43556J;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    dJVoiceName = DJVoiceName.JUMP;
                                }
                            } else {
                                dJVoiceName = DJVoiceName.PARTY;
                            }
                        } else {
                            dJVoiceName = DJVoiceName.HEY;
                        }
                    } else {
                        dJVoiceName = DJVoiceName.HANDS_UP;
                    }
                } else {
                    dJVoiceName = DJVoiceName.LETS_GO;
                }
                T1.a.a("EffectLabViewModel, setDJVoice,  device = " + this.f43557K + ",voice = " + dJVoiceName);
                z2.f b4 = com.harman.sdk.b.f47608a.b(this.f43557K);
                if (b4 != null) {
                    b4.H(this.f43557K, dJVoiceName.g(), this.f43558L.f43549S);
                }
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((d) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new d(this.f43556J, this.f43557K, this.f43558L, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
        T1.a.a("EffectLabViewModel, ButtonSettingUpdate observer called, msg = " + baseMessage + " device = " + hmDevice.J());
        if (statusCode == StatusCode.STATUS_SUCCESS) {
            F.n(hmDevice, "null cannot be cast to non-null type com.harman.sdk.device.PartyBoxDevice");
            baseMessage.b();
            MessageID messageID = MessageID.DJ_STATUS;
        }
    }

    @l3.d
    public final int[] X() {
        return this.f43548R;
    }

    @l3.d
    public final List<Integer> Y() {
        return this.f43546P;
    }

    @l3.d
    public final int[] Z() {
        return this.f43547Q;
    }

    public final void b0(@l3.d HmDevice hmDevice, @l3.d DJFilterName filter, int i4) {
        F.p(hmDevice, "hmDevice");
        F.p(filter, "filter");
        z2.f b4 = com.harman.sdk.b.f47608a.b(hmDevice);
        if (b4 != null) {
            b4.Q(hmDevice, filter.g(), i4, this.f43549S);
        }
    }

    public final void c0(@l3.d HmDevice hmDevice, int i4) {
        F.p(hmDevice, "hmDevice");
        C2323l.f(k0.a(this), null, null, new c(i4, hmDevice, this, null), 3, null);
    }

    public final void d0(@l3.d HmDevice hmDevice, int i4) {
        F.p(hmDevice, "hmDevice");
        C2323l.f(k0.a(this), null, null, new d(i4, hmDevice, this, null), 3, null);
    }
}
