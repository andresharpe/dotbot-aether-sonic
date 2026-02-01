package com.harman.jbl.partybox.ui;

import androidx.core.os.C0741d;
import com.blankj.utilcode.util.C1078a;
import com.harman.jbl.partybox.ui.core.PartyBoxDashboardActivity;
import com.harman.jbl.partylight.lib.EnterResp;
import com.harman.sdk.device.PartyBoxDevice;
import kotlin.NotImplementedError;
import kotlin.coroutines.c;
import l3.d;
import l3.e;

/* loaded from: classes2.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @d
    public static final b f42111b = new b();

    private b() {
    }

    @Override // com.harman.jbl.partybox.ui.a
    @e
    public Object a(@d c<? super EnterResp> cVar) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.harman.jbl.partybox.ui.a
    @e
    public Object b(@d PartyBoxDevice partyBoxDevice, @d c<? super EnterResp> cVar) {
        C1078a.C0(C0741d.a(), PartyBoxDashboardActivity.class);
        return new EnterResp(true, null, 2, null);
    }
}
