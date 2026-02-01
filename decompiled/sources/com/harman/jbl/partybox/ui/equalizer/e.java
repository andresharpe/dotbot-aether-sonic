package com.harman.jbl.partybox.ui.equalizer;

import X2.p;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.k0;
import com.google.gson.reflect.TypeToken;
import com.harman.jbl.partybox.utils.i;
import com.harman.log.f;
import com.harman.sdk.command.ReqAdvancedEQCommand;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.h;
import com.harman.sdk.utils.j;
import com.harman.sdk.utils.l;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;
import p2.C2390a;
import z2.m;

@U({"SMAP\nPresetEQViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresetEQViewModel.kt\ncom/harman/jbl/partybox/ui/equalizer/PresetEQViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1855#2:268\n1856#2:270\n1#3:269\n*S KotlinDebug\n*F\n+ 1 PresetEQViewModel.kt\ncom/harman/jbl/partybox/ui/equalizer/PresetEQViewModel\n*L\n70#1:268\n70#1:270\n*E\n"})
/* loaded from: classes2.dex */
public final class e extends com.harman.jbl.partybox.c {

    /* renamed from: U, reason: collision with root package name */
    @l3.d
    public static final a f43640U = new a(null);

    /* renamed from: V, reason: collision with root package name */
    @l3.d
    public static final String f43641V = "PresetEQViewModel";

    /* renamed from: P, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.model.a f43642P;

    /* renamed from: Q, reason: collision with root package name */
    @l3.d
    private final P<ArrayList<com.harman.jbl.partybox.model.a>> f43643Q;

    /* renamed from: R, reason: collision with root package name */
    @l3.d
    private final LiveData<ArrayList<com.harman.jbl.partybox.model.a>> f43644R;

    /* renamed from: S, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partybox.model.a> f43645S;

    /* renamed from: T, reason: collision with root package name */
    @l3.d
    private final P<com.harman.jbl.partybox.model.a> f43646T;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.equalizer.PresetEQViewModel$getEQPresetsListData$1", f = "PresetEQViewModel.kt", i = {0}, l = {179}, m = "invokeSuspend", n = {"presetEQViewModelList"}, s = {"L$2"})
    @U({"SMAP\nPresetEQViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresetEQViewModel.kt\ncom/harman/jbl/partybox/ui/equalizer/PresetEQViewModel$getEQPresetsListData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,267:1\n1855#2:268\n288#2,2:269\n1856#2:272\n1#3:271\n*S KotlinDebug\n*F\n+ 1 PresetEQViewModel.kt\ncom/harman/jbl/partybox/ui/equalizer/PresetEQViewModel$getEQPresetsListData$1\n*L\n202#1:268\n203#1:269,2\n202#1:272\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f43647I;

        /* renamed from: J, reason: collision with root package name */
        Object f43648J;

        /* renamed from: K, reason: collision with root package name */
        int f43649K;

        /* renamed from: L, reason: collision with root package name */
        private /* synthetic */ Object f43650L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ HmDevice f43651M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ e f43652N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f43653O;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.equalizer.PresetEQViewModel$getEQPresetsListData$1$presetEQViewModelList$1$result$1$1", f = "PresetEQViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super List<? extends com.harman.jbl.partybox.model.d>>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f43654I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ e f43655J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ HmDevice f43656K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, HmDevice hmDevice, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f43655J = eVar;
                this.f43656K = hmDevice;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f43654I == 0) {
                    W.n(obj);
                    return this.f43655J.f0(this.f43656K);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super List<com.harman.jbl.partybox.model.d>> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f43655J, this.f43656K, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(HmDevice hmDevice, e eVar, Context context, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f43651M = hmDevice;
            this.f43652N = eVar;
            this.f43653O = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0094  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object D(@l3.d java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.equalizer.e.b.D(java.lang.Object):java.lang.Object");
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((b) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            b bVar = new b(this.f43651M, this.f43652N, this.f43653O, cVar);
            bVar.f43650L = obj;
            return bVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends TypeToken<ArrayList<com.harman.jbl.partybox.model.a>> {
        c() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends TypeToken<ArrayList<com.harman.jbl.partybox.model.a>> {
        d() {
        }
    }

    /* renamed from: com.harman.jbl.partybox.ui.equalizer.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0377e extends TypeToken<ArrayList<com.harman.jbl.partybox.model.d>> {
        C0377e() {
        }
    }

    public e() {
        P<ArrayList<com.harman.jbl.partybox.model.a>> p4 = new P<>();
        this.f43643Q = p4;
        this.f43644R = p4;
        P<com.harman.jbl.partybox.model.a> p5 = new P<>();
        this.f43645S = p5;
        this.f43646T = p5;
    }

    public static /* synthetic */ boolean a0(e eVar, HmDevice hmDevice, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return eVar.Z(hmDevice, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<com.harman.jbl.partybox.model.a> d0(Context context, HmDevice hmDevice) {
        ArrayList<com.harman.jbl.partybox.model.a> arrayList = new ArrayList<>();
        try {
            String d4 = i.d(context, hmDevice);
            if (d4 != null) {
                f.a(f43641V, "PresetEQViewModel getEQPresetsListData getLocalPresetEQCategoryList : localConfigString = " + d4);
                ArrayList arrayList2 = (ArrayList) h.a().fromJson(d4, new c().getType());
                if (arrayList2 != null) {
                    F.m(arrayList2);
                    arrayList.addAll(arrayList2);
                }
            } else {
                f.a(f43641V, "PresetEQViewModel getEQPresetsListData getLocalPresetEQCategoryList : context.assets.open");
                InputStream open = context.getAssets().open(i.b(hmDevice));
                F.o(open, "open(...)");
                ArrayList arrayList3 = (ArrayList) h.a().fromJson(new InputStreamReader(open), new d().getType());
                if (arrayList3 != null) {
                    F.m(arrayList3);
                    arrayList.addAll(arrayList3);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.harman.jbl.partybox.model.d> f0(HmDevice hmDevice) {
        List<com.harman.jbl.partybox.model.d> a4 = i.a(hmDevice);
        List<com.harman.jbl.partybox.model.d> list = a4;
        if (a4 == null) {
            ArrayList arrayList = new ArrayList();
            try {
                ArrayList arrayList2 = (ArrayList) h.a().fromJson(C2390a.b(com.harman.jbl.partybox.f.f40405t + i.b(hmDevice)), new C0377e().getType());
                if (arrayList2 != null) {
                    F.m(arrayList2);
                    arrayList.addAll(arrayList2);
                }
                i.e(hmDevice, arrayList);
                list = arrayList;
            } catch (Exception e4) {
                e4.printStackTrace();
                list = arrayList;
            }
        }
        return list;
    }

    private final void g0(HmDevice hmDevice, String str) {
        String str2;
        com.harman.jbl.partybox.model.a aVar = this.f43642P;
        if (aVar != null) {
            str2 = aVar.f();
        } else {
            str2 = null;
        }
        if (!F.g(str, str2) && hmDevice != null) {
            Bundle bundle = new Bundle();
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(hmDevice.q()));
            bundle.putString(L1.a.f1671y, j.b(hmDevice.n()));
            bundle.putString(L1.a.f1675z, l.a(hmDevice.n()));
            if (str == null) {
                str = L1.a.f1519Q2;
            }
            bundle.putString(L1.a.f1608k1, str);
            f.a(f43641V, "PresetEQViewModel BLE_LOG EVENT_SETTING_EQ called");
            K1.a.a(L1.a.f1611l, bundle);
        }
    }

    public final void Y(@l3.d HmDevice hmDevice) {
        m l4;
        F.p(hmDevice, "hmDevice");
        if (com.harman.sdk.utils.d.G(hmDevice) && (l4 = com.harman.sdk.b.f47608a.l(hmDevice)) != null) {
            l4.q0(hmDevice, new ReqAdvancedEQCommand(), null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (kotlin.jvm.internal.F.g(r14, java.lang.Boolean.TRUE) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (kotlin.jvm.internal.F.g(r13, java.lang.Boolean.TRUE) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0168, code lost:
    
        if (r4.isEmpty() == false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z(@l3.d com.harman.sdk.device.HmDevice r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.equalizer.e.Z(com.harman.sdk.device.HmDevice, boolean):boolean");
    }

    public final void b0(@l3.d Context context, @l3.d HmDevice device) {
        F.p(context, "context");
        F.p(device, "device");
        C2323l.f(k0.a(this), C2322k0.c(), null, new b(device, this, context, null), 2, null);
    }

    @l3.d
    public final P<com.harman.jbl.partybox.model.a> c0() {
        return this.f43646T;
    }

    @l3.d
    public final LiveData<ArrayList<com.harman.jbl.partybox.model.a>> e0() {
        return this.f43644R;
    }
}
