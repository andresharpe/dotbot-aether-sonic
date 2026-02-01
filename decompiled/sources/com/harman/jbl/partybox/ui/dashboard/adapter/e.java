package com.harman.jbl.partybox.ui.dashboard.adapter;

import X2.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0669d;
import androidx.recyclerview.widget.RecyclerView;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.connection.model.HmMultiDeviceModel;
import com.harman.jbl.partybox.ui.customviews.HmPostfixThreeDotsAnimationTextView;
import com.harman.jbl.partybox.ui.party.stereo.D;
import com.harman.jbl.partybox.ui.widget.BatteryView;
import com.harman.jbl.partybox.ui.widget.GroupSpeakerView;
import com.harman.jbl.partybox.ui.widget.MiniPlayerView;
import com.harman.jbl.partybox.ui.widget.g;
import com.harman.jbl.partylight.lib.core.PLGroup;
import com.harman.jbl.partylight.lib.dashboard.widget.PartyLightGroupCountView;
import com.harman.log.f;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.message.TWSInfo;
import com.harman.sdk.utils.AudioChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.H0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;

@U({"SMAP\nProductListDeviceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductListDeviceAdapter.kt\ncom/harman/jbl/partybox/ui/dashboard/adapter/ProductListDeviceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n288#2,2:292\n262#3,2:294\n262#3,2:296\n262#3,2:298\n262#3,2:300\n262#3,2:302\n262#3,2:304\n262#3,2:306\n262#3,2:308\n262#3,2:310\n262#3,2:312\n262#3,2:314\n262#3,2:317\n262#3,2:319\n262#3,2:321\n262#3,2:323\n1#4:316\n*S KotlinDebug\n*F\n+ 1 ProductListDeviceAdapter.kt\ncom/harman/jbl/partybox/ui/dashboard/adapter/ProductListDeviceAdapter\n*L\n70#1:292,2\n118#1:294,2\n133#1:296,2\n180#1:298,2\n182#1:300,2\n188#1:302,2\n190#1:304,2\n191#1:306,2\n192#1:308,2\n196#1:310,2\n198#1:312,2\n202#1:314,2\n207#1:317,2\n211#1:319,2\n213#1:321,2\n238#1:323,2\n*E\n"})
/* loaded from: classes2.dex */
public final class e extends RecyclerView.Adapter<b> {

    /* renamed from: k, reason: collision with root package name */
    @l3.d
    public static final a f43185k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @l3.d
    public static final String f43186l = "ProductListDeviceAdapter";

    /* renamed from: d, reason: collision with root package name */
    @l3.e
    private final Context f43187d;

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final p<Integer, HmMultiDeviceModel, H0> f43188e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private ArrayList<HmMultiDeviceModel> f43189f;

    /* renamed from: g, reason: collision with root package name */
    private final int f43190g;

    /* renamed from: h, reason: collision with root package name */
    private final int f43191h;

    /* renamed from: i, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.dashboard.adapter.b f43192i;

    /* renamed from: j, reason: collision with root package name */
    @l3.e
    private com.harman.jbl.partybox.ui.dashboard.adapter.a f43193j;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.F {

        /* renamed from: I, reason: collision with root package name */
        @l3.d
        private GroupSpeakerView f43194I;

        /* renamed from: J, reason: collision with root package name */
        @l3.d
        private TextView f43195J;

        /* renamed from: K, reason: collision with root package name */
        @l3.d
        private HmPostfixThreeDotsAnimationTextView f43196K;

        /* renamed from: L, reason: collision with root package name */
        @l3.d
        private BatteryView f43197L;

        /* renamed from: M, reason: collision with root package name */
        @l3.d
        private BatteryView f43198M;

        /* renamed from: N, reason: collision with root package name */
        @l3.d
        private PartyLightGroupCountView f43199N;

        /* renamed from: O, reason: collision with root package name */
        @l3.d
        private TextView f43200O;

        /* renamed from: P, reason: collision with root package name */
        @l3.d
        private ImageView f43201P;

        /* renamed from: Q, reason: collision with root package name */
        @l3.d
        private LinearLayout f43202Q;

        /* renamed from: R, reason: collision with root package name */
        @l3.d
        private MiniPlayerView f43203R;

        /* renamed from: S, reason: collision with root package name */
        @l3.d
        private LinearLayout f43204S;

        /* renamed from: T, reason: collision with root package name */
        @l3.d
        private LinearLayout f43205T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@l3.d View itemView) {
            super(itemView);
            F.p(itemView, "itemView");
            View findViewById = itemView.findViewById(j.h.f41332r3);
            F.o(findViewById, "findViewById(...)");
            this.f43194I = (GroupSpeakerView) findViewById;
            View findViewById2 = itemView.findViewById(j.h.f41337s3);
            F.o(findViewById2, "findViewById(...)");
            this.f43195J = (TextView) findViewById2;
            View findViewById3 = itemView.findViewById(j.h.f41210R2);
            F.o(findViewById3, "findViewById(...)");
            this.f43196K = (HmPostfixThreeDotsAnimationTextView) findViewById3;
            View findViewById4 = itemView.findViewById(j.h.R9);
            F.o(findViewById4, "findViewById(...)");
            this.f43197L = (BatteryView) findViewById4;
            View findViewById5 = itemView.findViewById(j.h.Td);
            F.o(findViewById5, "findViewById(...)");
            this.f43198M = (BatteryView) findViewById5;
            View findViewById6 = itemView.findViewById(j.h.p5);
            F.o(findViewById6, "findViewById(...)");
            this.f43199N = (PartyLightGroupCountView) findViewById6;
            View findViewById7 = itemView.findViewById(j.h.Pf);
            F.o(findViewById7, "findViewById(...)");
            this.f43200O = (TextView) findViewById7;
            View findViewById8 = itemView.findViewById(j.h.Of);
            F.o(findViewById8, "findViewById(...)");
            this.f43201P = (ImageView) findViewById8;
            View findViewById9 = itemView.findViewById(j.h.A8);
            F.o(findViewById9, "findViewById(...)");
            this.f43202Q = (LinearLayout) findViewById9;
            View findViewById10 = itemView.findViewById(j.h.ib);
            F.o(findViewById10, "findViewById(...)");
            this.f43203R = (MiniPlayerView) findViewById10;
            View findViewById11 = itemView.findViewById(j.h.m8);
            F.o(findViewById11, "findViewById(...)");
            this.f43204S = (LinearLayout) findViewById11;
            View findViewById12 = itemView.findViewById(j.h.B8);
            F.o(findViewById12, "findViewById(...)");
            this.f43205T = (LinearLayout) findViewById12;
        }

        @l3.d
        public final HmPostfixThreeDotsAnimationTextView R() {
            return this.f43196K;
        }

        @l3.d
        public final GroupSpeakerView S() {
            return this.f43194I;
        }

        @l3.d
        public final TextView T() {
            return this.f43195J;
        }

        @l3.d
        public final PartyLightGroupCountView U() {
            return this.f43199N;
        }

        @l3.d
        public final LinearLayout V() {
            return this.f43204S;
        }

        @l3.d
        public final LinearLayout W() {
            return this.f43202Q;
        }

        @l3.d
        public final LinearLayout X() {
            return this.f43205T;
        }

        @l3.d
        public final BatteryView Y() {
            return this.f43197L;
        }

        @l3.d
        public final MiniPlayerView Z() {
            return this.f43203R;
        }

        @l3.d
        public final BatteryView a0() {
            return this.f43198M;
        }

        @l3.d
        public final ImageView b0() {
            return this.f43201P;
        }

        @l3.d
        public final TextView c0() {
            return this.f43200O;
        }

        public final void d0(@l3.d HmPostfixThreeDotsAnimationTextView hmPostfixThreeDotsAnimationTextView) {
            F.p(hmPostfixThreeDotsAnimationTextView, "<set-?>");
            this.f43196K = hmPostfixThreeDotsAnimationTextView;
        }

        public final void e0(@l3.d GroupSpeakerView groupSpeakerView) {
            F.p(groupSpeakerView, "<set-?>");
            this.f43194I = groupSpeakerView;
        }

        public final void f0(@l3.d TextView textView) {
            F.p(textView, "<set-?>");
            this.f43195J = textView;
        }

        public final void g0(@l3.d PartyLightGroupCountView partyLightGroupCountView) {
            F.p(partyLightGroupCountView, "<set-?>");
            this.f43199N = partyLightGroupCountView;
        }

        public final void h0(@l3.d LinearLayout linearLayout) {
            F.p(linearLayout, "<set-?>");
            this.f43204S = linearLayout;
        }

        public final void i0(@l3.d LinearLayout linearLayout) {
            F.p(linearLayout, "<set-?>");
            this.f43202Q = linearLayout;
        }

        public final void j0(@l3.d LinearLayout linearLayout) {
            F.p(linearLayout, "<set-?>");
            this.f43205T = linearLayout;
        }

        public final void k0(@l3.d BatteryView batteryView) {
            F.p(batteryView, "<set-?>");
            this.f43197L = batteryView;
        }

        public final void l0(@l3.d MiniPlayerView miniPlayerView) {
            F.p(miniPlayerView, "<set-?>");
            this.f43203R = miniPlayerView;
        }

        public final void m0(@l3.d BatteryView batteryView) {
            F.p(batteryView, "<set-?>");
            this.f43198M = batteryView;
        }

        public final void n0(@l3.d ImageView imageView) {
            F.p(imageView, "<set-?>");
            this.f43201P = imageView;
        }

        public final void o0(@l3.d TextView textView) {
            F.p(textView, "<set-?>");
            this.f43200O = textView;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements g {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ HmMultiDeviceModel f43207b;

        c(HmMultiDeviceModel hmMultiDeviceModel) {
            this.f43207b = hmMultiDeviceModel;
        }

        @Override // com.harman.jbl.partybox.ui.widget.g
        public void a() {
            com.harman.jbl.partybox.ui.dashboard.adapter.b S3 = e.this.S();
            if (S3 != null) {
                S3.a(this.f43207b.F());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@l3.e Context context, @l3.d p<? super Integer, ? super HmMultiDeviceModel, H0> clickListener) {
        F.p(clickListener, "clickListener");
        this.f43187d = context;
        this.f43188e = clickListener;
        this.f43189f = new ArrayList<>();
        this.f43191h = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(e this$0, int i4, HmMultiDeviceModel device, View view) {
        F.p(this$0, "this$0");
        F.p(device, "$device");
        this$0.f43188e.c0(Integer.valueOf(i4), device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean X(HmMultiDeviceModel device, e this$0, View view) {
        F.p(device, "$device");
        F.p(this$0, "this$0");
        if (!device.U() && !device.a0()) {
            com.harman.jbl.partybox.ui.dashboard.adapter.a aVar = this$0.f43193j;
            if (aVar != null) {
                aVar.a(device.F());
                return true;
            }
            return true;
        }
        return false;
    }

    @l3.d
    public final ArrayList<HmMultiDeviceModel> Q() {
        return this.f43189f;
    }

    @l3.e
    public final com.harman.jbl.partybox.ui.dashboard.adapter.a R() {
        return this.f43193j;
    }

    @l3.e
    public final com.harman.jbl.partybox.ui.dashboard.adapter.b S() {
        return this.f43192i;
    }

    public final int T() {
        return this.f43191h;
    }

    public final int U() {
        return this.f43190g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void C(@l3.d b holder, final int i4) {
        String K3;
        String str;
        String str2;
        Integer num;
        H0 h02;
        float f4;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6;
        String str3;
        boolean z6;
        int i7;
        int i8;
        boolean z7;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        String str4;
        String str5;
        String str6;
        HmDevice hmDevice;
        Integer num2;
        H0 h03;
        Collection<HmDevice> i12;
        Object obj;
        PLGroup.Source k4;
        F.p(holder, "holder");
        HmMultiDeviceModel hmMultiDeviceModel = this.f43189f.get(i4);
        F.o(hmMultiDeviceModel, "get(...)");
        final HmMultiDeviceModel hmMultiDeviceModel2 = hmMultiDeviceModel;
        f.a(f43186l, "onBindViewHolder device = " + hmMultiDeviceModel2.F());
        TextView T3 = holder.T();
        PLGroup O3 = hmMultiDeviceModel2.O();
        if (O3 == null || (k4 = O3.k()) == null || (K3 = k4.h()) == null) {
            K3 = hmMultiDeviceModel2.K();
        }
        T3.setText(K3);
        TWSInfo R3 = hmMultiDeviceModel2.R();
        Drawable drawable = null;
        if (R3 != null) {
            str = R3.b();
        } else {
            str = null;
        }
        TWSInfo R4 = hmMultiDeviceModel2.R();
        if (R4 != null) {
            str2 = R4.a();
        } else {
            str2 = null;
        }
        f.a(f43186l, "onBindViewHolder groupName : " + str + " , groupId: " + str2);
        GroupSpeakerView S3 = holder.S();
        if (hmMultiDeviceModel2.O() != null) {
            PLGroup O4 = hmMultiDeviceModel2.O();
            F.m(O4);
            num = Integer.valueOf(O4.k().g());
        } else {
            Context context = this.f43187d;
            if (context != null) {
                num = Integer.valueOf(com.harman.sdk.utils.d.r(context, hmMultiDeviceModel2.H(), hmMultiDeviceModel2.E()));
            } else {
                num = null;
            }
        }
        f.a(f43186l, "deviceImage imgScr == " + num);
        if (num != null) {
            int intValue = num.intValue();
            TWSInfo R5 = hmMultiDeviceModel2.R();
            if (R5 != null) {
                str6 = R5.a();
            } else {
                str6 = null;
            }
            if (str6 != null && str6.length() != 0) {
                f.a(f43186l, "deviceImage twsInfo != null, stereo image");
                B2.c k5 = com.harman.sdk.b.f47608a.k();
                if (k5 != null && (i12 = k5.i()) != null) {
                    Iterator<T> it = i12.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (F.g(((HmDevice) obj).n(), hmMultiDeviceModel2.F())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    hmDevice = (HmDevice) obj;
                } else {
                    hmDevice = null;
                }
                if (hmDevice instanceof PartyBoxDevice) {
                    PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
                    HmDevice g4 = D.f45020a.g(partyBoxDevice);
                    if (g4 != null) {
                        Context context2 = this.f43187d;
                        if (context2 != null) {
                            num2 = Integer.valueOf(com.harman.sdk.utils.d.r(context2, g4.q(), g4.o()));
                        } else {
                            num2 = null;
                        }
                        if (num2 != null) {
                            int intValue2 = num2.intValue();
                            if (partyBoxDevice.i() == AudioChannel.STEREO_LEFT) {
                                f.a(f43186l, "deviceImage imgScr2 != null, left = src1, right = src2");
                                S3.b(GroupSpeakerView.f45773P, intValue, intValue2);
                            } else {
                                f.a(f43186l, "deviceImage imgScr2 != null, left = src2, right = src1");
                                S3.b(GroupSpeakerView.f45773P, intValue2, intValue);
                            }
                            h03 = H0.f51801a;
                        } else {
                            h03 = null;
                        }
                        if (h03 == null) {
                            f.a(f43186l, "deviceImage imgScr2 == null");
                        }
                    } else {
                        f.a(f43186l, "deviceImage coDevice == null, both image is src1");
                        S3.b(GroupSpeakerView.f45773P, intValue, intValue);
                    }
                } else {
                    f.a(f43186l, "deviceImage mainDevice is not PartyBox, both image is src1");
                    S3.b(GroupSpeakerView.f45773P, intValue, intValue);
                }
            } else {
                f.a(f43186l, "deviceImage twsInfo == null, single image");
                S3.b(GroupSpeakerView.f45772O, intValue);
            }
            h02 = H0.f51801a;
        } else {
            h02 = null;
        }
        if (h02 == null) {
            f.a(f43186l, "deviceImage imgScr == null");
        }
        float f5 = 0.5f;
        if (hmMultiDeviceModel2.Y()) {
            f4 = 0.5f;
        } else {
            f4 = 1.0f;
        }
        S3.setAlpha(f4);
        GroupSpeakerView S4 = holder.S();
        if (hmMultiDeviceModel2.Q()) {
            S4.setAlpha(1.0f);
            S4.startAnimation(AnimationUtils.loadAnimation(S4.getContext(), j.a.f40568g));
        } else {
            S4.clearAnimation();
            if (!hmMultiDeviceModel2.a0() && !hmMultiDeviceModel2.Y()) {
                f5 = 1.0f;
            }
            S4.setAlpha(f5);
        }
        HmPostfixThreeDotsAnimationTextView R6 = holder.R();
        int i13 = 8;
        if (hmMultiDeviceModel2.Q()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        R6.setVisibility(i5);
        if (hmMultiDeviceModel2.Q()) {
            Context context3 = R6.getContext();
            if (context3 != null) {
                str4 = context3.getString(j.m.I6);
            } else {
                str4 = null;
            }
            if (str4 != null) {
                str5 = str4.substring(0, str4.length() - 3);
                F.o(str5, "substring(...)");
            } else {
                str5 = null;
            }
            R6.setString(str5);
            R6.w();
        } else {
            R6.clearAnimation();
        }
        boolean z10 = true;
        if (hmMultiDeviceModel2.W() && !hmMultiDeviceModel2.b0()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (hmMultiDeviceModel2.U() && !hmMultiDeviceModel2.W()) {
            z4 = true;
        } else {
            z4 = false;
        }
        LinearLayout W3 = holder.W();
        if (hmMultiDeviceModel2.Q() || F.g(hmMultiDeviceModel2.V(), Boolean.TRUE) || (!hmMultiDeviceModel2.S() ? !(!hmMultiDeviceModel2.W() || hmMultiDeviceModel2.a0()) : !(!hmMultiDeviceModel2.W() || !hmMultiDeviceModel2.b0() || hmMultiDeviceModel2.a0()))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        W3.setVisibility(i6);
        if ((z3 && !hmMultiDeviceModel2.a0()) || (z4 && !hmMultiDeviceModel2.a0())) {
            W3.setBackground(null);
        } else {
            W3.setBackgroundResource(j.f.Na);
        }
        TextView c02 = holder.c0();
        if (z4 && !hmMultiDeviceModel2.a0()) {
            str3 = c02.getContext().getString(j.m.qa);
        } else if (hmMultiDeviceModel2.a0()) {
            str3 = c02.getContext().getString(j.m.O5);
        } else if (!hmMultiDeviceModel2.U()) {
            str3 = c02.getContext().getString(j.m.f41711W1);
        } else if (!z3) {
            str3 = "";
        } else {
            str3 = c02.getContext().getString(j.m.P4);
        }
        c02.setText(str3);
        ImageView b02 = holder.b0();
        if (!z4 || hmMultiDeviceModel2.a0()) {
            if (hmMultiDeviceModel2.a0()) {
                drawable = C0669d.i(b02.getContext(), j.f.W3);
            } else if (!hmMultiDeviceModel2.U()) {
                drawable = C0669d.i(b02.getContext(), j.f.f41122x1);
            } else if (z3) {
                drawable = C0669d.i(b02.getContext(), j.f.G3);
            }
        }
        if (drawable == null) {
            b02.setVisibility(8);
        } else {
            b02.setVisibility(0);
            b02.setImageDrawable(drawable);
        }
        if (com.harman.sdk.utils.d.W(hmMultiDeviceModel2.H())) {
            holder.V().setVisibility(0);
            holder.a0().setVisibility(8);
            holder.Y().setVisibility(8);
            PartyLightGroupCountView U3 = holder.U();
            PLGroup O5 = hmMultiDeviceModel2.O();
            F.m(O5);
            if (O5.i() > 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            U3.setVisibility(i11);
            PartyLightGroupCountView U4 = holder.U();
            String H3 = hmMultiDeviceModel2.H();
            PLGroup O6 = hmMultiDeviceModel2.O();
            F.m(O6);
            U4.L(H3, O6.i());
        } else {
            LinearLayout V3 = holder.V();
            if (hmMultiDeviceModel2.I() == HmMultiDeviceModel.DeviceState.Online) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            V3.setVisibility(i7);
            holder.U().setVisibility(8);
            if (hmMultiDeviceModel2.S()) {
                BatteryView Y3 = holder.Y();
                BatteryInfo B3 = hmMultiDeviceModel2.B(AudioChannel.STEREO_LEFT);
                if (B3 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                Y3.setVisibility(i9);
                if (B3 != null) {
                    Y3.c(B3, "L");
                }
                BatteryView a02 = holder.a0();
                BatteryInfo B4 = hmMultiDeviceModel2.B(AudioChannel.STEREO_RIGHT);
                if (B4 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                a02.setVisibility(i10);
                if (B4 != null) {
                    a02.c(B4, "R");
                }
            } else {
                holder.a0().setVisibility(8);
                BatteryView Y4 = holder.Y();
                if (!com.harman.sdk.utils.d.O(hmMultiDeviceModel2.H())) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                Y4.setVisibility(i8);
                BatteryInfo A3 = hmMultiDeviceModel2.A();
                if (A3 != null) {
                    Y4.c(A3, "");
                }
            }
        }
        View view = holder.f17770a;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.adapter.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.W(e.this, i4, hmMultiDeviceModel2, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.harman.jbl.partybox.ui.dashboard.adapter.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean X3;
                X3 = e.X(HmMultiDeviceModel.this, this, view2);
                return X3;
            }
        });
        MiniPlayerView Z3 = holder.Z();
        if (!hmMultiDeviceModel2.W() || hmMultiDeviceModel2.I() != HmMultiDeviceModel.DeviceState.Online || !com.harman.sdk.utils.d.Q(hmMultiDeviceModel2.H())) {
            z10 = false;
        }
        if (z10) {
            i13 = 0;
        }
        Z3.setVisibility(i13);
        com.harman.jbl.partybox.ui.musiccontrol.g M3 = hmMultiDeviceModel2.M();
        if (M3 != null) {
            Z3.setPlayInfo(M3);
        }
        if (hmMultiDeviceModel2.M() != null) {
            Z3.setClickListener(new c(hmMultiDeviceModel2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @l3.d
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b E(@l3.d ViewGroup parent, int i4) {
        F.p(parent, "parent");
        View inflate = LayoutInflater.from(this.f43187d).inflate(j.i.f41437R2, parent, false);
        F.m(inflate);
        return new b(inflate);
    }

    public final void Z(@l3.e com.harman.jbl.partybox.ui.dashboard.adapter.a aVar) {
        this.f43193j = aVar;
    }

    public final void a0(@l3.e com.harman.jbl.partybox.ui.dashboard.adapter.b bVar) {
        this.f43192i = bVar;
    }

    public final void b0(@l3.d List<HmMultiDeviceModel> list) {
        F.p(list, "list");
        this.f43189f.clear();
        ArrayList<HmMultiDeviceModel> arrayList = new ArrayList<>();
        this.f43189f = arrayList;
        arrayList.addAll(list);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f43189f.size();
    }
}
