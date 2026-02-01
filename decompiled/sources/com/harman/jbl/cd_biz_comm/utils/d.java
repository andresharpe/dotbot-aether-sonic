package com.harman.jbl.cd_biz_comm.utils;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import androidx.annotation.N;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f37868a = {0, 49345, 49537, 320, 49921, 960, 640, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, 3648, 2560, 51905, 52097, 2880, 51457, 2496, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, 7680, 57025, 57217, 8000, 56577, 7616, 7296, 56385, 5120, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, 15360, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, 10240, 59585, 59777, 10560, 60161, 11200, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, 57409, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, 32000, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, 20480, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, 19968, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, 17280, 33601, 16640, 33217, 32897, 16448};

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f37869b;

    /* renamed from: c, reason: collision with root package name */
    private static String f37870c;

    /* renamed from: d, reason: collision with root package name */
    private static byte[] f37871d;

    /* renamed from: e, reason: collision with root package name */
    private static String f37872e;

    /* renamed from: f, reason: collision with root package name */
    private static byte[] f37873f;

    /* renamed from: g, reason: collision with root package name */
    private static String f37874g;

    public static String a(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder(str);
            for (int length = str.length(); length < 4; length = sb.length()) {
                sb.insert(0, com.harman.jbl.partybox.ui.effectlab.a.f43472q);
            }
            return sb.toString();
        }
        return str;
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b4 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b4)));
        }
        return sb.toString();
    }

    public static boolean c(String str) {
        String b4 = b(h());
        if (b4.equalsIgnoreCase(str)) {
            com.harman.jbl.cd_biz_comm.logger.d.a("CRC16", " CRC check ***PASSED***:  CRC from mobile Phone = " + b4 + ", CRC from partybox device =" + str);
            return true;
        }
        String b5 = b(j());
        if (b5.equalsIgnoreCase(str)) {
            com.harman.jbl.cd_biz_comm.logger.d.a("CRC16", " Shorter CRC check ***PASSED***:  CRC from mobile Phone = " + b5 + ", CRC from partybox device =" + str);
            return true;
        }
        String b6 = b(k());
        if (b6.equalsIgnoreCase(str)) {
            com.harman.jbl.cd_biz_comm.logger.d.a("CRC16", " Shorter CRC check ***PASSED***:  CRC2 from mobile Phone = " + b6 + ", CRC from partybox device =" + str);
            return true;
        }
        com.harman.jbl.cd_biz_comm.logger.d.a("CRC16", " Shorter CRC check !!!!FAILED!!!:  CRC from mobile Phone = " + b4 + ", short CRC from mobile Phone = " + b5 + ", short CRC2 from mobile Phone = " + b6 + ", CRC from partybox device =" + str);
        return false;
    }

    private static byte[] d(int i4) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putShort((short) i4);
        return allocate.array();
    }

    public static byte[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[]{0, 0};
        }
        int i4 = 0;
        for (byte b4 : l(str)) {
            i4 = f37868a[(i4 ^ b4) & 255] ^ (i4 >>> 8);
        }
        return d(i4);
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return b(new byte[]{0, 0});
        }
        int i4 = 0;
        for (byte b4 : l(str)) {
            i4 = f37868a[(i4 ^ b4) & 255] ^ (i4 >>> 8);
        }
        return b(d(i4));
    }

    public static String g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getName();
        }
        return null;
    }

    @N
    public static byte[] h() {
        byte[] bArr;
        String g4 = g();
        if (g4 == null) {
            return "".getBytes();
        }
        if (g4.equals(f37870c) && (bArr = f37869b) != null) {
            return bArr;
        }
        int i4 = 0;
        for (byte b4 : g4.getBytes()) {
            i4 = f37868a[(i4 ^ b4) & 255] ^ (i4 >>> 8);
        }
        f37870c = g4;
        byte[] d4 = d(i4);
        f37869b = d4;
        return d4;
    }

    @N
    public static String i() {
        return b(h());
    }

    public static byte[] j() {
        byte[] bArr;
        String g4 = g();
        if (g4 == null) {
            return "".getBytes();
        }
        if (g4.equals(f37872e) && (bArr = f37871d) != null) {
            return bArr;
        }
        int i4 = 0;
        for (byte b4 : Arrays.copyOf(g4.getBytes(), 31)) {
            i4 = f37868a[(i4 ^ b4) & 255] ^ (i4 >>> 8);
        }
        f37872e = g4;
        byte[] d4 = d(i4);
        f37871d = d4;
        return d4;
    }

    public static byte[] k() {
        byte[] bArr;
        String g4 = g();
        if (g4 == null) {
            return "".getBytes();
        }
        if (g4.equals(f37874g) && (bArr = f37873f) != null) {
            return bArr;
        }
        int i4 = 0;
        for (byte b4 : Arrays.copyOf(g4.getBytes(), 30)) {
            i4 = f37868a[(i4 ^ b4) & 255] ^ (i4 >>> 8);
        }
        f37874g = g4;
        byte[] d4 = d(i4);
        f37873f = d4;
        return d4;
    }

    public static byte[] l(String str) {
        byte[] bArr = new byte[6];
        String[] split = str.split("(\\:|\\-)");
        for (int i4 = 0; i4 < split.length; i4++) {
            bArr[i4] = (byte) ((Character.digit(split[i4].charAt(0), 16) << 4) + Character.digit(split[i4].charAt(1), 16));
        }
        return bArr;
    }
}
