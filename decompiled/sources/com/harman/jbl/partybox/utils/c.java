package com.harman.jbl.partybox.utils;

import a2.AbstractC0557b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.PartyBoxLightShowSettings;
import com.harman.sdk.utils.ColorMode;
import com.harman.sdk.utils.LightElements;
import java.util.Map;
import kotlin.jvm.internal.F;
import kotlin.text.C2220b;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final c f46169a = new c();

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46170a;

        static {
            int[] iArr = new int[LightElements.values().length];
            try {
                iArr[LightElements.LIGHT_EIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LightElements.LIGHT_STRIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LightElements.LIGHT_STAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE_UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LightElements.LIGHT_STROBE_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LightElements.LIGHT_SIDE_RING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f46170a = iArr;
        }
    }

    private c() {
    }

    @l3.d
    public final String a(int i4) {
        switch (i4) {
            case 1:
                return "horn";
            case 2:
                return "clapping";
            case 3:
                return L1.a.f1602j0;
            case 4:
                return L1.a.f1607k0;
            case 5:
                return L1.a.f1612l0;
            case 6:
                return "barking";
            case 7:
                return "like";
            case 8:
                return "boo";
            case 9:
                return "ready";
            case 10:
                return L1.a.f1637q0;
            case 11:
                return L1.a.f1642r0;
            case 12:
                return L1.a.f1647s0;
            case 13:
                return L1.a.f1652t0;
            case 14:
                return "party";
            case 15:
                return L1.a.f1660v0;
            case 16:
                return L1.a.f1664w0;
            case 17:
            case 18:
                return L1.a.f1672y0;
            case 19:
                return L1.a.f1676z0;
            default:
                return "";
        }
    }

    @l3.e
    public final String b(@l3.e Integer num) {
        String str;
        if (num != null) {
            str = "off";
            switch (num.intValue()) {
                case 1:
                    str = L1.a.f1455A2;
                    break;
                case 2:
                    str = L1.a.f1459B2;
                    break;
                case 3:
                    str = L1.a.f1463C2;
                    break;
                case 4:
                    str = L1.a.f1467D2;
                    break;
                case 5:
                    str = L1.a.f1471E2;
                    break;
                case 6:
                    str = L1.a.f1475F2;
                    break;
                case 7:
                    str = L1.a.f1479G2;
                    break;
                case 8:
                    str = "custom";
                    break;
                case 9:
                    str = "loop";
                    break;
                case 10:
                    str = L1.a.f1491J2;
                    break;
                case 11:
                    str = L1.a.f1495K2;
                    break;
                case 12:
                    str = L1.a.f1499L2;
                    break;
                case 13:
                    str = L1.a.f1503M2;
                    break;
            }
        } else {
            str = null;
        }
        return "light_pattern_" + str;
    }

    @l3.d
    public final String c(boolean z3) {
        if (z3) {
            return "on";
        }
        return "off";
    }

    public final boolean d(@l3.d Context context) {
        F.p(context, "context");
        Object systemService = context.getSystemService("connectivity");
        F.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
            return true;
        }
        return false;
    }

    @l3.d
    public final Bundle e(@l3.d PartyBoxDevice device) {
        String i4;
        int a4;
        Map<LightElements, Boolean> i5;
        Map<LightElements, Boolean> i6;
        Map<LightElements, Boolean> i7;
        Map<LightElements, Boolean> i8;
        Map<LightElements, Boolean> i9;
        Map<LightElements, Boolean> i10;
        Map<LightElements, Boolean> i11;
        ColorMode d4;
        F.p(device, "device");
        Bundle bundle = new Bundle();
        bundle.putString(L1.a.f1655u, com.harman.sdk.utils.d.v(device.q()));
        bundle.putString(L1.a.f1671y, com.harman.sdk.utils.j.b(device.n()));
        bundle.putString(L1.a.f1675z, com.harman.sdk.utils.l.a(device.n()));
        PartyBoxLightShowSettings h12 = device.h1();
        if (h12 == null || (d4 = h12.d()) == null || (i4 = d4.i()) == null) {
            i4 = ColorMode.COLOR_LOOP.i();
        }
        bundle.putString(L1.a.f1568c1, f(i4));
        String q4 = device.q();
        a4 = C2220b.a(16);
        for (AbstractC0557b abstractC0557b : new com.harman.jbl.partybox.ui.lightcontrol.c().t(Integer.parseInt(q4, a4))) {
            if (abstractC0557b instanceof a2.c) {
                boolean z3 = false;
                switch (a.f46170a[((a2.c) abstractC0557b).f().ordinal()]) {
                    case 1:
                        PartyBoxLightShowSettings h13 = device.h1();
                        if (h13 != null && (i5 = h13.i()) != null) {
                            z3 = F.g(i5.get(LightElements.LIGHT_EIGHT), Boolean.TRUE);
                        }
                        bundle.putString(L1.a.f1573d1, c(z3));
                        break;
                    case 2:
                        PartyBoxLightShowSettings h14 = device.h1();
                        if (h14 != null && (i6 = h14.i()) != null) {
                            z3 = F.g(i6.get(LightElements.LIGHT_STRIPE), Boolean.TRUE);
                        }
                        bundle.putString(L1.a.f1578e1, c(z3));
                        break;
                    case 3:
                        PartyBoxLightShowSettings h15 = device.h1();
                        if (h15 != null && (i7 = h15.i()) != null) {
                            z3 = F.g(i7.get(LightElements.LIGHT_STAR), Boolean.TRUE);
                        }
                        bundle.putString(L1.a.f1583f1, c(z3));
                        break;
                    case 4:
                        PartyBoxLightShowSettings h16 = device.h1();
                        if (h16 != null && (i8 = h16.i()) != null) {
                            z3 = F.g(i8.get(LightElements.LIGHT_STROBE), Boolean.TRUE);
                        }
                        bundle.putString(L1.a.f1588g1, c(z3));
                        break;
                    case 5:
                        PartyBoxLightShowSettings h17 = device.h1();
                        if (h17 != null && (i9 = h17.i()) != null) {
                            z3 = F.g(i9.get(LightElements.LIGHT_STROBE_UP), Boolean.TRUE);
                        }
                        bundle.putString("di_strobe_up_light_status", c(z3));
                        break;
                    case 6:
                        PartyBoxLightShowSettings h18 = device.h1();
                        if (h18 != null && (i10 = h18.i()) != null) {
                            z3 = F.g(i10.get(LightElements.LIGHT_STROBE_DOWN), Boolean.TRUE);
                        }
                        bundle.putString(L1.a.f1598i1, c(z3));
                        break;
                    case 7:
                        PartyBoxLightShowSettings h19 = device.h1();
                        if (h19 != null && (i11 = h19.i()) != null) {
                            z3 = F.g(i11.get(LightElements.LIGHT_SIDE_RING), Boolean.TRUE);
                        }
                        bundle.putString(L1.a.f1603j1, c(z3));
                        break;
                }
            }
        }
        return bundle;
    }

    @l3.d
    public final String f(@l3.d String colorMode) {
        F.p(colorMode, "colorMode");
        if (F.g(colorMode, ColorMode.COLOR_LOOP.i())) {
            return "loop";
        }
        return L1.a.f1565b3;
    }

    @l3.d
    public final String g(int i4) {
        switch (i4) {
            case 1:
            default:
                return L1.a.f1462C1;
            case 2:
                return L1.a.f1490J1;
            case 3:
                return L1.a.f1466D1;
            case 4:
                return L1.a.f1470E1;
            case 5:
                return L1.a.f1474F1;
            case 6:
                return L1.a.f1478G1;
            case 7:
                return L1.a.f1482H1;
            case 8:
                return L1.a.f1486I1;
            case 9:
                return L1.a.f1494K1;
            case 10:
                return L1.a.f1498L1;
            case 11:
                return L1.a.f1506N1;
            case 12:
                return L1.a.f1502M1;
            case 13:
                return L1.a.f1510O1;
        }
    }

    @l3.d
    public final String h(@l3.e Integer num) {
        if (num != null && num.intValue() == 0) {
            return "off";
        }
        if (num != null && num.intValue() == 1) {
            return L1.a.f1455A2;
        }
        if (num != null && num.intValue() == 2) {
            return L1.a.f1459B2;
        }
        if (num != null && num.intValue() == 3) {
            return L1.a.f1463C2;
        }
        if (num != null && num.intValue() == 4) {
            return L1.a.f1467D2;
        }
        if (num != null && num.intValue() == 5) {
            return L1.a.f1471E2;
        }
        if (num != null && num.intValue() == 6) {
            return L1.a.f1475F2;
        }
        if (num != null && num.intValue() == 7) {
            return L1.a.f1479G2;
        }
        if (num != null && num.intValue() == 8) {
            return "custom";
        }
        if (num != null && num.intValue() == 9) {
            return "loop";
        }
        if (num != null && num.intValue() == 10) {
            return L1.a.f1491J2;
        }
        if (num != null && num.intValue() == 11) {
            return L1.a.f1495K2;
        }
        if (num != null && num.intValue() == 12) {
            return L1.a.f1499L2;
        }
        if (num == null || num.intValue() != 13) {
            return "off";
        }
        return L1.a.f1503M2;
    }
}
