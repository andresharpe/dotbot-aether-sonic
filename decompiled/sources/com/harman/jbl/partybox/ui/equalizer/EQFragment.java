package com.harman.jbl.partybox.ui.equalizer;

import X2.l;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.C0;
import androidx.fragment.app.ActivityC0889g;
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
import com.harman.jbl.partybox.databinding.C1887j0;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.EqualizerView;
import com.harman.jbl.partybox.ui.delegate.FragmentViewBindingDelegate;
import com.harman.jbl.partybox.ui.main.o;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.SimpleEQSettings;
import com.harman.sdk.utils.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@E(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008f\u0001\u0090\u0001B\b¢\u0006\u0005\b\u008d\u0001\u0010\u0013J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010%\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0013J\u0015\u0010.\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t¢\u0006\u0004\b0\u0010/J\u001d\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020(2\u0006\u0010-\u001a\u00020\u0004¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020(2\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u001bH\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u0010\u0013J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\bJ\r\u0010<\u001a\u00020\u0006¢\u0006\u0004\b<\u0010\u0013J\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\u0013J\u000f\u0010>\u001a\u00020\u0006H\u0016¢\u0006\u0004\b>\u0010\u0013J!\u0010C\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bC\u0010DJ%\u0010H\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\t¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\u0013J\u0017\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020?H\u0016¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0006¢\u0006\u0004\bN\u0010\u0013R\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010X\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010UR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010^R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR2\u0010s\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020o0nj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020o`p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010u\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010^R\u0014\u0010w\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bv\u0010^R\u0014\u0010y\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bx\u0010^R\u0014\u0010{\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\bz\u0010^R\u0016\u0010}\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010mR\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010h\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0088\u0001\u001a\u00030\u0083\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/harman/jbl/partybox/ui/equalizer/EQFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/harman/jbl/partybox/ui/customviews/EqualizerView$a;", "Landroid/view/View$OnClickListener;", "", "progress", "Lkotlin/H0;", "q0", "([I)V", "", "bassOld", "bassNew", "midOld", "midNew", "trebleOld", "trebleNew", "l0", "(IIIIII)V", "A0", "()V", "z0", "r0", "u0", "initView", "s0", "v0", "y0", "", "isEqOn", "t0", "(Z)V", "", "eqId", C0.f11537F0, "band1", "band2", "band3", "x0", "(BBBBB)V", "w0", "", "actionItemValue", "m0", "(Ljava/lang/String;)V", "k0", "value", "mapCustomLevelToBandValues", "(I)I", "mapCustomBandValuesToLevel", "tag", "saveCustomEqBandValues", "(Ljava/lang/String;[I)V", "defaultValue", "fetchCustomEqBandValues", "(Ljava/lang/String;[I)[I", "fromUser", "onProgressChanged", "([IZ)V", "onStartTrackingTouch", "onStopTrackingTouch", "initPBStatus", "onResume", "onDestroy", "Landroid/view/View;", com.google.android.gms.analytics.ecommerce.c.f27782c, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bass", "mid", "treble", "logEQSettingEvent", "(III)V", "updateEQStatus", "v", "onClick", "(Landroid/view/View;)V", "refreshLanguage", "Lcom/harman/jbl/partybox/ui/customviews/c;", "N0", "Lcom/harman/jbl/partybox/ui/customviews/c;", "mPresetGraph", "Landroid/widget/ImageView;", "O0", "Landroid/widget/ImageView;", "mPrevEqView", "P0", "mNextEqView", "Landroid/widget/TextView;", "Q0", "Landroid/widget/TextView;", "mEqNameView", "R0", "I", "mBand1Custom", "S0", "mBand2Custom", "T0", "mBand3Custom", "U0", "B", "Lcom/harman/jbl/partybox/ui/equalizer/a;", "V0", "Lkotlin/A;", "o0", "()Lcom/harman/jbl/partybox/ui/equalizer/a;", "eqViewModel", "W0", "Z", "Ljava/util/HashMap;", "Lcom/harman/jbl/partybox/ui/equalizer/b;", "Lkotlin/collections/HashMap;", "X0", "Ljava/util/HashMap;", "mEqList", "Y0", "mEqIndex", "Z0", "MSG_EQ_UPDATE", k.f48625V, "EQ_BAND_LEVEL", "b1", "EQ_BAND_COUNT", k.f48619T, "isEqGraphSupported", "Lcom/harman/jbl/partybox/ui/main/o;", "d1", "p0", "()Lcom/harman/jbl/partybox/ui/main/o;", "mainViewModel", "Lcom/harman/jbl/partybox/databinding/j0;", "e1", "Lcom/harman/jbl/partybox/ui/delegate/FragmentViewBindingDelegate;", "n0", "()Lcom/harman/jbl/partybox/databinding/j0;", "binding", "Landroid/os/Handler;", "f1", "Landroid/os/Handler;", "handler", "<init>", "Companion", "a", "EqType", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0})
@U({"SMAP\nEQFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EQFragment.kt\ncom/harman/jbl/partybox/ui/equalizer/EQFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ApplicationViewModelLazy.kt\ncom/harman/jbl/partybox/ApplicationViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,542:1\n56#2,10:543\n66#3,4:553\n1855#4:557\n1855#4,2:558\n1856#4:560\n1855#4,2:561\n*S KotlinDebug\n*F\n+ 1 EQFragment.kt\ncom/harman/jbl/partybox/ui/equalizer/EQFragment\n*L\n68#1:543,10\n77#1:553,4\n234#1:557\n235#1:558,2\n234#1:560\n381#1:561,2\n*E\n"})
/* loaded from: classes2.dex */
public final class EQFragment extends Fragment implements EqualizerView.a, View.OnClickListener {

    @l3.d
    public static final String TAG = "EQFragment";

    /* renamed from: N0, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.customviews.c f43589N0;

    /* renamed from: O0, reason: collision with root package name */
    @l3.e
    private ImageView f43590O0;

    /* renamed from: P0, reason: collision with root package name */
    @l3.e
    private ImageView f43591P0;

    /* renamed from: Q0, reason: collision with root package name */
    @l3.e
    private TextView f43592Q0;

    /* renamed from: R0, reason: collision with root package name */
    private int f43593R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f43594S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f43595T0;

    /* renamed from: U0, reason: collision with root package name */
    private byte f43596U0;

    /* renamed from: V0, reason: collision with root package name */
    @l3.d
    private final A f43597V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f43598W0;

    /* renamed from: X0, reason: collision with root package name */
    @l3.d
    private HashMap<Integer, com.harman.jbl.partybox.ui.equalizer.b> f43599X0;

    /* renamed from: Y0, reason: collision with root package name */
    private int f43600Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private final int f43601Z0;

    /* renamed from: a1, reason: collision with root package name */
    private final int f43602a1;

    /* renamed from: b1, reason: collision with root package name */
    private final int f43603b1;

    /* renamed from: c1, reason: collision with root package name */
    private boolean f43604c1;

    /* renamed from: d1, reason: collision with root package name */
    @l3.d
    private final A f43605d1;

    /* renamed from: e1, reason: collision with root package name */
    @l3.d
    private final FragmentViewBindingDelegate f43606e1;

    /* renamed from: f1, reason: collision with root package name */
    @l3.d
    private final Handler f43607f1;

    /* renamed from: g1, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f43588g1 = {N.u(new PropertyReference1Impl(EQFragment.class, "binding", "getBinding()Lcom/harman/jbl/partybox/databinding/FragmentEqualizerBinding;", 0))};

    @l3.d
    public static final a Companion = new a(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @E(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/harman/jbl/partybox/ui/equalizer/EQFragment$EqType;", "", "(Ljava/lang/String;I)V", "SIMPLE_EQ_CUSTOM_1", "JBL_Partybox_3.12.20_release_2025-09-15-11-35_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class EqType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EqType[] $VALUES;
        public static final EqType SIMPLE_EQ_CUSTOM_1 = new EqType("SIMPLE_EQ_CUSTOM_1", 0);

        static {
            EqType[] b4 = b();
            $VALUES = b4;
            $ENTRIES = kotlin.enums.c.c(b4);
        }

        private EqType(String str, int i4) {
        }

        private static final /* synthetic */ EqType[] b() {
            return new EqType[]{SIMPLE_EQ_CUSTOM_1};
        }

        @l3.d
        public static kotlin.enums.a<EqType> e() {
            return $ENTRIES;
        }

        public static EqType valueOf(String str) {
            return (EqType) Enum.valueOf(EqType.class, str);
        }

        public static EqType[] values() {
            return (EqType[]) $VALUES.clone();
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
    /* synthetic */ class b extends FunctionReferenceImpl implements l<View, C1887j0> {

        /* renamed from: N, reason: collision with root package name */
        public static final b f43612N = new b();

        b() {
            super(1, C1887j0.class, "bind", "bind(Landroid/view/View;)Lcom/harman/jbl/partybox/databinding/FragmentEqualizerBinding;", 0);
        }

        @Override // X2.l
        @l3.d
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public final C1887j0 C(@l3.d View p02) {
            F.p(p02, "p0");
            return C1887j0.a(p02);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@l3.d Message msg) {
            F.p(msg, "msg");
            if (msg.what == EQFragment.this.f43601Z0 && EQFragment.this.isAdded()) {
                T1.a.a("BLE_LOG EQFragment MSG_EQ_UPDATE called");
                EQFragment.this.n0().f39702H.setVisibility(0);
                EQFragment.this.A0();
                EQFragment.this.refreshLanguage();
                EQFragment.this.s0();
                EQFragment.this.u0();
                EQFragment.this.r0();
                EQFragment.this.v0();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements l<H0, H0> {
        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ H0 C(H0 h02) {
            c(h02);
            return H0.f51801a;
        }

        public final void c(H0 h02) {
            if (EQFragment.this.isAdded()) {
                T1.a.a("BLE_LOG eqLiveData observer called");
                EQFragment.this.updateEQStatus();
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class e implements Q, kotlin.jvm.internal.A {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f43615a;

        e(l function) {
            F.p(function, "function");
            this.f43615a = function;
        }

        @Override // kotlin.jvm.internal.A
        @l3.d
        public final InterfaceC2229v<?> a() {
            return this.f43615a;
        }

        public final boolean equals(@l3.e Object obj) {
            if ((obj instanceof Q) && (obj instanceof kotlin.jvm.internal.A)) {
                return F.g(a(), ((kotlin.jvm.internal.A) obj).a());
            }
            return false;
        }

        @Override // androidx.lifecycle.Q
        public final /* synthetic */ void f(Object obj) {
            this.f43615a.C(obj);
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public EQFragment() {
        super(j.i.f41471a0);
        this.f43596U0 = (byte) -63;
        final X2.a<Fragment> aVar = new X2.a<Fragment>() { // from class: com.harman.jbl.partybox.ui.equalizer.EQFragment$special$$inlined$viewModels$default$1
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
        this.f43597V0 = FragmentViewModelLazyKt.c(this, N.d(com.harman.jbl.partybox.ui.equalizer.a.class), new X2.a<p0>() { // from class: com.harman.jbl.partybox.ui.equalizer.EQFragment$special$$inlined$viewModels$default$2
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
        }, new X2.a<m0.b>() { // from class: com.harman.jbl.partybox.ui.equalizer.EQFragment$special$$inlined$viewModels$default$3
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
        this.f43599X0 = new HashMap<>();
        this.f43601Z0 = 101;
        this.f43602a1 = 5;
        this.f43603b1 = 3;
        this.f43604c1 = true;
        this.f43605d1 = ApplicationViewModelLazyKt.f(this, N.d(o.class), new ApplicationViewModelLazyKt$applicationViewModels$3(this), new ApplicationViewModelLazyKt$applicationViewModels$4(this));
        this.f43606e1 = com.harman.jbl.partybox.ui.delegate.b.a(this, b.f43612N);
        this.f43607f1 = new c(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0() {
        HmDevice k12 = p0().k1();
        if (k12 != null) {
            this.f43604c1 = ((PartyBoxDevice) k12).P1();
        }
    }

    private final void initView() {
        T1.a.a("BLE_LOG EQFragment initView called");
        n0().f39701G.setListener(this);
        n0().f39704J.setOnClickListener(this);
    }

    private final void k0() {
        T1.a.a("BLE_LOG EQFragment checkAndUpdateEqUI ");
        T1.a.a("BLE_LOG EQFragment mEqIndex : " + this.f43600Y0 + " ");
        com.harman.jbl.partybox.ui.equalizer.b bVar = this.f43599X0.get(Integer.valueOf(this.f43600Y0));
        if (bVar != null) {
            T1.a.a("BLE_LOG EQFragment currentEq displayed : " + bVar + " ");
            if (this.f43604c1) {
                this.f43596U0 = bVar.h();
                v0();
                if (this.f43598W0) {
                    x0(bVar.h(), (byte) 1, (byte) this.f43593R0, (byte) this.f43594S0, (byte) this.f43595T0);
                }
                z0();
            }
        }
    }

    private final void l0(int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i4 != i5) {
            m0(L1.a.f1540W);
        } else if (i6 != i7) {
            m0(L1.a.f1544X);
        } else if (i8 != i9) {
            m0(L1.a.f1548Y);
        }
    }

    private final void m0(String str) {
        HmDevice k12 = p0().k1();
        if (k12 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("di_action_type", L1.a.f1542W1);
            bundle.putInt(L1.a.w3, com.harman.jbl.partybox.c.f38305O);
            bundle.putString(L1.a.f1522R1, str);
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            K1.a.a(L1.a.f1514P1, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1887j0 n0() {
        return (C1887j0) this.f43606e1.a(this, f43588g1[0]);
    }

    private final com.harman.jbl.partybox.ui.equalizer.a o0() {
        return (com.harman.jbl.partybox.ui.equalizer.a) this.f43597V0.getValue();
    }

    private final o p0() {
        return (o) this.f43605d1.getValue();
    }

    private final void q0(int[] iArr) {
        T1.a.a("BLE_LOG EQFragment Equalizer handleProgress called = " + iArr);
        if (iArr != null && iArr.length >= this.f43603b1) {
            this.f43596U0 = (byte) -63;
            int i4 = this.f43593R0;
            int i5 = this.f43594S0;
            int i6 = this.f43595T0;
            this.f43593R0 = mapCustomLevelToBandValues(iArr[0]);
            this.f43594S0 = mapCustomLevelToBandValues(iArr[1]);
            int mapCustomLevelToBandValues = mapCustomLevelToBandValues(iArr[2]);
            this.f43595T0 = mapCustomLevelToBandValues;
            l0(i4, this.f43593R0, i5, this.f43594S0, i6, mapCustomLevelToBandValues);
            t0(this.f43598W0);
            x0(this.f43596U0, (byte) 1, (byte) this.f43593R0, (byte) this.f43594S0, (byte) this.f43595T0);
            z0();
            saveCustomEqBandValues(com.harman.jbl.partybox.constants.a.f38386w, new int[]{this.f43593R0, this.f43594S0, this.f43595T0});
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        if (this.f43604c1) {
            int[] fetchCustomEqBandValues = fetchCustomEqBandValues(com.harman.jbl.partybox.constants.a.f38386w, new int[]{2, 2, 2, 2, 2});
            if (fetchCustomEqBandValues.length == this.f43603b1) {
                int i4 = fetchCustomEqBandValues[0];
                this.f43593R0 = i4;
                int i5 = fetchCustomEqBandValues[1];
                this.f43594S0 = i5;
                int i6 = fetchCustomEqBandValues[2];
                this.f43595T0 = i6;
                T1.a.a("BLE_LOG EQFragment fetchCustomEqBandValues called and Custom Values : eqId = " + ((int) this.f43596U0) + " ,mBand1Custom = " + i4 + " , mBand2Custom = " + i5 + " , mBand3Custom = " + i6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        LinkedList<SimpleEQSettings> K3;
        boolean z3;
        T1.a.a("BLE_LOG EQFragment initEQ called");
        if (this.f43604c1) {
            TextView textView = this.f43592Q0;
            if (textView != null) {
                textView.setText(getString(j.m.f41721Z));
            }
            HmDevice k12 = p0().k1();
            if (k12 != null && (K3 = k12.K()) != null) {
                for (SimpleEQSettings simpleEQSettings : K3) {
                    T1.a.a("BLE_LOG EQFragment simpleEQSetting is " + simpleEQSettings);
                    this.f43596U0 = simpleEQSettings.a();
                    if (simpleEQSettings.d() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.f43598W0 = z3;
                    if (simpleEQSettings.b().size() < this.f43603b1) {
                        return;
                    }
                    this.f43593R0 = simpleEQSettings.b().get(0).b();
                    this.f43594S0 = simpleEQSettings.b().get(1).b();
                    this.f43595T0 = simpleEQSettings.b().get(2).b();
                    this.f43600Y0 = EqType.SIMPLE_EQ_CUSTOM_1.ordinal();
                    saveCustomEqBandValues(com.harman.jbl.partybox.constants.a.f38386w, new int[]{this.f43593R0, this.f43594S0, this.f43595T0});
                }
            }
        }
    }

    private final void t0(boolean z3) {
        T1.a.a("BLE_LOG EQFragment initEQSwitchOnOff called");
        if (z3) {
            n0().f39704J.setImageResource(j.f.i4);
            ImageView imageView = this.f43591P0;
            if (imageView != null) {
                imageView.setEnabled(true);
            }
            ImageView imageView2 = this.f43590O0;
            if (imageView2 != null) {
                imageView2.setEnabled(true);
                return;
            }
            return;
        }
        n0().f39704J.setImageResource(j.f.h4);
        ImageView imageView3 = this.f43591P0;
        if (imageView3 != null) {
            imageView3.setEnabled(false);
        }
        ImageView imageView4 = this.f43590O0;
        if (imageView4 != null) {
            imageView4.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0() {
        T1.a.a("BLE_LOG EQFragment initEqList called");
        HashMap<Integer, com.harman.jbl.partybox.ui.equalizer.b> hashMap = new HashMap<>(EqType.values().length);
        this.f43599X0 = hashMap;
        if (this.f43604c1) {
            EqType eqType = EqType.SIMPLE_EQ_CUSTOM_1;
            Integer valueOf = Integer.valueOf(eqType.ordinal());
            String string = getString(j.m.f41721Z);
            F.o(string, "getString(...)");
            hashMap.put(valueOf, new com.harman.jbl.partybox.ui.equalizer.b((byte) -63, string, j.f.f41096r1, j.f.f41091q1, eqType.ordinal()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0() {
        T1.a.a("BLE_LOG EQFragment initStatus called");
        n0().f39700F.setText(getString(j.m.f41811r0));
        if (this.f43604c1) {
            n0().f39703I.setVisibility(0);
            y0();
            t0(this.f43598W0);
        }
    }

    private final void w0() {
        com.harman.jbl.partybox.ui.equalizer.b bVar = this.f43599X0.get(Integer.valueOf(this.f43600Y0));
        if (bVar != null) {
            T1.a.a("BLE_LOG EQFragment currentEq displayed : " + bVar + " ");
            this.f43596U0 = bVar.h();
            x0(bVar.h(), (byte) 0, (byte) this.f43593R0, (byte) this.f43594S0, (byte) this.f43595T0);
        }
    }

    private final void x0(byte b4, byte b5, byte b6, byte b7, byte b8) {
        HmDevice k12 = p0().k1();
        if (k12 != null) {
            T1.a.a("BLE_LOG EQFragment setCurrentEQMode called");
            o0().y((PartyBoxDevice) k12, b4, b5, b6, b7, b8);
            f.a(TAG, "BLE_LOG eqId = " + ((int) b4) + " ,band1 = " + ((int) b6) + " , band2 = " + ((int) b7) + " , band3 = " + ((int) b8));
        }
    }

    private final void y0() {
        T1.a.a("BLE_LOG EQFragment setEqGraphState called");
        int[] iArr = new int[this.f43603b1];
        if (this.f43598W0) {
            iArr[0] = mapCustomBandValuesToLevel(this.f43593R0);
            iArr[1] = mapCustomBandValuesToLevel(this.f43594S0);
            iArr[2] = mapCustomBandValuesToLevel(this.f43595T0);
        } else {
            iArr[0] = mapCustomBandValuesToLevel(2);
            iArr[1] = mapCustomBandValuesToLevel(2);
            iArr[2] = mapCustomBandValuesToLevel(2);
        }
        n0().f39701G.setLevel(this.f43602a1);
        n0().f39701G.setValues(iArr);
        n0().f39701G.setVisibility(0);
        com.harman.jbl.partybox.ui.customviews.c cVar = this.f43589N0;
        if (cVar != null) {
            cVar.setVisibility(8);
        }
        n0().f39701G.setCustomGraphEdit(this.f43598W0);
        TextView textView = this.f43592Q0;
        if (textView != null) {
            textView.setText(getString(j.m.f41721Z));
        }
    }

    private final void z0() {
        LinkedList<SimpleEQSettings> K3;
        T1.a.a("BLE_LOG EQFragment updateEQ called");
        HmDevice k12 = p0().k1();
        if (k12 != null && (K3 = k12.K()) != null) {
            Iterator<T> it = K3.iterator();
            while (it.hasNext()) {
                for (SimpleEQSettings.Parameter parameter : ((SimpleEQSettings) it.next()).b()) {
                    byte a4 = parameter.a();
                    if (a4 == 1) {
                        parameter.d((byte) this.f43593R0);
                    } else if (a4 == 2) {
                        parameter.d((byte) this.f43594S0);
                    } else if (a4 == 3) {
                        parameter.d((byte) this.f43595T0);
                    }
                }
            }
        }
    }

    @l3.d
    public final int[] fetchCustomEqBandValues(@l3.d String tag, @l3.d int[] defaultValue) {
        String str;
        SharedPreferences preferences;
        F.p(tag, "tag");
        F.p(defaultValue, "defaultValue");
        ActivityC0889g activity = getActivity();
        if (activity != null && (preferences = activity.getPreferences(0)) != null) {
            str = preferences.getString(tag, "");
        } else {
            str = null;
        }
        try {
            JSONArray jSONArray = new JSONObject(new JSONTokener(str)).getJSONArray(tag);
            int[] iArr = new int[jSONArray.length()];
            int length = jSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = jSONArray.getInt(i4);
            }
            return iArr;
        } catch (JSONException unused) {
            return defaultValue;
        }
    }

    public final void initPBStatus() {
        T1.a.a("BLE_LOG EQFragment initPBStatus called");
        if (p0().k1() != null) {
            v0();
        }
    }

    public final void logEQSettingEvent(int i4, int i5, int i6) {
        HmDevice k12 = p0().k1();
        if (k12 != null && o.f44128m1.e()) {
            T1.a.a("BLE_LOG logEQSettingEvent called");
            Bundle bundle = new Bundle();
            bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(k12.q()));
            bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(k12.n()));
            bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(k12.n()));
            if (this.f43598W0) {
                bundle.putString(L1.a.f1608k1, L1.a.f1519Q2);
                bundle.putInt(L1.a.f1613l1, i4);
                bundle.putInt(L1.a.f1618m1, i5);
                bundle.putInt(L1.a.f1623n1, i6);
            } else {
                bundle.putString(L1.a.f1608k1, "default");
                bundle.putInt(L1.a.f1613l1, 2);
                bundle.putInt(L1.a.f1618m1, 2);
                bundle.putInt(L1.a.f1623n1, 2);
            }
            T1.a.a("BLE_LOG EVENT_SETTING_EQ called");
            p0().n2(L1.a.f1611l, bundle);
        }
    }

    public final int mapCustomBandValuesToLevel(int i4) {
        if (i4 == 0) {
            return 2;
        }
        int i5 = 1;
        if (i4 != 1) {
            i5 = 0;
            if (i4 != 2) {
                if (i4 == 3) {
                    return -1;
                }
                if (i4 == 4) {
                    return -2;
                }
            }
        }
        return i5;
    }

    public final int mapCustomLevelToBandValues(int i4) {
        if (i4 == -2) {
            return 4;
        }
        if (i4 == -1) {
            return 3;
        }
        if (i4 != 0) {
            return i4 != 1 ? 0 : 1;
        }
        return 2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@l3.d View v3) {
        F.p(v3, "v");
        if (v3.getId() == j.h.Pd) {
            if (this.f43598W0) {
                T1.a.a("BLE_LOG EQFragment Eq switch clicked and it is Off, So turn off eq and grey out the graph ");
                this.f43598W0 = false;
                w0();
                m0(L1.a.f1536V);
                v0();
                ImageView imageView = this.f43591P0;
                if (imageView != null) {
                    imageView.setEnabled(false);
                }
                ImageView imageView2 = this.f43590O0;
                if (imageView2 != null) {
                    imageView2.setEnabled(false);
                    return;
                }
                return;
            }
            m0(L1.a.f1532U);
            T1.a.a("BLE_LOG EQFragment Eq switch clicked and it is On, So checkAndUpdateEqUI ");
            this.f43598W0 = true;
            k0();
            ImageView imageView3 = this.f43591P0;
            if (imageView3 != null) {
                imageView3.setEnabled(true);
            }
            ImageView imageView4 = this.f43590O0;
            if (imageView4 != null) {
                imageView4.setEnabled(true);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        T1.a.a("BLE_LOG EQFragment onDestroy called");
    }

    @Override // com.harman.jbl.partybox.ui.customviews.EqualizerView.a
    public void onProgressChanged(@l3.d int[] progress, boolean z3) {
        F.p(progress, "progress");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        T1.a.a("BLE_LOG EQFragment onResume called");
        super.onResume();
        initPBStatus();
    }

    @Override // com.harman.jbl.partybox.ui.customviews.EqualizerView.a
    public void onStartTrackingTouch() {
    }

    @Override // com.harman.jbl.partybox.ui.customviews.EqualizerView.a
    public void onStopTrackingTouch(@l3.d int[] progress) {
        F.p(progress, "progress");
        q0(progress);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@l3.d View view, @l3.e Bundle bundle) {
        F.p(view, "view");
        super.onViewCreated(view, bundle);
        T1.a.a("BLE_LOG EQFragment onCreateView called");
        A0();
        initView();
        s0();
        u0();
        r0();
        v0();
        logEQSettingEvent(this.f43593R0, this.f43594S0, this.f43595T0);
        p0().f1().k(getViewLifecycleOwner(), new e(new d()));
    }

    public final void refreshLanguage() {
        CharSequence charSequence;
        T1.a.a("BLE_LOG refreshLanguage called");
        TextView textView = n0().f39700F;
        Context context = getContext();
        if (context != null) {
            charSequence = context.getText(j.m.f41811r0);
        } else {
            charSequence = null;
        }
        textView.setText(charSequence);
        String[] strArr = {getResources().getString(j.m.f41805q), getResources().getString(j.m.f41635D1), getResources().getString(j.m.Ca)};
        n0().f39701G.setTitles(strArr);
        com.harman.jbl.partybox.ui.customviews.c cVar = this.f43589N0;
        if (cVar != null) {
            cVar.setTitles(strArr);
        }
    }

    public final void saveCustomEqBandValues(@l3.d String tag, @l3.d int[] value) {
        SharedPreferences.Editor editor;
        String str;
        SharedPreferences preferences;
        F.p(tag, "tag");
        F.p(value, "value");
        ActivityC0889g activity = getActivity();
        if (activity != null && (preferences = activity.getPreferences(0)) != null) {
            editor = preferences.edit();
        } else {
            editor = null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i4 : value) {
                jSONArray.put(i4);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(tag, jSONArray);
            str = jSONObject.toString();
            F.m(str);
        } catch (JSONException unused) {
            str = "";
        }
        if (editor != null) {
            editor.putString(tag, str);
        }
        if (editor != null) {
            editor.commit();
        }
    }

    public final void updateEQStatus() {
        this.f43607f1.removeMessages(this.f43601Z0);
        this.f43607f1.sendEmptyMessage(this.f43601Z0);
    }
}
