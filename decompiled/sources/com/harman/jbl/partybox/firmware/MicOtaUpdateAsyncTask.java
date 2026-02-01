package com.harman.jbl.partybox.firmware;

import X2.p;
import X2.q;
import android.os.AsyncTask;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2321k;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

@U({"SMAP\nMicOtaUpdateAsyncTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicOtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/MicOtaUpdateAsyncTask\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,160:1\n27#2:161\n29#2:165\n54#2:166\n57#2:170\n54#2:171\n57#2:175\n54#2:176\n57#2:180\n50#3:162\n55#3:164\n50#3:167\n55#3:169\n50#3:172\n55#3:174\n50#3:177\n55#3:179\n39#3,6:181\n106#4:163\n106#4:168\n106#4:173\n106#4:178\n*S KotlinDebug\n*F\n+ 1 MicOtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/MicOtaUpdateAsyncTask\n*L\n56#1:161\n56#1:165\n59#1:166\n59#1:170\n62#1:171\n62#1:175\n66#1:176\n66#1:180\n56#1:162\n56#1:164\n59#1:167\n59#1:169\n62#1:172\n62#1:174\n66#1:177\n66#1:179\n78#1:181,6\n56#1:163\n59#1:168\n62#1:173\n66#1:178\n*E\n"})
/* loaded from: classes2.dex */
public final class MicOtaUpdateAsyncTask extends AsyncTask<Void, g, g> {

    /* renamed from: i, reason: collision with root package name */
    @l3.d
    public static final a f40406i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @l3.d
    private static final String f40407j = "MicOtaUpdateAsyncTask";

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    private static final String f40408k = "Firmware";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final String f40409a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f40410b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f40411c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final String f40412d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partybox.firmware.c f40413e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final String f40414f;

    /* renamed from: g, reason: collision with root package name */
    private long f40415g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final InterfaceC2282i<e> f40416h;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$doInBackground$model$1", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {com.harman.analytics.deviceAws.a.f37827j}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super g>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f40455I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ e f40457K;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$doInBackground$model$1$1", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements q<InterfaceC2283j<? super g>, Throwable, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f40458I;

            /* renamed from: J, reason: collision with root package name */
            /* synthetic */ Object f40459J;

            a(kotlin.coroutines.c<? super a> cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f40458I == 0) {
                    W.n(obj);
                    com.harman.log.f.b(MicOtaUpdateAsyncTask.f40407j, "doInBackground() >>> exception while executing flow config 2 model:" + ((Throwable) this.f40459J));
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.q
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object z(@l3.d InterfaceC2283j<? super g> interfaceC2283j, @l3.d Throwable th, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                a aVar = new a(cVar);
                aVar.f40459J = th;
                return aVar.D(H0.f51801a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f40457K = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f40455I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2282i u3 = C2284k.u(MicOtaUpdateAsyncTask.this.h(this.f40457K), new a(null));
                this.f40455I = 1;
                obj = C2284k.w0(u3, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super g> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new b(this.f40457K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$doInBackground$otaConfig$1", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super e>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f40460I;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$doInBackground$otaConfig$1$1", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements q<InterfaceC2283j<? super e>, Throwable, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f40462I;

            /* renamed from: J, reason: collision with root package name */
            /* synthetic */ Object f40463J;

            a(kotlin.coroutines.c<? super a> cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f40462I == 0) {
                    W.n(obj);
                    com.harman.log.f.b(MicOtaUpdateAsyncTask.f40407j, "doInBackground() >>> exception while executing ota config flow:" + ((Throwable) this.f40463J));
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.q
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object z(@l3.d InterfaceC2283j<? super e> interfaceC2283j, @l3.d Throwable th, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                a aVar = new a(cVar);
                aVar.f40463J = th;
                return aVar.D(H0.f51801a);
            }
        }

        c(kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f40460I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2282i u3 = C2284k.u(MicOtaUpdateAsyncTask.this.f40416h, new a(null));
                this.f40460I = 1;
                obj = C2284k.w0(u3, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super e> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(cVar);
        }
    }

    public MicOtaUpdateAsyncTask(@l3.d String dongleVersion, @l3.d String devicePid, @l3.d String appVersion, @l3.d String deviceFirmwareVer, @l3.d com.harman.jbl.partybox.firmware.c listener) {
        F.p(dongleVersion, "dongleVersion");
        F.p(devicePid, "devicePid");
        F.p(appVersion, "appVersion");
        F.p(deviceFirmwareVer, "deviceFirmwareVer");
        F.p(listener, "listener");
        this.f40409a = dongleVersion;
        this.f40410b = devicePid;
        this.f40411c = appVersion;
        this.f40412d = deviceFirmwareVer;
        this.f40413e = listener;
        this.f40414f = com.harman.jbl.partybox.f.f40396k;
        com.harman.log.f.d(f40407j, "init >>> dongleVersion[" + dongleVersion + "]\n devicePid[" + devicePid + "]\n appVersion[" + appVersion + "]\n firmwareVer[" + deviceFirmwareVer + "]\n host[" + com.harman.jbl.partybox.f.f40396k + "]\n isAutoOTATest[" + i() + "]");
        final InterfaceC2282i L02 = C2284k.L0(dongleVersion);
        final InterfaceC2282i<String> interfaceC2282i = new InterfaceC2282i<String>() { // from class: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MicOtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/MicOtaUpdateAsyncTask\n*L\n1#1,222:1\n28#2:223\n29#2:225\n57#3:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40429E;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1$2", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40430H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40431I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40432J;

                    /* renamed from: K, reason: collision with root package name */
                    Object f40433K;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40430H = obj;
                        this.f40431I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
                    this.f40429E = interfaceC2283j;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(java.lang.Object r5, @l3.d kotlin.coroutines.c r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1 r0 = (com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40431I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40431I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1 r0 = new com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f40430H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40431I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.W.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f40429E
                        r2 = r5
                        java.lang.String r2 = (java.lang.String) r2
                        boolean r2 = kotlin.text.q.S1(r2)
                        if (r2 != 0) goto L48
                        r0.f40431I = r3
                        java.lang.Object r5 = r6.f(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.H0 r5 = kotlin.H0.f51801a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$filterNot$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j<? super String> interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
        final InterfaceC2282i<String> interfaceC2282i2 = new InterfaceC2282i<String>() { // from class: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MicOtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/MicOtaUpdateAsyncTask\n*L\n1#1,222:1\n55#2:223\n56#2:225\n60#3:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40437E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ MicOtaUpdateAsyncTask f40438F;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40439H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40440I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40441J;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40439H = obj;
                        this.f40440I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j, MicOtaUpdateAsyncTask micOtaUpdateAsyncTask) {
                    this.f40437E = interfaceC2283j;
                    this.f40438F = micOtaUpdateAsyncTask;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(java.lang.Object r6, @l3.d kotlin.coroutines.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1 r0 = (com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40440I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40440I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1 r0 = new com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f40439H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40440I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r7)
                        goto L63
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.W.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f40437E
                        java.lang.String r6 = (java.lang.String) r6
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask r6 = r5.f40438F
                        java.lang.String r6 = com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask.f(r6)
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask r2 = r5.f40438F
                        java.lang.String r2 = com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask.d(r2)
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>()
                        r4.append(r6)
                        r4.append(r2)
                        java.lang.String r6 = "/wirelessmic/ota_config.json"
                        r4.append(r6)
                        java.lang.String r6 = r4.toString()
                        if (r6 == 0) goto L63
                        r0.f40440I = r3
                        java.lang.Object r6 = r7.f(r6, r0)
                        if (r6 != r1) goto L63
                        return r1
                    L63:
                        kotlin.H0 r6 = kotlin.H0.f51801a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j<? super String> interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j, this), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
        final InterfaceC2282i<String> interfaceC2282i3 = new InterfaceC2282i<String>() { // from class: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MicOtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/MicOtaUpdateAsyncTask\n*L\n1#1,222:1\n55#2:223\n56#2:226\n63#3,2:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40444E;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {226}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40445H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40446I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40447J;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40445H = obj;
                        this.f40446I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
                    this.f40444E = interfaceC2283j;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(java.lang.Object r6, @l3.d kotlin.coroutines.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1 r0 = (com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40446I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40446I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1 r0 = new com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f40445H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40446I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r7)
                        goto L67
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.W.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f40444E
                        java.lang.String r6 = (java.lang.String) r6
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "flowPid2Config >>> configUrl:"
                        r2.append(r4)
                        r2.append(r6)
                        java.lang.String r2 = r2.toString()
                        java.lang.String r4 = "MicOtaUpdateAsyncTask"
                        com.harman.log.f.a(r4, r2)
                        java.net.URL r2 = new java.net.URL
                        r2.<init>(r6)
                        java.nio.charset.Charset r6 = kotlin.text.C2222d.f52792b
                        byte[] r2 = kotlin.io.r.i(r2)
                        java.lang.String r4 = new java.lang.String
                        r4.<init>(r2, r6)
                        r0.f40446I = r3
                        java.lang.Object r6 = r7.f(r4, r0)
                        if (r6 != r1) goto L67
                        return r1
                    L67:
                        kotlin.H0 r6 = kotlin.H0.f51801a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$2.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j<? super String> interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
        this.f40416h = new InterfaceC2282i<e>() { // from class: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 MicOtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/MicOtaUpdateAsyncTask\n*L\n1#1,222:1\n55#2:223\n56#2:228\n67#3,4:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40450E;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2", f = "MicOtaUpdateAsyncTask.kt", i = {}, l = {228}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40451H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40452I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40453J;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40451H = obj;
                        this.f40452I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
                    this.f40450E = interfaceC2283j;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(java.lang.Object r6, @l3.d kotlin.coroutines.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1 r0 = (com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40452I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40452I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1 r0 = new com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f40451H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40452I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r7)
                        goto L66
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.W.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f40450E
                        java.lang.String r6 = (java.lang.String) r6
                        com.google.gson.Gson r2 = com.harman.sdk.utils.h.a()
                        java.lang.Class<com.harman.jbl.partybox.firmware.e> r4 = com.harman.jbl.partybox.firmware.e.class
                        java.lang.Object r2 = r2.fromJson(r6, r4)
                        com.harman.jbl.partybox.firmware.e r2 = (com.harman.jbl.partybox.firmware.e) r2
                        r2.i(r6)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r4 = "flowPid2Config >>> otaConfig:\n"
                        r6.append(r4)
                        r6.append(r2)
                        java.lang.String r6 = r6.toString()
                        java.lang.String r4 = "MicOtaUpdateAsyncTask"
                        com.harman.log.f.a(r4, r6)
                        r0.f40452I = r3
                        java.lang.Object r6 = r7.f(r2, r0)
                        if (r6 != r1) goto L66
                        return r1
                    L66:
                        kotlin.H0 r6 = kotlin.H0.f51801a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.MicOtaUpdateAsyncTask$special$$inlined$mapNotNull$3.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j<? super e> interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2282i<g> h(e eVar) {
        return C2284k.I0(new MicOtaUpdateAsyncTask$flowConfig2Model$$inlined$transform$1(C2284k.L0(eVar), null, eVar, this));
    }

    private final boolean i() {
        return com.harman.jbl.partybox.persistence.a.h("auto_ota_test");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    @l3.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public g doInBackground(@l3.d Void... params) {
        Object b4;
        Object b5;
        F.p(params, "params");
        this.f40415g = System.currentTimeMillis();
        b4 = C2321k.b(null, new c(null), 1, null);
        e eVar = (e) b4;
        if (eVar != null) {
            b5 = C2321k.b(null, new b(eVar, null), 1, null);
            g gVar = (g) b5;
            if (gVar == null) {
                com.harman.log.f.b(f40407j, "doInBackground() >>> fail to map otaConfig to model");
                H0 h02 = H0.f51801a;
            }
            return gVar;
        }
        com.harman.log.f.g(f40407j, "doInBackground() >>> fail to get otaConfig");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(@l3.e g gVar) {
        super.onPostExecute(gVar);
        if (gVar == null) {
            com.harman.log.f.b(f40407j, "onPostExecute() >>> empty remoteUpdateModel");
        } else {
            this.f40413e.a(gVar);
        }
    }
}
