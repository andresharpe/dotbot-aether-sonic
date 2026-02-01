package com.harman.jbl.partybox.ui.ota;

/* renamed from: com.harman.jbl.partybox.ui.ota.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2023i {

    /* renamed from: b, reason: collision with root package name */
    private static final String f44632b = "i";

    /* renamed from: a, reason: collision with root package name */
    private C2028n f44633a;

    public void a() {
        if (C2024j.f44637p > 0) {
            C2024j.f44637p = 0L;
            com.harman.jbl.partybox.constants.a.f38346a.g("");
        }
        C2024j.z(false);
        b(this.f44633a, new byte[]{-86, j2.b.f51039i, 1, 1});
    }

    public void b(C2028n c2028n, byte[] bArr) {
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
                com.harman.log.f.b("OTA_LOG", " sendSppCommand() failed for command=" + str + " exception e" + e);
                e.printStackTrace();
            }
        } catch (Exception e5) {
            e = e5;
            str = "";
        }
    }

    public void c(C2028n c2028n) {
        this.f44633a = c2028n;
    }
}
