package com.harman.jbl.partylight.lib.main;

import X2.p;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.ActivityC0587e;
import androidx.fragment.app.DialogFragment;
import com.blankj.utilcode.util.C1078a;
import com.blankj.utilcode.util.E0;
import com.harman.jbl.partylight.lib.debug.DebugConfigActivity;
import com.harman.jbl.partylight.lib.g;
import com.harman.jbl.partylight.lib.main.PartyLightActivity;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.H0;
import kotlin.Result;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2323l;
import kotlinx.coroutines.L0;
import m2.C2361a;

@E(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0004J\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/harman/jbl/partylight/lib/main/PartyLightActivity;", "Landroidx/appcompat/app/e;", "Lkotlin/H0;", "H0", "()V", "L0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onBackPressed", "P0", "I0", "N0", "Q0", "", "errorText", "O0", "(Ljava/lang/CharSequence;)V", "Lm2/a;", "h0", "Lkotlin/A;", "J0", "()Lm2/a;", "binding", "Lcom/harman/jbl/partylight/lib/c;", "i0", "Lcom/harman/jbl/partylight/lib/c;", "groupObserver", "Landroidx/fragment/app/DialogFragment;", "j0", "K0", "()Landroidx/fragment/app/DialogFragment;", "loadingDialog", "Lkotlinx/coroutines/L0;", "k0", "Lkotlinx/coroutines/L0;", "showErrorJob", "<init>", "l0", "a", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nPartyLightActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyLightActivity.kt\ncom/harman/jbl/partylight/lib/main/PartyLightActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,170:1\n252#2:171\n*S KotlinDebug\n*F\n+ 1 PartyLightActivity.kt\ncom/harman/jbl/partylight/lib/main/PartyLightActivity\n*L\n91#1:171\n*E\n"})
/* loaded from: classes2.dex */
public final class PartyLightActivity extends ActivityC0587e {

    /* renamed from: l0, reason: collision with root package name */
    @l3.d
    public static final a f47212l0 = new a(null);

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    private static final String f47213m0;

    /* renamed from: n0, reason: collision with root package name */
    @l3.d
    public static final String f47214n0 = "EXTRACT_TARGET_GROUP";

    /* renamed from: h0, reason: collision with root package name */
    @l3.d
    private final A f47215h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.d
    private final com.harman.jbl.partylight.lib.c f47216i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.d
    private final A f47217j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.e
    private L0 f47218k0;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a() {
            return PartyLightActivity.f47213m0;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.a<C2361a> {
        b() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2361a n() {
            return C2361a.c(PartyLightActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.a<H0> {
        c() {
            super(0);
        }

        public final void c() {
            if (!com.harman.jbl.partylight.lib.core.e.a()) {
                PartyLightActivity.this.finish();
            }
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.a<DialogFragment> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f47221F = new d();

        d() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final DialogFragment n() {
            DialogFragment dialogFragment = new DialogFragment(g.h.f47011k);
            dialogFragment.setCancelable(false);
            dialogFragment.setStyle(0, g.m.f47156c);
            return dialogFragment;
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.partylight.lib.main.PartyLightActivity$showError$1", f = "PartyLightActivity.kt", i = {0, 0}, l = {com.harman.analytics.deviceAws.a.f37827j}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u243", "$this$invokeSuspend_u24lambda_u243_u24lambda_u242"}, s = {"L$1", "L$3"})
    @U({"SMAP\nPartyLightActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyLightActivity.kt\ncom/harman/jbl/partylight/lib/main/PartyLightActivity$showError$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,170:1\n31#2:171\n94#2,14:172\n*S KotlinDebug\n*F\n+ 1 PartyLightActivity.kt\ncom/harman/jbl/partylight/lib/main/PartyLightActivity$showError$1\n*L\n138#1:171\n138#1:172,14\n*E\n"})
    /* loaded from: classes2.dex */
    static final class e extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        Object f47222I;

        /* renamed from: J, reason: collision with root package name */
        Object f47223J;

        /* renamed from: K, reason: collision with root package name */
        Object f47224K;

        /* renamed from: L, reason: collision with root package name */
        Object f47225L;

        /* renamed from: M, reason: collision with root package name */
        int f47226M;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ CharSequence f47228O;

        @U({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 PartyLightActivity.kt\ncom/harman/jbl/partylight/lib/main/PartyLightActivity$showError$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,127:1\n98#2:128\n139#3,2:129\n97#4:131\n96#5:132\n*E\n"})
        /* loaded from: classes2.dex */
        public static final class a implements Animator.AnimatorListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LinearLayout f47229a;

            public a(LinearLayout linearLayout) {
                this.f47229a = linearLayout;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@l3.d Animator animator) {
                F.p(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@l3.d Animator animator) {
                F.p(animator, "animator");
                F.m(this.f47229a);
                com.harman.jbl.cd_biz_comm.utils.p.g(this.f47229a);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@l3.d Animator animator) {
                F.p(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@l3.d Animator animator) {
                F.p(animator, "animator");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence, kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
            this.f47228O = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b0(LinearLayout linearLayout, ValueAnimator valueAnimator) {
            float measuredHeight = linearLayout.getMeasuredHeight();
            Object animatedValue = valueAnimator.getAnimatedValue();
            F.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            linearLayout.setTranslationY(measuredHeight * ((Float) animatedValue).floatValue());
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            final LinearLayout d4;
            ValueAnimator valueAnimator;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f47226M;
            if (i4 != 0) {
                if (i4 == 1) {
                    valueAnimator = (ValueAnimator) this.f47225L;
                    d4 = (LinearLayout) this.f47223J;
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                d4 = PartyLightActivity.this.J0().f55077H.d();
                PartyLightActivity partyLightActivity = PartyLightActivity.this;
                partyLightActivity.J0().f55077H.f55059F.setText(this.f47228O);
                F.m(d4);
                com.harman.jbl.cd_biz_comm.utils.p.k(d4);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.harman.jbl.partylight.lib.main.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PartyLightActivity.e.b0(d4, valueAnimator2);
                    }
                });
                ofFloat.start();
                this.f47222I = d4;
                this.f47223J = d4;
                this.f47224K = ofFloat;
                this.f47225L = ofFloat;
                this.f47226M = 1;
                if (C2269d0.b(3000L, this) == l4) {
                    return l4;
                }
                valueAnimator = ofFloat;
            }
            valueAnimator.reverse();
            F.m(valueAnimator);
            valueAnimator.addListener(new a(d4));
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(this.f47228O, cVar);
        }
    }

    static {
        String simpleName = PartyLightActivity.class.getSimpleName();
        F.o(simpleName, "getSimpleName(...)");
        f47213m0 = simpleName;
    }

    public PartyLightActivity() {
        A a4;
        A a5;
        a4 = C.a(new b());
        this.f47215h0 = a4;
        this.f47216i0 = new com.harman.jbl.partylight.lib.c(null, new c(), null, null, 13, null);
        a5 = C.a(d.f47221F);
        this.f47217j0 = a5;
    }

    private final void H0() {
        boolean Q22;
        String packageName = getPackageName();
        F.o(packageName, "getPackageName(...)");
        Q22 = kotlin.text.A.Q2(packageName, "oneapp", true);
        if (Q22) {
            Configuration configuration = E0.a().getResources().getConfiguration();
            Resources resources = getResources();
            if (!F.g(configuration.locale.getLanguage(), resources.getConfiguration().locale.getLanguage())) {
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2361a J0() {
        return (C2361a) this.f47215h0.getValue();
    }

    private final DialogFragment K0() {
        return (DialogFragment) this.f47217j0.getValue();
    }

    private final void L0() {
        ImageView imageView = J0().f55075F;
        F.m(imageView);
        com.harman.jbl.cd_biz_comm.utils.p.f(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partylight.lib.main.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PartyLightActivity.M0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(View view) {
        C1078a.I0(DebugConfigActivity.class);
    }

    public final void I0() {
        try {
            Result.a aVar = Result.f51807F;
            K0().dismissAllowingStateLoss();
            Result.b(H0.f51801a);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            Result.b(W.a(th));
        }
    }

    public final void N0() {
        View vLock = J0().f55078I;
        F.o(vLock, "vLock");
        com.harman.jbl.cd_biz_comm.utils.p.k(vLock);
    }

    public final void O0(@l3.d CharSequence errorText) {
        L0 f4;
        F.p(errorText, "errorText");
        L0 l02 = this.f47218k0;
        if (l02 != null) {
            L0.a.b(l02, null, 1, null);
        }
        f4 = C2323l.f(androidx.lifecycle.F.a(this), null, null, new e(errorText, null), 3, null);
        this.f47218k0 = f4;
    }

    public final void P0() {
        try {
            Result.a aVar = Result.f51807F;
            K0().showNow(S(), null);
            Result.b(H0.f51801a);
        } catch (Throwable th) {
            Result.a aVar2 = Result.f51807F;
            Result.b(W.a(th));
        }
    }

    public final void Q0() {
        View vLock = J0().f55078I;
        F.o(vLock, "vLock");
        com.harman.jbl.cd_biz_comm.utils.p.f(vLock);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        View vLock = J0().f55078I;
        F.o(vLock, "vLock");
        if (vLock.getVisibility() == 0) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        H0();
        super.onCreate(bundle);
        setContentView(J0().d());
        L0();
        com.harman.jbl.partylight.lib.core.b.f46256F.p(this.f47216i0);
        com.harman.jbl.cd_biz_comm.logger.d.a(f47213m0, getResources().getConfiguration().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onDestroy() {
        com.harman.jbl.partylight.lib.core.e.f46285a = false;
        com.harman.jbl.partylight.lib.core.b.f46256F.r(this.f47216i0);
        super.onDestroy();
    }
}
