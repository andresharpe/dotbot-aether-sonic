package com.harman.jbl.partybox.ui.help.ui;

import android.view.View;
import com.harman.jbl.partybox.databinding.C1919p2;
import kotlin.H0;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class k extends a {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final C1919p2 f43843I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(@l3.d com.harman.jbl.partybox.databinding.C1919p2 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.F.p(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.d()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.F.o(r0, r1)
            r2.<init>(r0)
            r2.f43843I = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.help.ui.k.<init>(com.harman.jbl.partybox.databinding.p2):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(X2.l onItemClick, f fVar, View view) {
        F.p(onItemClick, "$onItemClick");
        onItemClick.C(fVar);
    }

    public final void S(@l3.e final f fVar, @l3.d final X2.l<? super f, H0> onItemClick) {
        F.p(onItemClick, "onItemClick");
        this.f43843I.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.ui.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.T(X2.l.this, fVar, view);
            }
        });
    }
}
