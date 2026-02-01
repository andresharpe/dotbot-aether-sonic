package com.harman.jbl.partybox.ui.help.ui;

import android.content.res.Resources;
import androidx.core.text.C0755c;
import com.harman.jbl.partybox.databinding.C1914o2;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.customviews.HmTextViewWithImage;
import com.harman.jbl.partybox.utils.q;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final C1914o2 f43831I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(@l3.d com.harman.jbl.partybox.databinding.C1914o2 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.F.p(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.d()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.F.o(r0, r1)
            r2.<init>(r0)
            r2.f43831I = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.help.ui.g.<init>(com.harman.jbl.partybox.databinding.o2):void");
    }

    public final void R(@l3.d Resources resources) {
        F.p(resources, "resources");
        this.f43831I.f39935F.setText(C0755c.a(resources.getString(j.m.q7), 0));
        HmTextViewWithImage unsupportedDevicesInfo = this.f43831I.f39935F;
        F.o(unsupportedDevicesInfo, "unsupportedDevicesInfo");
        q.e(unsupportedDevicesInfo);
    }
}
