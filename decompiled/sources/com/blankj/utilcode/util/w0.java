package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.InterfaceC0569l;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.InterfaceC0580x;
import androidx.core.content.C0669d;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a0, reason: collision with root package name */
    private static final int f25205a0 = -16777217;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f25206b0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f25207c0 = 1;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f25208d0 = 2;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f25209e0 = 3;

    /* renamed from: f0, reason: collision with root package name */
    private static final String f25210f0 = System.getProperty("line.separator");

    /* renamed from: A, reason: collision with root package name */
    private Typeface f25211A;

    /* renamed from: B, reason: collision with root package name */
    private Layout.Alignment f25212B;

    /* renamed from: C, reason: collision with root package name */
    private int f25213C;

    /* renamed from: D, reason: collision with root package name */
    private ClickableSpan f25214D;

    /* renamed from: E, reason: collision with root package name */
    private String f25215E;

    /* renamed from: F, reason: collision with root package name */
    private float f25216F;

    /* renamed from: G, reason: collision with root package name */
    private BlurMaskFilter.Blur f25217G;

    /* renamed from: H, reason: collision with root package name */
    private Shader f25218H;

    /* renamed from: I, reason: collision with root package name */
    private float f25219I;

    /* renamed from: J, reason: collision with root package name */
    private float f25220J;

    /* renamed from: K, reason: collision with root package name */
    private float f25221K;

    /* renamed from: L, reason: collision with root package name */
    private int f25222L;

    /* renamed from: M, reason: collision with root package name */
    private Object[] f25223M;

    /* renamed from: N, reason: collision with root package name */
    private Bitmap f25224N;

    /* renamed from: O, reason: collision with root package name */
    private Drawable f25225O;

    /* renamed from: P, reason: collision with root package name */
    private Uri f25226P;

    /* renamed from: Q, reason: collision with root package name */
    private int f25227Q;

    /* renamed from: R, reason: collision with root package name */
    private int f25228R;

    /* renamed from: S, reason: collision with root package name */
    private int f25229S;

    /* renamed from: T, reason: collision with root package name */
    private int f25230T;

    /* renamed from: U, reason: collision with root package name */
    private i f25231U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f25232V;

    /* renamed from: W, reason: collision with root package name */
    private int f25233W;

    /* renamed from: X, reason: collision with root package name */
    private final int f25234X;

    /* renamed from: Y, reason: collision with root package name */
    private final int f25235Y;

    /* renamed from: Z, reason: collision with root package name */
    private final int f25236Z;

    /* renamed from: a, reason: collision with root package name */
    private TextView f25237a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f25238b;

    /* renamed from: c, reason: collision with root package name */
    private int f25239c;

    /* renamed from: d, reason: collision with root package name */
    private int f25240d;

    /* renamed from: e, reason: collision with root package name */
    private int f25241e;

    /* renamed from: f, reason: collision with root package name */
    private int f25242f;

    /* renamed from: g, reason: collision with root package name */
    private int f25243g;

    /* renamed from: h, reason: collision with root package name */
    private int f25244h;

    /* renamed from: i, reason: collision with root package name */
    private int f25245i;

    /* renamed from: j, reason: collision with root package name */
    private int f25246j;

    /* renamed from: k, reason: collision with root package name */
    private int f25247k;

    /* renamed from: l, reason: collision with root package name */
    private int f25248l;

    /* renamed from: m, reason: collision with root package name */
    private int f25249m;

    /* renamed from: n, reason: collision with root package name */
    private int f25250n;

    /* renamed from: o, reason: collision with root package name */
    private int f25251o;

    /* renamed from: p, reason: collision with root package name */
    private int f25252p;

    /* renamed from: q, reason: collision with root package name */
    private float f25253q;

    /* renamed from: r, reason: collision with root package name */
    private float f25254r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f25255s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f25256t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f25257u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f25258v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f25259w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f25260x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f25261y;

    /* renamed from: z, reason: collision with root package name */
    private String f25262z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends ClickableSpan {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f25263E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ boolean f25264F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f25265G;

        a(int i4, boolean z3, View.OnClickListener onClickListener) {
            this.f25263E = i4;
            this.f25264F = z3;
            this.f25265G = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@androidx.annotation.N View view) {
            View.OnClickListener onClickListener = this.f25265G;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@androidx.annotation.N TextPaint textPaint) {
            textPaint.setColor(this.f25263E);
            textPaint.setUnderlineText(this.f25264F);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements LeadingMarginSpan {

        /* renamed from: a, reason: collision with root package name */
        private final int f25267a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25268b;

        /* renamed from: c, reason: collision with root package name */
        private final int f25269c;

        /* renamed from: d, reason: collision with root package name */
        private Path f25270d;

        /* synthetic */ c(int i4, int i5, int i6, a aVar) {
            this(i4, i5, i6);
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z3, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i9) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.f25267a);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.f25270d == null) {
                        Path path = new Path();
                        this.f25270d = path;
                        path.addCircle(0.0f, 0.0f, this.f25268b, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i4 + (i5 * this.f25268b), (i6 + i8) / 2.0f);
                    canvas.drawPath(this.f25270d, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle(i4 + (i5 * r10), (i6 + i8) / 2.0f, this.f25268b, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z3) {
            return (this.f25268b * 2) + this.f25269c;
        }

        private c(int i4, int i5, int i6) {
            this.f25270d = null;
            this.f25267a = i4;
            this.f25268b = i5;
            this.f25269c = i6;
        }
    }

    /* loaded from: classes.dex */
    static abstract class d extends ReplacementSpan {

        /* renamed from: G, reason: collision with root package name */
        static final int f25271G = 0;

        /* renamed from: H, reason: collision with root package name */
        static final int f25272H = 1;

        /* renamed from: I, reason: collision with root package name */
        static final int f25273I = 2;

        /* renamed from: J, reason: collision with root package name */
        static final int f25274J = 3;

        /* renamed from: E, reason: collision with root package name */
        final int f25275E;

        /* renamed from: F, reason: collision with root package name */
        private WeakReference<Drawable> f25276F;

        /* synthetic */ d(int i4, a aVar) {
            this(i4);
        }

        private Drawable a() {
            Drawable drawable;
            WeakReference<Drawable> weakReference = this.f25276F;
            if (weakReference != null) {
                drawable = weakReference.get();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                Drawable b4 = b();
                this.f25276F = new WeakReference<>(b4);
                return b4;
            }
            return drawable;
        }

        public abstract Drawable b();

        @Override // android.text.style.ReplacementSpan
        public void draw(@androidx.annotation.N Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, @androidx.annotation.N Paint paint) {
            int height;
            float height2;
            Drawable a4 = a();
            Rect bounds = a4.getBounds();
            canvas.save();
            if (bounds.height() < i8 - i6) {
                int i9 = this.f25275E;
                if (i9 == 3) {
                    height2 = i6;
                } else {
                    if (i9 == 2) {
                        height = ((i8 + i6) - bounds.height()) / 2;
                    } else if (i9 == 1) {
                        height2 = i7 - bounds.height();
                    } else {
                        height = i8 - bounds.height();
                    }
                    height2 = height;
                }
                canvas.translate(f4, height2);
            } else {
                canvas.translate(f4, i6);
            }
            a4.draw(canvas);
            canvas.restore();
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@androidx.annotation.N Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
            int i6;
            Rect bounds = a().getBounds();
            if (fontMetricsInt != null && (i6 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i7 = this.f25275E;
                if (i7 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else if (i7 == 2) {
                    int i8 = i6 / 4;
                    fontMetricsInt.top = ((-bounds.height()) / 2) - i8;
                    fontMetricsInt.bottom = (bounds.height() / 2) - i8;
                } else {
                    int i9 = -bounds.height();
                    int i10 = fontMetricsInt.bottom;
                    fontMetricsInt.top = i9 + i10;
                    fontMetricsInt.bottom = i10;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }

        private d() {
            this.f25275E = 0;
        }

        private d(int i4) {
            this.f25275E = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: K, reason: collision with root package name */
        private Drawable f25277K;

        /* renamed from: L, reason: collision with root package name */
        private Uri f25278L;

        /* renamed from: M, reason: collision with root package name */
        private int f25279M;

        /* synthetic */ e(int i4, int i5, a aVar) {
            this(i4, i5);
        }

        @Override // com.blankj.utilcode.util.w0.d
        public Drawable b() {
            Drawable drawable;
            Drawable drawable2 = this.f25277K;
            if (drawable2 == null) {
                BitmapDrawable bitmapDrawable = null;
                if (this.f25278L != null) {
                    try {
                        InputStream openInputStream = E0.a().getContentResolver().openInputStream(this.f25278L);
                        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(E0.a().getResources(), BitmapFactory.decodeStream(openInputStream));
                        try {
                            bitmapDrawable2.setBounds(0, 0, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight());
                            if (openInputStream != null) {
                                openInputStream.close();
                            }
                            return bitmapDrawable2;
                        } catch (Exception e4) {
                            e = e4;
                            bitmapDrawable = bitmapDrawable2;
                            Log.e("sms", "Failed to loaded content " + this.f25278L, e);
                            return bitmapDrawable;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                } else {
                    try {
                        drawable = C0669d.i(E0.a(), this.f25279M);
                        try {
                            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            return drawable;
                        } catch (Exception unused) {
                            Log.e("sms", "Unable to find resource: " + this.f25279M);
                            return drawable;
                        }
                    } catch (Exception unused2) {
                        drawable = null;
                    }
                }
            } else {
                return drawable2;
            }
        }

        /* synthetic */ e(Bitmap bitmap, int i4, a aVar) {
            this(bitmap, i4);
        }

        /* synthetic */ e(Drawable drawable, int i4, a aVar) {
            this(drawable, i4);
        }

        /* synthetic */ e(Uri uri, int i4, a aVar) {
            this(uri, i4);
        }

        private e(Bitmap bitmap, int i4) {
            super(i4, null);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(E0.a().getResources(), bitmap);
            this.f25277K = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.f25277K.getIntrinsicHeight());
        }

        private e(Drawable drawable, int i4) {
            super(i4, null);
            this.f25277K = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f25277K.getIntrinsicHeight());
        }

        private e(Uri uri, int i4) {
            super(i4, null);
            this.f25278L = uri;
        }

        private e(@InterfaceC0578v int i4, int i5) {
            super(i5, null);
            this.f25279M = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f implements LineHeightSpan {

        /* renamed from: c, reason: collision with root package name */
        static final int f25280c = 2;

        /* renamed from: d, reason: collision with root package name */
        static final int f25281d = 3;

        /* renamed from: e, reason: collision with root package name */
        static Paint.FontMetricsInt f25282e;

        /* renamed from: a, reason: collision with root package name */
        private final int f25283a;

        /* renamed from: b, reason: collision with root package name */
        final int f25284b;

        f(int i4, int i5) {
            this.f25283a = i4;
            this.f25284b = i5;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i4, int i5, int i6, int i7, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = f25282e;
            if (fontMetricsInt2 == null) {
                Paint.FontMetricsInt fontMetricsInt3 = new Paint.FontMetricsInt();
                f25282e = fontMetricsInt3;
                fontMetricsInt3.top = fontMetricsInt.top;
                fontMetricsInt3.ascent = fontMetricsInt.ascent;
                fontMetricsInt3.descent = fontMetricsInt.descent;
                fontMetricsInt3.bottom = fontMetricsInt.bottom;
                fontMetricsInt3.leading = fontMetricsInt.leading;
            } else {
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
                fontMetricsInt.leading = fontMetricsInt2.leading;
            }
            int i8 = this.f25283a;
            int i9 = fontMetricsInt.descent;
            int i10 = fontMetricsInt.ascent;
            int i11 = i8 - (((i7 + i9) - i10) - i6);
            if (i11 > 0) {
                int i12 = this.f25284b;
                if (i12 == 3) {
                    fontMetricsInt.descent = i9 + i11;
                } else if (i12 == 2) {
                    int i13 = i11 / 2;
                    fontMetricsInt.descent = i9 + i13;
                    fontMetricsInt.ascent = i10 - i13;
                } else {
                    fontMetricsInt.ascent = i10 - i11;
                }
            }
            int i14 = fontMetricsInt.bottom;
            int i15 = fontMetricsInt.top;
            int i16 = i8 - (((i7 + i14) - i15) - i6);
            if (i16 > 0) {
                int i17 = this.f25284b;
                if (i17 == 3) {
                    fontMetricsInt.bottom = i14 + i16;
                } else if (i17 == 2) {
                    int i18 = i16 / 2;
                    fontMetricsInt.bottom = i14 + i18;
                    fontMetricsInt.top = i15 - i18;
                } else {
                    fontMetricsInt.top = i15 - i16;
                }
            }
            if (i5 == ((Spanned) charSequence).getSpanEnd(this)) {
                f25282e = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g implements LeadingMarginSpan {

        /* renamed from: a, reason: collision with root package name */
        private final int f25285a;

        /* renamed from: b, reason: collision with root package name */
        private final int f25286b;

        /* renamed from: c, reason: collision with root package name */
        private final int f25287c;

        /* synthetic */ g(int i4, int i5, int i6, a aVar) {
            this(i4, i5, i6);
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i4, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9, int i10, boolean z3, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f25285a);
            canvas.drawRect(i4, i6, i4 + (this.f25286b * i5), i8, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z3) {
            return this.f25286b + this.f25287c;
        }

        private g(int i4, int i5, int i6) {
            this.f25285a = i4;
            this.f25286b = i5;
            this.f25287c = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ParcelCreator"})
    /* loaded from: classes.dex */
    public static class h extends TypefaceSpan {

        /* renamed from: E, reason: collision with root package name */
        private final Typeface f25288E;

        /* synthetic */ h(Typeface typeface, a aVar) {
            this(typeface);
        }

        private void a(Paint paint, Typeface typeface) {
            int style;
            Typeface typeface2 = paint.getTypeface();
            if (typeface2 == null) {
                style = 0;
            } else {
                style = typeface2.getStyle();
            }
            int i4 = style & (~typeface.getStyle());
            if ((i4 & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((i4 & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            a(textPaint, this.f25288E);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            a(textPaint, this.f25288E);
        }

        private h(Typeface typeface) {
            super("");
            this.f25288E = typeface;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i extends SpannableStringBuilder implements Serializable {

        /* renamed from: E, reason: collision with root package name */
        private static final long f25289E = 4909567650765875771L;

        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j extends CharacterStyle implements UpdateAppearance {

        /* renamed from: E, reason: collision with root package name */
        private Shader f25290E;

        /* synthetic */ j(Shader shader, a aVar) {
            this(shader);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.f25290E);
        }

        private j(Shader shader) {
            this.f25290E = shader;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends CharacterStyle implements UpdateAppearance {

        /* renamed from: E, reason: collision with root package name */
        private float f25291E;

        /* renamed from: F, reason: collision with root package name */
        private float f25292F;

        /* renamed from: G, reason: collision with root package name */
        private float f25293G;

        /* renamed from: H, reason: collision with root package name */
        private int f25294H;

        /* synthetic */ k(float f4, float f5, float f6, int i4, a aVar) {
            this(f4, f5, f6, i4);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.f25291E, this.f25292F, this.f25293G, this.f25294H);
        }

        private k(float f4, float f5, float f6, int i4) {
            this.f25291E = f4;
            this.f25292F = f5;
            this.f25293G = f6;
            this.f25294H = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l extends ReplacementSpan {

        /* renamed from: E, reason: collision with root package name */
        private final int f25295E;

        /* renamed from: F, reason: collision with root package name */
        private final Paint f25296F;

        /* synthetic */ l(int i4, int i5, a aVar) {
            this(i4, i5);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@androidx.annotation.N Canvas canvas, CharSequence charSequence, @androidx.annotation.F(from = 0) int i4, @androidx.annotation.F(from = 0) int i5, float f4, int i6, int i7, int i8, @androidx.annotation.N Paint paint) {
            canvas.drawRect(f4, i6, f4 + this.f25295E, i8, this.f25296F);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@androidx.annotation.N Paint paint, CharSequence charSequence, @androidx.annotation.F(from = 0) int i4, @androidx.annotation.F(from = 0) int i5, @androidx.annotation.P Paint.FontMetricsInt fontMetricsInt) {
            return this.f25295E;
        }

        private l(int i4) {
            this(i4, 0);
        }

        private l(int i4, int i5) {
            Paint paint = new Paint();
            this.f25296F = paint;
            this.f25295E = i4;
            paint.setColor(i5);
            paint.setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class m extends ReplacementSpan {

        /* renamed from: F, reason: collision with root package name */
        static final int f25297F = 2;

        /* renamed from: G, reason: collision with root package name */
        static final int f25298G = 3;

        /* renamed from: E, reason: collision with root package name */
        final int f25299E;

        m(int i4) {
            this.f25299E = i4;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@androidx.annotation.N Canvas canvas, CharSequence charSequence, int i4, int i5, float f4, int i6, int i7, int i8, @androidx.annotation.N Paint paint) {
            CharSequence subSequence = charSequence.subSequence(i4, i5);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f4, i7 - (((((fontMetricsInt.descent + i7) + i7) + fontMetricsInt.ascent) / 2) - ((i8 + i6) / 2)), paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@androidx.annotation.N Paint paint, CharSequence charSequence, int i4, int i5, @androidx.annotation.P Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence.subSequence(i4, i5).toString());
        }
    }

    private w0(TextView textView) {
        this();
        this.f25237a = textView;
    }

    private void M() {
        TextView textView = this.f25237a;
        if (textView != null && textView.getMovementMethod() == null) {
            this.f25237a.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    private void Z() {
        if (this.f25238b.length() == 0) {
            return;
        }
        int length = this.f25231U.length();
        if (length == 0 && this.f25242f != -1) {
            this.f25231U.append((CharSequence) Character.toString((char) 2)).append((CharSequence) "\n").setSpan(new AbsoluteSizeSpan(0), 0, 2, 33);
            length = 2;
        }
        this.f25231U.append(this.f25238b);
        int length2 = this.f25231U.length();
        if (this.f25213C != -1) {
            this.f25231U.setSpan(new m(this.f25213C), length, length2, this.f25239c);
        }
        if (this.f25240d != f25205a0) {
            this.f25231U.setSpan(new ForegroundColorSpan(this.f25240d), length, length2, this.f25239c);
        }
        if (this.f25241e != f25205a0) {
            this.f25231U.setSpan(new BackgroundColorSpan(this.f25241e), length, length2, this.f25239c);
        }
        if (this.f25247k != -1) {
            this.f25231U.setSpan(new LeadingMarginSpan.Standard(this.f25247k, this.f25248l), length, length2, this.f25239c);
        }
        int i4 = this.f25244h;
        a aVar = null;
        if (i4 != f25205a0) {
            this.f25231U.setSpan(new g(i4, this.f25245i, this.f25246j, aVar), length, length2, this.f25239c);
        }
        int i5 = this.f25249m;
        if (i5 != f25205a0) {
            this.f25231U.setSpan(new c(i5, this.f25250n, this.f25251o, aVar), length, length2, this.f25239c);
        }
        if (this.f25252p != -1) {
            this.f25231U.setSpan(new AbsoluteSizeSpan(this.f25252p, false), length, length2, this.f25239c);
        }
        if (this.f25253q != -1.0f) {
            this.f25231U.setSpan(new RelativeSizeSpan(this.f25253q), length, length2, this.f25239c);
        }
        if (this.f25254r != -1.0f) {
            this.f25231U.setSpan(new ScaleXSpan(this.f25254r), length, length2, this.f25239c);
        }
        int i6 = this.f25242f;
        if (i6 != -1) {
            this.f25231U.setSpan(new f(i6, this.f25243g), length, length2, this.f25239c);
        }
        if (this.f25255s) {
            this.f25231U.setSpan(new StrikethroughSpan(), length, length2, this.f25239c);
        }
        if (this.f25256t) {
            this.f25231U.setSpan(new UnderlineSpan(), length, length2, this.f25239c);
        }
        if (this.f25257u) {
            this.f25231U.setSpan(new SuperscriptSpan(), length, length2, this.f25239c);
        }
        if (this.f25258v) {
            this.f25231U.setSpan(new SubscriptSpan(), length, length2, this.f25239c);
        }
        if (this.f25259w) {
            this.f25231U.setSpan(new StyleSpan(1), length, length2, this.f25239c);
        }
        if (this.f25260x) {
            this.f25231U.setSpan(new StyleSpan(2), length, length2, this.f25239c);
        }
        if (this.f25261y) {
            this.f25231U.setSpan(new StyleSpan(3), length, length2, this.f25239c);
        }
        if (this.f25262z != null) {
            this.f25231U.setSpan(new TypefaceSpan(this.f25262z), length, length2, this.f25239c);
        }
        if (this.f25211A != null) {
            this.f25231U.setSpan(new h(this.f25211A, aVar), length, length2, this.f25239c);
        }
        if (this.f25212B != null) {
            this.f25231U.setSpan(new AlignmentSpan.Standard(this.f25212B), length, length2, this.f25239c);
        }
        ClickableSpan clickableSpan = this.f25214D;
        if (clickableSpan != null) {
            this.f25231U.setSpan(clickableSpan, length, length2, this.f25239c);
        }
        if (this.f25215E != null) {
            this.f25231U.setSpan(new URLSpan(this.f25215E), length, length2, this.f25239c);
        }
        if (this.f25216F != -1.0f) {
            this.f25231U.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.f25216F, this.f25217G)), length, length2, this.f25239c);
        }
        if (this.f25218H != null) {
            this.f25231U.setSpan(new j(this.f25218H, aVar), length, length2, this.f25239c);
        }
        if (this.f25219I != -1.0f) {
            this.f25231U.setSpan(new k(this.f25219I, this.f25220J, this.f25221K, this.f25222L, null), length, length2, this.f25239c);
        }
        Object[] objArr = this.f25223M;
        if (objArr != null) {
            for (Object obj : objArr) {
                this.f25231U.setSpan(obj, length, length2, this.f25239c);
            }
        }
    }

    private void a0() {
        int length = this.f25231U.length();
        this.f25238b = "<img>";
        Z();
        int length2 = this.f25231U.length();
        a aVar = null;
        if (this.f25224N != null) {
            this.f25231U.setSpan(new e(this.f25224N, this.f25228R, aVar), length, length2, this.f25239c);
            return;
        }
        if (this.f25225O != null) {
            this.f25231U.setSpan(new e(this.f25225O, this.f25228R, aVar), length, length2, this.f25239c);
        } else if (this.f25226P != null) {
            this.f25231U.setSpan(new e(this.f25226P, this.f25228R, aVar), length, length2, this.f25239c);
        } else if (this.f25227Q != -1) {
            this.f25231U.setSpan(new e(this.f25227Q, this.f25228R, aVar), length, length2, this.f25239c);
        }
    }

    private void b0() {
        int length = this.f25231U.length();
        this.f25238b = "< >";
        Z();
        this.f25231U.setSpan(new l(this.f25229S, this.f25230T, null), length, this.f25231U.length(), this.f25239c);
    }

    public static w0 c0(TextView textView) {
        return new w0(textView);
    }

    private void n(int i4) {
        o();
        this.f25233W = i4;
    }

    private void o() {
        if (this.f25232V) {
            return;
        }
        int i4 = this.f25233W;
        if (i4 == 0) {
            Z();
        } else if (i4 == 1) {
            a0();
        } else if (i4 == 2) {
            b0();
        }
        z();
    }

    private void z() {
        this.f25239c = 33;
        this.f25240d = f25205a0;
        this.f25241e = f25205a0;
        this.f25242f = -1;
        this.f25244h = f25205a0;
        this.f25247k = -1;
        this.f25249m = f25205a0;
        this.f25252p = -1;
        this.f25253q = -1.0f;
        this.f25254r = -1.0f;
        this.f25255s = false;
        this.f25256t = false;
        this.f25257u = false;
        this.f25258v = false;
        this.f25259w = false;
        this.f25260x = false;
        this.f25261y = false;
        this.f25262z = null;
        this.f25211A = null;
        this.f25212B = null;
        this.f25213C = -1;
        this.f25214D = null;
        this.f25215E = null;
        this.f25216F = -1.0f;
        this.f25218H = null;
        this.f25219I = -1.0f;
        this.f25223M = null;
        this.f25224N = null;
        this.f25225O = null;
        this.f25226P = null;
        this.f25227Q = -1;
        this.f25229S = -1;
    }

    public w0 A(int i4) {
        this.f25239c = i4;
        return this;
    }

    public w0 B(@androidx.annotation.N String str) {
        this.f25262z = str;
        return this;
    }

    public w0 C(float f4) {
        this.f25253q = f4;
        return this;
    }

    public w0 D(@androidx.annotation.F(from = 0) int i4) {
        return E(i4, false);
    }

    public w0 E(@androidx.annotation.F(from = 0) int i4, boolean z3) {
        if (z3) {
            this.f25252p = (int) ((i4 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
        } else {
            this.f25252p = i4;
        }
        return this;
    }

    public w0 F(float f4) {
        this.f25254r = f4;
        return this;
    }

    public w0 G(@InterfaceC0569l int i4) {
        this.f25240d = i4;
        return this;
    }

    public w0 H(@androidx.annotation.N Layout.Alignment alignment) {
        this.f25212B = alignment;
        return this;
    }

    public w0 I() {
        this.f25260x = true;
        return this;
    }

    public w0 J(@androidx.annotation.F(from = 0) int i4, @androidx.annotation.F(from = 0) int i5) {
        this.f25247k = i4;
        this.f25248l = i5;
        return this;
    }

    public w0 K(@androidx.annotation.F(from = 0) int i4) {
        return L(i4, 2);
    }

    public w0 L(@androidx.annotation.F(from = 0) int i4, int i5) {
        this.f25242f = i4;
        this.f25243g = i5;
        return this;
    }

    public w0 N(@InterfaceC0569l int i4) {
        return O(i4, 2, 2);
    }

    public w0 O(@InterfaceC0569l int i4, @androidx.annotation.F(from = 1) int i5, @androidx.annotation.F(from = 0) int i6) {
        this.f25244h = i4;
        this.f25245i = i5;
        this.f25246j = i6;
        return this;
    }

    public w0 P(@androidx.annotation.N Shader shader) {
        this.f25218H = shader;
        return this;
    }

    public w0 Q(@InterfaceC0580x(from = 0.0d, fromInclusive = false) float f4, float f5, float f6, int i4) {
        this.f25219I = f4;
        this.f25220J = f5;
        this.f25221K = f6;
        this.f25222L = i4;
        return this;
    }

    public w0 R(@androidx.annotation.N Object... objArr) {
        if (objArr.length > 0) {
            this.f25223M = objArr;
        }
        return this;
    }

    public w0 S() {
        this.f25255s = true;
        return this;
    }

    public w0 T() {
        this.f25258v = true;
        return this;
    }

    public w0 U() {
        this.f25257u = true;
        return this;
    }

    public w0 V(@androidx.annotation.N Typeface typeface) {
        this.f25211A = typeface;
        return this;
    }

    public w0 W() {
        this.f25256t = true;
        return this;
    }

    public w0 X(@androidx.annotation.N String str) {
        M();
        this.f25215E = str;
        return this;
    }

    public w0 Y(int i4) {
        this.f25213C = i4;
        return this;
    }

    public w0 a(@androidx.annotation.N CharSequence charSequence) {
        n(0);
        this.f25238b = charSequence;
        return this;
    }

    public w0 b(@InterfaceC0578v int i4) {
        return c(i4, 0);
    }

    public w0 c(@InterfaceC0578v int i4, int i5) {
        n(1);
        this.f25227Q = i4;
        this.f25228R = i5;
        return this;
    }

    public w0 d(@androidx.annotation.N Bitmap bitmap) {
        return e(bitmap, 0);
    }

    public w0 e(@androidx.annotation.N Bitmap bitmap, int i4) {
        n(1);
        this.f25224N = bitmap;
        this.f25228R = i4;
        return this;
    }

    public w0 f(@androidx.annotation.N Drawable drawable) {
        return g(drawable, 0);
    }

    public w0 g(@androidx.annotation.N Drawable drawable, int i4) {
        n(1);
        this.f25225O = drawable;
        this.f25228R = i4;
        return this;
    }

    public w0 h(@androidx.annotation.N Uri uri) {
        return i(uri, 0);
    }

    public w0 i(@androidx.annotation.N Uri uri, int i4) {
        n(1);
        this.f25226P = uri;
        this.f25228R = i4;
        return this;
    }

    public w0 j() {
        n(0);
        this.f25238b = f25210f0;
        return this;
    }

    public w0 k(@androidx.annotation.N CharSequence charSequence) {
        n(0);
        this.f25238b = ((Object) charSequence) + f25210f0;
        return this;
    }

    public w0 l(@androidx.annotation.F(from = 0) int i4) {
        return m(i4, 0);
    }

    public w0 m(@androidx.annotation.F(from = 0) int i4, @InterfaceC0569l int i5) {
        n(2);
        this.f25229S = i4;
        this.f25230T = i5;
        return this;
    }

    public SpannableStringBuilder p() {
        o();
        TextView textView = this.f25237a;
        if (textView != null) {
            textView.setText(this.f25231U);
        }
        this.f25232V = true;
        return this.f25231U;
    }

    public SpannableStringBuilder q() {
        return this.f25231U;
    }

    public w0 r(@InterfaceC0569l int i4) {
        this.f25241e = i4;
        return this;
    }

    public w0 s(@InterfaceC0580x(from = 0.0d, fromInclusive = false) float f4, BlurMaskFilter.Blur blur) {
        this.f25216F = f4;
        this.f25217G = blur;
        return this;
    }

    public w0 t() {
        this.f25259w = true;
        return this;
    }

    public w0 u() {
        this.f25261y = true;
        return this;
    }

    public w0 v(@androidx.annotation.F(from = 0) int i4) {
        return w(0, 3, i4);
    }

    public w0 w(@InterfaceC0569l int i4, @androidx.annotation.F(from = 0) int i5, @androidx.annotation.F(from = 0) int i6) {
        this.f25249m = i4;
        this.f25250n = i5;
        this.f25251o = i6;
        return this;
    }

    public w0 x(@InterfaceC0569l int i4, boolean z3, View.OnClickListener onClickListener) {
        M();
        this.f25214D = new a(i4, z3, onClickListener);
        return this;
    }

    public w0 y(@androidx.annotation.N ClickableSpan clickableSpan) {
        M();
        this.f25214D = clickableSpan;
        return this;
    }

    public w0() {
        this.f25234X = 0;
        this.f25235Y = 1;
        this.f25236Z = 2;
        this.f25231U = new i(null);
        this.f25238b = "";
        this.f25233W = -1;
        z();
    }
}
