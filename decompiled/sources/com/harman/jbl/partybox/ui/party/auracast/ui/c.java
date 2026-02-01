package com.harman.jbl.partybox.ui.party.auracast.ui;

import com.harman.jbl.partybox.databinding.J2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c extends a<J2> {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final AuracastViewModel f44873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@l3.d AuracastViewModel viewModel) {
        super(viewModel.n0().f());
        F.p(viewModel, "viewModel");
        this.f44873e = viewModel;
    }

    @Override // com.harman.jbl.partybox.ui.party.auracast.ui.a
    public int Q() {
        return j.i.f41477b2;
    }

    @Override // com.harman.jbl.partybox.ui.party.auracast.ui.a
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void O(@l3.d J2 binding, int i4) {
        HmDevice hmDevice;
        Object W22;
        F.p(binding, "binding");
        binding.w1(this.f44873e);
        List<HmDevice> P3 = P();
        if (P3 != null) {
            W22 = D.W2(P3, i4);
            hmDevice = (HmDevice) W22;
        } else {
            hmDevice = null;
        }
        binding.x1(hmDevice);
    }
}
