package com.harman.jbl.partylight.lib.dashboard.widget;

import W2.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.InterfaceC0578v;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.C1101l0;
import com.harman.jbl.cd_biz_comm.utils.p;
import com.harman.jbl.partylight.lib.g;
import java.util.Iterator;
import java.util.List;
import kotlin.A;
import kotlin.C;
import kotlin.E;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import l3.e;

@E(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002[\\B'\b\u0007\u0012\u0006\u0010U\u001a\u00020T\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V\u0012\b\b\u0002\u0010X\u001a\u00020\u0003¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u0007J\u0017\u0010\u001f\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b\u001f\u0010\u0007J\u0011\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010=R\u0014\u0010D\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\bC\u0010=R\u0014\u0010F\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u0010=R\u0014\u0010H\u001a\u00020\u00038\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010=R\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00104R$\u0010S\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010\u0007¨\u0006]"}, d2 = {"Lcom/harman/jbl/partylight/lib/dashboard/widget/MenuSliderView2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "", "progress", "Lkotlin/H0;", "M", "(I)V", "Landroid/widget/SeekBar;", "seekBar", "", "fromUser", "onProgressChanged", "(Landroid/widget/SeekBar;IZ)V", "onStartTrackingTouch", "(Landroid/widget/SeekBar;)V", "onStopTrackingTouch", "", "warningTip", "P", "(ILjava/lang/String;)V", "N", "()V", "enable", "O", "(Z)V", "title", "setSliderTitle", "(Ljava/lang/String;)V", "resId", "setSliderLeftIcon", "setSliderRightIcon", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/harman/jbl/partylight/lib/dashboard/widget/MenuSliderView2$a;", "p0", "Lcom/harman/jbl/partylight/lib/dashboard/widget/MenuSliderView2$a;", "getOnSliderValueChangedListener", "()Lcom/harman/jbl/partylight/lib/dashboard/widget/MenuSliderView2$a;", "setOnSliderValueChangedListener", "(Lcom/harman/jbl/partylight/lib/dashboard/widget/MenuSliderView2$a;)V", "onSliderValueChangedListener", "q0", "Ljava/lang/Integer;", "warningProgress", "r0", "Ljava/lang/String;", "s0", "Z", "debugMode", "Lm2/E;", "t0", "Lkotlin/A;", "getBinding", "()Lm2/E;", "binding", "u0", "I", "INDEX_BG", "v0", "INDEX_PROGRESS", "w0", "INDEX_INDICATOR1", "x0", "INDEX_INDICATOR2", "y0", "INDEX_INDICATOR3", "z0", "INDEX_WARNING", "Landroid/graphics/drawable/LayerDrawable;", "A0", "Landroid/graphics/drawable/LayerDrawable;", "progressDrawable", "B0", "isEnableAvgIndicator", "value", "getSliderProgress", "()I", "setSliderProgress", "sliderProgress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", com.harman.log.b.f47574c, "partylightLib_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nMenuSliderView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuSliderView2.kt\ncom/harman/jbl/partylight/lib/dashboard/widget/MenuSliderView2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n254#2,2:188\n1855#3,2:190\n*S KotlinDebug\n*F\n+ 1 MenuSliderView2.kt\ncom/harman/jbl/partylight/lib/dashboard/widget/MenuSliderView2\n*L\n64#1:188,2\n142#1:190,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MenuSliderView2 extends ConstraintLayout implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: A0, reason: collision with root package name */
    @l3.d
    private LayerDrawable f46448A0;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f46449B0;

    /* renamed from: p0, reason: collision with root package name */
    @e
    private a f46450p0;

    /* renamed from: q0, reason: collision with root package name */
    @e
    private Integer f46451q0;

    /* renamed from: r0, reason: collision with root package name */
    @l3.d
    private String f46452r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f46453s0;

    /* renamed from: t0, reason: collision with root package name */
    @l3.d
    private final A f46454t0;

    /* renamed from: u0, reason: collision with root package name */
    private final int f46455u0;

    /* renamed from: v0, reason: collision with root package name */
    private final int f46456v0;

    /* renamed from: w0, reason: collision with root package name */
    private final int f46457w0;

    /* renamed from: x0, reason: collision with root package name */
    private final int f46458x0;

    /* renamed from: y0, reason: collision with root package name */
    private final int f46459y0;

    /* renamed from: z0, reason: collision with root package name */
    private final int f46460z0;

    /* loaded from: classes2.dex */
    public interface a {
        void a(@l3.d SeekBar seekBar, int i4);

        void onStartTrackingTouch(@l3.d SeekBar seekBar);

        void onStopTrackingTouch(@l3.d SeekBar seekBar);
    }

    /* loaded from: classes2.dex */
    public static final class b extends View.BaseSavedState {

        /* renamed from: E, reason: collision with root package name */
        private int f46461E;

        public b(@e Parcelable parcelable) {
            super(parcelable);
        }

        public final int a() {
            return this.f46461E;
        }

        public final void b(int i4) {
            this.f46461E = i4;
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.a<m2.E> {

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Context f46462F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ MenuSliderView2 f46463G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, MenuSliderView2 menuSliderView2) {
            super(0);
            this.f46462F = context;
            this.f46463G = menuSliderView2;
        }

        @Override // X2.a
        @l3.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final m2.E n() {
            return m2.E.a(LayoutInflater.from(this.f46462F).inflate(g.h.f46995E, this.f46463G));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public MenuSliderView2(@l3.d Context context) {
        this(context, null, 0, 6, null);
        F.p(context, "context");
    }

    private final void M(int i4) {
        Integer num = this.f46451q0;
        if (num != null) {
            F.m(num);
            if (i4 > num.intValue()) {
                this.f46448A0.getDrawable(this.f46456v0).setTint(-169913);
                TextView tvWarningTip = getBinding().f55052K;
                F.o(tvWarningTip, "tvWarningTip");
                p.k(tvWarningTip);
                getBinding().f55052K.setText(this.f46452r0);
                return;
            }
        }
        this.f46448A0.getDrawable(this.f46456v0).setTint(-11450395);
        TextView tvWarningTip2 = getBinding().f55052K;
        F.o(tvWarningTip2, "tvWarningTip");
        p.f(tvWarningTip2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(Parcelable parcelable, MenuSliderView2 this$0) {
        b bVar;
        F.p(this$0, "this$0");
        if (parcelable instanceof b) {
            bVar = (b) parcelable;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            this$0.getBinding().f55049H.setProgress(bVar.a());
        }
    }

    private final m2.E getBinding() {
        return (m2.E) this.f46454t0.getValue();
    }

    public final void N() {
        this.f46451q0 = null;
        this.f46448A0.getDrawable(this.f46460z0).setAlpha(0);
        M(getBinding().f55049H.getProgress());
    }

    public final void O(boolean z3) {
        List O3;
        int i4;
        this.f46449B0 = z3;
        LayerDrawable layerDrawable = this.f46448A0;
        O3 = CollectionsKt__CollectionsKt.O(Integer.valueOf(this.f46457w0), Integer.valueOf(this.f46458x0), Integer.valueOf(this.f46459y0));
        Iterator it = O3.iterator();
        while (it.hasNext()) {
            Drawable drawable = layerDrawable.getDrawable(((Number) it.next()).intValue());
            if (z3) {
                i4 = 255;
            } else {
                i4 = 0;
            }
            drawable.setAlpha(i4);
        }
    }

    public final void P(int i4, @l3.d String warningTip) {
        F.p(warningTip, "warningTip");
        this.f46451q0 = Integer.valueOf(i4);
        this.f46452r0 = warningTip;
        Drawable mutate = C1101l0.f(g.e.f46770M).mutate();
        F.n(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) mutate;
        layerDrawable.setLayerInsetStart(5, (int) (this.f46448A0.getDrawable(this.f46455u0).getBounds().width() * (i4 / getBinding().f55049H.getMax())));
        getBinding().f55049H.setProgressDrawable(layerDrawable);
        this.f46448A0 = layerDrawable;
        O(this.f46449B0);
        M(getBinding().f55049H.getProgress());
    }

    @e
    public final a getOnSliderValueChangedListener() {
        return this.f46450p0;
    }

    public final int getSliderProgress() {
        return getBinding().f55049H.getProgress();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(@l3.d SeekBar seekBar, int i4, boolean z3) {
        a aVar;
        F.p(seekBar, "seekBar");
        M(i4);
        if (z3 && (aVar = this.f46450p0) != null) {
            F.m(aVar);
            aVar.a(seekBar, i4);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(@e final Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        post(new Runnable() { // from class: com.harman.jbl.partylight.lib.dashboard.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                MenuSliderView2.Q(parcelable, this);
            }
        });
    }

    @Override // android.view.View
    @e
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.b(getSliderProgress());
        return bVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(@l3.d SeekBar seekBar) {
        F.p(seekBar, "seekBar");
        a aVar = this.f46450p0;
        if (aVar != null) {
            F.m(aVar);
            aVar.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(@l3.d SeekBar seekBar) {
        F.p(seekBar, "seekBar");
        a aVar = this.f46450p0;
        if (aVar != null) {
            F.m(aVar);
            aVar.onStopTrackingTouch(seekBar);
        }
    }

    public final void setOnSliderValueChangedListener(@e a aVar) {
        this.f46450p0 = aVar;
    }

    public final void setSliderLeftIcon(@InterfaceC0578v int i4) {
        getBinding().f55047F.setImageResource(i4);
    }

    public final void setSliderProgress(int i4) {
        if (this.f46453s0) {
            int i5 = i4 - (i4 % 5);
            getBinding().f55049H.setProgress(i5, true);
            getBinding().f55051J.setText(String.valueOf(i5));
            return;
        }
        getBinding().f55049H.setProgress(i4, true);
    }

    public final void setSliderRightIcon(@InterfaceC0578v int i4) {
        getBinding().f55048G.setImageResource(i4);
    }

    public final void setSliderTitle(@e String str) {
        getBinding().f55050I.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public MenuSliderView2(@l3.d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        F.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @j
    public MenuSliderView2(@l3.d Context context, @e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        A a4;
        F.p(context, "context");
        this.f46452r0 = "";
        a4 = C.a(new c(context, this));
        this.f46454t0 = a4;
        this.f46456v0 = 1;
        this.f46457w0 = 2;
        this.f46458x0 = 3;
        this.f46459y0 = 4;
        this.f46460z0 = 5;
        getBinding().f55049H.setOnSeekBarChangeListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.n.f47169C);
        F.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setSliderTitle(obtainStyledAttributes.getString(g.n.f47176J));
        setSliderLeftIcon(obtainStyledAttributes.getResourceId(g.n.f47171E, g.e.f46764G));
        setSliderRightIcon(obtainStyledAttributes.getResourceId(g.n.f47174H, g.e.f46764G));
        int i5 = obtainStyledAttributes.getInt(g.n.f47172F, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(g.n.f47170D, false);
        TextView tvSliderValue = getBinding().f55051J;
        F.o(tvSliderValue, "tvSliderValue");
        tvSliderValue.setVisibility(z3 ? 0 : 8);
        this.f46453s0 = z3;
        setSliderProgress(i5);
        Drawable drawable = obtainStyledAttributes.getDrawable(g.n.f47175I);
        if (drawable != null) {
            getBinding().f55049H.setThumb(drawable);
        }
        obtainStyledAttributes.recycle();
        Drawable mutate = getBinding().f55049H.getProgressDrawable().mutate();
        F.n(mutate, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        this.f46448A0 = (LayerDrawable) mutate;
        O(false);
        N();
    }

    public /* synthetic */ MenuSliderView2(Context context, AttributeSet attributeSet, int i4, int i5, C2197u c2197u) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }
}
