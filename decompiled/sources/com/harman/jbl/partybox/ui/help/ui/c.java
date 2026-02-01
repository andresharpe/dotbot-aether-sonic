package com.harman.jbl.partybox.ui.help.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.harman.jbl.partybox.databinding.C1904m2;
import com.harman.jbl.partybox.j;
import kotlin.H0;
import kotlin.jvm.internal.F;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: I, reason: collision with root package name */
    @l3.d
    private final C1904m2 f43820I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(@l3.d com.harman.jbl.partybox.databinding.C1904m2 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.F.p(r3, r0)
            android.widget.LinearLayout r0 = r3.d()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.F.o(r0, r1)
            r2.<init>(r0)
            r2.f43820I = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.harman.jbl.partybox.ui.help.ui.c.<init>(com.harman.jbl.partybox.databinding.m2):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(X2.l onItemClick, f fVar, View view) {
        F.p(onItemClick, "$onItemClick");
        onItemClick.C(fVar);
    }

    public final void S(@l3.e final f fVar, @l3.d final X2.l<? super f, H0> onItemClick) {
        String str;
        String str2;
        boolean S12;
        h e4;
        h e5;
        F.p(onItemClick, "onItemClick");
        this.f43820I.d().setOnClickListener(new View.OnClickListener() { // from class: com.harman.jbl.partybox.ui.help.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.T(X2.l.this, fVar, view);
            }
        });
        TextView textView = this.f43820I.f39853G;
        if (fVar != null && (e5 = fVar.e()) != null) {
            str = e5.f();
        } else {
            str = null;
        }
        textView.setText(str);
        if (fVar != null && (e4 = fVar.e()) != null) {
            str2 = e4.g();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            S12 = z.S1(str2);
            if (!S12) {
                int r4 = com.harman.sdk.utils.d.r(this.f43820I.d().getContext(), str2, null);
                ImageView imageView = this.f43820I.f39852F;
                if (r4 == 0) {
                    r4 = j.f.f40979S1;
                }
                imageView.setImageResource(r4);
                return;
            }
        }
        this.f43820I.f39852F.setImageResource(j.f.f40979S1);
    }
}
