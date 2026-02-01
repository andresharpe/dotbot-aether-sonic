package com.harman.jbl.partybox.ui.party.mode;

import androidx.lifecycle.LiveData;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumJoinPartyResult;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPanelStyle;
import com.harman.jbl.partybox.ui.party.auracast.define.EnumPartyStyle;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public interface c {
    @d
    c a(@d HmDevice hmDevice);

    @d
    EnumJoinPartyResult b(@d HmDevice hmDevice, @e HmDevice hmDevice2, @e HmDevice hmDevice3, @e HmDevice hmDevice4);

    void c();

    void d();

    @d
    LiveData<HmDevice> e();

    void f(@d HmDevice hmDevice);

    @d
    LiveData<HmDevice> g();

    @d
    LiveData<HmDevice> h();

    @d
    LiveData<EnumPartyStyle> i();

    @d
    LiveData<HmDevice> j();

    @d
    LiveData<EnumPanelStyle> k();

    @d
    LiveData<HmDevice> l();

    @d
    LiveData<HmDevice> m();

    boolean n(@d HmDevice hmDevice, @e HmDevice hmDevice2, @d List<? extends HmDevice> list, @e HmDevice hmDevice3, @e HmDevice hmDevice4);
}
