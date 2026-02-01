package A2;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.ota.RemoteOTAConfig;
import com.harman.sdk.utils.OTAStatus;
import java.util.Locale;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public interface a {
        void a(@d HmDevice hmDevice, @d OTAStatus oTAStatus, int i4);

        void b(@d HmDevice hmDevice, @d A2.a aVar);

        void c(@d HmDevice hmDevice, @e RemoteOTAConfig remoteOTAConfig);

        void d(@d HmDevice hmDevice, @e RemoteOTAConfig remoteOTAConfig);
    }

    void a(@d HmDevice hmDevice);

    void b(@d HmDevice hmDevice, @d String str);

    int c();

    void d(@d HmDevice hmDevice, @d RemoteOTAConfig remoteOTAConfig);

    void e(@d a aVar);

    void f(@d HmDevice hmDevice, @e Locale locale);

    long g();

    @e
    OTAStatus h();

    void i(@d HmDevice hmDevice, @d RemoteOTAConfig remoteOTAConfig);

    void j(@d HmDevice hmDevice);

    void k(@d a aVar);

    void l(@d HmDevice hmDevice);

    long m();

    int n();

    long o();
}
