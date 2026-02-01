package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.model.ClickEventType;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.OneTouchMusicButtonSettings;
import kotlin.E;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

@E(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b%\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b%\u0010(B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b%\u0010+J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\nR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006."}, d2 = {"Lcom/harman/jbl/partybox/ui/customviews/HmTriggerCustomizationCard;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Lkotlin/H0;", com.harman.log.b.f47574c, "(Landroid/content/Context;)V", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "c", "(Landroid/view/View;)V", "Lcom/harman/jbl/partybox/ui/widget/q;", "onActionListener", "setOnActionListener", "(Lcom/harman/jbl/partybox/ui/widget/q;)V", "Lcom/harman/sdk/device/HmDevice;", "mainDevice", "setViewDetails", "(Lcom/harman/sdk/device/HmDevice;)V", androidx.exifinterface.media.a.U4, "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "Landroid/widget/ImageView;", "F", "Landroid/widget/ImageView;", "lightImageView", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "G", "Lcom/harman/jbl/partybox/ui/customviews/HmCustomFontTextView;", "buttonTextView", "H", "actionTextView", "I", "Lcom/harman/jbl/partybox/ui/widget/q;", "mOnActionListener", "<init>", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "J", "a", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class HmTriggerCustomizationCard extends RelativeLayout {

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    public static final a f42591J = new a(null);

    /* renamed from: K, reason: collision with root package name */
    @l3.d
    public static final String f42592K = "HmTriggerCustomizationCard";

    /* renamed from: E, reason: collision with root package name */
    public View f42593E;

    /* renamed from: F, reason: collision with root package name */
    @l3.e
    private ImageView f42594F;

    /* renamed from: G, reason: collision with root package name */
    @l3.e
    private HmCustomFontTextView f42595G;

    /* renamed from: H, reason: collision with root package name */
    @l3.e
    private HmCustomFontTextView f42596H;

    /* renamed from: I, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.widget.q f42597I;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public HmTriggerCustomizationCard(@l3.e Context context) {
        super(context);
        b(context);
    }

    private final void b(Context context) {
        View inflate = LayoutInflater.from(context).inflate(j.i.f41488e1, (ViewGroup) this, true);
        F.o(inflate, "inflate(...)");
        setView(inflate);
        c(getView());
    }

    private final void c(View view) {
        this.f42594F = (ImageView) view.findViewById(j.h.na);
        this.f42595G = (HmCustomFontTextView) view.findViewById(j.h.f41225V1);
        this.f42596H = (HmCustomFontTextView) view.findViewById(j.h.f41258d);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.customviews.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HmTriggerCustomizationCard.d(HmTriggerCustomizationCard.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HmTriggerCustomizationCard this$0, View view) {
        F.p(this$0, "this$0");
        com.harman.jbl.partybox.ui.widget.q qVar = this$0.f42597I;
        if (qVar != null) {
            qVar.onAction(ClickEventType.ACTION_CUSTOM_EQ_CHANGE);
        }
    }

    @l3.d
    public final View getView() {
        View view = this.f42593E;
        if (view != null) {
            return view;
        }
        F.S(com.google.android.gms.analytics.ecommerce.c.f27782c);
        return null;
    }

    public final void setOnActionListener(@l3.e com.harman.jbl.partybox.ui.widget.q qVar) {
        this.f42597I = qVar;
    }

    public final void setView(@l3.d View view) {
        F.p(view, "<set-?>");
        this.f42593E = view;
    }

    public final void setViewDetails(@l3.e HmDevice hmDevice) {
        Byte b4;
        if (hmDevice == null) {
            com.harman.log.f.a(f42592K, "Main device is null");
            return;
        }
        if (hmDevice.D() == null) {
            return;
        }
        OneTouchMusicButtonSettings D3 = hmDevice.D();
        Byte b5 = null;
        if (D3 != null) {
            b4 = Byte.valueOf(D3.b());
        } else {
            b4 = null;
        }
        OneTouchMusicButtonSettings D4 = hmDevice.D();
        if (D4 != null) {
            b5 = Byte.valueOf(D4.a());
        }
        com.harman.log.f.a(f42592K, "buttonId= " + b4 + " action= " + b5);
        OneTouchMusicButtonSettings D5 = hmDevice.D();
        if (D5 != null && D5.b() == 1) {
            ImageView imageView = this.f42594F;
            if (imageView != null) {
                imageView.setImageResource(j.f.Tb);
            }
            HmCustomFontTextView hmCustomFontTextView = this.f42595G;
            if (hmCustomFontTextView != null) {
                hmCustomFontTextView.setText(getResources().getString(j.m.f41812r1));
            }
        } else {
            ImageView imageView2 = this.f42594F;
            if (imageView2 != null) {
                imageView2.setImageResource(j.f.Ub);
            }
            HmCustomFontTextView hmCustomFontTextView2 = this.f42595G;
            if (hmCustomFontTextView2 != null) {
                hmCustomFontTextView2.setText(getResources().getString(j.m.f41676N2));
            }
        }
        OneTouchMusicButtonSettings D6 = hmDevice.D();
        if (D6 != null && D6.a() == 1) {
            HmCustomFontTextView hmCustomFontTextView3 = this.f42596H;
            if (hmCustomFontTextView3 != null) {
                hmCustomFontTextView3.setText(getResources().getString(j.m.f41830v1));
                return;
            }
            return;
        }
        OneTouchMusicButtonSettings D7 = hmDevice.D();
        if (D7 != null && D7.a() == 2) {
            HmCustomFontTextView hmCustomFontTextView4 = this.f42596H;
            if (hmCustomFontTextView4 != null) {
                hmCustomFontTextView4.setText(getResources().getString(j.m.f41781l0));
                return;
            }
            return;
        }
        HmCustomFontTextView hmCustomFontTextView5 = this.f42596H;
        if (hmCustomFontTextView5 != null) {
            hmCustomFontTextView5.setText(getResources().getString(j.m.f41699T1));
        }
    }

    public HmTriggerCustomizationCard(@l3.e Context context, @l3.e AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public HmTriggerCustomizationCard(@l3.e Context context, @l3.e AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b(context);
    }
}
