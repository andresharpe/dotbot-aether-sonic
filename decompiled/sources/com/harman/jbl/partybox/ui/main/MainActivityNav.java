package com.harman.jbl.partybox.ui.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActivityC0587e;
import androidx.cardview.widget.CardView;
import androidx.core.app.C0617b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Q;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import com.google.firebase.messaging.C1821f;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$1;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$2;
import com.harman.jbl.partybox.GeneralService;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.appmenu.InfoFragment;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.dashboard.HomeFragment;
import com.harman.jbl.partybox.ui.help.RedirectionActivity;
import com.harman.jbl.partybox.ui.main.MainActivityNav;
import com.harman.jbl.partybox.ui.party.PartyFragment;
import com.harman.jbl.partybox.utils.q;
import com.harman.jbl.partylight.lib.f;
import com.harman.sdk.device.HmDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.U;

@E(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 r2\u00020\u0001:\u0002stB\u0007¢\u0006\u0004\bq\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0004J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J)\u0010%\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010#H\u0014¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001a2\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0002H\u0014¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0002H\u0016¢\u0006\u0004\b.\u0010\u0004R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010IR\u0018\u0010P\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010^\u001a\u0012\u0012\u0004\u0012\u00020Z0Yj\b\u0012\u0004\u0012\u00020Z`[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R6\u0010c\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0_j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f``8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010i\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006u"}, d2 = {"Lcom/harman/jbl/partybox/ui/main/MainActivityNav;", "Landroidx/appcompat/app/e;", "Lkotlin/H0;", "l1", "()V", "g1", "", "disable", "W0", "(Z)V", com.harman.sdk.utils.k.f48619T, "U0", "", "devicePid", "k1", "(Ljava/lang/String;)V", "p1", "o1", "n1", "b1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "", "Y0", "()I", "Landroid/app/Activity;", "activity", "m1", "(Landroid/app/Activity;)V", "requestCode", "resultCode", "Landroid/content/Intent;", C1821f.C0339f.a.f37006R, "onActivityResult", "(IILandroid/content/Intent;)V", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onDestroy", "finish", "Lcom/harman/jbl/partybox/a;", "h0", "Lkotlin/A;", "X0", "()Lcom/harman/jbl/partybox/a;", "appViewModel", "Lcom/harman/jbl/partybox/ui/main/o;", "i0", "Z0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/main/p;", "j0", com.harman.sdk.utils.k.f48625V, "()Lcom/harman/jbl/partybox/ui/main/p;", "pagerTabViewModel", "Landroid/widget/TextView;", "k0", "Landroid/widget/TextView;", "titleTextView", "Landroidx/cardview/widget/CardView;", "l0", "Landroidx/cardview/widget/CardView;", "popCardView", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "m0", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "productTitle", "n0", "productName", "Landroid/widget/ImageView;", "o0", "Landroid/widget/ImageView;", "productImage", "Landroidx/viewpager2/widget/ViewPager2;", "p0", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Lcom/google/android/material/tabs/TabLayout;", "q0", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Ljava/util/ArrayList;", "Lcom/harman/sdk/device/HmDevice;", "Lkotlin/collections/ArrayList;", "r0", "Ljava/util/ArrayList;", "wifiDeviceList", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "s0", "Ljava/util/HashMap;", "displayedWifiDeviceList", "t0", "Z", "isWifiDeviceDialogDisplayed", "u0", "Lcom/harman/sdk/device/HmDevice;", "selectedWifiDevice", "v0", "Ljava/lang/String;", "lastLan", "", "w0", "J", "keybackMillis", "<init>", "x0", "a", com.harman.log.b.f47574c, "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMainActivityNav.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityNav.kt\ncom/harman/jbl/partybox/ui/main/MainActivityNav\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,468:1\n30#2,4:469\n30#2,4:473\n75#3,13:477\n260#4:490\n260#4:492\n260#4:493\n1#5:491\n*S KotlinDebug\n*F\n+ 1 MainActivityNav.kt\ncom/harman/jbl/partybox/ui/main/MainActivityNav\n*L\n55#1:469,4\n57#1:473,4\n59#1:477,13\n101#1:490\n344#1:492\n356#1:493\n*E\n"})
/* loaded from: classes2.dex */
public final class MainActivityNav extends ActivityC0587e {

    /* renamed from: A0, reason: collision with root package name */
    public static final int f44070A0 = 10001;

    /* renamed from: B0, reason: collision with root package name */
    public static final int f44071B0 = 10002;

    /* renamed from: C0, reason: collision with root package name */
    public static final int f44072C0 = 2;

    /* renamed from: x0, reason: collision with root package name */
    @l3.d
    public static final a f44073x0 = new a(null);

    /* renamed from: y0, reason: collision with root package name */
    @l3.d
    private static final String f44074y0 = "MainActivityNav";

    /* renamed from: z0, reason: collision with root package name */
    public static final int f44075z0 = 1;

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final A f44076h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private final A f44077i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final A f44078j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.e
    private TextView f44079k0;

    /* renamed from: l0, reason: collision with root package name */
    @l3.e
    private CardView f44080l0;

    /* renamed from: m0, reason: collision with root package name */
    @l3.e
    private HmCustomFontTextView f44081m0;

    /* renamed from: n0, reason: collision with root package name */
    @l3.e
    private HmCustomFontTextView f44082n0;

    /* renamed from: o0, reason: collision with root package name */
    @l3.e
    private ImageView f44083o0;

    /* renamed from: p0, reason: collision with root package name */
    @l3.e
    private ViewPager2 f44084p0;

    /* renamed from: q0, reason: collision with root package name */
    @l3.e
    private TabLayout f44085q0;

    /* renamed from: r0, reason: collision with root package name */
    @l3.d
    private final ArrayList<HmDevice> f44086r0;

    /* renamed from: s0, reason: collision with root package name */
    @l3.d
    private HashMap<String, String> f44087s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f44088t0;

    /* renamed from: u0, reason: collision with root package name */
    @l3.e
    private HmDevice f44089u0;

    /* renamed from: v0, reason: collision with root package name */
    @l3.e
    private String f44090v0;

    /* renamed from: w0, reason: collision with root package name */
    private long f44091w0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends FragmentStateAdapter {

        /* renamed from: p, reason: collision with root package name */
        @l3.d
        public static final a f44096p = new a(null);

        /* renamed from: q, reason: collision with root package name */
        public static final int f44097q = 3;

        /* renamed from: r, reason: collision with root package name */
        public static final int f44098r = 0;

        /* renamed from: s, reason: collision with root package name */
        public static final int f44099s = 1;

        /* renamed from: t, reason: collision with root package name */
        public static final int f44100t = 2;

        /* renamed from: o, reason: collision with root package name */
        @l3.d
        private final SparseArray<Fragment> f44101o;

        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(C2197u c2197u) {
                this();
            }

            private a() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d ActivityC0587e activity) {
            super(activity);
            F.p(activity, "activity");
            SparseArray<Fragment> sparseArray = new SparseArray<>();
            this.f44101o = sparseArray;
            sparseArray.put(0, new HomeFragment());
            sparseArray.put(1, new PartyFragment());
            sparseArray.put(2, new InfoFragment());
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @l3.d
        public Fragment Q(int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    return new InfoFragment();
                }
                Fragment fragment = this.f44101o.get(1);
                F.o(fragment, "get(...)");
                return fragment;
            }
            Fragment fragment2 = this.f44101o.get(0);
            F.o(fragment2, "get(...)");
            return fragment2;
        }

        @l3.d
        public final SparseArray<Fragment> i0() {
            return this.f44101o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int l() {
            return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c extends Lambda implements X2.l<HmDevice, Boolean> {
        c() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object e(X2.l tmp0, Object obj) {
            F.p(tmp0, "$tmp0");
            return tmp0.C(obj);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice device) {
            F.p(device, "device");
            HashMap hashMap = MainActivityNav.this.f44087s0;
            F.m(hashMap);
            Stream stream = hashMap.entrySet().stream();
            final a aVar = new PropertyReference1Impl() { // from class: com.harman.jbl.partybox.ui.main.MainActivityNav.c.a
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.p
                @l3.e
                public Object get(@l3.e Object obj) {
                    return ((Map.Entry) obj).getValue();
                }
            };
            return Boolean.valueOf(!((List) stream.map(new Function() { // from class: com.harman.jbl.partybox.ui.main.i
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Object e4;
                    e4 = MainActivityNav.c.e(X2.l.this, obj);
                    return e4;
                }
            }).collect(Collectors.toList())).contains(device.u(com.harman.sdk.utils.d.f48503T)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d extends Lambda implements X2.l<HmDevice, Boolean> {
        d() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String e(X2.l tmp0, Object obj) {
            F.p(tmp0, "$tmp0");
            return (String) tmp0.C(obj);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Boolean C(@l3.d HmDevice device) {
            boolean W12;
            F.p(device, "device");
            Stream stream = MainActivityNav.this.f44086r0.stream();
            final a aVar = new MutablePropertyReference1Impl() { // from class: com.harman.jbl.partybox.ui.main.MainActivityNav.d.a
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.l
                public void W(@l3.e Object obj, @l3.e Object obj2) {
                    ((HmDevice) obj).k0((String) obj2);
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.p
                @l3.e
                public Object get(@l3.e Object obj) {
                    return ((HmDevice) obj).n();
                }
            };
            Object collect = stream.map(new Function() { // from class: com.harman.jbl.partybox.ui.main.j
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String e4;
                    e4 = MainActivityNav.d.e(X2.l.this, obj);
                    return e4;
                }
            }).collect(Collectors.toList());
            F.o(collect, "collect(...)");
            W12 = D.W1((Iterable) collect, device.u(com.harman.sdk.utils.d.f48503T));
            return Boolean.valueOf(!W12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<Boolean, H0> {
        e() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            F.m(bool);
            if (bool.booleanValue()) {
                MainActivityNav.this.n1();
            } else {
                MainActivityNav.this.b1();
            }
        }
    }

    @U({"SMAP\nMainActivityNav.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivityNav.kt\ncom/harman/jbl/partybox/ui/main/MainActivityNav$initView$4\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,468:1\n262#2,2:469\n262#2,2:471\n*S KotlinDebug\n*F\n+ 1 MainActivityNav.kt\ncom/harman/jbl/partybox/ui/main/MainActivityNav$initView$4\n*L\n162#1:469,2\n167#1:471,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class f implements TabLayout.f {
        f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@l3.e TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@l3.e TabLayout.i iVar) {
            int i4;
            if (iVar != null) {
                i4 = iVar.k();
            } else {
                i4 = 0;
            }
            if (i4 == 0) {
                MainActivityNav.this.f44088t0 = false;
                MainActivityNav.this.U0();
                TextView textView = MainActivityNav.this.f44079k0;
                if (textView != null) {
                    textView.setText(MainActivityNav.this.a1().u().get(i4).g(MainActivityNav.this));
                    return;
                }
                return;
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    MainActivityNav.this.f44088t0 = true;
                    CardView cardView = MainActivityNav.this.f44080l0;
                    if (cardView != null) {
                        cardView.setVisibility(8);
                    }
                    TextView textView2 = MainActivityNav.this.f44079k0;
                    if (textView2 != null) {
                        textView2.setText(MainActivityNav.this.a1().u().get(i4).g(MainActivityNav.this));
                        return;
                    }
                    return;
                }
                return;
            }
            com.harman.jbl.partybox.ui.party.b.f44881a.j(L1.a.f1521R0);
            TextView textView3 = MainActivityNav.this.f44079k0;
            if (textView3 != null) {
                textView3.setText("");
            }
            MainActivityNav.this.f44088t0 = true;
            CardView cardView2 = MainActivityNav.this.f44080l0;
            if (cardView2 != null) {
                cardView2.setVisibility(8);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@l3.e TabLayout.i iVar) {
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements X2.l<H0, H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            MainActivityNav mainActivityNav = MainActivityNav.this;
            mainActivityNav.m1(mainActivityNav);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class h implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f44109a;

        h(X2.l function) {
            F.p(function, "function");
            this.f44109a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f44109a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f44109a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public MainActivityNav() {
        super(j.i.f41486e);
        this.f44076h0 = ApplicationViewModelLazyKt.e(this, N.d(com.harman.jbl.partybox.a.class), new ApplicationViewModelLazyKt$applicationViewModels$1(this), new ApplicationViewModelLazyKt$applicationViewModels$2(this));
        this.f44077i0 = ApplicationViewModelLazyKt.e(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$1(this), new ApplicationViewModelLazyKt$applicationViewModels$2(this));
        final X2.a aVar = null;
        this.f44078j0 = new l0(N.d(p.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.main.MainActivityNav$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final p0 n() {
                p0 viewModelStore = ComponentActivity.this.getViewModelStore();
                F.o(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.main.MainActivityNav$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final m0.b n() {
                m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
                F.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        }, new X2.a<R.a>() { // from class: com.harman.jbl.partybox.ui.main.MainActivityNav$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X2.a
            @l3.d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final R.a n() {
                R.a aVar2;
                X2.a aVar3 = X2.a.this;
                if (aVar3 == null || (aVar2 = (R.a) aVar3.n()) == null) {
                    R.a l4 = this.l();
                    F.o(l4, "this.defaultViewModelCreationExtras");
                    return l4;
                }
                return aVar2;
            }
        });
        this.f44086r0 = new ArrayList<>();
        this.f44087s0 = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        String str;
        String str2;
        String str3;
        ImageView imageView;
        String str4;
        com.harman.log.f.a(f44074y0, "checkAndSelectWifiDevice called");
        if (!Z0().G()) {
            com.harman.log.f.a(f44074y0, "checkAndSelectWifiDevice return permission enable:" + Z0().G());
            return;
        }
        ViewPager2 viewPager2 = this.f44084p0;
        if (viewPager2 != null && viewPager2.getCurrentItem() == 0) {
            Stream<HmDevice> stream = this.f44086r0.stream();
            final c cVar = new c();
            List list = (List) stream.filter(new Predicate() { // from class: com.harman.jbl.partybox.ui.main.f
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean V02;
                    V02 = MainActivityNav.V0(X2.l.this, obj);
                    return V02;
                }
            }).collect(Collectors.toList());
            if (list.size() == 0) {
                com.harman.log.f.a(f44074y0, "updatedList:size:after compare:" + list.size());
                CardView cardView = this.f44080l0;
                if (cardView != null) {
                    cardView.setVisibility(8);
                    return;
                }
                return;
            }
            if (!this.f44088t0) {
                this.f44089u0 = (HmDevice) list.get(0);
                com.harman.log.f.a(f44074y0, "Display PRO device dialog for crcBTAddress : " + ((HmDevice) list.get(0)).u(com.harman.sdk.utils.d.f48503T) + " and name :" + ((HmDevice) list.get(0)).p());
                this.f44088t0 = true;
                Z0().g3(this.f44088t0);
                HmCustomFontTextView hmCustomFontTextView = this.f44082n0;
                String str5 = null;
                if (hmCustomFontTextView != null) {
                    HmDevice hmDevice = this.f44089u0;
                    if (hmDevice != null) {
                        str4 = hmDevice.q();
                    } else {
                        str4 = null;
                    }
                    hmCustomFontTextView.setText(com.harman.sdk.utils.d.o(str4));
                }
                HmDevice hmDevice2 = this.f44089u0;
                if (hmDevice2 != null) {
                    str = hmDevice2.q();
                } else {
                    str = null;
                }
                F.m(str);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                F.o(lowerCase, "toLowerCase(...)");
                HmDevice hmDevice3 = this.f44089u0;
                if (hmDevice3 != null) {
                    str2 = hmDevice3.o();
                } else {
                    str2 = null;
                }
                int r4 = com.harman.sdk.utils.d.r(this, lowerCase, str2);
                if (r4 != 0 && (imageView = this.f44083o0) != null) {
                    imageView.setImageResource(r4);
                }
                HmDevice hmDevice4 = this.f44089u0;
                if (hmDevice4 != null) {
                    str3 = hmDevice4.q();
                } else {
                    str3 = null;
                }
                com.harman.log.f.a(f44074y0, "selectedWifiDevice.getDevicePid() : " + str3);
                HmDevice hmDevice5 = this.f44089u0;
                if (hmDevice5 != null) {
                    str5 = hmDevice5.q();
                }
                com.harman.log.f.a(f44074y0, "selectedWifiDevice.getDevicePid() : " + str5);
                o1();
                HmDevice hmDevice6 = this.f44089u0;
                F.m(hmDevice6);
                k1(hmDevice6.q());
                return;
            }
            return;
        }
        com.harman.log.f.a(f44074y0, "checkAndSelectWifiDevice return not in home page");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean V0(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    private final void W0(boolean z3) {
        TabLayout.n nVar;
        TabLayout tabLayout = this.f44085q0;
        if (tabLayout != null) {
            int tabCount = tabLayout.getTabCount();
            ArrayList arrayList = new ArrayList(tabCount);
            for (int i4 = 0; i4 < tabCount; i4++) {
                TabLayout.i z4 = tabLayout.z(i4);
                if (z4 != null) {
                    nVar = z4.f33546i;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.setClickable(!z3);
                }
                arrayList.add(H0.f51801a);
            }
        }
    }

    private final com.harman.jbl.partybox.a X0() {
        return (com.harman.jbl.partybox.a) this.f44076h0.getValue();
    }

    private final o Z0() {
        return (o) this.f44077i0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p a1() {
        return (p) this.f44078j0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1() {
        TextView textView = this.f44079k0;
        if (textView != null) {
            q.c(textView);
        }
        W0(true);
        TabLayout tabLayout = this.f44085q0;
        if (tabLayout != null && tabLayout.getVisibility() == 0) {
            tabLayout.setVisibility(8);
            tabLayout.startAnimation(AnimationUtils.loadAnimation(this, j.a.f40569h));
        }
    }

    private final void c1() {
        HashMap<String, String> o4 = com.harman.jbl.partybox.persistence.a.o("preference_key_wifi_devices");
        F.m(o4);
        this.f44087s0 = o4;
        com.harman.log.f.a(f44074y0, "displayedWifiDeviceList is : " + o4);
        Z0().B1().k(this, new Q() { // from class: com.harman.jbl.partybox.ui.main.g
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                MainActivityNav.d1(MainActivityNav.this, (Boolean) obj);
            }
        });
        Z0().J1().k(this, new Q() { // from class: com.harman.jbl.partybox.ui.main.h
            @Override // androidx.lifecycle.Q
            public final void f(Object obj) {
                MainActivityNav.e1(MainActivityNav.this, (List) obj);
            }
        });
        Z0().W1().k(this, new h(new e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d1(MainActivityNav this$0, Boolean bool) {
        F.p(this$0, "this$0");
        com.harman.log.f.a(f44074y0, "getShowUltimateDevice= " + bool);
        F.m(bool);
        if (bool.booleanValue()) {
            this$0.U0();
            return;
        }
        this$0.f44088t0 = false;
        this$0.Z0().g3(this$0.f44088t0);
        CardView cardView = this$0.f44080l0;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(MainActivityNav this$0, List list) {
        F.p(this$0, "this$0");
        com.harman.log.f.a(f44074y0, "wifiHmDevices:size:" + list.size());
        if (list.isEmpty()) {
            return;
        }
        com.harman.log.f.a(f44074y0, "wifiDeviceList:size:" + this$0.f44086r0);
        if (this$0.f44086r0.size() != 0) {
            Stream stream = list.stream();
            final d dVar = new d();
            Object collect = stream.filter(new Predicate() { // from class: com.harman.jbl.partybox.ui.main.b
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean f12;
                    f12 = MainActivityNav.f1(X2.l.this, obj);
                    return f12;
                }
            }).collect(Collectors.toList());
            F.o(collect, "collect(...)");
            List list2 = (List) collect;
            if (list2.isEmpty()) {
                com.harman.log.f.a(f44074y0, "Wifi tempList:size:after compare" + list2.size());
                return;
            }
        }
        this$0.f44086r0.clear();
        this$0.f44086r0.addAll(list);
        if (F.g(this$0.Z0().B1().f(), Boolean.TRUE)) {
            this$0.U0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f1(X2.l tmp0, Object obj) {
        F.p(tmp0, "$tmp0");
        return ((Boolean) tmp0.C(obj)).booleanValue();
    }

    private final void g1() {
        this.f44079k0 = (TextView) findViewById(j.h.hi);
        this.f44080l0 = (CardView) findViewById(j.h.Kc);
        this.f44081m0 = (HmCustomFontTextView) findViewById(j.h.mi);
        this.f44082n0 = (HmCustomFontTextView) findViewById(j.h.ed);
        this.f44083o0 = (ImageView) findViewById(j.h.bd);
        CardView cardView = this.f44080l0;
        if (cardView != null) {
            cardView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.main.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivityNav.h1(MainActivityNav.this, view);
                }
            });
        }
        CardView cardView2 = this.f44080l0;
        if (cardView2 != null) {
            cardView2.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.main.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivityNav.i1(MainActivityNav.this, view);
                }
            });
        }
        ViewPager2 viewPager2 = (ViewPager2) findViewById(j.h.Cj);
        this.f44084p0 = viewPager2;
        if (viewPager2 != null) {
            viewPager2.setUserInputEnabled(false);
            viewPager2.setOffscreenPageLimit(3);
            viewPager2.setAdapter(new b(this));
        }
        TabLayout tabLayout = (TabLayout) findViewById(j.h.wg);
        this.f44085q0 = tabLayout;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicator(j.f.Za);
        }
        TabLayout tabLayout2 = this.f44085q0;
        if (tabLayout2 != null) {
            tabLayout2.d(new f());
        }
        TabLayout tabLayout3 = this.f44085q0;
        F.m(tabLayout3);
        ViewPager2 viewPager22 = this.f44084p0;
        F.m(viewPager22);
        new com.google.android.material.tabs.d(tabLayout3, viewPager22, new d.b() { // from class: com.harman.jbl.partybox.ui.main.e
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.i iVar, int i4) {
                MainActivityNav.j1(MainActivityNav.this, iVar, i4);
            }
        }).a();
        HmCustomFontTextView hmCustomFontTextView = this.f44081m0;
        if (hmCustomFontTextView != null) {
            hmCustomFontTextView.setText(j.m.f41679O1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(MainActivityNav this$0, View view) {
        F.p(this$0, "this$0");
        this$0.p1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i1(MainActivityNav this$0, View view) {
        F.p(this$0, "this$0");
        this$0.p1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j1(MainActivityNav this$0, TabLayout.i tab, int i4) {
        F.p(this$0, "this$0");
        F.p(tab, "tab");
        T1.a.a("on tab click:position:" + i4);
        tab.f33546i.setBackground(null);
        View childAt = tab.f33546i.getChildAt(0);
        F.n(childAt, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) childAt;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (i4 == 1) {
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        tab.w(this$0.a1().u().get(i4).f());
    }

    private final void k1(String str) {
        com.harman.log.f.a(f44074y0, "logProDeviceDetected called");
        Bundle bundle = new Bundle();
        bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.o(str));
        Z0().M(L1.a.f1654t2, bundle);
    }

    private final void l1() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f44091w0 <= 2000) {
            this.f44091w0 = 0L;
            finish();
        } else {
            this.f44091w0 = currentTimeMillis;
            Toast.makeText(this, j.m.f41816s0, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1() {
        TextView textView = this.f44079k0;
        if (textView != null) {
            q.i(textView);
        }
        W0(false);
        TabLayout tabLayout = this.f44085q0;
        if (tabLayout != null && tabLayout.getVisibility() != 0) {
            tabLayout.setVisibility(0);
            tabLayout.startAnimation(AnimationUtils.loadAnimation(this, j.a.f40570i));
        }
    }

    private final void o1() {
        CardView cardView = this.f44080l0;
        if (cardView != null) {
            cardView.setVisibility(0);
        }
        CardView cardView2 = this.f44080l0;
        if (cardView2 != null) {
            cardView2.clearAnimation();
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this, j.a.f40570i);
        CardView cardView3 = this.f44080l0;
        if (cardView3 != null) {
            cardView3.setAnimation(loadAnimation);
        }
        loadAnimation.start();
    }

    private final void p1() {
        Object obj;
        String str;
        com.harman.log.f.a(f44074y0, "wifiDeviceDialogClick");
        CardView cardView = this.f44080l0;
        if (cardView != null) {
            cardView.setVisibility(8);
        }
        HmDevice hmDevice = this.f44089u0;
        String str2 = null;
        if (hmDevice != null) {
            obj = hmDevice.u(com.harman.sdk.utils.d.f48503T);
        } else {
            obj = null;
        }
        if (obj != null) {
            str = (String) obj;
        } else {
            str = "";
        }
        this.f44087s0.put(str, str);
        com.harman.jbl.partybox.persistence.a.f42065a.G("preference_key_wifi_devices", str, str);
        this.f44088t0 = false;
        Z0().g3(this.f44088t0);
        Intent intent = new Intent(this, (Class<?>) RedirectionActivity.class);
        HmDevice hmDevice2 = this.f44089u0;
        if (hmDevice2 != null) {
            str2 = hmDevice2.q();
        }
        intent.putExtra("deviceName", com.harman.sdk.utils.d.o(str2));
        startActivity(intent);
    }

    public final int Y0() {
        ViewPager2 viewPager2 = this.f44084p0;
        if (viewPager2 != null) {
            return viewPager2.getCurrentItem();
        }
        return 0;
    }

    @Override // android.app.Activity
    public void finish() {
        com.harman.sdk.impl.connect.i c4;
        super.finish();
        f.b.a(com.harman.jbl.partylight.lib.f.f46571a.a(), null, 1, null);
        HmDevice k12 = Z0().k1();
        if (k12 != null && (c4 = com.harman.sdk.b.f47608a.c(k12)) != null) {
            c4.k(k12);
        }
    }

    public final void m1(@l3.d Activity activity) {
        F.p(activity, "activity");
        if (Build.VERSION.SDK_INT >= 31) {
            C0617b.J(activity, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, 1);
        } else {
            C0617b.J(activity, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, @l3.e Intent intent) {
        super.onActivityResult(i4, i5, intent);
        try {
            S().E0().get(0).getChildFragmentManager().E0().get(0).getChildFragmentManager().E0().get(S().E0().get(0).getChildFragmentManager().E0().get(0).getChildFragmentManager().E0().size() - 1);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        TabLayout tabLayout = this.f44085q0;
        if (tabLayout != null && tabLayout.getVisibility() == 0) {
            l1();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        try {
            startService(new Intent(this, (Class<?>) GeneralService.class));
        } catch (Exception e4) {
            T1.a.a("General Service is failed to run in background " + e4);
        }
        Z0().Z(this);
        com.harman.sdk.utils.f.a(this);
        Z0().v1().k(this, new h(new g()));
        g1();
        c1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onDestroy() {
        T1.a.a("MainActivityNav onDestroy called");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, @l3.d String[] permissions, @l3.d int[] grantResults) {
        F.p(permissions, "permissions");
        F.p(grantResults, "grantResults");
        super.onRequestPermissionsResult(i4, permissions, grantResults);
        if (i4 != 1 && i4 != 2) {
            if (i4 != 10001) {
                if (i4 != 10002) {
                    Z0().a2(this);
                    return;
                } else {
                    X0().D(this, permissions, grantResults);
                    return;
                }
            }
            X0().E(this, permissions, grantResults);
            return;
        }
        if (com.harman.sdk.b.f47608a.s()) {
            Z0().W2(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onResume() {
        super.onResume();
        String d4 = com.harman.jbl.partybox.persistence.a.f42065a.d("");
        if (!TextUtils.equals(this.f44090v0, d4) && !TextUtils.isEmpty(d4)) {
            this.f44090v0 = d4;
        }
    }
}
