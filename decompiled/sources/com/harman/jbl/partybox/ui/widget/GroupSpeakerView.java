package com.harman.jbl.partybox.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.P;
import com.harman.jbl.partybox.j;

/* loaded from: classes2.dex */
public class GroupSpeakerView extends RelativeLayout {

    /* renamed from: O, reason: collision with root package name */
    public static String f45772O = "SINGLE";

    /* renamed from: P, reason: collision with root package name */
    public static String f45773P = "MULTICHANNEL_STEREO";

    /* renamed from: Q, reason: collision with root package name */
    public static String f45774Q = "MULTICHANNEL_MORE";

    /* renamed from: R, reason: collision with root package name */
    public static String f45775R = "PATTY";

    /* renamed from: E, reason: collision with root package name */
    private Context f45776E;

    /* renamed from: F, reason: collision with root package name */
    ImageView f45777F;

    /* renamed from: G, reason: collision with root package name */
    ImageView f45778G;

    /* renamed from: H, reason: collision with root package name */
    ImageView f45779H;

    /* renamed from: I, reason: collision with root package name */
    View f45780I;

    /* renamed from: J, reason: collision with root package name */
    View f45781J;

    /* renamed from: K, reason: collision with root package name */
    ImageView f45782K;

    /* renamed from: L, reason: collision with root package name */
    View f45783L;

    /* renamed from: M, reason: collision with root package name */
    ImageView f45784M;

    /* renamed from: N, reason: collision with root package name */
    TextView f45785N;

    public GroupSpeakerView(Context context) {
        super(context);
        a(context);
    }

    private void setResIds(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                this.f45780I.setVisibility(8);
                this.f45781J.setVisibility(8);
                this.f45777F.setVisibility(0);
                this.f45777F.setImageResource(iArr[0]);
                return;
            }
            if (iArr.length == 2) {
                this.f45777F.setVisibility(8);
                this.f45781J.setVisibility(8);
                this.f45780I.setVisibility(0);
                this.f45778G.setImageResource(iArr[0]);
                this.f45779H.setImageResource(iArr[0]);
                return;
            }
            if (iArr.length > 2) {
                this.f45777F.setVisibility(8);
                this.f45780I.setVisibility(8);
                this.f45781J.setVisibility(0);
                this.f45782K.setImageResource(iArr[0]);
            }
        }
    }

    public void a(Context context) {
        this.f45776E = context;
        View inflate = LayoutInflater.from(context).inflate(j.i.f41469Z2, this);
        this.f45780I = inflate.findViewById(j.h.Ii);
        this.f45777F = (ImageView) inflate.findViewById(j.h.vf);
        this.f45778G = (ImageView) inflate.findViewById(j.h.wf);
        this.f45779H = (ImageView) inflate.findViewById(j.h.xf);
        this.f45781J = inflate.findViewById(j.h.Hf);
        this.f45782K = (ImageView) inflate.findViewById(j.h.Ff);
        this.f45783L = inflate.findViewById(j.h.Cf);
        this.f45784M = (ImageView) inflate.findViewById(j.h.Af);
        this.f45785N = (TextView) inflate.findViewById(j.h.Bf);
    }

    public void b(String str, int... iArr) {
        if (!TextUtils.isEmpty(str) && iArr != null && iArr.length != 0) {
            if (f45772O.equals(str)) {
                this.f45780I.setVisibility(8);
                this.f45781J.setVisibility(8);
                this.f45783L.setVisibility(8);
                this.f45777F.setVisibility(0);
                this.f45777F.setImageResource(iArr[0]);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f45777F.getLayoutParams();
                int a4 = com.harman.jbl.partybox.utils.j.a(getContext(), 188.0f);
                layoutParams.height = a4;
                layoutParams.width = a4;
                return;
            }
            if (f45773P.equals(str)) {
                this.f45777F.setVisibility(8);
                this.f45781J.setVisibility(8);
                this.f45783L.setVisibility(8);
                this.f45780I.setVisibility(0);
                this.f45778G.setImageResource(iArr[1]);
                this.f45779H.setImageResource(iArr[0]);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f45778G.getLayoutParams();
                layoutParams2.width = com.harman.jbl.partybox.utils.j.a(getContext(), 188.0f);
                layoutParams2.height = com.harman.jbl.partybox.utils.j.a(getContext(), 188.0f);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f45779H.getLayoutParams();
                layoutParams3.width = com.harman.jbl.partybox.utils.j.a(getContext(), 188.0f);
                layoutParams3.height = com.harman.jbl.partybox.utils.j.a(getContext(), 188.0f);
                return;
            }
            if (f45774Q.equals(str)) {
                this.f45777F.setVisibility(8);
                this.f45780I.setVisibility(8);
                this.f45781J.setVisibility(8);
                this.f45783L.setVisibility(0);
                this.f45784M.setImageResource(iArr[0]);
                this.f45785N.setText("+" + iArr[1]);
                return;
            }
            if (f45775R.equals(str)) {
                this.f45777F.setVisibility(8);
                this.f45780I.setVisibility(8);
                this.f45783L.setVisibility(8);
                this.f45781J.setVisibility(0);
                this.f45782K.setImageResource(iArr[0]);
            }
        }
    }

    public void c(int i4, int i5) {
        this.f45780I.setVisibility(8);
        this.f45781J.setVisibility(8);
        this.f45783L.setVisibility(8);
        this.f45777F.setVisibility(0);
        this.f45777F.setImageResource(i4);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f45777F.getLayoutParams();
        layoutParams.height = i5;
        layoutParams.width = i5;
    }

    public GroupSpeakerView(Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public GroupSpeakerView(Context context, @P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a(context);
    }

    public GroupSpeakerView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        a(context);
    }
}
