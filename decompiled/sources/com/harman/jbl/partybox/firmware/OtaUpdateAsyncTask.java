package com.harman.jbl.partybox.firmware;

import X2.p;
import X2.q;
import android.content.Context;
import android.os.AsyncTask;
import com.harman.sdk.setting.ProductConfig;
import com.harman.sdk.utils.i;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import kotlinx.coroutines.C2321k;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;

@U({"SMAP\nOtaUpdateAsyncTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/OtaUpdateAsyncTask\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n27#2:391\n29#2:395\n54#2:396\n57#2:400\n54#2:401\n57#2:405\n54#2:406\n57#2:410\n54#2:411\n57#2:415\n50#3:392\n55#3:394\n50#3:397\n55#3:399\n50#3:402\n55#3:404\n50#3:407\n55#3:409\n50#3:412\n55#3:414\n39#3,6:417\n106#4:393\n106#4:398\n106#4:403\n106#4:408\n106#4:413\n1#5:416\n*S KotlinDebug\n*F\n+ 1 OtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/OtaUpdateAsyncTask\n*L\n72#1:391\n72#1:395\n74#1:396\n74#1:400\n76#1:401\n76#1:405\n87#1:406\n87#1:410\n94#1:411\n94#1:415\n72#1:392\n72#1:394\n74#1:397\n74#1:399\n76#1:402\n76#1:404\n87#1:407\n87#1:409\n94#1:412\n94#1:414\n164#1:417,6\n72#1:393\n74#1:398\n76#1:403\n87#1:408\n94#1:413\n*E\n"})
/* loaded from: classes2.dex */
public final class OtaUpdateAsyncTask extends AsyncTask<Void, g, g> {

    /* renamed from: m, reason: collision with root package name */
    @l3.d
    public static final a f40464m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    @l3.d
    private static final String f40465n = "OtaUpdateAsyncTask";

    /* renamed from: o, reason: collision with root package name */
    @l3.d
    private static final String f40466o = "Firmware";

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private final Context f40467a;

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private final String f40468b;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    private final String f40469c;

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    private final String f40470d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final String f40471e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partybox.firmware.c f40472f;

    /* renamed from: g, reason: collision with root package name */
    @l3.d
    private final String f40473g;

    /* renamed from: h, reason: collision with root package name */
    @l3.d
    private final String f40474h;

    /* renamed from: i, reason: collision with root package name */
    @l3.e
    private String f40475i;

    /* renamed from: j, reason: collision with root package name */
    private long f40476j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f40477k;

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    private final InterfaceC2282i<e> f40478l;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$doInBackground$model$1", f = "OtaUpdateAsyncTask.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super g>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f40525I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ e f40527K;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$doInBackground$model$1$1", f = "OtaUpdateAsyncTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements q<InterfaceC2283j<? super g>, Throwable, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f40528I;

            /* renamed from: J, reason: collision with root package name */
            /* synthetic */ Object f40529J;

            a(kotlin.coroutines.c<? super a> cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f40528I == 0) {
                    W.n(obj);
                    com.harman.log.f.b(OtaUpdateAsyncTask.f40465n, "doInBackground() >>> exception while executing flow config 2 model:" + ((Throwable) this.f40529J));
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.q
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object z(@l3.d InterfaceC2283j<? super g> interfaceC2283j, @l3.d Throwable th, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                a aVar = new a(cVar);
                aVar.f40529J = th;
                return aVar.D(H0.f51801a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f40527K = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f40525I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2282i u3 = C2284k.u(OtaUpdateAsyncTask.this.r(this.f40527K), new a(null));
                this.f40525I = 1;
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
            return new b(this.f40527K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$doInBackground$otaConfig$1", f = "OtaUpdateAsyncTask.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super e>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f40530I;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$doInBackground$otaConfig$1$1", f = "OtaUpdateAsyncTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements q<InterfaceC2283j<? super e>, Throwable, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f40532I;

            /* renamed from: J, reason: collision with root package name */
            /* synthetic */ Object f40533J;

            a(kotlin.coroutines.c<? super a> cVar) {
                super(3, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f40532I == 0) {
                    W.n(obj);
                    com.harman.log.f.b(OtaUpdateAsyncTask.f40465n, "doInBackground() >>> exception while executing ota config flow:" + ((Throwable) this.f40533J));
                    return H0.f51801a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.q
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object z(@l3.d InterfaceC2283j<? super e> interfaceC2283j, @l3.d Throwable th, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                a aVar = new a(cVar);
                aVar.f40533J = th;
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
            int i4 = this.f40530I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2282i u3 = C2284k.u(OtaUpdateAsyncTask.this.f40478l, new a(null));
                this.f40530I = 1;
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

    public OtaUpdateAsyncTask(@l3.d Context context, @l3.d String pid, @l3.d String deviceMAC, @l3.d String appVersion, @l3.d String deviceFirmwareVer, @l3.d com.harman.jbl.partybox.firmware.c listener) {
        F.p(context, "context");
        F.p(pid, "pid");
        F.p(deviceMAC, "deviceMAC");
        F.p(appVersion, "appVersion");
        F.p(deviceFirmwareVer, "deviceFirmwareVer");
        F.p(listener, "listener");
        this.f40467a = context;
        this.f40468b = pid;
        this.f40469c = deviceMAC;
        this.f40470d = appVersion;
        this.f40471e = deviceFirmwareVer;
        this.f40472f = listener;
        this.f40473g = com.harman.jbl.partybox.f.f40396k;
        String str = context.getFilesDir().getAbsolutePath() + File.separator + f40466o;
        this.f40474h = str;
        com.harman.log.f.d(f40465n, "init >>> pid[" + pid + "]\n appVersion[" + appVersion + "]\n firmwareVer[" + deviceFirmwareVer + "]\n host[" + com.harman.jbl.partybox.f.f40396k + "]\n firmware bin file target path[" + str + "]\n isAutoOTATest[" + s() + "]");
        final InterfaceC2282i L02 = C2284k.L0(pid);
        final InterfaceC2282i<String> interfaceC2282i = new InterfaceC2282i<String>() { // from class: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 OtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/OtaUpdateAsyncTask\n*L\n1#1,222:1\n28#2:223\n29#2:225\n73#3:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40491E;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1$2", f = "OtaUpdateAsyncTask.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40492H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40493I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40494J;

                    /* renamed from: K, reason: collision with root package name */
                    Object f40495K;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40492H = obj;
                        this.f40493I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
                    this.f40491E = interfaceC2283j;
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
                        boolean r0 = r6 instanceof com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1 r0 = (com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40493I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40493I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1 r0 = new com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f40492H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40493I
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
                        kotlinx.coroutines.flow.j r6 = r4.f40491E
                        r2 = r5
                        java.lang.String r2 = (java.lang.String) r2
                        boolean r2 = kotlin.text.q.S1(r2)
                        if (r2 != 0) goto L48
                        r0.f40493I = r3
                        java.lang.Object r5 = r6.f(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.H0 r5 = kotlin.H0.f51801a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$filterNot$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
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
        final InterfaceC2282i<ProductConfig.ProductItem> interfaceC2282i2 = new InterfaceC2282i<ProductConfig.ProductItem>() { // from class: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 OtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/OtaUpdateAsyncTask\n*L\n1#1,222:1\n55#2:223\n56#2:225\n75#3:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40498E;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2", f = "OtaUpdateAsyncTask.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40499H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40500I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40501J;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40499H = obj;
                        this.f40500I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
                    this.f40498E = interfaceC2283j;
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
                        boolean r0 = r6 instanceof com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1 r0 = (com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40500I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40500I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1 r0 = new com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f40499H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40500I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.W.n(r6)
                        kotlinx.coroutines.flow.j r6 = r4.f40498E
                        java.lang.String r5 = (java.lang.String) r5
                        com.harman.sdk.setting.ProductConfig$ProductItem r5 = com.harman.sdk.utils.d.u(r5)
                        if (r5 == 0) goto L47
                        r0.f40500I = r3
                        java.lang.Object r5 = r6.f(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.H0 r5 = kotlin.H0.f51801a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$1.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2282i
            @l3.e
            public Object a(@l3.d InterfaceC2283j<? super ProductConfig.ProductItem> interfaceC2283j, @l3.d kotlin.coroutines.c cVar) {
                Object l4;
                Object a4 = InterfaceC2282i.this.a(new AnonymousClass2(interfaceC2283j), cVar);
                l4 = kotlin.coroutines.intrinsics.b.l();
                if (a4 == l4) {
                    return a4;
                }
                return H0.f51801a;
            }
        };
        final InterfaceC2282i<String> interfaceC2282i3 = new InterfaceC2282i<String>() { // from class: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 OtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/OtaUpdateAsyncTask\n*L\n1#1,222:1\n55#2:223\n56#2:233\n77#3,9:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40505E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ OtaUpdateAsyncTask f40506F;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2", f = "OtaUpdateAsyncTask.kt", i = {}, l = {233}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40507H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40508I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40509J;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40507H = obj;
                        this.f40508I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j, OtaUpdateAsyncTask otaUpdateAsyncTask) {
                    this.f40505E = interfaceC2283j;
                    this.f40506F = otaUpdateAsyncTask;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(java.lang.Object r7, @l3.d kotlin.coroutines.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1 r0 = (com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40508I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40508I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1 r0 = new com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f40507H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40508I
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.W.n(r8)
                        goto La4
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        kotlin.W.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f40505E
                        com.harman.sdk.setting.ProductConfig$ProductItem r7 = (com.harman.sdk.setting.ProductConfig.ProductItem) r7
                        java.lang.String r7 = r7.h()
                        if (r7 == 0) goto La7
                        boolean r2 = kotlin.text.q.S1(r7)
                        if (r2 != 0) goto La7
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r2 = r6.f40506F
                        java.lang.String r2 = com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask.k(r2)
                        boolean r2 = com.harman.sdk.utils.d.K(r2)
                        if (r2 != 0) goto L74
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r2 = r6.f40506F
                        java.lang.String r2 = com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask.k(r2)
                        boolean r2 = com.harman.sdk.utils.d.M(r2)
                        if (r2 == 0) goto L5e
                        goto L74
                    L5e:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r2 = r6.f40506F
                        java.lang.String r2 = com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask.j(r2)
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>()
                        r4.append(r2)
                        r4.append(r7)
                        java.lang.String r7 = r4.toString()
                        goto L99
                    L74:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r7 = r6.f40506F
                        java.lang.String r7 = com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask.k(r7)
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r2 = r6.f40506F
                        java.lang.String r2 = com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask.g(r2)
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>()
                        java.lang.String r5 = "https://storage.lscloud.harman.com/pb-ota-prod/ota-config?pid="
                        r4.append(r5)
                        r4.append(r7)
                        java.lang.String r7 = "&current_fw_version="
                        r4.append(r7)
                        r4.append(r2)
                        java.lang.String r7 = r4.toString()
                    L99:
                        if (r7 == 0) goto La4
                        r0.f40508I = r3
                        java.lang.Object r7 = r8.f(r7, r0)
                        if (r7 != r1) goto La4
                        return r1
                    La4:
                        kotlin.H0 r7 = kotlin.H0.f51801a
                        return r7
                    La7:
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        r8.<init>()
                        java.lang.String r0 = "flowPid2Config >>> invalid otaPath:"
                        r8.append(r0)
                        r8.append(r7)
                        java.lang.String r8 = r8.toString()
                        java.lang.String r0 = "OtaUpdateAsyncTask"
                        com.harman.log.f.g(r0, r8)
                        java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "illegal otaPath["
                        r0.append(r1)
                        r0.append(r7)
                        java.lang.String r7 = "]"
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$2.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
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
        final InterfaceC2282i<String> interfaceC2282i4 = new InterfaceC2282i<String>() { // from class: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 OtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/OtaUpdateAsyncTask\n*L\n1#1,222:1\n55#2:223\n56#2:229\n88#3,5:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40513E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ OtaUpdateAsyncTask f40514F;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2", f = "OtaUpdateAsyncTask.kt", i = {}, l = {229}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40515H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40516I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40517J;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40515H = obj;
                        this.f40516I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j, OtaUpdateAsyncTask otaUpdateAsyncTask) {
                    this.f40513E = interfaceC2283j;
                    this.f40514F = otaUpdateAsyncTask;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
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
                        boolean r0 = r7 instanceof com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1 r0 = (com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40516I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40516I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1 r0 = new com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f40515H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40516I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r7)
                        goto L8b
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.W.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f40513E
                        java.lang.String r6 = (java.lang.String) r6
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "flowPid2Config >>> configUrl:"
                        r2.append(r4)
                        r2.append(r6)
                        java.lang.String r2 = r2.toString()
                        java.lang.String r4 = "OtaUpdateAsyncTask"
                        com.harman.log.f.a(r4, r2)
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r2 = r5.f40514F
                        java.lang.String r2 = com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask.k(r2)
                        boolean r2 = com.harman.sdk.utils.d.K(r2)
                        if (r2 != 0) goto L78
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r2 = r5.f40514F
                        java.lang.String r2 = com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask.k(r2)
                        boolean r2 = com.harman.sdk.utils.d.M(r2)
                        if (r2 == 0) goto L67
                        goto L78
                    L67:
                        java.net.URL r2 = new java.net.URL
                        r2.<init>(r6)
                        java.nio.charset.Charset r6 = kotlin.text.C2222d.f52792b
                        byte[] r2 = kotlin.io.r.i(r2)
                        java.lang.String r4 = new java.lang.String
                        r4.<init>(r2, r6)
                        goto L80
                    L78:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask r2 = r5.f40514F
                        java.lang.String r4 = "6FqiAFTHoC8TOofex4S0d8GcOGiQcg8Ri9bIfV81"
                        java.lang.String r4 = r2.u(r6, r4)
                    L80:
                        if (r4 == 0) goto L8b
                        r0.f40516I = r3
                        java.lang.Object r6 = r7.f(r4, r0)
                        if (r6 != r1) goto L8b
                        return r1
                    L8b:
                        kotlin.H0 r6 = kotlin.H0.f51801a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$3.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
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
        this.f40478l = new InterfaceC2282i<e>() { // from class: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4

            @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 OtaUpdateAsyncTask.kt\ncom/harman/jbl/partybox/firmware/OtaUpdateAsyncTask\n*L\n1#1,222:1\n55#2:223\n56#2:229\n95#3,5:224\n*E\n"})
            /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4$2, reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements InterfaceC2283j {

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ InterfaceC2283j f40520E;

                @E(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4$2", f = "OtaUpdateAsyncTask.kt", i = {}, l = {229}, m = "emit", n = {}, s = {})
                @U({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4$2$1, reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: H, reason: collision with root package name */
                    /* synthetic */ Object f40521H;

                    /* renamed from: I, reason: collision with root package name */
                    int f40522I;

                    /* renamed from: J, reason: collision with root package name */
                    Object f40523J;

                    public AnonymousClass1(kotlin.coroutines.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l3.e
                    public final Object D(@l3.d Object obj) {
                        this.f40521H = obj;
                        this.f40522I |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.f(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2283j interfaceC2283j) {
                    this.f40520E = interfaceC2283j;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC2283j
                @l3.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object f(java.lang.Object r7, @l3.d kotlin.coroutines.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4$2$1 r0 = (com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f40522I
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f40522I = r1
                        goto L18
                    L13:
                        com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4$2$1 r0 = new com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f40521H
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                        int r2 = r0.f40522I
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.W.n(r8)
                        goto L7a
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.W.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f40520E
                        java.lang.String r7 = (java.lang.String) r7
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "flowPid2Config >>> jsonString:\n"
                        r2.append(r4)
                        r2.append(r7)
                        java.lang.String r2 = r2.toString()
                        java.lang.String r4 = "OtaUpdateAsyncTask"
                        com.harman.log.f.a(r4, r2)
                        com.google.gson.Gson r2 = com.harman.sdk.utils.h.a()
                        java.lang.Class<com.harman.jbl.partybox.firmware.e> r5 = com.harman.jbl.partybox.firmware.e.class
                        java.lang.Object r2 = r2.fromJson(r7, r5)
                        com.harman.jbl.partybox.firmware.e r2 = (com.harman.jbl.partybox.firmware.e) r2
                        r2.i(r7)
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r5 = "flowPid2Config >>> otaConfig:\n"
                        r7.append(r5)
                        r7.append(r2)
                        java.lang.String r7 = r7.toString()
                        com.harman.log.f.a(r4, r7)
                        r0.f40522I = r3
                        java.lang.Object r7 = r8.f(r2, r0)
                        if (r7 != r1) goto L7a
                        return r1
                    L7a:
                        kotlin.H0 r7 = kotlin.H0.f51801a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.firmware.OtaUpdateAsyncTask$special$$inlined$mapNotNull$4.AnonymousClass2.f(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
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
    public final boolean p(String str, String str2) {
        boolean S12;
        boolean K12;
        String a4 = i.a(str);
        com.harman.log.f.d(f40465n, "checkMD5andUpgrade() >>> local.MD5[" + a4 + "] target.MD5[" + str2 + "] filePath:" + str);
        if (a4 != null) {
            S12 = z.S1(a4);
            if (!S12) {
                K12 = z.K1(a4, str2, true);
                if (K12) {
                    com.harman.log.f.d(f40465n, "checkMD5andUpgrade() >>> MD5 match");
                    return true;
                }
            }
        }
        com.harman.log.f.d(f40465n, "checkMD5andUpgrade() >>> MD5 not match");
        com.harman.sdk.utils.f.g(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2282i<g> r(e eVar) {
        return C2284k.I0(new OtaUpdateAsyncTask$flowConfig2Model$$inlined$transform$1(C2284k.L0(eVar), null, eVar, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s() {
        return com.harman.jbl.partybox.persistence.a.h("auto_ota_test");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(String str, String str2, String str3, String str4) {
        com.harman.log.f.d(f40465n, "startDownloadFirmware() >>> filePath[" + str + "]\nfileName[" + str2 + "]\nmd5[" + str3 + "]\nserverURl[" + str4 + "]");
        com.harman.sdk.utils.f.f(str2);
        if (new com.harman.jbl.partybox.firmware.a().a(str4, str2)) {
            boolean p4 = p(str, str3);
            com.harman.log.f.d(f40465n, "startDownloadFirmware() >>> download suc. checkMD5Rst[" + p4 + "]");
            return p4;
        }
        com.harman.log.f.b(f40465n, "startDownloadFirmware() >>> download fail");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    @l3.e
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public g doInBackground(@l3.d Void... params) {
        Object b4;
        Object b5;
        F.p(params, "params");
        this.f40476j = System.currentTimeMillis();
        b4 = C2321k.b(null, new c(null), 1, null);
        e eVar = (e) b4;
        if (eVar != null) {
            b5 = C2321k.b(null, new b(eVar, null), 1, null);
            g gVar = (g) b5;
            if (gVar == null) {
                com.harman.log.f.b(f40465n, "doInBackground() >>> fail to map otaConfig to model");
                H0 h02 = H0.f51801a;
            }
            return gVar;
        }
        com.harman.log.f.g(f40465n, "doInBackground() >>> fail to get otaConfig");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(@l3.e g gVar) {
        boolean z3;
        super.onPostExecute(gVar);
        if (gVar == null) {
            com.harman.log.f.b(f40465n, "onPostExecute() >>> empty remoteUpdateModel");
            return;
        }
        com.harman.log.f.a(f40465n, "onPostExecute() >>> remoteUpdateModel = " + gVar);
        if (gVar.b() && this.f40477k) {
            com.harman.log.f.d(f40465n, " onPostExecute() >>> OTA file full process success. Total Time [" + (System.currentTimeMillis() - this.f40476j) + "] ms");
            com.harman.jbl.partybox.persistence.a.I("LOCAL_FILE_PATH", gVar.f40549e);
            z3 = true;
        } else {
            com.harman.log.f.b(f40465n, " onPostExecute() >>> OTA file full process fail. isLocalFilePathContainsMD5[" + gVar.b() + "] isLocalOTAFileExists[" + this.f40477k + "]");
            z3 = false;
        }
        gVar.d(z3);
        this.f40472f.a(gVar);
    }

    @l3.d
    public final String u(@l3.d String requestUrl, @l3.d String token) {
        F.p(requestUrl, "requestUrl");
        F.p(token, "token");
        try {
            URLConnection openConnection = new URL(requestUrl).openConnection();
            F.n(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setRequestProperty("x-api-key", token);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                bufferedReader.close();
            } catch (Exception e4) {
                com.harman.log.f.a(f40465n, "sendPostRequest -----> BufferedReader Exception: " + e4.getMessage());
                e4.printStackTrace();
            }
            String headerField = httpURLConnection.getHeaderField("Bin-File-Base-Url");
            com.harman.log.f.a(f40465n, "sendPostRequest -----> Bin-File-Base-Url: " + headerField);
            this.f40475i = headerField;
            com.harman.log.f.a(f40465n, "sendPostRequest -----> current json: " + ((Object) sb));
            try {
                httpURLConnection.disconnect();
            } catch (Exception e5) {
                com.harman.log.f.a(f40465n, "sendPostRequest -----> disconnect Exception: " + e5.getMessage());
                e5.printStackTrace();
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String sb2 = sb.toString();
                F.m(sb2);
                return sb2;
            }
            com.harman.log.f.a(f40465n, "sendPostRequest -----> request Error: responseCode = " + responseCode + " response = " + ((Object) sb));
            throw new Exception("Error: responseCode = " + responseCode);
        } catch (Exception e6) {
            com.harman.log.f.a(f40465n, "sendPostRequest -----> catch Exception: " + e6.getMessage());
            e6.printStackTrace();
            return "";
        }
    }
}
