package com.harman.jbl.partybox.ui.party.auracast.ui;

import com.harman.jbl.partybox.databinding.N2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.auracast.AuracastFragment;
import com.harman.jbl.partybox.ui.party.auracast.AuracastViewModel;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class e extends a<N2> {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final AuracastFragment f44875e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final AuracastViewModel f44876f;

    /* renamed from: g, reason: collision with root package name */
    private final int f44877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@l3.d AuracastFragment fragment, @l3.d AuracastViewModel viewModel) {
        super(viewModel.k0().f());
        F.p(fragment, "fragment");
        F.p(viewModel, "viewModel");
        this.f44875e = fragment;
        this.f44876f = viewModel;
        this.f44877g = j.i.f41485d2;
    }

    @Override // com.harman.jbl.partybox.ui.party.auracast.ui.a
    public int Q() {
        return this.f44877g;
    }

    @Override // com.harman.jbl.partybox.ui.party.auracast.ui.a
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void O(@l3.d N2 binding, int i4) {
        HmDevice hmDevice;
        Object W22;
        F.p(binding, "binding");
        binding.y1(this.f44875e);
        binding.z1(this.f44876f);
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
