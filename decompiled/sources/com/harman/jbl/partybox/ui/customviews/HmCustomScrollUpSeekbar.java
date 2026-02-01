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
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.utils.r;

/* loaded from: classes2.dex */
public class HmCustomScrollUpSeekbar extends ConstraintLayout {

    /* renamed from: A0, reason: collision with root package name */
    private ImageView f42493A0;

    /* renamed from: B0, reason: collision with root package name */
    private ImageView f42494B0;

    /* renamed from: C0, reason: collision with root package name */
    private HmCustomVerticalSeekBar f42495C0;

    /* renamed from: D0, reason: collision with root package name */
    private TextView f42496D0;

    /* renamed from: E0, reason: collision with root package name */
    private String f42497E0;

    /* renamed from: F0, reason: collision with root package name */
    private int f42498F0;

    /* renamed from: G0, reason: collision with root package name */
    private b f42499G0;

    /* renamed from: H0, reason: collision with root package name */
    private String f42500H0;

    /* renamed from: I0, reason: collision with root package name */
    @l3.d
    private String f42501I0;

    /* renamed from: p0, reason: collision with root package name */
    private ImageView f42502p0;

    /* renamed from: q0, reason: collision with root package name */
    private ImageView f42503q0;

    /* renamed from: r0, reason: collision with root package name */
    private ImageView f42504r0;

    /* renamed from: s0, reason: collision with root package name */
    private ImageView f42505s0;

    /* renamed from: t0, reason: collision with root package name */
    private ImageView f42506t0;

    /* renamed from: u0, reason: collision with root package name */
    private ImageView f42507u0;

    /* renamed from: v0, reason: collision with root package name */
    private ImageView f42508v0;

    /* renamed from: w0, reason: collision with root package name */
    private ImageView f42509w0;

    /* renamed from: x0, reason: collision with root package name */
    private ImageView f42510x0;

    /* renamed from: y0, reason: collision with root package name */
    private ImageView f42511y0;

    /* renamed from: z0, reason: collision with root package name */
    private ImageView f42512z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z3) {
            seekBar.setThumb(null);
            HmCustomScrollUpSeekbar hmCustomScrollUpSeekbar = HmCustomScrollUpSeekbar.this;
            if (hmCustomScrollUpSeekbar.V(hmCustomScrollUpSeekbar.f42500H0)) {
                HmCustomScrollUpSeekbar.this.W(i4);
                return;
            }
            if (i4 > 0 && i4 < 10) {
                HmCustomScrollUpSeekbar.this.setEchoPosition(0);
                HmCustomScrollUpSeekbar.this.S(0);
                HmCustomScrollUpSeekbar.this.f42496D0.setText(com.harman.jbl.partybox.ui.effectlab.a.f43472q);
                HmCustomScrollUpSeekbar.this.f42498F0 = 0;
                return;
            }
            if (i4 > 10 && i4 < 30) {
                HmCustomScrollUpSeekbar.this.setEchoPosition(2);
                HmCustomScrollUpSeekbar.this.S(1);
                HmCustomScrollUpSeekbar.this.f42496D0.setText("1");
                HmCustomScrollUpSeekbar.this.f42498F0 = 1;
                return;
            }
            if (i4 > 30 && i4 < 45) {
                HmCustomScrollUpSeekbar.this.setEchoPosition(4);
                HmCustomScrollUpSeekbar.this.S(2);
                HmCustomScrollUpSeekbar.this.f42496D0.setText("2");
                HmCustomScrollUpSeekbar.this.f42498F0 = 2;
                return;
            }
            if (i4 > 45 && i4 < 55) {
                HmCustomScrollUpSeekbar.this.setEchoPosition(6);
                HmCustomScrollUpSeekbar.this.S(3);
                HmCustomScrollUpSeekbar.this.f42496D0.setText("3");
                HmCustomScrollUpSeekbar.this.f42498F0 = 3;
                return;
            }
            if (i4 > 55 && i4 < 70) {
                HmCustomScrollUpSeekbar.this.setEchoPosition(8);
                HmCustomScrollUpSeekbar.this.S(4);
                HmCustomScrollUpSeekbar.this.f42496D0.setText(com.harman.jbl.partybox.ui.effectlab.a.f43467l);
                HmCustomScrollUpSeekbar.this.f42498F0 = 4;
                return;
            }
            if (i4 > 70 && i4 < 85) {
                HmCustomScrollUpSeekbar.this.setEchoPosition(10);
                HmCustomScrollUpSeekbar.this.S(5);
                HmCustomScrollUpSeekbar.this.f42496D0.setText("5");
                HmCustomScrollUpSeekbar.this.f42498F0 = 5;
                return;
            }
            if (i4 > 85) {
                HmCustomScrollUpSeekbar.this.setEchoPosition(12);
                HmCustomScrollUpSeekbar.this.S(6);
                HmCustomScrollUpSeekbar.this.f42496D0.setText("6");
                HmCustomScrollUpSeekbar.this.f42498F0 = 6;
                return;
            }
            HmCustomScrollUpSeekbar.this.f42498F0 = -1;
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
        void setEcoValue(String str, int i4);
    }

    public HmCustomScrollUpSeekbar(Context context) {
        super(context);
        this.f42497E0 = "";
        this.f42498F0 = -1;
        this.f42500H0 = "";
        this.f42501I0 = "";
        T(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(int i4) {
        if (this.f42498F0 != i4) {
            new r().a(this.f42495C0);
            this.f42498F0 = i4;
            b bVar = this.f42499G0;
            if (bVar != null) {
                bVar.setEcoValue(this.f42497E0, i4);
            }
        }
    }

    private void T(Context context) {
        LayoutInflater.from(context).inflate(j.i.f41510k, (ViewGroup) this, true);
        this.f42500H0 = com.harman.jbl.partybox.constants.a.f38353d0;
        this.f42495C0 = (HmCustomVerticalSeekBar) findViewById(j.h.a4);
        this.f42502p0 = (ImageView) findViewById(j.h.X9);
        this.f42503q0 = (ImageView) findViewById(j.h.ba);
        this.f42504r0 = (ImageView) findViewById(j.h.ca);
        this.f42505s0 = (ImageView) findViewById(j.h.da);
        this.f42506t0 = (ImageView) findViewById(j.h.ea);
        this.f42507u0 = (ImageView) findViewById(j.h.fa);
        this.f42509w0 = (ImageView) findViewById(j.h.ga);
        this.f42510x0 = (ImageView) findViewById(j.h.ha);
        this.f42511y0 = (ImageView) findViewById(j.h.ia);
        this.f42512z0 = (ImageView) findViewById(j.h.Y9);
        this.f42493A0 = (ImageView) findViewById(j.h.Z9);
        this.f42494B0 = (ImageView) findViewById(j.h.aa);
        ImageView imageView = (ImageView) findViewById(j.h.d4);
        this.f42508v0 = imageView;
        imageView.setVisibility(0);
        this.f42496D0 = (TextView) findViewById(j.h.c4);
        this.f42502p0.setBackground(C0669d.i(context, j.f.db));
        this.f42503q0.setBackground(C0669d.i(context, j.f.hb));
        this.f42504r0.setBackground(C0669d.i(context, j.f.ib));
        this.f42505s0.setBackground(C0669d.i(context, j.f.jb));
        this.f42506t0.setBackground(C0669d.i(context, j.f.kb));
        this.f42507u0.setBackground(C0669d.i(context, j.f.lb));
        this.f42509w0.setBackground(C0669d.i(context, j.f.mb));
        this.f42510x0.setBackground(C0669d.i(context, j.f.nb));
        this.f42511y0.setBackground(C0669d.i(context, j.f.ob));
        this.f42512z0.setBackground(C0669d.i(context, j.f.eb));
        this.f42493A0.setBackground(C0669d.i(context, j.f.fb));
        this.f42494B0.setBackground(C0669d.i(context, j.f.gb));
        this.f42495C0.setOnSeekBarChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V(String str) {
        return com.harman.sdk.utils.d.e0(str, this.f42501I0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(int i4) {
        if (i4 > 0 && i4 < 10) {
            setEchoPosition(0);
            S(0);
            this.f42496D0.setText(com.harman.jbl.partybox.ui.effectlab.a.f43472q);
            this.f42498F0 = 0;
            return;
        }
        if (i4 > 10 && i4 < 18) {
            setEchoPosition(1);
            S(1);
            this.f42496D0.setText("1");
            this.f42498F0 = 1;
            return;
        }
        if (i4 > 18 && i4 < 25) {
            setEchoPosition(2);
            S(2);
            this.f42496D0.setText("2");
            this.f42498F0 = 2;
            return;
        }
        if (i4 > 25 && i4 < 32) {
            setEchoPosition(3);
            S(3);
            this.f42496D0.setText("3");
            this.f42498F0 = 3;
            return;
        }
        if (i4 > 32 && i4 < 40) {
            setEchoPosition(4);
            S(4);
            this.f42496D0.setText(com.harman.jbl.partybox.ui.effectlab.a.f43467l);
            this.f42498F0 = 4;
            return;
        }
        if (i4 > 40 && i4 < 48) {
            setEchoPosition(5);
            S(5);
            this.f42496D0.setText("5");
            this.f42498F0 = 5;
            return;
        }
        if (i4 > 48 && i4 < 55) {
            setEchoPosition(6);
            S(6);
            this.f42496D0.setText("6");
            this.f42498F0 = 6;
            return;
        }
        if (i4 > 55 && i4 < 63) {
            setEchoPosition(7);
            S(7);
            this.f42496D0.setText("7");
            this.f42498F0 = 7;
            return;
        }
        if (i4 > 63 && i4 < 70) {
            setEchoPosition(8);
            S(8);
            this.f42496D0.setText("8");
            this.f42498F0 = 8;
            return;
        }
        if (i4 > 70 && i4 < 77) {
            setEchoPosition(9);
            S(9);
            this.f42496D0.setText("9");
            this.f42498F0 = 9;
            return;
        }
        if (i4 > 77 && i4 < 85) {
            setEchoPosition(10);
            S(10);
            this.f42496D0.setText("10");
            this.f42498F0 = 10;
            return;
        }
        if (i4 > 85 && i4 < 92) {
            setEchoPosition(11);
            S(11);
            this.f42496D0.setText("11");
            this.f42498F0 = 11;
            return;
        }
        if (i4 > 92) {
            setEchoPosition(12);
            S(12);
            this.f42496D0.setText("12");
            this.f42498F0 = 12;
            return;
        }
        this.f42498F0 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEchoPosition(int i4) {
        switch (i4) {
            case 0:
                this.f42508v0.setVisibility(0);
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                return;
            case 1:
                this.f42502p0.setVisibility(0);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 2:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(0);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 3:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(0);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 4:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(0);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 5:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(0);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 6:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(0);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 7:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(0);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 8:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(0);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 9:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(0);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 10:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(0);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 11:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(0);
                this.f42494B0.setVisibility(8);
                this.f42508v0.setVisibility(8);
                return;
            case 12:
                this.f42502p0.setVisibility(8);
                this.f42503q0.setVisibility(8);
                this.f42504r0.setVisibility(8);
                this.f42505s0.setVisibility(8);
                this.f42506t0.setVisibility(8);
                this.f42507u0.setVisibility(8);
                this.f42509w0.setVisibility(8);
                this.f42510x0.setVisibility(8);
                this.f42511y0.setVisibility(8);
                this.f42512z0.setVisibility(8);
                this.f42493A0.setVisibility(8);
                this.f42494B0.setVisibility(0);
                this.f42508v0.setVisibility(8);
                return;
            default:
                return;
        }
    }

    private void setSeekBarPosition(int i4) {
        if (V(this.f42500H0)) {
            switch (i4) {
                case 0:
                    this.f42495C0.setProgress(5);
                    return;
                case 1:
                    this.f42495C0.setProgress(15);
                    return;
                case 2:
                    this.f42495C0.setProgress(20);
                    return;
                case 3:
                    this.f42495C0.setProgress(30);
                    return;
                case 4:
                    this.f42495C0.setProgress(35);
                    return;
                case 5:
                    this.f42495C0.setProgress(45);
                    return;
                case 6:
                    this.f42495C0.setProgress(50);
                    return;
                case 7:
                    this.f42495C0.setProgress(60);
                    return;
                case 8:
                    this.f42495C0.setProgress(65);
                    return;
                case 9:
                    this.f42495C0.setProgress(75);
                    return;
                case 10:
                    this.f42495C0.setProgress(80);
                    return;
                case 11:
                    this.f42495C0.setProgress(90);
                    return;
                case 12:
                    this.f42495C0.setProgress(95);
                    return;
                default:
                    return;
            }
        }
        switch (i4) {
            case 0:
                this.f42495C0.setProgress(5);
                return;
            case 1:
                this.f42495C0.setProgress(20);
                return;
            case 2:
                this.f42495C0.setProgress(35);
                return;
            case 3:
                this.f42495C0.setProgress(50);
                return;
            case 4:
                this.f42495C0.setProgress(60);
                return;
            case 5:
                this.f42495C0.setProgress(75);
                return;
            case 6:
                this.f42495C0.setProgress(90);
                return;
            default:
                return;
        }
    }

    public void U() {
        this.f42495C0.setProgress(5);
    }

    public void setDevicePid(String str) {
        this.f42500H0 = str;
    }

    public void setFirmwareVer(@l3.d String str) {
        this.f42501I0 = str;
    }

    public void setListener(b bVar) {
        this.f42499G0 = bVar;
    }

    public void setSeekBarLevel(int i4) {
        setSeekBarPosition(i4);
    }

    public void setSubHdrValue(String str) {
        this.f42497E0 = str;
    }

    public HmCustomScrollUpSeekbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42497E0 = "";
        this.f42498F0 = -1;
        this.f42500H0 = "";
        this.f42501I0 = "";
        T(context);
    }

    public HmCustomScrollUpSeekbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f42497E0 = "";
        this.f42498F0 = -1;
        this.f42500H0 = "";
        this.f42501I0 = "";
        T(context);
    }
}
