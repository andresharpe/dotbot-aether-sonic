package z2;

import com.harman.sdk.device.HmDevice;
import com.harman.sdk.utils.Color;
import com.harman.sdk.utils.CustomLightPattern;
import com.harman.sdk.utils.LightElements;
import com.harman.sdk.utils.LightPattern;
import com.harman.sdk.utils.SoloPattern;
import com.harman.sdk.utils.SoloPatternMode;
import java.util.List;

/* loaded from: classes2.dex */
public interface i extends InterfaceC2449a {
    void A(@l3.e HmDevice hmDevice, @l3.d LightElements lightElements, boolean z3, @l3.e d dVar);

    void D0(@l3.e HmDevice hmDevice, int i4, @l3.e d dVar);

    void J(@l3.e HmDevice hmDevice, @l3.d LightPattern lightPattern, boolean z3, @l3.e d dVar);

    void L(@l3.e HmDevice hmDevice, @l3.d Color color, @l3.e d dVar);

    void O(@l3.e HmDevice hmDevice, @l3.d CustomLightPattern customLightPattern, @l3.e d dVar);

    void P(@l3.e HmDevice hmDevice, @l3.d LightPattern lightPattern, @l3.e d dVar);

    void S(@l3.e HmDevice hmDevice, @l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e d dVar);

    void W(@l3.e HmDevice hmDevice, @l3.d SoloPattern soloPattern, @l3.d SoloPatternMode soloPatternMode, @l3.e d dVar);

    void a(@l3.e HmDevice hmDevice, @l3.e d dVar);

    void b(@l3.e HmDevice hmDevice, int i4, @l3.e d dVar);

    void c(@l3.e HmDevice hmDevice, @l3.e String str, @l3.e String str2, @l3.e String str3, @l3.e d dVar);

    void d(@l3.e HmDevice hmDevice, @l3.e d dVar);

    void e(@l3.e HmDevice hmDevice, byte b4, @l3.e d dVar);

    void j0(@l3.e HmDevice hmDevice, boolean z3, @l3.e d dVar);

    void k0(@l3.e HmDevice hmDevice, @l3.e d dVar);

    void n(@l3.e HmDevice hmDevice, boolean z3, @l3.e d dVar);

    void p0(@l3.e HmDevice hmDevice, @l3.d List<CustomLightPattern> list, @l3.e d dVar);
}
