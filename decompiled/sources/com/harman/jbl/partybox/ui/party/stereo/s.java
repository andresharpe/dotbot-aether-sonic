package com.harman.jbl.partybox.ui.party.stereo;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.K;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.stereo.define.EnumStereoType;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.GestureInfo;
import com.harman.sdk.utils.AudioChannel;
import com.harman.sdk.utils.EnumIdentifyDevice;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C0;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.U;

/* loaded from: classes2.dex */
public final class s extends j0 {

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    public static final a f45232N = new a(null);

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final String f45233O = "Party.Stereo.CreateViewModel";

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<HmDevice> f45234H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final N<HmDevice> f45235I = new N<>();

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private final P<AudioChannel> f45236J = new P<>();

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partybox.ui.party.stereo.state.create.e> f45237K;

    /* renamed from: L, reason: collision with root package name */
    private int f45238L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private final LiveData<Boolean> f45239M;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<com.harman.jbl.partybox.ui.party.stereo.state.create.e, Boolean> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f45240F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean C(com.harman.jbl.partybox.ui.party.stereo.state.create.e eVar) {
            boolean g4;
            if (F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.b.f45287a)) {
                g4 = true;
            } else {
                g4 = F.g(eVar, com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a);
            }
            return Boolean.valueOf(g4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$disconnectCoDevice$1", f = "StereoCreateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45241I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45242J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HmDevice hmDevice, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f45242J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f45241I == 0) {
                W.n(obj);
                com.harman.jbl.partybox.ui.party.business.a.f44891a.g(this.f45242J);
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
            return new c(this.f45242J, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$lightIdentifyDevice$1", f = "StereoCreateViewModel.kt", i = {}, l = {335, 340}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class d extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45243I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45244J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(HmDevice hmDevice, kotlin.coroutines.c<? super d> cVar) {
            super(2, cVar);
            this.f45244J = hmDevice;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
                int r1 = r5.f45243I
                java.lang.String r2 = "Party.Stereo.CreateViewModel"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.W.n(r6)
                goto L6f
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.W.n(r6)
                goto L38
            L20:
                kotlin.W.n(r6)
                com.harman.sdk.device.HmDevice r6 = r5.f45244J
                boolean r6 = r6.R()
                if (r6 != 0) goto L5f
                com.harman.jbl.partybox.ui.party.business.a r6 = com.harman.jbl.partybox.ui.party.business.a.f44891a
                com.harman.sdk.device.HmDevice r1 = r5.f45244J
                r5.f45243I = r4
                java.lang.Object r6 = r6.f(r1, r5)
                if (r6 != r0) goto L38
                return r0
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5f
                com.harman.jbl.partybox.ui.party.b r6 = com.harman.jbl.partybox.ui.party.b.f44881a
                com.harman.sdk.device.HmDevice r0 = r5.f45244J
                java.lang.String r6 = r6.t(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "lightIdentifyDevice() >>> fail to connect with "
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                com.harman.log.f.b(r2, r6)
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            L5f:
                com.harman.jbl.partybox.ui.party.stereo.state.create.d r6 = com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a
                com.harman.sdk.device.HmDevice r1 = r5.f45244J
                com.harman.sdk.utils.EnumIdentifyDevice r4 = com.harman.sdk.utils.EnumIdentifyDevice.REPEAT
                r5.f45243I = r3
                r3 = 0
                java.lang.Object r6 = r6.b(r1, r4, r3, r5)
                if (r6 != r0) goto L6f
                return r0
            L6f:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "lightIdentifyDevice() >>> rst["
                r0.append(r1)
                r0.append(r6)
                java.lang.String r6 = "]"
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                com.harman.log.f.d(r2, r6)
                kotlin.H0 r6 = kotlin.H0.f51801a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.s.d.D(java.lang.Object):java.lang.Object");
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
            return new d(this.f45244J, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$lightNormalDevice$1", f = "StereoCreateViewModel.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class e extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45245I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ HmDevice f45246J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HmDevice hmDevice, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f45246J = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f45245I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                com.harman.jbl.partybox.ui.party.stereo.state.create.d dVar = com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a;
                HmDevice hmDevice = this.f45246J;
                EnumIdentifyDevice enumIdentifyDevice = EnumIdentifyDevice.NORMAL;
                this.f45245I = 1;
                obj = dVar.b(hmDevice, enumIdentifyDevice, null, this);
                if (obj == l4) {
                    return l4;
                }
            }
            com.harman.log.f.d(s.f45233O, "lightNormalDevice() >>> rst[" + ((Boolean) obj).booleanValue() + "]");
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(this.f45246J, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$onChannelSelectedBtnClick$1", f = "StereoCreateViewModel.kt", i = {0}, l = {226, 252}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class f extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45247I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f45248J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ X2.l<Bundle, H0> f45249K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmDevice f45250L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ s f45251M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ HmDevice f45252N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f45253O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ String f45254P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ AudioChannel f45255Q;

        /* renamed from: R, reason: collision with root package name */
        final /* synthetic */ AudioChannel f45256R;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$onChannelSelectedBtnClick$1$groupResult$1$1", f = "StereoCreateViewModel.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45257I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ HmDevice f45258J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ AudioChannel f45259K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ HmDevice f45260L;

            /* renamed from: M, reason: collision with root package name */
            final /* synthetic */ AudioChannel f45261M;

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ String f45262N;

            /* renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f45263O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HmDevice hmDevice, AudioChannel audioChannel, HmDevice hmDevice2, AudioChannel audioChannel2, String str, String str2, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f45258J = hmDevice;
                this.f45259K = audioChannel;
                this.f45260L = hmDevice2;
                this.f45261M = audioChannel2;
                this.f45262N = str;
                this.f45263O = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45257I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.jbl.partybox.ui.party.stereo.state.create.f fVar = com.harman.jbl.partybox.ui.party.stereo.state.create.f.f45292a;
                    HmDevice hmDevice = this.f45258J;
                    AudioChannel audioChannel = this.f45259K;
                    HmDevice hmDevice2 = this.f45260L;
                    AudioChannel audioChannel2 = this.f45261M;
                    String str = this.f45262N;
                    String str2 = this.f45263O;
                    this.f45257I = 1;
                    obj = fVar.e(hmDevice, audioChannel, hmDevice2, audioChannel2, str, str2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f45258J, this.f45259K, this.f45260L, this.f45261M, this.f45262N, this.f45263O, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$onChannelSelectedBtnClick$1$waitResult$1$1", f = "StereoCreateViewModel.kt", i = {}, l = {GestureInfo.f48244d0}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45264I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ HmDevice f45265J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f45266K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(HmDevice hmDevice, HmDevice hmDevice2, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f45265J = hmDevice;
                this.f45266K = hmDevice2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45264I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.jbl.partybox.ui.party.stereo.state.create.f fVar = com.harman.jbl.partybox.ui.party.stereo.state.create.f.f45292a;
                    HmDevice hmDevice = this.f45265J;
                    HmDevice hmDevice2 = this.f45266K;
                    this.f45264I = 1;
                    obj = fVar.f(hmDevice, hmDevice2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((b) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new b(this.f45265J, this.f45266K, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(X2.l<? super Bundle, H0> lVar, HmDevice hmDevice, s sVar, HmDevice hmDevice2, String str, String str2, AudioChannel audioChannel, AudioChannel audioChannel2, kotlin.coroutines.c<? super f> cVar) {
            super(2, cVar);
            this.f45249K = lVar;
            this.f45250L = hmDevice;
            this.f45251M = sVar;
            this.f45252N = hmDevice2;
            this.f45253O = str;
            this.f45254P = str2;
            this.f45255Q = audioChannel;
            this.f45256R = audioChannel2;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0109  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 574
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.s.f.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((f) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            f fVar = new f(this.f45249K, this.f45250L, this.f45251M, this.f45252N, this.f45253O, this.f45254P, this.f45255Q, this.f45256R, cVar);
            fVar.f45248J = obj;
            return fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$startTWSGrouping$1", f = "StereoCreateViewModel.kt", i = {0}, l = {123, 144, GestureInfo.f48262v0}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class g extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f45267I;

        /* renamed from: J, reason: collision with root package name */
        private /* synthetic */ Object f45268J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ X2.l<Bundle, H0> f45269K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ HmDevice f45270L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ s f45271M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ HmDevice f45272N;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$startTWSGrouping$1$groupResult$1$1", f = "StereoCreateViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45273I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ HmDevice f45274J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f45275K;

            /* renamed from: L, reason: collision with root package name */
            final /* synthetic */ s f45276L;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HmDevice hmDevice, HmDevice hmDevice2, s sVar, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f45274J = hmDevice;
                this.f45275K = hmDevice2;
                this.f45276L = sVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                boolean z3;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45273I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.jbl.partybox.ui.party.business.a aVar = com.harman.jbl.partybox.ui.party.business.a.f44891a;
                    HmDevice hmDevice = this.f45274J;
                    HmDevice hmDevice2 = this.f45275K;
                    if (this.f45276L.D() == EnumStereoType.WIRELESS.g() && com.harman.sdk.utils.d.G(this.f45275K)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f45273I = 1;
                    obj = aVar.m(hmDevice, hmDevice2, z3, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f45274J, this.f45275K, this.f45276L, cVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.party.stereo.StereoCreateViewModel$startTWSGrouping$1$waitResult$1$1", f = "StereoCreateViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class b extends SuspendLambda implements X2.p<U, kotlin.coroutines.c<? super Boolean>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f45277I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ HmDevice f45278J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f45279K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(HmDevice hmDevice, HmDevice hmDevice2, kotlin.coroutines.c<? super b> cVar) {
                super(2, cVar);
                this.f45278J = hmDevice;
                this.f45279K = hmDevice2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f45277I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    com.harman.jbl.partybox.ui.party.business.a aVar = com.harman.jbl.partybox.ui.party.business.a.f44891a;
                    HmDevice hmDevice = this.f45278J;
                    HmDevice hmDevice2 = this.f45279K;
                    this.f45277I = 1;
                    obj = aVar.q(hmDevice, hmDevice2, this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
                return ((b) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new b(this.f45278J, this.f45279K, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(X2.l<? super Bundle, H0> lVar, HmDevice hmDevice, s sVar, HmDevice hmDevice2, kotlin.coroutines.c<? super g> cVar) {
            super(2, cVar);
            this.f45269K = lVar;
            this.f45270L = hmDevice;
            this.f45271M = sVar;
            this.f45272N = hmDevice2;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 492
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.party.stereo.s.g.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((g) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            g gVar = new g(this.f45269K, this.f45270L, this.f45271M, this.f45272N, cVar);
            gVar.f45268J = obj;
            return gVar;
        }
    }

    public s() {
        P<com.harman.jbl.partybox.ui.party.stereo.state.create.e> p4 = new P<>();
        this.f45237K = p4;
        this.f45238L = EnumStereoType.TWS.g();
        this.f45239M = h0.b(p4, b.f45240F);
    }

    @K
    private final void L(HmDevice hmDevice, HmDevice hmDevice2, X2.l<? super Bundle, H0> lVar) {
        D d4 = D.f45020a;
        HmDevice n4 = d4.n(hmDevice);
        HmDevice n5 = d4.n(hmDevice2);
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        com.harman.log.f.d(f45233O, "startTWSGrouping() >>> attempt to do TWS grouping\nmainDev " + bVar.t(n4) + "\ncoDev " + bVar.t(n5));
        C2323l.f(k0.a(this), C2322k0.e(), null, new g(lVar, n4, this, n5, null), 2, null);
    }

    @l3.d
    public final LiveData<HmDevice> A() {
        return this.f45234H;
    }

    @l3.d
    public final LiveData<AudioChannel> B() {
        return this.f45236J;
    }

    @l3.d
    public final LiveData<com.harman.jbl.partybox.ui.party.stereo.state.create.e> C() {
        return this.f45237K;
    }

    public final int D() {
        return this.f45238L;
    }

    @K
    public final void E() {
        HmDevice f4 = this.f45234H.f();
        if (f4 == null) {
            com.harman.log.f.b(f45233O, "lightIdentifyDevice() >>> cant get mainDev instance");
        } else {
            com.harman.log.f.a(f45233O, "lightIdentifyDevice() >>> emit identify to light main device");
            C2323l.f(k0.a(this), C2322k0.e(), null, new d(f4, null), 2, null);
        }
    }

    @K
    public final void F() {
        HmDevice f4 = this.f45234H.f();
        if (f4 == null) {
            com.harman.log.f.b(f45233O, "lightNormalDevice() >>> cant get mainDev instance");
        } else {
            com.harman.log.f.a(f45233O, "lightNormalDevice() >>> emit identify to light normal");
            C2323l.f(C0.f52916E, C2322k0.e(), null, new e(f4, null), 2, null);
        }
    }

    @K
    public final void G(@l3.d AudioChannel channel) {
        F.p(channel, "channel");
        P<AudioChannel> p4 = this.f45236J;
        if (channel == p4.f()) {
            channel = null;
        }
        p4.r(channel);
    }

    @K
    public final void H(@l3.d Context context, @l3.d X2.l<? super Bundle, H0> reportAction) {
        F.p(context, "context");
        F.p(reportAction, "reportAction");
        HmDevice f4 = this.f45234H.f();
        if (f4 == null) {
            com.harman.log.f.b(f45233O, "onChannelSelectedBtnClick() >>> miss main dev");
            return;
        }
        HmDevice f5 = this.f45235I.f();
        if (f5 == null) {
            com.harman.log.f.b(f45233O, "onChannelSelectedBtnClick() >>> miss co dev");
            return;
        }
        AudioChannel f6 = this.f45236J.f();
        if (f6 == null) {
            com.harman.log.f.b(f45233O, "onChannelSelectedBtnClick() >>> miss main chn");
            return;
        }
        D d4 = D.f45020a;
        String i4 = d4.i();
        String string = context.getString(j.m.V5);
        F.o(string, "getString(...)");
        AudioChannel u3 = d4.u(f6);
        this.f45237K.r(com.harman.jbl.partybox.ui.party.stereo.state.create.f.f45292a);
        C2323l.f(k0.a(this), C2322k0.e(), null, new f(reportAction, f4, this, f5, i4, string, f6, u3, null), 2, null);
    }

    @K
    public final void I() {
        this.f45237K.r(com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a);
    }

    @K
    public final void J() {
        com.harman.log.f.d(f45233O, "onSelectChannelDelayed() >>> timeout while staying in select channel and portal to PlacementState");
        this.f45237K.r(com.harman.jbl.partybox.ui.party.stereo.state.create.b.f45287a);
    }

    public final void K(int i4) {
        this.f45238L = i4;
    }

    @K
    public final void v(@l3.d n args, boolean z3, @l3.d X2.l<? super Bundle, H0> reportAction) {
        com.harman.jbl.partybox.ui.party.stereo.state.create.e eVar;
        F.p(args, "args");
        F.p(reportAction, "reportAction");
        int e4 = args.e();
        com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
        HmDevice d4 = args.d();
        F.o(d4, "getMainDevice(...)");
        String t3 = bVar.t(d4);
        HmDevice c4 = args.c();
        F.o(c4, "getCoDevice(...)");
        com.harman.log.f.d(f45233O, "bindDevices() >>> type[" + e4 + "]\nmainDev " + t3 + "\ncoDev " + bVar.t(c4) + "\nfirst " + z3);
        this.f45234H.r(args.d());
        this.f45235I.r(args.c());
        this.f45238L = args.e();
        P<com.harman.jbl.partybox.ui.party.stereo.state.create.e> p4 = this.f45237K;
        int e5 = args.e();
        if (e5 == EnumStereoType.STEREO.g()) {
            eVar = com.harman.jbl.partybox.ui.party.stereo.state.create.b.f45287a;
        } else if (e5 == EnumStereoType.WIRELESS.g() || e5 == EnumStereoType.TWS.g()) {
            if (z3) {
                HmDevice d5 = args.d();
                F.o(d5, "getMainDevice(...)");
                HmDevice c5 = args.c();
                F.o(c5, "getCoDevice(...)");
                L(d5, c5, reportAction);
            }
            eVar = com.harman.jbl.partybox.ui.party.stereo.state.create.i.f45322a;
        } else {
            eVar = com.harman.jbl.partybox.ui.party.stereo.state.create.b.f45287a;
        }
        p4.r(eVar);
    }

    public final boolean w() {
        String str;
        String str2;
        String str3;
        HmDevice f4 = this.f45235I.f();
        String str4 = null;
        if (f4 != null) {
            str = f4.q();
        } else {
            str = null;
        }
        HmDevice f5 = this.f45234H.f();
        if (f5 != null) {
            str2 = f5.q();
        } else {
            str2 = null;
        }
        if (!F.g(str, str2)) {
            HmDevice f6 = this.f45235I.f();
            if (f6 != null) {
                str3 = f6.q();
            } else {
                str3 = null;
            }
            HmDevice f7 = this.f45234H.f();
            if (f7 != null) {
                str4 = f7.q();
            }
            return com.harman.sdk.utils.d.E(str3, str4);
        }
        return true;
    }

    @K
    public final void x() {
        HmDevice f4 = this.f45235I.f();
        if (f4 != null) {
            C2323l.f(C0.f52916E, C2322k0.a(), null, new c(f4, null), 2, null);
        }
    }

    @l3.d
    public final LiveData<Boolean> y() {
        return this.f45239M;
    }

    @l3.d
    public final LiveData<HmDevice> z() {
        return this.f45235I;
    }
}
