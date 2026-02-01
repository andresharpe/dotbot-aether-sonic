package B2;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.DeviceProtocol;
import java.util.Collection;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public interface c {

    /* loaded from: classes2.dex */
    public interface b {
        void b(int i4, @e String str);

        void c(@d HmDevice hmDevice);

        void d(@d HmDevice hmDevice);

        void e(@d HmDevice hmDevice);
    }

    void a(boolean z3);

    void b(@d HmDevice hmDevice);

    void d();

    void e();

    void f();

    void g(@d Collection<? extends DeviceProtocol> collection, @d b bVar, @e B2.b bVar2);

    void h(@d Collection<? extends DeviceProtocol> collection, @d b bVar, @e B2.b bVar2, @e B2.a aVar);

    @d
    Collection<HmDevice> i();

    void j(@d Collection<? extends DeviceProtocol> collection, @d b bVar);

    boolean k(@d DeviceProtocol deviceProtocol);

    void l();

    /* loaded from: classes2.dex */
    public static final class a {
        public static void c(@d c cVar, @d HmDevice device) {
            F.p(device, "device");
        }

        public static void a(@d c cVar) {
        }

        public static void b(@d c cVar) {
        }

        public static void e(@d c cVar) {
        }

        public static void d(@d c cVar, boolean z3) {
        }
    }
}
