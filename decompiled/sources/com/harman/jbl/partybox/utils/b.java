package com.harman.jbl.partybox.utils;

import com.harman.analytics.deviceAws.DeviceAnalytics;
import com.harman.jbl.partybox.ui.effectlab.a;
import com.harman.sdk.device.PartyBoxDevice;
import jar.model.RequestPayloadDataDeviceAnalytics;
import java.util.LinkedHashMap;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    private static final String f46168a = "AWSAnalyticsLogHelper";

    private static final void a(RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics, int i4, int i5) {
        if (i4 != 8029) {
            if (i4 != 8031) {
                if (i4 != 8033) {
                    if (i4 != 8290) {
                        if (i4 == 8291) {
                            requestPayloadDataDeviceAnalytics.t5(Integer.valueOf(i5));
                            return;
                        }
                        return;
                    }
                    requestPayloadDataDeviceAnalytics.r5(Integer.valueOf(i5));
                    return;
                }
                requestPayloadDataDeviceAnalytics.p5(Integer.valueOf(i5));
                return;
            }
            requestPayloadDataDeviceAnalytics.n5(Integer.valueOf(i5));
            return;
        }
        requestPayloadDataDeviceAnalytics.l5(Integer.valueOf(i5));
    }

    public static final void b(@l3.d PartyBoxDevice device, @l3.d RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics) {
        F.p(device, "device");
        F.p(requestPayloadDataDeviceAnalytics, "requestPayloadDataDeviceAnalytics");
        DeviceAnalytics R02 = device.R0();
        if (R02 != null) {
            LinkedHashMap<String, Integer> n4 = R02.n();
            if (n4.size() >= 147) {
                String str = R02.m().get(0);
                com.harman.log.f.a(f46168a, "BLE_LOG processDeviceAnalytics twsOn : " + ((Object) str) + " = " + n4.get(R02.m().get(0)));
                requestPayloadDataDeviceAnalytics.W5(n4.get(R02.m().get(0)));
                requestPayloadDataDeviceAnalytics.X5(n4.get(R02.m().get(1)));
                requestPayloadDataDeviceAnalytics.c6(n4.get(R02.m().get(2)));
                requestPayloadDataDeviceAnalytics.a6(n4.get(R02.m().get(3)));
                requestPayloadDataDeviceAnalytics.b6(n4.get(R02.m().get(4)));
                requestPayloadDataDeviceAnalytics.Y5(n4.get(R02.m().get(5)));
                requestPayloadDataDeviceAnalytics.Z5(n4.get(R02.m().get(6)));
                requestPayloadDataDeviceAnalytics.d5(n4.get(R02.m().get(7)));
                requestPayloadDataDeviceAnalytics.e5(n4.get(R02.m().get(8)));
                requestPayloadDataDeviceAnalytics.g5(n4.get(R02.m().get(9)));
                requestPayloadDataDeviceAnalytics.f5(n4.get(R02.m().get(10)));
                requestPayloadDataDeviceAnalytics.u3(n4.get(R02.m().get(11)));
                requestPayloadDataDeviceAnalytics.v3(n4.get(R02.m().get(12)));
                requestPayloadDataDeviceAnalytics.L5(n4.get(R02.m().get(13)));
                requestPayloadDataDeviceAnalytics.T3(n4.get(R02.m().get(14)));
                requestPayloadDataDeviceAnalytics.R3(n4.get(R02.m().get(15)));
                requestPayloadDataDeviceAnalytics.S3(n4.get(R02.m().get(16)));
                requestPayloadDataDeviceAnalytics.i6(n4.get(R02.m().get(17)));
                requestPayloadDataDeviceAnalytics.f6(n4.get(R02.m().get(18)));
                requestPayloadDataDeviceAnalytics.k6(n4.get(R02.m().get(19)));
                requestPayloadDataDeviceAnalytics.j6(n4.get(R02.m().get(20)));
                requestPayloadDataDeviceAnalytics.g6(n4.get(R02.m().get(21)));
                requestPayloadDataDeviceAnalytics.l6(n4.get(R02.m().get(22)));
                requestPayloadDataDeviceAnalytics.h6(n4.get(R02.m().get(23)));
                requestPayloadDataDeviceAnalytics.D5(n4.get(R02.m().get(24)));
                requestPayloadDataDeviceAnalytics.C5(n4.get(R02.m().get(25)));
                requestPayloadDataDeviceAnalytics.S5(n4.get(R02.m().get(26)));
                requestPayloadDataDeviceAnalytics.V5(n4.get(R02.m().get(27)));
                requestPayloadDataDeviceAnalytics.R5(n4.get(R02.m().get(28)));
                requestPayloadDataDeviceAnalytics.T5(n4.get(R02.m().get(29)));
                requestPayloadDataDeviceAnalytics.N5(n4.get(R02.m().get(30)));
                requestPayloadDataDeviceAnalytics.Q5(n4.get(R02.m().get(31)));
                requestPayloadDataDeviceAnalytics.M5(n4.get(R02.m().get(32)));
                requestPayloadDataDeviceAnalytics.O5(n4.get(R02.m().get(33)));
                requestPayloadDataDeviceAnalytics.c5(n4.get(R02.m().get(34)));
                requestPayloadDataDeviceAnalytics.U5(n4.get(R02.m().get(35)));
                requestPayloadDataDeviceAnalytics.P5(n4.get(R02.m().get(36)));
                requestPayloadDataDeviceAnalytics.l3(n4.get(R02.m().get(37)));
                requestPayloadDataDeviceAnalytics.m3(n4.get(R02.m().get(38)));
                requestPayloadDataDeviceAnalytics.q3(n4.get(R02.m().get(39)));
                requestPayloadDataDeviceAnalytics.h5(n4.get(R02.m().get(40)));
                requestPayloadDataDeviceAnalytics.g3(n4.get(R02.m().get(41)));
                requestPayloadDataDeviceAnalytics.h3(n4.get(R02.m().get(42)));
                requestPayloadDataDeviceAnalytics.Y2(n4.get(R02.m().get(43)));
                requestPayloadDataDeviceAnalytics.w3(n4.get(R02.m().get(44)));
                requestPayloadDataDeviceAnalytics.j4(n4.get(R02.m().get(45)));
                requestPayloadDataDeviceAnalytics.K5(n4.get(R02.m().get(46)));
                requestPayloadDataDeviceAnalytics.i4(n4.get(R02.m().get(47)));
                requestPayloadDataDeviceAnalytics.n4(n4.get(R02.m().get(48)));
                requestPayloadDataDeviceAnalytics.g4(n4.get(R02.m().get(49)));
                requestPayloadDataDeviceAnalytics.Y3(n4.get(R02.m().get(50)));
                requestPayloadDataDeviceAnalytics.k4(n4.get(R02.m().get(51)));
                requestPayloadDataDeviceAnalytics.b4(n4.get(R02.m().get(52)));
                requestPayloadDataDeviceAnalytics.c4(n4.get(R02.m().get(53)));
                requestPayloadDataDeviceAnalytics.d4(n4.get(R02.m().get(54)));
                requestPayloadDataDeviceAnalytics.a4(n4.get(R02.m().get(55)));
                requestPayloadDataDeviceAnalytics.Z3(n4.get(R02.m().get(56)));
                requestPayloadDataDeviceAnalytics.m4(n4.get(R02.m().get(57)));
                requestPayloadDataDeviceAnalytics.l4(n4.get(R02.m().get(58)));
                requestPayloadDataDeviceAnalytics.f4(n4.get(R02.m().get(59)));
                requestPayloadDataDeviceAnalytics.e4(n4.get(R02.m().get(60)));
                requestPayloadDataDeviceAnalytics.p4(n4.get(R02.m().get(61)));
                requestPayloadDataDeviceAnalytics.o4(n4.get(R02.m().get(62)));
                requestPayloadDataDeviceAnalytics.X3(n4.get(R02.m().get(63)));
                requestPayloadDataDeviceAnalytics.W3(n4.get(R02.m().get(64)));
                requestPayloadDataDeviceAnalytics.h4(n4.get(R02.m().get(65)));
                requestPayloadDataDeviceAnalytics.x4(n4.get(R02.m().get(66)));
                requestPayloadDataDeviceAnalytics.t4(n4.get(R02.m().get(67)));
                requestPayloadDataDeviceAnalytics.q4(n4.get(R02.m().get(68)));
                requestPayloadDataDeviceAnalytics.w4(n4.get(R02.m().get(69)));
                requestPayloadDataDeviceAnalytics.r4(n4.get(R02.m().get(70)));
                requestPayloadDataDeviceAnalytics.u4(n4.get(R02.m().get(71)));
                requestPayloadDataDeviceAnalytics.v4(n4.get(R02.m().get(72)));
                requestPayloadDataDeviceAnalytics.s4(n4.get(R02.m().get(73)));
                requestPayloadDataDeviceAnalytics.T6(n4.get(R02.m().get(74)));
                requestPayloadDataDeviceAnalytics.V6(n4.get(R02.m().get(75)));
                requestPayloadDataDeviceAnalytics.U6(n4.get(R02.m().get(76)));
                requestPayloadDataDeviceAnalytics.m6(n4.get(R02.m().get(77)));
                requestPayloadDataDeviceAnalytics.x6(n4.get(R02.m().get(78)));
                requestPayloadDataDeviceAnalytics.I6(n4.get(R02.m().get(79)));
                requestPayloadDataDeviceAnalytics.M6(n4.get(R02.m().get(80)));
                requestPayloadDataDeviceAnalytics.N6(n4.get(R02.m().get(81)));
                requestPayloadDataDeviceAnalytics.O6(n4.get(R02.m().get(82)));
                requestPayloadDataDeviceAnalytics.P6(n4.get(R02.m().get(83)));
                requestPayloadDataDeviceAnalytics.Q6(n4.get(R02.m().get(84)));
                requestPayloadDataDeviceAnalytics.R6(n4.get(R02.m().get(85)));
                requestPayloadDataDeviceAnalytics.S6(n4.get(R02.m().get(86)));
                requestPayloadDataDeviceAnalytics.n6(n4.get(R02.m().get(87)));
                requestPayloadDataDeviceAnalytics.o6(n4.get(R02.m().get(88)));
                requestPayloadDataDeviceAnalytics.p6(n4.get(R02.m().get(89)));
                requestPayloadDataDeviceAnalytics.q6(n4.get(R02.m().get(90)));
                requestPayloadDataDeviceAnalytics.r6(n4.get(R02.m().get(91)));
                requestPayloadDataDeviceAnalytics.s6(n4.get(R02.m().get(92)));
                requestPayloadDataDeviceAnalytics.t6(n4.get(R02.m().get(93)));
                requestPayloadDataDeviceAnalytics.u6(n4.get(R02.m().get(94)));
                requestPayloadDataDeviceAnalytics.v6(n4.get(R02.m().get(95)));
                requestPayloadDataDeviceAnalytics.w6(n4.get(R02.m().get(96)));
                requestPayloadDataDeviceAnalytics.y6(n4.get(R02.m().get(97)));
                requestPayloadDataDeviceAnalytics.z6(n4.get(R02.m().get(98)));
                requestPayloadDataDeviceAnalytics.A6(n4.get(R02.m().get(99)));
                requestPayloadDataDeviceAnalytics.B6(n4.get(R02.m().get(100)));
                requestPayloadDataDeviceAnalytics.C6(n4.get(R02.m().get(101)));
                requestPayloadDataDeviceAnalytics.D6(n4.get(R02.m().get(102)));
                requestPayloadDataDeviceAnalytics.E6(n4.get(R02.m().get(a.b.f43494d)));
                requestPayloadDataDeviceAnalytics.F6(n4.get(R02.m().get(104)));
                requestPayloadDataDeviceAnalytics.G6(n4.get(R02.m().get(105)));
                requestPayloadDataDeviceAnalytics.H6(n4.get(R02.m().get(a.b.f43497g)));
                requestPayloadDataDeviceAnalytics.J6(n4.get(R02.m().get(a.b.f43498h)));
                requestPayloadDataDeviceAnalytics.K6(n4.get(R02.m().get(108)));
                requestPayloadDataDeviceAnalytics.L6(n4.get(R02.m().get(androidx.appcompat.app.i.f4871X)));
                requestPayloadDataDeviceAnalytics.M4(n4.get(R02.m().get(com.harman.analytics.deviceAws.a.f37826i)));
                requestPayloadDataDeviceAnalytics.K4(n4.get(R02.m().get(111)));
                requestPayloadDataDeviceAnalytics.z4(n4.get(R02.m().get(112)));
                requestPayloadDataDeviceAnalytics.H4(n4.get(R02.m().get(113)));
                requestPayloadDataDeviceAnalytics.L4(n4.get(R02.m().get(114)));
                requestPayloadDataDeviceAnalytics.A4(n4.get(R02.m().get(115)));
                requestPayloadDataDeviceAnalytics.G4(n4.get(R02.m().get(116)));
                requestPayloadDataDeviceAnalytics.B4(n4.get(R02.m().get(117)));
                requestPayloadDataDeviceAnalytics.E4(n4.get(R02.m().get(118)));
                requestPayloadDataDeviceAnalytics.S4(n4.get(R02.m().get(119)));
                requestPayloadDataDeviceAnalytics.U4(n4.get(R02.m().get(120)));
                requestPayloadDataDeviceAnalytics.T4(n4.get(R02.m().get(121)));
                requestPayloadDataDeviceAnalytics.N4(n4.get(R02.m().get(122)));
                requestPayloadDataDeviceAnalytics.O4(n4.get(R02.m().get(123)));
                requestPayloadDataDeviceAnalytics.P4(n4.get(R02.m().get(124)));
                requestPayloadDataDeviceAnalytics.J4(n4.get(R02.m().get(125)));
                requestPayloadDataDeviceAnalytics.y4(n4.get(R02.m().get(126)));
                requestPayloadDataDeviceAnalytics.X4(n4.get(R02.m().get(kotlinx.coroutines.scheduling.q.f54649c)));
                requestPayloadDataDeviceAnalytics.W4(n4.get(R02.m().get(128)));
                requestPayloadDataDeviceAnalytics.I4(n4.get(R02.m().get(129)));
                requestPayloadDataDeviceAnalytics.C4(n4.get(R02.m().get(130)));
                requestPayloadDataDeviceAnalytics.F4(n4.get(R02.m().get(131)));
                requestPayloadDataDeviceAnalytics.V4(n4.get(R02.m().get(132)));
                requestPayloadDataDeviceAnalytics.Q4(n4.get(R02.m().get(133)));
                requestPayloadDataDeviceAnalytics.D4(n4.get(R02.m().get(134)));
                requestPayloadDataDeviceAnalytics.R4(n4.get(R02.m().get(135)));
                requestPayloadDataDeviceAnalytics.Y4(n4.get(R02.m().get(com.harman.analytics.deviceAws.a.f37827j)));
                requestPayloadDataDeviceAnalytics.a5(n4.get(R02.m().get(137)));
                requestPayloadDataDeviceAnalytics.U3(n4.get(R02.m().get(138)));
                requestPayloadDataDeviceAnalytics.Z4(n4.get(R02.m().get(139)));
                requestPayloadDataDeviceAnalytics.b5(n4.get(R02.m().get(140)));
                requestPayloadDataDeviceAnalytics.V3(n4.get(R02.m().get(141)));
                requestPayloadDataDeviceAnalytics.H5(n4.get(R02.m().get(142)));
                requestPayloadDataDeviceAnalytics.I5(n4.get(R02.m().get(143)));
                requestPayloadDataDeviceAnalytics.G5(n4.get(R02.m().get(144)));
                requestPayloadDataDeviceAnalytics.E5(n4.get(R02.m().get(145)));
                requestPayloadDataDeviceAnalytics.J5(n4.get(R02.m().get(146)));
                requestPayloadDataDeviceAnalytics.F5(n4.get(R02.m().get(L1.a.f1556a)));
                String str2 = R02.m().get(L1.a.f1556a);
                com.harman.log.f.a(f46168a, "BLE_LOG processDeviceAnalytics popularEcho : " + ((Object) str2) + " = " + n4.get(R02.m().get(L1.a.f1556a)));
                d(requestPayloadDataDeviceAnalytics, R02, com.harman.analytics.deviceAws.a.f37828k, device);
                requestPayloadDataDeviceAnalytics.Z2(n4.get(R02.m().get(168)));
                String str3 = R02.m().get(168);
                com.harman.log.f.a(f46168a, "BLE_LOG processDeviceAnalytics auracastButton : " + ((Object) str3) + " = " + n4.get(R02.m().get(168)));
                requestPayloadDataDeviceAnalytics.a3(n4.get(R02.m().get(169)));
                requestPayloadDataDeviceAnalytics.b3(n4.get(R02.m().get(171)));
                String str4 = R02.m().get(172);
                com.harman.log.f.a(f46168a, "BLE_LOG processDeviceAnalytics auracastTransmitterTimes : " + ((Object) str4) + " = " + n4.get(R02.m().get(172)));
                requestPayloadDataDeviceAnalytics.f3(n4.get(R02.m().get(173)));
                requestPayloadDataDeviceAnalytics.e3(n4.get(R02.m().get(174)));
                requestPayloadDataDeviceAnalytics.d3(n4.get(R02.m().get(175)));
                requestPayloadDataDeviceAnalytics.c3(n4.get(R02.m().get(176)));
                requestPayloadDataDeviceAnalytics.N3(n4.get(R02.m().get(com.harman.analytics.deviceAws.a.f37830m)));
                requestPayloadDataDeviceAnalytics.O3(n4.get(R02.m().get(178)));
                requestPayloadDataDeviceAnalytics.P3(n4.get(R02.m().get(179)));
                requestPayloadDataDeviceAnalytics.Q3(n4.get(R02.m().get(180)));
                requestPayloadDataDeviceAnalytics.M3(n4.get(R02.m().get(181)));
                requestPayloadDataDeviceAnalytics.C3(n4.get(R02.m().get(182)));
                requestPayloadDataDeviceAnalytics.y3(n4.get(R02.m().get(183)));
                requestPayloadDataDeviceAnalytics.G3(n4.get(R02.m().get(184)));
                requestPayloadDataDeviceAnalytics.L3(n4.get(R02.m().get(185)));
                requestPayloadDataDeviceAnalytics.I3(n4.get(R02.m().get(186)));
                requestPayloadDataDeviceAnalytics.J3(n4.get(R02.m().get(187)));
                requestPayloadDataDeviceAnalytics.K3(n4.get(R02.m().get(188)));
                requestPayloadDataDeviceAnalytics.z3(n4.get(R02.m().get(189)));
                requestPayloadDataDeviceAnalytics.E3(n4.get(R02.m().get(190)));
                requestPayloadDataDeviceAnalytics.A3(n4.get(R02.m().get(191)));
                requestPayloadDataDeviceAnalytics.B3(n4.get(R02.m().get(192)));
                requestPayloadDataDeviceAnalytics.F3(n4.get(R02.m().get(193)));
                requestPayloadDataDeviceAnalytics.D3(n4.get(R02.m().get(194)));
                requestPayloadDataDeviceAnalytics.x3(n4.get(R02.m().get(195)));
                requestPayloadDataDeviceAnalytics.H3(n4.get(R02.m().get(196)));
                requestPayloadDataDeviceAnalytics.e6(n4.get(R02.m().get(com.harman.analytics.deviceAws.a.f37831n)));
                String str5 = R02.m().get(com.harman.analytics.deviceAws.a.f37831n);
                com.harman.log.f.a(f46168a, "BLE_LOG processDeviceAnalytics uacRecordTimes : " + ((Object) str5) + " = " + n4.get(R02.m().get(com.harman.analytics.deviceAws.a.f37831n)));
                requestPayloadDataDeviceAnalytics.d6(n4.get(R02.m().get(198)));
            }
            requestPayloadDataDeviceAnalytics.n3(R02.c());
            requestPayloadDataDeviceAnalytics.r3(R02.d());
            requestPayloadDataDeviceAnalytics.i3(R02.b());
            requestPayloadDataDeviceAnalytics.o3(R02.f());
            requestPayloadDataDeviceAnalytics.s3(R02.g());
            requestPayloadDataDeviceAnalytics.j3(R02.e());
            requestPayloadDataDeviceAnalytics.p3(R02.i());
            requestPayloadDataDeviceAnalytics.t3(R02.j());
            requestPayloadDataDeviceAnalytics.k3(R02.h());
            H0 h02 = H0.f51801a;
        }
    }

    private static final void c(RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics) {
        requestPayloadDataDeviceAnalytics.i5(Integer.valueOf(com.harman.sdk.utils.c.f48435d));
        requestPayloadDataDeviceAnalytics.l5(0);
        requestPayloadDataDeviceAnalytics.m5(Integer.valueOf(com.harman.sdk.utils.c.f48434c));
        requestPayloadDataDeviceAnalytics.n5(0);
        requestPayloadDataDeviceAnalytics.o5(Integer.valueOf(com.harman.sdk.utils.c.f48436e));
        requestPayloadDataDeviceAnalytics.p5(0);
        requestPayloadDataDeviceAnalytics.q5(Integer.valueOf(com.harman.sdk.utils.c.f48437f));
        requestPayloadDataDeviceAnalytics.r5(0);
        requestPayloadDataDeviceAnalytics.s5(Integer.valueOf(com.harman.sdk.utils.c.f48438g));
        requestPayloadDataDeviceAnalytics.t5(0);
        requestPayloadDataDeviceAnalytics.u5(0);
        requestPayloadDataDeviceAnalytics.v5(0);
        requestPayloadDataDeviceAnalytics.w5(0);
        requestPayloadDataDeviceAnalytics.x5(0);
        requestPayloadDataDeviceAnalytics.y5(0);
        requestPayloadDataDeviceAnalytics.z5(0);
        requestPayloadDataDeviceAnalytics.A5(0);
        requestPayloadDataDeviceAnalytics.B5(0);
        requestPayloadDataDeviceAnalytics.j5(0);
        requestPayloadDataDeviceAnalytics.k5(0);
    }

    private static final void d(RequestPayloadDataDeviceAnalytics requestPayloadDataDeviceAnalytics, DeviceAnalytics deviceAnalytics, int i4, PartyBoxDevice partyBoxDevice) {
        Integer num = 0;
        if (com.harman.sdk.utils.d.I(partyBoxDevice.q())) {
            c(requestPayloadDataDeviceAnalytics);
            for (int i5 = 0; i5 <= 9; i5 += 2) {
                int i6 = i4 + i5;
                Integer num2 = deviceAnalytics.n().get(deviceAnalytics.m().get(i6));
                if (num2 == null) {
                    num2 = num;
                }
                int intValue = num2.intValue();
                Integer num3 = deviceAnalytics.n().get(deviceAnalytics.m().get(i6 + 1));
                if (num3 == null) {
                    num3 = num;
                }
                a(requestPayloadDataDeviceAnalytics, intValue, num3.intValue());
            }
            return;
        }
        Integer num4 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4));
        if (num4 != null && num4.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.i5(num4);
            Integer num5 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 1));
            if (num5 == null) {
                num5 = num;
            }
            requestPayloadDataDeviceAnalytics.l5(num5);
        }
        Integer num6 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 2));
        if (num6 != null && num6.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.m5(num6);
            Integer num7 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 3));
            if (num7 == null) {
                num7 = num;
            }
            requestPayloadDataDeviceAnalytics.n5(num7);
        }
        Integer num8 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 4));
        if (num8 != null && num8.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.o5(num8);
            Integer num9 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 5));
            if (num9 == null) {
                num9 = num;
            }
            requestPayloadDataDeviceAnalytics.p5(num9);
        }
        Integer num10 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 6));
        if (num10 != null && num10.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.q5(num10);
            Integer num11 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 7));
            if (num11 == null) {
                num11 = num;
            }
            requestPayloadDataDeviceAnalytics.r5(num11);
        }
        Integer num12 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 8));
        if (num12 != null && num12.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.s5(num12);
            Integer num13 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 9));
            if (num13 == null) {
                num13 = num;
            }
            requestPayloadDataDeviceAnalytics.t5(num13);
        }
        Integer num14 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 10));
        if (num14 != null && num14.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.u5(num14);
            Integer num15 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 11));
            if (num15 == null) {
                num15 = num;
            }
            requestPayloadDataDeviceAnalytics.v5(num15);
        }
        Integer num16 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 12));
        if (num16 != null && num16.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.w5(num16);
            Integer num17 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 13));
            if (num17 == null) {
                num17 = num;
            }
            requestPayloadDataDeviceAnalytics.x5(num17);
        }
        Integer num18 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 14));
        if (num18 != null && num18.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.y5(num18);
            Integer num19 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 15));
            if (num19 == null) {
                num19 = num;
            }
            requestPayloadDataDeviceAnalytics.z5(num19);
        }
        Integer num20 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 16));
        if (num20 != null && num20.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.A5(num20);
            Integer num21 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 17));
            if (num21 == null) {
                num21 = num;
            }
            requestPayloadDataDeviceAnalytics.B5(num21);
        }
        Integer num22 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 18));
        if (num22 != null && num22.intValue() != 0) {
            requestPayloadDataDeviceAnalytics.j5(num22);
            Integer num23 = deviceAnalytics.n().get(deviceAnalytics.m().get(i4 + 19));
            if (num23 != null) {
                num = num23;
            }
            requestPayloadDataDeviceAnalytics.k5(num);
        }
    }
}
