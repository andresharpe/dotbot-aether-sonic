package com.harman.jbl.partybox.ui.help;

import X2.p;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.os.C0741d;
import androidx.fragment.app.ActivityC0889g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1872g0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.help.business.Business;
import com.harman.jbl.partybox.ui.help.k;
import com.harman.jbl.partybox.ui.help.ui.EnumGridLayoutType;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.widget.CollapsingToolBar;
import com.harman.jbl.partybox.ui.widget.VarColumnGridLayoutManager;
import com.harman.jbl.partybox.utils.q;
import com.harman.sdk.setting.ProductConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.A;
import kotlin.C2122h0;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.W;
import kotlin.collections.C2109w;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;
import kotlinx.coroutines.C2319j;
import kotlinx.coroutines.C2322k0;
import kotlinx.coroutines.C2323l;

@E(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001;\u0018\u0000 D2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bC\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\b*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u0004R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00105R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/harman/jbl/partybox/ui/help/SupportedDevicesFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "v0", "()V", "u0", "w0", "onBtnBackClick", "", "qsgLink", "pid", "t0", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/harman/jbl/partybox/ui/help/ui/f;", "bean", "y0", "(Lcom/harman/jbl/partybox/ui/help/ui/f;)V", "x0", "", "Lcom/harman/jbl/partybox/ui/help/ui/h;", "supportDevices", "o0", "(Ljava/util/List;)Ljava/util/List;", "z0", "(Ljava/util/List;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "onResume", "Lcom/harman/jbl/partybox/databinding/g0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "q0", "()Lcom/harman/jbl/partybox/databinding/g0;", "binding", "R0", "Ljava/lang/String;", SupportedDevicesFragment.f43776X0, "Lcom/harman/jbl/partybox/ui/main/o;", "S0", "Lkotlin/A;", "s0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/a;", "T0", "p0", "()Lcom/harman/jbl/partybox/a;", "appViewModel", "Landroidx/lifecycle/P;", "U0", "Landroidx/lifecycle/P;", "_layoutBeans", "com/harman/jbl/partybox/ui/help/SupportedDevicesFragment$d", "V0", "Lcom/harman/jbl/partybox/ui/help/SupportedDevicesFragment$d;", "columnCountProvider", "Landroidx/lifecycle/LiveData;", "r0", "()Landroidx/lifecycle/LiveData;", "layoutBean", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nSupportedDevicesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedDevicesFragment.kt\ncom/harman/jbl/partybox/ui/help/SupportedDevicesFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n66#2,4:266\n66#2,4:270\n2634#3:274\n1549#3:276\n1620#3,3:277\n1855#3,2:280\n1#4:275\n*S KotlinDebug\n*F\n+ 1 SupportedDevicesFragment.kt\ncom/harman/jbl/partybox/ui/help/SupportedDevicesFragment\n*L\n41#1:266,4\n42#1:270,4\n218#1:274\n220#1:276\n220#1:277,3\n242#1:280,2\n218#1:275\n*E\n"})
/* loaded from: classes2.dex */
public final class SupportedDevicesFragment extends BackDispatcherFragment {

    @l3.d
    public static final String CONNECTION_GUIDE = "connection_guide";

    @l3.d
    public static final String CONNECT_SPEAKER = "connect_speaker";

    @l3.d
    public static final String QSG = "qsg";

    @l3.d
    public static final String TAG = "SupportedDevicesFragment";

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private static final String f43776X0 = "screenType";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43777Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private String f43778R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f43779S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.d
    private final A f43780T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private final P<List<com.harman.jbl.partybox.ui.help.ui.f>> f43781U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private final d f43782V0;

    /* renamed from: W0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43775W0 = {N.u(new PropertyReference1Impl(SupportedDevicesFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentDynamicSupportedDevicesBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final SupportedDevicesFragment a(@l3.d String isFromScreen) {
            F.p(isFromScreen, "isFromScreen");
            SupportedDevicesFragment supportedDevicesFragment = new SupportedDevicesFragment();
            supportedDevicesFragment.setArguments(C0741d.b(C2122h0.a(SupportedDevicesFragment.f43776X0, isFromScreen)));
            return supportedDevicesFragment;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43783a;

        static {
            int[] iArr = new int[EnumGridLayoutType.values().length];
            try {
                iArr[EnumGridLayoutType.GRANT_PERMISSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumGridLayoutType.DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumGridLayoutType.ULTIMATE_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43783a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class c extends FunctionReferenceImpl implements X2.l<View, C1872g0> {

        /* renamed from: N, reason: collision with root package name */
        public static final c f43784N = new c();

        c() {
            super(1, C1872g0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentDynamicSupportedDevicesBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1872g0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1872g0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements VarColumnGridLayoutManager.a {

        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43786a;

            static {
                int[] iArr = new int[EnumGridLayoutType.values().length];
                try {
                    iArr[EnumGridLayoutType.DEVICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f43786a = iArr;
            }
        }

        d() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.VarColumnGridLayoutManager.a
        public int a(int i4) {
            Object W22;
            EnumGridLayoutType enumGridLayoutType;
            List list = (List) SupportedDevicesFragment.this.f43781U0.f();
            if (list != null) {
                W22 = D.W2(list, i4);
                com.harman.jbl.partybox.ui.help.ui.f fVar = (com.harman.jbl.partybox.ui.help.ui.f) W22;
                if (fVar != null) {
                    enumGridLayoutType = fVar.f();
                } else {
                    enumGridLayoutType = null;
                }
                if (enumGridLayoutType == null || a.f43786a[enumGridLayoutType.ordinal()] != 1) {
                    return 2;
                }
                return 1;
            }
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<List<? extends com.harman.jbl.partybox.ui.help.ui.f>, H0> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ com.harman.jbl.partybox.ui.help.ui.i f43787F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(com.harman.jbl.partybox.ui.help.ui.i iVar) {
            super(1);
            this.f43787F = iVar;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends com.harman.jbl.partybox.ui.help.ui.f> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<com.harman.jbl.partybox.ui.help.ui.f> list) {
            this.f43787F.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public /* synthetic */ class f extends FunctionReferenceImpl implements X2.l<com.harman.jbl.partybox.ui.help.ui.f, H0> {
        f(Object obj) {
            super(1, obj, SupportedDevicesFragment.class, "onItemClick", "onItemClick(Lcom/harman/jbl/partybox/ui/help/ui/GridLayoutBean;)V", 0);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.ui.help.ui.f fVar) {
            C0(fVar);
            return H0.f51801a;
        }

        public final void C0(@l3.e com.harman.jbl.partybox.ui.help.ui.f fVar) {
            ((SupportedDevicesFragment) this.f52262F).y0(fVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements CollapsingToolBar.b {
        g() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void a() {
        }

        @Override // com.harman.jbl.partybox.ui.widget.CollapsingToolBar.b
        public void b() {
            SupportedDevicesFragment.this.onBtnBackClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.help.SupportedDevicesFragment$launchBusiness$1", f = "SupportedDevicesFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class h extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43789I;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.help.SupportedDevicesFragment$launchBusiness$1$remoteSupportDevice$1", f = "SupportedDevicesFragment.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super List<? extends com.harman.jbl.partybox.ui.help.ui.h>>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f43791I;

            a(kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f43791I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    Business business = Business.f43795a;
                    this.f43791I = 1;
                    obj = business.b(this);
                    if (obj == l4) {
                        return l4;
                    }
                }
                return obj;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super List<com.harman.jbl.partybox.ui.help.ui.h>> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(cVar);
            }
        }

        h(kotlin.coroutines.c<? super h> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f43789I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                kotlinx.coroutines.N c4 = C2322k0.c();
                a aVar = new a(null);
                this.f43789I = 1;
                obj = C2319j.h(c4, aVar, this);
                if (obj == l4) {
                    return l4;
                }
            }
            List list = (List) obj;
            if (list != null && !list.isEmpty()) {
                SupportedDevicesFragment.this.f43781U0.r(SupportedDevicesFragment.this.o0(list));
                return H0.f51801a;
            }
            com.harman.log.f.b(SupportedDevicesFragment.TAG, "launchBusiness() >>> can't fetch support device from remote");
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((h) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new h(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f43792a;

        i(X2.l function) {
            F.p(function, "function");
            this.f43792a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43792a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43792a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public SupportedDevicesFragment() {
        super(j.i.f41458X);
        this.f43777Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, c.f43784N);
        this.f43778R0 = CONNECTION_GUIDE;
        this.f43779S0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f43780T0 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.a.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f43781U0 = new P<>();
        this.f43782V0 = new d();
    }

    @W2.n
    @l3.d
    public static final SupportedDevicesFragment newInstance(@l3.d String str) {
        return Companion.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<com.harman.jbl.partybox.ui.help.ui.f> o0(List<com.harman.jbl.partybox.ui.help.ui.h> list) {
        boolean z3;
        List O3;
        List<com.harman.jbl.partybox.ui.help.ui.f> V5;
        int b02;
        String str;
        com.harman.log.f.d(TAG, "composeSupportDeviceList() >>> supportDevices:\n" + z0(list));
        if (s0().J() && s0().K() && s0().I()) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (!z3) {
            arrayList.add(new com.harman.jbl.partybox.ui.help.ui.f(EnumGridLayoutType.GRANT_PERMISSION, null, 2, null));
        }
        if (list != null && !list.isEmpty()) {
            for (com.harman.jbl.partybox.ui.help.ui.h hVar : list) {
                ProductConfig.ProductItem u3 = com.harman.sdk.utils.d.u(hVar.g());
                if (u3 != null) {
                    str = u3.k();
                } else {
                    str = null;
                }
                hVar.i(str);
            }
            b02 = C2109w.b0(list, 10);
            ArrayList arrayList2 = new ArrayList(b02);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.harman.jbl.partybox.ui.help.ui.f(EnumGridLayoutType.DEVICE, (com.harman.jbl.partybox.ui.help.ui.h) it.next()));
            }
            arrayList.addAll(arrayList2);
        }
        O3 = CollectionsKt__CollectionsKt.O(new com.harman.jbl.partybox.ui.help.ui.f(EnumGridLayoutType.ULTIMATE_DEVICE, null, 2, null), new com.harman.jbl.partybox.ui.help.ui.f(EnumGridLayoutType.NOT_ON_THE_LIST, null, 2, null));
        arrayList.addAll(O3);
        V5 = D.V5(arrayList);
        return V5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBtnBackClick() {
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final com.harman.jbl.partybox.a p0() {
        return (com.harman.jbl.partybox.a) this.f43780T0.getValue();
    }

    private final C1872g0 q0() {
        return (C1872g0) this.f43777Q0.a(this, f43775W0[0]);
    }

    private final LiveData<List<com.harman.jbl.partybox.ui.help.ui.f>> r0() {
        return this.f43781U0;
    }

    private final o s0() {
        return (o) this.f43779S0.getValue();
    }

    private final void t0(String str, String str2) {
        ActivityInfo activityInfo;
        PackageManager packageManager;
        if (F.g(this.f43778R0, QSG)) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            ActivityC0889g activity = getActivity();
            if (activity != null && (packageManager = activity.getPackageManager()) != null) {
                activityInfo = intent.resolveActivityInfo(packageManager, 65536);
            } else {
                activityInfo = null;
            }
            if (activityInfo != null && activityInfo.exported) {
                startActivity(intent);
                return;
            }
            return;
        }
        k.a a4 = k.a(str2);
        F.o(a4, "actionSupportedDevicesFr…kerBluetoothFragment(...)");
        q.f(this, a4);
    }

    private final void u0() {
        RecyclerView recyclerView = q0().f39595G;
        VarColumnGridLayoutManager varColumnGridLayoutManager = new VarColumnGridLayoutManager(getContext());
        varColumnGridLayoutManager.f3(1);
        varColumnGridLayoutManager.R3(this.f43782V0);
        varColumnGridLayoutManager.N3(varColumnGridLayoutManager.H3());
        recyclerView.setLayoutManager(varColumnGridLayoutManager);
        LiveData<List<com.harman.jbl.partybox.ui.help.ui.f>> r02 = r0();
        LayoutInflater from = LayoutInflater.from(getContext());
        F.o(from, "from(...)");
        o s02 = s0();
        androidx.lifecycle.E viewLifecycleOwner = getViewLifecycleOwner();
        F.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        Resources resources = getResources();
        F.o(resources, "getResources(...)");
        com.harman.jbl.partybox.ui.help.ui.i iVar = new com.harman.jbl.partybox.ui.help.ui.i(r02, from, s02, viewLifecycleOwner, resources, new f(this));
        q0().f39595G.setAdapter(iVar);
        this.f43781U0.k(this, new i(new e(iVar)));
    }

    private final void v0() {
        H0 h02;
        String string;
        String string2;
        q0().f39594F.setNavigationListener(new g());
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(f43776X0)) != null) {
            com.harman.log.f.a(TAG, "initHeader() >>> screenType[" + string + "]");
            this.f43778R0 = string;
            CollapsingToolBar collapsingToolBar = q0().f39594F;
            int hashCode = string.hashCode();
            if (hashCode != -199101014) {
                if (hashCode == 112261 && string.equals(QSG)) {
                    string2 = getString(j.m.R8);
                    collapsingToolBar.setTitleText(string2);
                    h02 = H0.f51801a;
                }
                string2 = getString(j.m.H6);
                collapsingToolBar.setTitleText(string2);
                h02 = H0.f51801a;
            } else {
                if (string.equals(CONNECT_SPEAKER)) {
                    string2 = getString(j.m.H6);
                    collapsingToolBar.setTitleText(string2);
                    h02 = H0.f51801a;
                }
                string2 = getString(j.m.H6);
                collapsingToolBar.setTitleText(string2);
                h02 = H0.f51801a;
            }
        } else {
            h02 = null;
        }
        if (h02 == null) {
            com.harman.log.f.a(TAG, "initHeader() >>> default screenType[" + this.f43778R0 + "]");
            q0().f39594F.setTitleText(getString(j.m.f41750f));
        }
    }

    private final void w0() {
        this.f43781U0.r(o0(Business.f43795a.a(getContext())));
        C2323l.f(androidx.lifecycle.F.a(this), C2322k0.e(), null, new h(null), 2, null);
    }

    private final void x0() {
        k.c d4 = k.d();
        F.o(d4, "actionToPermissionAndAccessFragment(...)");
        d4.b(2);
        q.f(this, d4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(com.harman.jbl.partybox.ui.help.ui.f fVar) {
        String h4;
        String g4;
        if (fVar == null) {
            return;
        }
        int i4 = b.f43783a[fVar.f().ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    k.b b4 = k.b("JBL PartyBox Ultimate");
                    F.o(b4, "actionSupportedDevicesFr…entToLaunchJblOneApp(...)");
                    q.f(this, b4);
                    return;
                }
                return;
            }
            com.harman.jbl.partybox.ui.help.ui.h e4 = fVar.e();
            if (e4 == null || (h4 = e4.h()) == null || (g4 = fVar.e().g()) == null) {
                return;
            }
            t0(h4, g4);
            return;
        }
        x0();
    }

    private final String z0(List<com.harman.jbl.partybox.ui.help.ui.h> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                sb.append((com.harman.jbl.partybox.ui.help.ui.h) it.next());
                sb.append("\n");
            }
            String sb2 = sb.toString();
            F.o(sb2, "toString(...)");
            return sb2;
        }
        return "null";
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        w0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        v0();
        u0();
        if (F.g(this.f43778R0, CONNECTION_GUIDE) && !p0().z()) {
            k.c d4 = k.d();
            F.o(d4, "actionToPermissionAndAccessFragment(...)");
            q.f(this, d4);
        }
    }
}
