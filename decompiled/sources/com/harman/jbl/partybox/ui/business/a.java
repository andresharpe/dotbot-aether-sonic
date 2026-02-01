package com.harman.jbl.partybox.ui.business;

import B2.c;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.message.GestureInfo;
import com.harman.sdk.utils.DeviceProtocol;
import com.harman.sdk.utils.MessageID;
import com.harman.sdk.utils.StatusCode;
import java.util.List;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.collections.C2101p;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.InterfaceC2333q;
import y2.InterfaceC2445a;

@U({"SMAP\nLogicBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,440:1\n314#2,11:441\n314#2,11:452\n314#2,11:463\n*S KotlinDebug\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness\n*L\n209#1:441,11\n270#1:452,11\n323#1:463,11\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f42135a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final long f42136b = 30000;

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final String f42137c = "LogicBusiness";

    /* renamed from: d, reason: collision with root package name */
    public static final long f42138d = 10000;

    /* renamed from: e, reason: collision with root package name */
    public static final long f42139e = 20000;

    /* renamed from: f, reason: collision with root package name */
    public static final long f42140f = 40000;

    /* renamed from: g, reason: collision with root package name */
    public static final long f42141g = 410000;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0}, l = {193}, m = "sendDeviceCommandWithTimeout", n = {"device"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class A extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42142H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f42143I;

        /* renamed from: K, reason: collision with root package name */
        int f42145K;

        A(kotlin.coroutines.c<? super A> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42143I = obj;
            this.f42145K |= Integer.MIN_VALUE;
            return a.this.r(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness$sendDeviceCommandWithTimeout$scanResult$1$1", f = "LogicBusiness.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class B extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42146I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f42148K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ MessageID f42149L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ X2.p<HmDevice, z2.d, H0> f42150M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        B(HmDevice hmDevice, MessageID messageID, X2.p<? super HmDevice, ? super z2.d, H0> pVar, kotlin.coroutines.c<? super B> cVar) {
            super(2, cVar);
            this.f42148K = hmDevice;
            this.f42149L = messageID;
            this.f42150M = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = b.l();
            int i4 = this.f42146I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f42148K;
                MessageID messageID = this.f42149L;
                X2.p<HmDevice, z2.d, H0> pVar = this.f42150M;
                this.f42146I = 1;
                obj = aVar.q(hmDevice, messageID, pVar, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((B) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new B(this.f42148K, this.f42149L, this.f42150M, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 1, 2}, l = {104, androidx.appcompat.app.i.f4871X, 113}, m = "connectAndPowerOn", n = {"mainDevice", "mainDevice", "mainDevice"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.harman.jbl.partybox.ui.business.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0363a extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42151H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f42152I;

        /* renamed from: K, reason: collision with root package name */
        int f42154K;

        C0363a(kotlin.coroutines.c<? super C0363a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42152I = obj;
            this.f42154K |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 0}, l = {66}, m = "connectAndPowerOnWithTimeout", n = {"this", "device"}, s = {"L$0", "L$1"})
    /* renamed from: com.harman.jbl.partybox.ui.business.a$b, reason: case insensitive filesystem */
    /* loaded from: classes2.dex */
    public static final class C1968b extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42155H;

        /* renamed from: I, reason: collision with root package name */
        Object f42156I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f42157J;

        /* renamed from: L, reason: collision with root package name */
        int f42159L;

        C1968b(kotlin.coroutines.c<? super C1968b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42157J = obj;
            this.f42159L |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness$connectAndPowerOnWithTimeout$scanResult$1$1", f = "LogicBusiness.kt", i = {}, l = {ConstraintLayout.b.a.f9609h0}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42160I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f42162K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(HmDevice hmDevice, kotlin.coroutines.c<? super c> cVar) {
            super(2, cVar);
            this.f42162K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = b.l();
            int i4 = this.f42160I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f42162K;
                this.f42160I = 1;
                obj = aVar.e(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(this.f42162K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 0, 1, 1}, l = {88, 93, 94}, m = "connectAndRequestInfo", n = {"this", "mainDevice", "this", "mainDevice"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class d extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42163H;

        /* renamed from: I, reason: collision with root package name */
        Object f42164I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f42165J;

        /* renamed from: L, reason: collision with root package name */
        int f42167L;

        d(kotlin.coroutines.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42165J = obj;
            this.f42167L |= Integer.MIN_VALUE;
            return a.this.g(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 0}, l = {30}, m = "connectAndRequestInfoWithTimeout", n = {"this", "device"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class e extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42168H;

        /* renamed from: I, reason: collision with root package name */
        Object f42169I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f42170J;

        /* renamed from: L, reason: collision with root package name */
        int f42172L;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42170J = obj;
            this.f42172L |= Integer.MIN_VALUE;
            return a.this.h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness$connectAndRequestInfoWithTimeout$scanResult$1$1", f = "LogicBusiness.kt", i = {}, l = {ConstraintLayout.b.a.f9573F}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class f extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42173I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f42175K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(HmDevice hmDevice, kotlin.coroutines.c<? super f> cVar) {
            super(2, cVar);
            this.f42175K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = b.l();
            int i4 = this.f42173I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f42175K;
                this.f42173I = 1;
                obj = aVar.g(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((f) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new f(this.f42175K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ com.harman.sdk.impl.connect.i f42176F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ h f42177G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(com.harman.sdk.impl.connect.i iVar, h hVar) {
            super(1);
            this.f42176F = iVar;
            this.f42177G = hVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            this.f42176F.d(this.f42177G);
        }
    }

    @U({"SMAP\nLogicBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness$connectDevice$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,440:1\n94#2,4:441\n94#2,4:445\n*S KotlinDebug\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness$connectDevice$2$listener$1\n*L\n293#1:441,4\n305#1:445,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class h implements InterfaceC2445a.InterfaceC0551a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HmDevice f42178a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.harman.sdk.impl.connect.i f42179b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f42180c;

        /* JADX WARN: Multi-variable type inference failed */
        h(HmDevice hmDevice, com.harman.sdk.impl.connect.i iVar, InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f42178a = hmDevice;
            this.f42179b = iVar;
            this.f42180c = interfaceC2333q;
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void a(@l3.e HmDevice hmDevice, int i4, @l3.d DeviceProtocol protocol) {
            String str;
            F.p(protocol, "protocol");
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (!bVar.o(this.f42178a, hmDevice) || 2 != i4) {
                return;
            }
            this.f42179b.d(this);
            com.harman.jbl.partybox.ui.party.auracast.o oVar = com.harman.jbl.partybox.ui.party.auracast.o.f44854a;
            if (oVar.q(i4)) {
                str = "suc";
            } else {
                str = L1.a.f1625n3;
            }
            com.harman.log.f.d(a.f42137c, "connectDevice() >>> connect device " + str + " @[" + System.currentTimeMillis() + "]:\n" + bVar.t(this.f42178a));
            InterfaceC2333q<Boolean> interfaceC2333q = this.f42180c;
            Boolean valueOf = Boolean.valueOf(oVar.q(i4));
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(valueOf));
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void b(@l3.d HmDevice hmDevice) {
            InterfaceC2445a.InterfaceC0551a.C0552a.a(this, hmDevice);
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
            InterfaceC2445a.InterfaceC0551a.C0552a.b(this, device);
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (!bVar.o(this.f42178a, device)) {
                return;
            }
            com.harman.log.f.d(a.f42137c, "onStandbyDeviceBLEConnected() >>> connect suc. device:\n" + bVar.t(device));
            this.f42179b.d(this);
            InterfaceC2333q<Boolean> interfaceC2333q = this.f42180c;
            Boolean bool = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(bool));
            }
        }

        @Override // y2.InterfaceC2445a.InterfaceC0551a
        public void d(@l3.d BaseMessage deviceMessage) {
            F.p(deviceMessage, "deviceMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 0}, l = {368}, m = "connectDeviceWithTimeout", n = {"this", "device"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class i extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42181H;

        /* renamed from: I, reason: collision with root package name */
        Object f42182I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f42183J;

        /* renamed from: L, reason: collision with root package name */
        int f42185L;

        i(kotlin.coroutines.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42183J = obj;
            this.f42185L |= Integer.MIN_VALUE;
            return a.this.j(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness$connectDeviceWithTimeout$connectResult$1$1", f = "LogicBusiness.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class j extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42186I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f42188K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(HmDevice hmDevice, kotlin.coroutines.c<? super j> cVar) {
            super(2, cVar);
            this.f42188K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = b.l();
            int i4 = this.f42186I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f42188K;
                this.f42186I = 1;
                obj = aVar.i(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((j) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new j(this.f42188K, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 0, 1, 2}, l = {47, 51, 58}, m = "powerOnAndRequestDeviceInfo", n = {"this", "mainDevice", "mainDevice", "mainDevice"}, s = {"L$0", "L$1", "L$0", "L$0"})
    /* loaded from: classes2.dex */
    public static final class k extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42189H;

        /* renamed from: I, reason: collision with root package name */
        Object f42190I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f42191J;

        /* renamed from: L, reason: collision with root package name */
        int f42193L;

        k(kotlin.coroutines.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42191J = obj;
            this.f42193L |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7}, l = {123, 129, 135, 141, 149, 157, GestureInfo.f48261u0, 174}, m = "requestDeviceInfo", n = {"this", "mainDevice", "this", "mainDevice", "this", "mainDevice", "this", "mainDevice", "this", "mainDevice", "this", "mainDevice", "this", "mainDevice", "mainDevice"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    /* loaded from: classes2.dex */
    public static final class l extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42194H;

        /* renamed from: I, reason: collision with root package name */
        Object f42195I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f42196J;

        /* renamed from: L, reason: collision with root package name */
        int f42198L;

        l(kotlin.coroutines.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42196J = obj;
            this.f42198L |= Integer.MIN_VALUE;
            return a.this.m(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class m extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final m f42199F = new m();

        m() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.e e4 = com.harman.sdk.b.f47608a.e(device);
            if (e4 != null) {
                e4.h0(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class n extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final n f42200F = new n();

        n() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.b a4 = com.harman.sdk.b.f47608a.a(device);
            if (a4 != null) {
                a4.d0(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class o extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final o f42201F = new o();

        o() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.i h4 = com.harman.sdk.b.f47608a.h(device);
            if (h4 != null) {
                h4.a(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class p extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final p f42202F = new p();

        p() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.l j4 = com.harman.sdk.b.f47608a.j(device);
            if (j4 != null) {
                j4.i0(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class q extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final q f42203F = new q();

        q() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.j i4 = com.harman.sdk.b.f47608a.i(device);
            if (i4 != null) {
                i4.E(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class r extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final r f42204F = new r();

        r() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.h g4 = com.harman.sdk.b.f47608a.g(device);
            if (g4 != null) {
                g4.F(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class s extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final s f42205F = new s();

        s() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.f b4 = com.harman.sdk.b.f47608a.b(device);
            if (b4 != null) {
                b4.z0(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class t extends Lambda implements X2.p<HmDevice, z2.d, H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final t f42206F = new t();

        t() {
            super(2);
        }

        public final void c(@l3.d HmDevice device, @l3.d z2.d listener) {
            F.p(device, "device");
            F.p(listener, "listener");
            z2.e e4 = com.harman.sdk.b.f47608a.e(device);
            if (e4 != null) {
                e4.a0(device, listener);
            }
        }

        @Override // X2.p
        public /* bridge */ /* synthetic */ H0 c0(HmDevice hmDevice, z2.d dVar) {
            c(hmDevice, dVar);
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0, 0}, l = {250, GestureInfo.f48245e0}, m = "scanAndConnect", n = {"this", "device"}, s = {"L$0", "L$1"})
    /* loaded from: classes2.dex */
    public static final class u extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42207H;

        /* renamed from: I, reason: collision with root package name */
        Object f42208I;

        /* renamed from: J, reason: collision with root package name */
        /* synthetic */ Object f42209J;

        /* renamed from: L, reason: collision with root package name */
        int f42211L;

        u(kotlin.coroutines.c<? super u> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42209J = obj;
            this.f42211L |= Integer.MIN_VALUE;
            return a.this.n(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class v extends Lambda implements X2.l<Throwable, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ w f42212F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(w wVar) {
            super(1);
            this.f42212F = wVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Throwable th) {
            c(th);
            return H0.f51801a;
        }

        public final void c(@l3.e Throwable th) {
            List Jy;
            B2.c k4 = com.harman.sdk.b.f47608a.k();
            if (k4 != null) {
                Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
                k4.j(Jy, this.f42212F);
            }
        }
    }

    @U({"SMAP\nLogicBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness$scanDevice$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,440:1\n94#2,4:441\n94#2,4:445\n*S KotlinDebug\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness$scanDevice$2$listener$1\n*L\n342#1:441,4\n351#1:445,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class w implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HmDevice f42213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f42214b;

        /* JADX WARN: Multi-variable type inference failed */
        w(HmDevice hmDevice, InterfaceC2333q<? super Boolean> interfaceC2333q) {
            this.f42213a = hmDevice;
            this.f42214b = interfaceC2333q;
        }

        @Override // B2.c.b
        public void b(int i4, @l3.e String str) {
            List Jy;
            B2.c k4 = com.harman.sdk.b.f47608a.k();
            if (k4 != null) {
                Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
                k4.j(Jy, this);
            }
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            InterfaceC2333q<Boolean> interfaceC2333q = this.f42214b;
            Boolean bool = Boolean.FALSE;
            if (interfaceC2333q.c()) {
                Result.a aVar = Result.f51807F;
                interfaceC2333q.x(Result.b(bool));
            }
        }

        @Override // B2.c.b
        public void c(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // B2.c.b
        public void d(@l3.d HmDevice device) {
            F.p(device, "device");
        }

        @Override // B2.c.b
        public void e(@l3.d HmDevice scannedDevice) {
            List Jy;
            F.p(scannedDevice, "scannedDevice");
            com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
            if (!bVar.o(this.f42213a, scannedDevice)) {
                return;
            }
            if (scannedDevice.O() && !scannedDevice.R()) {
                B2.c k4 = com.harman.sdk.b.f47608a.k();
                if (k4 != null) {
                    Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
                    k4.j(Jy, this);
                }
                com.harman.log.f.d(a.f42137c, "scanDevice() >>> scan device suc @[" + System.currentTimeMillis() + "]:\n" + bVar.t(this.f42213a));
                InterfaceC2333q<Boolean> interfaceC2333q = this.f42214b;
                Boolean bool = Boolean.TRUE;
                if (interfaceC2333q.c()) {
                    Result.a aVar = Result.f51807F;
                    interfaceC2333q.x(Result.b(bool));
                    return;
                }
                return;
            }
            com.harman.log.f.d(a.f42137c, "scanDevice() >>> scan device suc but A2dp is not connected or bt is connected");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness", f = "LogicBusiness.kt", i = {0}, l = {v.c.f7438d}, m = "scanDeviceWithTimeout", n = {"device"}, s = {"L$0"})
    /* loaded from: classes2.dex */
    public static final class x extends ContinuationImpl {

        /* renamed from: H, reason: collision with root package name */
        Object f42215H;

        /* renamed from: I, reason: collision with root package name */
        /* synthetic */ Object f42216I;

        /* renamed from: K, reason: collision with root package name */
        int f42218K;

        x(kotlin.coroutines.c<? super x> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            this.f42216I = obj;
            this.f42218K |= Integer.MIN_VALUE;
            return a.this.p(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.business.LogicBusiness$scanDeviceWithTimeout$scanResult$1$1", f = "LogicBusiness.kt", i = {}, l = {404}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class y extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super Boolean>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f42219I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ HmDevice f42221K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(HmDevice hmDevice, kotlin.coroutines.c<? super y> cVar) {
            super(2, cVar);
            this.f42221K = hmDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = b.l();
            int i4 = this.f42219I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                a aVar = a.this;
                HmDevice hmDevice = this.f42221K;
                this.f42219I = 1;
                obj = aVar.o(hmDevice, this);
                if (obj == l4) {
                    return l4;
                }
            }
            return obj;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super Boolean> cVar) {
            return ((y) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new y(this.f42221K, cVar);
        }
    }

    @U({"SMAP\nLogicBusiness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness$sendDeviceCommand$2$listener$1\n+ 2 PartyUtils.kt\ncom/harman/jbl/partybox/ui/party/PartyUtils\n*L\n1#1,440:1\n94#2,4:441\n94#2,4:445\n*S KotlinDebug\n*F\n+ 1 LogicBusiness.kt\ncom/harman/jbl/partybox/ui/business/LogicBusiness$sendDeviceCommand$2$listener$1\n*L\n229#1:441,4\n234#1:445,4\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class z implements z2.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2333q<Boolean> f42222a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MessageID f42223b;

        /* renamed from: com.harman.jbl.partybox.ui.business.a$z$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0364a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f42224a;

            static {
                int[] iArr = new int[StatusCode.values().length];
                try {
                    iArr[StatusCode.STATUS_SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StatusCode.STATUS_TIMEOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f42224a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        z(InterfaceC2333q<? super Boolean> interfaceC2333q, MessageID messageID) {
            this.f42222a = interfaceC2333q;
            this.f42223b = messageID;
        }

        private final void c(InterfaceC2333q<? super Boolean> interfaceC2333q, HmDevice hmDevice, StatusCode statusCode, BaseMessage baseMessage) {
            if (this.f42223b != baseMessage.b()) {
                return;
            }
            int i4 = C0364a.f42224a[statusCode.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    com.harman.log.f.d(a.f42137c, "sendDeviceCommand.onStatusChanged() >>> timeout. MAC[" + hmDevice.n() + "]");
                    com.harman.jbl.partybox.ui.party.b bVar = com.harman.jbl.partybox.ui.party.b.f44881a;
                    Boolean bool = Boolean.FALSE;
                    if (interfaceC2333q.c()) {
                        Result.a aVar = Result.f51807F;
                        interfaceC2333q.x(Result.b(bool));
                        return;
                    }
                    return;
                }
                return;
            }
            com.harman.log.f.d(a.f42137c, "sendDeviceCommand.onStatusChanged() >>> success. MAC[" + hmDevice.n() + ", firmwareVer = " + hmDevice.w() + "]");
            com.harman.jbl.partybox.ui.party.b bVar2 = com.harman.jbl.partybox.ui.party.b.f44881a;
            Boolean bool2 = Boolean.TRUE;
            if (interfaceC2333q.c()) {
                Result.a aVar2 = Result.f51807F;
                interfaceC2333q.x(Result.b(bool2));
            }
        }

        @Override // z2.d
        public void a(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f42222a, device, code, msg);
        }

        @Override // z2.d
        public void b(@l3.d HmDevice device, @l3.d StatusCode code, @l3.d BaseMessage msg) {
            F.p(device, "device");
            F.p(code, "code");
            F.p(msg, "msg");
            c(this.f42222a, device, code, msg);
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.harman.sdk.device.HmDevice r9, kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partybox.ui.business.a.C1968b
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partybox.ui.business.a$b r0 = (com.harman.jbl.partybox.ui.business.a.C1968b) r0
            int r1 = r0.f42159L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42159L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.business.a$b r0 = new com.harman.jbl.partybox.ui.business.a$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f42157J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42159L
            r3 = 0
            java.lang.String r4 = "LogicBusiness"
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f42156I
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            java.lang.Object r0 = r0.f42155H
            com.harman.jbl.partybox.ui.business.a r0 = (com.harman.jbl.partybox.ui.business.a) r0
            kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L34
            goto L77
        L34:
            r10 = move-exception
            goto L88
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.W.n(r10)
            com.harman.jbl.partybox.ui.party.b r10 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r10 = r10.t(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "connectAndPowerOnWithTimeout() >>> mainDev "
            r2.append(r6)
            r2.append(r10)
            java.lang.String r10 = "\n"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.harman.log.f.d(r4, r10)
            kotlin.Result$a r10 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L86
            long r6 = com.harman.jbl.partybox.ui.business.a.f42136b     // Catch: java.lang.Throwable -> L86
            com.harman.jbl.partybox.ui.business.a$c r10 = new com.harman.jbl.partybox.ui.business.a$c     // Catch: java.lang.Throwable -> L86
            r10.<init>(r9, r3)     // Catch: java.lang.Throwable -> L86
            r0.f42155H = r8     // Catch: java.lang.Throwable -> L86
            r0.f42156I = r9     // Catch: java.lang.Throwable -> L86
            r0.f42159L = r5     // Catch: java.lang.Throwable -> L86
            java.lang.Object r10 = kotlinx.coroutines.w1.c(r6, r10, r0)     // Catch: java.lang.Throwable -> L86
            if (r10 != r1) goto L76
            return r1
        L76:
            r0 = r8
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L34
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.a.a(r10)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L92
        L86:
            r10 = move-exception
            r0 = r8
        L88:
            kotlin.Result$a r1 = kotlin.Result.f51807F
            java.lang.Object r10 = kotlin.W.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
        L92:
            boolean r1 = kotlin.Result.j(r10)
            java.lang.String r2 = "connectAndRequestInfoWithTimeout() >>> connectAndRequestInfo["
            if (r1 == 0) goto Lc8
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r5)
            boolean r6 = kotlin.Result.i(r10)
            if (r6 == 0) goto La5
            goto La6
        La5:
            r3 = r10
        La6:
            boolean r10 = kotlin.jvm.internal.F.g(r1, r3)
            if (r10 == 0) goto Lc8
            java.lang.String r9 = r9.n()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r9)
            java.lang.String r9 = "] success"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.harman.log.f.d(r4, r9)
            goto Le7
        Lc8:
            java.lang.String r10 = r9.n()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "] fail for some reason"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.harman.log.f.a(r4, r10)
            r0.k(r9)
            r5 = 0
        Le7:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.f(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.harman.sdk.device.HmDevice r9, kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partybox.ui.business.a.u
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partybox.ui.business.a$u r0 = (com.harman.jbl.partybox.ui.business.a.u) r0
            int r1 = r0.f42211L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42211L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.business.a$u r0 = new com.harman.jbl.partybox.ui.business.a$u
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f42209J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42211L
            r3 = 0
            r4 = 2
            java.lang.String r5 = "LogicBusiness"
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 == r6) goto L37
            if (r2 != r4) goto L2f
            kotlin.W.n(r10)
            goto L9b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.Object r9 = r0.f42208I
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            java.lang.Object r2 = r0.f42207H
            com.harman.jbl.partybox.ui.business.a r2 = (com.harman.jbl.partybox.ui.business.a) r2
            kotlin.W.n(r10)
            goto L74
        L43:
            kotlin.W.n(r10)
            com.harman.jbl.partybox.ui.party.b r10 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r10 = r10.t(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "scanAndConnect() >>>  "
            r2.append(r7)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.harman.log.f.a(r5, r10)
            boolean r10 = r9.R()
            if (r10 != 0) goto L86
            r0.f42207H = r8
            r0.f42208I = r9
            r0.f42211L = r6
            java.lang.Object r10 = r8.p(r9, r0)
            if (r10 != r1) goto L73
            return r1
        L73:
            r2 = r8
        L74:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L87
            java.lang.String r9 = "scanAndConnect() >>>  scanDeviceWithTimeout"
            com.harman.log.f.a(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r9
        L86:
            r2 = r8
        L87:
            boolean r10 = r9.R()
            if (r10 != 0) goto Lad
            r10 = 0
            r0.f42207H = r10
            r0.f42208I = r10
            r0.f42211L = r4
            java.lang.Object r10 = r2.j(r9, r0)
            if (r10 != r1) goto L9b
            return r1
        L9b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto Lad
            java.lang.String r9 = "scanAndConnect() >>>  connectDeviceWithTimeout"
            com.harman.log.f.a(r5, r9)
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r9
        Lad:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.n(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(HmDevice hmDevice, MessageID messageID, X2.p<? super HmDevice, ? super z2.d, H0> pVar, kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        com.harman.log.f.a(f42137c, "sendDeviceCommand() >>> device = " + hmDevice.n());
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        z zVar = new z(rVar, messageID);
        com.harman.log.f.d(f42137c, "sendDeviceCommand() >>> send device command to device " + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
        pVar.c0(hmDevice, zVar);
        Object z3 = rVar.z();
        l4 = b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|(1:17)|18|(3:20|21|22))|24|21|22))|34|6|7|(0)(0)|12|13|(0)|24|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        r14 = kotlin.Result.f51807F;
        r13 = kotlin.Result.b(kotlin.W.a(r13));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.harman.sdk.device.HmDevice r12, com.harman.sdk.utils.MessageID r13, X2.p<? super com.harman.sdk.device.HmDevice, ? super z2.d, kotlin.H0> r14, kotlin.coroutines.c<? super java.lang.Boolean> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.harman.jbl.partybox.ui.business.a.A
            if (r0 == 0) goto L13
            r0 = r15
            com.harman.jbl.partybox.ui.business.a$A r0 = (com.harman.jbl.partybox.ui.business.a.A) r0
            int r1 = r0.f42145K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42145K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.business.a$A r0 = new com.harman.jbl.partybox.ui.business.a$A
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f42143I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42145K
            java.lang.String r3 = "LogicBusiness"
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r12 = r0.f42142H
            com.harman.sdk.device.HmDevice r12 = (com.harman.sdk.device.HmDevice) r12
            kotlin.W.n(r15)     // Catch: java.lang.Throwable -> L2f
            goto L75
        L2f:
            r13 = move-exception
            goto L84
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.W.n(r15)
            com.harman.jbl.partybox.ui.party.b r15 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r15 = r15.t(r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sendDeviceCommandWithTimeout() >>> mainDev "
            r2.append(r5)
            r2.append(r15)
            java.lang.String r15 = "\n"
            r2.append(r15)
            java.lang.String r15 = r2.toString()
            com.harman.log.f.d(r3, r15)
            kotlin.Result$a r15 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2f
            com.harman.jbl.partybox.ui.business.a$B r15 = new com.harman.jbl.partybox.ui.business.a$B     // Catch: java.lang.Throwable -> L2f
            r10 = 0
            r5 = r15
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r5.<init>(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2f
            r0.f42142H = r12     // Catch: java.lang.Throwable -> L2f
            r0.f42145K = r4     // Catch: java.lang.Throwable -> L2f
            r13 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r15 = kotlinx.coroutines.w1.c(r13, r15, r0)     // Catch: java.lang.Throwable -> L2f
            if (r15 != r1) goto L75
            return r1
        L75:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> L2f
            boolean r13 = r15.booleanValue()     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.a.a(r13)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r13 = kotlin.Result.b(r13)     // Catch: java.lang.Throwable -> L2f
            goto L8e
        L84:
            kotlin.Result$a r14 = kotlin.Result.f51807F
            java.lang.Object r13 = kotlin.W.a(r13)
            java.lang.Object r13 = kotlin.Result.b(r13)
        L8e:
            boolean r14 = kotlin.Result.j(r13)
            java.lang.String r15 = "sendDeviceCommandWithTimeout() >>> sendDeviceCommand["
            if (r14 == 0) goto Lc3
            java.lang.Boolean r14 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r0 = kotlin.Result.i(r13)
            if (r0 == 0) goto La1
            r13 = 0
        La1:
            boolean r13 = kotlin.jvm.internal.F.g(r14, r13)
            if (r13 == 0) goto Lc3
            java.lang.String r12 = r12.n()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            r13.append(r12)
            java.lang.String r12 = "] success"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.harman.log.f.d(r3, r12)
            goto Ldf
        Lc3:
            java.lang.String r12 = r12.n()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            r13.append(r12)
            java.lang.String r12 = "] fail for some reason"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.harman.log.f.a(r3, r12)
            r4 = 0
        Ldf:
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.r(com.harman.sdk.device.HmDevice, com.harman.sdk.utils.MessageID, X2.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@l3.d com.harman.sdk.device.HmDevice r10, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.e(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ca A[PHI: r10
  0x00ca: PHI (r10v17 java.lang.Object) = (r10v16 java.lang.Object), (r10v1 java.lang.Object) binds: [B:18:0x00c7, B:11:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@l3.d com.harman.sdk.device.HmDevice r9, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partybox.ui.business.a.d
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partybox.ui.business.a$d r0 = (com.harman.jbl.partybox.ui.business.a.d) r0
            int r1 = r0.f42167L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42167L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.business.a$d r0 = new com.harman.jbl.partybox.ui.business.a$d
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f42165J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42167L
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r6 = "LogicBusiness"
            if (r2 == 0) goto L53
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.W.n(r10)
            goto Lca
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r0.f42164I
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            java.lang.Object r2 = r0.f42163H
            com.harman.jbl.partybox.ui.business.a r2 = (com.harman.jbl.partybox.ui.business.a) r2
            kotlin.W.n(r10)
            goto Lbc
        L47:
            java.lang.Object r9 = r0.f42164I
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            java.lang.Object r2 = r0.f42163H
            com.harman.jbl.partybox.ui.business.a r2 = (com.harman.jbl.partybox.ui.business.a) r2
            kotlin.W.n(r10)
            goto L94
        L53:
            kotlin.W.n(r10)
            com.harman.jbl.partybox.ui.party.b r10 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r10 = r10.t(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "connectAndRequestInfo() >>> mainDev "
            r2.append(r7)
            r2.append(r10)
            java.lang.String r10 = "\n"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.harman.log.f.d(r6, r10)
            com.harman.sdk.b r10 = com.harman.sdk.b.f47608a
            B2.c r10 = r10.k()
            if (r10 == 0) goto L80
            r10.b(r9)
        L80:
            boolean r10 = r9.R()
            if (r10 != 0) goto La7
            r0.f42163H = r8
            r0.f42164I = r9
            r0.f42167L = r5
            java.lang.Object r10 = r8.j(r9, r0)
            if (r10 != r1) goto L93
            return r1
        L93:
            r2 = r8
        L94:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto La8
            java.lang.String r9 = "connectAndRequestInfo() >>>  connectDeviceWithTimeout"
            com.harman.log.f.a(r6, r9)
            r9 = 0
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)
            return r9
        La7:
            r2 = r8
        La8:
            java.lang.String r10 = "connectAndRequestInfo() >>>  connectDevice success then requestDeviceInfo"
            com.harman.log.f.a(r6, r10)
            r0.f42163H = r2
            r0.f42164I = r9
            r0.f42167L = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = kotlinx.coroutines.C2269d0.b(r4, r0)
            if (r10 != r1) goto Lbc
            return r1
        Lbc:
            r10 = 0
            r0.f42163H = r10
            r0.f42164I = r10
            r0.f42167L = r3
            java.lang.Object r10 = r2.m(r9, r0)
            if (r10 != r1) goto Lca
            return r1
        Lca:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.g(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(@l3.d com.harman.sdk.device.HmDevice r9, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.harman.jbl.partybox.ui.business.a.e
            if (r0 == 0) goto L13
            r0 = r10
            com.harman.jbl.partybox.ui.business.a$e r0 = (com.harman.jbl.partybox.ui.business.a.e) r0
            int r1 = r0.f42172L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42172L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.business.a$e r0 = new com.harman.jbl.partybox.ui.business.a$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f42170J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42172L
            r3 = 0
            java.lang.String r4 = "LogicBusiness"
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f42169I
            com.harman.sdk.device.HmDevice r9 = (com.harman.sdk.device.HmDevice) r9
            java.lang.Object r0 = r0.f42168H
            com.harman.jbl.partybox.ui.business.a r0 = (com.harman.jbl.partybox.ui.business.a) r0
            kotlin.W.n(r10)     // Catch: java.lang.Throwable -> L34
            goto L77
        L34:
            r10 = move-exception
            goto L88
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.W.n(r10)
            com.harman.jbl.partybox.ui.party.b r10 = com.harman.jbl.partybox.ui.party.b.f44881a
            java.lang.String r10 = r10.t(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "connectAndRequestInfoWithTimeout() >>> mainDev "
            r2.append(r6)
            r2.append(r10)
            java.lang.String r10 = "\n"
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.harman.log.f.d(r4, r10)
            kotlin.Result$a r10 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L86
            long r6 = com.harman.jbl.partybox.ui.business.a.f42136b     // Catch: java.lang.Throwable -> L86
            com.harman.jbl.partybox.ui.business.a$f r10 = new com.harman.jbl.partybox.ui.business.a$f     // Catch: java.lang.Throwable -> L86
            r10.<init>(r9, r3)     // Catch: java.lang.Throwable -> L86
            r0.f42168H = r8     // Catch: java.lang.Throwable -> L86
            r0.f42169I = r9     // Catch: java.lang.Throwable -> L86
            r0.f42172L = r5     // Catch: java.lang.Throwable -> L86
            java.lang.Object r10 = kotlinx.coroutines.w1.c(r6, r10, r0)     // Catch: java.lang.Throwable -> L86
            if (r10 != r1) goto L76
            return r1
        L76:
            r0 = r8
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L34
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.a.a(r10)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r10 = kotlin.Result.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L92
        L86:
            r10 = move-exception
            r0 = r8
        L88:
            kotlin.Result$a r1 = kotlin.Result.f51807F
            java.lang.Object r10 = kotlin.W.a(r10)
            java.lang.Object r10 = kotlin.Result.b(r10)
        L92:
            boolean r1 = kotlin.Result.j(r10)
            java.lang.String r2 = "connectAndRequestInfoWithTimeout() >>> connectAndRequestInfo["
            if (r1 == 0) goto Lc8
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r5)
            boolean r6 = kotlin.Result.i(r10)
            if (r6 == 0) goto La5
            goto La6
        La5:
            r3 = r10
        La6:
            boolean r10 = kotlin.jvm.internal.F.g(r1, r3)
            if (r10 == 0) goto Lc8
            java.lang.String r9 = r9.n()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r9)
            java.lang.String r9 = "] success"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.harman.log.f.d(r4, r9)
            goto Le7
        Lc8:
            java.lang.String r10 = r9.n()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = "] fail for some reason"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.harman.log.f.a(r4, r10)
            r0.k(r9)
            r5 = 0
        Le7:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.h(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public final Object i(@l3.d HmDevice hmDevice, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(hmDevice);
        if (c4 != null) {
            e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
            rVar.T();
            h hVar = new h(hmDevice, c4, rVar);
            rVar.u(new g(c4, hVar));
            com.harman.log.f.d(f42137c, "connectDevice() >>> try to connect device.MAC[" + hmDevice.n() + "] ble.addr[" + hmDevice.g() + "]");
            c4.c(hVar);
            c4.j(hmDevice);
            Object z3 = rVar.z();
            l4 = b.l();
            if (z3 == l4) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return z3;
        }
        com.harman.log.f.g(f42137c, "connectDevice() >>> fail to get controller for \n" + com.harman.jbl.partybox.ui.party.b.f44881a.t(hmDevice));
        return kotlin.coroutines.jvm.internal.a.a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@l3.d com.harman.sdk.device.HmDevice r8, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.business.a.i
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.business.a$i r0 = (com.harman.jbl.partybox.ui.business.a.i) r0
            int r1 = r0.f42185L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42185L = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.business.a$i r0 = new com.harman.jbl.partybox.ui.business.a$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f42183J
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42185L
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r8 = r0.f42182I
            com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
            java.lang.Object r0 = r0.f42181H
            com.harman.jbl.partybox.ui.business.a r0 = (com.harman.jbl.partybox.ui.business.a) r0
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L32
            goto L56
        L32:
            r9 = move-exception
            goto L67
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.W.n(r9)
            kotlin.Result$a r9 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L65
            com.harman.jbl.partybox.ui.business.a$j r9 = new com.harman.jbl.partybox.ui.business.a$j     // Catch: java.lang.Throwable -> L65
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L65
            r0.f42181H = r7     // Catch: java.lang.Throwable -> L65
            r0.f42182I = r8     // Catch: java.lang.Throwable -> L65
            r0.f42185L = r4     // Catch: java.lang.Throwable -> L65
            r5 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r9 = kotlinx.coroutines.w1.c(r5, r9, r0)     // Catch: java.lang.Throwable -> L65
            if (r9 != r1) goto L55
            return r1
        L55:
            r0 = r7
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L32
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L32
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L32
            goto L71
        L65:
            r9 = move-exception
            r0 = r7
        L67:
            kotlin.Result$a r1 = kotlin.Result.f51807F
            java.lang.Object r9 = kotlin.W.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
        L71:
            boolean r1 = kotlin.Result.j(r9)
            java.lang.String r2 = "connectDeviceWithTimeout() >>> connect to bt device["
            java.lang.String r5 = "LogicBusiness"
            if (r1 == 0) goto La9
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r6 = kotlin.Result.i(r9)
            if (r6 == 0) goto L86
            goto L87
        L86:
            r3 = r9
        L87:
            boolean r9 = kotlin.jvm.internal.F.g(r1, r3)
            if (r9 == 0) goto La9
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            r9.append(r8)
            java.lang.String r8 = "] success"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.d(r5, r8)
            goto Lc8
        La9:
            java.lang.String r9 = r8.n()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = "] fail for some reason"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.harman.log.f.a(r5, r9)
            r0.k(r8)
            r4 = 0
        Lc8:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.j(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    public final void k(@l3.d HmDevice targetDevice) {
        F.p(targetDevice, "targetDevice");
        if (!targetDevice.R()) {
            com.harman.log.f.a(f42137c, "disconnectDevice() >>> already in disconnect state");
            return;
        }
        com.harman.sdk.impl.connect.i c4 = com.harman.sdk.b.f47608a.c(targetDevice);
        if (c4 == null) {
            com.harman.log.f.g(f42137c, "disconnectDevice() >>> fail to get controller");
            return;
        }
        c4.k(targetDevice);
        com.harman.log.f.d(f42137c, "disconnectDevice() >>> send disconnect cmd to device:\n" + com.harman.jbl.partybox.ui.party.b.f44881a.t(targetDevice));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:13:0x00d4->B:22:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@l3.d com.harman.sdk.device.HmDevice r10, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.l(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(@l3.d com.harman.sdk.device.HmDevice r12, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.m(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }

    @l3.e
    public final Object o(@l3.d HmDevice hmDevice, @l3.d kotlin.coroutines.c<? super Boolean> cVar) {
        kotlin.coroutines.c e4;
        Object l4;
        List Jy;
        e4 = IntrinsicsKt__IntrinsicsJvmKt.e(cVar);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(e4, 1);
        rVar.T();
        w wVar = new w(hmDevice, rVar);
        rVar.u(new v(wVar));
        com.harman.log.f.d(f42137c, "scanDevice() >>> try to scan device.MAC[" + hmDevice.n() + "] ble.addr[" + hmDevice.g() + "]");
        B2.c k4 = com.harman.sdk.b.f47608a.k();
        if (k4 != null) {
            Jy = C2101p.Jy(new DeviceProtocol[]{DeviceProtocol.PROTOCOL_BLE});
            k4.g(Jy, wVar, null);
        }
        Object z3 = rVar.z();
        l4 = b.l();
        if (z3 == l4) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return z3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(4:15|(1:17)|18|(3:20|21|22))|24|21|22))|34|6|7|(0)(0)|12|13|(0)|24|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r0 = kotlin.Result.f51807F;
        r9 = kotlin.Result.b(kotlin.W.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(@l3.d com.harman.sdk.device.HmDevice r8, @l3.d kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.harman.jbl.partybox.ui.business.a.x
            if (r0 == 0) goto L13
            r0 = r9
            com.harman.jbl.partybox.ui.business.a$x r0 = (com.harman.jbl.partybox.ui.business.a.x) r0
            int r1 = r0.f42218K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42218K = r1
            goto L18
        L13:
            com.harman.jbl.partybox.ui.business.a$x r0 = new com.harman.jbl.partybox.ui.business.a$x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f42216I
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f42218K
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.f42215H
            com.harman.sdk.device.HmDevice r8 = (com.harman.sdk.device.HmDevice) r8
            kotlin.W.n(r9)     // Catch: java.lang.Throwable -> L2e
            goto L4f
        L2e:
            r9 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.W.n(r9)
            kotlin.Result$a r9 = kotlin.Result.f51807F     // Catch: java.lang.Throwable -> L2e
            com.harman.jbl.partybox.ui.business.a$y r9 = new com.harman.jbl.partybox.ui.business.a$y     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8, r3)     // Catch: java.lang.Throwable -> L2e
            r0.f42215H = r8     // Catch: java.lang.Throwable -> L2e
            r0.f42218K = r4     // Catch: java.lang.Throwable -> L2e
            r5 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r9 = kotlinx.coroutines.w1.c(r5, r9, r0)     // Catch: java.lang.Throwable -> L2e
            if (r9 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2e
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2e
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.a.a(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L68
        L5e:
            kotlin.Result$a r0 = kotlin.Result.f51807F
            java.lang.Object r9 = kotlin.W.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
        L68:
            boolean r0 = kotlin.Result.j(r9)
            java.lang.String r1 = "scanDeviceWithTimeout() >>> scan to bt device["
            java.lang.String r2 = "LogicBusiness"
            if (r0 == 0) goto La0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r4)
            boolean r5 = kotlin.Result.i(r9)
            if (r5 == 0) goto L7d
            goto L7e
        L7d:
            r3 = r9
        L7e:
            boolean r9 = kotlin.jvm.internal.F.g(r0, r3)
            if (r9 == 0) goto La0
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] success"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.d(r2, r8)
            goto Lbc
        La0:
            java.lang.String r8 = r8.n()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = "] fail for some reason"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.harman.log.f.a(r2, r8)
            r4 = 0
        Lbc:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.business.a.p(com.harman.sdk.device.HmDevice, kotlin.coroutines.c):java.lang.Object");
    }
}
