package y2;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.message.BaseMessage;
import com.harman.sdk.utils.DeviceProtocol;
import java.util.List;
import kotlin.jvm.internal.F;
import l3.d;
import l3.e;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2445a {

    /* renamed from: y2.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0551a {

        /* renamed from: y2.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0552a {
            public static void a(@d InterfaceC0551a interfaceC0551a, @d HmDevice device) {
                F.p(device, "device");
            }

            public static void b(@d InterfaceC0551a interfaceC0551a, @d HmDevice device) {
                F.p(device, "device");
            }
        }

        void a(@e HmDevice hmDevice, int i4, @d DeviceProtocol deviceProtocol);

        void b(@d HmDevice hmDevice);

        void c(@d HmDevice hmDevice);

        void d(@d BaseMessage baseMessage);
    }

    void a(@d HmDevice hmDevice, @d String str);

    @e
    List<DeviceProtocol> b();

    void c(@e InterfaceC0551a interfaceC0551a);

    void d(@e InterfaceC0551a interfaceC0551a);

    void e(boolean z3);

    void f(@d HmDevice hmDevice);

    boolean g();

    void h(@d String str, @d String str2);

    boolean i(@d DeviceProtocol deviceProtocol);

    void j(@d HmDevice hmDevice);

    void k(@d HmDevice hmDevice);

    /* renamed from: y2.a$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public static boolean a(@d InterfaceC2445a interfaceC2445a) {
            return false;
        }

        public static void b(@d InterfaceC2445a interfaceC2445a, @d HmDevice device) {
            F.p(device, "device");
        }

        public static void c(@d InterfaceC2445a interfaceC2445a, @d String deviceAddress, @d String secondaryAddress) {
            F.p(deviceAddress, "deviceAddress");
            F.p(secondaryAddress, "secondaryAddress");
        }

        public static void d(@d InterfaceC2445a interfaceC2445a, boolean z3) {
        }
    }
}
