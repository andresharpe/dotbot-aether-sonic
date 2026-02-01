package com.harman.sdk;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.harman.sdk.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0426a {
        public static int a(@d a aVar) {
            byte[] n4 = aVar.n();
            if (n4 != null) {
                return n4.length;
            }
            return 0;
        }

        public static void b(@d a aVar, int i4) {
        }
    }

    @e
    String a();

    @e
    byte[] b();

    boolean c();

    boolean d();

    void e(int i4);

    boolean f();

    byte g();

    boolean h();

    boolean hasNext();

    void i(@d String str, @e Object obj);

    void j(@e byte[] bArr);

    byte k();

    int l();

    void m(byte b4);

    @e
    byte[] n();

    @e
    a next();

    void o(long j4);

    void p(byte b4);

    @d
    BaseMessage q(@d HmDevice hmDevice, @d a aVar);

    @e
    Object r(@d String str);

    boolean s();

    long t();
}
