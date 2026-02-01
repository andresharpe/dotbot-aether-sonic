package com.harman.jbl.partylight.lib.dashboard;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.core.view.C0838o0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.navigation.I;
import com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment;
import com.harman.jbl.cd_biz_comm.widget.MatchWidthCardView;
import com.harman.jbl.cd_biz_comm.widget.MenuSwitchView;
import com.harman.jbl.cd_biz_comm.wireless_tech.type.PartyLightDevice;
import com.harman.jbl.partylight.lib.biz.AuracastMode;
import com.harman.jbl.partylight.lib.biz.Color;
import com.harman.jbl.partylight.lib.biz.LightInfo;
import com.harman.jbl.partylight.lib.dashboard.l;
import com.harman.jbl.partylight.lib.dashboard.widget.AuracastOpenDialogFragment;
import com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView;
import com.harman.jbl.partylight.lib.dashboard.widget.LightShowPanelView;
import com.harman.jbl.partylight.lib.dashboard.widget.MenuPartyBoxSwitchView;
import com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2;
import com.harman.jbl.partylight.lib.dashboard.widget.PartyLightGroupCountView;
import com.harman.jbl.partylight.lib.g;
import com.harman.jbl.partylight.lib.partystage.PartyStageTipsDialogFragment;
import j2.C2074a;
import java.util.List;
import java.util.Locale;
import k2.C2079b;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.collections.D;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.z;
import l2.C2355a;
import m2.x;

@E(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0010J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R+\u00104\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u000eR+\u00108\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u0010\u000e¨\u0006<"}, d2 = {"Lcom/harman/jbl/partylight/lib/dashboard/LightDashboardFragment;", "Lcom/harman/jbl/cd_biz_comm/base/BackDispatcherFragment;", "Lm2/o;", "Lcom/harman/jbl/partylight/lib/dashboard/b;", "state", "Lkotlin/H0;", "u0", "(Lcom/harman/jbl/partylight/lib/dashboard/b;)V", "Lcom/harman/jbl/partylight/lib/dashboard/q;", "x0", "(Lcom/harman/jbl/partylight/lib/dashboard/q;)V", "", "hasNew", "w0", "(Z)V", "J0", "()V", "Lcom/harman/jbl/partylight/lib/dashboard/a;", "v0", "(Lcom/harman/jbl/partylight/lib/dashboard/a;)V", "Lcom/harman/jbl/partylight/lib/dashboard/r;", "N0", "(Lcom/harman/jbl/partylight/lib/dashboard/r;)V", "K0", "createBinding", "()Lm2/o;", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "observeModel", "handleOnBackPressed", "", "fontID", "Landroid/graphics/Typeface;", "getResFontTypeface", "(I)Landroid/graphics/Typeface;", "Lcom/harman/jbl/partylight/lib/dashboard/m;", "P0", "Lkotlin/A;", "A0", "()Lcom/harman/jbl/partylight/lib/dashboard/m;", "viewModel", "<set-?>", "Q0", "LN1/b;", "y0", "()Z", "L0", "shownPartyLight", "R0", "z0", "M0", "shownPartyStage", "<init>", "Companion", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLightDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightDashboardFragment.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,398:1\n56#2,10:399\n*S KotlinDebug\n*F\n+ 1 LightDashboardFragment.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardFragment\n*L\n37#1:399,10\n*E\n"})
/* loaded from: classes2.dex */
public final class LightDashboardFragment extends BackDispatcherFragment<m2.o> {
    public static final int GROUP_MIN_NUM = 4;

    @l3.d
    public static final String TAG = "LightDashboardFragment";

    /* renamed from: P0, reason: collision with root package name */
    @l3.d
    private final A f46289P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.d
    private final N1.b f46290Q0;

    /* renamed from: R0, reason: collision with root package name */
    @l3.d
    private final N1.b f46291R0;

    /* renamed from: S0, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f46288S0 = {N.k(new MutablePropertyReference1Impl(LightDashboardFragment.class, "shownPartyLight", "getShownPartyLight()Z", 0)), N.k(new MutablePropertyReference1Impl(LightDashboardFragment.class, "shownPartyStage", "getShownPartyStage()Z", 0))};

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
    public static final class b implements MenuPartyBoxSwitchView.a {
        b() {
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuPartyBoxSwitchView.a
        public void a(boolean z3) {
            LightDashboardFragment.this.A0().S(z3);
            if (z3 && !LightDashboardFragment.this.y0()) {
                LightDashboardFragment.this.L0(true);
                AuracastOpenDialogFragment.Companion.a().show(LightDashboardFragment.this.getChildFragmentManager(), AuracastOpenDialogFragment.TAG);
            }
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuPartyBoxSwitchView.a
        public void b(@l3.e View view) {
            AuracastOpenDialogFragment.Companion.a().show(LightDashboardFragment.this.getChildFragmentManager(), AuracastOpenDialogFragment.TAG);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements LightColorSelectView.a {
        c() {
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView.a
        public void a(@l3.d Color color) {
            F.p(color, "color");
            LightDashboardFragment.this.A0().U(color);
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView.a
        public void b() {
            LightDashboardFragment.this.A0().Y();
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView.a
        public void c() {
            com.harman.jbl.partylight.lib.dashboard.a f4 = LightDashboardFragment.this.A0().I().f();
            F.m(f4);
            Color e4 = f4.e();
            PickerSelectDialogFragment.Companion.a(e4.i(), e4.h(), e4.g()).show(LightDashboardFragment.this.getChildFragmentManager(), PickerSelectDialogFragment.TAG);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements MenuSliderView2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m2.o f46298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LightDashboardFragment f46299b;

        d(m2.o oVar, LightDashboardFragment lightDashboardFragment) {
            this.f46298a = oVar;
            this.f46299b = lightDashboardFragment;
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2.a
        public void a(@l3.d SeekBar seekBar, int i4) {
            F.p(seekBar, "seekBar");
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2.a
        public void onStartTrackingTouch(@l3.d SeekBar seekBar) {
            F.p(seekBar, "seekBar");
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2.a
        public void onStopTrackingTouch(@l3.d SeekBar seekBar) {
            F.p(seekBar, "seekBar");
            this.f46298a.f55198Y.setSliderProgress(this.f46299b.A0().C(seekBar.getProgress()));
            this.f46299b.A0().W(seekBar.getProgress());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements MenuSliderView2.a {
        e() {
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2.a
        public void a(@l3.d SeekBar seekBar, int i4) {
            F.p(seekBar, "seekBar");
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2.a
        public void onStartTrackingTouch(@l3.d SeekBar seekBar) {
            F.p(seekBar, "seekBar");
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.MenuSliderView2.a
        public void onStopTrackingTouch(@l3.d SeekBar seekBar) {
            F.p(seekBar, "seekBar");
            LightDashboardFragment.this.A0().X(seekBar.getProgress());
        }
    }

    @U({"SMAP\nLightDashboardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightDashboardFragment.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardFragment$observeModel$10\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,398:1\n254#2,2:399\n*S KotlinDebug\n*F\n+ 1 LightDashboardFragment.kt\ncom/harman/jbl/partylight/lib/dashboard/LightDashboardFragment$observeModel$10\n*L\n234#1:399,2\n*E\n"})
    /* loaded from: classes2.dex */
    static final class f extends Lambda implements X2.l<Integer, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num);
            return H0.f51801a;
        }

        public final void c(Integer num) {
            PartyLightGroupCountView groupCountView = LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55186M;
            F.o(groupCountView, "groupCountView");
            F.m(num);
            int i4 = 0;
            boolean z3 = true;
            if (num.intValue() <= 1) {
                z3 = false;
            }
            if (!z3) {
                i4 = 8;
            }
            groupCountView.setVisibility(i4);
            LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55186M.L(LightDashboardFragment.this.A0().M().d(), num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    static final class g extends Lambda implements X2.l<com.harman.jbl.partylight.lib.dashboard.q, H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partylight.lib.dashboard.q qVar) {
            c(qVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partylight.lib.dashboard.q qVar) {
            LightDashboardFragment lightDashboardFragment = LightDashboardFragment.this;
            F.m(qVar);
            lightDashboardFragment.x0(qVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class h extends Lambda implements X2.l<com.harman.jbl.partylight.lib.dashboard.r, H0> {
        h() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partylight.lib.dashboard.r rVar) {
            c(rVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partylight.lib.dashboard.r rVar) {
            LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55191R.M(rVar.e(), rVar.f());
            LightDashboardFragment lightDashboardFragment = LightDashboardFragment.this;
            F.m(rVar);
            lightDashboardFragment.N0(rVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class i extends Lambda implements X2.l<List<? extends C2355a>, H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends C2355a> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<C2355a> list) {
            List<C2355a> Y5;
            m2.o access$getBinding = LightDashboardFragment.access$getBinding(LightDashboardFragment.this);
            LightShowPanelView lightShowPanelView = access$getBinding.f55194U;
            F.m(list);
            Y5 = D.Y5(list);
            lightShowPanelView.Y1(Y5);
            access$getBinding.f55194U.X1();
        }
    }

    /* loaded from: classes2.dex */
    static final class j extends Lambda implements X2.l<com.harman.jbl.partylight.lib.dashboard.a, H0> {
        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partylight.lib.dashboard.a aVar) {
            c(aVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partylight.lib.dashboard.a aVar) {
            LightDashboardFragment lightDashboardFragment = LightDashboardFragment.this;
            F.m(aVar);
            lightDashboardFragment.v0(aVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class k extends Lambda implements X2.l<Integer, H0> {
        k() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num);
            return H0.f51801a;
        }

        public final void c(Integer num) {
            MenuSliderView2 menuSliderView2 = LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55198Y;
            F.m(num);
            menuSliderView2.setSliderProgress(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    static final class l extends Lambda implements X2.l<Integer, H0> {
        l() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Integer num) {
            c(num);
            return H0.f51801a;
        }

        public final void c(Integer num) {
            MenuSliderView2 menuSliderView2 = LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55181H;
            F.m(num);
            menuSliderView2.setSliderProgress(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    static final class m extends Lambda implements X2.l<Boolean, H0> {
        m() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            MenuSwitchView menuSwitchView = LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55197X;
            F.m(bool);
            menuSwitchView.setSwitchValue(bool.booleanValue());
        }
    }

    /* loaded from: classes2.dex */
    static final class n extends Lambda implements X2.l<com.harman.jbl.partylight.lib.dashboard.b, H0> {
        n() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partylight.lib.dashboard.b bVar) {
            c(bVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partylight.lib.dashboard.b bVar) {
            if (bVar.e()) {
                MenuSwitchView backLight = LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55179F;
                F.o(backLight, "backLight");
                com.harman.jbl.cd_biz_comm.utils.p.k(backLight);
                LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55179F.setSwitchValue(bVar.f());
                return;
            }
            MenuSwitchView backLight2 = LightDashboardFragment.access$getBinding(LightDashboardFragment.this).f55179F;
            F.o(backLight2, "backLight");
            com.harman.jbl.cd_biz_comm.utils.p.f(backLight2);
        }
    }

    /* loaded from: classes2.dex */
    static final class o extends Lambda implements X2.l<com.harman.jbl.partylight.lib.dashboard.b, H0> {
        o() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(com.harman.jbl.partylight.lib.dashboard.b bVar) {
            c(bVar);
            return H0.f51801a;
        }

        public final void c(com.harman.jbl.partylight.lib.dashboard.b bVar) {
            LightDashboardFragment lightDashboardFragment = LightDashboardFragment.this;
            F.m(bVar);
            lightDashboardFragment.u0(bVar);
        }
    }

    /* loaded from: classes2.dex */
    static final class p extends Lambda implements X2.l<Boolean, H0> {
        p() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            LightDashboardFragment lightDashboardFragment = LightDashboardFragment.this;
            F.m(bool);
            lightDashboardFragment.w0(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class q extends Lambda implements X2.a<H0> {
        q() {
            super(0);
        }

        public final void c() {
            androidx.navigation.fragment.f.a(LightDashboardFragment.this).W(g.C0418g.f46853M0);
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class r implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f46313a;

        r(X2.l function) {
            F.p(function, "function");
            this.f46313a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f46313a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f46313a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class s extends FunctionReferenceImpl implements X2.a<Boolean> {
        s(Object obj) {
            super(0, obj, C2074a.class, "getAuracastPartyLight", "getAuracastPartyLight()Z", 0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.valueOf(((C2074a) this.f52262F).a());
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class t extends FunctionReferenceImpl implements X2.l<Boolean, H0> {
        t(Object obj) {
            super(1, obj, C2074a.class, "setAuracastPartyLight", "setAuracastPartyLight(Z)V", 0);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            C0(bool.booleanValue());
            return H0.f51801a;
        }

        public final void C0(boolean z3) {
            ((C2074a) this.f52262F).e(z3);
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class u extends FunctionReferenceImpl implements X2.a<Boolean> {
        u(Object obj) {
            super(0, obj, C2074a.class, "getShowStagePartyLight", "getShowStagePartyLight()Z", 0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final Boolean n() {
            return Boolean.valueOf(((C2074a) this.f52262F).c());
        }
    }

    /* loaded from: classes2.dex */
    /* synthetic */ class v extends FunctionReferenceImpl implements X2.l<Boolean, H0> {
        v(Object obj) {
            super(1, obj, C2074a.class, "setShowStagePartyLight", "setShowStagePartyLight(Z)V", 0);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            C0(bool.booleanValue());
            return H0.f51801a;
        }

        public final void C0(boolean z3) {
            ((C2074a) this.f52262F).g(z3);
        }
    }

    public LightDashboardFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partylight.lib.dashboard.LightDashboardFragment$special$$inlined$viewModels$default$1
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
        this.f46289P0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partylight.lib.dashboard.m.class), new X2.a<p0>() { // from class: com.harman.jbl.partylight.lib.dashboard.LightDashboardFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partylight.lib.dashboard.LightDashboardFragment$special$$inlined$viewModels$default$3
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
        C2074a c2074a = C2074a.f51023a;
        this.f46290Q0 = new N1.b(new s(c2074a), new t(c2074a));
        this.f46291R0 = new N1.b(new u(c2074a), new v(c2074a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partylight.lib.dashboard.m A0() {
        return (com.harman.jbl.partylight.lib.dashboard.m) this.f46289P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(LightDashboardFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(LightDashboardFragment this$0, View view) {
        F.p(this$0, "this$0");
        I b4 = com.harman.jbl.partylight.lib.dashboard.l.b();
        F.o(b4, "actionToBleOtaFragement(...)");
        com.harman.jbl.cd_biz_comm.utils.p.h(this$0, b4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(LightDashboardFragment this$0, boolean z3) {
        F.p(this$0, "this$0");
        this$0.A0().V(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(LightDashboardFragment this$0, View view) {
        F.p(this$0, "this$0");
        this$0.K0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(LightDashboardFragment this$0, int i4, C2355a c2355a) {
        F.p(this$0, "this$0");
        this$0.A0().R(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(LightDashboardFragment this$0, boolean z3) {
        F.p(this$0, "this$0");
        this$0.A0().T(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(LightDashboardFragment this$0, boolean z3) {
        F.p(this$0, "this$0");
        this$0.A0().Z(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(LightDashboardFragment this$0, View view) {
        F.p(this$0, "this$0");
        Boolean f4 = this$0.A0().L().f();
        F.m(f4);
        l.a a4 = com.harman.jbl.partylight.lib.dashboard.l.a(f4.booleanValue());
        F.o(a4, "actionDashboardfragmentT…tinformationfragment(...)");
        com.harman.jbl.cd_biz_comm.utils.p.h(this$0, a4);
    }

    private final void J0() {
        com.harman.jbl.cd_biz_comm.logger.a.a("LightDashboardFragment updateUIPage:UiPage.PRODUCT_LIST>>>3");
        com.harman.jbl.partylight.lib.main.c.a(this);
    }

    private final void K0() {
        com.harman.jbl.partylight.lib.dashboard.q f4 = A0().P().f();
        if (f4 != null) {
            if (f4.g()) {
                if (f4.h()) {
                    androidx.navigation.fragment.f.a(this).W(g.C0418g.f46858O);
                    return;
                }
                com.harman.jbl.partylight.lib.main.d a4 = com.harman.jbl.partylight.lib.main.e.a(this);
                if (a4 != null) {
                    a4.v(com.harman.jbl.partylight.lib.core.b.f46256F.i().size());
                }
                if (z0()) {
                    androidx.navigation.fragment.f.a(this).W(g.C0418g.f46853M0);
                    return;
                } else {
                    M0(true);
                    new PartyStageTipsDialogFragment(new q()).show(getChildFragmentManager(), PartyStageTipsDialogFragment.TAG);
                    return;
                }
            }
            new PartyStageTipsDialogFragment(null, 1, null).show(getChildFragmentManager(), PartyStageTipsDialogFragment.TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(boolean z3) {
        this.f46290Q0.b(this, f46288S0[0], Boolean.valueOf(z3));
    }

    private final void M0(boolean z3) {
        this.f46291R0.b(this, f46288S0[1], Boolean.valueOf(z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(com.harman.jbl.partylight.lib.dashboard.r rVar) {
        m2.o l02 = l0();
        if (rVar.e() == AuracastMode.OFF) {
            LinearLayout layoutNote = l02.f55190Q.f55041H;
            F.o(layoutNote, "layoutNote");
            com.harman.jbl.cd_biz_comm.utils.p.f(layoutNote);
            LightShowPanelView recycleViewColorLight = l02.f55194U;
            F.o(recycleViewColorLight, "recycleViewColorLight");
            com.harman.jbl.cd_biz_comm.utils.p.k(recycleViewColorLight);
            LightColorSelectView radioGroupCustom = l02.f55193T;
            F.o(radioGroupCustom, "radioGroupCustom");
            com.harman.jbl.cd_biz_comm.utils.p.k(radioGroupCustom);
            MenuSliderView2 speedControl = l02.f55198Y;
            F.o(speedControl, "speedControl");
            com.harman.jbl.cd_biz_comm.utils.p.k(speedControl);
            l02.f55185L.b();
            MenuSwitchView soundDetection = l02.f55197X;
            F.o(soundDetection, "soundDetection");
            com.harman.jbl.cd_biz_comm.utils.p.k(soundDetection);
            return;
        }
        LinearLayout layoutNote2 = l02.f55190Q.f55041H;
        F.o(layoutNote2, "layoutNote");
        com.harman.jbl.cd_biz_comm.utils.p.k(layoutNote2);
        LightShowPanelView recycleViewColorLight2 = l02.f55194U;
        F.o(recycleViewColorLight2, "recycleViewColorLight");
        com.harman.jbl.cd_biz_comm.utils.p.f(recycleViewColorLight2);
        LightColorSelectView radioGroupCustom2 = l02.f55193T;
        F.o(radioGroupCustom2, "radioGroupCustom");
        com.harman.jbl.cd_biz_comm.utils.p.f(radioGroupCustom2);
        MenuSliderView2 speedControl2 = l02.f55198Y;
        F.o(speedControl2, "speedControl");
        com.harman.jbl.cd_biz_comm.utils.p.f(speedControl2);
        l02.f55185L.a();
        MenuSwitchView soundDetection2 = l02.f55197X;
        F.o(soundDetection2, "soundDetection");
        com.harman.jbl.cd_biz_comm.utils.p.f(soundDetection2);
        if (rVar.e() == AuracastMode.ON_LINKED) {
            l02.f55190Q.f55042I.setText(getString(g.l.f47104b, MenuPartyBoxSwitchView.L(rVar.f())));
        } else {
            l02.f55190Q.f55042I.setText(getString(g.l.f47102a));
        }
    }

    public static final /* synthetic */ m2.o access$getBinding(LightDashboardFragment lightDashboardFragment) {
        return lightDashboardFragment.l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(com.harman.jbl.partylight.lib.dashboard.b bVar) {
        if (bVar.e()) {
            MenuSwitchView beamDanceMode = l0().f55180G;
            F.o(beamDanceMode, "beamDanceMode");
            com.harman.jbl.cd_biz_comm.utils.p.k(beamDanceMode);
            l0().f55180G.setSwitchValue(bVar.f());
            return;
        }
        MenuSwitchView beamDanceMode2 = l0().f55180G;
        F.o(beamDanceMode2, "beamDanceMode");
        com.harman.jbl.cd_biz_comm.utils.p.f(beamDanceMode2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(com.harman.jbl.partylight.lib.dashboard.a aVar) {
        Object f12;
        Drawable drawable;
        m2.o l02 = l0();
        int i4 = 0;
        if (aVar.f() == LightInfo.PatternLooping.COLOR_LOOP) {
            l02.f55193T.setCurrentLightRadioIndex(0);
        } else {
            int length = LightColorSelectView.f46426I.length;
            while (true) {
                if (i4 < length) {
                    Color.a aVar2 = Color.f46223H;
                    String str = LightColorSelectView.f46426I[i4];
                    F.o(str, "get(...)");
                    if (F.g(aVar2.b(str), aVar.e())) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 < 0) {
                l02.f55193T.setCurrentLightRadioIndex(new C2079b().f51789a.length - 1);
            } else {
                l02.f55193T.setCurrentLightRadioIndex(i4 + 1);
            }
        }
        if (aVar.f() != LightInfo.PatternLooping.COLOR_LOOP) {
            LightColorSelectView radioGroupCustom = l0().f55193T;
            F.o(radioGroupCustom, "radioGroupCustom");
            f12 = SequencesKt___SequencesKt.f1(C0838o0.e(radioGroupCustom));
            x a4 = x.a((View) f12);
            F.o(a4, "bind(...)");
            int rgb = android.graphics.Color.rgb(aVar.e().i(), aVar.e().h(), aVar.e().g());
            Context context = getContext();
            if (context != null) {
                drawable = context.getDrawable(g.e.f46769L);
            } else {
                drawable = null;
            }
            F.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(new int[]{rgb, rgb});
            int a5 = com.harman.jbl.cd_biz_comm.utils.k.a(getContext(), 36.0f);
            gradientDrawable.setSize(a5, a5);
            a4.f55256F.setImageDrawable(gradientDrawable);
            ImageView ivRadioPaint = a4.f55257G;
            F.o(ivRadioPaint, "ivRadioPaint");
            com.harman.jbl.cd_biz_comm.utils.p.k(ivRadioPaint);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(boolean z3) {
        if (z3) {
            CardView cvUpdate = l0().f55182I;
            F.o(cvUpdate, "cvUpdate");
            com.harman.jbl.cd_biz_comm.utils.p.k(cvUpdate);
            com.harman.jbl.cd_biz_comm.utils.p.k(l0().f55192S.getIndicator());
            MatchWidthCardView matchWidthCardView = l0().f55192S;
            String string = getString(g.l.f47078I0);
            F.o(string, "getString(...)");
            matchWidthCardView.setDesc(string);
        } else {
            CardView cvUpdate2 = l0().f55182I;
            F.o(cvUpdate2, "cvUpdate");
            com.harman.jbl.cd_biz_comm.utils.p.f(cvUpdate2);
            com.harman.jbl.cd_biz_comm.utils.p.f(l0().f55192S.getIndicator());
            MatchWidthCardView matchWidthCardView2 = l0().f55192S;
            String string2 = getString(g.l.f47107c0);
            F.o(string2, "getString(...)");
            matchWidthCardView2.setDesc(string2);
        }
        l0().f55192S.setHighlight(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(com.harman.jbl.partylight.lib.dashboard.q qVar) {
        if (qVar.f()) {
            MatchWidthCardView setUpStage = l0().f55196W;
            F.o(setUpStage, "setUpStage");
            com.harman.jbl.cd_biz_comm.utils.p.k(setUpStage);
        } else {
            MatchWidthCardView setUpStage2 = l0().f55196W;
            F.o(setUpStage2, "setUpStage");
            com.harman.jbl.cd_biz_comm.utils.p.f(setUpStage2);
        }
        if (qVar.g()) {
            com.harman.jbl.cd_biz_comm.utils.p.k(l0().f55196W.getIndicator());
        } else {
            com.harman.jbl.cd_biz_comm.utils.p.f(l0().f55196W.getIndicator());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0() {
        return ((Boolean) this.f46290Q0.a(this, f46288S0[0])).booleanValue();
    }

    private final boolean z0() {
        return ((Boolean) this.f46291R0.a(this, f46288S0[1])).booleanValue();
    }

    @l3.e
    public final Typeface getResFontTypeface(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return androidx.core.content.res.i.j(requireContext(), i4);
        }
        return Typeface.defaultFromStyle(0);
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void handleOnBackPressed() {
        J0();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void initView() {
        boolean s22;
        boolean s23;
        m2.o l02 = l0();
        l02.f55183J.f55031G.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LightDashboardFragment.B0(LightDashboardFragment.this, view);
            }
        });
        PartyLightDevice M3 = A0().M();
        String packageName = requireContext().getPackageName();
        F.o(packageName, "getPackageName(...)");
        Integer num = null;
        s22 = z.s2(packageName, "com.jbl.oneapp", false, 2, null);
        if (s22) {
            AppCompatTextView appCompatTextView = l02.f55183J.f55033I;
            String upperCase = M3.c().toUpperCase(Locale.ROOT);
            F.o(upperCase, "toUpperCase(...)");
            appCompatTextView.setText(upperCase);
            l02.f55183J.f55033I.setTextSize(0, getResources().getDimension(g.d.f46674M0));
            Typeface resFontTypeface = getResFontTypeface(g.f.f46815e);
            if (resFontTypeface != null) {
                l02.f55183J.f55033I.setTypeface(resFontTypeface);
            }
        } else {
            String packageName2 = requireContext().getPackageName();
            F.o(packageName2, "getPackageName(...)");
            s23 = z.s2(packageName2, "com.harmankardon.oneapp", false, 2, null);
            if (s23) {
                AppCompatTextView appCompatTextView2 = l02.f55183J.f55033I;
                String upperCase2 = M3.c().toUpperCase(Locale.ROOT);
                F.o(upperCase2, "toUpperCase(...)");
                appCompatTextView2.setText(upperCase2);
                l02.f55183J.f55033I.setTextSize(0, getResources().getDimension(g.d.f46674M0));
                Typeface resFontTypeface2 = getResFontTypeface(g.f.f46814d);
                if (resFontTypeface2 != null) {
                    l02.f55183J.f55033I.setTypeface(resFontTypeface2);
                }
            } else {
                l02.f55183J.f55033I.setText(M3.c());
            }
        }
        if (getContext() != null) {
            num = Integer.valueOf(j2.d.f51050a.a(M3.d()));
        }
        if (num != null) {
            l02.f55184K.setImageResource(num.intValue());
        }
        l02.f55196W.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LightDashboardFragment.E0(LightDashboardFragment.this, view);
            }
        });
        l02.f55191R.setOnSwitchChangedListener(new b());
        l02.f55194U.setOnLightShowListener(new LightShowPanelView.b() { // from class: com.harman.jbl.partylight.lib.dashboard.e
            @Override // com.harman.jbl.partylight.lib.dashboard.widget.LightShowPanelView.b
            public final void a(int i4, C2355a c2355a) {
                LightDashboardFragment.F0(LightDashboardFragment.this, i4, c2355a);
            }
        });
        l02.f55193T.a(new C2079b().f51789a);
        l02.f55193T.setOnLightColorSelectListener(new c());
        l02.f55198Y.setOnSliderValueChangedListener(new d(l02, this));
        l02.f55181H.setOnSliderValueChangedListener(new e());
        l02.f55198Y.O(!A0().M().v());
        l02.f55179F.setOnSwitchChangedListener(new MenuSwitchView.a() { // from class: com.harman.jbl.partylight.lib.dashboard.f
            @Override // com.harman.jbl.cd_biz_comm.widget.MenuSwitchView.a
            public final void a(boolean z3) {
                LightDashboardFragment.G0(LightDashboardFragment.this, z3);
            }
        });
        l02.f55197X.setOnSwitchChangedListener(new MenuSwitchView.a() { // from class: com.harman.jbl.partylight.lib.dashboard.g
            @Override // com.harman.jbl.cd_biz_comm.widget.MenuSwitchView.a
            public final void a(boolean z3) {
                LightDashboardFragment.H0(LightDashboardFragment.this, z3);
            }
        });
        l02.f55192S.setCardOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LightDashboardFragment.I0(LightDashboardFragment.this, view);
            }
        });
        l02.f55182I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.dashboard.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LightDashboardFragment.C0(LightDashboardFragment.this, view);
            }
        });
        l02.f55180G.setOnSwitchChangedListener(new MenuSwitchView.a() { // from class: com.harman.jbl.partylight.lib.dashboard.j
            @Override // com.harman.jbl.cd_biz_comm.widget.MenuSwitchView.a
            public final void a(boolean z3) {
                LightDashboardFragment.D0(LightDashboardFragment.this, z3);
            }
        });
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    public void observeModel() {
        super.observeModel();
        A0().Q().k(this, new r(new h()));
        A0().H().k(this, new r(new i()));
        A0().I().k(this, new r(new j()));
        A0().O().k(this, new r(new k()));
        A0().G().k(this, new r(new l()));
        A0().N().k(this, new r(new m()));
        A0().F().k(this, new r(new n()));
        A0().J().k(this, new r(new o()));
        A0().L().k(this, new r(new p()));
        A0().K().k(this, new r(new f()));
        A0().P().k(this, new r(new g()));
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        A0().D();
    }

    @Override // com.harman.jbl.cd_biz_comm.base.BackDispatcherFragment
    @l3.d
    public m2.o createBinding() {
        m2.o c4 = m2.o.c(getLayoutInflater());
        F.o(c4, "inflate(...)");
        return c4;
    }
}
