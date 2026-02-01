package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0669d;
import androidx.core.provider.h;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.toneshifter.ToneShifterDialog;
import com.harman.jbl.partybox.utils.r;

/* loaded from: classes2.dex */
public class HmCustomUpDownSeekBar extends ConstraintLayout {

    /* renamed from: A0, reason: collision with root package name */
    private ImageView f42514A0;

    /* renamed from: B0, reason: collision with root package name */
    private ImageView f42515B0;

    /* renamed from: C0, reason: collision with root package name */
    private ImageView f42516C0;

    /* renamed from: D0, reason: collision with root package name */
    private ImageView f42517D0;

    /* renamed from: E0, reason: collision with root package name */
    private ImageView f42518E0;

    /* renamed from: F0, reason: collision with root package name */
    private TextView f42519F0;

    /* renamed from: G0, reason: collision with root package name */
    private TextView f42520G0;

    /* renamed from: H0, reason: collision with root package name */
    private int f42521H0;

    /* renamed from: I0, reason: collision with root package name */
    private String f42522I0;

    /* renamed from: J0, reason: collision with root package name */
    @l3.d
    private String f42523J0;

    /* renamed from: p0, reason: collision with root package name */
    private HmCustomVerticalSeekBar f42524p0;

    /* renamed from: q0, reason: collision with root package name */
    private String f42525q0;

    /* renamed from: r0, reason: collision with root package name */
    private b f42526r0;

    /* renamed from: s0, reason: collision with root package name */
    private ImageView f42527s0;

    /* renamed from: t0, reason: collision with root package name */
    private ImageView f42528t0;

    /* renamed from: u0, reason: collision with root package name */
    private ImageView f42529u0;

    /* renamed from: v0, reason: collision with root package name */
    private ImageView f42530v0;

    /* renamed from: w0, reason: collision with root package name */
    private ImageView f42531w0;

    /* renamed from: x0, reason: collision with root package name */
    private ImageView f42532x0;

    /* renamed from: y0, reason: collision with root package name */
    private ImageView f42533y0;

    /* renamed from: z0, reason: collision with root package name */
    private ImageView f42534z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z3) {
            seekBar.setThumb(null);
            if (HmCustomUpDownSeekBar.this.T()) {
                HmCustomUpDownSeekBar.this.V(i4);
                return;
            }
            if (i4 > 0 && i4 < 15) {
                HmCustomUpDownSeekBar.this.setBassPosition(-6);
                HmCustomUpDownSeekBar.this.R(0, "-3");
                HmCustomUpDownSeekBar.this.f42519F0.setText("-3");
                HmCustomUpDownSeekBar.this.f42521H0 = 0;
                return;
            }
            if (i4 > 15 && i4 < 30) {
                HmCustomUpDownSeekBar.this.setBassPosition(-4);
                HmCustomUpDownSeekBar.this.R(1, "-2");
                HmCustomUpDownSeekBar.this.f42519F0.setText("-2");
                HmCustomUpDownSeekBar.this.f42521H0 = 1;
                return;
            }
            if (i4 > 30 && i4 < 45) {
                HmCustomUpDownSeekBar.this.setBassPosition(-2);
                HmCustomUpDownSeekBar.this.R(2, "-1");
                HmCustomUpDownSeekBar.this.f42519F0.setText("-1");
                HmCustomUpDownSeekBar.this.f42521H0 = 2;
                return;
            }
            if (i4 > 45 && i4 < 55) {
                HmCustomUpDownSeekBar.this.setBassPosition(0);
                HmCustomUpDownSeekBar.this.R(3, com.harman.jbl.partybox.ui.effectlab.a.f43472q);
                HmCustomUpDownSeekBar.this.f42519F0.setText(com.harman.jbl.partybox.ui.effectlab.a.f43472q);
                HmCustomUpDownSeekBar.this.f42521H0 = 3;
                return;
            }
            if (i4 > 55 && i4 < 70) {
                HmCustomUpDownSeekBar.this.setBassPosition(2);
                HmCustomUpDownSeekBar.this.R(4, "1");
                HmCustomUpDownSeekBar.this.f42519F0.setText("1");
                HmCustomUpDownSeekBar.this.f42521H0 = 4;
                return;
            }
            if (i4 > 70 && i4 < 85) {
                HmCustomUpDownSeekBar.this.setBassPosition(4);
                HmCustomUpDownSeekBar.this.R(5, "2");
                HmCustomUpDownSeekBar.this.f42519F0.setText("2");
                HmCustomUpDownSeekBar.this.f42521H0 = 5;
                return;
            }
            if (i4 > 85) {
                HmCustomUpDownSeekBar.this.setBassPosition(6);
                HmCustomUpDownSeekBar.this.R(6, "3");
                HmCustomUpDownSeekBar.this.f42519F0.setText("3");
                HmCustomUpDownSeekBar.this.f42521H0 = 6;
                return;
            }
            HmCustomUpDownSeekBar.this.f42521H0 = -1;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void setValue(String str, int i4, String str2);
    }

    public HmCustomUpDownSeekBar(Context context) {
        super(context);
        this.f42525q0 = "";
        this.f42521H0 = -1;
        this.f42522I0 = "";
        this.f42523J0 = "";
        S(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i4, String str) {
        if (this.f42521H0 != i4) {
            this.f42521H0 = i4;
            new r().a(this.f42524p0);
            if (this.f42525q0.equals(com.harman.jbl.partybox.constants.a.f38347a0)) {
                this.f42526r0.setValue(this.f42525q0, this.f42521H0, str);
            } else if (this.f42525q0.equals(com.harman.jbl.partybox.constants.a.f38349b0)) {
                this.f42526r0.setValue(this.f42525q0, this.f42521H0, str);
            }
        }
    }

    private void S(Context context) {
        LayoutInflater.from(context).inflate(j.i.f41514l, (ViewGroup) this, true);
        this.f42524p0 = (HmCustomVerticalSeekBar) findViewById(j.h.je);
        this.f42527s0 = (ImageView) findViewById(j.h.me);
        this.f42528t0 = (ImageView) findViewById(j.h.ne);
        this.f42529u0 = (ImageView) findViewById(j.h.oe);
        this.f42534z0 = (ImageView) findViewById(j.h.pe);
        this.f42514A0 = (ImageView) findViewById(j.h.qe);
        this.f42515B0 = (ImageView) findViewById(j.h.re);
        this.f42530v0 = (ImageView) findViewById(j.h.se);
        this.f42531w0 = (ImageView) findViewById(j.h.te);
        this.f42532x0 = (ImageView) findViewById(j.h.ue);
        this.f42516C0 = (ImageView) findViewById(j.h.ve);
        this.f42517D0 = (ImageView) findViewById(j.h.we);
        this.f42518E0 = (ImageView) findViewById(j.h.xe);
        this.f42533y0 = (ImageView) findViewById(j.h.ye);
        this.f42519F0 = (TextView) findViewById(j.h.le);
        this.f42520G0 = (TextView) findViewById(j.h.ke);
        this.f42533y0.setVisibility(0);
        this.f42522I0 = com.harman.jbl.partybox.constants.a.f38353d0;
        this.f42527s0.setBackground(C0669d.i(context, j.f.pb));
        this.f42528t0.setBackground(C0669d.i(context, j.f.qb));
        this.f42529u0.setBackground(C0669d.i(context, j.f.rb));
        this.f42534z0.setBackground(C0669d.i(context, j.f.sb));
        this.f42514A0.setBackground(C0669d.i(context, j.f.tb));
        this.f42515B0.setBackground(C0669d.i(context, j.f.ub));
        this.f42530v0.setBackground(C0669d.i(context, j.f.vb));
        this.f42531w0.setBackground(C0669d.i(context, j.f.wb));
        this.f42532x0.setBackground(C0669d.i(context, j.f.xb));
        this.f42516C0.setBackground(C0669d.i(context, j.f.yb));
        this.f42517D0.setBackground(C0669d.i(context, j.f.zb));
        this.f42518E0.setBackground(C0669d.i(context, j.f.Ab));
        this.f42524p0.setOnSeekBarChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        return com.harman.sdk.utils.d.e0(this.f42522I0, this.f42523J0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i4) {
        if (i4 > 0 && i4 < 7) {
            setBassPosition(-6);
            R(0, "-6");
            this.f42519F0.setText("-6");
            this.f42521H0 = 0;
            return;
        }
        if (i4 > 7 && i4 < 15) {
            setBassPosition(-5);
            R(1, "-5");
            this.f42519F0.setText("-5");
            this.f42521H0 = 1;
            return;
        }
        if (i4 > 15 && i4 < 22) {
            setBassPosition(-4);
            R(2, "-4");
            this.f42519F0.setText("-4");
            this.f42521H0 = 2;
            return;
        }
        if (i4 > 22 && i4 < 30) {
            setBassPosition(-3);
            R(3, "-3");
            this.f42519F0.setText("-3");
            this.f42521H0 = 3;
            return;
        }
        if (i4 > 30 && i4 < 37) {
            setBassPosition(-2);
            R(4, "-2");
            this.f42519F0.setText("-2");
            this.f42521H0 = 4;
            return;
        }
        if (i4 > 37 && i4 < 45) {
            setBassPosition(-1);
            R(5, "-1");
            this.f42519F0.setText("-1");
            this.f42521H0 = 5;
            return;
        }
        if (i4 > 45 && i4 < 55) {
            setBassPosition(0);
            R(6, com.harman.jbl.partybox.ui.effectlab.a.f43472q);
            this.f42519F0.setText(com.harman.jbl.partybox.ui.effectlab.a.f43472q);
            this.f42521H0 = 6;
            return;
        }
        if (i4 > 55 && i4 < 63) {
            setBassPosition(1);
            R(7, "1");
            this.f42519F0.setText("1");
            this.f42521H0 = 7;
            return;
        }
        if (i4 > 63 && i4 < 70) {
            setBassPosition(2);
            R(8, "2");
            this.f42519F0.setText("2");
            this.f42521H0 = 8;
            return;
        }
        if (i4 > 70 && i4 < 77) {
            setBassPosition(3);
            R(9, "3");
            this.f42519F0.setText("3");
            this.f42521H0 = 9;
            return;
        }
        if (i4 > 77 && i4 < 85) {
            setBassPosition(4);
            R(10, com.harman.jbl.partybox.ui.effectlab.a.f43467l);
            this.f42519F0.setText(com.harman.jbl.partybox.ui.effectlab.a.f43467l);
            this.f42521H0 = 10;
            return;
        }
        if (i4 > 85 && i4 < 92) {
            setBassPosition(5);
            R(11, "5");
            this.f42519F0.setText("5");
            this.f42521H0 = 11;
            return;
        }
        if (i4 > 92) {
            setBassPosition(6);
            R(12, "6");
            this.f42519F0.setText("6");
            this.f42521H0 = 12;
            return;
        }
        this.f42521H0 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBassPosition(int i4) {
        switch (i4) {
            case -6:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(0);
                this.f42533y0.setVisibility(8);
                return;
            case ToneShifterDialog.TONESHIFTER_MIN /* -5 */:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(0);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case h.d.f12816f /* -4 */:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(0);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case -3:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(0);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case -2:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(0);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case -1:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(0);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case 0:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(0);
                return;
            case 1:
                this.f42527s0.setVisibility(0);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case 2:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(0);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case 3:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(0);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case 4:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(0);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case 5:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(0);
                this.f42515B0.setVisibility(8);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            case 6:
                this.f42527s0.setVisibility(8);
                this.f42528t0.setVisibility(8);
                this.f42529u0.setVisibility(8);
                this.f42534z0.setVisibility(8);
                this.f42514A0.setVisibility(8);
                this.f42515B0.setVisibility(0);
                this.f42530v0.setVisibility(8);
                this.f42531w0.setVisibility(8);
                this.f42532x0.setVisibility(8);
                this.f42516C0.setVisibility(8);
                this.f42517D0.setVisibility(8);
                this.f42518E0.setVisibility(8);
                this.f42533y0.setVisibility(8);
                return;
            default:
                return;
        }
    }

    private void setSeekBarPosition(int i4) {
        if (T()) {
            switch (i4) {
                case 0:
                    this.f42524p0.setProgress(5);
                    return;
                case 1:
                    this.f42524p0.setProgress(14);
                    return;
                case 2:
                    this.f42524p0.setProgress(20);
                    return;
                case 3:
                    this.f42524p0.setProgress(25);
                    return;
                case 4:
                    this.f42524p0.setProgress(35);
                    return;
                case 5:
                    this.f42524p0.setProgress(40);
                    return;
                case 6:
                    this.f42524p0.setProgress(50);
                    return;
                case 7:
                    this.f42524p0.setProgress(60);
                    return;
                case 8:
                    this.f42524p0.setProgress(65);
                    return;
                case 9:
                    this.f42524p0.setProgress(75);
                    return;
                case 10:
                    this.f42524p0.setProgress(80);
                    return;
                case 11:
                    this.f42524p0.setProgress(90);
                    return;
                case 12:
                    this.f42524p0.setProgress(95);
                    return;
                default:
                    return;
            }
        }
        switch (i4) {
            case 0:
                this.f42524p0.setProgress(5);
                return;
            case 1:
                this.f42524p0.setProgress(20);
                return;
            case 2:
                this.f42524p0.setProgress(35);
                return;
            case 3:
                this.f42524p0.setProgress(50);
                return;
            case 4:
                this.f42524p0.setProgress(60);
                return;
            case 5:
                this.f42524p0.setProgress(75);
                return;
            case 6:
                this.f42524p0.setProgress(90);
                return;
            default:
                return;
        }
    }

    public void U() {
        this.f42524p0.setProgress(50);
    }

    public void setDevicePid(String str) {
        this.f42522I0 = str;
    }

    public void setFirmwareVer(@l3.d String str) {
        this.f42523J0 = str;
    }

    public void setListener(b bVar) {
        this.f42526r0 = bVar;
    }

    public void setSeekBarLevel(int i4) {
        setSeekBarPosition(i4);
    }

    public void setSubHdrValue(String str) {
        this.f42525q0 = str;
        if (str.equals(com.harman.jbl.partybox.constants.a.f38347a0)) {
            this.f42520G0.setText(getResources().getString(j.m.n6));
        } else {
            this.f42520G0.setText(getResources().getString(j.m.P9));
        }
    }

    public HmCustomUpDownSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42525q0 = "";
        this.f42521H0 = -1;
        this.f42522I0 = "";
        this.f42523J0 = "";
        S(context);
    }

    public HmCustomUpDownSeekBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42525q0 = "";
        this.f42521H0 = -1;
        this.f42522I0 = "";
        this.f42523J0 = "";
        S(context);
    }
}
