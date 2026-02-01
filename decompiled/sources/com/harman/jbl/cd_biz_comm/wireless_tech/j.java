package com.harman.jbl.cd_biz_comm.wireless_tech;

import X2.p;
import android.bluetooth.le.ScanResult;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.ModuleDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.V;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C2284k;
import kotlinx.coroutines.flow.InterfaceC2282i;
import kotlinx.coroutines.flow.InterfaceC2283j;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.z;

@U({"SMAP\nDeviceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceStore.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DeviceStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,203:1\n1#2:204\n215#3,2:205\n215#3,2:207\n*S KotlinDebug\n*F\n+ 1 DeviceStore.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DeviceStore\n*L\n93#1:205,2\n105#1:207,2\n*E\n"})
/* loaded from: classes2.dex */
public final class j implements kotlinx.coroutines.U {

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    public static final j f38190F;

    /* renamed from: G, reason: collision with root package name */
    private static final long f38191G = 30000;

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private static final ConcurrentHashMap<String, PartyLightDevice> f38192H;

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private static final ConcurrentHashMap<String, SpeakerDevice> f38193I;

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private static final Map<f, f> f38194J;

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    private static final Map<String, ModuleDevice> f38195K;

    /* renamed from: L, reason: collision with root package name */
    @l3.d
    private static final O1.b f38196L;

    /* renamed from: M, reason: collision with root package name */
    @l3.d
    private static final l f38197M;

    /* renamed from: N, reason: collision with root package name */
    @l3.d
    private static final ConcurrentHashMap<String, Long> f38198N;

    /* renamed from: O, reason: collision with root package name */
    @l3.d
    private static final s<ScanResult> f38199O;

    /* renamed from: P, reason: collision with root package name */
    private static boolean f38200P;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.U f38201E = V.a(C2322k0.c());

    @U({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n+ 2 DeviceStore.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DeviceStore\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n133#2,5:149\n138#2,23:155\n161#2:179\n162#2,2:181\n164#2:184\n215#3:154\n216#3:178\n1855#4:180\n1856#4:183\n*S KotlinDebug\n*F\n+ 1 DeviceStore.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DeviceStore\n*L\n137#1:154\n137#1:178\n161#1:180\n161#1:183\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class a extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (j.f38190F.p()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : j.f38198N.entrySet()) {
                    if (System.currentTimeMillis() - ((Number) entry.getValue()).longValue() > 30000) {
                        PartyLightDevice partyLightDevice = (PartyLightDevice) j.f38192H.get(entry.getKey());
                        SpeakerDevice speakerDevice = (SpeakerDevice) j.f38193I.get(entry.getKey());
                        if (partyLightDevice != null && !com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.u(partyLightDevice)) {
                            j.f38192H.remove(entry.getKey());
                            arrayList.add(entry.getKey());
                            com.harman.jbl.cd_biz_comm.utils.b.a(new b(partyLightDevice, j.f38190F.q()));
                        }
                        if (speakerDevice != null) {
                            com.harman.jbl.cd_biz_comm.wireless_tech.c.f38154G.u(speakerDevice);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j.f38198N.remove((String) it.next());
                }
            }
        }
    }

    @U({"SMAP\nDeviceStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceStore.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DeviceStore$launchDeviceLoseCheckJob$1$1$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,203:1\n215#2,2:204\n*S KotlinDebug\n*F\n+ 1 DeviceStore.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/DeviceStore$launchDeviceLoseCheckJob$1$1$1\n*L\n149#1:204,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class b implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ PartyLightDevice f38202E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ List<PartyLightDevice> f38203F;

        b(PartyLightDevice partyLightDevice, List<PartyLightDevice> list) {
            this.f38202E = partyLightDevice;
            this.f38203F = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Map map = j.f38194J;
            PartyLightDevice partyLightDevice = this.f38202E;
            List<PartyLightDevice> list = this.f38203F;
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                ((f) ((Map.Entry) it.next()).getValue()).g().c0(partyLightDevice, list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.wireless_tech.DeviceStore$launchDeviceScanHandle$1", f = "DeviceStore.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class c extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f38204I;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class a extends Lambda implements p<ScanResult, ScanResult, Boolean> {

            /* renamed from: F, reason: collision with root package name */
            public static final a f38205F = new a();

            a() {
                super(2);
            }

            @Override // X2.p
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean c0(@l3.d ScanResult old, @l3.d ScanResult scanResult) {
                boolean z3;
                F.p(old, "old");
                F.p(scanResult, "new");
                if (old == scanResult) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public static final class b<T> implements InterfaceC2283j {

            /* renamed from: E, reason: collision with root package name */
            public static final b<T> f38206E = new b<>();

            b() {
            }

            @Override // kotlinx.coroutines.flow.InterfaceC2283j
            @l3.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object f(@l3.d ScanResult scanResult, @l3.d kotlin.coroutines.c<? super H0> cVar) {
                ModuleDevice a4 = j.f38196L.a(scanResult);
                if (a4 == null) {
                    return H0.f51801a;
                }
                ModuleDevice b4 = j.f38197M.b(a4);
                if (b4 == null) {
                    return H0.f51801a;
                }
                j jVar = j.f38190F;
                jVar.B(b4);
                j.f38198N.put(b4.g(), kotlin.coroutines.jvm.internal.a.g(System.currentTimeMillis()));
                if (b4 instanceof PartyLightDevice) {
                    jVar.s((PartyLightDevice) b4);
                } else if (b4 instanceof SpeakerDevice) {
                    jVar.v((SpeakerDevice) b4);
                }
                return H0.f51801a;
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
            int i4 = this.f38204I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                InterfaceC2282i h02 = C2284k.h0(j.f38199O, a.f38205F);
                InterfaceC2283j interfaceC2283j = b.f38206E;
                this.f38204I = 1;
                if (h02.a(interfaceC2283j, this) == l4) {
                    return l4;
                }
            }
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((c) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new c(cVar);
        }
    }

    static {
        j jVar = new j();
        f38190F = jVar;
        f38192H = new ConcurrentHashMap<>();
        f38193I = new ConcurrentHashMap<>();
        f38194J = new LinkedHashMap();
        f38195K = new LinkedHashMap();
        f38196L = new O1.b();
        f38197M = new l();
        f38198N = new ConcurrentHashMap<>();
        f38199O = z.a(0, 1000, BufferOverflow.DROP_LATEST);
        f38200P = true;
        jVar.x();
        jVar.w();
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(ModuleDevice moduleDevice) {
        com.harman.jbl.cd_biz_comm.logger.d.a("Device", "updateDevicePool>>> newDev = " + moduleDevice);
        Map<String, ModuleDevice> map = f38195K;
        if (map.containsKey(moduleDevice.g())) {
            ModuleDevice moduleDevice2 = map.get(moduleDevice.g());
            F.m(moduleDevice2);
            moduleDevice2.m(moduleDevice.f());
            return;
        }
        map.put(moduleDevice.g(), moduleDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(PartyLightDevice partyLightDevice) {
        final PartyLightDevice partyLightDevice2;
        ConcurrentHashMap<String, PartyLightDevice> concurrentHashMap = f38192H;
        if (concurrentHashMap.containsKey(partyLightDevice.g())) {
            PartyLightDevice partyLightDevice3 = concurrentHashMap.get(partyLightDevice.g());
            F.m(partyLightDevice3);
            final PartyLightDevice partyLightDevice4 = partyLightDevice3;
            if (!partyLightDevice4.i(partyLightDevice)) {
                partyLightDevice4.a(partyLightDevice);
                com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.cd_biz_comm.wireless_tech.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.t(PartyLightDevice.this);
                    }
                });
                return;
            }
            return;
        }
        ModuleDevice moduleDevice = f38195K.get(partyLightDevice.g());
        if (moduleDevice instanceof PartyLightDevice) {
            partyLightDevice2 = (PartyLightDevice) moduleDevice;
        } else {
            partyLightDevice2 = null;
        }
        if (partyLightDevice2 != null) {
            concurrentHashMap.put(partyLightDevice.g(), partyLightDevice2);
            final List<PartyLightDevice> q4 = f38190F.q();
            com.harman.jbl.cd_biz_comm.utils.b.a(new Runnable() { // from class: com.harman.jbl.cd_biz_comm.wireless_tech.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.u(PartyLightDevice.this, q4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(PartyLightDevice savedLight) {
        F.p(savedLight, "$savedLight");
        Iterator<Map.Entry<f, f>> it = f38194J.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().h().c0(savedLight, f38190F.q());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(PartyLightDevice it, List newLights) {
        F.p(it, "$it");
        F.p(newLights, "$newLights");
        Iterator<Map.Entry<f, f>> it2 = f38194J.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().f().c0(it, newLights);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(SpeakerDevice speakerDevice) {
        SpeakerDevice speakerDevice2;
        ConcurrentHashMap<String, SpeakerDevice> concurrentHashMap = f38193I;
        if (concurrentHashMap.containsKey(speakerDevice.g())) {
            SpeakerDevice speakerDevice3 = concurrentHashMap.get(speakerDevice.g());
            F.m(speakerDevice3);
            SpeakerDevice speakerDevice4 = speakerDevice3;
            if (!speakerDevice4.i(speakerDevice)) {
                speakerDevice4.a(speakerDevice);
                return;
            }
            return;
        }
        ModuleDevice moduleDevice = f38195K.get(speakerDevice.g());
        if (moduleDevice instanceof SpeakerDevice) {
            speakerDevice2 = (SpeakerDevice) moduleDevice;
        } else {
            speakerDevice2 = null;
        }
        if (speakerDevice2 != null) {
            concurrentHashMap.put(speakerDevice.g(), speakerDevice2);
        }
    }

    private final void w() {
        kotlin.concurrent.c.k(null, false).schedule(new a(), 0L, 30000L);
    }

    private final void x() {
        C2323l.f(this, null, null, new c(null), 3, null);
    }

    public final void A(@l3.d f plObserver) {
        F.p(plObserver, "plObserver");
        f38194J.remove(plObserver);
    }

    @Override // kotlinx.coroutines.U
    @l3.d
    public kotlin.coroutines.f getCoroutineContext() {
        return this.f38201E.getCoroutineContext();
    }

    public final void n(@l3.d k filter) {
        F.p(filter, "filter");
        f38197M.a(filter);
    }

    public final void o(@l3.d ScanResult scanRet) {
        F.p(scanRet, "scanRet");
        f38199O.j(scanRet);
    }

    public final boolean p() {
        return f38200P;
    }

    @l3.d
    public final List<PartyLightDevice> q() {
        Object b4;
        List<PartyLightDevice> H3;
        List V5;
        try {
            Result.a aVar = Result.f51807F;
            Collection<PartyLightDevice> values = f38192H.values();
            F.o(values, "<get-values>(...)");
            V5 = D.V5(values);
            b4 = Result.b(V5);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(W.a(th));
        }
        if (Result.i(b4)) {
            b4 = null;
        }
        List<PartyLightDevice> list = (List) b4;
        if (list == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return list;
    }

    @l3.d
    public final List<SpeakerDevice> r() {
        Object b4;
        List<SpeakerDevice> H3;
        List V5;
        try {
            Result.a aVar = Result.f51807F;
            Collection<SpeakerDevice> values = f38193I.values();
            F.o(values, "<get-values>(...)");
            V5 = D.V5(values);
            b4 = Result.b(V5);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            b4 = Result.b(W.a(th));
        }
        if (Result.i(b4)) {
            b4 = null;
        }
        List<SpeakerDevice> list = (List) b4;
        if (list == null) {
            H3 = CollectionsKt__CollectionsKt.H();
            return H3;
        }
        return list;
    }

    public final void y(@l3.d f plObserver) {
        F.p(plObserver, "plObserver");
        f38194J.put(plObserver, plObserver);
    }

    public final void z(boolean z3) {
        f38200P = z3;
    }
}
