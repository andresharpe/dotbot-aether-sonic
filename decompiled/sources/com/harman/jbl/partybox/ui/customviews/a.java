package com.harman.jbl.partybox.ui.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.harman.jbl.partybox.j;
import com.harman.jbl.partybox.ui.widget.w;

/* loaded from: classes2.dex */
public class a extends ConstraintLayout implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: p0, reason: collision with root package name */
    private TextView f42634p0;

    /* renamed from: q0, reason: collision with root package name */
    private HmCustomVerticalSeekBar f42635q0;

    /* renamed from: r0, reason: collision with root package name */
    private w f42636r0;

    /* renamed from: s0, reason: collision with root package name */
    private b f42637s0;

    /* renamed from: t0, reason: collision with root package name */
    private InterfaceC0367a f42638t0;

    /* renamed from: u0, reason: collision with root package name */
    long f42639u0;

    /* renamed from: v0, reason: collision with root package name */
    long f42640v0;

    /* renamed from: w0, reason: collision with root package name */
    boolean f42641w0;

    /* renamed from: com.harman.jbl.partybox.ui.customviews.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0367a {
        void a(boolean z3, boolean z4, a aVar);
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i4, a aVar);
    }

    public a(Context context) {
        this(context, null);
    }

    private void L(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(j.i.f41388F1, (ViewGroup) this, true);
        this.f42634p0 = (TextView) findViewById(j.h.Ai);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.o.f41978h);
        String string = obtainStyledAttributes.getString(j.o.f41981i);
        obtainStyledAttributes.recycle();
        if (!TextUtils.isEmpty(string)) {
            this.f42634p0.setText(string);
        }
        HmCustomVerticalSeekBar hmCustomVerticalSeekBar = (HmCustomVerticalSeekBar) findViewById(j.h.je);
        this.f42635q0 = hmCustomVerticalSeekBar;
        hmCustomVerticalSeekBar.setOnSeekBarChangeListener(this);
    }

    public int getProgress() {
        return this.f42635q0.getProgress();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        Log.d(a.class.getSimpleName(), "onInterceptTouchEvent action: " + action);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        Log.d(a.class.getSimpleName(), "onInterceptTouchEvent ACTION_CANCEL");
                        this.f42641w0 = false;
                        setPressed(false);
                        InterfaceC0367a interfaceC0367a = this.f42638t0;
                        if (interfaceC0367a != null) {
                            interfaceC0367a.a(true, this.f42641w0, this);
                        }
                    }
                } else {
                    Log.d(a.class.getSimpleName(), "onInterceptTouchEvent ACTION_MOVE");
                    long currentTimeMillis = System.currentTimeMillis();
                    this.f42640v0 = currentTimeMillis;
                    if (currentTimeMillis - this.f42639u0 > 500) {
                        this.f42641w0 = true;
                    }
                    setPressed(true);
                    InterfaceC0367a interfaceC0367a2 = this.f42638t0;
                    if (interfaceC0367a2 != null) {
                        interfaceC0367a2.a(false, this.f42641w0, this);
                    }
                }
            } else {
                Log.d(a.class.getSimpleName(), "onInterceptTouchEvent ACTION_UP");
                this.f42641w0 = false;
                setPressed(false);
                InterfaceC0367a interfaceC0367a3 = this.f42638t0;
                if (interfaceC0367a3 != null) {
                    interfaceC0367a3.a(true, this.f42641w0, this);
                }
            }
        } else {
            Log.d(a.class.getSimpleName(), "onInterceptTouchEvent ACTION_DOWN");
            this.f42639u0 = System.currentTimeMillis();
            this.f42641w0 = false;
            setPressed(true);
            InterfaceC0367a interfaceC0367a4 = this.f42638t0;
            if (interfaceC0367a4 != null) {
                interfaceC0367a4.a(false, this.f42641w0, this);
            }
        }
        return false;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i4, boolean z3) {
        Log.d(a.class.getSimpleName(), "progress: " + i4);
        this.f42636r0.a(seekBar);
        b bVar = this.f42637s0;
        if (bVar != null) {
            bVar.a(i4, this);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        Log.d(a.class.getSimpleName(), "onStartTrackingTouch");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Log.d(a.class.getSimpleName(), "onStopTrackingTouch");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setBarSlideStopListener(InterfaceC0367a interfaceC0367a) {
        this.f42638t0 = interfaceC0367a;
    }

    public void setListener(b bVar) {
        this.f42637s0 = bVar;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42636r0 = new w();
        L(context, attributeSet);
    }
}
