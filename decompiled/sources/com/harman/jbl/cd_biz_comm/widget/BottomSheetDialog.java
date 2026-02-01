package com.harman.jbl.cd_biz_comm.widget;

import W2.n;
import X2.p;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.DialogFragment;
import com.harman.jbl.partylight.lib.g;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.H0;
import kotlin.W;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlinx.coroutines.C2269d0;
import kotlinx.coroutines.C2323l;
import m2.C2366f;

@E(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u00012BE\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f\u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f¢\u0006\u0004\b/\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/harman/jbl/cd_biz_comm/widget/BottomSheetDialog;", "Landroidx/fragment/app/DialogFragment;", "Lkotlin/H0;", "t0", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", com.google.android.gms.analytics.ecommerce.c.f27782c, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "k1", "Ljava/lang/CharSequence;", "contentText", "l1", "confirmText", "m1", "cancelText", "Lkotlin/Function0;", "n1", "LX2/a;", "onConfirm", "o1", "onCancel", "Lm2/f;", "p1", "Lkotlin/A;", "w0", "()Lm2/f;", "binding", "Landroid/graphics/drawable/BitmapDrawable;", "q1", "Landroid/graphics/drawable/BitmapDrawable;", "backgroundImage", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;LX2/a;LX2/a;)V", "Companion", "c", "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetDialog.kt\ncom/harman/jbl/cd_biz_comm/widget/BottomSheetDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: classes2.dex */
public final class BottomSheetDialog extends DialogFragment {

    @l3.d
    public static final c Companion = new c(null);
    public static final long POPUP_SHOW_DELAY = 200;

    /* renamed from: k1, reason: collision with root package name */
    @l3.d
    private final CharSequence f37941k1;

    /* renamed from: l1, reason: collision with root package name */
    @l3.d
    private final CharSequence f37942l1;

    /* renamed from: m1, reason: collision with root package name */
    @l3.d
    private final CharSequence f37943m1;

    /* renamed from: n1, reason: collision with root package name */
    @l3.d
    private final X2.a<H0> f37944n1;

    /* renamed from: o1, reason: collision with root package name */
    @l3.d
    private final X2.a<H0> f37945o1;

    /* renamed from: p1, reason: collision with root package name */
    @l3.d
    private final A f37946p1;

    /* renamed from: q1, reason: collision with root package name */
    private BitmapDrawable f37947q1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final a f37948F = new a();

        a() {
            super(0);
        }

        public final void c() {
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements X2.a<H0> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f37949F = new b();

        b() {
            super(0);
        }

        public final void c() {
        }

        @Override // X2.a
        public /* bridge */ /* synthetic */ H0 n() {
            c();
            return H0.f51801a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C2197u c2197u) {
            this();
        }

        @n
        @l3.d
        public final BottomSheetDialog a() {
            return new BottomSheetDialog(null, null, null, null, null, 31, null);
        }

        private c() {
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.a<C2366f> {
        d() {
            super(0);
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C2366f n() {
            return C2366f.c(BottomSheetDialog.this.getLayoutInflater());
        }
    }

    @kotlin.coroutines.jvm.internal.d(c = "com.harman.jbl.cd_biz_comm.widget.BottomSheetDialog$onViewCreated$1", f = "BottomSheetDialog.kt", i = {}, l = {ConstraintLayout.b.a.f9609h0}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes2.dex */
    static final class e extends SuspendLambda implements p<kotlinx.coroutines.U, kotlin.coroutines.c<? super H0>, Object> {

        /* renamed from: I, reason: collision with root package name */
        int f37951I;

        e(kotlin.coroutines.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.e
        public final Object D(@l3.d Object obj) {
            Object l4;
            l4 = kotlin.coroutines.intrinsics.b.l();
            int i4 = this.f37951I;
            if (i4 != 0) {
                if (i4 == 1) {
                    W.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                W.n(obj);
                this.f37951I = 1;
                if (C2269d0.b(200L, this) == l4) {
                    return l4;
                }
            }
            BottomSheetDialog.this.w0().f55117G.setVisibility(0);
            FrameLayout frameLayout = BottomSheetDialog.this.w0().f55116F;
            BitmapDrawable bitmapDrawable = BottomSheetDialog.this.f37947q1;
            if (bitmapDrawable == null) {
                F.S("backgroundImage");
                bitmapDrawable = null;
            }
            frameLayout.setBackground(bitmapDrawable);
            return H0.f51801a;
        }

        @Override // X2.p
        @l3.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object c0(@l3.d kotlinx.coroutines.U u3, @l3.e kotlin.coroutines.c<? super H0> cVar) {
            return ((e) v(u3, cVar)).D(H0.f51801a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l3.d
        public final kotlin.coroutines.c<H0> v(@l3.e Object obj, @l3.d kotlin.coroutines.c<?> cVar) {
            return new e(cVar);
        }
    }

    public BottomSheetDialog() {
        this(null, null, null, null, null, 31, null);
    }

    @n
    @l3.d
    public static final BottomSheetDialog newInstance() {
        return Companion.a();
    }

    private final void t0() {
        w0().f55118H.setText(this.f37941k1);
        w0().f55120J.setText(this.f37942l1);
        w0().f55119I.setText(this.f37943m1);
        w0().f55120J.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.cd_biz_comm.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetDialog.u0(BottomSheetDialog.this, view);
            }
        });
        w0().f55119I.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.cd_biz_comm.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetDialog.v0(BottomSheetDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u0(BottomSheetDialog this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
        this$0.f37944n1.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(BottomSheetDialog this$0, View view) {
        F.p(this$0, "this$0");
        this$0.dismissAllowingStateLoss();
        this$0.f37945o1.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2366f w0() {
        return (C2366f) this.f37946p1.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@l3.e Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, g.m.f47155b);
    }

    @Override // androidx.fragment.app.DialogFragment
    @l3.d
    public Dialog onCreateDialog(@l3.e Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        F.o(onCreateDialog, "onCreateDialog(...)");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            int f4 = C0669d.f(activity, g.c.f46637o);
            Window window = onCreateDialog.getWindow();
            if (window != null) {
                window.setNavigationBarColor(f4);
            }
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @l3.e
    public View onCreateView(@l3.d LayoutInflater inflater, @l3.e ViewGroup viewGroup, @l3.e Bundle bundle) {
        Resources resources;
        F.p(inflater, "inflater");
        ActivityC0889g activity = getActivity();
        if (activity != null) {
            resources = activity.getResources();
        } else {
            resources = null;
        }
        this.f37947q1 = new BitmapDrawable(resources, com.harman.jbl.cd_biz_comm.utils.a.f37864a.a(getActivity()));
        return w0().d();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        C2323l.f(androidx.lifecycle.F.a(this), null, null, new e(null), 3, null);
        t0();
    }

    public BottomSheetDialog(@l3.d CharSequence contentText, @l3.d CharSequence confirmText, @l3.d CharSequence cancelText, @l3.d X2.a<H0> onConfirm, @l3.d X2.a<H0> onCancel) {
        A a4;
        F.p(contentText, "contentText");
        F.p(confirmText, "confirmText");
        F.p(cancelText, "cancelText");
        F.p(onConfirm, "onConfirm");
        F.p(onCancel, "onCancel");
        this.f37941k1 = contentText;
        this.f37942l1 = confirmText;
        this.f37943m1 = cancelText;
        this.f37944n1 = onConfirm;
        this.f37945o1 = onCancel;
        a4 = C.a(new d());
        this.f37946p1 = a4;
    }

    public /* synthetic */ BottomSheetDialog(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, X2.a aVar, X2.a aVar2, int i4, C2197u c2197u) {
        this((i4 & 1) != 0 ? "" : charSequence, (i4 & 2) != 0 ? "" : charSequence2, (i4 & 4) == 0 ? charSequence3 : "", (i4 & 8) != 0 ? a.f37948F : aVar, (i4 & 16) != 0 ? b.f37949F : aVar2);
    }
}
