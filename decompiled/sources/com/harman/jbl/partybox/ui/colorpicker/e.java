package com.harman.jbl.partybox.ui.colorpicker;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.P;
import androidx.lifecycle.j0;
import com.harman.jbl.partybox.h;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.ColorMode;
import kotlin.Pair;
import kotlin.jvm.internal.F;
import z2.i;

/* loaded from: classes2.dex */
public final class e extends j0 {

    /* renamed from: H, reason: collision with root package name */
    @l3.d
    private final P<Pair<Color, ColorMode>> f42296H = new P<>();

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private Color f42297I = new Color(255, 255, 255);

    /* renamed from: J, reason: collision with root package name */
    @l3.d
    private ColorMode f42298J = ColorMode.COLOR_LOOP;

    private final void u(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("di_action_type", L1.a.f1538V1);
        bundle.putString(L1.a.f1522R1, L1.a.f1480H);
        bundle.putString(L1.a.f1484I, str);
        bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(str2));
        K1.a.a(L1.a.f1514P1, bundle);
    }

    public final void A(@l3.e HmDevice hmDevice, @l3.d Color updatedColor) {
        F.p(updatedColor, "updatedColor");
        if (hmDevice != null) {
            T1.a.a("BLE_LOG ColorPicker, Connected Device = " + hmDevice + " Color = " + updatedColor);
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            z(updatedColor);
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 != null) {
                h12.q(updatedColor);
                h12.r(ColorMode.STATIC_COLOR);
            }
            i h4 = com.harman.sdk.b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.L(hmDevice, updatedColor, null);
            }
            u(L1.a.f1524S, partyBoxDevice.q());
        }
    }

    public final void B(@l3.d ColorMode colorMode) {
        F.p(colorMode, "<set-?>");
        this.f42298J = colorMode;
    }

    public final void C(@l3.e HmDevice hmDevice) {
        if (hmDevice != null) {
            T1.a.a("BLE_LOG ColorLoop, Connected Device = " + hmDevice);
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 != null) {
                h12.r(ColorMode.COLOR_LOOP);
            }
            i h4 = com.harman.sdk.b.f47608a.h(hmDevice);
            if (h4 != null) {
                h4.j0(hmDevice, true, null);
            }
            u(L1.a.f1528T, partyBoxDevice.q());
        }
    }

    @l3.d
    public final Color v() {
        return this.f42297I;
    }

    @l3.d
    public final LiveData<Pair<Color, ColorMode>> w() {
        return this.f42296H;
    }

    @l3.d
    public final ColorMode x() {
        return this.f42298J;
    }

    public final void y(@l3.e HmDevice hmDevice) {
        ColorMode d4;
        Color c4;
        if (hmDevice != null) {
            PartyBoxDevice partyBoxDevice = (PartyBoxDevice) hmDevice;
            PartyBoxLightShowSettings h12 = partyBoxDevice.h1();
            if (h12 != null && (c4 = h12.c()) != null) {
                z(c4);
            }
            PartyBoxLightShowSettings h13 = partyBoxDevice.h1();
            if (h13 != null && (d4 = h13.d()) != null) {
                this.f42298J = d4;
            }
            h.f40556a.b(this.f42296H, new Pair(this.f42297I, this.f42298J));
        }
    }

    public final void z(@l3.d Color value) {
        F.p(value, "value");
        if (F.g(value, new Color(0, 0, 0))) {
            value = new Color(255, 255, 255);
        }
        this.f42297I = value;
    }
}
