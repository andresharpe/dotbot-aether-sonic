package com.harman.jbl.partybox.ui.ota;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.harman.sdk.device.HmDevice;
import com.harman.sdk.device.PartyBoxDevice;
import com.harman.sdk.message.AdvancedCustomEQPayload;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.harman.jbl.partybox.ui.ota.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2024j {

    /* renamed from: m, reason: collision with root package name */
    private static final String f44634m = "OTA_LOG";

    /* renamed from: n, reason: collision with root package name */
    private static final int f44635n = 100;

    /* renamed from: o, reason: collision with root package name */
    private static final int f44636o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static long f44637p = 0;

    /* renamed from: q, reason: collision with root package name */
    private static int f44638q = 768;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f44639r = true;

    /* renamed from: a, reason: collision with root package name */
    private Context f44640a;

    /* renamed from: c, reason: collision with root package name */
    private PartyBoxDevice f44642c;

    /* renamed from: g, reason: collision with root package name */
    private ByteArrayInputStream f44646g;

    /* renamed from: i, reason: collision with root package name */
    private String f44648i;

    /* renamed from: j, reason: collision with root package name */
    private Date f44649j;

    /* renamed from: k, reason: collision with root package name */
    private C2028n f44650k;

    /* renamed from: l, reason: collision with root package name */
    private c f44651l;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44641b = false;

    /* renamed from: d, reason: collision with root package name */
    private int f44643d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44644e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f44645f = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f44647h = 0;

    /* renamed from: com.harman.jbl.partybox.ui.ota.j$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2024j.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.harman.jbl.partybox.ui.ota.j$b */
    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44653a;

        b(int i4) {
            this.f44653a = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z3;
            if (valueAnimator != null) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C2024j c2024j = C2024j.this;
                if (this.f44653a != intValue) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c2024j.f44644e = z3;
                C2024j.this.s(intValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.harman.jbl.partybox.ui.ota.j$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(Long l4);

        void b(int i4);

        void c(d dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.harman.jbl.partybox.ui.ota.j$d */
    /* loaded from: classes2.dex */
    public enum d {
        OTA_FAIL,
        OTA_SUCCESS
    }

    private void e() {
        PartyBoxDevice partyBoxDevice = this.f44642c;
        if (partyBoxDevice != null) {
            partyBoxDevice.Z1(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        long j4;
        if (!f44639r) {
            return;
        }
        int i4 = this.f44645f;
        int i5 = f44638q;
        int i6 = (i4 + 1) * i5;
        int i7 = this.f44647h;
        if (i6 > i7) {
            j4 = i7 - (i4 * i5);
        } else {
            j4 = i5;
        }
        com.harman.log.f.a(f44634m, " computePacketAndSendDFUData Send DFU Data : mPackageIndex " + Integer.toHexString(this.f44645f) + " gFileLen = " + this.f44647h + " byteCount = " + j4);
        if (this.f44645f * f44638q < this.f44647h) {
            int i8 = (int) j4;
            byte[] bArr = new byte[i8 + 4];
            byte[] array = ByteBuffer.allocate(4).putInt(this.f44645f).array();
            System.arraycopy(array, 0, bArr, 0, array.length);
            O.f44533a.m(this.f44645f);
            this.f44646g.skip(this.f44645f * f44638q);
            this.f44646g.read(bArr, 4, i8);
            this.f44646g.reset();
            int i9 = (((this.f44645f * f44638q) + i8) * 100) / this.f44647h;
            if (!this.f44644e) {
                s(i9);
            }
            if (this.f44645f == 0) {
                this.f44649j = new Date();
            }
            int i10 = this.f44645f;
            if (i10 % 20 == 0) {
                if (i10 != 0) {
                    n(j4, 20, false);
                }
            } else if (j4 < f44638q) {
                n(j4, 20, true);
            }
            v(bArr);
        }
    }

    private void g() {
        this.f44651l.c(d.OTA_FAIL);
        d();
        e();
        this.f44642c.Z1(false);
    }

    private void h() {
        r(this.f44650k, new byte[]{-86, 42, 0});
        d();
        e();
        this.f44642c.Z1(false);
    }

    private void i(String str) {
        this.f44645f = 0;
        this.f44643d = 0;
        this.f44644e = false;
        try {
            O o4 = O.f44533a;
            if (o4.k()) {
                str = this.f44640a.getExternalFilesDir(null).getAbsoluteFile() + "/Firmware/PB_OTA.bin";
            }
            com.harman.log.f.a(f44634m, " initDfuFile()  dfuFilePath =" + str);
            this.f44648i = str;
            FileInputStream fileInputStream = new FileInputStream(str);
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            this.f44646g = byteArrayInputStream;
            int b4 = (int) com.harman.sdk.utils.e.b(byteArrayInputStream, this.f44642c);
            fileInputStream.close();
            this.f44647h = available;
            o4.n(available / f44638q);
            byte b5 = 1;
            if (this.f44642c.g1() > 0) {
                this.f44645f = (this.f44642c.g1() / f44638q) + 1;
            }
            com.harman.log.f.a(f44634m, " initDfuFile() BREAK POINT RESUME INDEX =" + this.f44645f + " :jblDeviceModel.getOtaDFUBreakPointDataBytes()=" + this.f44642c.g1());
            String p12 = this.f44642c.p1();
            com.harman.log.f.a(f44634m, " initDfuFile()serverFwStr = " + p12 + " deviceFwVersion = " + this.f44642c.w() + " OTADFUVersion = " + this.f44642c.s());
            if (com.harman.jbl.partybox.utils.p.a(this.f44642c.U0(), com.harman.jbl.partybox.utils.p.b(p12))) {
                this.f44645f = 0;
                this.f44642c.q2(0);
                b5 = 2;
            } else {
                q(this.f44642c.g1());
            }
            p(b4, available, com.harman.jbl.partybox.utils.p.c(p12), b5);
        } catch (Exception e4) {
            com.harman.log.f.a(f44634m, "File not found exception");
            e4.printStackTrace();
        }
    }

    private boolean j() {
        return this.f44641b;
    }

    private void n(long j4, int i4, boolean z3) {
        long time;
        long j5 = this.f44647h - (j4 * this.f44645f);
        Date date = new Date();
        if (this.f44649j == null) {
            this.f44649j = new Date();
        }
        if (z3) {
            time = 0;
        } else {
            time = date.getTime() - this.f44649j.getTime();
        }
        this.f44651l.a(Long.valueOf(((j5 / f44638q) * time) / i4));
        this.f44649j = new Date();
    }

    private void p(int i4, int i5, byte[] bArr, byte b4) {
        byte[] a4 = new com.harman.jbl.partybox.utils.e().a(i4);
        byte[] a5 = new com.harman.jbl.partybox.utils.e().a(i5);
        byte[] bArr2 = {-86, j2.b.f51040j, AdvancedCustomEQPayload.f48133O, a4[0], a4[1], a4[2], a4[3], a5[0], a5[1], a5[2], a5[3], bArr[0], bArr[1], bArr[2], b4};
        f44639r = true;
        r(this.f44650k, bArr2);
        f44637p = System.currentTimeMillis();
        O.f44533a.l(true);
    }

    private void q(long j4) {
        if (this.f44646g != null && this.f44648i != null) {
            try {
                int available = (int) ((100 * j4) / new FileInputStream(this.f44648i).available());
                if (j4 > 0) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setObjectValues(0, Integer.valueOf(available));
                    valueAnimator.setDuration(1000L);
                    valueAnimator.addUpdateListener(new b(available));
                    valueAnimator.start();
                    return;
                }
                return;
            } catch (Exception e4) {
                e4.printStackTrace();
                return;
            }
        }
        com.harman.log.f.b(f44634m, "BREAK_POINT_RESUME resetDFUFileStreamForBreakpoint but dfuFileStream == null || currentFirmwareFilePath == null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i4) {
        if (i4 > this.f44643d) {
            this.f44643d = i4;
            this.f44651l.b(i4);
        }
    }

    private void v(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 4];
        System.arraycopy(new byte[]{-86, 38}, 0, bArr2, 0, 2);
        byte[] array = ByteBuffer.allocate(4).putInt(bArr.length).array();
        System.arraycopy(new byte[]{array[2], array[3]}, 0, bArr2, 2, 2);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        r(this.f44650k, bArr2);
    }

    public static void z(boolean z3) {
        f44639r = z3;
    }

    public void d() {
        if (!f44639r) {
            e();
        }
    }

    public void k() {
        h();
        this.f44641b = true;
        com.harman.log.f.a(f44634m, " notifyDfuComplete");
    }

    public synchronized void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d();
        ByteArrayInputStream byteArrayInputStream = this.f44646g;
        if (byteArrayInputStream == null) {
            return;
        }
        byteArrayInputStream.reset();
        if (str.length() >= 4) {
            Integer.parseInt(str.substring(0, 2));
            int parseInt = Integer.parseInt(str.substring(2, 4), 16);
            if (parseInt == 1) {
                this.f44641b = false;
                new Handler(Looper.getMainLooper()).postDelayed(new a(), 50L);
            } else if (parseInt == 2) {
                this.f44645f++;
                this.f44641b = false;
                f();
            } else if (parseInt == 3) {
                k();
            } else {
                if (this.f44642c.A1()) {
                    return;
                }
                g();
            }
        }
    }

    public void m() {
        f44639r = true;
        String q4 = com.harman.jbl.partybox.persistence.a.q("LOCAL_FILE_PATH", "");
        com.harman.log.f.a(f44634m, " FirmwareUpgradeOperation running: firmware filepath =" + q4);
        i(q4);
    }

    public void o() {
        r(this.f44650k, new byte[]{-86, 35, 0});
    }

    public void r(C2028n c2028n, byte[] bArr) {
        String str;
        if (c2028n.o() != 3) {
            return;
        }
        try {
            str = com.harman.sdk.utils.g.d(bArr);
            try {
                c2028n.s(bArr);
            } catch (Exception e4) {
                e = e4;
                com.harman.log.f.b(f44634m, " sendSppCommand() failed for command=" + str + " exception e" + e);
                e.printStackTrace();
            }
        } catch (Exception e5) {
            e = e5;
            str = "";
        }
    }

    public void t(Context context) {
        this.f44640a = context;
    }

    public void u(HmDevice hmDevice) {
        this.f44642c = (PartyBoxDevice) hmDevice;
    }

    public void w() {
        if (j()) {
            com.harman.log.f.a(f44634m, " setOtaComplete OTA_SUCCESS");
            this.f44651l.c(d.OTA_SUCCESS);
        }
    }

    public void x(C2028n c2028n) {
        this.f44650k = c2028n;
    }

    public void y(c cVar) {
        this.f44651l = cVar;
    }
}
