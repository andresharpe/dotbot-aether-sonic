package com.harman.sdk.impl.scan;

import java.util.Map;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.U;
import kotlin.p0;
import kotlin.text.C2220b;
import kotlin.text.C2226h;
import kotlin.text.z;

@U({"SMAP\nSpeakerBleBroadCastParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeakerBleBroadCastParser.kt\ncom/harman/sdk/impl/scan/SpeakerBleBroadCastParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,744:1\n1#2:745\n1083#3,2:746\n1083#3,2:748\n*S KotlinDebug\n*F\n+ 1 SpeakerBleBroadCastParser.kt\ncom/harman/sdk/impl/scan/SpeakerBleBroadCastParser\n*L\n549#1:746,2\n649#1:748,2\n*E\n"})
/* loaded from: classes2.dex */
public final class m implements B2.a {

    /* renamed from: a, reason: collision with root package name */
    @l3.d
    public static final a f48110a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l3.d
    private static final String f48111b = "BLEParser";

    /* renamed from: c, reason: collision with root package name */
    @l3.d
    public static final String f48112c = "0ecb";

    /* renamed from: d, reason: collision with root package name */
    @l3.d
    public static final String f48113d = "09";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    static final class b extends Lambda implements X2.l<Byte, CharSequence> {

        /* renamed from: F, reason: collision with root package name */
        public static final b f48114F = new b();

        b() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ CharSequence C(Byte b4) {
            return c(b4.byteValue());
        }

        @l3.d
        public final CharSequence c(byte b4) {
            return C2226h.J(b4, null, 1, null);
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends Lambda implements X2.l<Byte, CharSequence> {

        /* renamed from: F, reason: collision with root package name */
        public static final c f48115F = new c();

        c() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ CharSequence C(Byte b4) {
            return c(b4.byteValue());
        }

        @l3.d
        public final CharSequence c(byte b4) {
            return String.valueOf(p0.l(b4) & 255);
        }
    }

    /* loaded from: classes2.dex */
    static final class d extends Lambda implements X2.l<Byte, CharSequence> {

        /* renamed from: F, reason: collision with root package name */
        public static final d f48116F = new d();

        d() {
            super(1);
        }

        @Override // X2.l
        public /* bridge */ /* synthetic */ CharSequence C(Byte b4) {
            return c(b4.byteValue());
        }

        @l3.d
        public final CharSequence c(byte b4) {
            return String.valueOf(p0.l(b4) & 255);
        }
    }

    private final void c(String str, Map<String, String> map) {
        int a4;
        int a5;
        int a6;
        a4 = C2220b.a(16);
        int parseInt = Integer.parseInt(str, a4);
        if (240 == parseInt) {
            map.put("AC_Cable_Without_Battery", "1");
            return;
        }
        String b4 = com.harman.sdk.utils.g.b(new byte[]{(byte) parseInt});
        F.o(b4, "bytes2BinStr(...)");
        String substring = b4.substring(1, 8);
        F.o(substring, "substring(...)");
        a5 = C2220b.a(2);
        map.put("Device_Battery", String.valueOf(Integer.parseInt(substring, a5)));
        String substring2 = b4.substring(0, 1);
        F.o(substring2, "substring(...)");
        a6 = C2220b.a(2);
        map.put("Charging", String.valueOf(Integer.parseInt(substring2, a6)));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // B2.a
    @l3.d
    public java.util.Map<java.lang.String, java.lang.String> a(@l3.d android.bluetooth.le.ScanRecord r89) {
        /*
            Method dump skipped, instructions count: 6728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.sdk.impl.scan.m.a(android.bluetooth.le.ScanRecord):java.util.Map");
    }

    @l3.d
    public final String b(@l3.d String str) {
        int i4;
        int i5;
        String i22;
        int a4;
        F.p(str, "str");
        if (str.length() < 6) {
            return "";
        }
        String substring = str.substring(2, 4);
        F.o(substring, "substring(...)");
        String substring2 = str.substring(0, 2);
        F.o(substring2, "substring(...)");
        try {
            a4 = C2220b.a(16);
            i4 = Integer.parseInt(substring2, a4);
        } catch (NumberFormatException e4) {
            e4.printStackTrace();
            i4 = -1;
        }
        if (i4 < 1 || str.length() <= (i5 = (i4 * 2) + 2)) {
            return "";
        }
        if (F.g(f48113d, substring)) {
            String substring3 = str.substring(4, i5);
            F.o(substring3, "substring(...)");
            String k4 = com.harman.sdk.utils.g.k(substring3);
            if (k4 == null) {
                return "";
            }
            return k4;
        }
        String substring4 = str.substring(0, i5);
        F.o(substring4, "substring(...)");
        i22 = z.i2(str, substring4, "", false, 4, null);
        return b(i22);
    }
}
