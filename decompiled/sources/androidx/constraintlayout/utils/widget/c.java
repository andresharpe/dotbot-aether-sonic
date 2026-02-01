package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.h;
import androidx.recyclerview.widget.n;

/* loaded from: classes.dex */
public class c extends View {

    /* renamed from: E, reason: collision with root package name */
    private Paint f9334E;

    /* renamed from: F, reason: collision with root package name */
    private Paint f9335F;

    /* renamed from: G, reason: collision with root package name */
    private Paint f9336G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f9337H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f9338I;

    /* renamed from: J, reason: collision with root package name */
    protected String f9339J;

    /* renamed from: K, reason: collision with root package name */
    private Rect f9340K;

    /* renamed from: L, reason: collision with root package name */
    private int f9341L;

    /* renamed from: M, reason: collision with root package name */
    private int f9342M;

    /* renamed from: N, reason: collision with root package name */
    private int f9343N;

    /* renamed from: O, reason: collision with root package name */
    private int f9344O;

    public c(Context context) {
        super(context);
        this.f9334E = new Paint();
        this.f9335F = new Paint();
        this.f9336G = new Paint();
        this.f9337H = true;
        this.f9338I = true;
        this.f9339J = null;
        this.f9340K = new Rect();
        this.f9341L = Color.argb(255, 0, 0, 0);
        this.f9342M = Color.argb(255, n.f.f18255b, n.f.f18255b, n.f.f18255b);
        this.f9343N = Color.argb(255, 50, 50, 50);
        this.f9344O = 4;
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.rj);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == h.m.tj) {
                    this.f9339J = obtainStyledAttributes.getString(index);
                } else if (index == h.m.wj) {
                    this.f9337H = obtainStyledAttributes.getBoolean(index, this.f9337H);
                } else if (index == h.m.sj) {
                    this.f9341L = obtainStyledAttributes.getColor(index, this.f9341L);
                } else if (index == h.m.uj) {
                    this.f9343N = obtainStyledAttributes.getColor(index, this.f9343N);
                } else if (index == h.m.vj) {
                    this.f9342M = obtainStyledAttributes.getColor(index, this.f9342M);
                } else if (index == h.m.xj) {
                    this.f9338I = obtainStyledAttributes.getBoolean(index, this.f9338I);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f9339J == null) {
            try {
                this.f9339J = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f9334E.setColor(this.f9341L);
        this.f9334E.setAntiAlias(true);
        this.f9335F.setColor(this.f9342M);
        this.f9335F.setAntiAlias(true);
        this.f9336G.setColor(this.f9343N);
        this.f9344O = Math.round(this.f9344O * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f9337H) {
            width--;
            height--;
            float f4 = width;
            float f5 = height;
            canvas.drawLine(0.0f, 0.0f, f4, f5, this.f9334E);
            canvas.drawLine(0.0f, f5, f4, 0.0f, this.f9334E);
            canvas.drawLine(0.0f, 0.0f, f4, 0.0f, this.f9334E);
            canvas.drawLine(f4, 0.0f, f4, f5, this.f9334E);
            canvas.drawLine(f4, f5, 0.0f, f5, this.f9334E);
            canvas.drawLine(0.0f, f5, 0.0f, 0.0f, this.f9334E);
        }
        String str = this.f9339J;
        if (str != null && this.f9338I) {
            this.f9335F.getTextBounds(str, 0, str.length(), this.f9340K);
            float width2 = (width - this.f9340K.width()) / 2.0f;
            float height2 = ((height - this.f9340K.height()) / 2.0f) + this.f9340K.height();
            this.f9340K.offset((int) width2, (int) height2);
            Rect rect = this.f9340K;
            int i4 = rect.left;
            int i5 = this.f9344O;
            rect.set(i4 - i5, rect.top - i5, rect.right + i5, rect.bottom + i5);
            canvas.drawRect(this.f9340K, this.f9336G);
            canvas.drawText(this.f9339J, width2, height2, this.f9335F);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9334E = new Paint();
        this.f9335F = new Paint();
        this.f9336G = new Paint();
        this.f9337H = true;
        this.f9338I = true;
        this.f9339J = null;
        this.f9340K = new Rect();
        this.f9341L = Color.argb(255, 0, 0, 0);
        this.f9342M = Color.argb(255, n.f.f18255b, n.f.f18255b, n.f.f18255b);
        this.f9343N = Color.argb(255, 50, 50, 50);
        this.f9344O = 4;
        a(context, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f9334E = new Paint();
        this.f9335F = new Paint();
        this.f9336G = new Paint();
        this.f9337H = true;
        this.f9338I = true;
        this.f9339J = null;
        this.f9340K = new Rect();
        this.f9341L = Color.argb(255, 0, 0, 0);
        this.f9342M = Color.argb(255, n.f.f18255b, n.f.f18255b, n.f.f18255b);
        this.f9343N = Color.argb(255, 50, 50, 50);
        this.f9344O = 4;
        a(context, attributeSet);
    }
}
