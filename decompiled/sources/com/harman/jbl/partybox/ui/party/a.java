package com.harman.jbl.partybox.ui.party;

import J2.a;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC0879d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmCustomFontTextView;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumJoinPartyResult;
import com.harman.jbl.partybox.ui.party.auracast.o;
import com.harman.jbl.partybox.ui.party.mode.c;
import com.harman.jbl.partybox.ui.party.stereo.D;
import com.harman.jbl.partybox.ui.party.stereo.StereoCreateFragment;
import com.harman.jbl.partybox.ui.party.stereo.g;
import com.harman.jbl.partybox.ui.widget.BatteryView;
import com.harman.jbl.partybox.ui.widget.w;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BatteryInfo;
import com.harman.sdk.utils.EnumSyncOnOff;
import com.harman.sdk.utils.PlayerStatus;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.z;
import l3.d;
import l3.e;

@U({"SMAP\nBindingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindingAdapter.kt\ncom/harman/jbl/partybox/ui/party/BindingAdapterKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,709:1\n262#2,2:710\n262#2,2:712\n262#2,2:714\n262#2,2:716\n262#2,2:718\n262#2,2:720\n262#2,2:722\n262#2,2:724\n262#2,2:726\n262#2,2:728\n262#2,2:730\n262#2,2:732\n262#2,2:734\n262#2,2:736\n262#2,2:738\n262#2,2:740\n262#2,2:742\n262#2,2:744\n262#2,2:746\n262#2,2:748\n262#2,2:750\n262#2,2:752\n262#2,2:754\n262#2,2:756\n262#2,2:758\n262#2,2:760\n262#2,2:762\n*S KotlinDebug\n*F\n+ 1 BindingAdapter.kt\ncom/harman/jbl/partybox/ui/party/BindingAdapterKt\n*L\n164#1:710,2\n169#1:712,2\n194#1:714,2\n199#1:716,2\n203#1:718,2\n260#1:720,2\n265#1:722,2\n269#1:724,2\n280#1:726,2\n299#1:728,2\n304#1:730,2\n308#1:732,2\n319#1:734,2\n375#1:736,2\n380#1:738,2\n384#1:740,2\n398#1:742,2\n410#1:744,2\n466#1:746,2\n470#1:748,2\n476#1:750,2\n479#1:752,2\n559#1:754,2\n563#1:756,2\n568#1:758,2\n572#1:760,2\n577#1:762,2\n*E\n"})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.harman.jbl.partybox.ui.party.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0392a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44704a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44705b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f44706c;

        static {
            int[] iArr = new int[EnumJoinPartyResult.values().length];
            try {
                iArr[EnumJoinPartyResult.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumJoinPartyResult.START_NEW_PARTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44704a = iArr;
            int[] iArr2 = new int[PlayerStatus.values().length];
            try {
                iArr2[PlayerStatus.PLAYER_STATE_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PlayerStatus.PLAYER_STATE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PlayerStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f44705b = iArr2;
            int[] iArr3 = new int[EnumSyncOnOff.values().length];
            try {
                iArr3[EnumSyncOnOff.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumSyncOnOff.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f44706c = iArr3;
        }
    }

    @InterfaceC0879d({"bind:imgIcon", "bind:imgTxt"})
    public static final void A(@d HmTextViewWithImage imgTextView, int i4, int i5) {
        F.p(imgTextView, "imgTextView");
        imgTextView.setImage(i4);
        imgTextView.setText(imgTextView.getResources().getText(i5), TextView.BufferType.SPANNABLE);
    }

    @InterfaceC0879d({"setInOtherPartyTips"})
    public static final void B(@d HmTextViewWithImage imgTextView, @e HmDevice hmDevice) {
        F.p(imgTextView, "imgTextView");
        if (hmDevice == null) {
            imgTextView.setText(j.m.sa);
        } else if (o.f44854a.v(hmDevice)) {
            imgTextView.setImage(j.f.f41021c1);
            imgTextView.setText(imgTextView.getResources().getText(j.m.ra), TextView.BufferType.SPANNABLE);
        } else {
            imgTextView.setText(j.m.sa);
        }
    }

    @InterfaceC0879d({"syncStateChecked"})
    public static final void C(@d ImageView imageView, @e EnumSyncOnOff enumSyncOnOff) {
        int i4;
        int i5;
        F.p(imageView, "imageView");
        if (enumSyncOnOff == null) {
            i4 = -1;
        } else {
            i4 = C0392a.f44706c[enumSyncOnOff.ordinal()];
        }
        if (i4 != 1) {
            if (i4 != 2) {
                i5 = j.f.h4;
            } else {
                i5 = j.f.h4;
            }
        } else {
            i5 = j.f.i4;
        }
        imageView.setImageResource(i5);
    }

    public static final void D(@d ImageView imageView) {
        ObjectAnimator objectAnimator;
        F.p(imageView, "<this>");
        Object tag = imageView.getTag();
        if (tag instanceof ObjectAnimator) {
            objectAnimator = (ObjectAnimator) tag;
        } else {
            objectAnimator = null;
        }
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        imageView.setVisibility(0);
        ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, f.f8538i, 0.0f, 359.0f).setDuration(3000L);
        duration.setRepeatCount(-1);
        F.o(duration, "apply(...)");
        duration.start();
        imageView.setTag(duration);
    }

    public static final void E(@d ImageView imageView) {
        ObjectAnimator objectAnimator;
        F.p(imageView, "<this>");
        imageView.setVisibility(8);
        Object tag = imageView.getTag();
        if (tag instanceof ObjectAnimator) {
            objectAnimator = (ObjectAnimator) tag;
        } else {
            objectAnimator = null;
        }
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        imageView.setTag(null);
    }

    @InterfaceC0879d({"submitList"})
    public static final void F(@d RecyclerView recyclerView, @e List<? extends HmDevice> list) {
        com.harman.jbl.partybox.ui.party.auracast.ui.a aVar;
        F.p(recyclerView, "recyclerView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof com.harman.jbl.partybox.ui.party.auracast.ui.a) {
            aVar = (com.harman.jbl.partybox.ui.party.auracast.ui.a) adapter;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.H();
        }
        aVar.U(list);
    }

    @InterfaceC0879d({"submitList"})
    public static final void G(@d ViewPager2 viewPager2, @e List<? extends HmDevice> list) {
        com.harman.jbl.partybox.ui.party.auracast.ui.a aVar;
        F.p(viewPager2, "viewPager2");
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter instanceof com.harman.jbl.partybox.ui.party.auracast.ui.a) {
            aVar = (com.harman.jbl.partybox.ui.party.auracast.ui.a) adapter;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.H();
        }
        aVar.U(list);
    }

    @InterfaceC0879d({"updateBatteryInfo"})
    public static final void H(@d BatteryView view, @e HmDevice hmDevice) {
        BatteryInfo f4;
        F.p(view, "view");
        if (hmDevice != null && (f4 = hmDevice.f()) != null) {
            view.setVisibility(0);
            view.c(f4, "");
        } else {
            view.setVisibility(8);
        }
    }

    @InterfaceC0879d({"updateDarkDeviceImg"})
    public static final void I(@d ImageView imageView, @e HmDevice hmDevice) {
        F.p(imageView, "imageView");
        if (hmDevice == null) {
            imageView.setImageResource(j.f.f40979S1);
            return;
        }
        int r4 = com.harman.sdk.utils.d.r(imageView.getContext(), hmDevice.q(), hmDevice.o());
        if (r4 == 0) {
            r4 = j.f.f40979S1;
        }
        imageView.setImageResource(r4);
    }

    @InterfaceC0879d({"updateDarkDevicePartyImg"})
    public static final void J(@d ImageView imageView, @e HmDevice hmDevice) {
        F.p(imageView, "imageView");
        if (hmDevice == null) {
            imageView.setImageResource(j.f.f40979S1);
            return;
        }
        String n4 = com.harman.sdk.utils.d.n(hmDevice);
        String k4 = com.harman.sdk.utils.d.k(hmDevice);
        if (TextUtils.isEmpty(k4)) {
            k4 = "";
        }
        com.bumptech.glide.b.F(imageView).t(n4).I0(new com.bumptech.glide.signature.e(n4 + "?signature=" + k4)).A0(j.f.f40979S1).o1(imageView);
    }

    @InterfaceC0879d({"updateLightDeviceImg"})
    public static final void K(@d ImageView imageView, @e HmDevice hmDevice) {
        F.p(imageView, "imageView");
        if (hmDevice == null) {
            imageView.setImageResource(j.f.f40983T1);
            return;
        }
        int r4 = com.harman.sdk.utils.d.r(imageView.getContext(), hmDevice.q(), hmDevice.o());
        if (r4 == 0) {
            r4 = j.f.f40983T1;
        }
        imageView.setImageResource(r4);
    }

    @InterfaceC0879d({"updateLightDevicePartyImg"})
    public static final void L(@d ImageView imageView, @e HmDevice hmDevice) {
        F.p(imageView, "imageView");
        if (hmDevice == null) {
            imageView.setImageResource(j.f.f40983T1);
            return;
        }
        String n4 = com.harman.sdk.utils.d.n(hmDevice);
        String k4 = com.harman.sdk.utils.d.k(hmDevice);
        if (TextUtils.isEmpty(k4)) {
            k4 = "";
        }
        com.bumptech.glide.b.F(imageView).t(n4).I0(new com.bumptech.glide.signature.e(n4 + "?signature=" + k4)).A0(j.f.f40983T1).o1(imageView);
    }

    @InterfaceC0879d({"updateLightDevicePartyImgWithAlpha"})
    public static final void M(@d ImageView imageView, @e HmDevice hmDevice) {
        F.p(imageView, "imageView");
        if (hmDevice == null) {
            imageView.setImageResource(j.f.f40983T1);
            return;
        }
        if (b.f44881a.f(hmDevice)) {
            imageView.setImageAlpha(128);
        } else {
            imageView.setImageAlpha(255);
        }
        String n4 = com.harman.sdk.utils.d.n(hmDevice);
        String k4 = com.harman.sdk.utils.d.k(hmDevice);
        if (TextUtils.isEmpty(k4)) {
            k4 = "";
        }
        com.bumptech.glide.b.F(imageView).t(n4).I0(new com.bumptech.glide.signature.e(n4 + "?signature=" + k4)).A0(j.f.f40983T1).o1(imageView);
    }

    @InterfaceC0879d({"updatePlayPause"})
    public static final void N(@d ImageView imageView, @e PlayerStatus playerStatus) {
        int i4;
        F.p(imageView, "imageView");
        if (playerStatus == null) {
            i4 = -1;
        } else {
            i4 = C0392a.f44705b[playerStatus.ordinal()];
        }
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            imageView.setImageResource(j.f.w3);
        } else {
            imageView.setImageResource(j.f.x3);
        }
    }

    @InterfaceC0879d({"updateScanDeviceCount"})
    public static final void O(@d HmCustomFontTextView tv, @e List<? extends HmDevice> list) {
        int size;
        F.p(tv, "tv");
        if (list == null) {
            size = 0;
        } else if (list.size() >= 99) {
            size = 99;
        } else {
            size = list.size();
        }
        tv.setText(String.valueOf(size));
    }

    @InterfaceC0879d({"bind:device", "bind:connectedQueue"})
    public static final void a(@d ImageView imageView, @e HmDevice hmDevice, @e List<? extends HmDevice> list) {
        F.p(imageView, "imageView");
        int i4 = 8;
        if (hmDevice == null) {
            imageView.setVisibility(8);
        } else {
            if (list == null) {
                imageView.setVisibility(8);
                return;
            }
            if (list.contains(hmDevice)) {
                i4 = 0;
            }
            imageView.setVisibility(i4);
        }
    }

    @InterfaceC0879d({"decoDevicePlaying"})
    public static final void b(@d ImageView imageView, @e HmDevice hmDevice) {
        boolean z3;
        F.p(imageView, "imageView");
        int i4 = 8;
        if (hmDevice == null) {
            imageView.setVisibility(8);
            return;
        }
        o oVar = o.f44854a;
        if (oVar.v(hmDevice) && oVar.s(hmDevice)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i4 = 0;
        }
        imageView.setVisibility(i4);
    }

    private static final void c(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }

    @InterfaceC0879d({"bind:device", "bind:quittingQueue", "bind:connectingQueue", "bind:provider"})
    public static final void d(@d HmCustomFontTextView textView, @e HmDevice hmDevice, @e List<? extends HmDevice> list, @e List<? extends HmDevice> list2, @e c cVar) {
        boolean z3;
        F.p(textView, "textView");
        boolean z4 = cVar instanceof com.harman.jbl.partybox.ui.party.mode.b;
        int i4 = 8;
        if (z4) {
            if (hmDevice == null) {
                textView.setVisibility(8);
                return;
            }
            if (list == null) {
                textView.setVisibility(0);
                return;
            }
            if (!list.contains(hmDevice) && hmDevice.O()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = 0;
            }
            textView.setVisibility(i4);
            return;
        }
        textView.setVisibility(8);
    }

    @InterfaceC0879d({"bind:device", "bind:quittingQueue", "bind:connectingQueue", "bind:provider"})
    public static final void e(@d ConstraintLayout layout, @e HmDevice hmDevice, @e List<? extends HmDevice> list, @e List<? extends HmDevice> list2, @e c cVar) {
        int i4;
        F.p(layout, "layout");
        if (cVar instanceof com.harman.jbl.partybox.ui.party.mode.b) {
            if (hmDevice == null) {
                layout.setClickable(false);
                return;
            }
            if (hmDevice.O()) {
                i4 = a.c.f1272m;
            } else {
                i4 = j.d.f40743d1;
            }
            layout.setBackgroundResource(i4);
            if (list == null) {
                layout.setClickable(true);
                return;
            } else {
                layout.setClickable(!list.contains(hmDevice));
                return;
            }
        }
        layout.setClickable(false);
    }

    @InterfaceC0879d({"decoSelectChannelStateBannerTxt"})
    public static final void f(@d HmCustomFontTextView tv, @d StereoCreateFragment fragment) {
        F.p(tv, "tv");
        F.p(fragment, "fragment");
        com.harman.jbl.partybox.ui.party.stereo.state.create.d.f45289a.a(tv, fragment);
    }

    private static final void g(View view) {
        view.setScaleX(1.1f);
        view.setScaleY(1.1f);
        view.setAlpha(1.0f);
    }

    @InterfaceC0879d({"bind:device", "bind:selectedDevice"})
    public static final void h(@d View view, @e HmDevice hmDevice, @e HmDevice hmDevice2) {
        F.p(view, "view");
        if (hmDevice2 == null) {
            c(view);
        } else if (b.f44881a.o(hmDevice, hmDevice2)) {
            g(view);
        } else {
            n(view);
        }
    }

    @InterfaceC0879d({"decoStageDashboardQuitGroupTxt"})
    public static final void i(@d HmCustomFontTextView tv, @d g observer) {
        F.p(tv, "tv");
        F.p(observer, "observer");
        D d4 = D.f45020a;
        String string = tv.getContext().getResources().getString(j.m.ab);
        F.o(string, "getString(...)");
        String string2 = tv.getContext().getResources().getString(j.m.o5);
        F.o(string2, "getString(...)");
        d4.f(tv, string, string2, observer);
    }

    @InterfaceC0879d({"decoStartANewParty"})
    public static final void j(@d HmCustomFontTextView tv, @e c cVar) {
        int i4;
        F.p(tv, "tv");
        if (cVar instanceof com.harman.jbl.partybox.ui.party.mode.b) {
            i4 = j.m.f41703U1;
        } else {
            i4 = j.m.f41703U1;
        }
        tv.setText(i4);
    }

    @InterfaceC0879d({"decoStereoChannelStateBannerTxt"})
    public static final void k(@d HmCustomFontTextView tv, @d g observer) {
        F.p(tv, "tv");
        F.p(observer, "observer");
        D d4 = D.f45020a;
        String string = tv.getContext().getResources().getString(j.m.bb);
        F.o(string, "getString(...)");
        String string2 = tv.getContext().getResources().getString(j.m.Ua);
        F.o(string2, "getString(...)");
        d4.f(tv, string, string2, observer);
    }

    @InterfaceC0879d({"decoStereo"})
    public static final void l(@d ImageView imageView, @e HmDevice hmDevice) {
        boolean z3;
        F.p(imageView, "imageView");
        int i4 = 0;
        if (hmDevice != null) {
            z3 = D.f45020a.o(hmDevice);
        } else {
            z3 = false;
        }
        if (!z3) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
    }

    @InterfaceC0879d({"bind:device", "bind:provider"})
    public static final void m(@d ImageView imageView, @e HmDevice hmDevice, @e c cVar) {
        boolean z3;
        F.p(imageView, "imageView");
        int i4 = 0;
        if ((cVar instanceof com.harman.jbl.partybox.ui.party.mode.b) && o.f44854a.o(hmDevice)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
    }

    private static final void n(View view) {
        view.setScaleX(0.9f);
        view.setScaleY(0.9f);
        view.setAlpha(0.7f);
    }

    @InterfaceC0879d({"descRenameDeviceBtn"})
    public static final void o(@d HmCustomFontTextView tv, boolean z3) {
        int i4;
        int i5;
        LinearLayout.LayoutParams layoutParams;
        float f4;
        F.p(tv, "tv");
        if (z3) {
            i4 = j.f.f41116w;
        } else {
            i4 = j.f.f41120x;
        }
        tv.setBackgroundResource(i4);
        Resources resources = tv.getResources();
        if (z3) {
            i5 = j.d.f40749f1;
        } else {
            i5 = j.d.f40755h1;
        }
        tv.setTextColor(resources.getColor(i5));
        tv.setClickable(z3);
        ViewGroup.LayoutParams layoutParams2 = tv.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = null;
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            w.a aVar = w.f46160a;
            Context context = tv.getContext();
            if (z3) {
                f4 = 24.0f;
            } else {
                f4 = 270.0f;
            }
            layoutParams.topMargin = (int) aVar.b(context, f4);
            layoutParams3 = layoutParams;
        }
        tv.setLayoutParams(layoutParams3);
    }

    @InterfaceC0879d({"descRenameDeviceET"})
    public static final void p(@d EditText et, boolean z3) {
        int i4;
        int i5;
        F.p(et, "et");
        if (z3) {
            i4 = j.f.ja;
        } else {
            i4 = j.f.ka;
        }
        et.setBackgroundResource(i4);
        Resources resources = et.getResources();
        if (z3) {
            i5 = j.d.f40749f1;
        } else {
            i5 = j.d.f40755h1;
        }
        et.setTextColor(resources.getColor(i5));
    }

    @InterfaceC0879d({"bind:howRemoveDevice", "bind:quittingQueue", "bind:connectingQueue", "bind:provider"})
    public static final void q(@d HmCustomFontTextView textView, @e HmDevice hmDevice, @e List<? extends HmDevice> list, @e List<? extends HmDevice> list2, @e c cVar) {
        boolean z3;
        F.p(textView, "textView");
        boolean z4 = cVar instanceof com.harman.jbl.partybox.ui.party.mode.b;
        int i4 = 8;
        if (z4) {
            if (hmDevice == null) {
                textView.setVisibility(8);
                return;
            }
            if (list == null) {
                textView.setVisibility(0);
                return;
            }
            if (!list.contains(hmDevice) && !hmDevice.O()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = 0;
            }
            textView.setVisibility(i4);
            return;
        }
        textView.setVisibility(8);
    }

    @InterfaceC0879d({"switching"})
    public static final void r(@d ImageView iv, boolean z3) {
        float f4;
        F.p(iv, "iv");
        if (z3) {
            f4 = 0.5f;
        } else {
            f4 = 1.0f;
        }
        iv.setAlpha(f4);
    }

    @InterfaceC0879d({"bind:device", "bind:connectingQueue"})
    public static final void s(@d ImageView imageView, @e HmDevice hmDevice, @e List<? extends HmDevice> list) {
        F.p(imageView, "imageView");
        if (hmDevice == null) {
            E(imageView);
            return;
        }
        if (list == null) {
            E(imageView);
        } else if (list.contains(hmDevice)) {
            D(imageView);
        } else {
            E(imageView);
        }
    }

    @InterfaceC0879d({"bind:device", "bind:quittingQueue", "bind:connectingQueue", "bind:provider"})
    public static final void t(@d ImageView imageView, @e HmDevice hmDevice, @e List<? extends HmDevice> list, @e List<? extends HmDevice> list2, @e c cVar) {
        F.p(imageView, "imageView");
        if (cVar instanceof com.harman.jbl.partybox.ui.party.mode.b) {
            if (hmDevice == null) {
                E(imageView);
                return;
            }
            if (list == null) {
                E(imageView);
                return;
            } else if (list.contains(hmDevice)) {
                D(imageView);
                return;
            } else {
                E(imageView);
                return;
            }
        }
        E(imageView);
    }

    @InterfaceC0879d({"bind:provider", "bind:device", "bind:btDevice", "bind:twsMainDevice", "bind:twsCoDevice"})
    public static final void u(@d View view, @e c cVar, @e HmDevice hmDevice, @e HmDevice hmDevice2, @e HmDevice hmDevice3, @e HmDevice hmDevice4) {
        F.p(view, "view");
        int i4 = 8;
        if (cVar == null) {
            view.setVisibility(8);
            return;
        }
        if (hmDevice == null) {
            view.setVisibility(8);
            return;
        }
        int i5 = C0392a.f44704a[cVar.b(hmDevice, hmDevice2, hmDevice3, hmDevice4).ordinal()];
        boolean z3 = true;
        if (i5 == 1 || i5 == 2) {
            z3 = false;
        }
        if (z3) {
            i4 = 0;
        }
        view.setVisibility(i4);
    }

    @InterfaceC0879d({"setAdapter"})
    public static final void v(@d RecyclerView recyclerView, @e com.harman.jbl.partybox.ui.party.auracast.ui.a<?> aVar) {
        F.p(recyclerView, "recyclerView");
        if (aVar != null) {
            recyclerView.setAdapter(aVar);
        }
    }

    @InterfaceC0879d({"bind:connectStatus", "bind:connectedQueue", "bind:connectingQueue"})
    public static final void w(@d HmCustomFontTextView textView, @e HmDevice hmDevice, @e List<? extends HmDevice> list, @e List<? extends HmDevice> list2) {
        F.p(textView, "textView");
        if (hmDevice == null) {
            textView.setVisibility(8);
            return;
        }
        if (list != null && list.contains(hmDevice)) {
            textView.setVisibility(0);
            textView.setText(a.i.f1377i);
            textView.setTextColor(Color.parseColor("#92F1BE"));
        } else {
            if (list2 != null && list2.contains(hmDevice)) {
                if (list2.indexOf(hmDevice) == 0) {
                    textView.setVisibility(0);
                    textView.setText(a.i.f1378j);
                    textView.setTextColor(Color.parseColor("#92F1BE"));
                    return;
                } else {
                    textView.setVisibility(0);
                    textView.setText(a.i.f1360U);
                    textView.setTextColor(Color.parseColor("#277DF6"));
                    return;
                }
            }
            textView.setVisibility(8);
        }
    }

    @InterfaceC0879d({"deviceName"})
    public static final void x(@d HmCustomFontTextView textView, @e HmDevice hmDevice) {
        boolean S12;
        boolean S13;
        F.p(textView, "textView");
        if (hmDevice == null) {
            textView.setText("");
            return;
        }
        if (com.harman.jbl.partybox.persistence.a.h("ENABLE_SHOW_MAC")) {
            String n4 = hmDevice.n();
            String p4 = hmDevice.p();
            S13 = z.S1(p4);
            if (S13) {
                p4 = com.harman.sdk.utils.d.o(hmDevice.q());
            }
            textView.setText("[" + n4 + "]" + ((Object) p4));
            return;
        }
        String p5 = hmDevice.p();
        S12 = z.S1(p5);
        if (S12) {
            p5 = com.harman.sdk.utils.d.o(hmDevice.q());
        }
        textView.setText(p5);
    }

    @InterfaceC0879d({"bind:deviceName", "bind:connectedQueue", "bind:connectingQueue"})
    public static final void y(@d HmCustomFontTextView textView, @e HmDevice hmDevice, @e List<? extends HmDevice> list, @e List<? extends HmDevice> list2) {
        boolean S12;
        boolean S13;
        F.p(textView, "textView");
        if (hmDevice == null) {
            textView.setText("");
            return;
        }
        if ((list2 != null && list2.contains(hmDevice)) || (list != null && list.contains(hmDevice))) {
            textView.setMaxLines(1);
            textView.setMinLines(1);
        } else {
            textView.setMaxLines(2);
            textView.setMinLines(2);
        }
        if (com.harman.jbl.partybox.persistence.a.h("ENABLE_SHOW_MAC")) {
            String n4 = hmDevice.n();
            String p4 = hmDevice.p();
            S13 = z.S1(p4);
            if (S13) {
                p4 = com.harman.sdk.utils.d.o(hmDevice.q());
            }
            textView.setText("[" + n4 + "]" + ((Object) p4));
            return;
        }
        String p5 = hmDevice.p();
        S12 = z.S1(p5);
        if (S12) {
            p5 = com.harman.sdk.utils.d.o(hmDevice.q());
        }
        textView.setText(p5);
    }

    @InterfaceC0879d({"imageResource"})
    public static final void z(@d ImageView imageView, int i4) {
        F.p(imageView, "imageView");
        imageView.setImageResource(i4);
    }
}
