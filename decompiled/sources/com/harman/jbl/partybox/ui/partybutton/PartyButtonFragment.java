package com.harman.jbl.partybox.ui.partybutton;

import X2.l;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.ActivityC0587e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.R0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.jbl.partybox.ui.party.BackDispatcherFragment;
import com.harman.jbl.partybox.ui.partybutton.PartyButtonFragment;
import com.harman.jbl.partybox.ui.partybutton.f;
import com.harman.jbl.partybox.ui.widget.ShapeTextButton;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;
import kotlin.reflect.n;

@E(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 42\u00020\u0001:\u00045678B\u0007¢\u0006\u0004\b3\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00069"}, d2 = {"Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment;", "Lcom/harman/jbl/partybox/ui/party/BackDispatcherFragment;", "Lkotlin/H0;", "initView", "()V", "onBtnBackClick", "Lcom/harman/jbl/partybox/model/c;", "partyButton", "E0", "(Lcom/harman/jbl/partybox/model/c;)V", "D0", "w0", "B0", "C0", "", "type", "", "u0", "(I)Ljava/lang/String;", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "handleOnBackPressed", "Lcom/harman/jbl/partybox/databinding/R0;", "Q0", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "s0", "()Lcom/harman/jbl/partybox/databinding/R0;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "R0", "Lkotlin/A;", "t0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/partybutton/h;", "S0", "v0", "()Lcom/harman/jbl/partybox/ui/partybutton/h;", "viewModel", "Lcom/harman/jbl/partybox/ui/partybutton/f;", "T0", "Lcom/harman/jbl/partybox/ui/partybutton/f;", "partyAdapter", "Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$PageType;", "U0", "Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$PageType;", "pageType", "<init>", "Companion", "a", "PageType", com.harman.log.b.f47574c, "c", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyButtonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyButtonFragment.kt\ncom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n66#2,4:220\n84#3,6:224\n1#4:230\n*S KotlinDebug\n*F\n+ 1 PartyButtonFragment.kt\ncom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment\n*L\n32#1:220,4\n33#1:224,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyButtonFragment extends BackDispatcherFragment {

    @l3.d
    public static final String TAG = "PartyButtonFragment";

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f45401Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final A f45402R0;

    /* renamed from: S0, reason: collision with root package name */
    @l3.d
    private final A f45403S0;

    /* renamed from: T0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.partybutton.f f45404T0;

    /* renamed from: U0, reason: collision with root package name */
    @l3.d
    private PageType f45405U0;

    /* renamed from: V0, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f45400V0 = {N.u(new PropertyReference1Impl(PartyButtonFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentPartyButtonBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$PageType;", "", "(Ljava/lang/String;I)V", "PAGE_VOICE", "PAGE_TONE", "PAGE_SOUND", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class PageType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ PageType[] $VALUES;
        public static final PageType PAGE_VOICE = new PageType("PAGE_VOICE", 0);
        public static final PageType PAGE_TONE = new PageType("PAGE_TONE", 1);
        public static final PageType PAGE_SOUND = new PageType("PAGE_SOUND", 2);

        static {
            PageType[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private PageType(String str, int i4) {
        }

        private static final /* synthetic */ PageType[] b() {
            return new PageType[]{PAGE_VOICE, PAGE_TONE, PAGE_SOUND};
        }

        @l3.d
        public static kotlin.enums.a<PageType> e() {
            return $ENTRIES;
        }

        public static PageType valueOf(String str) {
            return (PageType) Enum.valueOf(PageType.class, str);
        }

        public static PageType[] values() {
            return (PageType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l3.e
        private final String f45408a;

        /* renamed from: b, reason: collision with root package name */
        @l3.e
        private final List<com.harman.jbl.partybox.model.c> f45409b;

        public b(@l3.e String str, @l3.e List<com.harman.jbl.partybox.model.c> list) {
            this.f45408a = str;
            this.f45409b = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b d(b bVar, String str, List list, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = bVar.f45408a;
            }
            if ((i4 & 2) != 0) {
                list = bVar.f45409b;
            }
            return bVar.c(str, list);
        }

        @l3.e
        public final String a() {
            return this.f45408a;
        }

        @l3.e
        public final List<com.harman.jbl.partybox.model.c> b() {
            return this.f45409b;
        }

        @l3.d
        public final b c(@l3.e String str, @l3.e List<com.harman.jbl.partybox.model.c> list) {
            return new b(str, list);
        }

        @l3.e
        public final List<com.harman.jbl.partybox.model.c> e() {
            return this.f45409b;
        }

        public boolean equals(@l3.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return F.g(this.f45408a, bVar.f45408a) && F.g(this.f45409b, bVar.f45409b);
        }

        @l3.e
        public final String f() {
            return this.f45408a;
        }

        public int hashCode() {
            String str = this.f45408a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<com.harman.jbl.partybox.model.c> list = this.f45409b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @l3.d
        public String toString() {
            return "PagerData(title=" + this.f45408a + ", dataList=" + this.f45409b + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends FragmentStateAdapter {

        /* renamed from: p, reason: collision with root package name */
        @l3.d
        public static final a f45410p = new a(null);

        /* renamed from: q, reason: collision with root package name */
        public static final int f45411q = 3;

        /* renamed from: o, reason: collision with root package name */
        @l3.d
        private final SparseArray<Fragment> f45412o;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@l3.d ActivityC0587e appCompatActivity) {
            super(appCompatActivity);
            F.p(appCompatActivity, "appCompatActivity");
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            this.f45412o = sparseArray;
            PageType pageType = PageType.PAGE_VOICE;
            sparseArray.put(pageType.ordinal(), new ButtonPagerFragment(pageType));
            PageType pageType2 = PageType.PAGE_TONE;
            sparseArray.put(pageType2.ordinal(), new ButtonPagerFragment(pageType2));
            PageType pageType3 = PageType.PAGE_SOUND;
            sparseArray.put(pageType3.ordinal(), new ButtonPagerFragment(pageType3));
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @l3.d
        public Fragment Q(int i4) {
            PageType pageType = PageType.PAGE_VOICE;
            if (i4 == pageType.ordinal()) {
                Fragment fragment = this.f45412o.get(pageType.ordinal());
                F.o(fragment, "get(...)");
                return fragment;
            }
            PageType pageType2 = PageType.PAGE_TONE;
            if (i4 == pageType2.ordinal()) {
                Fragment fragment2 = this.f45412o.get(pageType2.ordinal());
                F.o(fragment2, "get(...)");
                return fragment2;
            }
            Fragment fragment3 = this.f45412o.get(PageType.PAGE_SOUND.ordinal());
            F.o(fragment3, "get(...)");
            return fragment3;
        }

        @l3.d
        public final SparseArray<Fragment> i0() {
            return this.f45412o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int l() {
            return 3;
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class d extends FunctionReferenceImpl implements l<View, R0> {

        /* renamed from: N, reason: collision with root package name */
        public static final d f45413N = new d();

        d() {
            super(1, R0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentPartyButtonBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final R0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return R0.a(p02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements l<List<? extends com.harman.jbl.partybox.model.c>, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends com.harman.jbl.partybox.model.c> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<com.harman.jbl.partybox.model.c> list) {
            com.harman.jbl.partybox.ui.partybutton.f fVar = PartyButtonFragment.this.f45404T0;
            if (fVar != null) {
                F.m(list);
                fVar.U(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @U({"SMAP\nPartyButtonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyButtonFragment.kt\ncom/harman/jbl/partybox/ui/partybutton/PartyButtonFragment$initObserver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n1#2:220\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements l<Map<Integer, ? extends com.harman.jbl.partybox.model.c>, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Map<Integer, ? extends com.harman.jbl.partybox.model.c> map) {
            c(map);
            return H0.f51801a;
        }

        public final void c(Map<Integer, com.harman.jbl.partybox.model.c> map) {
            String str;
            String str2;
            ShapeTextButton shapeTextButton = PartyButtonFragment.this.s0().f39006M;
            com.harman.jbl.partybox.model.c cVar = map.get(0);
            String str3 = null;
            if (cVar != null) {
                str = PartyButtonFragment.this.getString(cVar.j());
            } else {
                str = null;
            }
            shapeTextButton.setTitle(str);
            ShapeTextButton shapeTextButton2 = PartyButtonFragment.this.s0().f39005L;
            com.harman.jbl.partybox.model.c cVar2 = map.get(1);
            if (cVar2 != null) {
                str2 = PartyButtonFragment.this.getString(cVar2.j());
            } else {
                str2 = null;
            }
            shapeTextButton2.setTitle(str2);
            ShapeTextButton shapeTextButton3 = PartyButtonFragment.this.s0().f39004K;
            com.harman.jbl.partybox.model.c cVar3 = map.get(2);
            if (cVar3 != null) {
                str3 = PartyButtonFragment.this.getString(cVar3.j());
            }
            shapeTextButton3.setTitle(str3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements f.b {

        /* loaded from: classes2.dex */
        static final class a extends Lambda implements l<com.harman.jbl.partybox.model.c, H0> {

            /* renamed from: F, reason: collision with root package name */
            public static final a f45417F = new a();

            a() {
                super(1);
            }

            @Override // X2.l
            public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partybox.model.c cVar) {
                c(cVar);
                return H0.f51801a;
            }

            public final void c(com.harman.jbl.partybox.model.c cVar) {
                cVar.m(false);
            }
        }

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(l tmp0, Object obj) {
            F.p(tmp0, "$tmp0");
            tmp0.C(obj);
        }

        @Override // com.harman.jbl.partybox.ui.partybutton.f.b
        public void a(int i4) {
            List<com.harman.jbl.partybox.model.c> list;
            com.harman.jbl.partybox.ui.partybutton.f fVar = PartyButtonFragment.this.f45404T0;
            if (fVar != null) {
                list = fVar.Q();
            } else {
                list = null;
            }
            F.m(list);
            Stream<com.harman.jbl.partybox.model.c> stream = list.stream();
            final a aVar = a.f45417F;
            stream.forEach(new Consumer() { // from class: com.harman.jbl.partybox.ui.partybutton.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    PartyButtonFragment.g.c(l.this, obj);
                }
            });
            list.get(i4).m(true);
            PartyButtonFragment.this.E0(list.get(i4));
            com.harman.jbl.partybox.ui.partybutton.f fVar2 = PartyButtonFragment.this.f45404T0;
            if (fVar2 != null) {
                fVar2.r();
            }
            T1.a.a("BLE_LOG PartyButtonFragment onClick pageType:" + PartyButtonFragment.this.f45405U0 + ", button  : " + list.get(i4));
            HmDevice k12 = PartyButtonFragment.this.t0().k1();
            if (k12 != null) {
                PartyButtonFragment partyButtonFragment = PartyButtonFragment.this;
                partyButtonFragment.v0().g0(partyButtonFragment.f45405U0.ordinal() + 1, list.get(i4).l().g(), k12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f45418a;

        h(l function) {
            F.p(function, "function");
            this.f45418a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f45418a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f45418a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public PartyButtonFragment() {
        super(j.i.f41387F0);
        this.f45401Q0 = com.harman.jbl.partybox.ui.delegate.b.a(this, d.f45413N);
        this.f45402R0 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f45403S0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.partybutton.h.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.partybutton.PartyButtonFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                F.o(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.partybutton.PartyButtonFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.f45405U0 = PageType.PAGE_VOICE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(PartyButtonFragment this$0, ShapeTextButton this_apply, View view) {
        F.p(this$0, "this$0");
        F.p(this_apply, "$this_apply");
        PageType pageType = this$0.f45405U0;
        PageType pageType2 = PageType.PAGE_SOUND;
        if (pageType == pageType2) {
            this$0.C0();
            return;
        }
        this$0.D0();
        this$0.f45405U0 = pageType2;
        this_apply.setChecked(true);
        this$0.B0();
        this$0.C0();
    }

    private final void B0() {
        s0().f39003J.setText(u0(this.f45405U0.ordinal()));
        HmDevice k12 = t0().k1();
        if (k12 != null) {
            v0().Z(k12, this.f45405U0.ordinal());
        }
    }

    private final void C0() {
        HmDevice k12 = t0().k1();
        if (k12 != null) {
            v0().h0(k12, this.f45405U0.ordinal());
        }
    }

    private final void D0() {
        int ordinal = this.f45405U0.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    s0().f39004K.setChecked(false);
                    return;
                }
                return;
            }
            s0().f39005L.setChecked(false);
            return;
        }
        s0().f39006M.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(com.harman.jbl.partybox.model.c cVar) {
        int ordinal = this.f45405U0.ordinal();
        String str = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ShapeTextButton shapeTextButton = s0().f39004K;
                    if (cVar != null) {
                        str = getString(cVar.j());
                    }
                    shapeTextButton.setTitle(str);
                    return;
                }
                return;
            }
            ShapeTextButton shapeTextButton2 = s0().f39005L;
            if (cVar != null) {
                str = getString(cVar.j());
            }
            shapeTextButton2.setTitle(str);
            return;
        }
        ShapeTextButton shapeTextButton3 = s0().f39006M;
        if (cVar != null) {
            str = getString(cVar.j());
        }
        shapeTextButton3.setTitle(str);
    }

    private final void initView() {
        String str;
        s0().f39001H.f38611G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.partybutton.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyButtonFragment.x0(PartyButtonFragment.this, view);
            }
        });
        HmCustomFontTextView hmCustomFontTextView = s0().f39001H.f38613I;
        Context context = hmCustomFontTextView.getContext();
        if (context != null) {
            str = context.getString(j.m.f41813r2);
        } else {
            str = null;
        }
        hmCustomFontTextView.setText(str);
        final ShapeTextButton shapeTextButton = s0().f39006M;
        shapeTextButton.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.partybutton.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyButtonFragment.y0(PartyButtonFragment.this, shapeTextButton, view);
            }
        });
        final ShapeTextButton shapeTextButton2 = s0().f39005L;
        shapeTextButton2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.partybutton.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyButtonFragment.z0(PartyButtonFragment.this, shapeTextButton2, view);
            }
        });
        final ShapeTextButton shapeTextButton3 = s0().f39004K;
        shapeTextButton3.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.partybutton.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyButtonFragment.A0(PartyButtonFragment.this, shapeTextButton3, view);
            }
        });
        com.harman.jbl.partybox.ui.partybutton.f fVar = new com.harman.jbl.partybox.ui.partybutton.f();
        this.f45404T0 = fVar;
        fVar.T(new g());
        RecyclerView recyclerView = s0().f38999F;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        recyclerView.setAdapter(this.f45404T0);
        int dimension = (int) recyclerView.getResources().getDimension(j.e.f40903z);
        recyclerView.n(new com.harman.jbl.partybox.ui.widget.n(2, dimension, dimension));
    }

    private final void onBtnBackClick() {
        androidx.navigation.fragment.f.a(this).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final R0 s0() {
        return (R0) this.f45401Q0.a(this, f45400V0[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o t0() {
        return (o) this.f45402R0.getValue();
    }

    private final String u0(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                Context context = getContext();
                if (context == null) {
                    return null;
                }
                return context.getString(j.m.W6);
            }
            Context context2 = getContext();
            if (context2 == null) {
                return null;
            }
            return context2.getString(j.m.Za);
        }
        return "Vocal";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.partybutton.h v0() {
        return (com.harman.jbl.partybox.ui.partybutton.h) this.f45403S0.getValue();
    }

    private final void w0() {
        v0().a0().k(getViewLifecycleOwner(), new h(new e()));
        v0().d0().k(getViewLifecycleOwner(), new h(new f()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(PartyButtonFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.onBtnBackClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(PartyButtonFragment this$0, ShapeTextButton this_apply, View view) {
        F.p(this$0, "this$0");
        F.p(this_apply, "$this_apply");
        PageType pageType = this$0.f45405U0;
        PageType pageType2 = PageType.PAGE_VOICE;
        if (pageType == pageType2) {
            this$0.C0();
            return;
        }
        this$0.D0();
        this$0.f45405U0 = pageType2;
        this_apply.setChecked(true);
        this$0.B0();
        this$0.C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(PartyButtonFragment this$0, ShapeTextButton this_apply, View view) {
        F.p(this$0, "this$0");
        F.p(this_apply, "$this_apply");
        PageType pageType = this$0.f45405U0;
        PageType pageType2 = PageType.PAGE_TONE;
        if (pageType == pageType2) {
            this$0.C0();
            return;
        }
        this$0.D0();
        this$0.f45405U0 = pageType2;
        this_apply.setChecked(true);
        this$0.B0();
        this$0.C0();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment
    public void handleOnBackPressed() {
        onBtnBackClick();
    }

    @Override // com.harman.jbl.partybox.ui.party.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        initView();
        w0();
        B0();
    }
}
