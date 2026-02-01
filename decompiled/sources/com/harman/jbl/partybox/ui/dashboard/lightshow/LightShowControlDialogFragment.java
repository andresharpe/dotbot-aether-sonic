package com.harman.jbl.partybox.ui.dashboard.lightshow;

import a2.AbstractC0557b;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.core.content.C0669d;
import androidx.core.view.C0838o0;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.InterfaceC0919v;
import androidx.lifecycle.Q;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c2.C1008a;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$3;
import com.harman.jbl.partybox.ApplicationViewModelLazyKt$applicationViewModels$4;
import com.harman.jbl.partybox.databinding.C1964z;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.ColorPickerView;
import com.harman.jbl.partybox.ui.widget.ForegroundMaskLayout;
import com.harman.jbl.partylight.lib.biz.Color;
import com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import com.harman.sdk.utils.LightPattern;
import java.util.Iterator;
import java.util.List;
import k2.C2079b;
import kotlin.A;
import kotlin.E;
import kotlin.H0;
import kotlin.InterfaceC2229v;
import kotlin.Pair;
import kotlin.W;
import kotlin.collections.D;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.U;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2323l;
import m2.x;

@E(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\bX\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\u0004J\u0019\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0004J-\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u0010/\u001a\u00020.2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u00020+2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0002H\u0016¢\u0006\u0004\b8\u0010\u0004R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010B\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006["}, d2 = {"Lcom/harman/jbl/partybox/ui/dashboard/lightshow/LightShowControlDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "I0", "()V", "E0", "", v.b.f7402d, "Landroid/graphics/drawable/Drawable;", "w0", "(I)Landroid/graphics/drawable/Drawable;", "Lcom/harman/sdk/utils/Color;", "u0", "(Lcom/harman/sdk/utils/Color;)V", "J0", "", "Lc2/a;", "currentList", "D0", "(Ljava/util/List;)V", "F0", "", "isChecked", "L0", "(Z)V", "A0", "Lcom/harman/sdk/utils/ColorMode;", "mode", "K0", "(Lcom/harman/sdk/utils/Color;Lcom/harman/sdk/utils/ColorMode;)V", "enabled", "y0", "z0", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onResume", "Lcom/harman/jbl/partybox/databinding/z;", "k1", "Lcom/harman/jbl/partybox/databinding/z;", "binding", "Lcom/harman/jbl/partybox/ui/main/o;", "l1", "Lkotlin/A;", "v0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/ui/dashboard/lightshow/f;", "m1", "x0", "()Lcom/harman/jbl/partybox/ui/dashboard/lightshow/f;", "viewModel", "Landroid/graphics/drawable/BitmapDrawable;", "n1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "Lcom/harman/jbl/partybox/utils/r;", "o1", "Lcom/harman/jbl/partybox/utils/r;", "viewUtils", "Lcom/harman/jbl/partybox/ui/lightshow/b;", "p1", "Lcom/harman/jbl/partybox/ui/lightshow/b;", "lightShowAdapter", "Lcom/harman/jbl/partybox/ui/dashboard/lightshow/a;", "q1", "Lcom/harman/jbl/partybox/ui/dashboard/lightshow/a;", "lightElementAdapter", "<init>", "Companion", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nLightShowControlDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LightShowControlDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/lightshow/LightShowControlDialogFragment\n+ 2 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,425:1\n66#2,4:426\n56#3,10:430\n1#4:440\n288#5,2:441\n*S KotlinDebug\n*F\n+ 1 LightShowControlDialogFragment.kt\ncom/harman/jbl/partybox/ui/dashboard/lightshow/LightShowControlDialogFragment\n*L\n55#1:426,4\n56#1:430,10\n254#1:441,2\n*E\n"})
/* loaded from: classes2.dex */
public final class LightShowControlDialogFragment extends DialogFragment {

    @l3.d
    public static final a Companion = new a(null);

    @l3.d
    public static final String EVENT_LIGHT_CARD_CHANGED_320 = "320_light_card_change_event_100";

    @l3.d
    public static final String TAG = "LightShowControlDialogFragment";

    /* renamed from: k1, reason: collision with root package name */
    @l3.e
    private C1964z f43240k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final A f43241l1 = ApplicationViewModelLazyKt.f(this, N.d(com.harman.jbl.partybox.ui.main.o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final A f43242m1;

    /* renamed from: n1, reason: collision with root package name */
    private BitmapDrawable f43243n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partybox.utils.r f43244o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.lightshow.b f43245p1;

    /* renamed from: q1, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.dashboard.lightshow.a f43246q1;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @W2.n
        @l3.d
        public final LightShowControlDialogFragment a() {
            return new LightShowControlDialogFragment();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.lightshow.LightShowControlDialogFragment$callUpdateColorCommand$1", f = "LightShowControlDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    public static final class b extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f43251I;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ Color f43253K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Color color, kotlin.coroutines.c<? super b> cVar) {
            super(2, cVar);
            this.f43253K = color;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f43251I == 0) {
                W.n(obj);
                LightShowControlDialogFragment.this.x0().B0(LightShowControlDialogFragment.this.v0().k1(), this.f43253K);
                LightShowControlDialogFragment.this.v0().b3(this.f43253K, ColorMode.STATIC_COLOR);
                return H0.f51801a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return new b(this.f43253K, cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements LightColorSelectView.a {
        c() {
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView.a
        public void a(@l3.d com.harman.jbl.partylight.lib.biz.Color colorValue) {
            F.p(colorValue, "colorValue");
            Color color = new Color(colorValue.i(), colorValue.h(), colorValue.g());
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "onLightColorSelected targetColor = " + color);
            LightShowControlDialogFragment.this.u0(color);
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView.a
        public void b() {
            ColorPickerView colorPickerView;
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "onLoopColorClicked");
            C1964z c1964z = LightShowControlDialogFragment.this.f43240k1;
            if (c1964z != null && (colorPickerView = c1964z.f40349F) != null) {
                colorPickerView.m();
            }
            LightShowControlDialogFragment.this.x0().I0(LightShowControlDialogFragment.this.v0().k1());
            LightShowControlDialogFragment.this.v0().b3(LightShowControlDialogFragment.this.x0().b0(), ColorMode.COLOR_LOOP);
        }

        @Override // com.harman.jbl.partylight.lib.dashboard.widget.LightColorSelectView.a
        public void c() {
            ForegroundMaskLayout foregroundMaskLayout;
            Switch r02;
            ColorPickerView colorPickerView;
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "onCustomColorClicked");
            C1964z c1964z = LightShowControlDialogFragment.this.f43240k1;
            TextView textView = null;
            if (c1964z != null) {
                foregroundMaskLayout = c1964z.f40352I;
            } else {
                foregroundMaskLayout = null;
            }
            if (foregroundMaskLayout != null) {
                foregroundMaskLayout.setVisibility(4);
            }
            C1964z c1964z2 = LightShowControlDialogFragment.this.f43240k1;
            if (c1964z2 != null) {
                r02 = c1964z2.f40357N;
            } else {
                r02 = null;
            }
            if (r02 != null) {
                r02.setVisibility(4);
            }
            C1964z c1964z3 = LightShowControlDialogFragment.this.f43240k1;
            if (c1964z3 != null) {
                colorPickerView = c1964z3.f40349F;
            } else {
                colorPickerView = null;
            }
            if (colorPickerView != null) {
                colorPickerView.setVisibility(0);
            }
            C1964z c1964z4 = LightShowControlDialogFragment.this.f43240k1;
            if (c1964z4 != null) {
                textView = c1964z4.f40358O;
            }
            if (textView != null) {
                textView.setText(LightShowControlDialogFragment.this.getString(j.m.f41822t1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class d implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ X2.l f43255a;

        d(X2.l function) {
            F.p(function, "function");
            this.f43255a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43255a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43255a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e extends Lambda implements X2.l<Color, H0> {

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ ColorPickerView f43257G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ColorPickerView colorPickerView) {
            super(1);
            this.f43257G = colorPickerView;
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Color color) {
            c(color);
            return H0.f51801a;
        }

        public final void c(@l3.d Color updatedColor) {
            LightColorSelectView lightColorSelectView;
            View d4;
            F.p(updatedColor, "updatedColor");
            LightShowControlDialogFragment.this.u0(updatedColor);
            this.f43257G.setColor(updatedColor);
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "setupColorPicker onColorSelected: " + updatedColor);
            Drawable w02 = LightShowControlDialogFragment.this.w0(android.graphics.Color.rgb(updatedColor.h(), updatedColor.g(), updatedColor.f()));
            int length = LightShowControlDialogFragment.this.x0().m0().f43310a.length;
            C1964z c1964z = LightShowControlDialogFragment.this.f43240k1;
            if (c1964z != null && (lightColorSelectView = c1964z.f40354K) != null && (d4 = C0838o0.d(lightColorSelectView, length - 1)) != null) {
                ViewGroup viewGroup = (ViewGroup) d4;
                View d5 = C0838o0.d(viewGroup, 0);
                F.n(d5, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) d5).setImageDrawable(w02);
                C0838o0.d(viewGroup, 1).setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class f extends Lambda implements X2.l<AbstractC0557b, H0> {
        f() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(AbstractC0557b abstractC0557b) {
            c(abstractC0557b);
            return H0.f51801a;
        }

        public final void c(@l3.d AbstractC0557b selectedElement) {
            F.p(selectedElement, "selectedElement");
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "LightElementCompactAdapter clicked value = " + selectedElement);
            LightShowControlDialogFragment.this.x0().u0(LightShowControlDialogFragment.this.v0().k1(), selectedElement);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class g extends Lambda implements X2.l<C1008a, H0> {
        g() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(C1008a c1008a) {
            c(c1008a);
            return H0.f51801a;
        }

        public final void c(@l3.d C1008a selectedLightShowCard) {
            F.p(selectedLightShowCard, "selectedLightShowCard");
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "LightShowAdapter clicked value = " + selectedLightShowCard);
            boolean z3 = true;
            com.harman.jbl.partybox.ui.main.o.f44128m1.h(true);
            LightShowControlDialogFragment.this.x0().v0(selectedLightShowCard, LightShowControlDialogFragment.this.v0().k1());
            com.harman.jbl.partybox.ui.main.o v02 = LightShowControlDialogFragment.this.v0();
            if (selectedLightShowCard.j() != LightPattern.CUSTOM) {
                z3 = false;
            }
            v02.Q2(z3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends RecyclerView.A {
        h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.A, androidx.recyclerview.widget.RecyclerView.s
        public boolean c(@l3.d RecyclerView rv, @l3.d MotionEvent e4) {
            F.p(rv, "rv");
            F.p(e4, "e");
            return LightShowControlDialogFragment.this.x0().q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class i extends Lambda implements X2.l<Pair<? extends Color, ? extends ColorMode>, H0> {
        i() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends Color, ? extends ColorMode> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<Color, ? extends ColorMode> pair) {
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "colorAndColorModeLiveData observe color = " + pair.e() + ", colorMode = " + pair.f());
            LightShowControlDialogFragment.this.K0(pair.e(), pair.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class j extends Lambda implements X2.l<Pair<? extends Color, ? extends ColorMode>, H0> {
        j() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Pair<? extends Color, ? extends ColorMode> pair) {
            c(pair);
            return H0.f51801a;
        }

        public final void c(Pair<Color, ? extends ColorMode> pair) {
            Color a4 = pair.a();
            ColorMode b4 = pair.b();
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "colorLiveData observe color = " + a4 + ", colorMode = " + b4);
            LightShowControlDialogFragment.this.K0(a4, b4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class k extends Lambda implements X2.l<Boolean, H0> {
        k() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            boolean z3;
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "isLightShowEnabled observe value = " + bool);
            LightShowControlDialogFragment lightShowControlDialogFragment = LightShowControlDialogFragment.this;
            F.m(bool);
            if (bool.booleanValue() && F.g(LightShowControlDialogFragment.this.v0().S1().f(), Boolean.FALSE)) {
                z3 = true;
            } else {
                z3 = false;
            }
            lightShowControlDialogFragment.y0(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class l extends Lambda implements X2.l<Boolean, H0> {
        l() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "cards observe value = " + bool);
            LightShowControlDialogFragment.this.y0(bool.booleanValue() ^ true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class m extends Lambda implements X2.l<List<? extends C1008a>, H0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partybox.ui.dashboard.lightshow.LightShowControlDialogFragment$setupObservers$4$1", f = "LightShowControlDialogFragment.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes2.dex */
        public static final class a extends SuspendLambda implements X2.p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

            /* renamed from: I, reason: collision with root package name */
            int f43266I;

            /* renamed from: J, reason: collision with root package name */
            final /* synthetic */ LightShowControlDialogFragment f43267J;

            /* renamed from: K, reason: collision with root package name */
            final /* synthetic */ List<C1008a> f43268K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LightShowControlDialogFragment lightShowControlDialogFragment, List<C1008a> list, kotlin.coroutines.c<? super a> cVar) {
                super(2, cVar);
                this.f43267J = lightShowControlDialogFragment;
                this.f43268K = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.e
            public final Object D(@l3.d Object obj) {
                Object l4;
                List Y5;
                l4 = kotlin.coroutines.intrinsics.b.l();
                int i4 = this.f43266I;
                if (i4 != 0) {
                    if (i4 == 1) {
                        W.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    W.n(obj);
                    this.f43266I = 1;
                    if (C2269d0.b(300L, this) == l4) {
                        return l4;
                    }
                }
                LightShowControlDialogFragment lightShowControlDialogFragment = this.f43267J;
                List<C1008a> cards = this.f43268K;
                F.o(cards, "$cards");
                Y5 = D.Y5(cards);
                lightShowControlDialogFragment.D0(Y5);
                return H0.f51801a;
            }

            @Override // X2.p
            @l3.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
                return ((a) v(u3, cVar)).D(H0.f51801a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l3.d
            public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
                return new a(this.f43267J, this.f43268K, cVar);
            }
        }

        m() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends C1008a> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<C1008a> list) {
            List Y5;
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "cards observe value = " + list);
            if (LightShowControlDialogFragment.this.isAdded()) {
                com.harman.jbl.partybox.ui.lightshow.b bVar = LightShowControlDialogFragment.this.f43245p1;
                if (bVar != null) {
                    F.m(list);
                    Y5 = D.Y5(list);
                    bVar.R(Y5);
                }
                C2323l.f(androidx.lifecycle.F.a(LightShowControlDialogFragment.this), null, null, new a(LightShowControlDialogFragment.this, list, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class n extends Lambda implements X2.l<Boolean, H0> {
        n() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.jbl.partybox.ui.lightshow.b bVar;
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "cardAnimation observe value = " + bool);
            if (LightShowControlDialogFragment.this.isAdded()) {
                F.m(bool);
                if (bool.booleanValue() && (bVar = LightShowControlDialogFragment.this.f43245p1) != null) {
                    bVar.Y();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class o extends Lambda implements X2.l<List<? extends AbstractC0557b>, H0> {
        o() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(List<? extends AbstractC0557b> list) {
            c(list);
            return H0.f51801a;
        }

        public final void c(List<? extends AbstractC0557b> list) {
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "lightElementList observe value = " + list);
            com.harman.jbl.partybox.ui.dashboard.lightshow.a aVar = LightShowControlDialogFragment.this.f43246q1;
            if (aVar != null) {
                F.m(list);
                aVar.S(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class p extends Lambda implements X2.l<Boolean, H0> {
        p() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            Switch r02;
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "mainSwitchLiveData observe value = " + bool);
            C1964z c1964z = LightShowControlDialogFragment.this.f43240k1;
            if (c1964z != null) {
                r02 = c1964z.f40357N;
            } else {
                r02 = null;
            }
            if (r02 != null) {
                F.m(bool);
                r02.setChecked(bool.booleanValue());
            }
            LightShowControlDialogFragment lightShowControlDialogFragment = LightShowControlDialogFragment.this;
            F.m(bool);
            lightShowControlDialogFragment.L0(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class q extends Lambda implements X2.l<Boolean, H0> {
        q() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "LightShowControlDialogFragment,isCustomLightShowEnabled reget data from ble");
            LightShowControlDialogFragment.this.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class r extends Lambda implements X2.l<Boolean, H0> {
        r() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(Boolean bool) {
            c(bool);
            return H0.f51801a;
        }

        public final void c(Boolean bool) {
            com.harman.log.f.a(LightShowControlDialogFragment.TAG, "lightInfoLiveData observe value = " + bool);
            HmDevice k12 = LightShowControlDialogFragment.this.v0().k1();
            if (k12 != null) {
                LightShowControlDialogFragment.this.x0().l0(k12);
            }
        }
    }

    public LightShowControlDialogFragment() {
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.dashboard.lightshow.LightShowControlDialogFragment$special$$inlined$viewModels$default$1
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
        this.f43242m1 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.dashboard.lightshow.f.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.dashboard.lightshow.LightShowControlDialogFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.dashboard.lightshow.LightShowControlDialogFragment$special$$inlined$viewModels$default$3
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
        this.f43244o1 = new com.harman.jbl.partybox.utils.r();
    }

    private final void A0() {
        LightColorSelectView lightColorSelectView;
        LightColorSelectView lightColorSelectView2;
        C1964z c1964z = this.f43240k1;
        if (c1964z != null && (lightColorSelectView2 = c1964z.f40354K) != null) {
            lightColorSelectView2.a(x0().m0().f43310a);
        }
        C1964z c1964z2 = this.f43240k1;
        if (c1964z2 != null) {
            lightColorSelectView = c1964z2.f40354K;
        } else {
            lightColorSelectView = null;
        }
        if (lightColorSelectView != null) {
            lightColorSelectView.setOnLightColorSelectListener(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(LightShowControlDialogFragment this$0) {
        ImageView imageView;
        FrameLayout frameLayout;
        F.p(this$0, "this$0");
        C1964z c1964z = this$0.f43240k1;
        BitmapDrawable bitmapDrawable = null;
        if (c1964z != null) {
            imageView = c1964z.f40351H;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        C1964z c1964z2 = this$0.f43240k1;
        if (c1964z2 != null) {
            frameLayout = c1964z2.f40350G;
        } else {
            frameLayout = null;
        }
        if (frameLayout != null) {
            BitmapDrawable bitmapDrawable2 = this$0.f43243n1;
            if (bitmapDrawable2 == null) {
                F.S("backgroundImage");
            } else {
                bitmapDrawable = bitmapDrawable2;
            }
            frameLayout.setBackground(bitmapDrawable);
        }
    }

    private final void C0() {
        HmDevice k12 = v0().k1();
        if (k12 != null) {
            x0().h0(k12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(List<C1008a> list) {
        Object obj;
        C1964z c1964z;
        RecyclerView recyclerView;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C1008a) obj).n()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1008a c1008a = (C1008a) obj;
        if (c1008a == null) {
            com.harman.log.f.a(TAG, "scrollToTargetPos no item selected");
            return;
        }
        int indexOf = list.indexOf(c1008a);
        if (indexOf >= 0 && (c1964z = this.f43240k1) != null && (recyclerView = c1964z.f40355L) != null) {
            recyclerView.O1(indexOf);
        }
    }

    private final void E0() {
        C1964z c1964z = this.f43240k1;
        if (c1964z != null) {
            ColorPickerView colorPickerView = c1964z.f40349F;
            colorPickerView.setListener(new e(colorPickerView));
        }
    }

    private final void F0() {
        RecyclerView recyclerView;
        final C1964z c1964z = this.f43240k1;
        if (c1964z != null) {
            c1964z.f40359P.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.lightshow.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LightShowControlDialogFragment.G0(C1964z.this, this, view);
                }
            });
            c1964z.f40357N.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.lightshow.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LightShowControlDialogFragment.H0(LightShowControlDialogFragment.this, view);
                }
            });
        }
        C1964z c1964z2 = this.f43240k1;
        if (c1964z2 != null && (recyclerView = c1964z2.f40356M) != null) {
            com.harman.jbl.partybox.ui.dashboard.lightshow.a aVar = new com.harman.jbl.partybox.ui.dashboard.lightshow.a(new f());
            this.f43246q1 = aVar;
            recyclerView.setAdapter(aVar);
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(C1964z this_apply, LightShowControlDialogFragment this$0, View view) {
        F.p(this_apply, "$this_apply");
        F.p(this$0, "this$0");
        if (this_apply.f40352I.getVisibility() != 8 && this_apply.f40352I.getVisibility() != 4) {
            this$0.dismiss();
            return;
        }
        this_apply.f40352I.setVisibility(0);
        this_apply.f40357N.setVisibility(0);
        this_apply.f40349F.setVisibility(8);
        this_apply.f40358O.setText(this$0.getString(j.m.f41817s1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(LightShowControlDialogFragment this$0, View view) {
        F.p(this$0, "this$0");
        F.n(view, "null cannot be cast to non-null type android.widget.Switch");
        boolean isChecked = ((Switch) view).isChecked();
        this$0.L0(isChecked);
        HmDevice k12 = this$0.v0().k1();
        if (k12 != null) {
            this$0.x0().J0(k12, isChecked);
        }
    }

    private final void I0() {
        String str;
        RecyclerView recyclerView;
        HmDevice k12 = v0().k1();
        if (k12 != null) {
            str = k12.q();
        } else {
            str = null;
        }
        com.harman.jbl.partybox.ui.lightshow.b bVar = new com.harman.jbl.partybox.ui.lightshow.b(str, new g());
        this.f43245p1 = bVar;
        C1964z c1964z = this.f43240k1;
        if (c1964z != null && (recyclerView = c1964z.f40355L) != null) {
            recyclerView.setAdapter(bVar);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.q(new h());
            recyclerView.setItemAnimator(null);
            recyclerView.n(new com.harman.jbl.partybox.ui.widget.p(0, 0, (int) recyclerView.getResources().getDimension(j.e.f40885q)));
        }
    }

    private final void J0() {
        v0().X0().k(getViewLifecycleOwner(), new d(new j()));
        v0().X1().k(getViewLifecycleOwner(), new d(new k()));
        v0().S1().k(getViewLifecycleOwner(), new d(new l()));
        x0().a0().k(getViewLifecycleOwner(), new d(new m()));
        x0().Z().k(getViewLifecycleOwner(), new d(new n()));
        x0().g0().k(getViewLifecycleOwner(), new d(new o()));
        x0().o0().k(getViewLifecycleOwner(), new d(new p()));
        v0().S1().k(getViewLifecycleOwner(), new d(new q()));
        x0().i0().k(getViewLifecycleOwner(), new d(new r()));
        x0().c0().k(getViewLifecycleOwner(), new d(new i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(Color color, ColorMode colorMode) {
        PartyBoxDevice partyBoxDevice;
        PartyBoxLightShowSettings h12;
        PartyBoxDevice partyBoxDevice2;
        LightPattern lightPattern;
        Object f12;
        PartyBoxLightShowSettings h13;
        PartyBoxDevice partyBoxDevice3;
        PartyBoxLightShowSettings h14;
        com.harman.log.f.a(TAG, "updateColorLoopDrawable color = " + color + ", mode = " + colorMode);
        C1964z c1964z = this.f43240k1;
        if (c1964z != null) {
            boolean z3 = false;
            boolean z4 = true;
            Object obj = null;
            if (colorMode == ColorMode.COLOR_LOOP) {
                com.harman.log.f.a(TAG, "updateColorLoopDrawable setCurrentLightRadioIndex(0)");
                LightColorSelectView lightColorSelectView = c1964z.f40354K;
                HmDevice k12 = v0().k1();
                if (k12 instanceof PartyBoxDevice) {
                    partyBoxDevice3 = (PartyBoxDevice) k12;
                } else {
                    partyBoxDevice3 = null;
                }
                if (partyBoxDevice3 != null && (h14 = partyBoxDevice3.h1()) != null) {
                    obj = h14.a();
                }
                if (obj == LightPattern.SWITCH) {
                    z4 = false;
                }
                lightColorSelectView.b(0, z4);
                return;
            }
            com.harman.jbl.partylight.lib.biz.Color color2 = new com.harman.jbl.partylight.lib.biz.Color(color.h(), color.g(), color.f());
            int length = LightColorSelectView.f46426I.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    Color.a aVar = com.harman.jbl.partylight.lib.biz.Color.f46223H;
                    String str = LightColorSelectView.f46426I[i4];
                    F.o(str, "get(...)");
                    if (F.g(aVar.b(str), color2)) {
                        break;
                    } else {
                        i4++;
                    }
                } else {
                    i4 = -1;
                    break;
                }
            }
            com.harman.log.f.a(TAG, "updateColorLoopDrawable setCurrentLightRadioIndex(" + i4 + ")");
            if (i4 < 0) {
                int length2 = new C2079b().f51789a.length - 1;
                LightColorSelectView lightColorSelectView2 = c1964z.f40354K;
                HmDevice k13 = v0().k1();
                if (k13 instanceof PartyBoxDevice) {
                    partyBoxDevice2 = (PartyBoxDevice) k13;
                } else {
                    partyBoxDevice2 = null;
                }
                if (partyBoxDevice2 != null && (h13 = partyBoxDevice2.h1()) != null) {
                    lightPattern = h13.a();
                } else {
                    lightPattern = null;
                }
                if (lightPattern != LightPattern.SWITCH) {
                    z3 = true;
                }
                lightColorSelectView2.b(length2, z3);
                c1964z.f40349F.setColor(color);
                LightColorSelectView radioGroupCustom = c1964z.f40354K;
                F.o(radioGroupCustom, "radioGroupCustom");
                f12 = SequencesKt___SequencesKt.f1(C0838o0.e(radioGroupCustom));
                x a4 = x.a((View) f12);
                F.o(a4, "bind(...)");
                int rgb = android.graphics.Color.rgb(color.h(), color.g(), color.f());
                Context context = getContext();
                if (context != null) {
                    obj = context.getDrawable(j.f.e8);
                }
                F.n(obj, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                GradientDrawable gradientDrawable = (GradientDrawable) obj;
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                gradientDrawable.setColors(new int[]{rgb, rgb});
                int a5 = com.harman.jbl.cd_biz_comm.utils.k.a(getContext(), 36.0f);
                gradientDrawable.setSize(a5, a5);
                a4.f55256F.setImageDrawable(gradientDrawable);
                ImageView ivRadioPaint = a4.f55257G;
                F.o(ivRadioPaint, "ivRadioPaint");
                com.harman.jbl.cd_biz_comm.utils.p.k(ivRadioPaint);
                return;
            }
            int i5 = i4 + 1;
            LightColorSelectView lightColorSelectView3 = c1964z.f40354K;
            HmDevice k14 = v0().k1();
            if (k14 instanceof PartyBoxDevice) {
                partyBoxDevice = (PartyBoxDevice) k14;
            } else {
                partyBoxDevice = null;
            }
            if (partyBoxDevice != null && (h12 = partyBoxDevice.h1()) != null) {
                obj = h12.a();
            }
            if (obj != LightPattern.SWITCH) {
                z3 = true;
            }
            lightColorSelectView3.b(i5, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(boolean z3) {
        C1964z c1964z = this.f43240k1;
        if (c1964z != null) {
            if (z3) {
                c1964z.f40352I.b();
            } else {
                c1964z.f40352I.a();
            }
        }
    }

    @W2.n
    @l3.d
    public static final LightShowControlDialogFragment newInstance() {
        return Companion.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(com.harman.sdk.utils.Color color) {
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new b(color, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.main.o v0() {
        return (com.harman.jbl.partybox.ui.main.o) this.f43241l1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Drawable w0(int i4) {
        Drawable drawable;
        Context context = getContext();
        if (context != null) {
            drawable = context.getDrawable(j.f.e8);
        } else {
            drawable = null;
        }
        F.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setColors(new int[]{i4, i4});
        int a4 = com.harman.jbl.partybox.utils.j.a(getContext(), 36.0f);
        gradientDrawable.setSize(a4, a4);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.harman.jbl.partybox.ui.dashboard.lightshow.f x0() {
        return (com.harman.jbl.partybox.ui.dashboard.lightshow.f) this.f43242m1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(boolean z3) {
        Pair<com.harman.sdk.utils.Color, ColorMode> f4;
        if (z3 && (f4 = v0().X0().f()) != null) {
            K0(f4.e(), f4.f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0() {
        HmDevice k12 = v0().k1();
        if (k12 != null) {
            x0().j0(k12);
            x0().l0(k12);
            x0().e0(k12);
            x0().n0(k12);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@l3.d Context context) {
        F.p(context, "context");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, j.n.f41884f);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, j.d.f40732a);
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setNavigationBarColor(f4);
            }
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        Resources resources;
        F.p(inflater, "inflater");
        this.f43240k1 = C1964z.c(inflater);
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f43243n1 = new BitmapDrawable(resources, com.harman.jbl.partybox.utils.d.f46171a.b(getActivity()));
        C1964z c1964z = this.f43240k1;
        if (c1964z == null) {
            return null;
        }
        return c1964z.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        com.harman.log.f.a(TAG, "page: onViewCreated");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.dashboard.lightshow.c
            @Override // java.lang.Runnable
            public final void run() {
                LightShowControlDialogFragment.B0(LightShowControlDialogFragment.this);
            }
        }, 200L);
        J0();
        I0();
        F0();
        A0();
        E0();
        z0();
        C0();
    }
}
