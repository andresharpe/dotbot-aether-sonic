package O1;

import android.os.ParcelUuid;
import com.harman.jbl.cd_biz_comm.utils.j;
import java.util.Map;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.U;
import kotlin.text.C2220b;

@U({"SMAP\nPartyboxParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartyboxParser.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/bleparser/PartyboxParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,208:1\n1#2:209\n1083#3,2:210\n*S KotlinDebug\n*F\n+ 1 PartyboxParser.kt\ncom/harman/jbl/cd_biz_comm/wireless_tech/bleparser/PartyboxParser\n*L\n184#1:210,2\n*E\n"})
/* loaded from: classes2.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f1714a = com.harman.sdk.impl.scan.e.f48064b;

    /* renamed from: b, reason: collision with root package name */
    private final ParcelUuid f1715b = ParcelUuid.fromString("0000fddf-0000-1000-8000-00805f9b34fb");

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0312, code lost:
    
        r10.put("Tws_Stereo_Group_ID", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.String> b(android.bluetooth.le.ScanResult r17) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.e.b(android.bluetooth.le.ScanResult):java.util.Map");
    }

    private final void d(String str, Map<String, String> map) {
        int a4;
        int a5;
        int a6;
        a4 = C2220b.a(16);
        int parseInt = Integer.parseInt(str, a4);
        if (240 == parseInt) {
            map.put("AC_Cable_Without_Battery", "1");
            return;
        }
        String b4 = j.b(new byte[]{(byte) parseInt});
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[EDGE_INSN: B:41:0x00bb->B:33:0x00bb BREAK  A[LOOP:0: B:26:0x009e->B:39:0x00b8], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    @Override // O1.d
    @l3.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice a(@l3.d android.bluetooth.le.ScanResult r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.e.a(android.bluetooth.le.ScanResult):com.harman.jbl.cd_biz_comm.wireless_tech.type.SpeakerDevice");
    }
}
