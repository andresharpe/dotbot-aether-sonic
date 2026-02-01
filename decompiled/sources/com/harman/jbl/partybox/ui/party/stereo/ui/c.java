package com.harman.jbl.partybox.ui.party.stereo.ui;

import com.harman.jbl.partybox.databinding.AbstractC1939t3;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanFragment;
import com.harman.jbl.partybox.ui.party.stereo.StereoScanViewModel;
import com.harman.sdk.device.HmDevice;
import java.util.List;
import kotlin.collections.D;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class c extends com.harman.jbl.partybox.ui.party.auracast.ui.a<AbstractC1939t3> {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    private final StereoScanFragment f45361e;

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private final StereoScanViewModel f45362f;

    /* renamed from: g, reason: collision with root package name */
    private final int f45363g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@l3.d StereoScanFragment fragment, @l3.d StereoScanViewModel viewModel) {
        super(viewModel.e0().f());
        F.p(fragment, "fragment");
        F.p(viewModel, "viewModel");
        this.f45361e = fragment;
        this.f45362f = viewModel;
        this.f45363g = j.i.f41569y2;
    }

    @Override // com.harman.jbl.partybox.ui.party.auracast.ui.a
    public int Q() {
        return this.f45363g;
    }

    @Override // com.harman.jbl.partybox.ui.party.auracast.ui.a
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void O(@l3.d AbstractC1939t3 binding, int i4) {
        HmDevice hmDevice;
        Object W22;
        F.p(binding, "binding");
        binding.x1(this.f45361e);
        List<HmDevice> P3 = P();
        if (P3 != null) {
            W22 = D.W2(P3, i4);
            hmDevice = (HmDevice) W22;
        } else {
            hmDevice = null;
        }
        binding.w1(hmDevice);
    }
}
