package com.harman.jbl.partybox.ui.equalizer;

import X2.l;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1882i0;
import com.harman.jbl.partybox.databinding.J1;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.dashboard.StageDashboardFragment;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.eq.Equalizer2View;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.AdvancedCustomEQPayload;
import com.harman.sdk.message.AdvancedEQSettings;
import com.harman.sdk.message.EQCategory;
import com.harman.sdk.message.SimpleEQSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\n\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001MB\u0007¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0006J!\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J!\u0010\u001f\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\u0006J!\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0006R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010C\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010\u0014R\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/harman/jbl/partybox/ui/equalizer/EQEditorFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lcom/harman/jbl/partybox/ui/widget/eq/Equalizer2View$a;", "Landroid/view/View$OnClickListener;", "Lkotlin/H0;", "w0", "()V", "initView", "t0", "Lcom/harman/sdk/message/AdvancedEQSettings;", "item", "u0", "(Lcom/harman/sdk/message/AdvancedEQSettings;)V", "v0", "onBtnBackClick", "x0", "o0", "", "progress", "s0", "([I)V", "y0", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onSeekBlock", "", "fromUser", "onProgressChanged", "([IZ)V", "onStartTrackingTouch", "", "currentIndex", "onStopTrackingTouch", "(I[I)V", "v", "onClick", "(Landroid/view/View;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/i0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "p0", "()Lcom/harman/jbl/partybox/databinding/i0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "r0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/equalizer/a;", "S0", "q0", "()Lcom/harman/jbl/partybox/ui/equalizer/a;", "eqViewModel", "T0", "Lcom/harman/sdk/message/AdvancedEQSettings;", "customEQItem", "U0", "[I", "getMBands", "()[I", "setMBands", "mBands", "", "V0", "B", "eqid", "W0", "Z", "isFirstEdit", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nEQEditorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EQEditorFragment.kt\ncom/harman/jbl/partybox/ui/equalizer/EQEditorFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,386:1\n66#2,4:387\n56#3,10:391\n262#4,2:401\n1855#5,2:403\n1864#5,3:405\n1855#5:417\n1855#5,2:418\n1856#5:420\n13404#6,3:408\n13404#6,3:411\n13404#6,3:414\n13404#6,3:421\n*S KotlinDebug\n*F\n+ 1 EQEditorFragment.kt\ncom/harman/jbl/partybox/ui/equalizer/EQEditorFragment\n*L\n37#1:387,4\n38#1:391,10\n84#1:401,2\n94#1:403,2\n153#1:405,3\n316#1:417\n318#1:418,2\n316#1:420\n162#1:408,3\n258#1:411,3\n296#1:414,3\n372#1:421,3\n*E\n"})
/* loaded from: classes2.dex */
public final class EQEditorFragment extends BackDispatcherFragment implements Equalizer2View.a, View.OnClickListener {

    @l3.d
    public static final String TAG = "EQEditorFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43573Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f43574R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f43575S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.e
    private AdvancedEQSettings f43576T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private int[] f43577U0;

    /* renamed from: V0, reason: collision with root package name */
    private byte f43578V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f43579W0;

    /* renamed from: X0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43572X0 = {N.u(new PropertyReference1Impl(EQEditorFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentEqEditorBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1882i0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43584N = new b();

        b() {
            super(1, C1882i0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentEqEditorBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1882i0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1882i0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @U({"SMAP\nEQEditorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EQEditorFragment.kt\ncom/harman/jbl/partybox/ui/equalizer/EQEditorFragment$initEQ$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,386:1\n1#2:387\n13404#3,3:388\n13404#3,3:391\n*S KotlinDebug\n*F\n+ 1 EQEditorFragment.kt\ncom/harman/jbl/partybox/ui/equalizer/EQEditorFragment$initEQ$2\n*L\n112#1:388,3\n122#1:391,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements l<H0, H0> {
        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            int[] iArr;
            f.a(EQEditorFragment.TAG, "eqLiveData observe called");
            HmDevice k12 = EQEditorFragment.this.r0().k1();
            if (k12 != null) {
                iArr = EQEditorFragment.this.q0().v(k12);
            } else {
                iArr = null;
            }
            int i4 = 0;
            if (iArr != null) {
                EQEditorFragment eQEditorFragment = EQEditorFragment.this;
                if (iArr.length != eQEditorFragment.getMBands().length) {
                    eQEditorFragment.setMBands(new int[iArr.length]);
                }
                int[] mBands = eQEditorFragment.getMBands();
                int length = mBands.length;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = mBands[i4];
                    eQEditorFragment.getMBands()[i5] = iArr[i5];
                    i4++;
                    i5++;
                }
                eQEditorFragment.v0();
                return;
            }
            EQEditorFragment eQEditorFragment2 = EQEditorFragment.this;
            int[] mBands2 = eQEditorFragment2.getMBands();
            int length2 = mBands2.length;
            int i7 = 0;
            int i8 = 0;
            while (i7 < length2) {
                int i9 = mBands2[i7];
                eQEditorFragment2.getMBands()[i8] = 0;
                i7++;
                i8++;
            }
            eQEditorFragment2.v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements l<Pair<? extends String, ? extends Boolean>, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends String, ? extends Boolean> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<String, Boolean> pair) {
            T1.a.a("EQEditorFragment BLEState btConnectStatusLiveData call:" + pair);
            HmDevice k12 = EQEditorFragment.this.r0().k1();
            if (k12 != null && F.g(k12.n(), pair.e())) {
                k12.R();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f43587a;

        e(l function) {
            F.p(function, "function");
            this.f43587a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43587a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43587a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public EQEditorFragment() {
        super(j.i.f41466Z);
        this.f43573Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43584N);
        this.f43574R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.equalizer.EQEditorFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Fragment n() {
                return Fragment.this;
            }
        };
        this.f43575S0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.equalizer.a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.equalizer.EQEditorFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ((q0) X2.a.this.n()).getViewModelStore();
                F.o(viewModelStore, "ownerProducer().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.equalizer.EQEditorFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                InterfaceC0919v interfaceC0919v;
                Object n4 = X2.a.this.n();
                m0.b bVar = null;
                if (n4 instanceof InterfaceC0919v) {
                    interfaceC0919v = (InterfaceC0919v) n4;
                } else {
                    interfaceC0919v = null;
                }
                if (interfaceC0919v != null) {
                    bVar = interfaceC0919v.getDefaultViewModelProviderFactory();
                }
                if (bVar == null) {
                    bVar = this.getDefaultViewModelProviderFactory();
                }
                F.o(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
                return bVar;
            }
        });
        this.f43577U0 = new int[5];
        this.f43578V0 = (byte) 1;
        this.f43579W0 = true;
    }

    private final void initView() {
        J1 j12 = p0().f39678G;
        j12.f38777I.setText(getString(j.m.f41721Z));
        j12.f38776H.setOnClickListener(this);
        ImageView imageView = j12.f38774F;
        F.m(imageView);
        imageView.setVisibility(0);
        imageView.setOnClickListener(this);
        imageView.setImageResource(j.f.N3);
        p0().f39677F.setListener(this);
    }

    private final void o0() {
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    private final C1882i0 p0() {
        return (C1882i0) this.f43573Q0.a(this, f43572X0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.equalizer.a q0() {
        return (com.harman.jbl.partybox.ui.equalizer.a) this.f43575S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o r0() {
        return (o) this.f43574R0.getValue();
    }

    private final void s0(int[] iArr) {
        if (iArr != null && iArr.length >= 5) {
            this.f43578V0 = EQCategory.CUSTOM.g();
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                this.f43577U0[i5] = iArr[i4];
                i4++;
                i5++;
            }
            if (this.f43579W0) {
                this.f43579W0 = false;
                com.harman.jbl.partybox.persistence.a.A(s3.a.f57652l, true);
            }
            y0();
        }
    }

    private final void t0() {
        LinkedList<AdvancedEQSettings> b4;
        HmDevice k12 = r0().k1();
        if (k12 != null && (b4 = k12.b()) != null) {
            for (AdvancedEQSettings advancedEQSettings : b4) {
                f.a(TAG, "mainDevice is not null and init custom eq " + advancedEQSettings);
                this.f43576T0 = advancedEQSettings;
                u0(advancedEQSettings);
            }
        }
        r0().f1().k(getViewLifecycleOwner(), new e(new c()));
    }

    private final void u0(AdvancedEQSettings advancedEQSettings) {
        AdvancedCustomEQPayload b4 = advancedEQSettings.b();
        if (b4 != null) {
            ArrayList<Byte> b5 = b4.b();
            if (b5.size() < 5) {
                f.a(TAG, "levelList size is lesser than band count");
                return;
            }
            if (this.f43577U0.length != b5.size()) {
                this.f43577U0 = new int[b5.size()];
            }
            int i4 = 0;
            for (Object obj : b5) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.Z();
                }
                this.f43577U0[i4] = ((Number) obj).byteValue();
                i4 = i5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        byte b4;
        AdvancedCustomEQPayload b5;
        byte b6;
        AdvancedCustomEQPayload b7;
        StringBuilder sb = new StringBuilder("initStatus : ");
        int i4 = 0;
        for (int i5 : this.f43577U0) {
            i4++;
            sb.append("band" + i4 + " = ");
            sb.append(i5);
            sb.append(", ");
        }
        f.a(TAG, sb.toString());
        Equalizer2View equalizer2View = p0().f39677F;
        if (this.f43577U0.length == 7) {
            Equalizer2View equalizer2View2 = p0().f39677F;
            AdvancedEQSettings advancedEQSettings = this.f43576T0;
            if (advancedEQSettings != null && (b7 = advancedEQSettings.b()) != null) {
                b6 = b7.c();
            } else {
                b6 = AdvancedCustomEQPayload.f48133O;
            }
            equalizer2View2.setLevel((b6 * 2) + 1);
            equalizer2View2.setTitles(new String[]{"≤125", "250", "500", "1k", "2k", "4k", "≥8k"});
            equalizer2View2.setValues(this.f43577U0);
            return;
        }
        Equalizer2View equalizer2View3 = p0().f39677F;
        AdvancedEQSettings advancedEQSettings2 = this.f43576T0;
        if (advancedEQSettings2 != null && (b5 = advancedEQSettings2.b()) != null) {
            b4 = b5.c();
        } else {
            b4 = 6;
        }
        equalizer2View3.setLevel((b4 * 2) + 1);
        equalizer2View3.setTitles(new String[]{"64", "250", "1k", "4k", "16k"});
        equalizer2View3.setValues(this.f43577U0);
    }

    private final void w0() {
        r0().V0().k(this, new e(new d()));
    }

    private final void x0() {
        f.a(TAG, "reset bands ");
        int[] iArr = this.f43577U0;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            this.f43577U0[i5] = 0;
            i4++;
            i5++;
        }
        v0();
    }

    private final void y0() {
        AdvancedEQSettings advancedEQSettings;
        HmDevice k12 = r0().k1();
        if (k12 != null) {
            LinkedList<SimpleEQSettings> K3 = k12.K();
            if (K3 != null) {
                for (SimpleEQSettings simpleEQSettings : K3) {
                    if (simpleEQSettings.a() == EQCategory.CUSTOM.g()) {
                        for (SimpleEQSettings.Parameter parameter : simpleEQSettings.b()) {
                            byte a4 = parameter.a();
                            if (a4 == 1) {
                                parameter.d((byte) this.f43577U0[0]);
                            } else if (a4 == 2) {
                                parameter.d((byte) this.f43577U0[1]);
                            } else if (a4 == 3) {
                                parameter.d((byte) this.f43577U0[2]);
                            } else if (a4 == 4) {
                                parameter.d((byte) this.f43577U0[3]);
                            } else if (a4 == 5) {
                                parameter.d((byte) this.f43577U0[4]);
                            } else if (a4 == 6) {
                                parameter.d((byte) this.f43577U0[5]);
                            } else if (a4 == 7) {
                                parameter.d((byte) this.f43577U0[6]);
                            }
                        }
                    }
                }
            }
            LinkedList<AdvancedEQSettings> b4 = k12.b();
            if (b4 == null || (advancedEQSettings = b4.get(0)) == null) {
                f.b(StageDashboardFragment.TAG, "Could not find the Device Custom values, so set it zero!");
                advancedEQSettings = new AdvancedEQSettings();
                advancedEQSettings.e(EQCategory.CUSTOM);
            }
            F.m(advancedEQSettings);
            LinkedList<AdvancedEQSettings> b5 = k12.b();
            if (b5 == null || b5.isEmpty()) {
                k12.W(new LinkedList<>());
                LinkedList<AdvancedEQSettings> b6 = k12.b();
                if (b6 != null) {
                    b6.add(0, advancedEQSettings);
                }
            }
            AdvancedEQSettings advancedEQSettings2 = new AdvancedEQSettings();
            advancedEQSettings2.e(advancedEQSettings.a());
            advancedEQSettings2.h(advancedEQSettings.d());
            advancedEQSettings2.g(advancedEQSettings.c());
            advancedEQSettings2.f(advancedEQSettings.b());
            AdvancedCustomEQPayload advancedCustomEQPayload = new AdvancedCustomEQPayload();
            StringBuilder sb = new StringBuilder();
            int i4 = 0;
            for (int i5 : this.f43577U0) {
                i4++;
                advancedCustomEQPayload.b().add(Byte.valueOf((byte) i5));
                sb.append(",mBand" + i4 + ":");
                sb.append(i5);
            }
            f.a(TAG, "updateEQ " + ((Object) sb));
            advancedEQSettings2.f(advancedCustomEQPayload);
            q0().A(k12, advancedEQSettings2);
        }
    }

    @l3.d
    public final int[] getMBands() {
        return this.f43577U0;
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.d View v3) {
        F.p(v3, "v");
        int id = v3.getId();
        if (id == j.h.Y6) {
            onBtnBackClick();
        } else if (id == j.h.f41253c) {
            x0();
            y0();
        }
    }

    @Override // com.harman.jbl.partybox.ui.widget.eq.Equalizer2View.a
    public void onProgressChanged(@l3.e int[] iArr, boolean z3) {
        String arrays = Arrays.toString(iArr);
        F.o(arrays, "toString(...)");
        f.a(TAG, "onProgressChanged:" + arrays);
    }

    @Override // com.harman.jbl.partybox.ui.widget.eq.Equalizer2View.a
    public void onSeekBlock() {
        o0();
    }

    @Override // com.harman.jbl.partybox.ui.widget.eq.Equalizer2View.a
    public void onStartTrackingTouch() {
        f.a(TAG, "onStartTrackingTouch");
    }

    @Override // com.harman.jbl.partybox.ui.widget.eq.Equalizer2View.a
    public void onStopTrackingTouch(int i4, @l3.e int[] iArr) {
        f.a(TAG, "onStopTrackingTouch:" + iArr);
        s0(iArr);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        t0();
        v0();
        w0();
    }

    public final void setMBands(@l3.d int[] iArr) {
        F.p(iArr, "<set-?>");
        this.f43577U0 = iArr;
    }
}
